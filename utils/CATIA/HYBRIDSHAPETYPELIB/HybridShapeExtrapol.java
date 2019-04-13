import com4j.*;

@IID("{8C89B23A-36A7-0000-0280-020E60000000}")
public interface HybridShapeExtrapol extends HybridShape {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "ElemToExtrapol"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(25)
  Reference elemToExtrapol();


  /**
   * <p>
   * Setter method for the COM property "ElemToExtrapol"
   * </p>
   * @param oElemToExtrapol Mandatory Reference parameter.
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(26)
  void elemToExtrapol(
    Reference oElemToExtrapol);


  /**
   * <p>
   * Getter method for the COM property "Boundary"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611005954) //= 0x60060002. The runtime will prefer the VTID if present
  @VTID(27)
  Reference boundary();


  /**
   * <p>
   * Setter method for the COM property "Boundary"
   * </p>
   * @param oBoundary Mandatory Reference parameter.
   */

  @DISPID(1611005954) //= 0x60060002. The runtime will prefer the VTID if present
  @VTID(28)
  void boundary(
    Reference oBoundary);


  /**
   * <p>
   * Getter method for the COM property "ElemUntil"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611005956) //= 0x60060004. The runtime will prefer the VTID if present
  @VTID(29)
  Reference elemUntil();


  /**
   * <p>
   * Setter method for the COM property "ElemUntil"
   * </p>
   * @param oElemUntil Mandatory Reference parameter.
   */

  @DISPID(1611005956) //= 0x60060004. The runtime will prefer the VTID if present
  @VTID(30)
  void elemUntil(
    Reference oElemUntil);


  /**
   * <p>
   * Getter method for the COM property "Length"
   * </p>
   * @return  Returns a value of type Length
   */

  @DISPID(1611005958) //= 0x60060006. The runtime will prefer the VTID if present
  @VTID(31)
  Length length();


  /**
   * <p>
   * Getter method for the COM property "LimitType"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611005959) //= 0x60060007. The runtime will prefer the VTID if present
  @VTID(32)
  int limitType();


  /**
   * <p>
   * Setter method for the COM property "LimitType"
   * </p>
   * @param oLim Mandatory int parameter.
   */

  @DISPID(1611005959) //= 0x60060007. The runtime will prefer the VTID if present
  @VTID(33)
  void limitType(
    int oLim);


  /**
   * <p>
   * Getter method for the COM property "ContinuityType"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611005961) //= 0x60060009. The runtime will prefer the VTID if present
  @VTID(34)
  int continuityType();


  /**
   * <p>
   * Setter method for the COM property "ContinuityType"
   * </p>
   * @param oLim Mandatory int parameter.
   */

  @DISPID(1611005961) //= 0x60060009. The runtime will prefer the VTID if present
  @VTID(35)
  void continuityType(
    int oLim);


  /**
   * <p>
   * Getter method for the COM property "BorderType"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611005963) //= 0x6006000b. The runtime will prefer the VTID if present
  @VTID(36)
  int borderType();


  /**
   * <p>
   * Setter method for the COM property "BorderType"
   * </p>
   * @param oBorder Mandatory int parameter.
   */

  @DISPID(1611005963) //= 0x6006000b. The runtime will prefer the VTID if present
  @VTID(37)
  void borderType(
    int oBorder);


  /**
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005965) //= 0x6006000d. The runtime will prefer the VTID if present
  @VTID(38)
  boolean isAssemble();


  /**
   * @param iAssemble Mandatory boolean parameter.
   */

  @DISPID(1611005966) //= 0x6006000e. The runtime will prefer the VTID if present
  @VTID(39)
  void setAssemble(
    boolean iAssemble);


  /**
   * <p>
   * Getter method for the COM property "Support"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611005967) //= 0x6006000f. The runtime will prefer the VTID if present
  @VTID(40)
  Reference support();


  /**
   * <p>
   * Setter method for the COM property "Support"
   * </p>
   * @param oSupport Mandatory Reference parameter.
   */

  @DISPID(1611005967) //= 0x6006000f. The runtime will prefer the VTID if present
  @VTID(41)
  void support(
    Reference oSupport);


  /**
   * <p>
   * Getter method for the COM property "PropagationMode"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611005969) //= 0x60060011. The runtime will prefer the VTID if present
  @VTID(42)
  int propagationMode();


  /**
   * <p>
   * Setter method for the COM property "PropagationMode"
   * </p>
   * @param oPropagationMode Mandatory int parameter.
   */

  @DISPID(1611005969) //= 0x60060011. The runtime will prefer the VTID if present
  @VTID(43)
  void propagationMode(
    int oPropagationMode);


  /**
   * @param iPos Mandatory int parameter.
   * @return  Returns a value of type Reference
   */

  @DISPID(1611005971) //= 0x60060013. The runtime will prefer the VTID if present
  @VTID(44)
  Reference getInternalEdgesElement(
    int iPos);


  /**
   */

  @DISPID(1611005972) //= 0x60060014. The runtime will prefer the VTID if present
  @VTID(45)
  void removeAllInternalEdgesElement();


  /**
   * <p>
   * Getter method for the COM property "ExtendEdgesMode"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005973) //= 0x60060015. The runtime will prefer the VTID if present
  @VTID(46)
  boolean extendEdgesMode();


  /**
   * <p>
   * Setter method for the COM property "ExtendEdgesMode"
   * </p>
   * @param oExtendMode Mandatory boolean parameter.
   */

  @DISPID(1611005973) //= 0x60060015. The runtime will prefer the VTID if present
  @VTID(47)
  void extendEdgesMode(
    boolean oExtendMode);


  /**
   * <p>
   * Getter method for the COM property "ConstantLengthMode"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005975) //= 0x60060017. The runtime will prefer the VTID if present
  @VTID(48)
  boolean constantLengthMode();


  /**
   * <p>
   * Setter method for the COM property "ConstantLengthMode"
   * </p>
   * @param oConstantLengthMode Mandatory boolean parameter.
   */

  @DISPID(1611005975) //= 0x60060017. The runtime will prefer the VTID if present
  @VTID(49)
  void constantLengthMode(
    boolean oConstantLengthMode);


  // Properties:
}
