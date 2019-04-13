import CatiaV5TypeLibs.InfTypeLib.*;
import com4j.*;

@IID("{818C8B33-806B-0000-0280-030D3B000000}")
public interface PartDocument extends Document {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "CatiaV5TypeLibs.PartItfTypeLib.Part"
   * </p>
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.Part
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(46)
  Part part();


  /**
   * <p>
   * Getter method for the COM property "CatiaV5TypeLibs.PartItfTypeLib.Product"
   * </p>
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.Product
   */

  @DISPID(1611005953) //= 0x60060001. The runtime will prefer the VTID if present
  @VTID(47)
  Product product();


  // Properties:
}
