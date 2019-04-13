import com4j.*;

@IID("{039DC266-360A-44E4-96A4-2126C971E52E}")
public interface HybridShapeAxisLine extends HybridShape {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Element"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(25)
  Reference element();


  /**
   * <p>
   * Setter method for the COM property "Element"
   * </p>
   * @param ohElem Mandatory Reference parameter.
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(26)
  void element(
    Reference ohElem);


  /**
   * <p>
   * Getter method for the COM property "Direction"
   * </p>
   * @return  Returns a value of type HybridShapeDirection
   */

  @DISPID(1611005954) //= 0x60060002. The runtime will prefer the VTID if present
  @VTID(27)
  HybridShapeDirection direction();


  /**
   * <p>
   * Setter method for the COM property "Direction"
   * </p>
   * @param ohDir Mandatory HybridShapeDirection parameter.
   */

  @DISPID(1611005954) //= 0x60060002. The runtime will prefer the VTID if present
  @VTID(28)
  void direction(
    HybridShapeDirection ohDir);


  /**
   * <p>
   * Getter method for the COM property "AxisLineType"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611005956) //= 0x60060004. The runtime will prefer the VTID if present
  @VTID(29)
  int axisLineType();


  /**
   * <p>
   * Setter method for the COM property "AxisLineType"
   * </p>
   * @param oType Mandatory int parameter.
   */

  @DISPID(1611005956) //= 0x60060004. The runtime will prefer the VTID if present
  @VTID(30)
  void axisLineType(
    int oType);


  // Properties:
}
