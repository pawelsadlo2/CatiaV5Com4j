package CatiaV5TypeLibs.InfItfTypeLib;

import com4j.*;

@IID("{80BA53E7-7FCB-0000-0280-030BA6000000}")
public interface Viewers extends Collection {
  // Methods:
  /**
   * @param iIndex Mandatory int parameter.
   * @return  Returns a value of type Viewer
   */

  @DISPID(1610940416) //= 0x60050000. The runtime will prefer the VTID if present
  @VTID(23)
  Viewer item(
    int iIndex);


  // Properties:
}
