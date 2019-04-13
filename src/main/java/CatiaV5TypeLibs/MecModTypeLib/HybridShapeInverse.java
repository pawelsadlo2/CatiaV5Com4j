package CatiaV5TypeLibs.MecModTypeLib;
import CatiaV5TypeLibs.KnowledgewareTypeLib.*;
import CatiaV5TypeLibs.InfTypeLib.*;

import com4j.*;

@IID("{8CCF2FBC-8C10-0000-0280-020E60000000}")
public interface HybridShapeInverse extends HybridShape {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Element"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(25)
  Reference element();


  /**
   * <p>
   * Setter method for the COM property "Element"
   * </p>
   * @param oElem Mandatory Reference parameter.
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(26)
  void element(
    Reference oElem);


  /**
   * <p>
   * Getter method for the COM property "Orientation"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611005954) //= 0x60060002. The runtime will prefer the VTID if present
  @VTID(27)
  int orientation();


  /**
   * <p>
   * Setter method for the COM property "Orientation"
   * </p>
   * @param oOrientation Mandatory int parameter.
   */

  @DISPID(1611005954) //= 0x60060002. The runtime will prefer the VTID if present
  @VTID(28)
  void orientation(
    int oOrientation);


  // Properties:
}
