package CatiaV5TypeLibs.InfItfTypeLib;

import com4j.*;

@IID("{AA6065D3-6A9A-0000-0280-03110E000000}")
public interface DLNameSettingAtt extends SettingController {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "DLNameCreationRight"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(27)
  boolean dlNameCreationRight();


  /**
   * <p>
   * Setter method for the COM property "DLNameCreationRight"
   * </p>
   * @param oAllowed Mandatory boolean parameter.
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(28)
  void dlNameCreationRight(
    boolean oAllowed);


  /**
   * @param iLocked Mandatory boolean parameter.
   */

  @DISPID(1611005954) //= 0x60060002. The runtime will prefer the VTID if present
  @VTID(29)
  void setDLNameCreationRightLock(
    boolean iLocked);


  /**
   * @param adminLevel Mandatory Holder<java.lang.String> parameter.
   * @param oLocked Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005955) //= 0x60060003. The runtime will prefer the VTID if present
  @VTID(30)
  boolean getDLNameCreationRightInfo(
    Holder<java.lang.String> adminLevel,
    Holder<java.lang.String> oLocked);


  /**
   * <p>
   * Getter method for the COM property "RootDLNameCreationRight"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005956) //= 0x60060004. The runtime will prefer the VTID if present
  @VTID(31)
  boolean rootDLNameCreationRight();


  /**
   * <p>
   * Setter method for the COM property "RootDLNameCreationRight"
   * </p>
   * @param oAllowed Mandatory boolean parameter.
   */

  @DISPID(1611005956) //= 0x60060004. The runtime will prefer the VTID if present
  @VTID(32)
  void rootDLNameCreationRight(
    boolean oAllowed);


  /**
   * @param iLocked Mandatory boolean parameter.
   */

  @DISPID(1611005958) //= 0x60060006. The runtime will prefer the VTID if present
  @VTID(33)
  void setRootDLNameCreationRightLock(
    boolean iLocked);


  /**
   * @param adminLevel Mandatory Holder<java.lang.String> parameter.
   * @param oLocked Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005959) //= 0x60060007. The runtime will prefer the VTID if present
  @VTID(34)
  boolean getRootDLNameCreationRightInfo(
    Holder<java.lang.String> adminLevel,
    Holder<java.lang.String> oLocked);


  /**
   * @return  Returns a value of type java.lang.Object[]
   */

  @DISPID(1611005960) //= 0x60060008. The runtime will prefer the VTID if present
  @VTID(35)
  java.lang.Object[] getDLNameList();


  /**
   * @param iDLName Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type java.lang.Object[]
   */

  @DISPID(1611005961) //= 0x60060009. The runtime will prefer the VTID if present
  @VTID(36)
  java.lang.Object[] getDLNameSubList(
    Holder<java.lang.String> iDLName);


  /**
   * @param iDLName Mandatory Holder<java.lang.String> parameter.
   * @param oRealNameUnix Mandatory Holder<java.lang.String> parameter.
   * @param oRealNameNT Mandatory Holder<java.lang.String> parameter.
   * @param oFather Mandatory Holder<java.lang.String> parameter.
   */

  @DISPID(1611005962) //= 0x6006000a. The runtime will prefer the VTID if present
  @VTID(37)
  void getDLName(
    Holder<java.lang.String> iDLName,
    Holder<java.lang.String> oRealNameUnix,
    Holder<java.lang.String> oRealNameNT,
    Holder<java.lang.String> oFather);


  /**
   * @param iDLName Mandatory Holder<java.lang.String> parameter.
   * @param oRealNameUnix Mandatory Holder<java.lang.String> parameter.
   * @param oRealNameNT Mandatory Holder<java.lang.String> parameter.
   * @param oFather Mandatory Holder<java.lang.String> parameter.
   */

  @DISPID(1611005963) //= 0x6006000b. The runtime will prefer the VTID if present
  @VTID(38)
  void getDLNameExp(
    Holder<java.lang.String> iDLName,
    Holder<java.lang.String> oRealNameUnix,
    Holder<java.lang.String> oRealNameNT,
    Holder<java.lang.String> oFather);


  /**
   * @param iDLName Mandatory Holder<java.lang.String> parameter.
   * @param iRealNameUnix Mandatory Holder<java.lang.String> parameter.
   * @param iRealNameNT Mandatory Holder<java.lang.String> parameter.
   * @param iFather Mandatory Holder<java.lang.String> parameter.
   * @param iVerifDirectory Mandatory boolean parameter.
   */

  @DISPID(1611005964) //= 0x6006000c. The runtime will prefer the VTID if present
  @VTID(39)
  void setDLName(
    Holder<java.lang.String> iDLName,
    Holder<java.lang.String> iRealNameUnix,
    Holder<java.lang.String> iRealNameNT,
    Holder<java.lang.String> iFather,
    boolean iVerifDirectory);


  /**
   * @param iDLName Mandatory Holder<java.lang.String> parameter.
   * @param iLocked Mandatory boolean parameter.
   */

  @DISPID(1611005965) //= 0x6006000d. The runtime will prefer the VTID if present
  @VTID(40)
  void setDLNameLock(
    Holder<java.lang.String> iDLName,
    boolean iLocked);


  /**
   * @param iDLName Mandatory Holder<java.lang.String> parameter.
   * @param adminLevel Mandatory Holder<java.lang.String> parameter.
   * @param oLocked Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005966) //= 0x6006000e. The runtime will prefer the VTID if present
  @VTID(41)
  boolean getDLNameInfo(
    Holder<java.lang.String> iDLName,
    Holder<java.lang.String> adminLevel,
    Holder<java.lang.String> oLocked);


  /**
   * @param iDLName Mandatory Holder<java.lang.String> parameter.
   */

  @DISPID(1611005967) //= 0x6006000f. The runtime will prefer the VTID if present
  @VTID(42)
  void removeDLName(
    Holder<java.lang.String> iDLName);


  /**
   * @param iDLName Mandatory Holder<java.lang.String> parameter.
   * @param iNewName Mandatory Holder<java.lang.String> parameter.
   */

  @DISPID(1611005968) //= 0x60060010. The runtime will prefer the VTID if present
  @VTID(43)
  void renameDLName(
    Holder<java.lang.String> iDLName,
    Holder<java.lang.String> iNewName);


  // Properties:
}
