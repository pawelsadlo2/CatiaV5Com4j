package CatiaV5TypeLibs.MecModTypeLib;
import CatiaV5TypeLibs.InfTypeLib.*;

import com4j.*;

@IID("{89D76624-5C18-0000-0280-020E60000000}")
public interface HybridShapePlaneMean extends Plane {
  // Methods:
  /**
   * @param iPassingPoint Mandatory Reference parameter.
   */

  @DISPID(1611071488) //= 0x60070000. The runtime will prefer the VTID if present
  @VTID(35)
  void addPoint(
    Reference iPassingPoint);


  /**
   * @param iRank Mandatory int parameter.
   * @return  Returns a value of type Reference
   */

  @DISPID(1611071489) //= 0x60070001. The runtime will prefer the VTID if present
  @VTID(36)
  Reference getPoint(
    int iRank);


  /**
   * @param iRank Mandatory int parameter.
   */

  @DISPID(1611071490) //= 0x60070002. The runtime will prefer the VTID if present
  @VTID(37)
  void removeElement(
    int iRank);


  /**
   * @return  Returns a value of type int
   */

  @DISPID(1611071491) //= 0x60070003. The runtime will prefer the VTID if present
  @VTID(38)
  int getSize();


  /**
   * @param iPoint Mandatory Reference parameter.
   * @return  Returns a value of type int
   */

  @DISPID(1611071492) //= 0x60070004. The runtime will prefer the VTID if present
  @VTID(39)
  int getPos(
    Reference iPoint);


  /**
   */

  @DISPID(1611071493) //= 0x60070005. The runtime will prefer the VTID if present
  @VTID(40)
  void removeAll();


  /**
   * @param iPoint Mandatory Reference parameter.
   * @param iPos Mandatory int parameter.
   */

  @DISPID(1611071494) //= 0x60070006. The runtime will prefer the VTID if present
  @VTID(41)
  void replacePointAtPosition(
    Reference iPoint,
    int iPos);


  // Properties:
}
