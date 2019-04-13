import com4j.*;

@IID("{89D76644-25B0-0000-0280-020E60000000}")
public interface HybridShapePointOnCurve extends Point {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Curve"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611071488) //= 0x60070000. The runtime will prefer the VTID if present
  @VTID(27)
  Reference curve();


  /**
   * <p>
   * Setter method for the COM property "Curve"
   * </p>
   * @param oCurve Mandatory Reference parameter.
   */

  @DISPID(1611071488) //= 0x60070000. The runtime will prefer the VTID if present
  @VTID(28)
  void curve(
    Reference oCurve);


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
   * Getter method for the COM property "Offset"
   * </p>
   * @return  Returns a value of type Length
   */

  @DISPID(1611071492) //= 0x60070004. The runtime will prefer the VTID if present
  @VTID(31)
  Length offset();


  /**
   * <p>
   * Getter method for the COM property "Ratio"
   * </p>
   * @return  Returns a value of type RealParam
   */

  @DISPID(1611071493) //= 0x60070005. The runtime will prefer the VTID if present
  @VTID(32)
  RealParam ratio();


  /**
   * <p>
   * Getter method for the COM property "Type"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611071494) //= 0x60070006. The runtime will prefer the VTID if present
  @VTID(33)
  int type();


  /**
   * <p>
   * Getter method for the COM property "Orientation"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611071495) //= 0x60070007. The runtime will prefer the VTID if present
  @VTID(34)
  int orientation();


  /**
   * <p>
   * Setter method for the COM property "Orientation"
   * </p>
   * @param oOrientation Mandatory int parameter.
   */

  @DISPID(1611071495) //= 0x60070007. The runtime will prefer the VTID if present
  @VTID(35)
  void orientation(
    int oOrientation);


  /**
   * <p>
   * Getter method for the COM property "DistanceType"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611071497) //= 0x60070009. The runtime will prefer the VTID if present
  @VTID(36)
  int distanceType();


  /**
   * <p>
   * Setter method for the COM property "DistanceType"
   * </p>
   * @param oDistanceType Mandatory int parameter.
   */

  @DISPID(1611071497) //= 0x60070009. The runtime will prefer the VTID if present
  @VTID(37)
  void distanceType(
    int oDistanceType);


  /**
   * <p>
   * Getter method for the COM property "Direction"
   * </p>
   * @return  Returns a value of type HybridShapeDirection
   */

  @DISPID(1611071499) //= 0x6007000b. The runtime will prefer the VTID if present
  @VTID(38)
  HybridShapeDirection direction();


  /**
   * <p>
   * Setter method for the COM property "Direction"
   * </p>
   * @param oDir Mandatory HybridShapeDirection parameter.
   */

  @DISPID(1611071499) //= 0x6007000b. The runtime will prefer the VTID if present
  @VTID(39)
  void direction(
    HybridShapeDirection oDir);


  /**
   * <p>
   * Getter method for the COM property "OnCurveType"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611071501) //= 0x6007000d. The runtime will prefer the VTID if present
  @VTID(40)
  int onCurveType();


  /**
   * <p>
   * Setter method for the COM property "OnCurveType"
   * </p>
   * @param oOnCurveType Mandatory int parameter.
   */

  @DISPID(1611071501) //= 0x6007000d. The runtime will prefer the VTID if present
  @VTID(41)
  void onCurveType(
    int oOnCurveType);


  // Properties:
}
