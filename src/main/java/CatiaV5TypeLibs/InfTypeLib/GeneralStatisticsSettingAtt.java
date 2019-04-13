package CatiaV5TypeLibs.InfTypeLib;

import com4j.*;

@IID("{9622F3C7-D939-44E0-85D0-122ADF6BAF9F}")
public interface GeneralStatisticsSettingAtt extends SettingController {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Activation"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(27)
  boolean activation();


  /**
   * <p>
   * Setter method for the COM property "Activation"
   * </p>
   * @param oActivatationState Mandatory boolean parameter.
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(28)
  void activation(
    boolean oActivatationState);


  /**
   * <p>
   * Getter method for the COM property "CumulationMode"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005954) //= 0x60060002. The runtime will prefer the VTID if present
  @VTID(29)
  boolean cumulationMode();


  /**
   * <p>
   * Setter method for the COM property "CumulationMode"
   * </p>
   * @param oCumulative Mandatory boolean parameter.
   */

  @DISPID(1611005954) //= 0x60060002. The runtime will prefer the VTID if present
  @VTID(30)
  void cumulationMode(
    boolean oCumulative);


  /**
   * @param flag Mandatory int parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005956) //= 0x60060004. The runtime will prefer the VTID if present
  @VTID(31)
  boolean getFormatMode(
    int flag);


  /**
   * @param iFormatMode Mandatory boolean parameter.
   * @param flag Mandatory int parameter.
   */

  @DISPID(1611005957) //= 0x60060005. The runtime will prefer the VTID if present
  @VTID(32)
  void setFormatMode(
    boolean iFormatMode,
    int flag);


  /**
   * <p>
   * Getter method for the COM property "Output"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1611005958) //= 0x60060006. The runtime will prefer the VTID if present
  @VTID(33)
  java.lang.String output();


  /**
   * <p>
   * Setter method for the COM property "Output"
   * </p>
   * @param oOutputType Mandatory Holder<java.lang.String> parameter.
   */

  @DISPID(1611005958) //= 0x60060006. The runtime will prefer the VTID if present
  @VTID(34)
  void output(
    Holder<java.lang.String> oOutputType);


  /**
   * <p>
   * Getter method for the COM property "OutputFile"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1611005960) //= 0x60060008. The runtime will prefer the VTID if present
  @VTID(35)
  java.lang.String outputFile();


  /**
   * <p>
   * Setter method for the COM property "OutputFile"
   * </p>
   * @param oOutputFile Mandatory Holder<java.lang.String> parameter.
   */

  @DISPID(1611005960) //= 0x60060008. The runtime will prefer the VTID if present
  @VTID(36)
  void outputFile(
    Holder<java.lang.String> oOutputFile);


  /**
   * <p>
   * Getter method for the COM property "THEM"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005962) //= 0x6006000a. The runtime will prefer the VTID if present
  @VTID(37)
  boolean them();


  /**
   * <p>
   * Setter method for the COM property "THEM"
   * </p>
   * @param oStatus Mandatory boolean parameter.
   */

  @DISPID(1611005962) //= 0x6006000a. The runtime will prefer the VTID if present
  @VTID(38)
  void them(
    boolean oStatus);


  /**
   * <p>
   * Getter method for the COM property "TIME"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005964) //= 0x6006000c. The runtime will prefer the VTID if present
  @VTID(39)
  boolean time();


  /**
   * <p>
   * Setter method for the COM property "TIME"
   * </p>
   * @param oStatus Mandatory boolean parameter.
   */

  @DISPID(1611005964) //= 0x6006000c. The runtime will prefer the VTID if present
  @VTID(40)
  void time(
    boolean oStatus);


  /**
   * <p>
   * Getter method for the COM property "CPUS"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005966) //= 0x6006000e. The runtime will prefer the VTID if present
  @VTID(41)
  boolean cpus();


  /**
   * <p>
   * Setter method for the COM property "CPUS"
   * </p>
   * @param oStatus Mandatory boolean parameter.
   */

  @DISPID(1611005966) //= 0x6006000e. The runtime will prefer the VTID if present
  @VTID(42)
  void cpus(
    boolean oStatus);


  /**
   * <p>
   * Getter method for the COM property "RTIM"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005968) //= 0x60060010. The runtime will prefer the VTID if present
  @VTID(43)
  boolean rtim();


  /**
   * <p>
   * Setter method for the COM property "RTIM"
   * </p>
   * @param oStatus Mandatory boolean parameter.
   */

