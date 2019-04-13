package CatiaV5TypeLibs.MecModTypeLib;
import CatiaV5TypeLibs.InfTypeLib.*;

import com4j.*;

@IID("{7BB6F121-F048-11D3-8496-0000863D36FF}")
public interface HybridShapeConic extends HybridShape {
  // Methods:
  /**
   * @param iStartTgt Mandatory HybridShapeDirection parameter.
   * @param iEndTgt Mandatory HybridShapeDirection parameter.
   * @param iPassingPt Mandatory Reference parameter.
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(25)
  void setStartAndEndTangentsPlusPassingPoint(
    HybridShapeDirection iStartTgt,
    HybridShapeDirection iEndTgt,
    Reference iPassingPt);


  /**
   * @param iStartTgt Mandatory HybridShapeDirection parameter.
   * @param iEndTgt Mandatory HybridShapeDirection parameter.
   * @param iConicParam Mandatory double parameter.
   */

  @DISPID(1611005953) //= 0x60060001. The runtime will prefer the VTID if present
  @VTID(26)
  void setStartAndEndTangentsPlusConicParameter(
    HybridShapeDirection iStartTgt,
    HybridShapeDirection iEndTgt,
    double iConicParam);


  /**
   * @param iTgtInt Mandatory Reference parameter.
   * @param iPassingPt Mandatory Reference parameter.
   */

  @DISPID(1611005954) //= 0x60060002. The runtime will prefer the VTID if present
  @VTID(27)
  void setTangentIntersectPointPlusPassingPoint(
    Reference iTgtInt,
    Reference iPassingPt);


  /**
   * @param iTgtInt Mandatory Reference parameter.
   * @param iConicParam Mandatory double parameter.
   */

  @DISPID(1611005955) //= 0x60060003. The runtime will prefer the VTID if present
  @VTID(28)
  void setTangentIntersectPointPlusConicParm(
    Reference iTgtInt,
    double iConicParam);


  /**
   * @param iPassPt1 Mandatory Reference parameter.
   * @param iPassPt2 Mandatory Reference parameter.
   * @param iPassPt3 Mandatory Reference parameter.
   */

  @DISPID(1611005956) //= 0x60060004. The runtime will prefer the VTID if present
  @VTID(29)
  void setThreeIntermediatePassingPoints(
    Reference iPassPt1,
    Reference iPassPt2,
    Reference iPassPt3);


  /**
   * @param iPassPt1 Mandatory Reference parameter.
   * @param iPassPt2 Mandatory Reference parameter.
   * @param iTgtDir Mandatory HybridShapeDirection parameter.
   * @param iIndexPoint Mandatory int parameter.
   */

  @DISPID(1611005957) //= 0x60060005. The runtime will prefer the VTID if present
  @VTID(30)
  void setTwoIntermediatePassingPointsPlusOneTangent(
    Reference iPassPt1,
    Reference iPassPt2,
    HybridShapeDirection iTgtDir,
    int iIndexPoint);


  /**
   * @param iIndexPoint Mandatory int parameter.
   * @return  Returns a value of type Reference
   */

  @DISPID(1611005958) //= 0x60060006. The runtime will prefer the VTID if present
  @VTID(31)
  Reference getIntermediatePoint(
    int iIndexPoint);


  /**
   * @param iIndexPoint Mandatory int parameter.
   * @param iEndPoint Mandatory Reference parameter.
   */

  @DISPID(1611005959) //= 0x60060007. The runtime will prefer the VTID if present
  @VTID(32)
  void setIntermediatePoint(
    int iIndexPoint,
    Reference iEndPoint);


  /**
   * @param iIndexPoint Mandatory int parameter.
   * @return  Returns a value of type HybridShapeDirection
   */

  @DISPID(1611005960) //= 0x60060008. The runtime will prefer the VTID if present
  @VTID(33)
  HybridShapeDirection getIntermedTangent(
    int iIndexPoint);


  /**
   * @param iIndexPoint Mandatory int parameter.
   * @param iTgtDir Mandatory HybridShapeDirection parameter.
   */

  @DISPID(1611005961) //= 0x60060009. The runtime will prefer the VTID if present
  @VTID(34)
  void setIntermediateTangent(
    int iIndexPoint,
    HybridShapeDirection iTgtDir);


  /**
   * @param iIndexPoint Mandatory int parameter.
   */

  @DISPID(1611005962) //= 0x6006000a. The runtime will prefer the VTID if present
  @VTID(35)
  void switchIntermediateTangentDirection(
    int iIndexPoint);


  /**
   * @param iIndexPoint Mandatory int parameter.
   * @param iOrientation Mandatory int parameter.
   */

  @DISPID(1611005963) //= 0x6006000b. The runtime will prefer the VTID if present
  @VTID(36)
  void setIntermediateTangentDirectionFlag(
    int iIndexPoint,
    int iOrientation);


  /**
   * @param iIndexPoint Mandatory int parameter.
   * @return  Returns a value of type int
   */

  @DISPID(1611005964) //= 0x6006000c. The runtime will prefer the VTID if present
  @VTID(37)
  int getIntermediateTangentDirectionFlag(
    int iIndexPoint);


  /**
   */

  @DISPID(1611005965) //= 0x6006000d. The runtime will prefer the VTID if present
  @VTID(38)
  void switchStartTangentDirection();


