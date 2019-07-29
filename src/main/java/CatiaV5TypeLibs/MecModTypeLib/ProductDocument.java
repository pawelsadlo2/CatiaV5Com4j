package CatiaV5TypeLibs.MecModTypeLib;
import CatiaV5TypeLibs.InfTypeLib.*;
import CatiaV5TypeLibs.MecModTypeLib.*;
import CatiaV5TypeLibs.KnowledgewareTypeLib.*;

import com4j.*;

@IID("{C9090BFC-5B42-11D1-A124-080009DCA4AE}")
public interface ProductDocument extends Document {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Product"
   * </p>
   * @return  Returns a value of type Product
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(46)
  Product product();


  // Properties:
}
