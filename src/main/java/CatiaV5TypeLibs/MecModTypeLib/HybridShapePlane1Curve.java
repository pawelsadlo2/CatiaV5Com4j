package CatiaV5TypeLibs.MecModTypeLib;
import CatiaV5TypeLibs.KnowledgewareTypeLib.*;
import CatiaV5TypeLibs.InfTypeLib.*;

import com4j.*;

@IID("{89D76608-1D2B-0000-0280-020E60000000}")
public interface HybridShapePlane1Curve extends Plane {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Curve"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611071488) //= 0x60070000. The runtime will prefer the VTID if present
  @VTID(35)
  Reference curve();


  /**
   * <p>
   * Setter method for the COM property "Curve"
   * </p>
   * @param oCurve Mandatory Reference parameter.
   */

  @DISPID(1611071488) //= 0x60070000. The runtime will prefer the VTID if present
  @VTID(36)
  void curve(
    Reference oCurve);


  // Properties:
}
