import CatiaV5TypeLibs.InfTypeLib.*;
import com4j.*;

@IID("{8C89B282-64F5-0000-0280-020E60000000}")
public interface HybridShapeNear extends HybridShape {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "MultipleSolution"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(25)
  Reference multipleSolution();


  /**
   * <p>
   * Setter method for the COM property "MultipleSolution"
   * </p>
   * @param oMultipleSolution Mandatory Reference parameter.
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(26)
  void multipleSolution(
    Reference oMultipleSolution);


  /**
   * <p>
   * Getter method for the COM property "ReferenceElement"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611005954) //= 0x60060002. The runtime will prefer the VTID if present
  @VTID(27)
  Reference referenceElement();


  /**
   * <p>
   * Setter method for the COM property "ReferenceElement"
   * </p>
   * @param oRefElem Mandatory Reference parameter.
   */

  @DISPID(1611005954) //= 0x60060002. The runtime will prefer the VTID if present
  @VTID(28)
  void referenceElement(
    Reference oRefElem);


  // Properties:
}
