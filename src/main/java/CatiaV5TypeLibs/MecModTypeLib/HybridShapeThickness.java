package CatiaV5TypeLibs.MecModTypeLib;
import CatiaV5TypeLibs.KnowledgewareTypeLib.*;
import CatiaV5TypeLibs.InfTypeLib.*;

import com4j.*;

@IID("{A0E2E9CF-BE44-0000-0280-020A3A000000}")
public interface HybridShapeThickness extends HybridShape {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Thickness1Value"
   * </p>
   * @return  Returns a value of type Length
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(25)
  Length thickness1Value();


  /**
   * <p>
   * Getter method for the COM property "Thickness2Value"
   * </p>
   * @return  Returns a value of type Length
   */

  @DISPID(1611005953) //= 0x60060001. The runtime will prefer the VTID if present
  @VTID(26)
  Length thickness2Value();


  /**
   * <p>
   * Getter method for the COM property "Orientation"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611005954) //= 0x60060002. The runtime will prefer the VTID if present
  @VTID(27)
  int orientation();


  /**
   * <p>
   * Setter method for the COM property "Orientation"
   * </p>
   * @param oOrientation Mandatory int parameter.
   */

  @DISPID(1611005954) //= 0x60060002. The runtime will prefer the VTID if present
  @VTID(28)
  void orientation(
    int oOrientation);


  /**
   * <p>
   * Getter method for the COM property "Thickness1"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(1611005956) //= 0x60060004. The runtime will prefer the VTID if present
  @VTID(29)
  double thickness1();


  /**
   * <p>
   * Setter method for the COM property "Thickness1"
   * </p>
   * @param oThickness1 Mandatory double parameter.
   */

  @DISPID(1611005956) //= 0x60060004. The runtime will prefer the VTID if present
  @VTID(30)
  void thickness1(
    double oThickness1);


  /**
   * <p>
   * Getter method for the COM property "Thickness2"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(1611005958) //= 0x60060006. The runtime will prefer the VTID if present
  @VTID(31)
  double thickness2();


  /**
   * <p>
   * Setter method for the COM property "Thickness2"
   * </p>
   * @param oThickness2 Mandatory double parameter.
   */

  @DISPID(1611005958) //= 0x60060006. The runtime will prefer the VTID if present
  @VTID(32)
  void thickness2(
    double oThickness2);


  // Properties:
}
