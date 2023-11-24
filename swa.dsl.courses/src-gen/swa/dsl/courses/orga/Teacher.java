/**
 * generated by Xtext 2.32.0
 */
package swa.dsl.courses.orga;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Teacher</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link swa.dsl.courses.orga.Teacher#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see swa.dsl.courses.orga.OrgaPackage#getTeacher()
 * @model
 * @generated
 */
public interface Teacher extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see swa.dsl.courses.orga.OrgaPackage#getTeacher_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link swa.dsl.courses.orga.Teacher#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // Teacher