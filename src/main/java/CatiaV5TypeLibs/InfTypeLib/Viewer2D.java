package CatiaV5TypeLibs.InfTypeLib;

import com4j.*;

@IID("{80BA7F3C-060B-0000-0280-030BA6000000}")
public interface Viewer2D extends Viewer {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Viewpoint2D"
   * </p>
   * @return  Returns a value of type Viewpoint2D
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(35)
  Viewpoint2D viewpoint2D();


  /**
   * <p>
   * Setter method for the COM property "Viewpoint2D"
   * </p>
   * @param oViewpoint Mandatory Viewpoint2D parameter.
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(36)
  void viewpoint2D(
    Viewpoint2D oViewpoint);


  // Properties:
}
