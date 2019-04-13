import com4j.*;

@IID("{89D76616-B2A6-0000-0280-020E60000000}")
public interface HybridShapePlane3Points extends Plane {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "First"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611071488) //= 0x60070000. The runtime will prefer the VTID if present
  @VTID(35)
  Reference first();


  /**
   * <p>
   * Setter method for the COM property "First"
   * </p>
   * @param oPt1 Mandatory Reference parameter.
   */

  @DISPID(1611071488) //= 0x60070000. The runtime will prefer the VTID if present
  @VTID(36)
  void first(
    Reference oPt1);


  /**
   * <p>
   * Getter method for the COM property "Second"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611071490) //= 0x60070002. The runtime will prefer the VTID if present
  @VTID(37)
  Reference second();


  /**
   * <p>
   * Setter method for the COM property "Second"
   * </p>
   * @param oPt2 Mandatory Reference parameter.
   */

  @DISPID(1611071490) //= 0x60070002. The runtime will prefer the VTID if present
  @VTID(38)
  void second(
    Reference oPt2);


  /**
   * <p>
   * Getter method for the COM property "Third"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611071492) //= 0x60070004. The runtime will prefer the VTID if present
  @VTID(39)
  Reference third();


  /**
   * <p>
   * Setter method for the COM property "Third"
   * </p>
   * @param oPt3 Mandatory Reference parameter.
   */

  @DISPID(1611071492) //= 0x60070004. The runtime will prefer the VTID if present
  @VTID(40)
  void third(
    Reference oPt3);


  // Properties:
}
