package CatiaV5TypeLibs.MecModTypeLib;
import CatiaV5TypeLibs.InfTypeLib.*;

import com4j.*;

@IID("{89D76611-E9C8-0000-0280-020E60000000}")
public interface HybridShapePlane2Lines extends Plane {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "First"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611071488) //= 0x60070000. The runtime will prefer the VTID if present
  @VTID(35)
  Reference first();


  /**
   * <p>
   * Setter method for the COM property "First"
   * </p>
   * @param oLine1 Mandatory Reference parameter.
   */

  @DISPID(1611071488) //= 0x60070000. The runtime will prefer the VTID if present
  @VTID(36)
  void first(
    Reference oLine1);


  /**
   * <p>
   * Getter method for the COM property "Second"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611071490) //= 0x60070002. The runtime will prefer the VTID if present
  @VTID(37)
  Reference second();


  /**
   * <p>
   * Setter method for the COM property "Second"
   * </p>
   * @param oLine2 Mandatory Reference parameter.
   */

  @DISPID(1611071490) //= 0x60070002. The runtime will prefer the VTID if present
  @VTID(38)
  void second(
    Reference oLine2);


  /**
   * <p>
   * Setter method for the COM property "ForbidNonCoplanarLines"
   * </p>
   * @param oCoplanarLines Mandatory boolean parameter.
   */

  @DISPID(1611071492) //= 0x60070004. The runtime will prefer the VTID if present
  @VTID(39)
  void forbidNonCoplanarLines(
    boolean oCoplanarLines);


  /**
   * <p>
   * Getter method for the COM property "ForbidNonCoplanarLines"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1611071492) //= 0x60070004. The runtime will prefer the VTID if present
  @VTID(40)
  boolean forbidNonCoplanarLines();


  // Properties:
}
