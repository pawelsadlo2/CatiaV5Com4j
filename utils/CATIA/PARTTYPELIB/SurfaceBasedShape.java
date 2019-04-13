import com4j.*;

@IID("{BD3BA670-BCF8-11D2-A610-00A0C9564D37}")
public interface SurfaceBasedShape extends Shape {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Surface"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(22)
  Reference surface();


  /**
   * <p>
   * Setter method for the COM property "Surface"
   * </p>
   * @param oSurface Mandatory Reference parameter.
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(23)
  void surface(
    Reference oSurface);


  // Properties:
}
