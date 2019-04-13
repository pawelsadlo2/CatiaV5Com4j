import com4j.*;

@IID("{89D7661A-9109-0000-0280-020E60000000}")
public interface HybridShapePlaneAngle extends Plane {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "RevolAxis"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611071488) //= 0x60070000. The runtime will prefer the VTID if present
  @VTID(35)
  Reference revolAxis();


  /**
   * <p>
   * Setter method for the COM property "RevolAxis"
   * </p>
   * @param oAxis Mandatory Reference parameter.
   */

  @DISPID(1611071488) //= 0x60070000. The runtime will prefer the VTID if present
  @VTID(36)
  void revolAxis(
    Reference oAxis);


  /**
   * <p>
   * Getter method for the COM property "Plane"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611071490) //= 0x60070002. The runtime will prefer the VTID if present
  @VTID(37)
  Reference plane();


  /**
   * <p>
   * Setter method for the COM property "Plane"
   * </p>
   * @param oPlane Mandatory Reference parameter.
   */

  @DISPID(1611071490) //= 0x60070002. The runtime will prefer the VTID if present
  @VTID(38)
  void plane(
    Reference oPlane);


  /**
   * <p>
   * Getter method for the COM property "Angle"
   * </p>
   * @return  Returns a value of type Angle
   */

  @DISPID(1611071492) //= 0x60070004. The runtime will prefer the VTID if present
  @VTID(39)
  Angle angle();


  /**
   * <p>
   * Getter method for the COM property "Orientation"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611071493) //= 0x60070005. The runtime will prefer the VTID if present
  @VTID(40)
  int orientation();


  /**
   * <p>
   * Setter method for the COM property "Orientation"
   * </p>
   * @param oOrientation Mandatory int parameter.
   */

  @DISPID(1611071493) //= 0x60070005. The runtime will prefer the VTID if present
  @VTID(41)
  void orientation(
    int oOrientation);


  /**
   * <p>
   * Getter method for the COM property "ProjectionMode"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1611071495) //= 0x60070007. The runtime will prefer the VTID if present
  @VTID(42)
  boolean projectionMode();


  /**
   * <p>
   * Setter method for the COM property "ProjectionMode"
   * </p>
   * @param oProjectionMode Mandatory boolean parameter.
   */

  @DISPID(1611071495) //= 0x60070007. The runtime will prefer the VTID if present
  @VTID(43)
  void projectionMode(
    boolean oProjectionMode);


  // Properties:
}
