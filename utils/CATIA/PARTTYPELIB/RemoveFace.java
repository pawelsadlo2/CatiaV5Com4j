import com4j.*;

@IID("{28AFF133-5F74-4247-8E38-08CCE69ED30E}")
public interface RemoveFace extends DressUpShape {
  // Methods:
  /**
   * <p>
   * Setter method for the COM property "KeepFace"
   * </p>
   * @param rhs Mandatory Reference parameter.
   */

  @DISPID(1611071488) //= 0x60070000. The runtime will prefer the VTID if present
  @VTID(22)
  void keepFace(
    Reference rhs);


  /**
   * @param iKeepFace Mandatory Reference parameter.
   */

  @DISPID(1611071489) //= 0x60070001. The runtime will prefer the VTID if present
  @VTID(23)
  void remove_KeepFace(
    Reference iKeepFace);


  /**
   * <p>
   * Setter method for the COM property "CatiaV5TypeLibs.PartItfTypeLib.RemoveFace"
   * </p>
   * @param rhs Mandatory Reference parameter.
   */

  @DISPID(1611071490) //= 0x60070002. The runtime will prefer the VTID if present
  @VTID(24)
  void removeFace(
    Reference rhs);


  /**
   * @param iRemoveFace Mandatory Reference parameter.
   */

  @DISPID(1611071491) //= 0x60070003. The runtime will prefer the VTID if present
  @VTID(25)
  void remove_RemoveFace(
    Reference iRemoveFace);


  /**
   * <p>
   * Getter method for the COM property "KeepFaces"
   * </p>
   * @return  Returns a value of type References
   */

  @DISPID(1611071492) //= 0x60070004. The runtime will prefer the VTID if present
  @VTID(26)
  References keepFaces();


  /**
   * <p>
   * Getter method for the COM property "RemoveFaces"
   * </p>
   * @return  Returns a value of type References
   */

  @DISPID(1611071493) //= 0x60070005. The runtime will prefer the VTID if present
  @VTID(27)
  References removeFaces();


  /**
   * <p>
   * Getter method for the COM property "Propagation"
   * </p>
   * @return  Returns a value of type References
   */

  @DISPID(1611071494) //= 0x60070006. The runtime will prefer the VTID if present
  @VTID(28)
  References propagation();


  // Properties:
}
