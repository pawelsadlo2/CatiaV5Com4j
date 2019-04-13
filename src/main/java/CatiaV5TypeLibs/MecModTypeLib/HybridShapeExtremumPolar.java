package CatiaV5TypeLibs.MecModTypeLib;
import CatiaV5TypeLibs.InfTypeLib.*;

import com4j.*;

@IID("{54BA08FC-8737-11D6-A2F1-00065BDD6075}")
public interface HybridShapeExtremumPolar extends HybridShape {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Contour"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(25)
  Reference contour();


  /**
   * <p>
   * Setter method for the COM property "Contour"
   * </p>
   * @param opIAContour Mandatory Reference parameter.
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(26)
  void contour(
    Reference opIAContour);


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
   * @param opIASupport Mandatory Reference parameter.
   */

  @DISPID(1611005954) //= 0x60060002. The runtime will prefer the VTID if present
  @VTID(28)
  void support(
    Reference opIASupport);


  /**
   * <p>
   * Getter method for the COM property "Dir"
   * </p>
   * @return  Returns a value of type HybridShapeDirection
   */

  @DISPID(1611005956) //= 0x60060004. The runtime will prefer the VTID if present
  @VTID(29)
  HybridShapeDirection dir();


  /**
   * <p>
   * Setter method for the COM property "Dir"
   * </p>
   * @param opIADir Mandatory HybridShapeDirection parameter.
   */

  @DISPID(1611005956) //= 0x60060004. The runtime will prefer the VTID if present
  @VTID(30)
  void dir(
    HybridShapeDirection opIADir);


  /**
   * <p>
   * Getter method for the COM property "Origin"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611005958) //= 0x60060006. The runtime will prefer the VTID if present
  @VTID(31)
  Reference origin();


  /**
   * <p>
   * Setter method for the COM property "Origin"
   * </p>
   * @param opIAOrigin Mandatory Reference parameter.
   */

  @DISPID(1611005958) //= 0x60060006. The runtime will prefer the VTID if present
  @VTID(32)
  void origin(
    Reference opIAOrigin);


  /**
   * <p>
   * Getter method for the COM property "ExtremumType"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(1611005960) //= 0x60060008. The runtime will prefer the VTID if present
  @VTID(33)
  short extremumType();


  /**
   * <p>
   * Setter method for the COM property "ExtremumType"
   * </p>
   * @param oType Mandatory short parameter.
   */

  @DISPID(1611005960) //= 0x60060008. The runtime will prefer the VTID if present
  @VTID(34)
  void extremumType(
    short oType);


  /**
   * <p>
   * Getter method for the COM property "Radius"
   * </p>
   * @return  Returns a value of type Length
   */

  @DISPID(1611005962) //= 0x6006000a. The runtime will prefer the VTID if present
  @VTID(35)
  Length radius();


  /**
   * <p>
   * Getter method for the COM property "Angle"
   * </p>
   * @return  Returns a value of type Angle
   */

  @DISPID(1611005963) //= 0x6006000b. The runtime will prefer the VTID if present
  @VTID(36)
  Angle angle();


  // Properties:
}
