import com4j.*;

@IID("{49EC1846-E827-11D2-9265-006094B9A462}")
public interface HybridBody extends AnyObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "GeometricElements"
   * </p>
   * @return  Returns a value of type GeometricElements
   */

  @DISPID(1610940416) //= 0x60050000. The runtime will prefer the VTID if present
  @VTID(22)
  GeometricElements geometricElements();


  /**
   * <p>
   * Getter method for the COM property "HybridShapes"
   * </p>
   * @return  Returns a value of type HybridShapes
   */

  @DISPID(1610940417) //= 0x60050001. The runtime will prefer the VTID if present
  @VTID(23)
  HybridShapes hybridShapes();


  /**
   * <p>
   * Getter method for the COM property "Bodies"
   * </p>
   * @return  Returns a value of type Bodies
   */

  @DISPID(1610940418) //= 0x60050002. The runtime will prefer the VTID if present
  @VTID(24)
  Bodies bodies();


  /**
   * <p>
   * Getter method for the COM property "HybridBodies"
   * </p>
   * @return  Returns a value of type HybridBodies
   */

  @DISPID(1610940419) //= 0x60050003. The runtime will prefer the VTID if present
  @VTID(25)
  HybridBodies hybridBodies();


  /**
   * <p>
   * Getter method for the COM property "HybridSketches"
   * </p>
   * @return  Returns a value of type Sketches
   */

  @DISPID(1610940420) //= 0x60050004. The runtime will prefer the VTID if present
  @VTID(26)
  Sketches hybridSketches();


  /**
   * @param iHybridShape Mandatory HybridShape parameter.
   */

  @DISPID(1610940421) //= 0x60050005. The runtime will prefer the VTID if present
  @VTID(27)
  void appendHybridShape(
    HybridShape iHybridShape);


  // Properties:
}
