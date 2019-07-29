package CatiaV5TypeLibs.MecModTypeLib;
import CatiaV5TypeLibs.InfTypeLib.*;
import CatiaV5TypeLibs.MecModTypeLib.*;
import CatiaV5TypeLibs.KnowledgewareTypeLib.*;

import com4j.*;

@IID("{837D2830-41D2-11D4-9EE1-00508B5FE56F}")
public interface FixTogethers extends Collection {
  // Methods:
  /**
   * @return  Returns a value of type FixTogether
   */

  @DISPID(1610940416) //= 0x60050000. The runtime will prefer the VTID if present
  @VTID(23)
  FixTogether add();


  /**
   * @param iIndex Mandatory java.lang.Object parameter.
   * @return  Returns a value of type FixTogether
   */

  @DISPID(1610940417) //= 0x60050001. The runtime will prefer the VTID if present
  @VTID(24)
  FixTogether item(
    java.lang.Object iIndex);


  /**
   * @param iIndex Mandatory java.lang.Object parameter.
   */

  @DISPID(1610940418) //= 0x60050002. The runtime will prefer the VTID if present
  @VTID(25)
  void remove(
    java.lang.Object iIndex);


  // Properties:
}
