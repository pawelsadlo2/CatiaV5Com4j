package CatiaV5TypeLibs.KnowledgewareTypeLib;
import CatiaV5TypeLibs.InfTypeLib.*;

import com4j.*;

@IID("{2291200C-37AB-45B5-A320-8BE5854766FA}")
public interface ReportGenerationSheetSettingAtt extends SettingController {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "CheckReportHtml"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(27)
  short checkReportHtml();


  /**
   * <p>
   * Setter method for the COM property "CheckReportHtml"
   * </p>
   * @param oCheckReportHtml Mandatory short parameter.
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(28)
  void checkReportHtml(
    short oCheckReportHtml);


  /**
   * @param ioAdminLevel Mandatory Holder<java.lang.String> parameter.
   * @param ioLocked Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005954) //= 0x60060002. The runtime will prefer the VTID if present
  @VTID(29)
  boolean getCheckReportHtmlInfo(
    Holder<java.lang.String> ioAdminLevel,
    Holder<java.lang.String> ioLocked);


  /**
   * @param iLocked Mandatory boolean parameter.
   */

  @DISPID(1611005955) //= 0x60060003. The runtime will prefer the VTID if present
  @VTID(30)
  void setCheckReportHtmlLock(
    boolean iLocked);


  /**
   * <p>
   * Getter method for the COM property "AllChecksReport"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(1611005956) //= 0x60060004. The runtime will prefer the VTID if present
  @VTID(31)
  short allChecksReport();


  /**
   * <p>
   * Setter method for the COM property "AllChecksReport"
   * </p>
   * @param oAllChecksReport Mandatory short parameter.
   */

  @DISPID(1611005956) //= 0x60060004. The runtime will prefer the VTID if present
  @VTID(32)
  void allChecksReport(
    short oAllChecksReport);


  /**
   * @param ioAdminLevel Mandatory Holder<java.lang.String> parameter.
   * @param ioLocked Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005958) //= 0x60060006. The runtime will prefer the VTID if present
  @VTID(33)
  boolean getAllChecksReportInfo(
    Holder<java.lang.String> ioAdminLevel,
    Holder<java.lang.String> ioLocked);


  /**
   * @param iLocked Mandatory boolean parameter.
   */

  @DISPID(1611005959) //= 0x60060007. The runtime will prefer the VTID if present
  @VTID(34)
  void setAllChecksReportLock(
    boolean iLocked);


  /**
   * <p>
   * Getter method for the COM property "ReportCheckAdvisor"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(1611005960) //= 0x60060008. The runtime will prefer the VTID if present
  @VTID(35)
  short reportCheckAdvisor();


  /**
   * <p>
   * Setter method for the COM property "ReportCheckAdvisor"
   * </p>
   * @param oReportCheckAdvisor Mandatory short parameter.
   */

  @DISPID(1611005960) //= 0x60060008. The runtime will prefer the VTID if present
  @VTID(36)
  void reportCheckAdvisor(
    short oReportCheckAdvisor);


  /**
   * @param ioAdminLevel Mandatory Holder<java.lang.String> parameter.
   * @param ioLocked Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005962) //= 0x6006000a. The runtime will prefer the VTID if present
  @VTID(37)
  boolean getReportCheckAdvisorInfo(
    Holder<java.lang.String> ioAdminLevel,
    Holder<java.lang.String> ioLocked);


  /**
   * @param iLocked Mandatory boolean parameter.
   */

  @DISPID(1611005963) //= 0x6006000b. The runtime will prefer the VTID if present
  @VTID(38)
  void setReportCheckAdvisorLock(
    boolean iLocked);


  /**
   * <p>
   * Getter method for the COM property "ReportParametersInformation"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(1611005964) //= 0x6006000c. The runtime will prefer the VTID if present
  @VTID(39)
  short reportParametersInformation();


  /**
   * <p>
   * Setter method for the COM property "ReportParametersInformation"
   * </p>
   * @param oReportParametersInformation Mandatory short parameter.
   */

