package CatiaV5TypeLibs.PartItfTypeLib;

import com4j.DISPID;
import com4j.IID;
import com4j.VTID;
import CatiaV5TypeLibs.InfItfTypeLib.*;

@IID("{DD507FE2-A8F2-11D5-A39E-00D0B7AC63BE}")
public interface Units extends Collection {
  // Methods:
  /**
   * @param iIndex Mandatory java.lang.Object parameter.
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.Unit
   */

  @DISPID(1610940416) //= 0x60050000. The runtime will prefer the VTID if present
  @VTID(23)
  Unit item(
    java.lang.Object iIndex);


  // Properties:
}
