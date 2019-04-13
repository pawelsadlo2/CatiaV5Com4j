package CatiaV5TypeLibs.InfTypeLib;

import com4j.*;

@IID("{ABE7A03D-ACCD-0000-0280-03110E000000}")
public interface DisconnectionSettingAtt extends SettingController {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "ActivationState"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(27)
  boolean activationState();


  /**
   * <p>
   * Setter method for the COM property "ActivationState"
   * </p>
   * @param oActivationState Mandatory boolean parameter.
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(28)
  void activationState(
    boolean oActivationState);


  /**
   * @param iLocked Mandatory boolean parameter.
   */

  @DISPID(1611005954) //= 0x60060002. The runtime will prefer the VTID if present
  @VTID(29)
  void setActivationStateLock(
    boolean iLocked);


  /**
   * @param adminLevel Mandatory Holder<java.lang.String> parameter.
   * @param oLocked Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005955) //= 0x60060003. The runtime will prefer the VTID if present
  @VTID(30)
  boolean getActivationStateInfo(
    Holder<java.lang.String> adminLevel,
    Holder<java.lang.String> oLocked);


  /**
   * <p>
   * Getter method for the COM property "InactivityDuration"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611005956) //= 0x60060004. The runtime will prefer the VTID if present
  @VTID(31)
  int inactivityDuration();


  /**
   * <p>
   * Setter method for the COM property "InactivityDuration"
   * </p>
   * @param oMaxInactivity Mandatory int parameter.
   */

  @DISPID(1611005956) //= 0x60060004. The runtime will prefer the VTID if present
  @VTID(32)
  void inactivityDuration(
    int oMaxInactivity);


  /**
   * @param iLocked Mandatory boolean parameter.
   */

  @DISPID(1611005958) //= 0x60060006. The runtime will prefer the VTID if present
  @VTID(33)
  void setInactivityDurationLock(
    boolean iLocked);


  /**
   * @param adminLevel Mandatory Holder<java.lang.String> parameter.
   * @param oLocked Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005959) //= 0x60060007. The runtime will prefer the VTID if present
  @VTID(34)
  boolean getInactivityDurationInfo(
    Holder<java.lang.String> adminLevel,
    Holder<java.lang.String> oLocked);


  // Properties:
}
