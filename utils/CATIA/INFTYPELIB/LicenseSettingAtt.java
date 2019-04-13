import com4j.*;

@IID("{F795B0AA-3C3B-42F6-B0C2-5F5A0CBDFFA1}")
public interface LicenseSettingAtt extends SettingController {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "DemoMode"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(27)
  boolean demoMode();


  /**
   * <p>
   * Setter method for the COM property "DemoMode"
   * </p>
   * @param oDemoMode Mandatory boolean parameter.
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(28)
  void demoMode(
    boolean oDemoMode);


  /**
   * @param ioAdminLevel Mandatory Holder<java.lang.String> parameter.
   * @param ioLocked Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005954) //= 0x60060002. The runtime will prefer the VTID if present
  @VTID(29)
  boolean getDemoModeInfo(
    Holder<java.lang.String> ioAdminLevel,
    Holder<java.lang.String> ioLocked);


  /**
   * @param iLock Mandatory boolean parameter.
   */

  @DISPID(1611005955) //= 0x60060003. The runtime will prefer the VTID if present
  @VTID(30)
  void setDemoModeLock(
    boolean iLock);


  /**
   * <p>
   * Getter method for the COM property "ServerTimeOut"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(1611005956) //= 0x60060004. The runtime will prefer the VTID if present
  @VTID(31)
  float serverTimeOut();


  /**
   * <p>
   * Setter method for the COM property "ServerTimeOut"
   * </p>
   * @param oTimeOut Mandatory float parameter.
   */

  @DISPID(1611005956) //= 0x60060004. The runtime will prefer the VTID if present
  @VTID(32)
  void serverTimeOut(
    float oTimeOut);


  /**
   * @param ioAdminLevel Mandatory Holder<java.lang.String> parameter.
   * @param ioLocked Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005958) //= 0x60060006. The runtime will prefer the VTID if present
  @VTID(33)
  boolean getServerTimeOutInfo(
    Holder<java.lang.String> ioAdminLevel,
    Holder<java.lang.String> ioLocked);


  /**
   * @param iLock Mandatory boolean parameter.
   */

  @DISPID(1611005959) //= 0x60060007. The runtime will prefer the VTID if present
  @VTID(34)
  void setServerTimeOutLock(
    boolean iLock);


  /**
   * <p>
   * Getter method for the COM property "NodelockAlert"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611005960) //= 0x60060008. The runtime will prefer the VTID if present
  @VTID(35)
  int nodelockAlert();


  /**
   * <p>
   * Setter method for the COM property "NodelockAlert"
   * </p>
   * @param oAlert Mandatory int parameter.
   */

  @DISPID(1611005960) //= 0x60060008. The runtime will prefer the VTID if present
  @VTID(36)
  void nodelockAlert(
    int oAlert);


  /**
   * @param ioAdminLevel Mandatory Holder<java.lang.String> parameter.
   * @param ioLocked Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005962) //= 0x6006000a. The runtime will prefer the VTID if present
  @VTID(37)
  boolean getNodelockAlertInfo(
    Holder<java.lang.String> ioAdminLevel,
    Holder<java.lang.String> ioLocked);


  /**
   * @param iLock Mandatory boolean parameter.
   */

  @DISPID(1611005963) //= 0x6006000b. The runtime will prefer the VTID if present
  @VTID(38)
  void setNodelockAlertLock(
    boolean iLock);


  /**
   * <p>
   * Getter method for the COM property "Frequency"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(1611005964) //= 0x6006000c. The runtime will prefer the VTID if present
  @VTID(39)
  float frequency();


  /**
   * <p>
   * Setter method for the COM property "Frequency"
   * </p>
   * @param oFrequency Mandatory float parameter.
   */

  @DISPID(1611005964) //= 0x6006000c. The runtime will prefer the VTID if present
  @VTID(40)
  void frequency(
    float oFrequency);


  /**
   * @param ioAdminLevel Mandatory Holder<java.lang.String> parameter.
   * @param ioLocked Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005966) //= 0x6006000e. The runtime will prefer the VTID if present
  @VTID(41)
  boolean getFrequencyInfo(
    Holder<java.lang.String> ioAdminLevel,
    Holder<java.lang.String> ioLocked);


  /**
   * @param iLock Mandatory boolean parameter.
   */

