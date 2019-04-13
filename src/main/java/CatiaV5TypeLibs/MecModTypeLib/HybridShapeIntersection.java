import CatiaV5TypeLibs.InfTypeLib.*;
import com4j.*;

@IID("{8C0F416A-4B7B-0000-0280-020E60000000}")
public interface HybridShapeIntersection extends HybridShape {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Element1"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(25)
  Reference element1();


  /**
   * <p>
   * Setter method for the COM property "Element1"
   * </p>
   * @param oElem Mandatory Reference parameter.
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(26)
  void element1(
    Reference oElem);


  /**
   * <p>
   * Getter method for the COM property "Element2"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611005954) //= 0x60060002. The runtime will prefer the VTID if present
  @VTID(27)
  Reference element2();


  /**
   * <p>
   * Setter method for the COM property "Element2"
   * </p>
   * @param oElem Mandatory Reference parameter.
   */

  @DISPID(1611005954) //= 0x60060002. The runtime will prefer the VTID if present
  @VTID(28)
  void element2(
    Reference oElem);


  /**
   * <p>
   * Getter method for the COM property "ExtrapolateMode"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005956) //= 0x60060004. The runtime will prefer the VTID if present
  @VTID(29)
  boolean extrapolateMode();


  /**
   * <p>
   * Setter method for the COM property "ExtrapolateMode"
   * </p>
   * @param oExtrapolateMode Mandatory boolean parameter.
   */

  @DISPID(1611005956) //= 0x60060004. The runtime will prefer the VTID if present
  @VTID(30)
  void extrapolateMode(
    boolean oExtrapolateMode);


  /**
   * <p>
   * Getter method for the COM property "IntersectMode"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005958) //= 0x60060006. The runtime will prefer the VTID if present
  @VTID(31)
  boolean intersectMode();


  /**
   * <p>
   * Setter method for the COM property "IntersectMode"
   * </p>
   * @param oIntersectMode Mandatory boolean parameter.
   */

  @DISPID(1611005958) //= 0x60060006. The runtime will prefer the VTID if present
  @VTID(32)
  void intersectMode(
    boolean oIntersectMode);


  /**
   * <p>
   * Getter method for the COM property "PointType"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611005960) //= 0x60060008. The runtime will prefer the VTID if present
  @VTID(33)
  int pointType();


  /**
   * <p>
   * Setter method for the COM property "PointType"
   * </p>
   * @param oPointType Mandatory int parameter.
   */

  @DISPID(1611005960) //= 0x60060008. The runtime will prefer the VTID if present
  @VTID(34)
  void pointType(
    int oPointType);


  /**
   * <p>
   * Getter method for the COM property "SolidMode"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005962) //= 0x6006000a. The runtime will prefer the VTID if present
  @VTID(35)
  boolean solidMode();


  /**
   * <p>
   * Setter method for the COM property "SolidMode"
   * </p>
   * @param oSolidMode Mandatory boolean parameter.
   */

  @DISPID(1611005962) //= 0x6006000a. The runtime will prefer the VTID if present
  @VTID(36)
  void solidMode(
    boolean oSolidMode);


  /**
   * <p>
   * Getter method for the COM property "ExtendMode"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611005964) //= 0x6006000c. The runtime will prefer the VTID if present
  @VTID(37)
  int extendMode();


  /**
   * <p>
   * Setter method for the COM property "ExtendMode"
   * </p>
   * @param oExtendMode Mandatory int parameter.
   */

  @DISPID(1611005964) //= 0x6006000c. The runtime will prefer the VTID if present
  @VTID(38)
  void extendMode(
    int oExtendMode);


  // Properties:
}
