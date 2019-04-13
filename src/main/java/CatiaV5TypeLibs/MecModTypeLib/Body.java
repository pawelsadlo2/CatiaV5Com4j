package CatiaV5TypeLibs.MecModTypeLib;
import CatiaV5TypeLibs.KnowledgewareTypeLib.*;

import CatiaV5TypeLibs.InfTypeLib.*;
import com4j.*;

@IID("{F5303B8F-39AD-11D1-A26C-0000F87546FD}")
public interface Body extends AnyObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "CatiaV5TypeLibs.PartItfTypeLib.Shapes"
   * </p>
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.Shapes
   */

  @DISPID(1610940416) //= 0x60050000. The runtime will prefer the VTID if present
  @VTID(22)
  Shapes shapes();


  /**
   * <p>
   * Getter method for the COM property "CatiaV5TypeLibs.PartItfTypeLib.Sketches"
   * </p>
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.Sketches
   */

  @DISPID(1610940417) //= 0x60050001. The runtime will prefer the VTID if present
  @VTID(23)
  Sketches sketches();


  /**
   * <p>
   * Getter method for the COM property "CatiaV5TypeLibs.PartItfTypeLib.HybridBodies"
   * </p>
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.HybridBodies
   */

  @DISPID(1610940418) //= 0x60050002. The runtime will prefer the VTID if present
  @VTID(24)
  HybridBodies hybridBodies();


  /**
   * <p>
   * Getter method for the COM property "InBooleanOperation"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610940419) //= 0x60050003. The runtime will prefer the VTID if present
  @VTID(25)
  boolean inBooleanOperation();


  /**
   * <p>
   * Getter method for the COM property "CatiaV5TypeLibs.PartItfTypeLib.HybridShapes"
   * </p>
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.HybridShapes
   */

  @DISPID(1610940420) //= 0x60050004. The runtime will prefer the VTID if present
  @VTID(26)
  HybridShapes hybridShapes();


  /**
   * <p>
   * Getter method for the COM property "CatiaV5TypeLibs.PartItfTypeLib.OrderedGeometricalSets"
   * </p>
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.OrderedGeometricalSets
   */

  @DISPID(1610940421) //= 0x60050005. The runtime will prefer the VTID if present
  @VTID(27)
  OrderedGeometricalSets orderedGeometricalSets();


  /**
   * @param iHybridShape Mandatory CatiaV5TypeLibs.PartItfTypeLib.HybridShape parameter.
   */

  @DISPID(1610940422) //= 0x60050006. The runtime will prefer the VTID if present
  @VTID(28)
  void insertHybridShape(
    HybridShape iHybridShape);


  // Properties:
}
