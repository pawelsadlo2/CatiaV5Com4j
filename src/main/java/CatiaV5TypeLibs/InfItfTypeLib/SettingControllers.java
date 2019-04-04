package CatiaV5TypeLibs.InfItfTypeLib;

import com4j.*;

@IID("{A66E17F5-132A-0000-0280-03110E000000}")
public interface SettingControllers extends Collection {
  // Methods:
  /**
   * @param iIndex Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type SettingController
   */

  @DISPID(1610940416) //= 0x60050000. The runtime will prefer the VTID if present
  @VTID(23)
  SettingController item(
    Holder<java.lang.String> iIndex);


  // Properties:
}
