import com4j.*;

@IID("{B76FEAB0-FD99-11D4-9FA5-00508B130A6D}")
public interface Scaling2 extends Shape {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "ElemToScale"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(22)
  Reference elemToScale();


  /**
   * <p>
   * Setter method for the COM property "ElemToScale"
   * </p>
   * @param oX Mandatory Reference parameter.
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(23)
  void elemToScale(
    Reference oX);


  /**
   * <p>
   * Getter method for the COM property "Center"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611005954) //= 0x60060002. The runtime will prefer the VTID if present
  @VTID(24)
  Reference center();


  /**
   * <p>
   * Setter method for the COM property "Center"
   * </p>
   * @param oX Mandatory Reference parameter.
   */

  @DISPID(1611005954) //= 0x60060002. The runtime will prefer the VTID if present
  @VTID(25)
  void center(
    Reference oX);


  /**
   * <p>
   * Getter method for the COM property "Ratio"
   * </p>
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.RealParam
   */

  @DISPID(1611005956) //= 0x60060004. The runtime will prefer the VTID if present
  @VTID(26)
  RealParam ratio();


  /**
   * <p>
   * Getter method for the COM property "RatioValue"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(1611005957) //= 0x60060005. The runtime will prefer the VTID if present
  @VTID(27)
  double ratioValue();


  /**
   * <p>
   * Setter method for the COM property "RatioValue"
   * </p>
   * @param oX Mandatory double parameter.
   */

  @DISPID(1611005957) //= 0x60060005. The runtime will prefer the VTID if present
  @VTID(28)
  void ratioValue(
    double oX);


  // Properties:
}
