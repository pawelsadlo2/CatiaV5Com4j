import com4j.*;

@IID("{5DE640D0-8E70-48FB-97BD-B0395E923BCC}")
public interface UnitsSheetSettingAtt extends SettingController {
  // Methods:
  /**
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(27)
  void saveRepositoryForUnits();


  /**
   */

  @DISPID(1611005953) //= 0x60060001. The runtime will prefer the VTID if present
  @VTID(28)
  void rollbackForUnits();


  /**
   */

  @DISPID(1611005954) //= 0x60060002. The runtime will prefer the VTID if present
  @VTID(29)
  void commitForUnits();


  /**
   */

  @DISPID(1611005955) //= 0x60060003. The runtime will prefer the VTID if present
  @VTID(30)
  void resetToAdminValuesForUnits();


  /**
   * <p>
   * Getter method for the COM property "ListOfMagnitudes"
   * </p>
   * @return  Returns a value of type java.lang.Object[]
   */

  @DISPID(1611005956) //= 0x60060004. The runtime will prefer the VTID if present
  @VTID(31)
  java.lang.Object[] listOfMagnitudes();


  /**
   * <p>
   * Getter method for the COM property "ListOfMagnitudesSize"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(1611005957) //= 0x60060005. The runtime will prefer the VTID if present
  @VTID(32)
  double listOfMagnitudesSize();


  /**
   * @param iMagnitudeName Mandatory Holder<java.lang.String> parameter.
   * @param oUnitName Mandatory Holder<java.lang.String> parameter.
   * @param oDecimalPlaceReadWrite Mandatory Holder<Double> parameter.
   * @param oDecimalPlaceReadOnly Mandatory Holder<Double> parameter.
   */

  @DISPID(1611005958) //= 0x60060006. The runtime will prefer the VTID if present
  @VTID(33)
  void getMagnitudeValues(
    Holder<java.lang.String> iMagnitudeName,
    Holder<java.lang.String> oUnitName,
    Holder<Double> oDecimalPlaceReadWrite,
    Holder<Double> oDecimalPlaceReadOnly);


  /**
   * @param iMagnitudeName Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type double
   */

  @DISPID(1611005959) //= 0x60060007. The runtime will prefer the VTID if present
  @VTID(34)
  double getDecimalReadWrite(
    Holder<java.lang.String> iMagnitudeName);


  /**
   * @param iMagnitudeName Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type double
   */

  @DISPID(1611005960) //= 0x60060008. The runtime will prefer the VTID if present
  @VTID(35)
  double getDecimalReadOnly(
    Holder<java.lang.String> iMagnitudeName);


  /**
   * @param iMagnitudeName Mandatory Holder<java.lang.String> parameter.
   * @param iUnitName Mandatory Holder<java.lang.String> parameter.
   * @param iDecimalPlaceReadWrite Mandatory double parameter.
   * @param iDecimalPlaceReadOnly Mandatory double parameter.
   */

  @DISPID(1611005961) //= 0x60060009. The runtime will prefer the VTID if present
  @VTID(36)
  void setMagnitudeValues(
    Holder<java.lang.String> iMagnitudeName,
    Holder<java.lang.String> iUnitName,
    double iDecimalPlaceReadWrite,
    double iDecimalPlaceReadOnly);


  /**
   * @param ioAdminLevel Mandatory Holder<java.lang.String> parameter.
   * @param ioLocked Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005962) //= 0x6006000a. The runtime will prefer the VTID if present
  @VTID(37)
  boolean getListOfMagnitudesInfo(
    Holder<java.lang.String> ioAdminLevel,
    Holder<java.lang.String> ioLocked);


  /**
   * @param iLocked Mandatory boolean parameter.
   */

  @DISPID(1611005963) //= 0x6006000b. The runtime will prefer the VTID if present
  @VTID(38)
  void setListOfMagnitudesLock(
    boolean iLocked);


  /**
   * @param ioAdminLevel Mandatory Holder<java.lang.String> parameter.
   * @param ioLocked Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005964) //= 0x6006000c. The runtime will prefer the VTID if present
  @VTID(39)
  boolean getDimensionsDisplayInfo(
    Holder<java.lang.String> ioAdminLevel,
    Holder<java.lang.String> ioLocked);


  /**
   * @param iLocked Mandatory boolean parameter.
   */

  @DISPID(1611005965) //= 0x6006000d. The runtime will prefer the VTID if present
  @VTID(40)
  void setDimensionsDisplayLock(
    boolean iLocked);


