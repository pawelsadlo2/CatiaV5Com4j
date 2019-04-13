import com4j.*;

@IID("{81E35DCD-0FA5-0000-0280-030D3B000000}")
public interface Axis2D extends Geometry2D {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "HorizontalReference"
   * </p>
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.Line2D
   */

  @DISPID(1611071488) //= 0x60070000. The runtime will prefer the VTID if present
  @VTID(27)
  Line2D horizontalReference();


  /**
   * <p>
   * Getter method for the COM property "VerticalReference"
   * </p>
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.Line2D
   */

  @DISPID(1611071489) //= 0x60070001. The runtime will prefer the VTID if present
  @VTID(28)
  Line2D verticalReference();


  /**
   * <p>
   * Getter method for the COM property "Origin"
   * </p>
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.Point2D
   */

  @DISPID(1611071490) //= 0x60070002. The runtime will prefer the VTID if present
  @VTID(29)
  Point2D origin();


  // Properties:
}
