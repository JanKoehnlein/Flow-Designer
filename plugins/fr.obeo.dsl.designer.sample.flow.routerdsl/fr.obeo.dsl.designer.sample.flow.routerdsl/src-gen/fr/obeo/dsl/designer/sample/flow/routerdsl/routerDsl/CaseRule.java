/**
 * generated by Xtext 2.12.0
 */
package fr.obeo.dsl.designer.sample.flow.routerdsl.routerDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Case Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.obeo.dsl.designer.sample.flow.routerdsl.routerDsl.CaseRule#getCondition <em>Condition</em>}</li>
 *   <li>{@link fr.obeo.dsl.designer.sample.flow.routerdsl.routerDsl.CaseRule#getDecisions <em>Decisions</em>}</li>
 * </ul>
 *
 * @see fr.obeo.dsl.designer.sample.flow.routerdsl.routerDsl.RouterDslPackage#getCaseRule()
 * @model
 * @generated
 */
public interface CaseRule extends EObject
{
  /**
   * Returns the value of the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Condition</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Condition</em>' containment reference.
   * @see #setCondition(Conditional)
   * @see fr.obeo.dsl.designer.sample.flow.routerdsl.routerDsl.RouterDslPackage#getCaseRule_Condition()
   * @model containment="true"
   * @generated
   */
  Conditional getCondition();

  /**
   * Sets the value of the '{@link fr.obeo.dsl.designer.sample.flow.routerdsl.routerDsl.CaseRule#getCondition <em>Condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Condition</em>' containment reference.
   * @see #getCondition()
   * @generated
   */
  void setCondition(Conditional value);

  /**
   * Returns the value of the '<em><b>Decisions</b></em>' containment reference list.
   * The list contents are of type {@link fr.obeo.dsl.designer.sample.flow.routerdsl.routerDsl.Decision}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Decisions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Decisions</em>' containment reference list.
   * @see fr.obeo.dsl.designer.sample.flow.routerdsl.routerDsl.RouterDslPackage#getCaseRule_Decisions()
   * @model containment="true"
   * @generated
   */
  EList<Decision> getDecisions();

} // CaseRule
