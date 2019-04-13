package CatiaV5TypeLibs.InfTypeLib;

import com4j.*;

@IID("{80BA69B0-6CA4-0000-0280-030BA6000000}")
public interface Viewpoint2D extends AnyObject {
  // Methods:
  /**
   * @param oOrigin Mandatory java.lang.Object[] parameter.
   */

  @DISPID(1610940416) //= 0x60050000. The runtime will prefer the VTID if present
  @VTID(22)
  void getOrigin(
    java.lang.Object[] oOrigin);


  /**
   * @param oOrigin Mandatory java.lang.Object[] parameter.
   */

  @DISPID(1610940417) //= 0x60050001. The runtime will prefer the VTID if present
  @VTID(23)
  void putOrigin(
    java.lang.Object[] oOrigin);


  /**
   * <p>
   * Getter method for the COM property "Zoom"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(1610940418) //= 0x60050002. The runtime will prefer the VTID if present
  @VTID(24)
  double zoom();


  /**
   * <p>
   * Setter method for the COM property "Zoom"
   * </p>
   * @param oZoom Mandatory double parameter.
   */

  @DISPID(1610940418) //= 0x60050002. The runtime will prefer the VTID if present
  @VTID(25)
  void zoom(
    double oZoom);


  // Properties:
}
