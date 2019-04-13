package CatiaV5TypeLibs.MecModTypeLib;
import CatiaV5TypeLibs.KnowledgewareTypeLib.*;
import CatiaV5TypeLibs.InfTypeLib.*;

import com4j.*;

@IID("{C146DF2A-8E08-11D3-859A-00108301432B}")
public interface Solid extends Shape {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "SourceElement"
   * </p>
   * @return  Returns a value of type AnyObject
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(22)
  AnyObject sourceElement();


  /**
   * <p>
   * Getter method for the COM property "Move"
   * </p>
   * @return  Returns a value of type Move
   */

  @DISPID(1611005953) //= 0x60060001. The runtime will prefer the VTID if present
  @VTID(23)
  Move move();


  /**
   * <p>
   * Getter method for the COM property "SourceProduct"
   * </p>
   * @return  Returns a value of type AnyObject
   */

  @DISPID(1611005954) //= 0x60060002. The runtime will prefer the VTID if present
  @VTID(24)
  AnyObject sourceProduct();


  // Properties:
}
