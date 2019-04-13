package CatiaV5TypeLibs.MecModTypeLib;
import CatiaV5TypeLibs.InfTypeLib.*;

import com4j.*;

@IID("{89D7662D-F4A3-0000-0280-020E60000000}")
public interface HybridShapePlaneOffset extends Plane {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Plane"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611071488) //= 0x60070000. The runtime will prefer the VTID if present
  @VTID(35)
  Reference plane();


  /**
   * <p>
   * Setter method for the COM property "Plane"
   * </p>
   * @param oPlane Mandatory Reference parameter.
   */

  @DISPID(1611071488) //= 0x60070000. The runtime will prefer the VTID if present
  @VTID(36)
  void plane(
    Reference oPlane);


  /**
   * <p>
   * Getter method for the COM property "Offset"
   * </p>
   * @return  Returns a value of type Length
   */

  @DISPID(1611071490) //= 0x60070002. The runtime will prefer the VTID if present
  @VTID(37)
  Length offset();


  /**
   * <p>
   * Getter method for the COM property "Orientation"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611071491) //= 0x60070003. The runtime will prefer the VTID if present
  @VTID(38)
  int orientation();


  /**
   * <p>
   * Setter method for the COM property "Orientation"
   * </p>
   * @param oOrientation Mandatory int parameter.
   */

  @DISPID(1611071491) //= 0x60070003. The runtime will prefer the VTID if present
  @VTID(39)
  void orientation(
    int oOrientation);


  // Properties:
}
