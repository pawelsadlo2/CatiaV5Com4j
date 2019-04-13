import com4j.*;

@IID("{A7F36178-9492-11D4-9F24-00508B130755}")
public interface HybridShapeLawDistProj extends HybridShape {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Reference"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(25)
  Reference reference();


  /**
   * <p>
   * Setter method for the COM property "Reference"
   * </p>
   * @param oElem Mandatory Reference parameter.
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(26)
  void reference(
    Reference oElem);


  /**
   * <p>
   * Getter method for the COM property "Definition"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611005954) //= 0x60060002. The runtime will prefer the VTID if present
  @VTID(27)
  Reference definition();


  /**
   * <p>
   * Setter method for the COM property "Definition"
   * </p>
   * @param oElem Mandatory Reference parameter.
   */

  @DISPID(1611005954) //= 0x60060002. The runtime will prefer the VTID if present
  @VTID(28)
  void definition(
    Reference oElem);


  /**
   * <p>
   * Getter method for the COM property "Scaling"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(1611005956) //= 0x60060004. The runtime will prefer the VTID if present
  @VTID(29)
  double scaling();


  /**
   * <p>
   * Setter method for the COM property "Scaling"
   * </p>
   * @param oScale Mandatory double parameter.
   */

  @DISPID(1611005956) //= 0x60060004. The runtime will prefer the VTID if present
  @VTID(30)
  void scaling(
    double oScale);


  /**
   * <p>
   * Setter method for the COM property "AppliedUnitSymbol"
   * </p>
   * @param rhs Mandatory Holder<java.lang.String> parameter.
   */

  @DISPID(1611005958) //= 0x60060006. The runtime will prefer the VTID if present
  @VTID(31)
  void appliedUnitSymbol(
    Holder<java.lang.String> rhs);


  /**
   * @param oSymbol Mandatory Holder<java.lang.String> parameter.
   */

  @DISPID(1611005959) //= 0x60060007. The runtime will prefer the VTID if present
  @VTID(32)
  void getAppliedUnitSymbol(
    Holder<java.lang.String> oSymbol);


  /**
   * <p>
   * Setter method for the COM property "MeasureUnitSymbol"
   * </p>
   * @param rhs Mandatory Holder<java.lang.String> parameter.
   */

  @DISPID(1611005960) //= 0x60060008. The runtime will prefer the VTID if present
  @VTID(33)
  void measureUnitSymbol(
    Holder<java.lang.String> rhs);


  /**
   * @param oSymbol Mandatory Holder<java.lang.String> parameter.
   */

  @DISPID(1611005961) //= 0x60060009. The runtime will prefer the VTID if present
  @VTID(34)
  void getMeasureUnitSymbol(
    Holder<java.lang.String> oSymbol);


  /**
   * @param oNormal Mandatory java.lang.Object[] parameter.
   */

  @DISPID(1611005962) //= 0x6006000a. The runtime will prefer the VTID if present
  @VTID(35)
  void getPlaneNormal(
    java.lang.Object[] oNormal);


  /**
   * @param iNormal Mandatory java.lang.Object[] parameter.
   */

  @DISPID(1611005963) //= 0x6006000b. The runtime will prefer the VTID if present
  @VTID(36)
  void putPlaneNormal(
    java.lang.Object[] iNormal);


  /**
   * <p>
   * Getter method for the COM property "PositiveDirectionOrientation"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611005964) //= 0x6006000c. The runtime will prefer the VTID if present
  @VTID(37)
  int positiveDirectionOrientation();


  /**
   * <p>
   * Setter method for the COM property "PositiveDirectionOrientation"
   * </p>
   * @param oOri Mandatory int parameter.
   */

  @DISPID(1611005964) //= 0x6006000c. The runtime will prefer the VTID if present
  @VTID(38)
  void positiveDirectionOrientation(
    int oOri);


  /**
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005966) //= 0x6006000e. The runtime will prefer the VTID if present
  @VTID(39)
  boolean isHeterogeneousLaw();


  /**
   * <p>
   * Getter method for the COM property "ParameterOnDefinition"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005967) //= 0x6006000f. The runtime will prefer the VTID if present
  @VTID(40)
  boolean parameterOnDefinition();


  /**
   * <p>
   * Setter method for the COM property "ParameterOnDefinition"
   * </p>
   * @param oParameterOnDefinition Mandatory boolean parameter.
   */

  @DISPID(1611005967) //= 0x6006000f. The runtime will prefer the VTID if present
  @VTID(41)
  void parameterOnDefinition(
    boolean oParameterOnDefinition);


  // Properties:
}
