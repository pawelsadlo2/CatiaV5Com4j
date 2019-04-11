package CatiaV5TypeLibs.PartItfTypeLib;

import com4j.DISPID;
import com4j.IID;
import com4j.VTID;
import CatiaV5TypeLibs.InfItfTypeLib.*;

@IID("{6ECEC8A4-6A86-11D1-A280-0000F87546FD}")
public interface GeometricElements extends Collection {
  // Methods:
  /**
   * @param iIndex Mandatory java.lang.Object parameter.
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.GeometricElement
   */

  @DISPID(1610940416) //= 0x60050000. The runtime will prefer the VTID if present
  @VTID(23)
  GeometricElement item(
    java.lang.Object iIndex);


  // Properties:
}
