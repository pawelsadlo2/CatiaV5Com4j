package CatiaV5TypeLibs.PartItfTypeLib;

import com4j.DISPID;
import com4j.IID;
import com4j.VTID;
import CatiaV5TypeLibs.InfItfTypeLib.*;

@IID("{003F3094-60B9-11D1-A27D-0000F87546FD}")
public interface Draft extends DressUpShape {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Mode"
   * </p>
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.CatDraftMode
   */

  @DISPID(1611071488) //= 0x60070000. The runtime will prefer the VTID if present
  @VTID(22)
  CatDraftMode mode();


  /**
   * <p>
   * Setter method for the COM property "Mode"
   * </p>
   * @param oMode Mandatory CatiaV5TypeLibs.PartItfTypeLib.CatDraftMode parameter.
   */

  @DISPID(1611071488) //= 0x60070000. The runtime will prefer the VTID if present
  @VTID(23)
  void mode(
    CatDraftMode oMode);


  /**
   * <p>
   * Getter method for the COM property "PartingElement"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611071490) //= 0x60070002. The runtime will prefer the VTID if present
  @VTID(24)
  Reference partingElement();


  /**
   * <p>
   * Setter method for the COM property "PartingElement"
   * </p>
   * @param oPartingElement Mandatory Reference parameter.
   */

  @DISPID(1611071490) //= 0x60070002. The runtime will prefer the VTID if present
  @VTID(25)
  void partingElement(
    Reference oPartingElement);


  /**
   * <p>
   * Getter method for the COM property "CatiaV5TypeLibs.PartItfTypeLib.DraftDomains"
   * </p>
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.DraftDomains
   */

  @DISPID(1611071492) //= 0x60070004. The runtime will prefer the VTID if present
  @VTID(26)
  DraftDomains draftDomains();


  // Properties:
}
