import com4j.*;

@IID("{89640425-AE4A-0000-0280-020E60000000}")
public interface HybridShapeExtrude extends HybridShape {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "BeginOffset"
   * </p>
   * @return  Returns a value of type Length
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(25)
  Length beginOffset();


  /**
   * <p>
   * Getter method for the COM property "EndOffset"
   * </p>
   * @return  Returns a value of type Length
   */

  @DISPID(1611005953) //= 0x60060001. The runtime will prefer the VTID if present
  @VTID(26)
  Length endOffset();


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
   * @param oDir Mandatory HybridShapeDirection parameter.
   */

  @DISPID(1611005954) //= 0x60060002. The runtime will prefer the VTID if present
  @VTID(28)
  void direction(
    HybridShapeDirection oDir);


  /**
   * <p>
   * Getter method for the COM property "ExtrudedObject"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611005956) //= 0x60060004. The runtime will prefer the VTID if present
  @VTID(29)
  Reference extrudedObject();


  /**
   * <p>
   * Setter method for the COM property "ExtrudedObject"
   * </p>
   * @param oFaceToExtrude Mandatory Reference parameter.
   */

  @DISPID(1611005956) //= 0x60060004. The runtime will prefer the VTID if present
  @VTID(30)
  void extrudedObject(
    Reference oFaceToExtrude);


  /**
   * <p>
   * Getter method for the COM property "Context"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611005958) //= 0x60060006. The runtime will prefer the VTID if present
  @VTID(31)
  int context();


  /**
   * <p>
   * Setter method for the COM property "Context"
   * </p>
   * @param oContext Mandatory int parameter.
   */

  @DISPID(1611005958) //= 0x60060006. The runtime will prefer the VTID if present
  @VTID(32)
  void context(
    int oContext);


  /**
   * <p>
   * Setter method for the COM property "Orientation"
   * </p>
   * @param oOrientation Mandatory boolean parameter.
   */

  @DISPID(1611005960) //= 0x60060008. The runtime will prefer the VTID if present
  @VTID(33)
  void orientation(
    boolean oOrientation);


  /**
   * <p>
   * Getter method for the COM property "Orientation"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005960) //= 0x60060008. The runtime will prefer the VTID if present
  @VTID(34)
  boolean orientation();


  /**
   * <p>
   * Getter method for the COM property "FirstLimitType"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611005962) //= 0x6006000a. The runtime will prefer the VTID if present
  @VTID(35)
  int firstLimitType();


  /**
   * <p>
   * Setter method for the COM property "FirstLimitType"
   * </p>
   * @param oLim1Type Mandatory int parameter.
   */

  @DISPID(1611005962) //= 0x6006000a. The runtime will prefer the VTID if present
  @VTID(36)
  void firstLimitType(
    int oLim1Type);


  /**
   * <p>
   * Getter method for the COM property "SecondLimitType"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611005964) //= 0x6006000c. The runtime will prefer the VTID if present
  @VTID(37)
  int secondLimitType();


  /**
   * <p>
   * Setter method for the COM property "SecondLimitType"
   * </p>
   * @param oLim2Type Mandatory int parameter.
   */

  @DISPID(1611005964) //= 0x6006000c. The runtime will prefer the VTID if present
  @VTID(38)
  void secondLimitType(
    int oLim2Type);


  /**
   * <p>
   * Getter method for the COM property "FirstUptoElement"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611005966) //= 0x6006000e. The runtime will prefer the VTID if present
  @VTID(39)
  Reference firstUptoElement();


  /**
   * <p>
   * Setter method for the COM property "FirstUptoElement"
   * </p>
   * @param oLim1Elem Mandatory Reference parameter.
   */

  @DISPID(1611005966) //= 0x6006000e. The runtime will prefer the VTID if present
  @VTID(40)
  void firstUptoElement(
    Reference oLim1Elem);


  /**
   * <p>
   * Getter method for the COM property "SecondUptoElement"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611005968) //= 0x60060010. The runtime will prefer the VTID if present
  @VTID(41)
  Reference secondUptoElement();


  /**
   * <p>
   * Setter method for the COM property "SecondUptoElement"
   * </p>
   * @param oLim2Elem Mandatory Reference parameter.
   */

  @DISPID(1611005968) //= 0x60060010. The runtime will prefer the VTID if present
  @VTID(42)
  void secondUptoElement(
    Reference oLim2Elem);


  /**
   * <p>
   * Getter method for the COM property "SymmetricalExtension"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005970) //= 0x60060012. The runtime will prefer the VTID if present
  @VTID(43)
  boolean symmetricalExtension();


  /**
   * <p>
   * Setter method for the COM property "SymmetricalExtension"
   * </p>
   * @param oSym Mandatory boolean parameter.
   */

  @DISPID(1611005970) //= 0x60060012. The runtime will prefer the VTID if present
  @VTID(44)
  void symmetricalExtension(
    boolean oSym);


  // Properties:
}
