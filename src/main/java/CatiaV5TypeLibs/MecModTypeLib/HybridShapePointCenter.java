import CatiaV5TypeLibs.InfTypeLib.*;
import com4j.*;

@IID("{89D7663B-8E11-0000-0280-020E60000000}")
public interface HybridShapePointCenter extends Point {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Element"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611071488) //= 0x60070000. The runtime will prefer the VTID if present
  @VTID(27)
  Reference element();


  /**
   * <p>
   * Setter method for the COM property "Element"
   * </p>
   * @param oElement Mandatory Reference parameter.
   */

  @DISPID(1611071488) //= 0x60070000. The runtime will prefer the VTID if present
  @VTID(28)
  void element(
    Reference oElement);


  // Properties:
}
