package CatiaV5TypeLibs.HybridShapeTypeLib;
import CatiaV5TypeLibs.InfTypeLib.*;
import CatiaV5TypeLibs.MecModTypeLib.*;
import CatiaV5TypeLibs.KnowledgewareTypeLib.*;

import com4j.*;

@IID("{97514538-C285-0000-0280-020C4E000000}")
public interface HybridShapeSphere extends HybridShape {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Center"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(25)
  Reference center();


  /**
   * <p>
   * Setter method for the COM property "Center"
   * </p>
   * @param oPt Mandatory Reference parameter.
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(26)
  void center(
    Reference oPt);


  /**
   * <p>
   * Getter method for the COM property "BeginParallelAngle"
   * </p>
   * @return  Returns a value of type Angle
   */

  @DISPID(1611005954) //= 0x60060002. The runtime will prefer the VTID if present
  @VTID(27)
  Angle beginParallelAngle();


  /**
   * <p>
   * Getter method for the COM property "EndParallelAngle"
   * </p>
   * @return  Returns a value of type Angle
   */

  @DISPID(1611005955) //= 0x60060003. The runtime will prefer the VTID if present
  @VTID(28)
  Angle endParallelAngle();


  /**
   * <p>
   * Getter method for the COM property "BeginMeridianAngle"
   * </p>
   * @return  Returns a value of type Angle
   */

  @DISPID(1611005956) //= 0x60060004. The runtime will prefer the VTID if present
  @VTID(29)
  Angle beginMeridianAngle();


  /**
   * <p>
   * Getter method for the COM property "EndMeridianAngle"
   * </p>
   * @return  Returns a value of type Angle
   */

  @DISPID(1611005957) //= 0x60060005. The runtime will prefer the VTID if present
  @VTID(30)
  Angle endMeridianAngle();


  /**
   * <p>
   * Getter method for the COM property "Axis"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611005958) //= 0x60060006. The runtime will prefer the VTID if present
  @VTID(31)
  Reference axis();


  /**
   * <p>
   * Setter method for the COM property "Axis"
   * </p>
   * @param oDir Mandatory Reference parameter.
   */

  @DISPID(1611005958) //= 0x60060006. The runtime will prefer the VTID if present
  @VTID(32)
  void axis(
    Reference oDir);


  /**
   * <p>
   * Getter method for the COM property "Radius"
   * </p>
   * @return  Returns a value of type Length
   */

  @DISPID(1611005960) //= 0x60060008. The runtime will prefer the VTID if present
  @VTID(33)
  Length radius();


  /**
   * <p>
   * Setter method for the COM property "Limitation"
   * </p>
   * @param oLimitation Mandatory int parameter.
   */

  @DISPID(1611005961) //= 0x60060009. The runtime will prefer the VTID if present
  @VTID(34)
  void limitation(
    int oLimitation);


  /**
   * <p>
   * Getter method for the COM property "Limitation"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611005961) //= 0x60060009. The runtime will prefer the VTID if present
  @VTID(35)
  int limitation();


  /**
   * @param iAngle Mandatory double parameter.
   */

  @DISPID(1611005963) //= 0x6006000b. The runtime will prefer the VTID if present
  @VTID(36)
  void setBeginParallelAngle(
    double iAngle);


  /**
   * @param iAngle Mandatory double parameter.
   */

  @DISPID(1611005964) //= 0x6006000c. The runtime will prefer the VTID if present
  @VTID(37)
  void setEndParallelAngle(
    double iAngle);


  /**
   * @param iAngle Mandatory double parameter.
   */

  @DISPID(1611005965) //= 0x6006000d. The runtime will prefer the VTID if present
  @VTID(38)
  void setBeginMeridianAngle(
    double iAngle);


  /**
   * @param iAngle Mandatory double parameter.
   */

  @DISPID(1611005966) //= 0x6006000e. The runtime will prefer the VTID if present
  @VTID(39)
  void setEndMeridianAngle(
    double iAngle);


  /**
   * @param iRadius Mandatory double parameter.
   */

  @DISPID(1611005967) //= 0x6006000f. The runtime will prefer the VTID if present
  @VTID(40)
  void setRadius(
    double iRadius);


  // Properties:
}
