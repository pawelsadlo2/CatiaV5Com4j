import com4j.*;

@IID("{80BA68DD-8934-0000-0280-030BA6000000}")
public interface Camera2D extends Camera {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Viewpoint2D"
   * </p>
   * @return  Returns a value of type Viewpoint2D
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(23)
  Viewpoint2D viewpoint2D();


  /**
   * <p>
   * Setter method for the COM property "Viewpoint2D"
   * </p>
   * @param oViewpoint Mandatory Viewpoint2D parameter.
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(24)
  void viewpoint2D(
    Viewpoint2D oViewpoint);


  // Properties:
}
