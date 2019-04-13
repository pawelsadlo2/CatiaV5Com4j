package CatiaV5TypeLibs.HybridShapeTypeLib;
import CatiaV5TypeLibs.InfTypeLib.*;
import CatiaV5TypeLibs.MecModTypeLib.*;
import CatiaV5TypeLibs.KnowledgewareTypeLib.*;

import com4j.*;

@IID("{89D76652-BE79-0000-0280-020E60000000}")
public interface HybridShapePointTangent extends Point {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Curve"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611071488) //= 0x60070000. The runtime will prefer the VTID if present
  @VTID(27)
  Reference curve();


  /**
   * <p>
   * Setter method for the COM property "Curve"
   * </p>
   * @param oCurve Mandatory Reference parameter.
   */

  @DISPID(1611071488) //= 0x60070000. The runtime will prefer the VTID if present
  @VTID(28)
  void curve(
    Reference oCurve);


  /**
   * <p>
   * Getter method for the COM property "Direction"
   * </p>
   * @return  Returns a value of type HybridShapeDirection
   */

  @DISPID(1611071490) //= 0x60070002. The runtime will prefer the VTID if present
  @VTID(29)
  HybridShapeDirection direction();


  /**
   * <p>
   * Setter method for the COM property "Direction"
   * </p>
   * @param oDirection Mandatory HybridShapeDirection parameter.
   */

  @DISPID(1611071490) //= 0x60070002. The runtime will prefer the VTID if present
  @VTID(30)
  void direction(
    HybridShapeDirection oDirection);


  // Properties:
}
