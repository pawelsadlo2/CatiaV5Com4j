package CatiaV5TypeLibs.InfTypeLib;

import com4j.*;

@IID("{8BA73233-1D0D-4BC1-ACC6-E31BD2BF3AE2}")
public interface CacheSettingAtt extends SettingController {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "ActivationMode"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(27)
  boolean activationMode();


  /**
   * <p>
   * Setter method for the COM property "ActivationMode"
   * </p>
   * @param oIsActive Mandatory boolean parameter.
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(28)
  void activationMode(
    boolean oIsActive);


  /**
   * @param iLocked Mandatory boolean parameter.
   */

  @DISPID(1611005954) //= 0x60060002. The runtime will prefer the VTID if present
  @VTID(29)
  void setActivationModeLock(
    boolean iLocked);


  /**
   * @param adminLevel Mandatory Holder<java.lang.String> parameter.
   * @param oLocked Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005955) //= 0x60060003. The runtime will prefer the VTID if present
  @VTID(30)
  boolean getActivationModeInfo(
    Holder<java.lang.String> adminLevel,
    Holder<java.lang.String> oLocked);


  /**
   * <p>
   * Getter method for the COM property "LocalPath"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1611005956) //= 0x60060004. The runtime will prefer the VTID if present
  @VTID(31)
  java.lang.String localPath();


  /**
   * <p>
   * Setter method for the COM property "LocalPath"
   * </p>
   * @param oLocalPath Mandatory Holder<java.lang.String> parameter.
   */

  @DISPID(1611005956) //= 0x60060004. The runtime will prefer the VTID if present
  @VTID(32)
  void localPath(
    Holder<java.lang.String> oLocalPath);


  /**
   * @param iLocked Mandatory boolean parameter.
   */

  @DISPID(1611005958) //= 0x60060006. The runtime will prefer the VTID if present
  @VTID(33)
  void setLocalPathLock(
    boolean iLocked);


  /**
   * @param adminLevel Mandatory Holder<java.lang.String> parameter.
   * @param oLocked Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005959) //= 0x60060007. The runtime will prefer the VTID if present
  @VTID(34)
  boolean getLocalPathInfo(
    Holder<java.lang.String> adminLevel,
    Holder<java.lang.String> oLocked);


  /**
   * @return  Returns a value of type java.lang.Object[]
   */

  @DISPID(1611005960) //= 0x60060008. The runtime will prefer the VTID if present
  @VTID(35)
  java.lang.Object[] getReleasePath();


  /**
   * @param iRelPath Mandatory java.lang.Object[] parameter.
   */

  @DISPID(1611005961) //= 0x60060009. The runtime will prefer the VTID if present
  @VTID(36)
  void putReleasePath(
    java.lang.Object[] iRelPath);


  /**
   * @param iLocked Mandatory boolean parameter.
   */

  @DISPID(1611005962) //= 0x6006000a. The runtime will prefer the VTID if present
  @VTID(37)
  void setReleasePathLock(
    boolean iLocked);


  /**
   * @param adminLevel Mandatory Holder<java.lang.String> parameter.
   * @param locked Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005963) //= 0x6006000b. The runtime will prefer the VTID if present
  @VTID(38)
  boolean getReleasePathInfo(
    Holder<java.lang.String> adminLevel,
    Holder<java.lang.String> locked);


  /**
   * <p>
   * Getter method for the COM property "SizeControl"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005964) //= 0x6006000c. The runtime will prefer the VTID if present
  @VTID(39)
  boolean sizeControl();


  /**
   * <p>
   * Setter method for the COM property "SizeControl"
   * </p>
   * @param oIsActive Mandatory boolean parameter.
   */

  @DISPID(1611005964) //= 0x6006000c. The runtime will prefer the VTID if present
  @VTID(40)
  void sizeControl(
    boolean oIsActive);


  /**
   * @param iLocked Mandatory boolean parameter.
   */

  @DISPID(1611005966) //= 0x6006000e. The runtime will prefer the VTID if present
  @VTID(41)
  void setSizeControlLock(
    boolean iLocked);


  /**
   * @param adminLevel Mandatory Holder<java.lang.String> parameter.
   * @param oLocked Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005967) //= 0x6006000f. The runtime will prefer the VTID if present
  @VTID(42)
  boolean getSizeControlInfo(
    Holder<java.lang.String> adminLevel,
    Holder<java.lang.String> oLocked);


  /**
   * <p>
   * Getter method for the COM property "CacheMaxSizeMo"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611005968) //= 0x60060010. The runtime will prefer the VTID if present
  @VTID(43)
  int cacheMaxSizeMo();


  /**
   * <p>
   * Setter method for the COM property "CacheMaxSizeMo"
   * </p>
   * @param oValue Mandatory int parameter.
   */

  @DISPID(1611005968) //= 0x60060010. The runtime will prefer the VTID if present
  @VTID(44)
  void cacheMaxSizeMo(
    int oValue);


  /**
   * @param iLocked Mandatory boolean parameter.
   */

