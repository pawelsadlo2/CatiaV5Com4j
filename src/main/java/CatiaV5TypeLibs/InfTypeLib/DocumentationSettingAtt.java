package CatiaV5TypeLibs.InfTypeLib;

import com4j.*;

@IID("{C0932599-2B2A-49D2-ACCB-8F2D4CC0BDD8}")
public interface DocumentationSettingAtt extends SettingController {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "TechnicalDocumentationPath"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(27)
  java.lang.String technicalDocumentationPath();


  /**
   * <p>
   * Setter method for the COM property "TechnicalDocumentationPath"
   * </p>
   * @param ioDocPath Mandatory Holder<java.lang.String> parameter.
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(28)
  void technicalDocumentationPath(
    Holder<java.lang.String> ioDocPath);


  /**
   * @param ioAdminLevel Mandatory Holder<java.lang.String> parameter.
   * @param ioLocked Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005954) //= 0x60060002. The runtime will prefer the VTID if present
  @VTID(29)
  boolean getTechnicalDocumentationPathInfo(
    Holder<java.lang.String> ioAdminLevel,
    Holder<java.lang.String> ioLocked);


  /**
   * @param iLocked Mandatory boolean parameter.
   */

  @DISPID(1611005955) //= 0x60060003. The runtime will prefer the VTID if present
  @VTID(30)
  void setTechnicalDocumentationPathLock(
    boolean iLocked);


  /**
   * <p>
   * Getter method for the COM property "DocLanguage"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611005956) //= 0x60060004. The runtime will prefer the VTID if present
  @VTID(31)
  int docLanguage();


  /**
   * <p>
   * Setter method for the COM property "DocLanguage"
   * </p>
   * @param oDocLang Mandatory int parameter.
   */

  @DISPID(1611005956) //= 0x60060004. The runtime will prefer the VTID if present
  @VTID(32)
  void docLanguage(
    int oDocLang);


  /**
   * @param ioAdminLevel Mandatory Holder<java.lang.String> parameter.
   * @param ioLocked Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005958) //= 0x60060006. The runtime will prefer the VTID if present
  @VTID(33)
  boolean getDocLanguageInfo(
    Holder<java.lang.String> ioAdminLevel,
    Holder<java.lang.String> ioLocked);


  /**
   * @param iLocked Mandatory boolean parameter.
   */

  @DISPID(1611005959) //= 0x60060007. The runtime will prefer the VTID if present
  @VTID(34)
  void setDocLanguageLock(
    boolean iLocked);


  /**
   * <p>
   * Getter method for the COM property "CompanionPath"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1611005960) //= 0x60060008. The runtime will prefer the VTID if present
  @VTID(35)
  java.lang.String companionPath();


  /**
   * <p>
   * Setter method for the COM property "CompanionPath"
   * </p>
   * @param ioUserCompPath Mandatory Holder<java.lang.String> parameter.
   */

  @DISPID(1611005960) //= 0x60060008. The runtime will prefer the VTID if present
  @VTID(36)
  void companionPath(
    Holder<java.lang.String> ioUserCompPath);


  /**
   * @param ioAdminLevel Mandatory Holder<java.lang.String> parameter.
   * @param ioLocked Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005962) //= 0x6006000a. The runtime will prefer the VTID if present
  @VTID(37)
  boolean getCompanionPathInfo(
    Holder<java.lang.String> ioAdminLevel,
    Holder<java.lang.String> ioLocked);


  /**
   * @param iLocked Mandatory boolean parameter.
   */

  @DISPID(1611005963) //= 0x6006000b. The runtime will prefer the VTID if present
  @VTID(38)
  void setCompanionPathLock(
    boolean iLocked);


  /**
   * <p>
   * Getter method for the COM property "Priority"
   * </p>
   * @return  Returns a value of type CATDocContextualPriority
   */

  @DISPID(1611005964) //= 0x6006000c. The runtime will prefer the VTID if present
  @VTID(39)
  CATDocContextualPriority priority();


  /**
   * <p>
   * Setter method for the COM property "Priority"
   * </p>
   * @param oPriority Mandatory CATDocContextualPriority parameter.
   */

  @DISPID(1611005964) //= 0x6006000c. The runtime will prefer the VTID if present
  @VTID(40)
  void priority(
    CATDocContextualPriority oPriority);


  /**
   * @param ioAdminLevel Mandatory Holder<java.lang.String> parameter.
   * @param ioLocked Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005966) //= 0x6006000e. The runtime will prefer the VTID if present
  @VTID(41)
  boolean getPriorityInfo(
    Holder<java.lang.String> ioAdminLevel,
    Holder<java.lang.String> ioLocked);


  /**
   * @param iLocked Mandatory boolean parameter.
   */

  @DISPID(1611005967) //= 0x6006000f. The runtime will prefer the VTID if present
  @VTID(42)
  void setPriorityLock(
    boolean iLocked);


  // Properties:
}
