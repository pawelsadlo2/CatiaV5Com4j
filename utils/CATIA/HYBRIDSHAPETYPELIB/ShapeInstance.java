import com4j.*;

@IID("{FC7949EE-BC89-11D5-A396-00D0B7AC7ADB}")
public interface ShapeInstance extends Shape {
  // Methods:
  /**
   * @param iName Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type AnyObject
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(22)
  AnyObject getInput(
    Holder<java.lang.String> iName);


  /**
   * @param iName Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type CATBaseDispatch
   */

  @DISPID(1611005953) //= 0x60060001. The runtime will prefer the VTID if present
  @VTID(23)
  CATBaseDispatch getInputData(
    Holder<java.lang.String> iName);


  /**
   * @param iName Mandatory Holder<java.lang.String> parameter.
   * @param iInput Mandatory AnyObject parameter.
   */

  @DISPID(1611005954) //= 0x60060002. The runtime will prefer the VTID if present
  @VTID(24)
  void putInput(
    Holder<java.lang.String> iName,
    AnyObject iInput);


  /**
   * @param iName Mandatory Holder<java.lang.String> parameter.
   * @param iInput Mandatory CATBaseDispatch parameter.
   */

  @DISPID(1611005955) //= 0x60060003. The runtime will prefer the VTID if present
  @VTID(25)
  void putInputData(
    Holder<java.lang.String> iName,
    CATBaseDispatch iInput);


  /**
   * <p>
   * Getter method for the COM property "InputsCount"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611005956) //= 0x60060004. The runtime will prefer the VTID if present
  @VTID(26)
  int inputsCount();


  /**
   * @param iPosition Mandatory int parameter.
   * @return  Returns a value of type AnyObject
   */

  @DISPID(1611005957) //= 0x60060005. The runtime will prefer the VTID if present
  @VTID(27)
  AnyObject getInputFromPosition(
    int iPosition);


  /**
   * @param iPosition Mandatory int parameter.
   * @return  Returns a value of type CATBaseDispatch
   */

  @DISPID(1611005958) //= 0x60060006. The runtime will prefer the VTID if present
  @VTID(28)
  CATBaseDispatch getInputDataFromPosition(
    int iPosition);


  /**
   * @param iName Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type AnyObject
   */

  @DISPID(1611005959) //= 0x60060007. The runtime will prefer the VTID if present
  @VTID(29)
  AnyObject getParameter(
    Holder<java.lang.String> iName);


  /**
   * <p>
   * Getter method for the COM property "ParametersCount"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611005960) //= 0x60060008. The runtime will prefer the VTID if present
  @VTID(30)
  int parametersCount();


  /**
   * @param iPosition Mandatory int parameter.
   * @return  Returns a value of type AnyObject
   */

  @DISPID(1611005961) //= 0x60060009. The runtime will prefer the VTID if present
  @VTID(31)
  AnyObject getParameterFromPosition(
    int iPosition);


  /**
   * @param iName Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type AnyObject
   */

  @DISPID(1611005962) //= 0x6006000a. The runtime will prefer the VTID if present
  @VTID(32)
  AnyObject getOutput(
    Holder<java.lang.String> iName);


  /**
   * <p>
   * Getter method for the COM property "OutputsCount"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611005963) //= 0x6006000b. The runtime will prefer the VTID if present
  @VTID(33)
  int outputsCount();


  /**
   * @param iPosition Mandatory int parameter.
   * @return  Returns a value of type AnyObject
   */

  @DISPID(1611005964) //= 0x6006000c. The runtime will prefer the VTID if present
  @VTID(34)
  AnyObject getOutputFromPosition(
    int iPosition);


  // Properties:
}
