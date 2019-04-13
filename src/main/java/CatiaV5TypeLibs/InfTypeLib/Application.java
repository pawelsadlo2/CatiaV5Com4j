package CatiaV5TypeLibs.InfTypeLib;

import com4j.*;

@IID("{7D2C8116-DC44-0000-0280-030BA6000000}")
public interface Application extends AnyObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Documents"
   * </p>
   * @return  Returns a value of type Documents
   */

  @DISPID(1610940416) //= 0x60050000. The runtime will prefer the VTID if present
  @VTID(22)
  Documents documents();


  /**
   * <p>
   * Getter method for the COM property "ActiveDocument"
   * </p>
   * @return  Returns a value of type Document
   */

  @DISPID(1610940417) //= 0x60050001. The runtime will prefer the VTID if present
  @VTID(23)
  Document activeDocument();


  /**
   * <p>
   * Getter method for the COM property "Windows"
   * </p>
   * @return  Returns a value of type Windows
   */

  @DISPID(1610940418) //= 0x60050002. The runtime will prefer the VTID if present
  @VTID(24)
  Windows windows();


  /**
   * <p>
   * Getter method for the COM property "ActiveWindow"
   * </p>
   * @return  Returns a value of type Window
   */

  @DISPID(1610940419) //= 0x60050003. The runtime will prefer the VTID if present
  @VTID(25)
  Window activeWindow();


  /**
   * <p>
   * Getter method for the COM property "Printers"
   * </p>
   * @return  Returns a value of type Printers
   */

  @DISPID(1610940420) //= 0x60050004. The runtime will prefer the VTID if present
  @VTID(26)
  Printers printers();


  /**
   * <p>
   * Getter method for the COM property "ActivePrinter"
   * </p>
   * @return  Returns a value of type Printer
   */

  @DISPID(1610940421) //= 0x60050005. The runtime will prefer the VTID if present
  @VTID(27)
  Printer activePrinter();


  /**
   * <p>
   * Setter method for the COM property "ActivePrinter"
   * </p>
   * @param oPrinter Mandatory Printer parameter.
   */

  @DISPID(1610940421) //= 0x60050005. The runtime will prefer the VTID if present
  @VTID(28)
  void activePrinter(
    Printer oPrinter);


  /**
   * <p>
   * Getter method for the COM property "FileSystem"
   * </p>
   * @return  Returns a value of type FileSystem
   */

  @DISPID(1610940423) //= 0x60050007. The runtime will prefer the VTID if present
  @VTID(29)
  FileSystem fileSystem();


  /**
   * <p>
   * Getter method for the COM property "SystemService"
   * </p>
   * @return  Returns a value of type SystemService
   */

  @DISPID(1610940424) //= 0x60050008. The runtime will prefer the VTID if present
  @VTID(30)
  SystemService systemService();


  /**
   * <p>
   * Getter method for the COM property "FullName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610940425) //= 0x60050009. The runtime will prefer the VTID if present
  @VTID(31)
  java.lang.String fullName();


  /**
   * <p>
   * Getter method for the COM property "Path"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610940426) //= 0x6005000a. The runtime will prefer the VTID if present
  @VTID(32)
  java.lang.String path();


  /**
   * <p>
   * Getter method for the COM property "FileSearchOrder"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610940427) //= 0x6005000b. The runtime will prefer the VTID if present
  @VTID(33)
  java.lang.String fileSearchOrder();


  /**
   * <p>
   * Setter method for the COM property "FileSearchOrder"
   * </p>
   * @param oDefaultFilePathBSTR Mandatory Holder<java.lang.String> parameter.
   */

  @DISPID(1610940427) //= 0x6005000b. The runtime will prefer the VTID if present
  @VTID(34)
  void fileSearchOrder(
    Holder<java.lang.String> oDefaultFilePathBSTR);


  /**
   * <p>
   * Getter method for the COM property "LocalCache"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610940429) //= 0x6005000d. The runtime will prefer the VTID if present
  @VTID(35)
  java.lang.String localCache();


  /**
   * <p>
   * Setter method for the COM property "LocalCache"
   * </p>
   * @param oLocalCachePathBSTR Mandatory Holder<java.lang.String> parameter.
   */

  @DISPID(1610940429) //= 0x6005000d. The runtime will prefer the VTID if present
  @VTID(36)
  void localCache(
    Holder<java.lang.String> oLocalCachePathBSTR);


  /**
   * <p>
   * Getter method for the COM property "CacheSize"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610940431) //= 0x6005000f. The runtime will prefer the VTID if present
  @VTID(37)
  int cacheSize();


  /**
   * <p>
   * Setter method for the COM property "CacheSize"
   * </p>
   * @param oLocalCacheSize Mandatory int parameter.
   */

  @DISPID(1610940431) //= 0x6005000f. The runtime will prefer the VTID if present
  @VTID(38)
  void cacheSize(
    int oLocalCacheSize);


  /**
   * <p>
   * Getter method for the COM property "Visible"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610940433) //= 0x60050011. The runtime will prefer the VTID if present
  @VTID(39)
  boolean visible();


  /**
   * <p>
   * Setter method for the COM property "Visible"
   * </p>
   * @param oVisible Mandatory boolean parameter.
   */

  @DISPID(1610940433) //= 0x60050011. The runtime will prefer the VTID if present
  @VTID(40)
  void visible(
    boolean oVisible);


  /**
   * <p>
   * Getter method for the COM property "Interactive"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610940435) //= 0x60050013. The runtime will prefer the VTID if present
  @VTID(41)
  boolean interactive();


  /**
   * <p>
   * Setter method for the COM property "Interactive"
   * </p>
   * @param oInteractive Mandatory boolean parameter.
   */

  @DISPID(1610940435) //= 0x60050013. The runtime will prefer the VTID if present
  @VTID(42)
  void interactive(
    boolean oInteractive);


  /**
   * <p>
   * Getter method for the COM property "DisplayFileAlerts"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610940437) //= 0x60050015. The runtime will prefer the VTID if present
  @VTID(43)
  boolean displayFileAlerts();


  /**
   * <p>
   * Setter method for the COM property "DisplayFileAlerts"
   * </p>
   * @param oDisplayFileAlerts Mandatory boolean parameter.
   */

  @DISPID(1610940437) //= 0x60050015. The runtime will prefer the VTID if present
  @VTID(44)
  void displayFileAlerts(
    boolean oDisplayFileAlerts);


  /**
   * <p>
   * Getter method for the COM property "Caption"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610940439) //= 0x60050017. The runtime will prefer the VTID if present
  @VTID(45)
  java.lang.String caption();


  /**
   * <p>
   * Setter method for the COM property "Caption"
   * </p>
   * @param oCaptionBSTR Mandatory Holder<java.lang.String> parameter.
   */

  @DISPID(1610940439) //= 0x60050017. The runtime will prefer the VTID if present
  @VTID(46)
  void caption(
    Holder<java.lang.String> oCaptionBSTR);


  /**
   * <p>
   * Getter method for the COM property "StatusBar"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610940441) //= 0x60050019. The runtime will prefer the VTID if present
  @VTID(47)
  java.lang.String statusBar();


  /**
   * <p>
   * Setter method for the COM property "StatusBar"
   * </p>
   * @param oStatusBarBSTR Mandatory Holder<java.lang.String> parameter.
   */

  @DISPID(1610940441) //= 0x60050019. The runtime will prefer the VTID if present
  @VTID(48)
  void statusBar(
    Holder<java.lang.String> oStatusBarBSTR);


  /**
   * <p>
   * Getter method for the COM property "Width"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(1610940443) //= 0x6005001b. The runtime will prefer the VTID if present
  @VTID(49)
  float width();


  /**
   * <p>
   * Setter method for the COM property "Width"
   * </p>
   * @param oWidth Mandatory float parameter.
   */

  @DISPID(1610940443) //= 0x6005001b. The runtime will prefer the VTID if present
  @VTID(50)
  void width(
    float oWidth);


  /**
   * <p>
   * Getter method for the COM property "Height"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(1610940445) //= 0x6005001d. The runtime will prefer the VTID if present
  @VTID(51)
  float height();


  /**
   * <p>
   * Setter method for the COM property "Height"
   * </p>
   * @param oHeight Mandatory float parameter.
   */

  @DISPID(1610940445) //= 0x6005001d. The runtime will prefer the VTID if present
  @VTID(52)
  void height(
    float oHeight);


  /**
   * <p>
   * Getter method for the COM property "Batch"
   * </p>
   * @return  Returns a value of type Batch
   */

  @DISPID(1610940447) //= 0x6005001f. The runtime will prefer the VTID if present
  @VTID(53)
  Batch batch();


  /**
   * <p>
   * Setter method for the COM property "Batch"
   * </p>
   * @param oBatch Mandatory Batch parameter.
   */

  @DISPID(1610940447) //= 0x6005001f. The runtime will prefer the VTID if present
  @VTID(54)
  void batch(
    Batch oBatch);


  /**
   * <p>
   * Getter method for the COM property "Left"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(1610940449) //= 0x60050021. The runtime will prefer the VTID if present
  @VTID(55)
  float left();


  /**
   * <p>
   * Setter method for the COM property "Left"
   * </p>
   * @param oLeft Mandatory float parameter.
   */

  @DISPID(1610940449) //= 0x60050021. The runtime will prefer the VTID if present
  @VTID(56)
  void left(
    float oLeft);


  /**
   * <p>
   * Getter method for the COM property "Top"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(1610940451) //= 0x60050023. The runtime will prefer the VTID if present
  @VTID(57)
  float top();


  /**
   * <p>
   * Setter method for the COM property "Top"
   * </p>
   * @param oTop Mandatory float parameter.
   */

  @DISPID(1610940451) //= 0x60050023. The runtime will prefer the VTID if present
  @VTID(58)
  void top(
    float oTop);


  /**
   * @param iHelpID Mandatory Holder<java.lang.String> parameter.
   */

  @DISPID(1610940453) //= 0x60050025. The runtime will prefer the VTID if present
  @VTID(59)
  void help(
    Holder<java.lang.String> iHelpID);


  /**
   */

  @DISPID(1610940454) //= 0x60050026. The runtime will prefer the VTID if present
  @VTID(60)
  void quit();


  /**
   * @return  Returns a value of type Mail
   */

  @DISPID(1610940455) //= 0x60050027. The runtime will prefer the VTID if present
  @VTID(61)
  Mail createMail();


  /**
   * @return  Returns a value of type SendToService
   */

  @DISPID(1610940456) //= 0x60050028. The runtime will prefer the VTID if present
  @VTID(62)
  SendToService createSendTo();


  /**
   * @param iPrompt Mandatory Holder<java.lang.String> parameter.
   * @param iButtons Mandatory short parameter.
   * @param iTitle Mandatory Holder<java.lang.String> parameter.
   * @param iHelpFile Mandatory Holder<java.lang.String> parameter.
   * @param iContext Mandatory int parameter.
   * @return  Returns a value of type short
   */

  @DISPID(1610940457) //= 0x60050029. The runtime will prefer the VTID if present
  @VTID(63)
  short msgBox(
    Holder<java.lang.String> iPrompt,
    short iButtons,
    Holder<java.lang.String> iTitle,
    Holder<java.lang.String> iHelpFile,
    int iContext);


  /**
   * @param iPrompt Mandatory Holder<java.lang.String> parameter.
   * @param iTitle Mandatory Holder<java.lang.String> parameter.
   * @param iDefault Mandatory Holder<java.lang.String> parameter.
   * @param iXPos Mandatory short parameter.
   * @param iYPos Mandatory short parameter.
   * @param iHelpFile Mandatory Holder<java.lang.String> parameter.
   * @param iContext Mandatory int parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610940458) //= 0x6005002a. The runtime will prefer the VTID if present
  @VTID(64)
  java.lang.String inputBox(
    Holder<java.lang.String> iPrompt,
    Holder<java.lang.String> iTitle,
    Holder<java.lang.String> iDefault,
    short iXPos,
    short iYPos,
    Holder<java.lang.String> iHelpFile,
    int iContext);


  /**
   * @param iTitle Mandatory Holder<java.lang.String> parameter.
   * @param iExtension Mandatory Holder<java.lang.String> parameter.
   * @param iMode Mandatory CatFileSelectionMode parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610940459) //= 0x6005002b. The runtime will prefer the VTID if present
  @VTID(65)
  java.lang.String fileSelectionBox(
    Holder<java.lang.String> iTitle,
    Holder<java.lang.String> iExtension,
    CatFileSelectionMode iMode);


  /**
   * @param iCommandId Mandatory Holder<java.lang.String> parameter.
   */

  @DISPID(1610940460) //= 0x6005002c. The runtime will prefer the VTID if present
  @VTID(66)
  void startCommand(
    Holder<java.lang.String> iCommandId);


  /**
   * @param iworkbenchId Mandatory Holder<java.lang.String> parameter.
   */

  @DISPID(1610940461) //= 0x6005002d. The runtime will prefer the VTID if present
  @VTID(67)
  void startWorkbench(
    Holder<java.lang.String> iworkbenchId);


  /**
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610940462) //= 0x6005002e. The runtime will prefer the VTID if present
  @VTID(68)
  java.lang.String getWorkbenchId();


  /**
   * <p>
   * Getter method for the COM property "Settings"
   * </p>
   * @return  Returns a value of type Settings
   */

  @DISPID(1610940463) //= 0x6005002f. The runtime will prefer the VTID if present
  @VTID(69)
  Settings settings();


  /**
   * <p>
   * Getter method for the COM property "SettingControllers"
   * </p>
   * @return  Returns a value of type SettingControllers
   */

  @DISPID(1610940464) //= 0x60050030. The runtime will prefer the VTID if present
  @VTID(70)
  SettingControllers settingControllers();


  /**
   * <p>
   * Getter method for the COM property "SystemConfiguration"
   * </p>
   * @return  Returns a value of type SystemConfiguration
   */

  @DISPID(1610940465) //= 0x60050031. The runtime will prefer the VTID if present
  @VTID(71)
  SystemConfiguration systemConfiguration();


  /**
   * <p>
   * Getter method for the COM property "RefreshDisplay"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610940466) //= 0x60050032. The runtime will prefer the VTID if present
  @VTID(72)
  boolean refreshDisplay();


  /**
   * <p>
   * Setter method for the COM property "RefreshDisplay"
   * </p>
   * @param oRefreshIsEnabled Mandatory boolean parameter.
   */

  @DISPID(1610940466) //= 0x60050032. The runtime will prefer the VTID if present
  @VTID(73)
  void refreshDisplay(
    boolean oRefreshIsEnabled);


  /**
   * <p>
   * Getter method for the COM property "HSOSynchronized"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610940468) //= 0x60050034. The runtime will prefer the VTID if present
  @VTID(74)
  boolean hsoSynchronized();


  /**
   * <p>
   * Setter method for the COM property "HSOSynchronized"
   * </p>
   * @param oHSOSynchronized Mandatory boolean parameter.
   */

  @DISPID(1610940468) //= 0x60050034. The runtime will prefer the VTID if present
  @VTID(75)
  void hsoSynchronized(
    boolean oHSOSynchronized);


  // Properties:
}
