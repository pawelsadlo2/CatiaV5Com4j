package CatiaV5TypeLibs.InfTypeLib;

import com4j.*;

@IID("{80BA5F08-1DAB-0000-0280-030BA6000000}")
public interface Viewer extends AnyObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "FullScreen"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610940416) //= 0x60050000. The runtime will prefer the VTID if present
  @VTID(22)
  boolean fullScreen();


  /**
   * <p>
   * Setter method for the COM property "FullScreen"
   * </p>
   * @param oFullScreen Mandatory boolean parameter.
   */

  @DISPID(1610940416) //= 0x60050000. The runtime will prefer the VTID if present
  @VTID(23)
  void fullScreen(
    boolean oFullScreen);


  /**
   * @param color Mandatory java.lang.Object[] parameter.
   */

  @DISPID(1610940418) //= 0x60050002. The runtime will prefer the VTID if present
  @VTID(24)
  void getBackgroundColor(
    java.lang.Object[] color);


  /**
   * @param color Mandatory java.lang.Object[] parameter.
   */

  @DISPID(1610940419) //= 0x60050003. The runtime will prefer the VTID if present
  @VTID(25)
  void putBackgroundColor(
    java.lang.Object[] color);


  /**
   * <p>
   * Getter method for the COM property "Width"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610940420) //= 0x60050004. The runtime will prefer the VTID if present
  @VTID(26)
  int width();


  /**
   * <p>
   * Getter method for the COM property "Height"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610940421) //= 0x60050005. The runtime will prefer the VTID if present
  @VTID(27)
  int height();


  /**
   */

  @DISPID(1610940422) //= 0x60050006. The runtime will prefer the VTID if present
  @VTID(28)
  void update();


  /**
   */

  @DISPID(1610940423) //= 0x60050007. The runtime will prefer the VTID if present
  @VTID(29)
  void reframe();


  /**
   */

  @DISPID(1610940424) //= 0x60050008. The runtime will prefer the VTID if present
  @VTID(30)
  void zoomIn();


  /**
   */

  @DISPID(1610940425) //= 0x60050009. The runtime will prefer the VTID if present
  @VTID(31)
  void zoomOut();


  /**
   * @param iFormat Mandatory CatCaptureFormat parameter.
   * @param iFile Mandatory Holder<java.lang.String> parameter.
   */

  @DISPID(1610940426) //= 0x6005000a. The runtime will prefer the VTID if present
  @VTID(32)
  void captureToFile(
    CatCaptureFormat iFormat,
    Holder<java.lang.String> iFile);


  /**
   * @return  Returns a value of type Camera
   */

  @DISPID(1610940427) //= 0x6005000b. The runtime will prefer the VTID if present
  @VTID(33)
  Camera newCamera();


  /**
   */

  @DISPID(1610940428) //= 0x6005000c. The runtime will prefer the VTID if present
  @VTID(34)
  void activate();


  // Properties:
}
