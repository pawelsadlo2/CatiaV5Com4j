package CatiaV5TypeLibs.InfItfTypeLib;

import com4j.*;

@IID("{687CDF4E-5490-4D2B-8ABB-4224D607C2F6}")
public interface VrmlSettingAtt extends SettingController {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "ImportUnit"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(27)
  int importUnit();


  /**
   * <p>
   * Setter method for the COM property "ImportUnit"
   * </p>
   * @param oImportUnit Mandatory int parameter.
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(28)
  void importUnit(
    int oImportUnit);


  /**
   * @param ioAdminLevel Mandatory Holder<java.lang.String> parameter.
   * @param ioLocked Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005954) //= 0x60060002. The runtime will prefer the VTID if present
  @VTID(29)
  boolean getImportUnitInfo(
    Holder<java.lang.String> ioAdminLevel,
    Holder<java.lang.String> ioLocked);


  /**
   * @param iLocked Mandatory boolean parameter.
   */

  @DISPID(1611005955) //= 0x60060003. The runtime will prefer the VTID if present
  @VTID(30)
  void setImportUnitLock(
    boolean iLocked);


  /**
   * <p>
   * Getter method for the COM property "ImportCreaseAngle"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(1611005956) //= 0x60060004. The runtime will prefer the VTID if present
  @VTID(31)
  double importCreaseAngle();


  /**
   * <p>
   * Setter method for the COM property "ImportCreaseAngle"
   * </p>
   * @param oImportCreaseAngle Mandatory double parameter.
   */

  @DISPID(1611005956) //= 0x60060004. The runtime will prefer the VTID if present
  @VTID(32)
  void importCreaseAngle(
    double oImportCreaseAngle);


  /**
   * @param ioAdminLevel Mandatory Holder<java.lang.String> parameter.
   * @param ioLocked Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005958) //= 0x60060006. The runtime will prefer the VTID if present
  @VTID(33)
  boolean getImportCreaseAngleInfo(
    Holder<java.lang.String> ioAdminLevel,
    Holder<java.lang.String> ioLocked);


  /**
   * @param iLocked Mandatory boolean parameter.
   */

  @DISPID(1611005959) //= 0x60060007. The runtime will prefer the VTID if present
  @VTID(34)
  void setImportCreaseAngleLock(
    boolean iLocked);


  /**
   * <p>
   * Getter method for the COM property "ExportVersion"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611005960) //= 0x60060008. The runtime will prefer the VTID if present
  @VTID(35)
  int exportVersion();


  /**
   * <p>
   * Setter method for the COM property "ExportVersion"
   * </p>
   * @param oExportVersion Mandatory int parameter.
   */

  @DISPID(1611005960) //= 0x60060008. The runtime will prefer the VTID if present
  @VTID(36)
  void exportVersion(
    int oExportVersion);


  /**
   * @param ioAdminLevel Mandatory Holder<java.lang.String> parameter.
   * @param ioLocked Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005962) //= 0x6006000a. The runtime will prefer the VTID if present
  @VTID(37)
  boolean getExportVersionInfo(
    Holder<java.lang.String> ioAdminLevel,
    Holder<java.lang.String> ioLocked);


  /**
   * @param iLocked Mandatory boolean parameter.
   */

  @DISPID(1611005963) //= 0x6006000b. The runtime will prefer the VTID if present
  @VTID(38)
  void setExportVersionLock(
    boolean iLocked);


  /**
   * <p>
   * Getter method for the COM property "ExportNormals"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005964) //= 0x6006000c. The runtime will prefer the VTID if present
  @VTID(39)
  boolean exportNormals();


  /**
   * <p>
   * Setter method for the COM property "ExportNormals"
   * </p>
   * @param oExportNormals Mandatory boolean parameter.
   */

  @DISPID(1611005964) //= 0x6006000c. The runtime will prefer the VTID if present
  @VTID(40)
  void exportNormals(
    boolean oExportNormals);


  /**
   * @param ioAdminLevel Mandatory Holder<java.lang.String> parameter.
   * @param ioLocked Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005966) //= 0x6006000e. The runtime will prefer the VTID if present
  @VTID(41)
  boolean getExportNormalsInfo(
    Holder<java.lang.String> ioAdminLevel,
    Holder<java.lang.String> ioLocked);


  /**
   * @param iLocked Mandatory boolean parameter.
   */

  @DISPID(1611005967) //= 0x6006000f. The runtime will prefer the VTID if present
  @VTID(42)
  void setExportNormalsLock(
    boolean iLocked);


  /**
   * <p>
   * Getter method for the COM property "ExportEdges"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005968) //= 0x60060010. The runtime will prefer the VTID if present
  @VTID(43)
  boolean exportEdges();


  /**
   * <p>
   * Setter method for the COM property "ExportEdges"
   * </p>
   * @param oExportEdges Mandatory boolean parameter.
   */

  @DISPID(1611005968) //= 0x60060010. The runtime will prefer the VTID if present
  @VTID(44)
  void exportEdges(
    boolean oExportEdges);


