import CatiaV5TypeLibs.InfTypeLib.*;
import com4j.*;

@IID("{97D3E643-DE62-0000-0280-020C4E000000}")
public interface HybridShapeWrapCurve extends HybridShape {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Surface"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(25)
  Reference surface();


  /**
   * <p>
   * Setter method for the COM property "Surface"
   * </p>
   * @param oSurface Mandatory Reference parameter.
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(26)
  void surface(
    Reference oSurface);


  /**
   * @param iPosition Mandatory int parameter.
   * @param iReferenceCurve Mandatory Reference parameter.
   * @param iTargetCurve Mandatory Reference parameter.
   */

  @DISPID(1611005954) //= 0x60060002. The runtime will prefer the VTID if present
  @VTID(27)
  void insertCurves(
    int iPosition,
    Reference iReferenceCurve,
    Reference iTargetCurve);


  /**
   * @param iPosition Mandatory int parameter.
   * @param iReferenceCurve Mandatory Reference parameter.
   */

  @DISPID(1611005955) //= 0x60060003. The runtime will prefer the VTID if present
  @VTID(28)
  void insertReferenceCurve(
    int iPosition,
    Reference iReferenceCurve);


  /**
   * @return  Returns a value of type int
   */

  @DISPID(1611005956) //= 0x60060004. The runtime will prefer the VTID if present
  @VTID(29)
  int getNumberOfCurves();


  /**
   * @param iPosition Mandatory int parameter.
   */

  @DISPID(1611005957) //= 0x60060005. The runtime will prefer the VTID if present
  @VTID(30)
  void removeCurves(
    int iPosition);


  /**
   * @param iPosition Mandatory int parameter.
   * @param oReferenceCurve Mandatory Holder<Reference> parameter.
   * @param oTargetCurve Mandatory Holder<Reference> parameter.
   */

  @DISPID(1611005958) //= 0x60060006. The runtime will prefer the VTID if present
  @VTID(31)
  void getCurves(
    int iPosition,
    Holder<Reference> oReferenceCurve,
    Holder<Reference> oTargetCurve);


  /**
   * <p>
   * Getter method for the COM property "FirstCurvesConstraint"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611005959) //= 0x60060007. The runtime will prefer the VTID if present
  @VTID(32)
  int firstCurvesConstraint();


  /**
   * <p>
   * Setter method for the COM property "FirstCurvesConstraint"
   * </p>
   * @param oConstraint Mandatory int parameter.
   */

  @DISPID(1611005959) //= 0x60060007. The runtime will prefer the VTID if present
  @VTID(33)
  void firstCurvesConstraint(
    int oConstraint);


  /**
   * <p>
   * Getter method for the COM property "LastCurvesConstraint"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611005961) //= 0x60060009. The runtime will prefer the VTID if present
  @VTID(34)
  int lastCurvesConstraint();


  /**
   * <p>
   * Setter method for the COM property "LastCurvesConstraint"
   * </p>
   * @param oConstraint Mandatory int parameter.
   */

  @DISPID(1611005961) //= 0x60060009. The runtime will prefer the VTID if present
  @VTID(35)
  void lastCurvesConstraint(
    int oConstraint);


  /**
   * @param iSpine Mandatory Reference parameter.
   */

  @DISPID(1611005963) //= 0x6006000b. The runtime will prefer the VTID if present
  @VTID(36)
  void setReferenceSpine(
    Reference iSpine);


  /**
   * @param oSpineType Mandatory Holder<Integer> parameter.
   * @param oSpine Mandatory Holder<Reference> parameter.
   */

  @DISPID(1611005964) //= 0x6006000c. The runtime will prefer the VTID if present
  @VTID(37)
  void getReferenceSpine(
    Holder<Integer> oSpineType,
    Holder<Reference> oSpine);


  /**
   * @param iDirection Mandatory HybridShapeDirection parameter.
   */

  @DISPID(1611005965) //= 0x6006000d. The runtime will prefer the VTID if present
  @VTID(38)
  void setReferenceDirection(
    HybridShapeDirection iDirection);


  /**
   * @param oDirectionType Mandatory Holder<Integer> parameter.
   * @param oDirection Mandatory Holder<HybridShapeDirection> parameter.
   */

  @DISPID(1611005966) //= 0x6006000e. The runtime will prefer the VTID if present
  @VTID(39)
  void getReferenceDirection(
    Holder<Integer> oDirectionType,
    Holder<HybridShapeDirection> oDirection);


  // Properties:
}
