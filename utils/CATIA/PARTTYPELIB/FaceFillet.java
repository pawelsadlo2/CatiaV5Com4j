import com4j.*;

@IID("{9F7CC59F-6109-11D1-A27D-0000F87546FD}")
public interface FaceFillet extends Fillet {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Radius"
   * </p>
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.Length
   */

  @DISPID(1611137024) //= 0x60080000. The runtime will prefer the VTID if present
  @VTID(26)
  Length radius();


  /**
   * <p>
   * Getter method for the COM property "FirstFace"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611137025) //= 0x60080001. The runtime will prefer the VTID if present
  @VTID(27)
  Reference firstFace();


  /**
   * <p>
   * Setter method for the COM property "FirstFace"
   * </p>
   * @param oFirstFace Mandatory Reference parameter.
   */

  @DISPID(1611137025) //= 0x60080001. The runtime will prefer the VTID if present
  @VTID(28)
  void firstFace(
    Reference oFirstFace);


  /**
   * <p>
   * Getter method for the COM property "SecondFace"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611137027) //= 0x60080003. The runtime will prefer the VTID if present
  @VTID(29)
  Reference secondFace();


  /**
   * <p>
   * Setter method for the COM property "SecondFace"
   * </p>
   * @param oSecondFace Mandatory Reference parameter.
   */

  @DISPID(1611137027) //= 0x60080003. The runtime will prefer the VTID if present
  @VTID(30)
  void secondFace(
    Reference oSecondFace);


  // Properties:
}
