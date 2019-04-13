package CatiaV5TypeLibs.MecModTypeLib;
import CatiaV5TypeLibs.InfTypeLib.*;

import com4j.*;

@IID("{89D7663F-57C8-0000-0280-020E60000000}")
public interface HybridShapePointCoord extends Point {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "X"
   * </p>
   * @return  Returns a value of type Length
   */

  @DISPID(1611071488) //= 0x60070000. The runtime will prefer the VTID if present
  @VTID(27)
  Length x();


  /**
   * <p>
   * Getter method for the COM property "Y"
   * </p>
   * @return  Returns a value of type Length
   */

  @DISPID(1611071489) //= 0x60070001. The runtime will prefer the VTID if present
  @VTID(28)
  Length y();


  /**
   * <p>
   * Getter method for the COM property "Z"
   * </p>
   * @return  Returns a value of type Length
   */

  @DISPID(1611071490) //= 0x60070002. The runtime will prefer the VTID if present
  @VTID(29)
  Length z();


  /**
   * <p>
   * Getter method for the COM property "PtRef"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611071491) //= 0x60070003. The runtime will prefer the VTID if present
  @VTID(30)
  Reference ptRef();


  /**
   * <p>
   * Setter method for the COM property "PtRef"
   * </p>
   * @param oPtRef Mandatory Reference parameter.
   */

  @DISPID(1611071491) //= 0x60070003. The runtime will prefer the VTID if present
  @VTID(31)
  void ptRef(
    Reference oPtRef);


  /**
   * <p>
   * Getter method for the COM property "RefAxisSystem"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611071493) //= 0x60070005. The runtime will prefer the VTID if present
  @VTID(32)
  Reference refAxisSystem();


  /**
   * <p>
   * Setter method for the COM property "RefAxisSystem"
   * </p>
   * @param oRefAxis Mandatory Reference parameter.
   */

  @DISPID(1611071493) //= 0x60070005. The runtime will prefer the VTID if present
  @VTID(33)
  void refAxisSystem(
    Reference oRefAxis);


  // Properties:
}
