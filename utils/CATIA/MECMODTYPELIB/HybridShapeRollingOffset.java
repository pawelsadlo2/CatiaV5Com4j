import com4j.*;

@IID("{756172AC-D59A-11D4-9079-000629EE40FE}")
public interface HybridShapeRollingOffset extends HybridShape {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Offset"
   * </p>
   * @return  Returns a value of type Length
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(25)
  Length offset();


  /**
   * @return  Returns a value of type double
   */

  @DISPID(1611005953) //= 0x60060001. The runtime will prefer the VTID if present
  @VTID(26)
  double getOffset();


  /**
   * @param iOffset Mandatory double parameter.
   */

  @DISPID(1611005954) //= 0x60060002. The runtime will prefer the VTID if present
  @VTID(27)
  void putOffset(
    double iOffset);


  /**
   * <p>
   * Getter method for the COM property "Support"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611005955) //= 0x60060003. The runtime will prefer the VTID if present
  @VTID(28)
  Reference support();


  /**
   * <p>
   * Setter method for the COM property "Support"
   * </p>
   * @param oSupport Mandatory Reference parameter.
   */

  @DISPID(1611005955) //= 0x60060003. The runtime will prefer the VTID if present
  @VTID(29)
  void support(
    Reference oSupport);


  /**
   * @return  Returns a value of type int
   */

  @DISPID(1611005957) //= 0x60060005. The runtime will prefer the VTID if present
  @VTID(30)
  int getNbCurve();


  /**
   * @param iPos Mandatory int parameter.
   * @return  Returns a value of type Reference
   */

  @DISPID(1611005958) //= 0x60060006. The runtime will prefer the VTID if present
  @VTID(31)
  Reference getCurve(
    int iPos);


  /**
   * @param iCurve Mandatory Reference parameter.
   */

  @DISPID(1611005959) //= 0x60060007. The runtime will prefer the VTID if present
  @VTID(32)
  void putCurve(
    Reference iCurve);


  // Properties:
}
