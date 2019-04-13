package CatiaV5TypeLibs.MecModTypeLib;
import CatiaV5TypeLibs.InfTypeLib.*;

import com4j.*;

@IID("{59983C20-6504-11D3-9A5E-006094B9A6B3}")
public interface HybridShapeDevelop extends HybridShape {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Mode"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(25)
  int mode();


  /**
   * <p>
   * Setter method for the COM property "Mode"
   * </p>
   * @param oElem Mandatory int parameter.
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(26)
  void mode(
    int oElem);


  /**
   * <p>
   * Getter method for the COM property "ModePos"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611005954) //= 0x60060002. The runtime will prefer the VTID if present
  @VTID(27)
  int modePos();


  /**
   * <p>
   * Setter method for the COM property "ModePos"
   * </p>
   * @param oElem Mandatory int parameter.
   */

  @DISPID(1611005954) //= 0x60060002. The runtime will prefer the VTID if present
  @VTID(28)
  void modePos(
    int oElem);


  /**
   * <p>
   * Getter method for the COM property "WireToDevelop"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611005956) //= 0x60060004. The runtime will prefer the VTID if present
  @VTID(29)
  Reference wireToDevelop();


  /**
   * <p>
   * Setter method for the COM property "WireToDevelop"
   * </p>
   * @param oElem Mandatory Reference parameter.
   */

  @DISPID(1611005956) //= 0x60060004. The runtime will prefer the VTID if present
  @VTID(30)
  void wireToDevelop(
    Reference oElem);


  /**
   * <p>
   * Getter method for the COM property "PositionedWire"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611005958) //= 0x60060006. The runtime will prefer the VTID if present
  @VTID(31)
  Reference positionedWire();


  /**
   * <p>
   * Setter method for the COM property "PositionedWire"
   * </p>
   * @param oElem Mandatory Reference parameter.
   */

  @DISPID(1611005958) //= 0x60060006. The runtime will prefer the VTID if present
  @VTID(32)
  void positionedWire(
    Reference oElem);


  /**
   * <p>
   * Getter method for the COM property "Support"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611005960) //= 0x60060008. The runtime will prefer the VTID if present
  @VTID(33)
  Reference support();


  /**
   * <p>
   * Setter method for the COM property "Support"
   * </p>
   * @param oElem Mandatory Reference parameter.
   */

  @DISPID(1611005960) //= 0x60060008. The runtime will prefer the VTID if present
  @VTID(34)
  void support(
    Reference oElem);


  /**
   * <p>
   * Getter method for the COM property "PlaneAxisOrigin"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611005962) //= 0x6006000a. The runtime will prefer the VTID if present
  @VTID(35)
  Reference planeAxisOrigin();


  /**
   * <p>
   * Setter method for the COM property "PlaneAxisOrigin"
   * </p>
   * @param oElem Mandatory Reference parameter.
   */

  @DISPID(1611005962) //= 0x6006000a. The runtime will prefer the VTID if present
  @VTID(36)
  void planeAxisOrigin(
    Reference oElem);


  /**
   * <p>
   * Getter method for the COM property "PlaneAxisDirection"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611005964) //= 0x6006000c. The runtime will prefer the VTID if present
  @VTID(37)
  Reference planeAxisDirection();


  /**
   * <p>
   * Setter method for the COM property "PlaneAxisDirection"
   * </p>
   * @param oElem Mandatory Reference parameter.
   */

  @DISPID(1611005964) //= 0x6006000c. The runtime will prefer the VTID if present
  @VTID(38)
  void planeAxisDirection(
    Reference oElem);


  /**
   * @param iCoorIdx Mandatory int parameter.
   * @return  Returns a value of type Length
   */

  @DISPID(1611005966) //= 0x6006000e. The runtime will prefer the VTID if present
  @VTID(39)
  Length getPlaneAxisCoord(
    int iCoorIdx);


  /**
   * @param iCoorIdx Mandatory int parameter.
   * @param iCoordValue Mandatory double parameter.
   */

  @DISPID(1611005967) //= 0x6006000f. The runtime will prefer the VTID if present
  @VTID(40)
  void setPlaneAxisCoord(
    int iCoorIdx,
    double iCoordValue);


  /**
   * @return  Returns a value of type Angle
   */

  @DISPID(1611005968) //= 0x60060010. The runtime will prefer the VTID if present
  @VTID(41)
  Angle getPlaneAxisAngle();


  /**
   * @param iAngle Mandatory double parameter.
   */

  @DISPID(1611005969) //= 0x60060011. The runtime will prefer the VTID if present
  @VTID(42)
  void setPlaneAxisAngle(
    double iAngle);


  /**
   * @param ii Mandatory int parameter.
   * @return  Returns a value of type int
   */

  @DISPID(1611005970) //= 0x60060012. The runtime will prefer the VTID if present
  @VTID(43)
  int getPlaneAxisSwapAxes(
    int ii);


  /**
   * @param iIdx Mandatory int parameter.
   * @param iInversionValue Mandatory int parameter.
   */

  @DISPID(1611005971) //= 0x60060013. The runtime will prefer the VTID if present
  @VTID(44)
  void setPlaneAxisSwapAxes(
    int iIdx,
    int iInversionValue);


  /**
   * <p>
   * Getter method for the COM property "PointOnSupport"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611005972) //= 0x60060014. The runtime will prefer the VTID if present
  @VTID(45)
  Reference pointOnSupport();


  /**
   * <p>
   * Setter method for the COM property "PointOnSupport"
   * </p>
   * @param oOrigin Mandatory Reference parameter.
   */

  @DISPID(1611005972) //= 0x60060014. The runtime will prefer the VTID if present
  @VTID(46)
  void pointOnSupport(
    Reference oOrigin);


  // Properties:
}
