package CatiaV5TypeLibs.HybridShapeTypeLib;
import CatiaV5TypeLibs.InfTypeLib.*;
import CatiaV5TypeLibs.MecModTypeLib.*;
import CatiaV5TypeLibs.KnowledgewareTypeLib.*;

import com4j.*;

@IID("{336FCB1B-6A84-11D1-A280-0000F87546FD}")
public interface OriginElements extends AnyObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "PlaneXY"
   * </p>
   * @return  Returns a value of type AnyObject
   */

  @DISPID(1610940416) //= 0x60050000. The runtime will prefer the VTID if present
  @VTID(22)
  AnyObject planeXY();


  /**
   * <p>
   * Getter method for the COM property "PlaneYZ"
   * </p>
   * @return  Returns a value of type AnyObject
   */

  @DISPID(1610940417) //= 0x60050001. The runtime will prefer the VTID if present
  @VTID(23)
  AnyObject planeYZ();


  /**
   * <p>
   * Getter method for the COM property "PlaneZX"
   * </p>
   * @return  Returns a value of type AnyObject
   */

  @DISPID(1610940418) //= 0x60050002. The runtime will prefer the VTID if present
  @VTID(24)
  AnyObject planeZX();


  // Properties:
}
