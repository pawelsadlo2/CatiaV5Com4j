package CatiaV5TypeLibs.MecModTypeLib;
import CatiaV5TypeLibs.KnowledgewareTypeLib.*;
import CatiaV5TypeLibs.InfTypeLib.*;

import com4j.*;

@IID("{FC7949F0-BC89-11D5-A396-00D0B7AC7ADB}")
public interface HybridShapeInstance extends HybridShape {
  // Methods:
  /**
   * @param iIndex Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type AnyObject
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(25)
  AnyObject getInput(
    Holder<java.lang.String> iIndex);


  /**
   * @param iName Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type CATBaseDispatch
   */

  @DISPID(1611005953) //= 0x60060001. The runtime will prefer the VTID if present
  @VTID(26)
  CATBaseDispatch getInputData(
    Holder<java.lang.String> iName);


  /**
   * @param iIndex Mandatory Holder<java.lang.String> parameter.
   * @param iInput Mandatory AnyObject parameter.
   */

  @DISPID(1611005954) //= 0x60060002. The runtime will prefer the VTID if present
  @VTID(27)
  void putInput(
    Holder<java.lang.String> iIndex,
    AnyObject iInput);


  /**
   * @param iName Mandatory Holder<java.lang.String> parameter.
   * @param iInput Mandatory CATBaseDispatch parameter.
   */

  @DISPID(1611005955) //= 0x60060003. The runtime will prefer the VTID if present
  @VTID(28)
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
  @VTID(29)
  int inputsCount();


  /**
   * @param iPosition Mandatory int parameter.
   * @return  Returns a value of type AnyObject
   */

  @DISPID(1611005957) //= 0x60060005. The runtime will prefer the VTID if present
  @VTID(30)
  AnyObject getInputFromPosition(
    int iPosition);


  /**
   * @param iPosition Mandatory int parameter.
   * @return  Returns a value of type CATBaseDispatch
   */

  @DISPID(1611005958) //= 0x60060006. The runtime will prefer the VTID if present
  @VTID(31)
  CATBaseDispatch getInputDataFromPosition(
    int iPosition);


  /**
   * @param iName Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type AnyObject
   */

  @DISPID(1611005959) //= 0x60060007. The runtime will prefer the VTID if present
  @VTID(32)
  AnyObject getParameter(
    Holder<java.lang.String> iName);


  /**
   * <p>
   * Getter method for the COM property "ParametersCount"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611005960) //= 0x60060008. The runtime will prefer the VTID if present
  @VTID(33)
  int parametersCount();


  /**
   * @param iPosition Mandatory int parameter.
   * @return  Returns a value of type AnyObject
   */

  @DISPID(1611005961) //= 0x60060009. The runtime will prefer the VTID if present
  @VTID(34)
  AnyObject getParameterFromPosition(
    int iPosition);


  /**
   * @param iName Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type AnyObject
   */

  @DISPID(1611005962) //= 0x6006000a. The runtime will prefer the VTID if present
  @VTID(35)
  AnyObject getOutput(
    Holder<java.lang.String> iName);


  /**
   * <p>
   * Getter method for the COM property "OutputsCount"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611005963) //= 0x6006000b. The runtime will prefer the VTID if present
  @VTID(36)
  int outputsCount();


  /**
   * @param iPosition Mandatory int parameter.
   * @return  Returns a value of type AnyObject
   */

  @DISPID(1611005964) //= 0x6006000c. The runtime will prefer the VTID if present
  @VTID(37)
  AnyObject getOutputFromPosition(
    int iPosition);


  // Properties:
}
