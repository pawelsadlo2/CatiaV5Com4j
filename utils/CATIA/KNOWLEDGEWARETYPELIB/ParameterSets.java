import com4j.*;

@IID("{0AEEB1B5-43A4-44EE-BA13-08A5278F2B0F}")
public interface ParameterSets extends Collection {
  // Methods:
  /**
   * @param iIndex Mandatory java.lang.Object parameter.
   * @return  Returns a value of type ParameterSet
   */

  @DISPID(1610940416) //= 0x60050000. The runtime will prefer the VTID if present
  @VTID(23)
  ParameterSet item(
    java.lang.Object iIndex);


  /**
   * @param iName Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type ParameterSet
   */

  @DISPID(1610940417) //= 0x60050001. The runtime will prefer the VTID if present
  @VTID(24)
  ParameterSet createSet(
    Holder<java.lang.String> iName);


  // Properties:
}
