/**
 * generated by Xtext 2.32.0
 */
package swa.dsl.courses.orga;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Room</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link swa.dsl.courses.orga.Room#getLocation <em>Location</em>}</li>
 * </ul>
 *
 * @see swa.dsl.courses.orga.OrgaPackage#getRoom()
 * @model
 * @generated
 */
public interface Room extends Declaration
{
  /**
   * Returns the value of the '<em><b>Location</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Location</em>' attribute.
   * @see #setLocation(String)
   * @see swa.dsl.courses.orga.OrgaPackage#getRoom_Location()
   * @model
   * @generated
   */
  String getLocation();

  /**
   * Sets the value of the '{@link swa.dsl.courses.orga.Room#getLocation <em>Location</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Location</em>' attribute.
   * @see #getLocation()
   * @generated
   */
  void setLocation(String value);

} // Room