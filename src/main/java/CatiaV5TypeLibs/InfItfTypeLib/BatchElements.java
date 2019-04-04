package CatiaV5TypeLibs.InfItfTypeLib;

import com4j.*;

@IID("{CE7BACA0-FB45-11D3-9EE1-00508B675233}")
public interface BatchElements extends Collection {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "ParentElement"
   * </p>
   * @return  Returns a value of type BatchElement
   */

  @DISPID(1610940416) //= 0x60050000. The runtime will prefer the VTID if present
  @VTID(23)
  BatchElement parentElement();


  /**
   * @param iNumber Mandatory int parameter.
   * @return  Returns a value of type BatchElement
   */

  @DISPID(1610940417) //= 0x60050001. The runtime will prefer the VTID if present
  @VTID(24)
  BatchElement item(
    int iNumber);


  // Properties:
}
