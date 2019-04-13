package CatiaV5TypeLibs.PartTypeLib;
import CatiaV5TypeLibs.InfTypeLib.*;
import CatiaV5TypeLibs.MecModTypeLib.*;
import CatiaV5TypeLibs.KnowledgewareTypeLib.*;

import com4j.*;

@IID("{D92DE673-7D7D-4807-8AFF-95CA52C5AC19}")
public interface SolidCombine extends SketchBasedShape {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "FirstComponentProfile"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611071488) //= 0x60070000. The runtime will prefer the VTID if present
  @VTID(24)
  Reference firstComponentProfile();


  /**
   * <p>
   * Setter method for the COM property "FirstComponentProfile"
   * </p>
   * @param oFirstComponentProfile Mandatory Reference parameter.
   */

  @DISPID(1611071488) //= 0x60070000. The runtime will prefer the VTID if present
  @VTID(25)
  void firstComponentProfile(
    Reference oFirstComponentProfile);


  /**
   * <p>
   * Getter method for the COM property "SecondComponentProfile"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611071490) //= 0x60070002. The runtime will prefer the VTID if present
  @VTID(26)
  Reference secondComponentProfile();


  /**
   * <p>
   * Setter method for the COM property "SecondComponentProfile"
   * </p>
   * @param oSecondComponentProfile Mandatory Reference parameter.
   */

  @DISPID(1611071490) //= 0x60070002. The runtime will prefer the VTID if present
  @VTID(27)
  void secondComponentProfile(
    Reference oSecondComponentProfile);


  /**
   * <p>
   * Getter method for the COM property "FirstComponentDirection"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611071492) //= 0x60070004. The runtime will prefer the VTID if present
  @VTID(28)
  Reference firstComponentDirection();


  /**
   * <p>
   * Setter method for the COM property "FirstComponentDirection"
   * </p>
   * @param oFirstComponentDirection Mandatory Reference parameter.
   */

  @DISPID(1611071492) //= 0x60070004. The runtime will prefer the VTID if present
  @VTID(29)
  void firstComponentDirection(
    Reference oFirstComponentDirection);


  /**
   * <p>
   * Getter method for the COM property "SecondComponentDirection"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611071494) //= 0x60070006. The runtime will prefer the VTID if present
  @VTID(30)
  Reference secondComponentDirection();


  /**
   * <p>
   * Setter method for the COM property "SecondComponentDirection"
   * </p>
   * @param oSecondComponentDirection Mandatory Reference parameter.
   */

  @DISPID(1611071494) //= 0x60070006. The runtime will prefer the VTID if present
  @VTID(31)
  void secondComponentDirection(
    Reference oSecondComponentDirection);


  // Properties:
}
