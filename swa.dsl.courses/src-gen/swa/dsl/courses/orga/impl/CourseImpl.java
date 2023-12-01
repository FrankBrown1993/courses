/**
 * generated by Xtext 2.32.0
 */
package swa.dsl.courses.orga.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import swa.dsl.courses.orga.Course;
import swa.dsl.courses.orga.OrgaPackage;
import swa.dsl.courses.orga.Student;
import swa.dsl.courses.orga.Teacher;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Course</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link swa.dsl.courses.orga.impl.CourseImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link swa.dsl.courses.orga.impl.CourseImpl#getDepartment <em>Department</em>}</li>
 *   <li>{@link swa.dsl.courses.orga.impl.CourseImpl#getType <em>Type</em>}</li>
 *   <li>{@link swa.dsl.courses.orga.impl.CourseImpl#getCourse_cat <em>Course cat</em>}</li>
 *   <li>{@link swa.dsl.courses.orga.impl.CourseImpl#getTeachers <em>Teachers</em>}</li>
 *   <li>{@link swa.dsl.courses.orga.impl.CourseImpl#getStudents <em>Students</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CourseImpl extends DeclarationImpl implements Course
{
  /**
   * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTitle()
   * @generated
   * @ordered
   */
  protected static final String TITLE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTitle()
   * @generated
   * @ordered
   */
  protected String title = TITLE_EDEFAULT;

  /**
   * The default value of the '{@link #getDepartment() <em>Department</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDepartment()
   * @generated
   * @ordered
   */
  protected static final String DEPARTMENT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDepartment() <em>Department</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDepartment()
   * @generated
   * @ordered
   */
  protected String department = DEPARTMENT_EDEFAULT;

  /**
   * The default value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected static final String TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected String type = TYPE_EDEFAULT;

  /**
   * The default value of the '{@link #getCourse_cat() <em>Course cat</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCourse_cat()
   * @generated
   * @ordered
   */
  protected static final String COURSE_CAT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCourse_cat() <em>Course cat</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCourse_cat()
   * @generated
   * @ordered
   */
  protected String course_cat = COURSE_CAT_EDEFAULT;

  /**
   * The cached value of the '{@link #getTeachers() <em>Teachers</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTeachers()
   * @generated
   * @ordered
   */
  protected EList<Teacher> teachers;

  /**
   * The cached value of the '{@link #getStudents() <em>Students</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStudents()
   * @generated
   * @ordered
   */
  protected EList<Student> students;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CourseImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return OrgaPackage.Literals.COURSE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getTitle()
  {
    return title;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setTitle(String newTitle)
  {
    String oldTitle = title;
    title = newTitle;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrgaPackage.COURSE__TITLE, oldTitle, title));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getDepartment()
  {
    return department;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setDepartment(String newDepartment)
  {
    String oldDepartment = department;
    department = newDepartment;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrgaPackage.COURSE__DEPARTMENT, oldDepartment, department));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setType(String newType)
  {
    String oldType = type;
    type = newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrgaPackage.COURSE__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getCourse_cat()
  {
    return course_cat;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setCourse_cat(String newCourse_cat)
  {
    String oldCourse_cat = course_cat;
    course_cat = newCourse_cat;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrgaPackage.COURSE__COURSE_CAT, oldCourse_cat, course_cat));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Teacher> getTeachers()
  {
    if (teachers == null)
    {
      teachers = new EObjectContainmentEList<Teacher>(Teacher.class, this, OrgaPackage.COURSE__TEACHERS);
    }
    return teachers;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Student> getStudents()
  {
    if (students == null)
    {
      students = new EObjectContainmentEList<Student>(Student.class, this, OrgaPackage.COURSE__STUDENTS);
    }
    return students;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case OrgaPackage.COURSE__TEACHERS:
        return ((InternalEList<?>)getTeachers()).basicRemove(otherEnd, msgs);
      case OrgaPackage.COURSE__STUDENTS:
        return ((InternalEList<?>)getStudents()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case OrgaPackage.COURSE__TITLE:
        return getTitle();
      case OrgaPackage.COURSE__DEPARTMENT:
        return getDepartment();
      case OrgaPackage.COURSE__TYPE:
        return getType();
      case OrgaPackage.COURSE__COURSE_CAT:
        return getCourse_cat();
      case OrgaPackage.COURSE__TEACHERS:
        return getTeachers();
      case OrgaPackage.COURSE__STUDENTS:
        return getStudents();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case OrgaPackage.COURSE__TITLE:
        setTitle((String)newValue);
        return;
      case OrgaPackage.COURSE__DEPARTMENT:
        setDepartment((String)newValue);
        return;
      case OrgaPackage.COURSE__TYPE:
        setType((String)newValue);
        return;
      case OrgaPackage.COURSE__COURSE_CAT:
        setCourse_cat((String)newValue);
        return;
      case OrgaPackage.COURSE__TEACHERS:
        getTeachers().clear();
        getTeachers().addAll((Collection<? extends Teacher>)newValue);
        return;
      case OrgaPackage.COURSE__STUDENTS:
        getStudents().clear();
        getStudents().addAll((Collection<? extends Student>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case OrgaPackage.COURSE__TITLE:
        setTitle(TITLE_EDEFAULT);
        return;
      case OrgaPackage.COURSE__DEPARTMENT:
        setDepartment(DEPARTMENT_EDEFAULT);
        return;
      case OrgaPackage.COURSE__TYPE:
        setType(TYPE_EDEFAULT);
        return;
      case OrgaPackage.COURSE__COURSE_CAT:
        setCourse_cat(COURSE_CAT_EDEFAULT);
        return;
      case OrgaPackage.COURSE__TEACHERS:
        getTeachers().clear();
        return;
      case OrgaPackage.COURSE__STUDENTS:
        getStudents().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case OrgaPackage.COURSE__TITLE:
        return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
      case OrgaPackage.COURSE__DEPARTMENT:
        return DEPARTMENT_EDEFAULT == null ? department != null : !DEPARTMENT_EDEFAULT.equals(department);
      case OrgaPackage.COURSE__TYPE:
        return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
      case OrgaPackage.COURSE__COURSE_CAT:
        return COURSE_CAT_EDEFAULT == null ? course_cat != null : !COURSE_CAT_EDEFAULT.equals(course_cat);
      case OrgaPackage.COURSE__TEACHERS:
        return teachers != null && !teachers.isEmpty();
      case OrgaPackage.COURSE__STUDENTS:
        return students != null && !students.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (title: ");
    result.append(title);
    result.append(", department: ");
    result.append(department);
    result.append(", type: ");
    result.append(type);
    result.append(", course_cat: ");
    result.append(course_cat);
    result.append(')');
    return result.toString();
  }

} //CourseImpl