  @DISPID(1611005970) //= 0x60060012. The runtime will prefer the VTID if present
  @VTID(45)
  void setCacheMaxSizeMoLock(
    boolean iLocked);


  /**
   * @param adminLevel Mandatory Holder<java.lang.String> parameter.
   * @param oLocked Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005971) //= 0x60060013. The runtime will prefer the VTID if present
  @VTID(46)
  boolean getCacheMaxSizeMoInfo(
    Holder<java.lang.String> adminLevel,
    Holder<java.lang.String> oLocked);


  /**
   * <p>
   * Getter method for the COM property "TimestampMode"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005972) //= 0x60060014. The runtime will prefer the VTID if present
  @VTID(47)
  boolean timestampMode();


  /**
   * <p>
   * Setter method for the COM property "TimestampMode"
   * </p>
   * @param oTimeStampOn Mandatory boolean parameter.
   */

  @DISPID(1611005972) //= 0x60060014. The runtime will prefer the VTID if present
  @VTID(48)
  void timestampMode(
    boolean oTimeStampOn);


  /**
   * @param iLocked Mandatory boolean parameter.
   */

  @DISPID(1611005974) //= 0x60060016. The runtime will prefer the VTID if present
  @VTID(49)
  void setTimestampModeLock(
    boolean iLocked);


  /**
   * @param adminLevel Mandatory Holder<java.lang.String> parameter.
   * @param oLocked Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005975) //= 0x60060017. The runtime will prefer the VTID if present
  @VTID(50)
  boolean getTimestampModeInfo(
    Holder<java.lang.String> adminLevel,
    Holder<java.lang.String> oLocked);


  /**
   * <p>
   * Getter method for the COM property "UTCTimeFormat"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005976) //= 0x60060018. The runtime will prefer the VTID if present
  @VTID(51)
  boolean utcTimeFormat();


  /**
   * <p>
   * Setter method for the COM property "UTCTimeFormat"
   * </p>
   * @param oTimeStampOn Mandatory boolean parameter.
   */

  @DISPID(1611005976) //= 0x60060018. The runtime will prefer the VTID if present
  @VTID(52)
  void utcTimeFormat(
    boolean oTimeStampOn);


  /**
   * @param iLocked Mandatory boolean parameter.
   */

  @DISPID(1611005978) //= 0x6006001a. The runtime will prefer the VTID if present
  @VTID(53)
  void setUTCTimeFormatLock(
    boolean iLocked);


  /**
   * @param adminLevel Mandatory Holder<java.lang.String> parameter.
   * @param oLocked Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005979) //= 0x6006001b. The runtime will prefer the VTID if present
  @VTID(54)
  boolean getUTCTimeFormatInfo(
    Holder<java.lang.String> adminLevel,
    Holder<java.lang.String> oLocked);


  /**
   * <p>
   * Getter method for the COM property "LODMode"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005980) //= 0x6006001c. The runtime will prefer the VTID if present
  @VTID(55)
  boolean lodMode();


  /**
   * <p>
   * Setter method for the COM property "LODMode"
   * </p>
   * @param oMode Mandatory boolean parameter.
   */

  @DISPID(1611005980) //= 0x6006001c. The runtime will prefer the VTID if present
  @VTID(56)
  void lodMode(
    boolean oMode);


  /**
   * @param iLocked Mandatory boolean parameter.
   */

  @DISPID(1611005982) //= 0x6006001e. The runtime will prefer the VTID if present
  @VTID(57)
  void setLODModeLock(
    boolean iLocked);


  /**
   * @param adminLevel Mandatory Holder<java.lang.String> parameter.
   * @param oLocked Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005983) //= 0x6006001f. The runtime will prefer the VTID if present
  @VTID(58)
  boolean getLODModeInfo(
    Holder<java.lang.String> adminLevel,
    Holder<java.lang.String> oLocked);


  /**
   * <p>
   * Getter method for the COM property "ReleasedVoxel"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(1611005984) //= 0x60060020. The runtime will prefer the VTID if present
  @VTID(59)
  float releasedVoxel();


  /**
   * <p>
   * Setter method for the COM property "ReleasedVoxel"
   * </p>
   * @param oVoxel Mandatory float parameter.
   */

  @DISPID(1611005984) //= 0x60060020. The runtime will prefer the VTID if present
  @VTID(60)
  void releasedVoxel(
    float oVoxel);


  /**
   * @param iLocked Mandatory boolean parameter.
   */

  @DISPID(1611005986) //= 0x60060022. The runtime will prefer the VTID if present
  @VTID(61)
  void setReleasedVoxelLock(
    boolean iLocked);


  /**
   * @param adminLevel Mandatory Holder<java.lang.String> parameter.
   * @param oLocked Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005987) //= 0x60060023. The runtime will prefer the VTID if present
  @VTID(62)
  boolean getReleasedVoxelInfo(
    Holder<java.lang.String> adminLevel,
    Holder<java.lang.String> oLocked);


  // Properties:
}
