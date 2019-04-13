package CatiaV5TypeLibs.KnowledgewareTypeLib;
import CatiaV5TypeLibs.InfTypeLib.*;

import com4j.*;

@IID("{5F4B2C9D-51CB-11D1-A271-0000F87546FD}")
public interface IntParam extends Parameter {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Value"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(35)
  int value();


  /**
   * <p>
   * Setter method for the COM property "Value"
   * </p>
   * @param oValue Mandatory int parameter.
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(36)
  void value(
    int oValue);


  /**
   * <p>
   * Getter method for the COM property "RangeMin"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611005954) //= 0x60060002. The runtime will prefer the VTID if present
  @VTID(37)
  int rangeMin();


  /**
   * <p>
   * Setter method for the COM property "RangeMin"
   * </p>
   * @param oRangeMin Mandatory int parameter.
   */

  @DISPID(1611005954) //= 0x60060002. The runtime will prefer the VTID if present
  @VTID(38)
  void rangeMin(
    int oRangeMin);


  /**
   * <p>
   * Getter method for the COM property "RangeMax"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611005956) //= 0x60060004. The runtime will prefer the VTID if present
  @VTID(39)
  int rangeMax();


  /**
   * <p>
   * Setter method for the COM property "RangeMax"
   * </p>
   * @param oRangeMax Mandatory int parameter.
   */

  @DISPID(1611005956) //= 0x60060004. The runtime will prefer the VTID if present
  @VTID(40)
  void rangeMax(
    int oRangeMax);


  /**
   * <p>
   * Getter method for the COM property "RangeMinValidity"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611005958) //= 0x60060006. The runtime will prefer the VTID if present
  @VTID(41)
  int rangeMinValidity();


  /**
   * <p>
   * Setter method for the COM property "RangeMinValidity"
   * </p>
   * @param oRangeMinValidity Mandatory int parameter.
   */

  @DISPID(1611005958) //= 0x60060006. The runtime will prefer the VTID if present
  @VTID(42)
  void rangeMinValidity(
    int oRangeMinValidity);


  /**
   * <p>
   * Getter method for the COM property "RangeMaxValidity"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611005960) //= 0x60060008. The runtime will prefer the VTID if present
  @VTID(43)
  int rangeMaxValidity();


  /**
   * <p>
   * Setter method for the COM property "RangeMaxValidity"
   * </p>
   * @param oRangeMaxValidity Mandatory int parameter.
   */

  @DISPID(1611005960) //= 0x60060008. The runtime will prefer the VTID if present
  @VTID(44)
  void rangeMaxValidity(
    int oRangeMaxValidity);


  /**
   * @param oSafeArray Mandatory java.lang.Object[] parameter.
   */

  @DISPID(1611005962) //= 0x6006000a. The runtime will prefer the VTID if present
  @VTID(45)
  void getEnumerateValues(
    java.lang.Object[] oSafeArray);


  /**
   * @return  Returns a value of type int
   */

  @DISPID(1611005963) //= 0x6006000b. The runtime will prefer the VTID if present
  @VTID(46)
  int getEnumerateValuesSize();


  /**
   * @param iSafeArray Mandatory java.lang.Object[] parameter.
   */

  @DISPID(1611005964) //= 0x6006000c. The runtime will prefer the VTID if present
  @VTID(47)
  void setEnumerateValues(
    java.lang.Object[] iSafeArray);


  /**
   */

  @DISPID(1611005965) //= 0x6006000d. The runtime will prefer the VTID if present
  @VTID(48)
  void suppressEnumerateValues();


  // Properties:
}
