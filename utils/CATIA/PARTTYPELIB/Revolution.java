import com4j.*;

@IID("{67B03C08-64F8-11D1-A27F-0000F87546FD}")
public interface Revolution extends SketchBasedShape {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "FirstAngle"
   * </p>
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.Angle
   */

  @DISPID(1611071488) //= 0x60070000. The runtime will prefer the VTID if present
  @VTID(24)
  Angle firstAngle();


  /**
   * <p>
   * Getter method for the COM property "SecondAngle"
   * </p>
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.Angle
   */

  @DISPID(1611071489) //= 0x60070001. The runtime will prefer the VTID if present
  @VTID(25)
  Angle secondAngle();


  /**
   * <p>
   * Getter method for the COM property "RevoluteAxis"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611071490) //= 0x60070002. The runtime will prefer the VTID if present
  @VTID(26)
  Reference revoluteAxis();


  /**
   * <p>
   * Setter method for the COM property "RevoluteAxis"
   * </p>
   * @param oAxis Mandatory Reference parameter.
   */

  @DISPID(1611071490) //= 0x60070002. The runtime will prefer the VTID if present
  @VTID(27)
  void revoluteAxis(
    Reference oAxis);


  /**
   * <p>
   * Getter method for the COM property "IsThin"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1611071492) //= 0x60070004. The runtime will prefer the VTID if present
  @VTID(28)
  boolean isThin();


  /**
   * <p>
   * Setter method for the COM property "IsThin"
   * </p>
   * @param oIsThin Mandatory boolean parameter.
   */

  @DISPID(1611071492) //= 0x60070004. The runtime will prefer the VTID if present
  @VTID(29)
  void isThin(
    boolean oIsThin);


  /**
   * <p>
   * Getter method for the COM property "NeutralFiber"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1611071494) //= 0x60070006. The runtime will prefer the VTID if present
  @VTID(30)
  boolean neutralFiber();


  /**
   * <p>
   * Setter method for the COM property "NeutralFiber"
   * </p>
   * @param oIsNeutralFiber Mandatory boolean parameter.
   */

  @DISPID(1611071494) //= 0x60070006. The runtime will prefer the VTID if present
  @VTID(31)
  void neutralFiber(
    boolean oIsNeutralFiber);


  /**
   * <p>
   * Getter method for the COM property "MergeEnd"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1611071496) //= 0x60070008. The runtime will prefer the VTID if present
  @VTID(32)
  boolean mergeEnd();


  /**
   * <p>
   * Setter method for the COM property "MergeEnd"
   * </p>
   * @param oIsMergeEnd Mandatory boolean parameter.
   */

  @DISPID(1611071496) //= 0x60070008. The runtime will prefer the VTID if present
  @VTID(33)
  void mergeEnd(
    boolean oIsMergeEnd);


  // Properties:
}
