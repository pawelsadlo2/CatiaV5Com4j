import com4j.*;

@IID("{A0FB5546-5464-11D1-A272-0000F87546FD}")
public interface StrParam extends Parameter {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Value"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(35)
  java.lang.String value();


  /**
   * <p>
   * Setter method for the COM property "Value"
   * </p>
   * @param oValue Mandatory Holder<java.lang.String> parameter.
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(36)
  void value(
    Holder<java.lang.String> oValue);


  /**
   * @param oSafeArray Mandatory java.lang.Object[] parameter.
   */

  @DISPID(1611005954) //= 0x60060002. The runtime will prefer the VTID if present
  @VTID(37)
  void getEnumerateValues(
    java.lang.Object[] oSafeArray);


  /**
   * @return  Returns a value of type int
   */

  @DISPID(1611005955) //= 0x60060003. The runtime will prefer the VTID if present
  @VTID(38)
  int getEnumerateValuesSize();


  /**
   * @param iSafeArray Mandatory java.lang.Object[] parameter.
   */

  @DISPID(1611005956) //= 0x60060004. The runtime will prefer the VTID if present
  @VTID(39)
  void setEnumerateValues(
    java.lang.Object[] iSafeArray);


  /**
   */

  @DISPID(1611005957) //= 0x60060005. The runtime will prefer the VTID if present
  @VTID(40)
  void suppressEnumerateValues();


  // Properties:
}