  @DISPID(1611005964) //= 0x6006000c. The runtime will prefer the VTID if present
  @VTID(40)
  void reportParametersInformation(
    short oReportParametersInformation);


  /**
   * @param ioAdminLevel Mandatory Holder<java.lang.String> parameter.
   * @param ioLocked Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005966) //= 0x6006000e. The runtime will prefer the VTID if present
  @VTID(41)
  boolean getReportParametersInformationInfo(
    Holder<java.lang.String> ioAdminLevel,
    Holder<java.lang.String> ioLocked);


  /**
   * @param iLocked Mandatory boolean parameter.
   */

  @DISPID(1611005967) //= 0x6006000f. The runtime will prefer the VTID if present
  @VTID(42)
  void setReportParametersInformationLock(
    boolean iLocked);


  /**
   * <p>
   * Getter method for the COM property "ReportCheckExpert"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(1611005968) //= 0x60060010. The runtime will prefer the VTID if present
  @VTID(43)
  short reportCheckExpert();


  /**
   * <p>
   * Setter method for the COM property "ReportCheckExpert"
   * </p>
   * @param oReportCheckExpert Mandatory short parameter.
   */

  @DISPID(1611005968) //= 0x60060010. The runtime will prefer the VTID if present
  @VTID(44)
  void reportCheckExpert(
    short oReportCheckExpert);


  /**
   * @param ioAdminLevel Mandatory Holder<java.lang.String> parameter.
   * @param ioLocked Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005970) //= 0x60060012. The runtime will prefer the VTID if present
  @VTID(45)
  boolean getReportCheckExpertInfo(
    Holder<java.lang.String> ioAdminLevel,
    Holder<java.lang.String> ioLocked);


  /**
   * @param iLocked Mandatory boolean parameter.
   */

  @DISPID(1611005971) //= 0x60060013. The runtime will prefer the VTID if present
  @VTID(46)
  void setReportCheckExpertLock(
    boolean iLocked);


  /**
   * <p>
   * Getter method for the COM property "ReportPassedObjects"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(1611005972) //= 0x60060014. The runtime will prefer the VTID if present
  @VTID(47)
  short reportPassedObjects();


  /**
   * <p>
   * Setter method for the COM property "ReportPassedObjects"
   * </p>
   * @param oReportPassedObjects Mandatory short parameter.
   */

  @DISPID(1611005972) //= 0x60060014. The runtime will prefer the VTID if present
  @VTID(48)
  void reportPassedObjects(
    short oReportPassedObjects);


  /**
   * @param ioAdminLevel Mandatory Holder<java.lang.String> parameter.
   * @param ioLocked Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005974) //= 0x60060016. The runtime will prefer the VTID if present
  @VTID(49)
  boolean getReportPassedObjectsInfo(
    Holder<java.lang.String> ioAdminLevel,
    Holder<java.lang.String> ioLocked);


  /**
   * @param iLocked Mandatory boolean parameter.
   */

  @DISPID(1611005975) //= 0x60060017. The runtime will prefer the VTID if present
  @VTID(50)
  void setReportPassedObjectsLock(
    boolean iLocked);


  /**
   * <p>
   * Getter method for the COM property "ReportObjectsInformation"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(1611005976) //= 0x60060018. The runtime will prefer the VTID if present
  @VTID(51)
  short reportObjectsInformation();


  /**
   * <p>
   * Setter method for the COM property "ReportObjectsInformation"
   * </p>
   * @param oReportObjectsInformation Mandatory short parameter.
   */

  @DISPID(1611005976) //= 0x60060018. The runtime will prefer the VTID if present
  @VTID(52)
  void reportObjectsInformation(
    short oReportObjectsInformation);


  /**
   * @param ioAdminLevel Mandatory Holder<java.lang.String> parameter.
   * @param ioLocked Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005978) //= 0x6006001a. The runtime will prefer the VTID if present
  @VTID(53)
  boolean getReportObjectsInformationInfo(
    Holder<java.lang.String> ioAdminLevel,
    Holder<java.lang.String> ioLocked);


  /**
   * @param iLocked Mandatory boolean parameter.
   */

