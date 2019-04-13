package CatiaV5TypeLibs.MecModTypeLib;
import CatiaV5TypeLibs.InfTypeLib.*;

import com4j.*;

@IID("{8C89B26F-5116-0000-0280-020E60000000}")
public interface HybridShapeAffinity extends HybridShape {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "ElemToTransform"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(25)
  Reference elemToTransform();


  /**
   * <p>
   * Setter method for the COM property "ElemToTransform"
   * </p>
   * @param oElem Mandatory Reference parameter.
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(26)
  void elemToTransform(
    Reference oElem);


  /**
   * <p>
   * Getter method for the COM property "AxisOrigin"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611005954) //= 0x60060002. The runtime will prefer the VTID if present
  @VTID(27)
  Reference axisOrigin();


  /**
   * <p>
   * Setter method for the COM property "AxisOrigin"
   * </p>
   * @param oElem Mandatory Reference parameter.
   */

  @DISPID(1611005954) //= 0x60060002. The runtime will prefer the VTID if present
  @VTID(28)
  void axisOrigin(
    Reference oElem);


  /**
   * <p>
   * Getter method for the COM property "AxisPlane"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611005956) //= 0x60060004. The runtime will prefer the VTID if present
  @VTID(29)
  Reference axisPlane();


  /**
   * <p>
   * Setter method for the COM property "AxisPlane"
   * </p>
   * @param oElem Mandatory Reference parameter.
   */

  @DISPID(1611005956) //= 0x60060004. The runtime will prefer the VTID if present
  @VTID(30)
  void axisPlane(
    Reference oElem);


  /**
   * <p>
   * Getter method for the COM property "AxisFirstDirection"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611005958) //= 0x60060006. The runtime will prefer the VTID if present
  @VTID(31)
  Reference axisFirstDirection();


  /**
   * <p>
   * Setter method for the COM property "AxisFirstDirection"
   * </p>
   * @param oElem Mandatory Reference parameter.
   */

  @DISPID(1611005958) //= 0x60060006. The runtime will prefer the VTID if present
  @VTID(32)
  void axisFirstDirection(
    Reference oElem);


  /**
   * <p>
   * Getter method for the COM property "XRatios"
   * </p>
   * @return  Returns a value of type RealParam
   */

  @DISPID(1611005960) //= 0x60060008. The runtime will prefer the VTID if present
  @VTID(33)
  RealParam xRatios();


  /**
   * <p>
   * Getter method for the COM property "YRatios"
   * </p>
   * @return  Returns a value of type RealParam
   */

  @DISPID(1611005961) //= 0x60060009. The runtime will prefer the VTID if present
  @VTID(34)
  RealParam yRatios();


  /**
   * <p>
   * Getter method for the COM property "ZRatios"
   * </p>
   * @return  Returns a value of type RealParam
   */

  @DISPID(1611005962) //= 0x6006000a. The runtime will prefer the VTID if present
  @VTID(35)
  RealParam zRatios();


  /**
   * <p>
   * Getter method for the COM property "VolumeResult"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005963) //= 0x6006000b. The runtime will prefer the VTID if present
  @VTID(36)
  boolean volumeResult();


  /**
   * <p>
   * Setter method for the COM property "VolumeResult"
   * </p>
   * @param oType Mandatory boolean parameter.
   */

  @DISPID(1611005963) //= 0x6006000b. The runtime will prefer the VTID if present
  @VTID(37)
  void volumeResult(
    boolean oType);


  /**
   * <p>
   * Getter method for the COM property "CreationMode"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005965) //= 0x6006000d. The runtime will prefer the VTID if present
  @VTID(38)
  boolean creationMode();


  /**
   * <p>
   * Setter method for the COM property "CreationMode"
   * </p>
   * @param oCreation Mandatory boolean parameter.
   */

  @DISPID(1611005965) //= 0x6006000d. The runtime will prefer the VTID if present
  @VTID(39)
  void creationMode(
    boolean oCreation);


  // Properties:
}
