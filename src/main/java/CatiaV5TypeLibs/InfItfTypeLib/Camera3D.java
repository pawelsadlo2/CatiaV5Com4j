package CatiaV5TypeLibs.InfItfTypeLib;

import com4j.*;

@IID("{80BA692E-035F-0000-0280-030BA6000000}")
public interface Camera3D extends Camera {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Viewpoint3D"
   * </p>
   * @return  Returns a value of type Viewpoint3D
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(23)
  Viewpoint3D viewpoint3D();


  /**
   * <p>
   * Setter method for the COM property "Viewpoint3D"
   * </p>
   * @param oViewpoint Mandatory Viewpoint3D parameter.
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(24)
  void viewpoint3D(
    Viewpoint3D oViewpoint);


  // Properties:
}
