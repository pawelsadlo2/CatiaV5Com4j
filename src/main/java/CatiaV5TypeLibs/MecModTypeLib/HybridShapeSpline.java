package CatiaV5TypeLibs.MecModTypeLib;
import CatiaV5TypeLibs.InfTypeLib.*;

import com4j.*;

@IID("{8AB043B9-60EE-0000-0280-020E60000000}")
public interface HybridShapeSpline extends HybridShape {
  // Methods:
  /**
   * @param iPos Mandatory int parameter.
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(25)
  void removeControlPoint(
    int iPos);


  /**
   * @return  Returns a value of type int
   */

  @DISPID(1611005953) //= 0x60060001. The runtime will prefer the VTID if present
  @VTID(26)
  int getNbControlPoint();


  /**
   * @param ipIAPoint Mandatory Reference parameter.
   */

  @DISPID(1611005954) //= 0x60060002. The runtime will prefer the VTID if present
  @VTID(27)
  void addPoint(
    Reference ipIAPoint);


  /**
   * @param ipIAPoint Mandatory Reference parameter.
   * @param ipIADirTangency Mandatory HybridShapeDirection parameter.
   * @param iTangencyNorm Mandatory double parameter.
   * @param iInverseTangency Mandatory int parameter.
   * @param ipIADirCurvature Mandatory HybridShapeDirection parameter.
   * @param iCurvatureRadius Mandatory double parameter.
   */

  @DISPID(1611005955) //= 0x60060003. The runtime will prefer the VTID if present
  @VTID(28)
  void addPointWithConstraintExplicit(
    Reference ipIAPoint,
    HybridShapeDirection ipIADirTangency,
    double iTangencyNorm,
    int iInverseTangency,
    HybridShapeDirection ipIADirCurvature,
    double iCurvatureRadius);


  /**
   * @param ipIAPoint Mandatory Reference parameter.
   * @param ipIACurveCst Mandatory Reference parameter.
   * @param iTangencyNorm Mandatory double parameter.
   * @param iInvertValue Mandatory int parameter.
   * @param iCrvCstType Mandatory int parameter.
   */

  @DISPID(1611005956) //= 0x60060004. The runtime will prefer the VTID if present
  @VTID(29)
  void addPointWithConstraintFromCurve(
    Reference ipIAPoint,
    Reference ipIACurveCst,
    double iTangencyNorm,
    int iInvertValue,
    int iCrvCstType);


  /**
   * @param iPos Mandatory int parameter.
   * @return  Returns a value of type int
   */

  @DISPID(1611005957) //= 0x60060005. The runtime will prefer the VTID if present
  @VTID(30)
  int getConstraintType(
    int iPos);


  /**
   * @param ipIAPoint Mandatory Reference parameter.
   * @return  Returns a value of type int
   */

  @DISPID(1611005958) //= 0x60060006. The runtime will prefer the VTID if present
  @VTID(31)
  int getPointPosition(
    Reference ipIAPoint);


  /**
   * @param iPos Mandatory int parameter.
   * @return  Returns a value of type Reference
   */

  @DISPID(1611005959) //= 0x60060007. The runtime will prefer the VTID if present
  @VTID(32)
  Reference getPoint(
    int iPos);


  /**
   * @param iPos Mandatory int parameter.
   * @param ipIAPoint Mandatory Reference parameter.
   */

  @DISPID(1611005960) //= 0x60060008. The runtime will prefer the VTID if present
  @VTID(33)
  void setPointAfter(
    int iPos,
    Reference ipIAPoint);


  /**
   * @param iPos Mandatory int parameter.
   * @param ipIAPoint Mandatory Reference parameter.
   */

  @DISPID(1611005961) //= 0x60060009. The runtime will prefer the VTID if present
  @VTID(34)
  void setPointBefore(
    int iPos,
    Reference ipIAPoint);


  /**
   * @param iPos Mandatory int parameter.
   * @param opIADirTangency Mandatory Holder<HybridShapeDirection> parameter.
   * @param oTangencyNorm Mandatory Holder<Double> parameter.
   * @param oInverseTangency Mandatory Holder<Integer> parameter.
   * @param opIADirCurvature Mandatory Holder<HybridShapeDirection> parameter.
   * @param oCurvatureRadius Mandatory Holder<Double> parameter.
   */

  @DISPID(1611005962) //= 0x6006000a. The runtime will prefer the VTID if present
  @VTID(35)
  void getPointConstraintExplicit(
    int iPos,
    Holder<HybridShapeDirection> opIADirTangency,
    Holder<Double> oTangencyNorm,
    Holder<Integer> oInverseTangency,
    Holder<HybridShapeDirection> opIADirCurvature,
    Holder<Double> oCurvatureRadius);


  /**
   * @param iPos Mandatory int parameter.
   * @param ipIADirTangency Mandatory HybridShapeDirection parameter.
   * @param iTangencyNorm Mandatory double parameter.
   * @param iInverseTangency Mandatory int parameter.
   * @param ipIADirCurvature Mandatory HybridShapeDirection parameter.
   * @param iCurvatureRadius Mandatory double parameter.
   */

