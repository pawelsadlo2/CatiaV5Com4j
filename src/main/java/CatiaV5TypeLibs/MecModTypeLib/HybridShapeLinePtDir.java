import CatiaV5TypeLibs.InfTypeLib.*;
import com4j.*;

@IID("{89D765FA-B434-0000-0280-020E60000000}")
public interface HybridShapeLinePtDir extends Line {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Point"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611071488) //= 0x60070000. The runtime will prefer the VTID if present
  @VTID(32)
  Reference point();


  /**
   * <p>
   * Setter method for the COM property "Point"
   * </p>
   * @param oPoint Mandatory Reference parameter.
   */

  @DISPID(1611071488) //= 0x60070000. The runtime will prefer the VTID if present
  @VTID(33)
  void point(
    Reference oPoint);


  /**
   * <p>
   * Getter method for the COM property "BeginOffset"
   * </p>
   * @return  Returns a value of type Length
   */

  @DISPID(1611071490) //= 0x60070002. The runtime will prefer the VTID if present
  @VTID(34)
  Length beginOffset();


  /**
   * <p>
   * Getter method for the COM property "EndOffset"
   * </p>
   * @return  Returns a value of type Length
   */

  @DISPID(1611071491) //= 0x60070003. The runtime will prefer the VTID if present
  @VTID(35)
  Length endOffset();


  /**
   * <p>
   * Getter method for the COM property "Dir"
   * </p>
   * @return  Returns a value of type HybridShapeDirection
   */

  @DISPID(1611071492) //= 0x60070004. The runtime will prefer the VTID if present
  @VTID(36)
  HybridShapeDirection dir();


  /**
   * <p>
   * Setter method for the COM property "Dir"
   * </p>
   * @param oDir Mandatory HybridShapeDirection parameter.
   */

  @DISPID(1611071492) //= 0x60070004. The runtime will prefer the VTID if present
  @VTID(37)
  void dir(
    HybridShapeDirection oDir);


  /**
   * <p>
   * Getter method for the COM property "Support"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611071494) //= 0x60070006. The runtime will prefer the VTID if present
  @VTID(38)
  Reference support();


  /**
   * <p>
   * Setter method for the COM property "Support"
   * </p>
   * @param oSurface Mandatory Reference parameter.
   */

  @DISPID(1611071494) //= 0x60070006. The runtime will prefer the VTID if present
  @VTID(39)
  void support(
    Reference oSurface);


  /**
   * <p>
   * Getter method for the COM property "Orientation"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611071496) //= 0x60070008. The runtime will prefer the VTID if present
  @VTID(40)
  int orientation();


  /**
   * <p>
   * Setter method for the COM property "Orientation"
   * </p>
   * @param oOrientation Mandatory int parameter.
   */

  @DISPID(1611071496) //= 0x60070008. The runtime will prefer the VTID if present
  @VTID(41)
  void orientation(
    int oOrientation);


  /**
   * @return  Returns a value of type int
   */

  @DISPID(1611071498) //= 0x6007000a. The runtime will prefer the VTID if present
  @VTID(42)
  int getLengthType();


  /**
   * @param iType Mandatory int parameter.
   */

  @DISPID(1611071499) //= 0x6007000b. The runtime will prefer the VTID if present
  @VTID(43)
  void setLengthType(
    int iType);


  /**
   * @param iSym Mandatory boolean parameter.
   */

  @DISPID(1611071500) //= 0x6007000c. The runtime will prefer the VTID if present
  @VTID(44)
  void setSymmetricalExtension(
    boolean iSym);


  /**
   * @return  Returns a value of type boolean
   */

  @DISPID(1611071501) //= 0x6007000d. The runtime will prefer the VTID if present
  @VTID(45)
  boolean getSymmetricalExtension();


  /**
   */

  @DISPID(1611071502) //= 0x6007000e. The runtime will prefer the VTID if present
  @VTID(46)
  void removeSupport();


  // Properties:
}
