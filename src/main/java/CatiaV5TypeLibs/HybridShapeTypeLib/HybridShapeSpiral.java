package CatiaV5TypeLibs.HybridShapeTypeLib;
import CatiaV5TypeLibs.InfTypeLib.*;
import CatiaV5TypeLibs.MecModTypeLib.*;
import CatiaV5TypeLibs.KnowledgewareTypeLib.*;

import com4j.*;

@IID("{306CD039-881D-11D6-81AD-00065BDCB6ED}")
public interface HybridShapeSpiral extends HybridShape {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Type"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(25)
  int type();


  /**
   * <p>
   * Setter method for the COM property "Type"
   * </p>
   * @param oType Mandatory int parameter.
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(26)
  void type(
    int oType);


  /**
   * <p>
   * Getter method for the COM property "Support"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611005954) //= 0x60060002. The runtime will prefer the VTID if present
  @VTID(27)
  Reference support();


  /**
   * <p>
   * Setter method for the COM property "Support"
   * </p>
   * @param oSupportPlane Mandatory Reference parameter.
   */

  @DISPID(1611005954) //= 0x60060002. The runtime will prefer the VTID if present
  @VTID(28)
  void support(
    Reference oSupportPlane);


  /**
   * <p>
   * Getter method for the COM property "CenterPoint"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611005956) //= 0x60060004. The runtime will prefer the VTID if present
  @VTID(29)
  Reference centerPoint();


  /**
   * <p>
   * Setter method for the COM property "CenterPoint"
   * </p>
   * @param oCenterPt Mandatory Reference parameter.
   */

  @DISPID(1611005956) //= 0x60060004. The runtime will prefer the VTID if present
  @VTID(30)
  void centerPoint(
    Reference oCenterPt);


  /**
   * <p>
   * Getter method for the COM property "Axis"
   * </p>
   * @return  Returns a value of type HybridShapeDirection
   */

  @DISPID(1611005958) //= 0x60060006. The runtime will prefer the VTID if present
  @VTID(31)
  HybridShapeDirection axis();


  /**
   * <p>
   * Setter method for the COM property "Axis"
   * </p>
   * @param oAxis Mandatory HybridShapeDirection parameter.
   */

  @DISPID(1611005958) //= 0x60060006. The runtime will prefer the VTID if present
  @VTID(32)
  void axis(
    HybridShapeDirection oAxis);


  /**
   * <p>
   * Getter method for the COM property "InvertAxis"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005960) //= 0x60060008. The runtime will prefer the VTID if present
  @VTID(33)
  boolean invertAxis();


  /**
   * <p>
   * Setter method for the COM property "InvertAxis"
   * </p>
   * @param oInvert Mandatory boolean parameter.
   */

  @DISPID(1611005960) //= 0x60060008. The runtime will prefer the VTID if present
  @VTID(34)
  void invertAxis(
    boolean oInvert);


  /**
   * <p>
   * Getter method for the COM property "StartingRadius"
   * </p>
   * @return  Returns a value of type Length
   */

  @DISPID(1611005962) //= 0x6006000a. The runtime will prefer the VTID if present
  @VTID(35)
  Length startingRadius();


  /**
   * <p>
   * Setter method for the COM property "StartingRadius"
   * </p>
   * @param oStRadius Mandatory Length parameter.
   */

  @DISPID(1611005962) //= 0x6006000a. The runtime will prefer the VTID if present
  @VTID(36)
  void startingRadius(
    Length oStRadius);


  /**
   * <p>
   * Getter method for the COM property "ClockwiseRevolution"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005964) //= 0x6006000c. The runtime will prefer the VTID if present
  @VTID(37)
  boolean clockwiseRevolution();


  /**
   * <p>
   * Setter method for the COM property "ClockwiseRevolution"
   * </p>
   * @param oClockwiseRevolution Mandatory boolean parameter.
   */

  @DISPID(1611005964) //= 0x6006000c. The runtime will prefer the VTID if present
  @VTID(38)
  void clockwiseRevolution(
    boolean oClockwiseRevolution);


  /**
   * <p>
   * Getter method for the COM property "EndingAngle"
   * </p>
   * @return  Returns a value of type Angle
   */

  @DISPID(1611005966) //= 0x6006000e. The runtime will prefer the VTID if present
  @VTID(39)
  Angle endingAngle();


  /**
   * <p>
   * Setter method for the COM property "EndingAngle"
   * </p>
   * @param oEndAngle Mandatory Angle parameter.
   */

  @DISPID(1611005966) //= 0x6006000e. The runtime will prefer the VTID if present
  @VTID(40)
  void endingAngle(
    Angle oEndAngle);


  /**
   * <p>
   * Getter method for the COM property "EndingRadius"
   * </p>
   * @return  Returns a value of type Length
   */

  @DISPID(1611005968) //= 0x60060010. The runtime will prefer the VTID if present
  @VTID(41)
  Length endingRadius();


  /**
   * <p>
   * Setter method for the COM property "EndingRadius"
   * </p>
   * @param oEndRadius Mandatory Length parameter.
   */

  @DISPID(1611005968) //= 0x60060010. The runtime will prefer the VTID if present
  @VTID(42)
  void endingRadius(
    Length oEndRadius);


  /**
   * <p>
   * Getter method for the COM property "RevolNumber"
   * </p>
   * @return  Returns a value of type RealParam
   */

  @DISPID(1611005970) //= 0x60060012. The runtime will prefer the VTID if present
  @VTID(43)
  RealParam revolNumber();


  /**
   * <p>
   * Setter method for the COM property "RevolNumber"
   * </p>
   * @param oNbRevol Mandatory RealParam parameter.
   */

  @DISPID(1611005970) //= 0x60060012. The runtime will prefer the VTID if present
  @VTID(44)
  void revolNumber(
    RealParam oNbRevol);


  /**
   * <p>
   * Getter method for the COM property "Pitch"
   * </p>
   * @return  Returns a value of type Length
   */

  @DISPID(1611005972) //= 0x60060014. The runtime will prefer the VTID if present
  @VTID(45)
  Length pitch();


  /**
   * <p>
   * Setter method for the COM property "Pitch"
   * </p>
   * @param oInvert Mandatory Length parameter.
   */

  @DISPID(1611005972) //= 0x60060014. The runtime will prefer the VTID if present
  @VTID(46)
  void pitch(
    Length oInvert);


  /**
   * @param iEndAngle Mandatory double parameter.
   * @param iRevolNumber Mandatory double parameter.
   * @param iEndRadius Mandatory double parameter.
   */

  @DISPID(1611005974) //= 0x60060016. The runtime will prefer the VTID if present
  @VTID(47)
  void setAngleRadiusParam(
    double iEndAngle,
    double iRevolNumber,
    double iEndRadius);


  /**
   * @param iEndAngle Mandatory double parameter.
   * @param iRevolNumber Mandatory double parameter.
   * @param iPitch Mandatory double parameter.
   */

  @DISPID(1611005975) //= 0x60060017. The runtime will prefer the VTID if present
  @VTID(48)
  void setAnglePitchParam(
    double iEndAngle,
    double iRevolNumber,
    double iPitch);


  /**
   * @param iEndRadius Mandatory double parameter.
   * @param iPitch Mandatory double parameter.
   */

  @DISPID(1611005976) //= 0x60060018. The runtime will prefer the VTID if present
  @VTID(49)
  void setRadiusPitchParam(
    double iEndRadius,
    double iPitch);


  // Properties:
}
