package CatiaV5TypeLibs.HybridShapeTypeLib;
import CatiaV5TypeLibs.InfTypeLib.*;
import CatiaV5TypeLibs.MecModTypeLib.*;
import CatiaV5TypeLibs.KnowledgewareTypeLib.*;

import com4j.*;

@IID("{818C8B33-806B-0000-0280-030D3B000000}")
public interface PartDocument extends Document {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Part"
   * </p>
   * @return  Returns a value of type Part
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(46)
  Part part();


  /**
   * <p>
   * Getter method for the COM property "Product"
   * </p>
   * @return  Returns a value of type Product
   */

  @DISPID(1611005953) //= 0x60060001. The runtime will prefer the VTID if present
  @VTID(47)
  Product product();


  // Properties:
}
