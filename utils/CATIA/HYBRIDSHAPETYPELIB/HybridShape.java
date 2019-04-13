import com4j.*;

@IID("{8964042E-D4FD-0000-0280-020E60000000}")
public interface HybridShape extends AnyObject {
  // Methods:
  /**
   */

  @DISPID(1610940416) //= 0x60050000. The runtime will prefer the VTID if present
  @VTID(22)
  void compute();


  /**
   * @param iHybridShape Mandatory HybridShape parameter.
   */

  @DISPID(1610940417) //= 0x60050001. The runtime will prefer the VTID if present
  @VTID(23)
  void appendHybridShape(
    HybridShape iHybridShape);


  /**
   * <p>
   * Getter method for the COM property "Thickness"
   * </p>
   * @return  Returns a value of type HybridShape
   */

  @DISPID(1610940418) //= 0x60050002. The runtime will prefer the VTID if present
  @VTID(24)
  HybridShape thickness();


  // Properties:
}
