import com4j.*;

@IID("{DBC34B1D-669B-11D1-A27F-0000F87546FD}")
public interface Pattern extends TransformationShape {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "ItemToCopy"
   * </p>
   * @return  Returns a value of type AnyObject
   */

  @DISPID(1611071488) //= 0x60070000. The runtime will prefer the VTID if present
  @VTID(22)
  AnyObject itemToCopy();


  /**
   * <p>
   * Setter method for the COM property "ItemToCopy"
   * </p>
   * @param oToCopy Mandatory AnyObject parameter.
   */

  @DISPID(1611071488) //= 0x60070000. The runtime will prefer the VTID if present
  @VTID(23)
  void itemToCopy(
    AnyObject oToCopy);


  /**
   * <p>
   * Getter method for the COM property "RotationAngle"
   * </p>
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.Angle
   */

  @DISPID(1611071490) //= 0x60070002. The runtime will prefer the VTID if present
  @VTID(24)
  Angle rotationAngle();


  /**
   * @param iPosU Mandatory int parameter.
   * @param iPosV Mandatory int parameter.
   */

  @DISPID(1611071491) //= 0x60070003. The runtime will prefer the VTID if present
  @VTID(25)
  void activatePosition(
    int iPosU,
    int iPosV);


  /**
   * @param iPosU Mandatory int parameter.
   * @param iPosV Mandatory int parameter.
   */

  @DISPID(1611071492) //= 0x60070004. The runtime will prefer the VTID if present
  @VTID(26)
  void desactivatePosition(
    int iPosU,
    int iPosV);


  // Properties:
}