  @DISPID(1611005963) //= 0x6006000b. The runtime will prefer the VTID if present
  @VTID(36)
  void setPointConstraintExplicit(
    int iPos,
    HybridShapeDirection ipIADirTangency,
    double iTangencyNorm,
    int iInverseTangency,
    HybridShapeDirection ipIADirCurvature,
    double iCurvatureRadius);


  /**
   * @param iPos Mandatory int parameter.
   * @param opIACurveCst Mandatory Holder<Reference> parameter.
   * @param oTangencyNorm Mandatory Holder<Double> parameter.
   * @param oInvertValue Mandatory Holder<Integer> parameter.
   * @param oCrvCstType Mandatory Holder<Integer> parameter.
   */

  @DISPID(1611005964) //= 0x6006000c. The runtime will prefer the VTID if present
  @VTID(37)
  void getPointConstraintFromCurve(
    int iPos,
    Holder<Reference> opIACurveCst,
    Holder<Double> oTangencyNorm,
    Holder<Integer> oInvertValue,
    Holder<Integer> oCrvCstType);


  /**
   * @param iPos Mandatory int parameter.
   * @param ipIACurveCst Mandatory Reference parameter.
   * @param iTangencyNorm Mandatory double parameter.
   * @param iInvertValue Mandatory int parameter.
   * @param iCrvCstType Mandatory int parameter.
   */

  @DISPID(1611005965) //= 0x6006000d. The runtime will prefer the VTID if present
  @VTID(38)
  void setPointConstraintFromCurve(
    int iPos,
    Reference ipIACurveCst,
    double iTangencyNorm,
    int iInvertValue,
    int iCrvCstType);


  /**
   * @param iSplineType Mandatory int parameter.
   */

  @DISPID(1611005966) //= 0x6006000e. The runtime will prefer the VTID if present
  @VTID(39)
  void setSplineType(
    int iSplineType);


  /**
   * @param iClosingType Mandatory int parameter.
   */

  @DISPID(1611005967) //= 0x6006000f. The runtime will prefer the VTID if present
  @VTID(40)
  void setClosing(
    int iClosingType);


  /**
   * @param iSupport Mandatory Reference parameter.
   */

  @DISPID(1611005968) //= 0x60060010. The runtime will prefer the VTID if present
  @VTID(41)
  void setSupport(
    Reference iSupport);


  /**
   * @param iPos Mandatory int parameter.
   * @return  Returns a value of type RealParam
   */

  @DISPID(1611005969) //= 0x60060011. The runtime will prefer the VTID if present
  @VTID(42)
  RealParam getTangentNorm(
    int iPos);


  /**
   * @param iPos Mandatory int parameter.
   * @return  Returns a value of type Length
   */

  @DISPID(1611005970) //= 0x60060012. The runtime will prefer the VTID if present
  @VTID(43)
  Length getCurvatureRadius(
    int iPos);


  /**
   * @return  Returns a value of type int
   */

  @DISPID(1611005971) //= 0x60060013. The runtime will prefer the VTID if present
  @VTID(44)
  int getClosure();


  /**
   * @return  Returns a value of type int
   */

  @DISPID(1611005972) //= 0x60060014. The runtime will prefer the VTID if present
  @VTID(45)
  int getSplineType();


  /**
   * @return  Returns a value of type Reference
   */

  @DISPID(1611005973) //= 0x60060015. The runtime will prefer the VTID if present
  @VTID(46)
  Reference getSupport();


  /**
   */

  @DISPID(1611005974) //= 0x60060016. The runtime will prefer the VTID if present
  @VTID(47)
  void removeAll();


  /**
   */

  @DISPID(1611005975) //= 0x60060017. The runtime will prefer the VTID if present
  @VTID(48)
  void removeSupport();


  /**
   * @param iPos Mandatory int parameter.
   * @param iPoint Mandatory Reference parameter.
   */

  @DISPID(1611005976) //= 0x60060018. The runtime will prefer the VTID if present
  @VTID(49)
  void replacePointAtPosition(
    int iPos,
    Reference iPoint);


  /**
   * @param iPos Mandatory int parameter.
   */

  @DISPID(1611005977) //= 0x60060019. The runtime will prefer the VTID if present
  @VTID(50)
  void removeTangentDirection(
    int iPos);


  /**
   * @param iPos Mandatory int parameter.
   */

  @DISPID(1611005978) //= 0x6006001a. The runtime will prefer the VTID if present
  @VTID(51)
  void removeTension(
    int iPos);


  /**
   * @param iPos Mandatory int parameter.
   */

  @DISPID(1611005979) //= 0x6006001b. The runtime will prefer the VTID if present
  @VTID(52)
  void removeCurvatureRadiusDirection(
    int iPos);


  /**
   * @param iPos Mandatory int parameter.
   */

  @DISPID(1611005980) //= 0x6006001c. The runtime will prefer the VTID if present
  @VTID(53)
  void removeCurvatureRadiusValue(
    int iPos);


  /**
   * @param iPos Mandatory int parameter.
   */

  @DISPID(1611005981) //= 0x6006001d. The runtime will prefer the VTID if present
  @VTID(54)
  void invertDirection(
    int iPos);


  /**
   * @param iPos Mandatory int parameter.
   * @return  Returns a value of type int
   */

  @DISPID(1611005982) //= 0x6006001e. The runtime will prefer the VTID if present
  @VTID(55)
  int getDirectionInversion(
    int iPos);


  // Properties:
}
