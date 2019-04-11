package CatiaV5TypeLibs.PartItfTypeLib;

import com4j.DISPID;
import com4j.IID;
import com4j.VTID;
import CatiaV5TypeLibs.InfItfTypeLib.*;

@IID("{C101F6B0-FC3E-11D4-9EFC-00508B5FE787}")
public interface Rotate extends Shape {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "ElemToRotate"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(22)
  Reference elemToRotate();


  /**
   * <p>
   * Setter method for the COM property "ElemToRotate"
   * </p>
   * @param oX Mandatory Reference parameter.
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(23)
  void elemToRotate(
    Reference oX);


  /**
   * <p>
   * Getter method for the COM property "Axis"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611005954) //= 0x60060002. The runtime will prefer the VTID if present
  @VTID(24)
  Reference axis();


  /**
   * <p>
   * Setter method for the COM property "Axis"
   * </p>
   * @param oX Mandatory Reference parameter.
   */

  @DISPID(1611005954) //= 0x60060002. The runtime will prefer the VTID if present
  @VTID(25)
  void axis(
    Reference oX);


  /**
   * <p>
   * Getter method for the COM property "CatiaV5TypeLibs.PartItfTypeLib.Angle"
   * </p>
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.Angle
   */

  @DISPID(1611005956) //= 0x60060004. The runtime will prefer the VTID if present
  @VTID(26)
  Angle angle();


  /**
   * <p>
   * Getter method for the COM property "AngleValue"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(1611005957) //= 0x60060005. The runtime will prefer the VTID if present
  @VTID(27)
  double angleValue();


  /**
   * <p>
   * Setter method for the COM property "AngleValue"
   * </p>
   * @param oX Mandatory double parameter.
   */

  @DISPID(1611005957) //= 0x60060005. The runtime will prefer the VTID if present
  @VTID(28)
  void angleValue(
    double oX);


  /**
   * <p>
   * Getter method for the COM property "CatiaV5TypeLibs.PartItfTypeLib.HybridShape"
   * </p>
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.HybridShape
   */

  @DISPID(1611005959) //= 0x60060007. The runtime will prefer the VTID if present
  @VTID(29)
  HybridShape hybridShape();


  // Properties:
}
