import com4j.*;

@IID("{9C54F975-321C-4494-9430-1DF90BE3F273}")
public interface HybridShapeCylinder extends HybridShape {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Center"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(25)
  Reference center();


  /**
   * <p>
   * Setter method for the COM property "Center"
   * </p>
   * @param oCenter Mandatory Reference parameter.
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(26)
  void center(
    Reference oCenter);


  /**
   * <p>
   * Getter method for the COM property "Direction"
   * </p>
   * @return  Returns a value of type HybridShapeDirection
   */

  @DISPID(1611005954) //= 0x60060002. The runtime will prefer the VTID if present
  @VTID(27)
  HybridShapeDirection direction();


  /**
   * <p>
   * Setter method for the COM property "Direction"
   * </p>
   * @param oDir Mandatory HybridShapeDirection parameter.
   */

  @DISPID(1611005954) //= 0x60060002. The runtime will prefer the VTID if present
  @VTID(28)
  void direction(
    HybridShapeDirection oDir);


  /**
   * <p>
   * Getter method for the COM property "Radius"
   * </p>
   * @return  Returns a value of type Length
   */

  @DISPID(1611005956) //= 0x60060004. The runtime will prefer the VTID if present
  @VTID(29)
  Length radius();


  /**
   * <p>
   * Setter method for the COM property "Radius"
   * </p>
   * @param oRadius Mandatory Length parameter.
   */

  @DISPID(1611005956) //= 0x60060004. The runtime will prefer the VTID if present
  @VTID(30)
  void radius(
    Length oRadius);


  /**
   * <p>
   * Getter method for the COM property "Length1"
   * </p>
   * @return  Returns a value of type Length
   */

  @DISPID(1611005958) //= 0x60060006. The runtime will prefer the VTID if present
  @VTID(31)
  Length length1();


  /**
   * <p>
   * Setter method for the COM property "Length1"
   * </p>
   * @param oLength1 Mandatory Length parameter.
   */

  @DISPID(1611005958) //= 0x60060006. The runtime will prefer the VTID if present
  @VTID(32)
  void length1(
    Length oLength1);


  /**
   * <p>
   * Getter method for the COM property "Length2"
   * </p>
   * @return  Returns a value of type Length
   */

  @DISPID(1611005960) //= 0x60060008. The runtime will prefer the VTID if present
  @VTID(33)
  Length length2();


  /**
   * <p>
   * Setter method for the COM property "Length2"
   * </p>
   * @param oLength2 Mandatory Length parameter.
   */

  @DISPID(1611005960) //= 0x60060008. The runtime will prefer the VTID if present
  @VTID(34)
  void length2(
    Length oLength2);


  /**
   * <p>
   * Setter method for the COM property "Orientation"
   * </p>
   * @param oOrientation Mandatory boolean parameter.
   */

  @DISPID(1611005962) //= 0x6006000a. The runtime will prefer the VTID if present
  @VTID(35)
  void orientation(
    boolean oOrientation);


  /**
   * <p>
   * Getter method for the COM property "Orientation"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005962) //= 0x6006000a. The runtime will prefer the VTID if present
  @VTID(36)
  boolean orientation();


  /**
   */

  @DISPID(1611005964) //= 0x6006000c. The runtime will prefer the VTID if present
  @VTID(37)
  void invertOrientation();


  /**
   * <p>
   * Getter method for the COM property "SymmetricalExtension"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005965) //= 0x6006000d. The runtime will prefer the VTID if present
  @VTID(38)
  boolean symmetricalExtension();


  /**
   * <p>
   * Setter method for the COM property "SymmetricalExtension"
   * </p>
   * @param oSym Mandatory boolean parameter.
   */

  @DISPID(1611005965) //= 0x6006000d. The runtime will prefer the VTID if present
  @VTID(39)
  void symmetricalExtension(
    boolean oSym);


  // Properties:
}
