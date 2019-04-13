package CatiaV5TypeLibs.InfTypeLib;

import com4j.*;

@IID("{401DD642-B5CF-486F-B237-B471F97A9DC0}")
public interface PrintersSettingAtt extends SettingController {
  // Methods:
  /**
   * @return  Returns a value of type java.lang.Object[]
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(27)
  java.lang.Object[] getPrinterDirectories();


  /**
   * @param iPrinterDir Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type CatPrinterDirState
   */

  @DISPID(1611005953) //= 0x60060001. The runtime will prefer the VTID if present
  @VTID(28)
  CatPrinterDirState getPrinterDirectoryState(
    Holder<java.lang.String> iPrinterDir);


  /**
   * @param iPrinterDir Mandatory Holder<java.lang.String> parameter.
   * @param iPrinterDirState Mandatory CatPrinterDirState parameter.
   */

  @DISPID(1611005954) //= 0x60060002. The runtime will prefer the VTID if present
  @VTID(29)
  void addPrinterDirectory(
    Holder<java.lang.String> iPrinterDir,
    CatPrinterDirState iPrinterDirState);


  /**
   * @param iPrinterDir Mandatory Holder<java.lang.String> parameter.
   * @param iPrinterDirState Mandatory CatPrinterDirState parameter.
   */

  @DISPID(1611005955) //= 0x60060003. The runtime will prefer the VTID if present
  @VTID(30)
  void modifyPrinterDirectoryState(
    Holder<java.lang.String> iPrinterDir,
    CatPrinterDirState iPrinterDirState);


  /**
   * @param iPrinterDir Mandatory Holder<java.lang.String> parameter.
   */

  @DISPID(1611005956) //= 0x60060004. The runtime will prefer the VTID if present
  @VTID(31)
  void removePrinterDirectory(
    Holder<java.lang.String> iPrinterDir);


  /**
   */

  @DISPID(1611005957) //= 0x60060005. The runtime will prefer the VTID if present
  @VTID(32)
  void removeAllPrinterDirectories();


  /**
   * @param iLock Mandatory boolean parameter.
   */

  @DISPID(1611005958) //= 0x60060006. The runtime will prefer the VTID if present
  @VTID(33)
  void setPrinterDirectoriesLock(
    boolean iLock);


  /**
   * @param oAdminLevel Mandatory Holder<java.lang.String> parameter.
   * @param oLocked Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005959) //= 0x60060007. The runtime will prefer the VTID if present
  @VTID(34)
  boolean getPrinterDirectoriesInfo(
    Holder<java.lang.String> oAdminLevel,
    Holder<java.lang.String> oLocked);


  /**
   * @param oNewPrinterDir Mandatory Holder<java.lang.String> parameter.
   */

  @DISPID(1611005960) //= 0x60060008. The runtime will prefer the VTID if present
  @VTID(35)
  void getNewPrinterDirectory(
    Holder<java.lang.String> oNewPrinterDir);


  /**
   * @param iNewPrinterDir Mandatory Holder<java.lang.String> parameter.
   */

  @DISPID(1611005961) //= 0x60060009. The runtime will prefer the VTID if present
  @VTID(36)
  void setNewPrinterDirectory(
    Holder<java.lang.String> iNewPrinterDir);


  /**
   * @param iLock Mandatory boolean parameter.
   */

  @DISPID(1611005962) //= 0x6006000a. The runtime will prefer the VTID if present
  @VTID(37)
  void setNewPrinterDirectoryLock(
    boolean iLock);


  /**
   * @param oAdminLevel Mandatory Holder<java.lang.String> parameter.
   * @param oLocked Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005963) //= 0x6006000b. The runtime will prefer the VTID if present
  @VTID(38)
  boolean getNewPrinterDirectoryInfo(
    Holder<java.lang.String> oAdminLevel,
    Holder<java.lang.String> oLocked);


  /**
   * @param oDriverCfgPath Mandatory Holder<java.lang.String> parameter.
   */

  @DISPID(1611005964) //= 0x6006000c. The runtime will prefer the VTID if present
  @VTID(39)
  void getDriverConfigurationPath(
    Holder<java.lang.String> oDriverCfgPath);


  /**
   * @param iDriverCfgPath Mandatory Holder<java.lang.String> parameter.
   */

  @DISPID(1611005965) //= 0x6006000d. The runtime will prefer the VTID if present
  @VTID(40)
  void setDriverConfigurationPath(
    Holder<java.lang.String> iDriverCfgPath);


  /**
   * @param iLock Mandatory boolean parameter.
   */

  @DISPID(1611005966) //= 0x6006000e. The runtime will prefer the VTID if present
  @VTID(41)
  void setDriverConfigurationPathLock(
    boolean iLock);


  /**
   * @param oAdminLevel Mandatory Holder<java.lang.String> parameter.
   * @param oLocked Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005967) //= 0x6006000f. The runtime will prefer the VTID if present
  @VTID(42)
  boolean getDriverConfigurationPathInfo(
    Holder<java.lang.String> oAdminLevel,
    Holder<java.lang.String> oLocked);


  /**
   * @return  Returns a value of type java.lang.Object[]
   */

  @DISPID(1611005968) //= 0x60060010. The runtime will prefer the VTID if present
  @VTID(43)
  java.lang.Object[] getPrinterGroups();


  /**
   * @param iPrinterGroupName Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type java.lang.Object[]
   */

  @DISPID(1611005969) //= 0x60060011. The runtime will prefer the VTID if present
  @VTID(44)
  java.lang.Object[] getPrinterArrayForGroup(
    Holder<java.lang.String> iPrinterGroupName);


  /**
   * @param iPrinterGroupName Mandatory Holder<java.lang.String> parameter.
   * @param iPrinterNames Mandatory java.lang.Object[] parameter.
   */

  @DISPID(1611005970) //= 0x60060012. The runtime will prefer the VTID if present
  @VTID(45)
  void addPrinterGroup(
    Holder<java.lang.String> iPrinterGroupName,
    java.lang.Object[] iPrinterNames);


  /**
   * @param iPrinterGroupName Mandatory Holder<java.lang.String> parameter.
   * @param iPrinterNames Mandatory java.lang.Object[] parameter.
   */

  @DISPID(1611005971) //= 0x60060013. The runtime will prefer the VTID if present
  @VTID(46)
  void modifyPrinterArrayForGroup(
    Holder<java.lang.String> iPrinterGroupName,
    java.lang.Object[] iPrinterNames);


  /**
   * @param iPrinterGroupName Mandatory Holder<java.lang.String> parameter.
   */

  @DISPID(1611005972) //= 0x60060014. The runtime will prefer the VTID if present
  @VTID(47)
  void removePrinterGroup(
    Holder<java.lang.String> iPrinterGroupName);


  /**
   */

  @DISPID(1611005973) //= 0x60060015. The runtime will prefer the VTID if present
  @VTID(48)
  void removeAllPrinterGroups();


  /**
   * @param iLock Mandatory boolean parameter.
   */

  @DISPID(1611005974) //= 0x60060016. The runtime will prefer the VTID if present
  @VTID(49)
  void setPrinterGroupsLock(
    boolean iLock);


  /**
   * @param oAdminLevel Mandatory Holder<java.lang.String> parameter.
   * @param oLocked Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005975) //= 0x60060017. The runtime will prefer the VTID if present
  @VTID(50)
  boolean getPrinterGroupsInfo(
    Holder<java.lang.String> oAdminLevel,
    Holder<java.lang.String> oLocked);


  // Properties:
}
