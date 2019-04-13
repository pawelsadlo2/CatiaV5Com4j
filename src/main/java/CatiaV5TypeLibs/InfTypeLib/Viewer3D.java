package CatiaV5TypeLibs.InfTypeLib;

import com4j.*;

@IID("{7F8C8382-D814-0000-0280-030BA6000000}")
public interface Viewer3D extends Viewer {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Viewpoint3D"
   * </p>
   * @return  Returns a value of type Viewpoint3D
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(35)
  Viewpoint3D viewpoint3D();


  /**
   * <p>
   * Setter method for the COM property "Viewpoint3D"
   * </p>
   * @param oViewpoint Mandatory Viewpoint3D parameter.
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(36)
  void viewpoint3D(
    Viewpoint3D oViewpoint);


  /**
   * @param iVector Mandatory java.lang.Object[] parameter.
   */

  @DISPID(1611005954) //= 0x60060002. The runtime will prefer the VTID if present
  @VTID(37)
  void translate(
    java.lang.Object[] iVector);


  /**
   * @param iAxis Mandatory java.lang.Object[] parameter.
   * @param iAngle Mandatory double parameter.
   */

  @DISPID(1611005955) //= 0x60060003. The runtime will prefer the VTID if present
  @VTID(38)
  void rotate(
    java.lang.Object[] iAxis,
    double iAngle);


  /**
   * <p>
   * Getter method for the COM property "LightSources"
   * </p>
   * @return  Returns a value of type LightSources
   */

  @DISPID(1611005956) //= 0x60060004. The runtime will prefer the VTID if present
  @VTID(39)
  LightSources lightSources();


  /**
   * <p>
   * Getter method for the COM property "LightingIntensity"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(1611005957) //= 0x60060005. The runtime will prefer the VTID if present
  @VTID(40)
  double lightingIntensity();


  /**
   * <p>
   * Setter method for the COM property "LightingIntensity"
   * </p>
   * @param oIntensity Mandatory double parameter.
   */

  @DISPID(1611005957) //= 0x60060005. The runtime will prefer the VTID if present
  @VTID(41)
  void lightingIntensity(
    double oIntensity);


  /**
   * <p>
   * Getter method for the COM property "LightingMode"
   * </p>
   * @return  Returns a value of type CatLightingMode
   */

  @DISPID(1611005959) //= 0x60060007. The runtime will prefer the VTID if present
  @VTID(42)
  CatLightingMode lightingMode();


  /**
   * <p>
   * Setter method for the COM property "LightingMode"
   * </p>
   * @param oLightingMode Mandatory CatLightingMode parameter.
   */

  @DISPID(1611005959) //= 0x60060007. The runtime will prefer the VTID if present
  @VTID(43)
  void lightingMode(
    CatLightingMode oLightingMode);


  /**
   * <p>
   * Getter method for the COM property "NavigationStyle"
   * </p>
   * @return  Returns a value of type CatNavigationStyle
   */

  @DISPID(1611005961) //= 0x60060009. The runtime will prefer the VTID if present
  @VTID(44)
  CatNavigationStyle navigationStyle();


  /**
   * <p>
   * Setter method for the COM property "NavigationStyle"
   * </p>
   * @param oNavigationStyle Mandatory CatNavigationStyle parameter.
   */

  @DISPID(1611005961) //= 0x60060009. The runtime will prefer the VTID if present
  @VTID(45)
  void navigationStyle(
    CatNavigationStyle oNavigationStyle);


  /**
   * <p>
   * Getter method for the COM property "RenderingMode"
   * </p>
   * @return  Returns a value of type CatRenderingMode
   */

  @DISPID(1611005963) //= 0x6006000b. The runtime will prefer the VTID if present
  @VTID(46)
  CatRenderingMode renderingMode();


  /**
   * <p>
   * Setter method for the COM property "RenderingMode"
   * </p>
   * @param oRenderingMode Mandatory CatRenderingMode parameter.
   */

  @DISPID(1611005963) //= 0x6006000b. The runtime will prefer the VTID if present
  @VTID(47)
  void renderingMode(
    CatRenderingMode oRenderingMode);


  /**
   * <p>
   * Getter method for the COM property "NearLimit"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(1611005965) //= 0x6006000d. The runtime will prefer the VTID if present
  @VTID(48)
  double nearLimit();


  /**
   * <p>
   * Setter method for the COM property "NearLimit"
   * </p>
   * @param oNearLimit Mandatory double parameter.
   */

  @DISPID(1611005965) //= 0x6006000d. The runtime will prefer the VTID if present
  @VTID(49)
  void nearLimit(
    double oNearLimit);


  /**
   * <p>
   * Getter method for the COM property "FarLimit"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(1611005967) //= 0x6006000f. The runtime will prefer the VTID if present
  @VTID(50)
  double farLimit();


  /**
   * <p>
   * Setter method for the COM property "FarLimit"
   * </p>
   * @param oFarLimit Mandatory double parameter.
   */

  @DISPID(1611005967) //= 0x6006000f. The runtime will prefer the VTID if present
  @VTID(51)
  void farLimit(
    double oFarLimit);


  /**
   * <p>
   * Getter method for the COM property "ClippingMode"
   * </p>
   * @return  Returns a value of type CatClippingMode
   */

  @DISPID(1611005969) //= 0x60060011. The runtime will prefer the VTID if present
  @VTID(52)
  CatClippingMode clippingMode();


  /**
   * <p>
   * Setter method for the COM property "ClippingMode"
   * </p>
   * @param oClippingMode Mandatory CatClippingMode parameter.
   */

  @DISPID(1611005969) //= 0x60060011. The runtime will prefer the VTID if present
  @VTID(53)
  void clippingMode(
    CatClippingMode oClippingMode);


  /**
   * <p>
   * Getter method for the COM property "Foggy"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005971) //= 0x60060013. The runtime will prefer the VTID if present
  @VTID(54)
  boolean foggy();


  /**
   * <p>
   * Setter method for the COM property "Foggy"
   * </p>
   * @param oFoggy Mandatory boolean parameter.
   */

  @DISPID(1611005971) //= 0x60060013. The runtime will prefer the VTID if present
  @VTID(55)
  void foggy(
    boolean oFoggy);


  /**
   * <p>
   * Getter method for the COM property "Ground"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005973) //= 0x60060015. The runtime will prefer the VTID if present
  @VTID(56)
  boolean ground();


  /**
   * <p>
   * Setter method for the COM property "Ground"
   * </p>
   * @param oGround Mandatory boolean parameter.
   */

  @DISPID(1611005973) //= 0x60060015. The runtime will prefer the VTID if present
  @VTID(57)
  void ground(
    boolean oGround);


  // Properties:
}
