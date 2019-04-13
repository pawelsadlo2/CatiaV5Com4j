import com4j.*;

@IID("{445CF052-2547-4CEC-BA72-117BB2769C16}")
public interface DynLicenseSettingAtt extends SettingController {
  // Methods:
  /**
   * @return  Returns a value of type java.lang.Object[]
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(27)
  java.lang.Object[] getLicensesList();


  /**
   * @param ioAdminLevel Mandatory Holder<java.lang.String> parameter.
   * @param ioLocked Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005953) //= 0x60060001. The runtime will prefer the VTID if present
  @VTID(28)
  boolean getLicensesListInfo(
    Holder<java.lang.String> ioAdminLevel,
    Holder<java.lang.String> ioLocked);


  /**
   * @param iLock Mandatory boolean parameter.
   */

  @DISPID(1611005954) //= 0x60060002. The runtime will prefer the VTID if present
  @VTID(29)
  void setLicensesListLock(
    boolean iLock);


  /**
   * @param iLicense Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1611005955) //= 0x60060003. The runtime will prefer the VTID if present
  @VTID(30)
  java.lang.String getLicense(
    Holder<java.lang.String> iLicense);


  /**
   * @param iLicense Mandatory Holder<java.lang.String> parameter.
   * @param iValue Mandatory Holder<java.lang.String> parameter.
   */

  @DISPID(1611005956) //= 0x60060004. The runtime will prefer the VTID if present
  @VTID(31)
  void setLicense(
    Holder<java.lang.String> iLicense,
    Holder<java.lang.String> iValue);


  /**
   * @param iLicense Mandatory Holder<java.lang.String> parameter.
   * @param ioAdminLevel Mandatory Holder<java.lang.String> parameter.
   * @param ioLocked Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005957) //= 0x60060005. The runtime will prefer the VTID if present
  @VTID(32)
  boolean getLicenseInfo(
    Holder<java.lang.String> iLicense,
    Holder<java.lang.String> ioAdminLevel,
    Holder<java.lang.String> ioLocked);


  /**
   * @param iLicense Mandatory Holder<java.lang.String> parameter.
   * @param iLock Mandatory boolean parameter.
   */

  @DISPID(1611005958) //= 0x60060006. The runtime will prefer the VTID if present
  @VTID(33)
  void setLicenseLock(
    Holder<java.lang.String> iLicense,
    boolean iLock);


  // Properties:
}