  /**
   * @param iOrientation Mandatory int parameter.
   */

  @DISPID(1611005966) //= 0x6006000e. The runtime will prefer the VTID if present
  @VTID(39)
  void setStartTangentDirectionFlag(
    int iOrientation);


  /**
   * @return  Returns a value of type int
   */

  @DISPID(1611005967) //= 0x6006000f. The runtime will prefer the VTID if present
  @VTID(40)
  int getStartTangentDirectionFlag();


  /**
   */

  @DISPID(1611005968) //= 0x60060010. The runtime will prefer the VTID if present
  @VTID(41)
  void switchEndTangentDirection();


  /**
   * @param iOrientation Mandatory int parameter.
   */

  @DISPID(1611005969) //= 0x60060011. The runtime will prefer the VTID if present
  @VTID(42)
  void setEndTangentDirectionFlag(
    int iOrientation);


  /**
   * @return  Returns a value of type int
   */

  @DISPID(1611005970) //= 0x60060012. The runtime will prefer the VTID if present
  @VTID(43)
  int getEndTangentDirectionFlag();


  /**
   * <p>
   * Getter method for the COM property "SupportPlane"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611005971) //= 0x60060013. The runtime will prefer the VTID if present
  @VTID(44)
  Reference supportPlane();


  /**
   * <p>
   * Setter method for the COM property "SupportPlane"
   * </p>
   * @param oSupportPlane Mandatory Reference parameter.
   */

  @DISPID(1611005971) //= 0x60060013. The runtime will prefer the VTID if present
  @VTID(45)
  void supportPlane(
    Reference oSupportPlane);


  /**
   * <p>
   * Getter method for the COM property "TangentIntPoint"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611005973) //= 0x60060015. The runtime will prefer the VTID if present
  @VTID(46)
  Reference tangentIntPoint();


  /**
   * <p>
   * Setter method for the COM property "TangentIntPoint"
   * </p>
   * @param oTgtPtInt Mandatory Reference parameter.
   */

  @DISPID(1611005973) //= 0x60060015. The runtime will prefer the VTID if present
  @VTID(47)
  void tangentIntPoint(
    Reference oTgtPtInt);


  /**
   * <p>
   * Getter method for the COM property "StartPoint"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611005975) //= 0x60060017. The runtime will prefer the VTID if present
  @VTID(48)
  Reference startPoint();


  /**
   * <p>
   * Setter method for the COM property "StartPoint"
   * </p>
   * @param oStartPoint Mandatory Reference parameter.
   */

  @DISPID(1611005975) //= 0x60060017. The runtime will prefer the VTID if present
  @VTID(49)
  void startPoint(
    Reference oStartPoint);


  /**
   * <p>
   * Getter method for the COM property "EndPoint"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611005977) //= 0x60060019. The runtime will prefer the VTID if present
  @VTID(50)
  Reference endPoint();


  /**
   * <p>
   * Setter method for the COM property "EndPoint"
   * </p>
   * @param oEndPoint Mandatory Reference parameter.
   */

  @DISPID(1611005977) //= 0x60060019. The runtime will prefer the VTID if present
  @VTID(51)
  void endPoint(
    Reference oEndPoint);


  /**
   * <p>
   * Getter method for the COM property "StartTangent"
   * </p>
   * @return  Returns a value of type HybridShapeDirection
   */

  @DISPID(1611005979) //= 0x6006001b. The runtime will prefer the VTID if present
  @VTID(52)
  HybridShapeDirection startTangent();


  /**
   * <p>
   * Setter method for the COM property "StartTangent"
   * </p>
   * @param oStartTangent Mandatory HybridShapeDirection parameter.
   */

  @DISPID(1611005979) //= 0x6006001b. The runtime will prefer the VTID if present
  @VTID(53)
  void startTangent(
    HybridShapeDirection oStartTangent);


  /**
   * <p>
   * Getter method for the COM property "EndTangent"
   * </p>
   * @return  Returns a value of type HybridShapeDirection
   */

  @DISPID(1611005981) //= 0x6006001d. The runtime will prefer the VTID if present
  @VTID(54)
  HybridShapeDirection endTangent();


  /**
   * <p>
   * Setter method for the COM property "EndTangent"
   * </p>
   * @param oEndTangent Mandatory HybridShapeDirection parameter.
   */

  @DISPID(1611005981) //= 0x6006001d. The runtime will prefer the VTID if present
  @VTID(55)
  void endTangent(
    HybridShapeDirection oEndTangent);


  /**
   * <p>
   * Getter method for the COM property "ConicParameter"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(1611005983) //= 0x6006001f. The runtime will prefer the VTID if present
  @VTID(56)
  double conicParameter();


  /**
   * <p>
   * Setter method for the COM property "ConicParameter"
   * </p>
   * @param oConicParameter Mandatory double parameter.
   */

  @DISPID(1611005983) //= 0x6006001f. The runtime will prefer the VTID if present
  @VTID(57)
  void conicParameter(
    double oConicParameter);


  /**
   * <p>
   * Getter method for the COM property "ConicUserTol"
   * </p>
   * @return  Returns a value of type Length
   */

  @DISPID(1611005985) //= 0x60060021. The runtime will prefer the VTID if present
  @VTID(58)
  Length conicUserTol();


  // Properties:
}
