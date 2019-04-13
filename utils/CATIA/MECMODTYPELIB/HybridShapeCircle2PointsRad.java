import com4j.*;

@IID("{8D7E9C80-934F-0000-0280-020E60000000}")
public interface HybridShapeCircle2PointsRad extends HybridShapeCircle {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Pt1"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611071488) //= 0x60070000. The runtime will prefer the VTID if present
  @VTID(38)
  Reference pt1();


  /**
   * <p>
   * Setter method for the COM property "Pt1"
   * </p>
   * @param oPt Mandatory Reference parameter.
   */

  @DISPID(1611071488) //= 0x60070000. The runtime will prefer the VTID if present
  @VTID(39)
  void pt1(
    Reference oPt);


  /**
   * <p>
   * Getter method for the COM property "Pt2"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611071490) //= 0x60070002. The runtime will prefer the VTID if present
  @VTID(40)
  Reference pt2();


  /**
   * <p>
   * Setter method for the COM property "Pt2"
   * </p>
   * @param oPt Mandatory Reference parameter.
   */

  @DISPID(1611071490) //= 0x60070002. The runtime will prefer the VTID if present
  @VTID(41)
  void pt2(
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
   * <p>
   * Getter method for the COM property "Orientation"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611071494) //= 0x60070006. The runtime will prefer the VTID if present
  @VTID(44)
  int orientation();


  /**
   * <p>
   * Setter method for the COM property "Orientation"
   * </p>
   * @param oOri Mandatory int parameter.
   */

  @DISPID(1611071494) //= 0x60070006. The runtime will prefer the VTID if present
  @VTID(45)
  void orientation(
    int oOri);


  /**
   * <p>
   * Getter method for the COM property "DiameterMode"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1611071496) //= 0x60070008. The runtime will prefer the VTID if present
  @VTID(46)
  boolean diameterMode();


  /**
   * <p>
   * Setter method for the COM property "DiameterMode"
   * </p>
   * @param oDiameterMode Mandatory boolean parameter.
   */

  @DISPID(1611071496) //= 0x60070008. The runtime will prefer the VTID if present
  @VTID(47)
  void diameterMode(
    boolean oDiameterMode);


  /**
   * <p>
   * Getter method for the COM property "Radius"
   * </p>
   * @return  Returns a value of type Length
   */

  @DISPID(1611071498) //= 0x6007000a. The runtime will prefer the VTID if present
  @VTID(48)
  Length radius();


  /**
   * <p>
   * Getter method for the COM property "Diameter"
   * </p>
   * @return  Returns a value of type Length
   */

  @DISPID(1611071499) //= 0x6007000b. The runtime will prefer the VTID if present
  @VTID(49)
  Length diameter();


  /**
   * @return  Returns a value of type boolean
   */

  @DISPID(1611071500) //= 0x6007000c. The runtime will prefer the VTID if present
  @VTID(50)
  boolean isGeodesic();


  /**
   */

  @DISPID(1611071501) //= 0x6007000d. The runtime will prefer the VTID if present
  @VTID(51)
  void setGeometryOnSupport();


  /**
   */

  @DISPID(1611071502) //= 0x6007000e. The runtime will prefer the VTID if present
  @VTID(52)
  void unsetGeometryOnSupport();


  // Properties:
}
