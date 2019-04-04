import com4j.*;

@IID("{FED51760-FB45-11D3-9EE1-00508B675233}")
public interface Batch extends AnyObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "BatchDescriptorPath"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610940416) //= 0x60050000. The runtime will prefer the VTID if present
  @VTID(22)
  java.lang.String batchDescriptorPath();


  /**
   * <p>
   * Setter method for the COM property "BatchDescriptorPath"
   * </p>
   * @param oPath Mandatory Holder<java.lang.String> parameter.
   */

  @DISPID(1610940416) //= 0x60050000. The runtime will prefer the VTID if present
  @VTID(23)
  void batchDescriptorPath(
    Holder<java.lang.String> oPath);


  /**
   * <p>
   * Getter method for the COM property "BatchDescriptorPathFromParam"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610940418) //= 0x60050002. The runtime will prefer the VTID if present
  @VTID(24)
  java.lang.String batchDescriptorPathFromParam();


  /**
   * <p>
   * Setter method for the COM property "BatchDescriptorPathFromParam"
   * </p>
   * @param oPath Mandatory Holder<java.lang.String> parameter.
   */

  @DISPID(1610940418) //= 0x60050002. The runtime will prefer the VTID if present
  @VTID(25)
  void batchDescriptorPathFromParam(
    Holder<java.lang.String> oPath);


  /**
   * <p>
   * Getter method for the COM property "ParametersPath"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610940420) //= 0x60050004. The runtime will prefer the VTID if present
  @VTID(26)
  java.lang.String parametersPath();


  /**
   * <p>
   * Setter method for the COM property "ParametersPath"
   * </p>
   * @param oPath Mandatory Holder<java.lang.String> parameter.
   */

  @DISPID(1610940420) //= 0x60050004. The runtime will prefer the VTID if present
  @VTID(27)
  void parametersPath(
    Holder<java.lang.String> oPath);


  /**
   * <p>
   * Getter method for the COM property "Local"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610940422) //= 0x60050006. The runtime will prefer the VTID if present
  @VTID(28)
  boolean local();


  /**
   * <p>
   * Setter method for the COM property "Local"
   * </p>
   * @param oLocal Mandatory boolean parameter.
   */

  @DISPID(1610940422) //= 0x60050006. The runtime will prefer the VTID if present
  @VTID(29)
  void local(
    boolean oLocal);


  /**
   * <p>
   * Getter method for the COM property "BatchParameters"
   * </p>
   * @return  Returns a value of type BatchElement
   */

  @DISPID(1610940424) //= 0x60050008. The runtime will prefer the VTID if present
  @VTID(30)
  BatchElement batchParameters();


  /**
   * <p>
   * Getter method for the COM property "InputParameters"
   * </p>
   * @return  Returns a value of type BatchElement
   */

  @DISPID(1610940425) //= 0x60050009. The runtime will prefer the VTID if present
  @VTID(31)
  BatchElement inputParameters();


  /**
   * <p>
   * Getter method for the COM property "OutputParameters"
   * </p>
   * @return  Returns a value of type BatchElement
   */

  @DISPID(1610940426) //= 0x6005000a. The runtime will prefer the VTID if present
  @VTID(32)
  BatchElement outputParameters();


  /**
   * <p>
   * Getter method for the COM property "PCs"
   * </p>
   * @return  Returns a value of type BatchElement
   */

  @DISPID(1610940427) //= 0x6005000b. The runtime will prefer the VTID if present
  @VTID(33)
  BatchElement pCs();


  /**
   * <p>
   * Getter method for the COM property "BatchLog"
   * </p>
   * @return  Returns a value of type BatchLog
   */

  @DISPID(1610940428) //= 0x6005000c. The runtime will prefer the VTID if present
  @VTID(34)
  BatchLog batchLog();


  /**
   * <p>
   * Getter method for the COM property "BatchOutput"
   * </p>
   * @return  Returns a value of type BatchOutput
   */

  @DISPID(1610940429) //= 0x6005000d. The runtime will prefer the VTID if present
  @VTID(35)
  BatchOutput batchOutput();


  /**
   * <p>
   * Getter method for the COM property "Id"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610940430) //= 0x6005000e. The runtime will prefer the VTID if present
  @VTID(36)
  int id();


  /**
   * <p>
   * Getter method for the COM property "UUID"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610940431) //= 0x6005000f. The runtime will prefer the VTID if present
  @VTID(37)
  java.lang.String uuid();


  /**
   * <p>
   * Setter method for the COM property "UUID"
   * </p>
   * @param oUUID Mandatory Holder<java.lang.String> parameter.
   */

  @DISPID(1610940431) //= 0x6005000f. The runtime will prefer the VTID if present
  @VTID(38)
  void uuid(
    Holder<java.lang.String> oUUID);


  /**
   * <p>
   * Getter method for the COM property "Description"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610940433) //= 0x60050011. The runtime will prefer the VTID if present
  @VTID(39)
  java.lang.String description();


  /**
   * <p>
   * Getter method for the COM property "Language"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610940434) //= 0x60050012. The runtime will prefer the VTID if present
  @VTID(40)
  java.lang.String language();


  /**
   * <p>
   * Getter method for the COM property "Script"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610940435) //= 0x60050013. The runtime will prefer the VTID if present
  @VTID(41)
  java.lang.String script();


  /**
   * <p>
   * Getter method for the COM property "InputFormat"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610940436) //= 0x60050014. The runtime will prefer the VTID if present
  @VTID(42)
  java.lang.String inputFormat();


  /**
   * <p>
   * Getter method for the COM property "Category"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610940437) //= 0x60050015. The runtime will prefer the VTID if present
  @VTID(43)
  java.lang.String category();


  /**
   * <p>
   * Getter method for the COM property "CommandLine"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610940438) //= 0x60050016. The runtime will prefer the VTID if present
  @VTID(44)
  java.lang.String commandLine();


  /**
   * <p>
   * Getter method for the COM property "SettingMode"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610940439) //= 0x60050017. The runtime will prefer the VTID if present
  @VTID(45)
  int settingMode();


  // Properties:
}
