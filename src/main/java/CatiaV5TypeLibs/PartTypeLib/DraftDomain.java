package CatiaV5TypeLibs.PartTypeLib;
import CatiaV5TypeLibs.InfTypeLib.*;
import CatiaV5TypeLibs.MecModTypeLib.*;
import CatiaV5TypeLibs.KnowledgewareTypeLib.*;

import com4j.*;

@IID("{FD532A56-60BE-11D1-A27D-0000F87546FD}")
public interface DraftDomain extends AnyObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "DraftAngle"
   * </p>
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.Angle
   */

  @DISPID(1610940416) //= 0x60050000. The runtime will prefer the VTID if present
  @VTID(22)
  Angle draftAngle();


  /**
   * <p>
   * Getter method for the COM property "FacesToDraft"
   * </p>
   * @return  Returns a value of type References
   */

  @DISPID(1610940417) //= 0x60050001. The runtime will prefer the VTID if present
  @VTID(23)
  References facesToDraft();


  /**
   * <p>
   * Getter method for the COM property "NeutralElement"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1610940418) //= 0x60050002. The runtime will prefer the VTID if present
  @VTID(24)
  Reference neutralElement();


  /**
   * <p>
   * Setter method for the COM property "NeutralElement"
   * </p>
   * @param oNeutralElement Mandatory Reference parameter.
   */

  @DISPID(1610940418) //= 0x60050002. The runtime will prefer the VTID if present
  @VTID(25)
  void neutralElement(
    Reference oNeutralElement);


  /**
   * <p>
   * Getter method for the COM property "NeutralPropagationMode"
   * </p>
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.CatDraftNeutralPropagationMode
   */

  @DISPID(1610940420) //= 0x60050004. The runtime will prefer the VTID if present
  @VTID(26)
  CatDraftNeutralPropagationMode neutralPropagationMode();


  /**
   * <p>
   * Setter method for the COM property "NeutralPropagationMode"
   * </p>
   * @param oNeutralPropagationMode Mandatory CatiaV5TypeLibs.PartItfTypeLib.CatDraftNeutralPropagationMode parameter.
   */

  @DISPID(1610940420) //= 0x60050004. The runtime will prefer the VTID if present
  @VTID(27)
  void neutralPropagationMode(
    CatDraftNeutralPropagationMode oNeutralPropagationMode);


  /**
   * <p>
   * Getter method for the COM property "MultiselectionMode"
   * </p>
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.CatDraftMultiselectionMode
   */

  @DISPID(1610940422) //= 0x60050006. The runtime will prefer the VTID if present
  @VTID(28)
  CatDraftMultiselectionMode multiselectionMode();


  /**
   * <p>
   * Setter method for the COM property "MultiselectionMode"
   * </p>
   * @param oMultiselectionMode Mandatory CatiaV5TypeLibs.PartItfTypeLib.CatDraftMultiselectionMode parameter.
   */

  @DISPID(1610940422) //= 0x60050006. The runtime will prefer the VTID if present
  @VTID(29)
  void multiselectionMode(
    CatDraftMultiselectionMode oMultiselectionMode);


  /**
   * @param ioPullingDirection Mandatory java.lang.Object[] parameter.
   */

  @DISPID(1610940424) //= 0x60050008. The runtime will prefer the VTID if present
  @VTID(30)
  void getPullingDirection(
    java.lang.Object[] ioPullingDirection);


  /**
   * @param iX Mandatory double parameter.
   * @param iY Mandatory double parameter.
   * @param iZ Mandatory double parameter.
   */

  @DISPID(1610940425) //= 0x60050009. The runtime will prefer the VTID if present
  @VTID(31)
  void setPullingDirection(
    double iX,
    double iY,
    double iZ);


  /**
   * <p>
   * Getter method for the COM property "PullingDirectionElement"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1610940426) //= 0x6005000a. The runtime will prefer the VTID if present
  @VTID(32)
  Reference pullingDirectionElement();


  /**
   * <p>
   * Setter method for the COM property "PullingDirectionElement"
   * </p>
   * @param oPullingDirectionElement Mandatory Reference parameter.
   */

  @DISPID(1610940426) //= 0x6005000a. The runtime will prefer the VTID if present
  @VTID(33)
  void pullingDirectionElement(
    Reference oPullingDirectionElement);


  /**
   * @param iFace Mandatory Reference parameter.
   */

  @DISPID(1610940428) //= 0x6005000c. The runtime will prefer the VTID if present
  @VTID(34)
  void addFaceToDraft(
    Reference iFace);


  /**
   * @param iFace Mandatory Reference parameter.
   */

  @DISPID(1610940429) //= 0x6005000d. The runtime will prefer the VTID if present
  @VTID(35)
  void removeFaceToDraft(
    Reference iFace);


  /**
   * @param iVolumeSupport Mandatory Reference parameter.
   */

  @DISPID(1610940430) //= 0x6005000e. The runtime will prefer the VTID if present
  @VTID(36)
  void setVolumeSupport(
    Reference iVolumeSupport);


  // Properties:
}
