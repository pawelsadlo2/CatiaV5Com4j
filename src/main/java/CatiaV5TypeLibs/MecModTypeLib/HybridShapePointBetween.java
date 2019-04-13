package CatiaV5TypeLibs.MecModTypeLib;
import CatiaV5TypeLibs.KnowledgewareTypeLib.*;

import CatiaV5TypeLibs.InfTypeLib.*;
import com4j.*;

@IID("{44A43790-EA99-11D3-84EF-0000863E1BCE}")
public interface HybridShapePointBetween extends Point {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "FirstPoint"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611071488) //= 0x60070000. The runtime will prefer the VTID if present
  @VTID(27)
  Reference firstPoint();


  /**
   * <p>
   * Setter method for the COM property "FirstPoint"
   * </p>
   * @param oPt1 Mandatory Reference parameter.
   */

  @DISPID(1611071488) //= 0x60070000. The runtime will prefer the VTID if present
  @VTID(28)
  void firstPoint(
    Reference oPt1);


  /**
   * <p>
   * Getter method for the COM property "SecondPoint"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611071490) //= 0x60070002. The runtime will prefer the VTID if present
  @VTID(29)
  Reference secondPoint();


  /**
   * <p>
   * Setter method for the COM property "SecondPoint"
   * </p>
   * @param oPt2 Mandatory Reference parameter.
   */

  @DISPID(1611071490) //= 0x60070002. The runtime will prefer the VTID if present
  @VTID(30)
  void secondPoint(
    Reference oPt2);


  /**
   * <p>
   * Getter method for the COM property "Ratio"
   * </p>
   * @return  Returns a value of type RealParam
   */

  @DISPID(1611071492) //= 0x60070004. The runtime will prefer the VTID if present
  @VTID(31)
  RealParam ratio();


  /**
   * <p>
   * Getter method for the COM property "Orientation"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611071493) //= 0x60070005. The runtime will prefer the VTID if present
  @VTID(32)
  int orientation();


  /**
   * <p>
   * Setter method for the COM property "Orientation"
   * </p>
   * @param oOrientation Mandatory int parameter.
   */

  @DISPID(1611071493) //= 0x60070005. The runtime will prefer the VTID if present
  @VTID(33)
  void orientation(
    int oOrientation);


  /**
   * <p>
   * Getter method for the COM property "Support"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611071495) //= 0x60070007. The runtime will prefer the VTID if present
  @VTID(34)
  Reference support();


  /**
   * <p>
   * Setter method for the COM property "Support"
   * </p>
   * @param oSupport Mandatory Reference parameter.
   */

  @DISPID(1611071495) //= 0x60070007. The runtime will prefer the VTID if present
  @VTID(35)
  void support(
    Reference oSupport);


  // Properties:
}
