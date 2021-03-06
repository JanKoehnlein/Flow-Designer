/**
 * generated by Xtext 2.12.0
 */
package fr.obeo.dsl.designer.sample.flow.routerdsl.routerDsl.impl;

import fr.obeo.dsl.designer.sample.flow.DataSource;

import fr.obeo.dsl.designer.sample.flow.routerdsl.routerDsl.RouterDslPackage;
import fr.obeo.dsl.designer.sample.flow.routerdsl.routerDsl.SensorAccess;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sensor Access</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.obeo.dsl.designer.sample.flow.routerdsl.routerDsl.impl.SensorAccessImpl#getSensor <em>Sensor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SensorAccessImpl extends ObjectAccessImpl implements SensorAccess
{
  /**
   * The cached value of the '{@link #getSensor() <em>Sensor</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSensor()
   * @generated
   * @ordered
   */
  protected DataSource sensor;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SensorAccessImpl()
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
    return RouterDslPackage.Literals.SENSOR_ACCESS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataSource getSensor()
  {
    if (sensor != null && sensor.eIsProxy())
    {
      InternalEObject oldSensor = (InternalEObject)sensor;
      sensor = (DataSource)eResolveProxy(oldSensor);
      if (sensor != oldSensor)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RouterDslPackage.SENSOR_ACCESS__SENSOR, oldSensor, sensor));
      }
    }
    return sensor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataSource basicGetSensor()
  {
    return sensor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSensor(DataSource newSensor)
  {
    DataSource oldSensor = sensor;
    sensor = newSensor;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RouterDslPackage.SENSOR_ACCESS__SENSOR, oldSensor, sensor));
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
      case RouterDslPackage.SENSOR_ACCESS__SENSOR:
        if (resolve) return getSensor();
        return basicGetSensor();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case RouterDslPackage.SENSOR_ACCESS__SENSOR:
        setSensor((DataSource)newValue);
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
      case RouterDslPackage.SENSOR_ACCESS__SENSOR:
        setSensor((DataSource)null);
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
      case RouterDslPackage.SENSOR_ACCESS__SENSOR:
        return sensor != null;
    }
    return super.eIsSet(featureID);
  }

} //SensorAccessImpl
