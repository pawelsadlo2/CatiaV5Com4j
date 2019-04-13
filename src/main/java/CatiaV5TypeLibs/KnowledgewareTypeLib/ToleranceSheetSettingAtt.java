package CatiaV5TypeLibs.KnowledgewareTypeLib;
import CatiaV5TypeLibs.InfTypeLib.*;

import com4j.*;

@IID("{4DFDA8FC-EBE7-4C49-96C9-EFCE7D86F6C4}")
public interface ToleranceSheetSettingAtt extends SettingController {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "DefaultTolerance"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(27)
  short defaultTolerance();


  /**
   * <p>
   * Setter method for the COM property "DefaultTolerance"
   * </p>
   * @param oDefaultTolerance Mandatory short parameter.
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(28)
  void defaultTolerance(
    short oDefaultTolerance);


  /**
   * @param ioAdminLevel Mandatory Holder<java.lang.String> parameter.
   * @param ioLocked Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005954) //= 0x60060002. The runtime will prefer the VTID if present
  @VTID(29)
  boolean getDefaultToleranceInfo(
    Holder<java.lang.String> ioAdminLevel,
    Holder<java.lang.String> ioLocked);


  /**
   * @param iLocked Mandatory boolean parameter.
   */

  @DISPID(1611005955) //= 0x60060003. The runtime will prefer the VTID if present
  @VTID(30)
  void setDefaultToleranceLock(
    boolean iLocked);


  /**
   * <p>
   * Getter method for the COM property "LengthMaxTolerance"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(1611005956) //= 0x60060004. The runtime will prefer the VTID if present
  @VTID(31)
  double lengthMaxTolerance();


  /**
   * <p>
   * Setter method for the COM property "LengthMaxTolerance"
   * </p>
   * @param oLengthMaxTolerance Mandatory double parameter.
   */

  @DISPID(1611005956) //= 0x60060004. The runtime will prefer the VTID if present
  @VTID(32)
  void lengthMaxTolerance(
    double oLengthMaxTolerance);


  /**
   * @param ioAdminLevel Mandatory Holder<java.lang.String> parameter.
   * @param ioLocked Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005958) //= 0x60060006. The runtime will prefer the VTID if present
  @VTID(33)
  boolean getLengthMaxToleranceInfo(
    Holder<java.lang.String> ioAdminLevel,
    Holder<java.lang.String> ioLocked);


  /**
   * @param iLocked Mandatory boolean parameter.
   */

  @DISPID(1611005959) //= 0x60060007. The runtime will prefer the VTID if present
  @VTID(34)
  void setLengthMaxToleranceLock(
    boolean iLocked);


  /**
   * <p>
   * Getter method for the COM property "LengthMinTolerance"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(1611005960) //= 0x60060008. The runtime will prefer the VTID if present
  @VTID(35)
  double lengthMinTolerance();


  /**
   * <p>
   * Setter method for the COM property "LengthMinTolerance"
   * </p>
   * @param oLengthMinTolerance Mandatory double parameter.
   */

  @DISPID(1611005960) //= 0x60060008. The runtime will prefer the VTID if present
  @VTID(36)
  void lengthMinTolerance(
    double oLengthMinTolerance);


  /**
   * @param ioAdminLevel Mandatory Holder<java.lang.String> parameter.
   * @param ioLocked Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005962) //= 0x6006000a. The runtime will prefer the VTID if present
  @VTID(37)
  boolean getLengthMinToleranceInfo(
    Holder<java.lang.String> ioAdminLevel,
    Holder<java.lang.String> ioLocked);


  /**
   * @param iLocked Mandatory boolean parameter.
   */

  @DISPID(1611005963) //= 0x6006000b. The runtime will prefer the VTID if present
  @VTID(38)
  void setLengthMinToleranceLock(
    boolean iLocked);


  /**
   * <p>
   * Getter method for the COM property "AngleMaxTolerance"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(1611005964) //= 0x6006000c. The runtime will prefer the VTID if present
  @VTID(39)
  double angleMaxTolerance();


  /**
   * <p>
   * Setter method for the COM property "AngleMaxTolerance"
   * </p>
   * @param oAngleMaxTolerance Mandatory double parameter.
   */

  @DISPID(1611005964) //= 0x6006000c. The runtime will prefer the VTID if present
  @VTID(40)
  void angleMaxTolerance(
    double oAngleMaxTolerance);


  /**
   * @param ioAdminLevel Mandatory Holder<java.lang.String> parameter.
   * @param ioLocked Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005966) //= 0x6006000e. The runtime will prefer the VTID if present
  @VTID(41)
  boolean getAngleMaxToleranceInfo(
    Holder<java.lang.String> ioAdminLevel,
    Holder<java.lang.String> ioLocked);


  /**
   * @param iLocked Mandatory boolean parameter.
   */

  @DISPID(1611005967) //= 0x6006000f. The runtime will prefer the VTID if present
  @VTID(42)
  void setAngleMaxToleranceLock(
    boolean iLocked);


  /**
   * <p>
   * Getter method for the COM property "AngleMinTolerance"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(1611005968) //= 0x60060010. The runtime will prefer the VTID if present
  @VTID(43)
  double angleMinTolerance();


  /**
   * <p>
   * Setter method for the COM property "AngleMinTolerance"
   * </p>
   * @param oAngleMinTolerance Mandatory double parameter.
   */

  @DISPID(1611005968) //= 0x60060010. The runtime will prefer the VTID if present
  @VTID(44)
  void angleMinTolerance(
    double oAngleMinTolerance);


  /**
   * @param ioAdminLevel Mandatory Holder<java.lang.String> parameter.
   * @param ioLocked Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005970) //= 0x60060012. The runtime will prefer the VTID if present
  @VTID(45)
  boolean getAngleMinToleranceInfo(
    Holder<java.lang.String> ioAdminLevel,
    Holder<java.lang.String> ioLocked);


  /**
   * @param iLocked Mandatory boolean parameter.
   */

  @DISPID(1611005971) //= 0x60060013. The runtime will prefer the VTID if present
  @VTID(46)
  void setAngleMinToleranceLock(
    boolean iLocked);


  // Properties:
}