  /**
   * <p>
   * Getter method for the COM property "DisplayTrailingZeros"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(1611005966) //= 0x6006000e. The runtime will prefer the VTID if present
  @VTID(41)
  short displayTrailingZeros();


  /**
   * <p>
   * Setter method for the COM property "DisplayTrailingZeros"
   * </p>
   * @param oDisplayTrailingZeros Mandatory short parameter.
   */

  @DISPID(1611005966) //= 0x6006000e. The runtime will prefer the VTID if present
  @VTID(42)
  void displayTrailingZeros(
    short oDisplayTrailingZeros);


  /**
   * @param ioAdminLevel Mandatory Holder<java.lang.String> parameter.
   * @param ioLocked Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005968) //= 0x60060010. The runtime will prefer the VTID if present
  @VTID(43)
  boolean getDisplayTrailingZerosInfo(
    Holder<java.lang.String> ioAdminLevel,
    Holder<java.lang.String> ioLocked);


  /**
   * @param iLocked Mandatory boolean parameter.
   */

  @DISPID(1611005969) //= 0x60060011. The runtime will prefer the VTID if present
  @VTID(44)
  void setDisplayTrailingZerosLock(
    boolean iLocked);


  /**
   * <p>
   * Getter method for the COM property "ExpNotationValuesGreater"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(1611005970) //= 0x60060012. The runtime will prefer the VTID if present
  @VTID(45)
  double expNotationValuesGreater();


  /**
   * <p>
   * Setter method for the COM property "ExpNotationValuesGreater"
   * </p>
   * @param oExpNotationValuesGreater Mandatory double parameter.
   */

  @DISPID(1611005970) //= 0x60060012. The runtime will prefer the VTID if present
  @VTID(46)
  void expNotationValuesGreater(
    double oExpNotationValuesGreater);


  /**
   * @param ioAdminLevel Mandatory Holder<java.lang.String> parameter.
   * @param ioLocked Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005972) //= 0x60060014. The runtime will prefer the VTID if present
  @VTID(47)
  boolean getExpNotationValuesGreaterInfo(
    Holder<java.lang.String> ioAdminLevel,
    Holder<java.lang.String> ioLocked);


  /**
   * @param iLocked Mandatory boolean parameter.
   */

  @DISPID(1611005973) //= 0x60060015. The runtime will prefer the VTID if present
  @VTID(48)
  void setExpNotationValuesGreaterLock(
    boolean iLocked);


  /**
   * <p>
   * Getter method for the COM property "ExpNotationValuesLower"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(1611005974) //= 0x60060016. The runtime will prefer the VTID if present
  @VTID(49)
  double expNotationValuesLower();


  /**
   * <p>
   * Setter method for the COM property "ExpNotationValuesLower"
   * </p>
   * @param oExpNotationValuesLower Mandatory double parameter.
   */

  @DISPID(1611005974) //= 0x60060016. The runtime will prefer the VTID if present
  @VTID(50)
  void expNotationValuesLower(
    double oExpNotationValuesLower);


  /**
   * @param ioAdminLevel Mandatory Holder<java.lang.String> parameter.
   * @param ioLocked Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005976) //= 0x60060018. The runtime will prefer the VTID if present
  @VTID(51)
  boolean getExpNotationValuesLowerInfo(
    Holder<java.lang.String> ioAdminLevel,
    Holder<java.lang.String> ioLocked);


  /**
   * @param iLocked Mandatory boolean parameter.
   */

  @DISPID(1611005977) //= 0x60060019. The runtime will prefer the VTID if present
  @VTID(52)
  void setExpNotationValuesLowerLock(
    boolean iLocked);


  /**
   * <p>
   * Getter method for the COM property "SameDisplay"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(1611005978) //= 0x6006001a. The runtime will prefer the VTID if present
  @VTID(53)
  short sameDisplay();


  /**
   * <p>
   * Setter method for the COM property "SameDisplay"
   * </p>
   * @param oSameDisplay Mandatory short parameter.
   */

  @DISPID(1611005978) //= 0x6006001a. The runtime will prefer the VTID if present
  @VTID(54)
  void sameDisplay(
    short oSameDisplay);


  /**
   * @param ioAdminLevel Mandatory Holder<java.lang.String> parameter.
   * @param ioLocked Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005980) //= 0x6006001c. The runtime will prefer the VTID if present
  @VTID(55)
  boolean getSameDisplayInfo(
    Holder<java.lang.String> ioAdminLevel,
    Holder<java.lang.String> ioLocked);


  /**
   * @param iLocked Mandatory boolean parameter.
   */

  @DISPID(1611005981) //= 0x6006001d. The runtime will prefer the VTID if present
  @VTID(56)
  void setSameDisplayLock(
    boolean iLocked);


  // Properties:
}
