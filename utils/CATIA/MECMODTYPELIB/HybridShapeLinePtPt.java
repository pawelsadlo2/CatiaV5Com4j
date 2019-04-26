import com4j.*;

@IID("{89D765FF-83D5-0000-0280-020E60000000}")
public interface HybridShapeLinePtPt extends Line {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "PtOrigine"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611071488) //= 0x60070000. The runtime will prefer the VTID if present
  @VTID(32)
  Reference ptOrigine();


  /**
   * <p>
   * Setter method for the COM property "PtOrigine"
   * </p>
   * @param oPt1 Mandatory Reference parameter.
   */

  @DISPID(1611071488) //= 0x60070000. The runtime will prefer the VTID if present
  @VTID(33)
  void ptOrigine(
    Reference oPt1);


  /**
   * <p>
   * Getter method for the COM property "PtExtremity"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611071490) //= 0x60070002. The runtime will prefer the VTID if present
  @VTID(34)
  Reference ptExtremity();


  /**
   * <p>
   * Setter method for the COM property "PtExtremity"
   * </p>
   * @param oPt2 Mandatory Reference parameter.
   */

  @DISPID(1611071490) //= 0x60070002. The runtime will prefer the VTID if present
  @VTID(35)
  void ptExtremity(
    Reference oPt2);


  /**
   * <p>
   * Getter method for the COM property "Support"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611071492) //= 0x60070004. The runtime will prefer the VTID if present
  @VTID(36)
  Reference support();


  /**
   * <p>
   * Setter method for the COM property "Support"
   * </p>
   * @param oSurface Mandatory Reference parameter.
   */

  @DISPID(1611071492) //= 0x60070004. The runtime will prefer the VTID if present
  @VTID(37)
  void support(
    Reference oSurface);


  /**
   * <p>
   * Getter method for the COM property "BeginOffset"
   * </p>
   * @return  Returns a value of type Length
   */

  @DISPID(1611071494) //= 0x60070006. The runtime will prefer the VTID if present
  @VTID(38)
  Length beginOffset();


  /**
   * <p>
   * Getter method for the COM property "EndOffset"
   * </p>
   * @return  Returns a value of type Length
   */

  @DISPID(1611071495) //= 0x60070007. The runtime will prefer the VTID if present
  @VTID(39)
  Length endOffset();


  /**
   * @return  Returns a value of type int
   */

  @DISPID(1611071496) //= 0x60070008. The runtime will prefer the VTID if present
  @VTID(40)
  int getLengthType();


  /**
   * @param iType Mandatory int parameter.
   */

  @DISPID(1611071497) //= 0x60070009. The runtime will prefer the VTID if present
  @VTID(41)
  void setLengthType(
    int iType);


  /**
   * @param iSym Mandatory boolean parameter.
   */

  @DISPID(1611071498) //= 0x6007000a. The runtime will prefer the VTID if present
  @VTID(42)
  void setSymmetricalExtension(
    boolean iSym);


  /**
   * @return  Returns a value of type boolean
   */

  @DISPID(1611071499) //= 0x6007000b. The runtime will prefer the VTID if present
  @VTID(43)
  boolean getSymmetricalExtension();


  /**
   */

  @DISPID(1611071500) //= 0x6007000c. The runtime will prefer the VTID if present
  @VTID(44)
  void removeSupport();


  // Properties:
}