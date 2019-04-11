package CatiaV5TypeLibs.PartItfTypeLib;

import com4j.DISPID;
import com4j.IID;
import com4j.VTID;
import CatiaV5TypeLibs.InfItfTypeLib.*;

@IID("{7CEF791F-60BD-11D1-A27D-0000F87546FD}")
public interface DraftDomains extends Collection {
  // Methods:
  /**
   * @param iIndex Mandatory java.lang.Object parameter.
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.DraftDomain
   */

  @DISPID(1610940416) //= 0x60050000. The runtime will prefer the VTID if present
  @VTID(23)
  DraftDomain item(
    java.lang.Object iIndex);


  // Properties:
}
