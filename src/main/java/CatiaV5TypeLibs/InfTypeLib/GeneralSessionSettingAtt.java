package CatiaV5TypeLibs.InfTypeLib;

import com4j.*;

@IID("{46C31239-6252-4B02-BAB2-57F4F381EE9D}")
public interface GeneralSessionSettingAtt extends SettingController {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "UIStyle"
   * </p>
   * @return  Returns a value of type CATGenUIStyle
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(27)
  CATGenUIStyle uiStyle();


  /**
   * <p>
   * Setter method for the COM property "UIStyle"
   * </p>
   * @param oUIStyle Mandatory CATGenUIStyle parameter.
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(28)
  void uiStyle(
    CATGenUIStyle oUIStyle);


  /**
   * @param ioAdminLevel Mandatory Holder<java.lang.String> parameter.
   * @param ioLocked Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005954) //= 0x60060002. The runtime will prefer the VTID if present
  @VTID(29)
  boolean getUIStyleInfo(
    Holder<java.lang.String> ioAdminLevel,
    Holder<java.lang.String> ioLocked);


  /**
   * @param iLocked Mandatory boolean parameter.
   */

  @DISPID(1611005955) //= 0x60060003. The runtime will prefer the VTID if present
  @VTID(30)
  void setUIStyleLock(
    boolean iLocked);


  /**
   * <p>
   * Getter method for the COM property "AutoSave"
   * </p>
   * @return  Returns a value of type CATGenDataSave
   */

  @DISPID(1611005956) //= 0x60060004. The runtime will prefer the VTID if present
  @VTID(31)
  CATGenDataSave autoSave();


  /**
   * <p>
   * Setter method for the COM property "AutoSave"
   * </p>
   * @param oAutoSave Mandatory CATGenDataSave parameter.
   */

  @DISPID(1611005956) //= 0x60060004. The runtime will prefer the VTID if present
  @VTID(32)
  void autoSave(
    CATGenDataSave oAutoSave);


  /**
   * @param ioAdminLevel Mandatory Holder<java.lang.String> parameter.
   * @param ioLocked Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005958) //= 0x60060006. The runtime will prefer the VTID if present
  @VTID(33)
  boolean getAutoSaveInfo(
    Holder<java.lang.String> ioAdminLevel,
    Holder<java.lang.String> ioLocked);


  /**
   * @param iLocked Mandatory boolean parameter.
   */

  @DISPID(1611005959) //= 0x60060007. The runtime will prefer the VTID if present
  @VTID(34)
  void setAutoSaveLock(
    boolean iLocked);


  /**
   * <p>
   * Getter method for the COM property "TimeRoll"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611005960) //= 0x60060008. The runtime will prefer the VTID if present
  @VTID(35)
  int timeRoll();


  /**
   * <p>
   * Setter method for the COM property "TimeRoll"
   * </p>
   * @param oTimeRoll Mandatory int parameter.
   */

  @DISPID(1611005960) //= 0x60060008. The runtime will prefer the VTID if present
  @VTID(36)
  void timeRoll(
    int oTimeRoll);


  /**
   * <p>
   * Getter method for the COM property "RefDoc"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005962) //= 0x6006000a. The runtime will prefer the VTID if present
  @VTID(37)
  boolean refDoc();


  /**
   * <p>
   * Setter method for the COM property "RefDoc"
   * </p>
   * @param oRefDoc Mandatory boolean parameter.
   */

  @DISPID(1611005962) //= 0x6006000a. The runtime will prefer the VTID if present
  @VTID(38)
  void refDoc(
    boolean oRefDoc);


  /**
   * @param ioAdminLevel Mandatory Holder<java.lang.String> parameter.
   * @param ioLocked Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005964) //= 0x6006000c. The runtime will prefer the VTID if present
  @VTID(39)
  boolean getRefDocInfo(
    Holder<java.lang.String> ioAdminLevel,
    Holder<java.lang.String> ioLocked);


  /**
   * @param iLocked Mandatory boolean parameter.
   */

  @DISPID(1611005965) //= 0x6006000d. The runtime will prefer the VTID if present
  @VTID(40)
  void setRefDocLock(
    boolean iLocked);


  /**
   * <p>
   * Getter method for the COM property "Conferencing"
   * </p>
   * @return  Returns a value of type CATGenConferencing
   */

  @DISPID(1611005966) //= 0x6006000e. The runtime will prefer the VTID if present
  @VTID(41)
  CATGenConferencing conferencing();


  /**
   * <p>
   * Setter method for the COM property "Conferencing"
   * </p>
   * @param oConf Mandatory CATGenConferencing parameter.
   */

  @DISPID(1611005966) //= 0x6006000e. The runtime will prefer the VTID if present
  @VTID(42)
  void conferencing(
    CATGenConferencing oConf);


  /**
   * @param ioAdminLevel Mandatory Holder<java.lang.String> parameter.
   * @param ioLocked Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005968) //= 0x60060010. The runtime will prefer the VTID if present
  @VTID(43)
  boolean getConferencingInfo(
    Holder<java.lang.String> ioAdminLevel,
    Holder<java.lang.String> ioLocked);


  /**
   * @param iLocked Mandatory boolean parameter.
   */

  @DISPID(1611005969) //= 0x60060011. The runtime will prefer the VTID if present
  @VTID(44)
  void setConferencingLock(
    boolean iLocked);


  /**
   * <p>
   * Getter method for the COM property "DragDrop"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005970) //= 0x60060012. The runtime will prefer the VTID if present
  @VTID(45)
  boolean dragDrop();


  /**
   * <p>
   * Setter method for the COM property "DragDrop"
   * </p>
   * @param oDragDrop Mandatory boolean parameter.
   */

  @DISPID(1611005970) //= 0x60060012. The runtime will prefer the VTID if present
  @VTID(46)
  void dragDrop(
    boolean oDragDrop);


  /**
   * @param ioAdminLevel Mandatory Holder<java.lang.String> parameter.
   * @param ioLocked Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005972) //= 0x60060014. The runtime will prefer the VTID if present
  @VTID(47)
  boolean getDragDropInfo(
    Holder<java.lang.String> ioAdminLevel,
    Holder<java.lang.String> ioLocked);


  /**
   * @param iLocked Mandatory boolean parameter.
   */

  @DISPID(1611005973) //= 0x60060015. The runtime will prefer the VTID if present
  @VTID(48)
  void setDragDropLock(
    boolean iLocked);


  // Properties:
}