  /**
   * @param ioAdminLevel Mandatory Holder<java.lang.String> parameter.
   * @param ioLocked Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005970) //= 0x60060012. The runtime will prefer the VTID if present
  @VTID(45)
  boolean getExportEdgesInfo(
    Holder<java.lang.String> ioAdminLevel,
    Holder<java.lang.String> ioLocked);


  /**
   * @param iLocked Mandatory boolean parameter.
   */

  @DISPID(1611005971) //= 0x60060013. The runtime will prefer the VTID if present
  @VTID(46)
  void setExportEdgesLock(
    boolean iLocked);


  /**
   * <p>
   * Getter method for the COM property "ExportTexture"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005972) //= 0x60060014. The runtime will prefer the VTID if present
  @VTID(47)
  boolean exportTexture();


  /**
   * <p>
   * Setter method for the COM property "ExportTexture"
   * </p>
   * @param oExportTexture Mandatory boolean parameter.
   */

  @DISPID(1611005972) //= 0x60060014. The runtime will prefer the VTID if present
  @VTID(48)
  void exportTexture(
    boolean oExportTexture);


  /**
   * @param ioAdminLevel Mandatory Holder<java.lang.String> parameter.
   * @param ioLocked Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005974) //= 0x60060016. The runtime will prefer the VTID if present
  @VTID(49)
  boolean getExportTextureInfo(
    Holder<java.lang.String> ioAdminLevel,
    Holder<java.lang.String> ioLocked);


  /**
   * @param iLocked Mandatory boolean parameter.
   */

  @DISPID(1611005975) //= 0x60060017. The runtime will prefer the VTID if present
  @VTID(50)
  void setExportTextureLock(
    boolean iLocked);


  /**
   * <p>
   * Getter method for the COM property "ExportTextureFile"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611005976) //= 0x60060018. The runtime will prefer the VTID if present
  @VTID(51)
  int exportTextureFile();


  /**
   * <p>
   * Setter method for the COM property "ExportTextureFile"
   * </p>
   * @param oExportTextureFile Mandatory int parameter.
   */

  @DISPID(1611005976) //= 0x60060018. The runtime will prefer the VTID if present
  @VTID(52)
  void exportTextureFile(
    int oExportTextureFile);


  /**
   * @param ioAdminLevel Mandatory Holder<java.lang.String> parameter.
   * @param ioLocked Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005978) //= 0x6006001a. The runtime will prefer the VTID if present
  @VTID(53)
  boolean getExportTextureFileInfo(
    Holder<java.lang.String> ioAdminLevel,
    Holder<java.lang.String> ioLocked);


  /**
   * @param iLocked Mandatory boolean parameter.
   */

  @DISPID(1611005979) //= 0x6006001b. The runtime will prefer the VTID if present
  @VTID(54)
  void setExportTextureFileLock(
    boolean iLocked);


  /**
   * <p>
   * Getter method for the COM property "ExportTextureFormat"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611005980) //= 0x6006001c. The runtime will prefer the VTID if present
  @VTID(55)
  int exportTextureFormat();


  /**
   * <p>
   * Setter method for the COM property "ExportTextureFormat"
   * </p>
   * @param oExportTextureFormat Mandatory int parameter.
   */

  @DISPID(1611005980) //= 0x6006001c. The runtime will prefer the VTID if present
  @VTID(56)
  void exportTextureFormat(
    int oExportTextureFormat);


  /**
   * @param ioAdminLevel Mandatory Holder<java.lang.String> parameter.
   * @param ioLocked Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005982) //= 0x6006001e. The runtime will prefer the VTID if present
  @VTID(57)
  boolean getExportTextureFormatInfo(
    Holder<java.lang.String> ioAdminLevel,
    Holder<java.lang.String> ioLocked);


  /**
   * @param iLocked Mandatory boolean parameter.
   */

  @DISPID(1611005983) //= 0x6006001f. The runtime will prefer the VTID if present
  @VTID(58)
  void setExportTextureFormatLock(
    boolean iLocked);


  /**
   * @param ioR Mandatory Holder<Integer> parameter.
   * @param ioG Mandatory Holder<Integer> parameter.
   * @param ioB Mandatory Holder<Integer> parameter.
   */

  @DISPID(1611005984) //= 0x60060020. The runtime will prefer the VTID if present
  @VTID(59)
  void getExportBackgroundColor(
    Holder<Integer> ioR,
    Holder<Integer> ioG,
    Holder<Integer> ioB);


  /**
   * @param iR Mandatory int parameter.
   * @param iG Mandatory int parameter.
   * @param iB Mandatory int parameter.
   */

  @DISPID(1611005985) //= 0x60060021. The runtime will prefer the VTID if present
  @VTID(60)
  void setExportBackgroundColor(
    int iR,
    int iG,
    int iB);


  /**
   * @param ioAdminLevel Mandatory Holder<java.lang.String> parameter.
   * @param ioLocked Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005986) //= 0x60060022. The runtime will prefer the VTID if present
  @VTID(61)
  boolean getExportBackgroundColorInfo(
    Holder<java.lang.String> ioAdminLevel,
    Holder<java.lang.String> ioLocked);


  /**
   * @param iLocked Mandatory boolean parameter.
   */

  @DISPID(1611005987) //= 0x60060023. The runtime will prefer the VTID if present
  @VTID(62)
  void setExportBackgroundColorLock(
    boolean iLocked);


  // Properties:
}
