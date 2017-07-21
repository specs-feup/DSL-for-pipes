/**
 * generated by Xtext 2.12.0
 */
package org.xtext.example.sorting.sorting;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Config</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.sorting.sorting.Config#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.sorting.sorting.Config#getComponents <em>Components</em>}</li>
 *   <li>{@link org.xtext.example.sorting.sorting.Config#getTransitions <em>Transitions</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.sorting.sorting.SortingPackage#getConfig()
 * @model
 * @generated
 */
public interface Config extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.example.sorting.sorting.SortingPackage#getConfig_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.sorting.sorting.Config#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Components</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.sorting.sorting.Component}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Components</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Components</em>' containment reference list.
   * @see org.xtext.example.sorting.sorting.SortingPackage#getConfig_Components()
   * @model containment="true"
   * @generated
   */
  EList<Component> getComponents();

  /**
   * Returns the value of the '<em><b>Transitions</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.sorting.sorting.Transition}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Transitions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Transitions</em>' containment reference list.
   * @see org.xtext.example.sorting.sorting.SortingPackage#getConfig_Transitions()
   * @model containment="true"
   * @generated
   */
  EList<Transition> getTransitions();

} // Config
