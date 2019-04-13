package CatiaV5TypeLibs.PartTypeLib;
import CatiaV5TypeLibs.InfTypeLib.*;
import CatiaV5TypeLibs.MecModTypeLib.*;
import CatiaV5TypeLibs.KnowledgewareTypeLib.*;

import com4j.*;

@IID("{005930B2-6A08-4BBA-AC77-9620A242C9C1}")
public interface OrderedGeometricalSet extends AnyObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "CatiaV5TypeLibs.PartItfTypeLib.HybridShapes"
   * </p>
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.HybridShapes
   */

  @DISPID(1610940416) //= 0x60050000. The runtime will prefer the VTID if present
  @VTID(22)
  HybridShapes hybridShapes();


  /**
   * <p>
   * Getter method for the COM property "CatiaV5TypeLibs.PartItfTypeLib.Bodies"
   * </p>
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.Bodies
   */

  @DISPID(1610940417) //= 0x60050001. The runtime will prefer the VTID if present
  @VTID(23)
  Bodies bodies();


  /**
   * <p>
   * Getter method for the COM property "CatiaV5TypeLibs.PartItfTypeLib.OrderedGeometricalSets"
   * </p>
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.OrderedGeometricalSets
   */

  @DISPID(1610940418) //= 0x60050002. The runtime will prefer the VTID if present
  @VTID(24)
  OrderedGeometricalSets orderedGeometricalSets();


  /**
   * <p>
   * Getter method for the COM property "OrderedSketches"
   * </p>
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.Sketches
   */

  @DISPID(1610940419) //= 0x60050003. The runtime will prefer the VTID if present
  @VTID(25)
  Sketches orderedSketches();


  /**
   * @param iHybridShape Mandatory CatiaV5TypeLibs.PartItfTypeLib.HybridShape parameter.
   */

  @DISPID(1610940420) //= 0x60050004. The runtime will prefer the VTID if present
  @VTID(26)
  void insertHybridShape(
    HybridShape iHybridShape);


  // Properties:
}
