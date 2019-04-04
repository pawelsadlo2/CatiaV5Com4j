package CatiaV5TypeLibs.InfItfTypeLib;

import com4j.*;

@IID("{3E2466D0-C450-11D3-B85C-0008C7191EA2}")
public interface Folders extends Collection {
  // Methods:
  /**
   * @param iNumber Mandatory int parameter.
   * @return  Returns a value of type Folder
   */

  @DISPID(1610940416) //= 0x60050000. The runtime will prefer the VTID if present
  @VTID(23)
  Folder item(
    int iNumber);


  // Properties:
}
