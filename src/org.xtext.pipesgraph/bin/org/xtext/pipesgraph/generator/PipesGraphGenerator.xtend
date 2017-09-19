/*
 * generated by Xtext 2.12.0
 */
package org.xtext.pipesgraph.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.xtext.pipesgraph.pipesGraph.Config
import org.eclipse.xtext.generator.OutputConfigurationProvider
import org.xtext.pipesgraph.pipesGraph.Source
import org.xtext.pipesgraph.pipesGraph.Instance
import org.xtext.pipesgraph.pipesGraph.Transition
import org.xtext.pipesgraph.pipesGraph.Filter
import org.xtext.pipesgraph.pipesGraph.Sink
import org.xtext.pipesgraph.pipesGraph.Import
import org.xtext.pipesgraph.pipesGraph.Param

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class PipesGraphGenerator extends AbstractGenerator {

	String packname = "pipesgraph";



	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		if(resource.allContents.filter(Config).map[name].head !== null){
			packname = resource.allContents.filter(Config).head.name;
		}
		/*for(conf : new OutputConfigurationProvider().getOutputConfigurations(resource)){
			println("Output configuration:");
			println("Output folder:" + conf.outputDirectory);
			println("Setting Output folder");
			println(conf.sourceFolders);
			conf.sourceFolders.add(conf.outputDirectory);
			println("SRC After:" + conf.sourceFolders);
			println("Derived: " + conf.setDerivedProperty);
			conf.setDerivedProperty = true;
		}
*/
//			resource.allContents
//				.filter(Greeting)
//				.map[name]
//				.join(', '))

		fsa.generateFile(buildFileName("PipeStages"), generatePipeStages(resource));
		fsa.generateFile("dotfile.dot", generateDotFile(resource)); 
		
		fsa.generateFile("main/Main.java", 
		'''
		package main;
		
		import pipesgraph.PipesGraph;
		
		public class Main {
			public static void main(String[] args) {
				PipesGraph g = new PipesGraph();
				g.invoke();
			}
		}
		'''	);
		fsa.generateFile(buildFileName("Component"), 
			'''
			package �packname�;
			import java.util.HashMap;
			
			public abstract class Component extends PipeStages implements Comparable<Component>{
				protected int level = 0;
				protected String name;
				Runnable call;
				Runnable assign;
				protected PipesGraph graph;
				public PipesGraph getPipesGraph(){return graph;};
				public void setPipesGraph(PipesGraph g){graph=g;};

				public int getLevel() {
					return level;
				}
				public void checkLevel(Component c){
					if(level<c.getLevel())
						level = c.getLevel()+1;
				}
				public int compareTo(Component c) {
					return Integer.compare(this.level, c.getLevel());
				}
				public void invoke(){
					assign.run();
					call.run();
				}
				public void setCall(Runnable r) {
					call=r;
				}
				public String getName(){return name;};
			}''');
		 fsa.generateFile(buildFileName("Source"), 
		 	'''
		 	package �packname�;
		 			 	
		 	public abstract class Source extends Component{

		 	}
		 	'''
		 );
		 
		 fsa.generateFile(buildFileName("Filter"), 
		 	'''
		 	package �packname�;
		 	
		 	
		 	import java.util.HashMap;
		 	
		 	public abstract class Filter extends Component{

		 	}
		 	'''
		 );
		 fsa.generateFile(buildFileName("Sink"), 
		 	'''
		 	package �packname�;
		 			 	
		 	public abstract class Sink extends Component{

		 	}'''
		 );
		 	
		 	for(source: resource.allContents.toIterable.filter(Source)){
		 		fsa.generateFile(buildFileName(source.name),
		 			'''
			package �packname�;
			�FOR imp : resource.allContents.toIterable.filter(Import)�
				import �imp.name�;
			�ENDFOR�

			public class �source.name� extends Source{
			�FOR port : source.inPorts�
				private �port.type� �port.name�;
				public �port.type� get�port.name�() {return �port.name�;};
				public void set�port.name�(�port.type� val) {�port.name� = val;};
			�ENDFOR�
			�FOR port : source.outPorts�
				private �port.type� �port.name�;
				public �port.type� get�port.name�() {return �port.name�;};
				public void set�port.name�(�port.type� val) {�port.name� = val;};
			�ENDFOR�
				public �source.name�(String name){
					this.name=name;
					switch (name) {
					�FOR instance : resource.allContents.toIterable.filter(Instance)�
					�IF instance.component.name==source.name�
					�IF instance.code!==null�
						case "�instance.name�":
						call = () -> {�instance.code.substring(2, instance.code.length - 2)� };
						break;
						�ENDIF�
					�ENDIF�
					�ENDFOR�
					default:
					call = () -> {�source.code.substring(2, source.code.length - 2)�};
					break;					
					}
					switch (name) {
					�FOR instance : resource.allContents.toIterable.filter(Instance)�
					�IF instance.component.name==source.name�
						case "�instance.name�":
						assign = () -> {
							�FOR transition : resource.allContents.toIterable.filter(Transition)�
							�IF transition.target.name == instance.name�
								�transition.targetPort.name� = ((�transition.source.component.name�)graph.getComponent("�transition.source.name�")).get�transition.sourcePort.name�();
							�ENDIF�
							�ENDFOR�
						};
						break;
						�ENDIF�
					�ENDFOR�
					default:
					assign = () -> {};
					break;					
					}					

				}

			} ''')}
		 	for(filter: resource.allContents.toIterable.filter(Filter)){
		 		fsa.generateFile(buildFileName(filter.name),
		 			'''
				package �packname�;
				�FOR imp : resource.allContents.toIterable.filter(Import)�
					import �imp.name�;
				�ENDFOR�
				public class �filter.name� extends Filter{
				�FOR port : filter.inPorts�
					private �port.type� �port.name�;
					public �port.type� get�port.name�() {return �port.name�;};
					public void set�port.name�(�port.type� val) {�port.name� = val;};
				�ENDFOR�
				�FOR port : filter.outPorts�
					private �port.type� �port.name�;
					public �port.type� get�port.name�() {return �port.name�;};
					public void set�port.name�(�port.type� val) {�port.name� = val;};
				�ENDFOR�
				public �filter.name�(String name){
					this.name=name;
					switch (name) {
					�FOR instance : resource.allContents.toIterable.filter(Instance)�
					�IF instance.component.name==filter.name�
					�IF instance.code!==null�
						case "�instance.name�":
						call = () -> {�instance.code.substring(2, instance.code.length - 2)�};
						break;
					�ENDIF�
					�ENDIF�
					�ENDFOR�
					default:
					call = () -> {�filter.code.substring(2, filter.code.length - 2)�};
					break;}
					switch (name) {
					�FOR instance : resource.allContents.toIterable.filter(Instance)�
					�IF instance.component.name==filter.name�
						case "�instance.name�":
						assign = () -> {
							�FOR transition : resource.allContents.toIterable.filter(Transition)�
							�IF transition.target.name == instance.name�
								�transition.targetPort.name� = ((�transition.source.component.name�)graph.getComponent("�transition.source.name�")).get�transition.sourcePort.name�();
							�ENDIF�
							�ENDFOR�
						};
						break;
						�ENDIF�
					�ENDFOR�
					default:
					assign = () -> {};
					break;					
					}
				
					}

				}''')}
				
		 	for(sink: resource.allContents.toIterable.filter(Sink)){
		 		fsa.generateFile(buildFileName(sink.name),
		 			'''
				package �packname�;
				�FOR imp : resource.allContents.toIterable.filter(Import)�
					import �imp.name�;
				�ENDFOR�
				
				public class �sink.name� extends Sink{

				�FOR port : sink.inPorts�
					private �port.type� �port.name�;
					public �port.type� get�port.name�() {return �port.name�;};
					public void set�port.name�(�port.type� val) {�port.name� = val;};
				�ENDFOR�
				�FOR port : sink.outPorts�
					private �port.type� �port.name�;
					public �port.type� get�port.name�() {return �port.name�;};
					public void set�port.name�(�port.type� val) {�port.name� = val;};
				�ENDFOR�
					public �sink.name�(String name){
					this.name=name;
					switch (name) {
					�FOR instance : resource.allContents.toIterable.filter(Instance)�
					�IF instance.component.name==sink.name�
					�IF instance.code!==null�
						case "�instance.name�":
						call = () -> {�instance.code.substring(2, instance.code.length - 2)�};
						break;
					�ENDIF�
					�ENDIF�				
					�ENDFOR�
					default:
					call = () -> {�sink.code.substring(2, sink.code.length - 2)�};
					break;	
					}
					switch (name) {
					�FOR instance : resource.allContents.toIterable.filter(Instance)�
					�IF instance.component.name==sink.name�
						case "�instance.name�":
						assign = () -> {
							�FOR transition : resource.allContents.toIterable.filter(Transition)�
							�IF transition.target.name == instance.name�
								�transition.targetPort.name� = ((�transition.source.component.name�)graph.getComponent("�transition.source.name�")).get�transition.sourcePort.name�();
							�ENDIF�
							�ENDFOR�
						};
						break;
						�ENDIF�
					�ENDFOR�
					default:
					assign = () -> {};
					break;					
					}

				}

				}
		 	'''
		 	);
			fsa.generateFile(buildFileName("PipesGraph"), generate(resource.contents.head as Config)); 
		 	
		 	}
		 	
		 
		
	}
	
	def buildFileName(String filename) {
	return packname + "/" + filename + ".java";

	}
	
	def generateDotFile(Resource resource) '''
	digraph G {	
	�FOR instance : resource.allContents.toIterable.filter(Instance)�
	rankdir=TB
	�instance.name� [shape=plaintext 
	label=
	<<TABLE BORDER="0" CELLBORDER="0" CELLSPACING="0" CELLPADDING="0">
		�IF instance.component.inPorts.length != 0�
		<TR>
			<TD BORDER="0">
				<TABLE BORDER="0" CELLBORDER="0" CELLSPACING="0" CELLPADDING="0">
					<TR>
					�FOR port: instance.component.inPorts�
						<TD PORT="�port.name�" BORDER="1" CELLPADDING="1">�port.name�</TD>
					�ENDFOR�
					</TR>
				</TABLE>
			</TD>
		</TR>
		�ENDIF�
		<TR>
			<TD BORDER="1" CELLPADDING="4" COLOR="black">�instance.name�</TD>
		</TR>
		�IF instance.component.outPorts.length != 0�
		<TR>
			<TD BORDER="0">
				<TABLE BORDER="0" CELLBORDER="0" CELLSPACING="0" CELLPADDING="0">
					<TR>
					�FOR port: instance.component.outPorts�
						<TD PORT="�port.name�" BORDER="1" CELLPADDING="1">�port.name�</TD>
					�ENDFOR�
					</TR>
				</TABLE>
			</TD>
		</TR>
		�ENDIF�
	</TABLE>>];
	�ENDFOR�
	�FOR transition : resource.allContents.toIterable.filter(Transition)�
	    �transition.source.name�:�transition.sourcePort.name� -> �transition.target.name�:�transition.targetPort.name� [style="", arrowhead="normal", color=black, headlabel=<>, fontsize=10, labelangle=45, labeldistance=2.0, labelfontcolor=black];
	�ENDFOR�
	}
	'''
	
	
	def CharSequence generatePipeStages(Resource resource)'''
	package �packname�;
		�FOR imp : resource.allContents.toIterable.filter(Import)�
		import �imp.name�;
		�ENDFOR�
		public abstract class PipeStages{
		/*Vars*/
		�FOR par : resource.allContents.toIterable.filter(Param)�
			�par.value�;
		�ENDFOR�

		}

	'''
	
	def className(Resource res) {
		var name = res.URI.lastSegment
		return name.substring(0, name.indexOf('.'))
	}
	
	def CharSequence generate(Config config)'''
	package �packname�;

	import java.util.ArrayList;
	import java.util.HashMap;
	import java.util.PriorityQueue;
	
	
	public class PipesGraph extends PipeStages{
		private HashMap<String,Component> nodes = new HashMap<String,Component>();
		private PriorityQueue<Component> components = new PriorityQueue<Component>();		
		public Component getComponent(String comp) {return nodes.get(comp);};
		
		public void addEdge(String from, String pfrom, String to, String pto){
			Component csource = nodes.get(from);
			Component ctarget = nodes.get(to);

			ctarget.checkLevel(csource);
		}
		
		public PipesGraph() {
			�FOR instance : config.instances�
				nodes.put("�instance.name�", new �instance.component.name�("�instance.name�"));
				nodes.get("�instance.name�").setPipesGraph(this);			
				components.add(nodes.get("�instance.name�"));
			�ENDFOR�
			�FOR t : config.transitions�
				addEdge("�t.source.name�","�t.targetPort.name�","�t.target.name�","�t.sourcePort.name�");
			�ENDFOR�
			
		}
		public void invoke(){
			 for(Component c: components) {
				 c.invoke();
			 }
		}
	}

		
	'''
}
