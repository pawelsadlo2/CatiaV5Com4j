import com4j.*;

@IID("{8CD8D95D-13A3-0000-0280-020E60000000}")
public interface HybridShapeSweep extends HybridShape {
  // Methods:
  /**
   * @param iRank Mandatory int parameter.
   * @return  Returns a value of type Reference
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(25)
  Reference getCutPoint(
    int iRank);


  /**
   * @param iElement1 Mandatory Reference parameter.
   * @param iElement2 Mandatory Reference parameter.
   */

  @DISPID(1611005953) //= 0x60060001. The runtime will prefer the VTID if present
  @VTID(26)
  void addCutPoints(
    Reference iElement1,
    Reference iElement2);


  /**
   */

  @DISPID(1611005954) //= 0x60060002. The runtime will prefer the VTID if present
  @VTID(27)
  void removeAllCutPoints();


  /**
   * @param iRank Mandatory int parameter.
   * @return  Returns a value of type Reference
   */

  @DISPID(1611005955) //= 0x60060003. The runtime will prefer the VTID if present
  @VTID(28)
  Reference getFillPoint(
    int iRank);


  /**
   * @param iElement1 Mandatory Reference parameter.
   * @param iElement2 Mandatory Reference parameter.
   */

  @DISPID(1611005956) //= 0x60060004. The runtime will prefer the VTID if present
  @VTID(29)
  void addFillPoints(
    Reference iElement1,
    Reference iElement2);


  /**
   */

  @DISPID(1611005957) //= 0x60060005. The runtime will prefer the VTID if present
  @VTID(30)
  void removeAllFillPoints();


  /**
   * <p>
   * Getter method for the COM property "SetbackValue"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(1611005958) //= 0x60060006. The runtime will prefer the VTID if present
  @VTID(31)
  double setbackValue();


  /**
   * <p>
   * Setter method for the COM property "SetbackValue"
   * </p>
   * @param oValue Mandatory double parameter.
   */

  @DISPID(1611005958) //= 0x60060006. The runtime will prefer the VTID if present
  @VTID(32)
  void setbackValue(
    double oValue);


  /**
   * <p>
   * Getter method for the COM property "FillTwistedAreas"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611005960) //= 0x60060008. The runtime will prefer the VTID if present
  @VTID(33)
  int fillTwistedAreas();


  /**
   * <p>
   * Setter method for the COM property "FillTwistedAreas"
   * </p>
   * @param oMode Mandatory int parameter.
   */

  @DISPID(1611005960) //= 0x60060008. The runtime will prefer the VTID if present
  @VTID(34)
  void fillTwistedAreas(
    int oMode);


  /**
   * <p>
   * Getter method for the COM property "C0VerticesMode"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005962) //= 0x6006000a. The runtime will prefer the VTID if present
  @VTID(35)
  boolean c0VerticesMode();


  /**
   * <p>
   * Setter method for the COM property "C0VerticesMode"
   * </p>
   * @param obC0VerticesMode Mandatory boolean parameter.
   */

  @DISPID(1611005962) //= 0x6006000a. The runtime will prefer the VTID if present
  @VTID(36)
  void c0VerticesMode(
    boolean obC0VerticesMode);


  // Properties:
}