  @DISPID(1611005979) //= 0x6006001b. The runtime will prefer the VTID if present
  @VTID(54)
  void setReportObjectsInformationLock(
    boolean iLocked);


  /**
   * <p>
   * Getter method for the COM property "ReportHtmlInCatiaSession"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(1611005980) //= 0x6006001c. The runtime will prefer the VTID if present
  @VTID(55)
  short reportHtmlInCatiaSession();


  /**
   * <p>
   * Setter method for the COM property "ReportHtmlInCatiaSession"
   * </p>
   * @param oReportHtmlInCatiaSession Mandatory short parameter.
   */

  @DISPID(1611005980) //= 0x6006001c. The runtime will prefer the VTID if present
  @VTID(56)
  void reportHtmlInCatiaSession(
    short oReportHtmlInCatiaSession);


  /**
   * @param ioAdminLevel Mandatory Holder<java.lang.String> parameter.
   * @param ioLocked Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005982) //= 0x6006001e. The runtime will prefer the VTID if present
  @VTID(57)
  boolean getReportHtmlInCatiaSessionInfo(
    Holder<java.lang.String> ioAdminLevel,
    Holder<java.lang.String> ioLocked);


  /**
   * @param iLocked Mandatory boolean parameter.
   */

  @DISPID(1611005983) //= 0x6006001f. The runtime will prefer the VTID if present
  @VTID(58)
  void setReportHtmlInCatiaSessionLock(
    boolean iLocked);


  /**
   * <p>
   * Getter method for the COM property "DirectoryForInputXsl"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1611005984) //= 0x60060020. The runtime will prefer the VTID if present
  @VTID(59)
  java.lang.String directoryForInputXsl();


  /**
   * <p>
   * Setter method for the COM property "DirectoryForInputXsl"
   * </p>
   * @param oDirectoryForInputXsl Mandatory Holder<java.lang.String> parameter.
   */

  @DISPID(1611005984) //= 0x60060020. The runtime will prefer the VTID if present
  @VTID(60)
  void directoryForInputXsl(
    Holder<java.lang.String> oDirectoryForInputXsl);


  /**
   * @param ioAdminLevel Mandatory Holder<java.lang.String> parameter.
   * @param ioLocked Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005986) //= 0x60060022. The runtime will prefer the VTID if present
  @VTID(61)
  boolean getDirectoryForInputXslInfo(
    Holder<java.lang.String> ioAdminLevel,
    Holder<java.lang.String> ioLocked);


  /**
   * @param iLocked Mandatory boolean parameter.
   */

  @DISPID(1611005987) //= 0x60060023. The runtime will prefer the VTID if present
  @VTID(62)
  void setDirectoryForInputXslLock(
    boolean iLocked);


  /**
   * <p>
   * Getter method for the COM property "ReportOutputDirectory"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1611005988) //= 0x60060024. The runtime will prefer the VTID if present
  @VTID(63)
  java.lang.String reportOutputDirectory();


  /**
   * <p>
   * Setter method for the COM property "ReportOutputDirectory"
   * </p>
   * @param oReportOutputDirectory Mandatory Holder<java.lang.String> parameter.
   */

  @DISPID(1611005988) //= 0x60060024. The runtime will prefer the VTID if present
  @VTID(64)
  void reportOutputDirectory(
    Holder<java.lang.String> oReportOutputDirectory);


  /**
   * @param ioAdminLevel Mandatory Holder<java.lang.String> parameter.
   * @param ioLocked Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005990) //= 0x60060026. The runtime will prefer the VTID if present
  @VTID(65)
  boolean getReportOutputDirectoryInfo(
    Holder<java.lang.String> ioAdminLevel,
    Holder<java.lang.String> ioLocked);


  /**
   * @param iLocked Mandatory boolean parameter.
   */

  @DISPID(1611005991) //= 0x60060027. The runtime will prefer the VTID if present
  @VTID(66)
  void setReportOutputDirectoryLock(
    boolean iLocked);


  // Properties:
}
