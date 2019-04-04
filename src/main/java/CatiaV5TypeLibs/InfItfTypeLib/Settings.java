package CatiaV5TypeLibs.InfItfTypeLib;

import com4j.*;

@IID("{00855D50-ABC1-11D6-BE9F-000347D06CA1}")
public interface Settings extends Collection {
  // Methods:
  /**
   * @param iIndex Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type Setting
   */

  @DISPID(1610940416) //= 0x60050000. The runtime will prefer the VTID if present
  @VTID(23)
  Setting item(
    Holder<java.lang.String> iIndex);


  // Properties:
}
