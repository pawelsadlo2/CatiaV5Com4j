package CatiaV5TypeLibs.InfItfTypeLib;

import com4j.*;

@IID("{EBB4B244-54F1-4785-AB69-0ABD662347DA}")
public interface MacrosSettingAtt extends SettingController {
  // Methods:
  /**
   * @param iLanguage Mandatory CATScriptLanguage parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(27)
  java.lang.String getLanguageEditor(
    CATScriptLanguage iLanguage);


  /**
   * @param iLanguage Mandatory CATScriptLanguage parameter.
   * @param iEditorPath Mandatory Holder<java.lang.String> parameter.
   */

  @DISPID(1611005953) //= 0x60060001. The runtime will prefer the VTID if present
  @VTID(28)
  void setLanguageEditor(
    CATScriptLanguage iLanguage,
    Holder<java.lang.String> iEditorPath);


  /**
   * @param iLocked Mandatory boolean parameter.
   */

  @DISPID(1611005954) //= 0x60060002. The runtime will prefer the VTID if present
  @VTID(29)
  void setLanguageEditorLock(
    boolean iLocked);


  /**
   * @param adminLevel Mandatory Holder<java.lang.String> parameter.
   * @param oLocked Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005955) //= 0x60060003. The runtime will prefer the VTID if present
  @VTID(30)
  boolean getLanguageEditorInfo(
    Holder<java.lang.String> adminLevel,
    Holder<java.lang.String> oLocked);


  /**
   * @return  Returns a value of type java.lang.Object[]
   */

  @DISPID(1611005956) //= 0x60060004. The runtime will prefer the VTID if present
  @VTID(31)
  java.lang.Object[] getExternalReferences();


  /**
   * @param iReferences Mandatory java.lang.Object[] parameter.
   */

  @DISPID(1611005957) //= 0x60060005. The runtime will prefer the VTID if present
  @VTID(32)
  void setExternalReferences(
    java.lang.Object[] iReferences);


  /**
   * @param iLocked Mandatory boolean parameter.
   */

  @DISPID(1611005958) //= 0x60060006. The runtime will prefer the VTID if present
  @VTID(33)
  void setExternalReferencesLock(
    boolean iLocked);


  /**
   * @param adminLevel Mandatory Holder<java.lang.String> parameter.
   * @param oLocked Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005959) //= 0x60060007. The runtime will prefer the VTID if present
  @VTID(34)
  boolean getExternalReferencesInfo(
    Holder<java.lang.String> adminLevel,
    Holder<java.lang.String> oLocked);


  /**
   * @return  Returns a value of type java.lang.Object[]
   */

  @DISPID(1611005960) //= 0x60060008. The runtime will prefer the VTID if present
  @VTID(35)
  java.lang.Object[] getDefaultMacroLibraries();


  /**
   * @param iLibraries Mandatory java.lang.Object[] parameter.
   */

  @DISPID(1611005961) //= 0x60060009. The runtime will prefer the VTID if present
  @VTID(36)
  void setDefaultMacroLibraries(
    java.lang.Object[] iLibraries);


  /**
   * @param iLocked Mandatory boolean parameter.
   */

  @DISPID(1611005962) //= 0x6006000a. The runtime will prefer the VTID if present
  @VTID(37)
  void setDefaultMacroLibrariesLock(
    boolean iLocked);


  /**
   * @param adminLevel Mandatory Holder<java.lang.String> parameter.
   * @param oLocked Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005963) //= 0x6006000b. The runtime will prefer the VTID if present
  @VTID(38)
  boolean getDefaultMacroLibrariesInfo(
    Holder<java.lang.String> adminLevel,
    Holder<java.lang.String> oLocked);


  // Properties:
}
