/**
 * generated by Xtext 2.32.0
 */
package swa.dsl.courses.orga;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Course</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link swa.dsl.courses.orga.Course#getTitle <em>Title</em>}</li>
 *   <li>{@link swa.dsl.courses.orga.Course#getTeachers <em>Teachers</em>}</li>
 *   <li>{@link swa.dsl.courses.orga.Course#getStudents <em>Students</em>}</li>
 * </ul>
 *
 * @see swa.dsl.courses.orga.OrgaPackage#getCourse()
 * @model
 * @generated
 */
public interface Course extends Declaration
{
  /**
   * Returns the value of the '<em><b>Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Title</em>' attribute.
   * @see #setTitle(String)
   * @see swa.dsl.courses.orga.OrgaPackage#getCourse_Title()
   * @model
   * @generated
   */
  String getTitle();

  /**
   * Sets the value of the '{@link swa.dsl.courses.orga.Course#getTitle <em>Title</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Title</em>' attribute.
   * @see #getTitle()
   * @generated
   */
  void setTitle(String value);

  /**
   * Returns the value of the '<em><b>Teachers</b></em>' containment reference list.
   * The list contents are of type {@link swa.dsl.courses.orga.Teacher}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Teachers</em>' containment reference list.
   * @see swa.dsl.courses.orga.OrgaPackage#getCourse_Teachers()
   * @model containment="true"
   * @generated
   */
  EList<Teacher> getTeachers();

  /**
   * Returns the value of the '<em><b>Students</b></em>' containment reference list.
   * The list contents are of type {@link swa.dsl.courses.orga.Student}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Students</em>' containment reference list.
   * @see swa.dsl.courses.orga.OrgaPackage#getCourse_Students()
   * @model containment="true"
   * @generated
   */
  EList<Student> getStudents();

} // Course
