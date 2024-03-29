package CatiaV5TypeLibs.PartTypeLib;
import CatiaV5TypeLibs.InfTypeLib.*;
import CatiaV5TypeLibs.MecModTypeLib.*;
import CatiaV5TypeLibs.KnowledgewareTypeLib.*;

import com4j.*;

@IID("{B81CB029-65A0-11D1-A27F-0000F87546FD}")
public interface Shell extends DressUpShape {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "InternalThickness"
   * </p>
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.Length
   */

  @DISPID(1611071488) //= 0x60070000. The runtime will prefer the VTID if present
  @VTID(22)
  Length internalThickness();


  /**
   * <p>
   * Getter method for the COM property "ExternalThickness"
   * </p>
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.Length
   */

  @DISPID(1611071489) //= 0x60070001. The runtime will prefer the VTID if present
  @VTID(23)
  Length externalThickness();


  /**
   * <p>
   * Getter method for the COM property "FacesToRemove"
   * </p>
   * @return  Returns a value of type References
   */

  @DISPID(1611071490) //= 0x60070002. The runtime will prefer the VTID if present
  @VTID(24)
  References facesToRemove();


  /**
   * @param iFaceToRemove Mandatory Reference parameter.
   */

  @DISPID(1611071491) //= 0x60070003. The runtime will prefer the VTID if present
  @VTID(25)
  void addFaceToRemove(
    Reference iFaceToRemove);


  /**
   * @param iFaceToWithdraw Mandatory Reference parameter.
   */

  @DISPID(1611071492) //= 0x60070004. The runtime will prefer the VTID if present
  @VTID(26)
  void withdrawFaceToRemove(
    Reference iFaceToWithdraw);


  /**
   * @param iFaceToThicken Mandatory Reference parameter.
   */

  @DISPID(1611071493) //= 0x60070005. The runtime will prefer the VTID if present
  @VTID(27)
  void addFaceWithDifferentThickness(
    Reference iFaceToThicken);


  /**
   * @param iFaceToRemove Mandatory Reference parameter.
   */

  @DISPID(1611071494) //= 0x60070006. The runtime will prefer the VTID if present
  @VTID(28)
  void removeFaceWithDifferentThickness(
    Reference iFaceToRemove);


  /**
   * @param iVolumeSupport Mandatory Reference parameter.
   */

  @DISPID(1611071495) //= 0x60070007. The runtime will prefer the VTID if present
  @VTID(29)
  void setVolumeSupport(
    Reference iVolumeSupport);


  // Properties:
}
