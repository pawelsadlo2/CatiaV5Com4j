import com4j.*;

@IID("{89D76632-C792-0000-0280-020E60000000}")
public interface HybridShapePlaneOffsetPt extends Plane {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Plane"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611071488) //= 0x60070000. The runtime will prefer the VTID if present
  @VTID(35)
  Reference plane();


  /**
   * <p>
   * Setter method for the COM property "Plane"
   * </p>
   * @param oPlane Mandatory Reference parameter.
   */

  @DISPID(1611071488) //= 0x60070000. The runtime will prefer the VTID if present
  @VTID(36)
  void plane(
    Reference oPlane);


  /**
   * <p>
   * Getter method for the COM property "Point"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611071490) //= 0x60070002. The runtime will prefer the VTID if present
  @VTID(37)
  Reference point();


  /**
   * <p>
   * Setter method for the COM property "Point"
   * </p>
   * @param oPoint Mandatory Reference parameter.
   */

  @DISPID(1611071490) //= 0x60070002. The runtime will prefer the VTID if present
  @VTID(38)
  void point(
    Reference oPoint);


  // Properties:
}
