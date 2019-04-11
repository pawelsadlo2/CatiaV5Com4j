package CatiaV5TypeLibs.PartItfTypeLib;

import com4j.DISPID;
import com4j.IID;
import com4j.VTID;
import CatiaV5TypeLibs.InfItfTypeLib.*;

@IID("{8859F497-6108-11D1-A27D-0000F87546FD}")
public interface Fillet extends DressUpShape {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "FilletBoundaryRelimitation"
   * </p>
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.CatFilletBoundaryRelimitation
   */

  @DISPID(1611071488) //= 0x60070000. The runtime will prefer the VTID if present
  @VTID(22)
  CatFilletBoundaryRelimitation filletBoundaryRelimitation();


  /**
   * <p>
   * Setter method for the COM property "FilletBoundaryRelimitation"
   * </p>
   * @param oRelimitation Mandatory CatiaV5TypeLibs.PartItfTypeLib.CatFilletBoundaryRelimitation parameter.
   */

  @DISPID(1611071488) //= 0x60070000. The runtime will prefer the VTID if present
  @VTID(23)
  void filletBoundaryRelimitation(
    CatFilletBoundaryRelimitation oRelimitation);


  /**
   * <p>
   * Getter method for the COM property "FilletTrimSupport"
   * </p>
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.CatFilletTrimSupport
   */

  @DISPID(1611071490) //= 0x60070002. The runtime will prefer the VTID if present
  @VTID(24)
  CatFilletTrimSupport filletTrimSupport();


  /**
   * <p>
   * Setter method for the COM property "FilletTrimSupport"
   * </p>
   * @param oRelimitation Mandatory CatiaV5TypeLibs.PartItfTypeLib.CatFilletTrimSupport parameter.
   */

  @DISPID(1611071490) //= 0x60070002. The runtime will prefer the VTID if present
  @VTID(25)
  void filletTrimSupport(
    CatFilletTrimSupport oRelimitation);


  // Properties:
}