  @DISPID(1611005967) //= 0x6006000f. The runtime will prefer the VTID if present
  @VTID(42)
  void setFrequencyLock(
    boolean iLock);


  /**
   * <p>
   * Getter method for the COM property "ShowLicense"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005968) //= 0x60060010. The runtime will prefer the VTID if present
  @VTID(43)
  boolean showLicense();


  /**
   * <p>
   * Setter method for the COM property "ShowLicense"
   * </p>
   * @param oMode Mandatory boolean parameter.
   */

  @DISPID(1611005968) //= 0x60060010. The runtime will prefer the VTID if present
  @VTID(44)
  void showLicense(
    boolean oMode);


  /**
   * @param ioAdminLevel Mandatory Holder<java.lang.String> parameter.
   * @param ioLocked Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005970) //= 0x60060012. The runtime will prefer the VTID if present
  @VTID(45)
  boolean getShowLicenseInfo(
    Holder<java.lang.String> ioAdminLevel,
    Holder<java.lang.String> ioLocked);


  /**
   * @param iLock Mandatory boolean parameter.
   */

  @DISPID(1611005971) //= 0x60060013. The runtime will prefer the VTID if present
  @VTID(46)
  void setShowLicenseLock(
    boolean iLock);


  /**
   * @param iDefaultLicenses Mandatory int parameter.
   * @return  Returns a value of type java.lang.Object[]
   */

  @DISPID(1611005972) //= 0x60060014. The runtime will prefer the VTID if present
  @VTID(47)
  java.lang.Object[] getLicensesList(
    int iDefaultLicenses);


  /**
   * @param iDefaultLicenses Mandatory int parameter.
   * @return  Returns a value of type java.lang.Object[]
   */

  @DISPID(1611005973) //= 0x60060015. The runtime will prefer the VTID if present
  @VTID(48)
  java.lang.Object[] getGrantedLicensesList(
    int iDefaultLicenses);


  /**
   * @param ioAdminLevel Mandatory Holder<java.lang.String> parameter.
   * @param ioLock Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005974) //= 0x60060016. The runtime will prefer the VTID if present
  @VTID(49)
  boolean getLicensesListInfo(
    Holder<java.lang.String> ioAdminLevel,
    Holder<java.lang.String> ioLock);


  /**
   * @param iLock Mandatory boolean parameter.
   */

  @DISPID(1611005975) //= 0x60060017. The runtime will prefer the VTID if present
  @VTID(50)
  void setLicensesListLock(
    boolean iLock);


  /**
   * @param iLicense Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1611005976) //= 0x60060018. The runtime will prefer the VTID if present
  @VTID(51)
  java.lang.String getLicense(
    Holder<java.lang.String> iLicense);


  /**
   * @param iLicense Mandatory Holder<java.lang.String> parameter.
   * @param iValue Mandatory Holder<java.lang.String> parameter.
   */

  @DISPID(1611005977) //= 0x60060019. The runtime will prefer the VTID if present
  @VTID(52)
  void setLicense(
    Holder<java.lang.String> iLicense,
    Holder<java.lang.String> iValue);


  /**
   * @param iLicense Mandatory Holder<java.lang.String> parameter.
   * @param ioAdminLevel Mandatory Holder<java.lang.String> parameter.
   * @param ioLocked Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005978) //= 0x6006001a. The runtime will prefer the VTID if present
  @VTID(53)
  boolean getLicenseInfo(
    Holder<java.lang.String> iLicense,
    Holder<java.lang.String> ioAdminLevel,
    Holder<java.lang.String> ioLocked);


  /**
   * @param iLicense Mandatory Holder<java.lang.String> parameter.
   * @param iLock Mandatory boolean parameter.
   */

  @DISPID(1611005979) //= 0x6006001b. The runtime will prefer the VTID if present
  @VTID(54)
  void setLicenseLock(
    Holder<java.lang.String> iLicense,
    boolean iLock);


  // Properties:
}
