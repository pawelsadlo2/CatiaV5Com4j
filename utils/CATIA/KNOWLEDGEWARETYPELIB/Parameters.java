import com4j.*;

@IID("{60CE5A40-5478-11D1-A272-0000F87546FD}")
public interface Parameters extends Collection {
  // Methods:
  /**
   * @param iName Mandatory Holder<java.lang.String> parameter.
   * @param iValue Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type StrParam
   */

  @DISPID(1610940416) //= 0x60050000. The runtime will prefer the VTID if present
  @VTID(23)
  StrParam createString(
    Holder<java.lang.String> iName,
    Holder<java.lang.String> iValue);


  /**
   * @param iName Mandatory Holder<java.lang.String> parameter.
   * @param iValue Mandatory double parameter.
   * @return  Returns a value of type RealParam
   */

  @DISPID(1610940417) //= 0x60050001. The runtime will prefer the VTID if present
  @VTID(24)
  RealParam createReal(
    Holder<java.lang.String> iName,
    double iValue);


  /**
   * @param iName Mandatory Holder<java.lang.String> parameter.
   * @param iValue Mandatory int parameter.
   * @return  Returns a value of type IntParam
   */

  @DISPID(1610940418) //= 0x60050002. The runtime will prefer the VTID if present
  @VTID(25)
  IntParam createInteger(
    Holder<java.lang.String> iName,
    int iValue);


  /**
   * @param iName Mandatory Holder<java.lang.String> parameter.
   * @param iValue Mandatory boolean parameter.
   * @return  Returns a value of type BoolParam
   */

  @DISPID(1610940419) //= 0x60050003. The runtime will prefer the VTID if present
  @VTID(26)
  BoolParam createBoolean(
    Holder<java.lang.String> iName,
    boolean iValue);


  /**
   * @param iName Mandatory Holder<java.lang.String> parameter.
   * @param iMagnitude Mandatory Holder<java.lang.String> parameter.
   * @param iValue Mandatory double parameter.
   * @return  Returns a value of type Dimension
   */

  @DISPID(1610940420) //= 0x60050004. The runtime will prefer the VTID if present
  @VTID(27)
  Dimension createDimension(
    Holder<java.lang.String> iName,
    Holder<java.lang.String> iMagnitude,
    double iValue);


  /**
   * @param iName Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type ListParameter
   */

  @DISPID(1610940421) //= 0x60050005. The runtime will prefer the VTID if present
  @VTID(28)
  ListParameter createList(
    Holder<java.lang.String> iName);


  /**
   * @param iIndex Mandatory java.lang.Object parameter.
   * @return  Returns a value of type Parameter
   */

  @DISPID(1610940422) //= 0x60050006. The runtime will prefer the VTID if present
  @VTID(29)
  Parameter item(
    java.lang.Object iIndex);


  /**
   * @param iIndex Mandatory java.lang.Object parameter.
   */

  @DISPID(1610940423) //= 0x60050007. The runtime will prefer the VTID if present
  @VTID(30)
  void remove(
    java.lang.Object iIndex);


  /**
   * @param iObject Mandatory AnyObject parameter.
   * @param iRecursively Mandatory boolean parameter.
   * @return  Returns a value of type Parameters
   */

  @DISPID(1610940424) //= 0x60050008. The runtime will prefer the VTID if present
  @VTID(31)
  Parameters subList(
    AnyObject iObject,
    boolean iRecursively);


  /**
   * <p>
   * Getter method for the COM property "Units"
   * </p>
   * @return  Returns a value of type Units
   */

  @DISPID(1610940425) //= 0x60050009. The runtime will prefer the VTID if present
  @VTID(32)
  Units units();


  /**
   * @param iObject Mandatory AnyObject parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610940426) //= 0x6005000a. The runtime will prefer the VTID if present
  @VTID(33)
  java.lang.String getNameToUseInRelation(
    AnyObject iObject);


  /**
   * @param iFather Mandatory AnyObject parameter.
   */

  @DISPID(1610940427) //= 0x6005000b. The runtime will prefer the VTID if present
  @VTID(34)
  void createSetOfParameters(
    AnyObject iFather);


  /**
   * <p>
   * Getter method for the COM property "RootParameterSet"
   * </p>
   * @return  Returns a value of type ParameterSet
   */

  @DISPID(1610940428) //= 0x6005000c. The runtime will prefer the VTID if present
  @VTID(35)
  ParameterSet rootParameterSet();


  // Properties:
}
