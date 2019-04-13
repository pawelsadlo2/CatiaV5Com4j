import CatiaV5TypeLibs.InfTypeLib.*;
import com4j.*;

@IID("{89D76649-F63B-0000-0280-020E60000000}")
public interface HybridShapePointOnPlane extends Point {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Plane"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611071488) //= 0x60070000. The runtime will prefer the VTID if present
  @VTID(27)
  Reference plane();


  /**
   * <p>
   * Setter method for the COM property "Plane"
   * </p>
   * @param oPlane Mandatory Reference parameter.
   */

  @DISPID(1611071488) //= 0x60070000. The runtime will prefer the VTID if present
  @VTID(28)
  void plane(
    Reference oPlane);


  /**
   * <p>
   * Getter method for the COM property "Point"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611071490) //= 0x60070002. The runtime will prefer the VTID if present
  @VTID(29)
  Reference point();


  /**
   * <p>
   * Setter method for the COM property "Point"
   * </p>
   * @param oRefPoint Mandatory Reference parameter.
   */

  @DISPID(1611071490) //= 0x60070002. The runtime will prefer the VTID if present
  @VTID(30)
  void point(
    Reference oRefPoint);


  /**
   * <p>
   * Getter method for the COM property "XOffset"
   * </p>
   * @return  Returns a value of type Length
   */

  @DISPID(1611071492) //= 0x60070004. The runtime will prefer the VTID if present
  @VTID(31)
  Length xOffset();


  /**
   * <p>
   * Getter method for the COM property "YOffset"
   * </p>
   * @return  Returns a value of type Length
   */

  @DISPID(1611071493) //= 0x60070005. The runtime will prefer the VTID if present
  @VTID(32)
  Length yOffset();


  /**
   * <p>
   * Getter method for the COM property "FirstDirection"
   * </p>
   * @return  Returns a value of type HybridShapeDirection
   */

  @DISPID(1611071494) //= 0x60070006. The runtime will prefer the VTID if present
  @VTID(33)
  HybridShapeDirection firstDirection();


  /**
   * <p>
   * Setter method for the COM property "FirstDirection"
   * </p>
   * @param oDir Mandatory HybridShapeDirection parameter.
   */

  @DISPID(1611071494) //= 0x60070006. The runtime will prefer the VTID if present
  @VTID(34)
  void firstDirection(
    HybridShapeDirection oDir);


  /**
   * <p>
   * Getter method for the COM property "ProjectionSurface"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611071496) //= 0x60070008. The runtime will prefer the VTID if present
  @VTID(35)
  Reference projectionSurface();


  /**
   * <p>
   * Setter method for the COM property "ProjectionSurface"
   * </p>
   * @param oProjSur Mandatory Reference parameter.
   */

  @DISPID(1611071496) //= 0x60070008. The runtime will prefer the VTID if present
  @VTID(36)
  void projectionSurface(
    Reference oProjSur);


  /**
   * @param oDirX Mandatory Holder<Double> parameter.
   * @param oDirY Mandatory Holder<Double> parameter.
   * @param oDirZ Mandatory Holder<Double> parameter.
   */

  @DISPID(1611071498) //= 0x6007000a. The runtime will prefer the VTID if present
  @VTID(37)
  void getSecondDirection(
    Holder<Double> oDirX,
    Holder<Double> oDirY,
    Holder<Double> oDirZ);


  /**
   * @param iDirX Mandatory double parameter.
   * @param iDirY Mandatory double parameter.
   * @param iDirZ Mandatory double parameter.
   */

  @DISPID(1611071499) //= 0x6007000b. The runtime will prefer the VTID if present
  @VTID(38)
  void setSecondDirection(
    double iDirX,
    double iDirY,
    double iDirZ);


  // Properties:
}
