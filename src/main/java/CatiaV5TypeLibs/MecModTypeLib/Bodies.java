package CatiaV5TypeLibs.MecModTypeLib;
import CatiaV5TypeLibs.InfTypeLib.*;
import CatiaV5TypeLibs.MecModTypeLib.*;
import CatiaV5TypeLibs.KnowledgewareTypeLib.*;

import com4j.*;

@IID("{EB50B19A-3B2D-11D1-A26C-0000F87546FD}")
public interface Bodies extends Collection {
  // Methods:
  /**
   * @return  Returns a value of type Body
   */

  @DISPID(1610940416) //= 0x60050000. The runtime will prefer the VTID if present
  @VTID(23)
  Body add();


  /**
   * @param iIndex Mandatory java.lang.Object parameter.
   * @return  Returns a value of type Body
   */

  @DISPID(1610940417) //= 0x60050001. The runtime will prefer the VTID if present
  @VTID(24)
  Body item(
    java.lang.Object iIndex);


  // Properties:
}
