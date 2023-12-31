/**
 * generated by Xtext 2.32.0
 */
package swa.dsl.courses.orga;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Audience Size</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see swa.dsl.courses.orga.OrgaPackage#getAudienceSize()
 * @model
 * @generated
 */
public enum AudienceSize implements Enumerator
{
  /**
   * The '<em><b>SMALL</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SMALL_VALUE
   * @generated
   * @ordered
   */
  SMALL(0, "SMALL", "small"),

  /**
   * The '<em><b>MEDIUM</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #MEDIUM_VALUE
   * @generated
   * @ordered
   */
  MEDIUM(1, "MEDIUM", "medium"),

  /**
   * The '<em><b>BIG</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #BIG_VALUE
   * @generated
   * @ordered
   */
  BIG(2, "BIG", "big");

  /**
   * The '<em><b>SMALL</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SMALL
   * @model literal="small"
   * @generated
   * @ordered
   */
  public static final int SMALL_VALUE = 0;

  /**
   * The '<em><b>MEDIUM</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #MEDIUM
   * @model literal="medium"
   * @generated
   * @ordered
   */
  public static final int MEDIUM_VALUE = 1;

  /**
   * The '<em><b>BIG</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #BIG
   * @model literal="big"
   * @generated
   * @ordered
   */
  public static final int BIG_VALUE = 2;

  /**
   * An array of all the '<em><b>Audience Size</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final AudienceSize[] VALUES_ARRAY =
    new AudienceSize[]
    {
      SMALL,
      MEDIUM,
      BIG,
    };

  /**
   * A public read-only list of all the '<em><b>Audience Size</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<AudienceSize> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Audience Size</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static AudienceSize get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      AudienceSize result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Audience Size</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static AudienceSize getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      AudienceSize result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Audience Size</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static AudienceSize get(int value)
  {
    switch (value)
    {
      case SMALL_VALUE: return SMALL;
      case MEDIUM_VALUE: return MEDIUM;
      case BIG_VALUE: return BIG;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private AudienceSize(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //AudienceSize
