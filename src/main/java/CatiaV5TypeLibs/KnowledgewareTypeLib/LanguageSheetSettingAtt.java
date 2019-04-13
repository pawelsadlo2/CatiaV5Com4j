package CatiaV5TypeLibs.KnowledgewareTypeLib;
import CatiaV5TypeLibs.InfTypeLib.*;

import com4j.*;

@IID("{8E470660-F986-4443-BB0B-C4D3EA97E070}")
public interface LanguageSheetSettingAtt extends SettingController {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "LoadExtendedLanguageLib"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(27)
  short loadExtendedLanguageLib();


  /**
   * <p>
   * Setter method for the COM property "LoadExtendedLanguageLib"
   * </p>
   * @param oLoadExtendedLanguageLib Mandatory short parameter.
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(28)
  void loadExtendedLanguageLib(
    short oLoadExtendedLanguageLib);


  /**
   * @param ioAdminLevel Mandatory Holder<java.lang.String> parameter.
   * @param ioLocked Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005954) //= 0x60060002. The runtime will prefer the VTID if present
  @VTID(29)
  boolean getLoadExtendedLanguageLibInfo(
    Holder<java.lang.String> ioAdminLevel,
    Holder<java.lang.String> ioLocked);


  /**
   * @param iLocked Mandatory boolean parameter.
   */

  @DISPID(1611005955) //= 0x60060003. The runtime will prefer the VTID if present
  @VTID(30)
  void setLoadExtendedLanguageLibLock(
    boolean iLocked);


  /**
   * <p>
   * Getter method for the COM property "LoadAllPackages"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(1611005956) //= 0x60060004. The runtime will prefer the VTID if present
  @VTID(31)
  short loadAllPackages();


  /**
   * <p>
   * Setter method for the COM property "LoadAllPackages"
   * </p>
   * @param oLoadAllPackages Mandatory short parameter.
   */

  @DISPID(1611005956) //= 0x60060004. The runtime will prefer the VTID if present
  @VTID(32)
  void loadAllPackages(
    short oLoadAllPackages);


  /**
   * @param ioAdminLevel Mandatory Holder<java.lang.String> parameter.
   * @param ioLocked Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005958) //= 0x60060006. The runtime will prefer the VTID if present
  @VTID(33)
  boolean getLoadAllPackagesInfo(
    Holder<java.lang.String> ioAdminLevel,
    Holder<java.lang.String> ioLocked);


  /**
   * @param iLocked Mandatory boolean parameter.
   */

  @DISPID(1611005959) //= 0x60060007. The runtime will prefer the VTID if present
  @VTID(34)
  void setLoadAllPackagesLock(
    boolean iLocked);


  /**
   * <p>
   * Getter method for the COM property "ListOfPackagesToLoad"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1611005960) //= 0x60060008. The runtime will prefer the VTID if present
  @VTID(35)
  java.lang.String listOfPackagesToLoad();


  /**
   * <p>
   * Setter method for the COM property "ListOfPackagesToLoad"
   * </p>
   * @param oListOfPackagesToLoad Mandatory Holder<java.lang.String> parameter.
   */

  @DISPID(1611005960) //= 0x60060008. The runtime will prefer the VTID if present
  @VTID(36)
  void listOfPackagesToLoad(
    Holder<java.lang.String> oListOfPackagesToLoad);


  /**
   * @param ioAdminLevel Mandatory Holder<java.lang.String> parameter.
   * @param ioLocked Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005962) //= 0x6006000a. The runtime will prefer the VTID if present
  @VTID(37)
  boolean getListOfPackagesToLoadInfo(
    Holder<java.lang.String> ioAdminLevel,
    Holder<java.lang.String> ioLocked);


  /**
   * @param iLocked Mandatory boolean parameter.
   */

  @DISPID(1611005963) //= 0x6006000b. The runtime will prefer the VTID if present
  @VTID(38)
  void setListOfPackagesToLoadLock(
    boolean iLocked);


  /**
   * <p>
   * Getter method for the COM property "ReferenceDirectoryForTypes"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1611005964) //= 0x6006000c. The runtime will prefer the VTID if present
  @VTID(39)
  java.lang.String referenceDirectoryForTypes();


  /**
   * <p>
   * Setter method for the COM property "ReferenceDirectoryForTypes"
   * </p>
   * @param oReferenceDirectoryForTypes Mandatory Holder<java.lang.String> parameter.
   */

  @DISPID(1611005964) //= 0x6006000c. The runtime will prefer the VTID if present
  @VTID(40)
  void referenceDirectoryForTypes(
    Holder<java.lang.String> oReferenceDirectoryForTypes);


  /**
   * @param ioAdminLevel Mandatory Holder<java.lang.String> parameter.
   * @param ioLocked Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005966) //= 0x6006000e. The runtime will prefer the VTID if present
  @VTID(41)
  boolean getReferenceDirectoryForTypesInfo(
    Holder<java.lang.String> ioAdminLevel,
    Holder<java.lang.String> ioLocked);


  /**
   * @param iLocked Mandatory boolean parameter.
   */

  @DISPID(1611005967) //= 0x6006000f. The runtime will prefer the VTID if present
  @VTID(42)
  void setReferenceDirectoryForTypesLock(
    boolean iLocked);


  /**
   * <p>
   * Getter method for the COM property "KnowledgeBuildPathDirectory"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1611005968) //= 0x60060010. The runtime will prefer the VTID if present
  @VTID(43)
  java.lang.String knowledgeBuildPathDirectory();


  /**
   * <p>
   * Setter method for the COM property "KnowledgeBuildPathDirectory"
   * </p>
   * @param oKnowledgeBuildPathDirectory Mandatory Holder<java.lang.String> parameter.
   */

  @DISPID(1611005968) //= 0x60060010. The runtime will prefer the VTID if present
  @VTID(44)
  void knowledgeBuildPathDirectory(
    Holder<java.lang.String> oKnowledgeBuildPathDirectory);


  /**
   * @param ioAdminLevel Mandatory Holder<java.lang.String> parameter.
   * @param ioLocked Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005970) //= 0x60060012. The runtime will prefer the VTID if present
  @VTID(45)
  boolean getKnowledgeBuildPathDirectoryInfo(
    Holder<java.lang.String> ioAdminLevel,
    Holder<java.lang.String> ioLocked);


  /**
   * @param iLocked Mandatory boolean parameter.
   */

  @DISPID(1611005971) //= 0x60060013. The runtime will prefer the VTID if present
  @VTID(46)
  void setKnowledgeBuildPathDirectoryLock(
    boolean iLocked);


  // Properties:
}
