package CatiaV5TypeLibs.PartItfTypeLib;

import com4j.DISPID;
import com4j.IID;
import com4j.VTID;
import CatiaV5TypeLibs.InfItfTypeLib.*;

@IID("{C9090BFC-5B42-11D1-A124-080009DCA4AE}")
public interface ProductDocument extends Document {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "CatiaV5TypeLibs.PartItfTypeLib.Product"
   * </p>
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.Product
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(46)
  Product product();


  // Properties:
}
