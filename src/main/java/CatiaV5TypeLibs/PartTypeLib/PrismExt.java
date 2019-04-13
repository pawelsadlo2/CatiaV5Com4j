package CatiaV5TypeLibs.PartTypeLib;
import CatiaV5TypeLibs.InfTypeLib.*;
import CatiaV5TypeLibs.MecModTypeLib.*;
import CatiaV5TypeLibs.KnowledgewareTypeLib.*;

import com4j.*;

@IID("{80360F84-153A-11DF-ABF3-001111CA785B}")
public interface PrismExt extends AnyObject {
  // Methods:
  /**
   * @param iPrismObj Mandatory Reference parameter.
   * @return  Returns a value of type Reference
   */

  @DISPID(1610940416) //= 0x60050000. The runtime will prefer the VTID if present
  @VTID(22)
  Reference getProfileElement(
    Reference iPrismObj);


  // Properties:
}
