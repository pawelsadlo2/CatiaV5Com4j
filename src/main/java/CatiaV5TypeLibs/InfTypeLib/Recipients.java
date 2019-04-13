package CatiaV5TypeLibs.InfTypeLib;

import com4j.*;

@IID("{0267A658-2949-11D3-B051-006094EB7CE3}")
public interface Recipients extends AnyObject {
  // Methods:
  /**
   * @param iRecipient Mandatory Holder<java.lang.String> parameter.
   */

  @DISPID(1610940416) //= 0x60050000. The runtime will prefer the VTID if present
  @VTID(22)
  void add(
    Holder<java.lang.String> iRecipient);


  /**
   */

  @DISPID(1610940417) //= 0x60050001. The runtime will prefer the VTID if present
  @VTID(23)
  void removeAll();


  // Properties:
}
