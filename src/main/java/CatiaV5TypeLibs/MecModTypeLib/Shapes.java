package CatiaV5TypeLibs.MecModTypeLib;
import CatiaV5TypeLibs.InfTypeLib.*;
import CatiaV5TypeLibs.MecModTypeLib.*;
import CatiaV5TypeLibs.KnowledgewareTypeLib.*;

import com4j.*;

@IID("{4865577D-3FF7-11D1-A26C-0000F87546FD}")
public interface Shapes extends Collection {
  // Methods:
  /**
   * @param iIndex Mandatory java.lang.Object parameter.
   * @return  Returns a value of type Shape
   */

  @DISPID(1610940416) //= 0x60050000. The runtime will prefer the VTID if present
  @VTID(23)
  Shape item(
    java.lang.Object iIndex);


  /**
   * @param iLabel Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type Boundary
   */

  @DISPID(1610940417) //= 0x60050001. The runtime will prefer the VTID if present
  @VTID(24)
  Boundary getBoundary(
    Holder<java.lang.String> iLabel);


  // Properties:
}
