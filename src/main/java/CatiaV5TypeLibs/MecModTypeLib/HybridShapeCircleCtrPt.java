import CatiaV5TypeLibs.InfTypeLib.*;
import com4j.*;

@IID("{8D7E9C50-8271-0000-0280-020E60000000}")
public interface HybridShapeCircleCtrPt extends HybridShapeCircle {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Center"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611071488) //= 0x60070000. The runtime will prefer the VTID if present
  @VTID(38)
  Reference center();


  /**
   * <p>
   * Setter method for the COM property "Center"
   * </p>
   * @param oPt Mandatory Reference parameter.
   */

  @DISPID(1611071488) //= 0x60070000. The runtime will prefer the VTID if present
  @VTID(39)
  void center(
    Reference oPt);


  /**
   * <p>
   * Getter method for the COM property "CrossingPoint"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611071490) //= 0x60070002. The runtime will prefer the VTID if present
  @VTID(40)
  Reference crossingPoint();


  /**
   * <p>
   * Setter method for the COM property "CrossingPoint"
   * </p>
   * @param oPt Mandatory Reference parameter.
   */

  @DISPID(1611071490) //= 0x60070002. The runtime will prefer the VTID if present
  @VTID(41)
  void crossingPoint(
    Reference oPt);


  /**
   * <p>
   * Getter method for the COM property "Support"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611071492) //= 0x60070004. The runtime will prefer the VTID if present
  @VTID(42)
  Reference support();


  /**
   * <p>
   * Setter method for the COM property "Support"
   * </p>
   * @param oSupport Mandatory Reference parameter.
   */

  @DISPID(1611071492) //= 0x60070004. The runtime will prefer the VTID if present
  @VTID(43)
  void support(
    Reference oSupport);


  /**
   * @return  Returns a value of type boolean
   */

  @DISPID(1611071494) //= 0x60070006. The runtime will prefer the VTID if present
  @VTID(44)
  boolean isGeodesic();


  /**
   */

  @DISPID(1611071495) //= 0x60070007. The runtime will prefer the VTID if present
  @VTID(45)
  void setGeometryOnSupport();


  /**
   */

  @DISPID(1611071496) //= 0x60070008. The runtime will prefer the VTID if present
  @VTID(46)
  void unsetGeometryOnSupport();


  // Properties:
}
