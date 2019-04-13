package CatiaV5TypeLibs.MecModTypeLib;
import CatiaV5TypeLibs.KnowledgewareTypeLib.*;

import CatiaV5TypeLibs.InfTypeLib.*;
import com4j.*;

@IID("{929FEC94-3411-0000-0280-020B32000000}")
public interface HybridShapeReflectLine extends HybridShape {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Support"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(25)
  Reference support();


  /**
   * <p>
   * Setter method for the COM property "Support"
   * </p>
   * @param oSupport Mandatory Reference parameter.
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(26)
  void support(
    Reference oSupport);


  /**
   * <p>
   * Getter method for the COM property "Origin"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611005954) //= 0x60060002. The runtime will prefer the VTID if present
  @VTID(27)
  Reference origin();


  /**
   * <p>
   * Setter method for the COM property "Origin"
   * </p>
   * @param oOrigin Mandatory Reference parameter.
   */

  @DISPID(1611005954) //= 0x60060002. The runtime will prefer the VTID if present
  @VTID(28)
  void origin(
    Reference oOrigin);


  /**
   * <p>
   * Getter method for the COM property "Direction"
   * </p>
   * @return  Returns a value of type HybridShapeDirection
   */

  @DISPID(1611005956) //= 0x60060004. The runtime will prefer the VTID if present
  @VTID(29)
  HybridShapeDirection direction();


  /**
   * <p>
   * Setter method for the COM property "Direction"
   * </p>
   * @param oDirection Mandatory HybridShapeDirection parameter.
   */

  @DISPID(1611005956) //= 0x60060004. The runtime will prefer the VTID if present
  @VTID(30)
  void direction(
    HybridShapeDirection oDirection);


  /**
   * <p>
   * Getter method for the COM property "Angle"
   * </p>
   * @return  Returns a value of type Angle
   */

  @DISPID(1611005958) //= 0x60060006. The runtime will prefer the VTID if present
  @VTID(31)
  Angle angle();


  /**
   * <p>
   * Setter method for the COM property "Angle"
   * </p>
   * @param oAngle Mandatory Angle parameter.
   */

  @DISPID(1611005958) //= 0x60060006. The runtime will prefer the VTID if present
  @VTID(32)
  void angle(
    Angle oAngle);


  /**
   * <p>
   * Getter method for the COM property "OrientationSupport"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611005960) //= 0x60060008. The runtime will prefer the VTID if present
  @VTID(33)
  int orientationSupport();


  /**
   * <p>
   * Setter method for the COM property "OrientationSupport"
   * </p>
   * @param oOrientation Mandatory int parameter.
   */

  @DISPID(1611005960) //= 0x60060008. The runtime will prefer the VTID if present
  @VTID(34)
  void orientationSupport(
    int oOrientation);


  /**
   * <p>
   * Getter method for the COM property "OrientationDirection"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611005962) //= 0x6006000a. The runtime will prefer the VTID if present
  @VTID(35)
  int orientationDirection();


  /**
   * <p>
   * Setter method for the COM property "OrientationDirection"
   * </p>
   * @param oOrientation Mandatory int parameter.
   */

  @DISPID(1611005962) //= 0x6006000a. The runtime will prefer the VTID if present
  @VTID(36)
  void orientationDirection(
    int oOrientation);


  /**
   * <p>
   * Getter method for the COM property "TypeSolution"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611005964) //= 0x6006000c. The runtime will prefer the VTID if present
  @VTID(37)
  int typeSolution();


  /**
   * <p>
   * Setter method for the COM property "TypeSolution"
   * </p>
   * @param oSolutionType Mandatory int parameter.
   */

  @DISPID(1611005964) //= 0x6006000c. The runtime will prefer the VTID if present
  @VTID(38)
  void typeSolution(
    int oSolutionType);


  /**
   * <p>
   * Getter method for the COM property "SourceType"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611005966) //= 0x6006000e. The runtime will prefer the VTID if present
  @VTID(39)
  int sourceType();


  /**
   * <p>
   * Setter method for the COM property "SourceType"
   * </p>
   * @param oSourceType Mandatory int parameter.
   */

  @DISPID(1611005966) //= 0x6006000e. The runtime will prefer the VTID if present
  @VTID(40)
  void sourceType(
    int oSourceType);


  /**
   */

  @DISPID(1611005968) //= 0x60060010. The runtime will prefer the VTID if present
  @VTID(41)
  void invertOrientationSupport();


  /**
   */

  @DISPID(1611005969) //= 0x60060011. The runtime will prefer the VTID if present
  @VTID(42)
  void invertOrientationDirection();


  // Properties:
}