  @DISPID(1611005968) //= 0x60060010. The runtime will prefer the VTID if present
  @VTID(44)
  void rtim(
    boolean oStatus);


  /**
   * <p>
   * Getter method for the COM property "ELPS"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005970) //= 0x60060012. The runtime will prefer the VTID if present
  @VTID(45)
  boolean elps();


  /**
   * <p>
   * Setter method for the COM property "ELPS"
   * </p>
   * @param oStatus Mandatory boolean parameter.
   */

  @DISPID(1611005970) //= 0x60060012. The runtime will prefer the VTID if present
  @VTID(46)
  void elps(
    boolean oStatus);


  /**
   * <p>
   * Getter method for the COM property "UPID"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005972) //= 0x60060014. The runtime will prefer the VTID if present
  @VTID(47)
  boolean upid();


  /**
   * <p>
   * Setter method for the COM property "UPID"
   * </p>
   * @param oStatus Mandatory boolean parameter.
   */

  @DISPID(1611005972) //= 0x60060014. The runtime will prefer the VTID if present
  @VTID(48)
  void upid(
    boolean oStatus);


  /**
   * <p>
   * Getter method for the COM property "USER"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005974) //= 0x60060016. The runtime will prefer the VTID if present
  @VTID(49)
  boolean user();


  /**
   * <p>
   * Setter method for the COM property "USER"
   * </p>
   * @param oStatus Mandatory boolean parameter.
   */

  @DISPID(1611005974) //= 0x60060016. The runtime will prefer the VTID if present
  @VTID(50)
  void user(
    boolean oStatus);


  /**
   * <p>
   * Getter method for the COM property "HOST"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005976) //= 0x60060018. The runtime will prefer the VTID if present
  @VTID(51)
  boolean host();


  /**
   * <p>
   * Setter method for the COM property "HOST"
   * </p>
   * @param oStatus Mandatory boolean parameter.
   */

  @DISPID(1611005976) //= 0x60060018. The runtime will prefer the VTID if present
  @VTID(52)
  void host(
    boolean oStatus);


  /**
   * <p>
   * Getter method for the COM property "TimeUnit"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1611005978) //= 0x6006001a. The runtime will prefer the VTID if present
  @VTID(53)
  java.lang.String timeUnit();


  /**
   * <p>
   * Setter method for the COM property "TimeUnit"
   * </p>
   * @param iTimeUnit Mandatory Holder<java.lang.String> parameter.
   */

  @DISPID(1611005978) //= 0x6006001a. The runtime will prefer the VTID if present
  @VTID(54)
  void timeUnit(
    Holder<java.lang.String> iTimeUnit);


  /**
   * <p>
   * Getter method for the COM property "DateFormat"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1611005980) //= 0x6006001c. The runtime will prefer the VTID if present
  @VTID(55)
  java.lang.String dateFormat();


  /**
   * <p>
   * Setter method for the COM property "DateFormat"
   * </p>
   * @param iDateFormat Mandatory Holder<java.lang.String> parameter.
   */

  @DISPID(1611005980) //= 0x6006001c. The runtime will prefer the VTID if present
  @VTID(56)
  void dateFormat(
    Holder<java.lang.String> iDateFormat);


  /**
   * <p>
   * Getter method for the COM property "OutputFormat"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1611005982) //= 0x6006001e. The runtime will prefer the VTID if present
  @VTID(57)
  java.lang.String outputFormat();


  /**
   * <p>
   * Setter method for the COM property "OutputFormat"
   * </p>
   * @param iOutputFormat Mandatory Holder<java.lang.String> parameter.
   */

  @DISPID(1611005982) //= 0x6006001e. The runtime will prefer the VTID if present
  @VTID(58)
  void outputFormat(
    Holder<java.lang.String> iOutputFormat);


  /**
   * @param iLocked Mandatory boolean parameter.
   */

  @DISPID(1611005984) //= 0x60060020. The runtime will prefer the VTID if present
  @VTID(59)
  void setThematicsParameterLock(
    boolean iLocked);


  /**
   * @param adminLevel Mandatory Holder<java.lang.String> parameter.
   * @param oLocked Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005985) //= 0x60060021. The runtime will prefer the VTID if present
  @VTID(60)
  boolean getThematicsParameterInfo(
    Holder<java.lang.String> adminLevel,
    Holder<java.lang.String> oLocked);


  // Properties:
}
