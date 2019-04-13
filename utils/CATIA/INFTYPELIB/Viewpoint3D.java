import com4j.*;

@IID("{809B55CA-39CC-0000-0280-030BA6000000}")
public interface Viewpoint3D extends AnyObject {
  // Methods:
  /**
   * @param origin Mandatory java.lang.Object[] parameter.
   */

  @DISPID(1610940416) //= 0x60050000. The runtime will prefer the VTID if present
  @VTID(22)
  void getOrigin(
    java.lang.Object[] origin);


  /**
   * @param origin Mandatory java.lang.Object[] parameter.
   */

  @DISPID(1610940417) //= 0x60050001. The runtime will prefer the VTID if present
  @VTID(23)
  void putOrigin(
    java.lang.Object[] origin);


  /**
   * <p>
   * Getter method for the COM property "FocusDistance"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(1610940418) //= 0x60050002. The runtime will prefer the VTID if present
  @VTID(24)
  double focusDistance();


  /**
   * <p>
   * Setter method for the COM property "FocusDistance"
   * </p>
   * @param focusDistance Mandatory double parameter.
   */

  @DISPID(1610940418) //= 0x60050002. The runtime will prefer the VTID if present
  @VTID(25)
  void focusDistance(
    double focusDistance);


  /**
   * @param oSight Mandatory java.lang.Object[] parameter.
   */

  @DISPID(1610940420) //= 0x60050004. The runtime will prefer the VTID if present
  @VTID(26)
  void getSightDirection(
    java.lang.Object[] oSight);


  /**
   * @param oSight Mandatory java.lang.Object[] parameter.
   */

  @DISPID(1610940421) //= 0x60050005. The runtime will prefer the VTID if present
  @VTID(27)
  void putSightDirection(
    java.lang.Object[] oSight);


  /**
   * @param oUp Mandatory java.lang.Object[] parameter.
   */

  @DISPID(1610940422) //= 0x60050006. The runtime will prefer the VTID if present
  @VTID(28)
  void getUpDirection(
    java.lang.Object[] oUp);


  /**
   * @param oUp Mandatory java.lang.Object[] parameter.
   */

  @DISPID(1610940423) //= 0x60050007. The runtime will prefer the VTID if present
  @VTID(29)
  void putUpDirection(
    java.lang.Object[] oUp);


  /**
   * <p>
   * Getter method for the COM property "ProjectionMode"
   * </p>
   * @return  Returns a value of type CatProjectionMode
   */

  @DISPID(1610940424) //= 0x60050008. The runtime will prefer the VTID if present
  @VTID(30)
  CatProjectionMode projectionMode();


  /**
   * <p>
   * Setter method for the COM property "ProjectionMode"
   * </p>
   * @param oProjectionMode Mandatory CatProjectionMode parameter.
   */

  @DISPID(1610940424) //= 0x60050008. The runtime will prefer the VTID if present
  @VTID(31)
  void projectionMode(
    CatProjectionMode oProjectionMode);


  /**
   * <p>
   * Getter method for the COM property "Zoom"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(1610940426) //= 0x6005000a. The runtime will prefer the VTID if present
  @VTID(32)
  double zoom();


  /**
   * <p>
   * Setter method for the COM property "Zoom"
   * </p>
   * @param oZoom Mandatory double parameter.
   */

  @DISPID(1610940426) //= 0x6005000a. The runtime will prefer the VTID if present
  @VTID(33)
  void zoom(
    double oZoom);


  /**
   * <p>
   * Getter method for the COM property "FieldOfView"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(1610940428) //= 0x6005000c. The runtime will prefer the VTID if present
  @VTID(34)
  double fieldOfView();


  /**
   * <p>
   * Setter method for the COM property "FieldOfView"
   * </p>
   * @param oFieldOfView Mandatory double parameter.
   */

  @DISPID(1610940428) //= 0x6005000c. The runtime will prefer the VTID if present
  @VTID(35)
  void fieldOfView(
    double oFieldOfView);


  // Properties:
}
