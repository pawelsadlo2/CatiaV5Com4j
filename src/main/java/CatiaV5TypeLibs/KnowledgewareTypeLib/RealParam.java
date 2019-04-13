package CatiaV5TypeLibs.KnowledgewareTypeLib;
import CatiaV5TypeLibs.InfTypeLib.*;

import com4j.*;

@IID("{FF4A4B48-51CB-11D1-A271-0000F87546FD}")
public interface RealParam extends Parameter {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Value"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(35)
  double value();


  /**
   * <p>
   * Setter method for the COM property "Value"
   * </p>
   * @param oValue Mandatory double parameter.
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(36)
  void value(
    double oValue);


  /**
   * <p>
   * Getter method for the COM property "RangeMin"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(1611005954) //= 0x60060002. The runtime will prefer the VTID if present
  @VTID(37)
  double rangeMin();


  /**
   * <p>
   * Setter method for the COM property "RangeMin"
   * </p>
   * @param oRangeMin Mandatory double parameter.
   */

  @DISPID(1611005954) //= 0x60060002. The runtime will prefer the VTID if present
  @VTID(38)
  void rangeMin(
    double oRangeMin);


  /**
   * <p>
   * Getter method for the COM property "RangeMax"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(1611005956) //= 0x60060004. The runtime will prefer the VTID if present
  @VTID(39)
  double rangeMax();


  /**
   * <p>
   * Setter method for the COM property "RangeMax"
   * </p>
   * @param oRangeMax Mandatory double parameter.
   */

  @DISPID(1611005956) //= 0x60060004. The runtime will prefer the VTID if present
  @VTID(40)
  void rangeMax(
    double oRangeMax);


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
   * <p>
   * Getter method for the COM property "MinimumTolerance"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(1611005962) //= 0x6006000a. The runtime will prefer the VTID if present
  @VTID(45)
  double minimumTolerance();


  /**
   * <p>
   * Setter method for the COM property "MinimumTolerance"
   * </p>
   * @param oValue Mandatory double parameter.
   */

  @DISPID(1611005962) //= 0x6006000a. The runtime will prefer the VTID if present
  @VTID(46)
  void minimumTolerance(
    double oValue);


  /**
   * <p>
   * Getter method for the COM property "MaximumTolerance"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(1611005964) //= 0x6006000c. The runtime will prefer the VTID if present
  @VTID(47)
  double maximumTolerance();


  /**
   * <p>
   * Setter method for the COM property "MaximumTolerance"
   * </p>
   * @param oValue Mandatory double parameter.
   */

  @DISPID(1611005964) //= 0x6006000c. The runtime will prefer the VTID if present
  @VTID(48)
  void maximumTolerance(
    double oValue);


  /**
   * @param oSafeArray Mandatory java.lang.Object[] parameter.
   */

  @DISPID(1611005966) //= 0x6006000e. The runtime will prefer the VTID if present
  @VTID(49)
  void getEnumerateValues(
    java.lang.Object[] oSafeArray);


  /**
   * @return  Returns a value of type int
   */

  @DISPID(1611005967) //= 0x6006000f. The runtime will prefer the VTID if present
  @VTID(50)
  int getEnumerateValuesSize();


  /**
   * @param iSafeArray Mandatory java.lang.Object[] parameter.
   */

  @DISPID(1611005968) //= 0x60060010. The runtime will prefer the VTID if present
  @VTID(51)
  void setEnumerateValues(
    java.lang.Object[] iSafeArray);


  /**
   */

  @DISPID(1611005969) //= 0x60060011. The runtime will prefer the VTID if present
  @VTID(52)
  void suppressEnumerateValues();


  /**
   * @param iValueToCompare Mandatory double parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005970) //= 0x60060012. The runtime will prefer the VTID if present
  @VTID(53)
  boolean isEqualTo(
    double iValueToCompare);


  // Properties:
}
