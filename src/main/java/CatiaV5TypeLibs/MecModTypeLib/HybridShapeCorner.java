package CatiaV5TypeLibs.MecModTypeLib;
import CatiaV5TypeLibs.KnowledgewareTypeLib.*;
import CatiaV5TypeLibs.InfTypeLib.*;

import com4j.*;

@IID("{8C89B24D-2D21-0000-0280-020E60000000}")
public interface HybridShapeCorner extends HybridShape {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "FirstElem"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(25)
  Reference firstElem();


  /**
   * <p>
   * Setter method for the COM property "FirstElem"
   * </p>
   * @param oElem Mandatory Reference parameter.
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(26)
  void firstElem(
    Reference oElem);


  /**
   * <p>
   * Getter method for the COM property "SecondElem"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611005954) //= 0x60060002. The runtime will prefer the VTID if present
  @VTID(27)
  Reference secondElem();


  /**
   * <p>
   * Setter method for the COM property "SecondElem"
   * </p>
   * @param oElem Mandatory Reference parameter.
   */

  @DISPID(1611005954) //= 0x60060002. The runtime will prefer the VTID if present
  @VTID(28)
  void secondElem(
    Reference oElem);


  /**
   * <p>
   * Getter method for the COM property "Support"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611005956) //= 0x60060004. The runtime will prefer the VTID if present
  @VTID(29)
  Reference support();


  /**
   * <p>
   * Setter method for the COM property "Support"
   * </p>
   * @param oElem Mandatory Reference parameter.
   */

  @DISPID(1611005956) //= 0x60060004. The runtime will prefer the VTID if present
  @VTID(30)
  void support(
    Reference oElem);


  /**
   * <p>
   * Getter method for the COM property "Direction"
   * </p>
   * @return  Returns a value of type HybridShapeDirection
   */

  @DISPID(1611005958) //= 0x60060006. The runtime will prefer the VTID if present
  @VTID(31)
  HybridShapeDirection direction();


  /**
   * <p>
   * Setter method for the COM property "Direction"
   * </p>
   * @param oElem Mandatory HybridShapeDirection parameter.
   */

  @DISPID(1611005958) //= 0x60060006. The runtime will prefer the VTID if present
  @VTID(32)
  void direction(
    HybridShapeDirection oElem);


  /**
   * <p>
   * Getter method for the COM property "Radius"
   * </p>
   * @return  Returns a value of type Length
   */

  @DISPID(1611005960) //= 0x60060008. The runtime will prefer the VTID if present
  @VTID(33)
  Length radius();


  /**
   * <p>
   * Getter method for the COM property "FirstOrientation"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611005961) //= 0x60060009. The runtime will prefer the VTID if present
  @VTID(34)
  int firstOrientation();


  /**
   * <p>
   * Setter method for the COM property "FirstOrientation"
   * </p>
   * @param oOrientation Mandatory int parameter.
   */

  @DISPID(1611005961) //= 0x60060009. The runtime will prefer the VTID if present
  @VTID(35)
  void firstOrientation(
    int oOrientation);


  /**
   * <p>
   * Getter method for the COM property "SecondOrientation"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611005963) //= 0x6006000b. The runtime will prefer the VTID if present
  @VTID(36)
  int secondOrientation();


  /**
   * <p>
   * Setter method for the COM property "SecondOrientation"
   * </p>
   * @param oOrientation Mandatory int parameter.
   */

  @DISPID(1611005963) //= 0x6006000b. The runtime will prefer the VTID if present
  @VTID(37)
  void secondOrientation(
    int oOrientation);


  /**
   * <p>
   * Getter method for the COM property "DiscriminationIndex"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611005965) //= 0x6006000d. The runtime will prefer the VTID if present
  @VTID(38)
  int discriminationIndex();


  /**
   * <p>
   * Setter method for the COM property "DiscriminationIndex"
   * </p>
   * @param oDiscriminationIndex Mandatory int parameter.
   */

  @DISPID(1611005965) //= 0x6006000d. The runtime will prefer the VTID if present
  @VTID(39)
  void discriminationIndex(
    int oDiscriminationIndex);


  /**
   * <p>
   * Getter method for the COM property "Trim"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005967) //= 0x6006000f. The runtime will prefer the VTID if present
  @VTID(40)
  boolean trim();


  /**
   * <p>
   * Setter method for the COM property "Trim"
   * </p>
   * @param oTrim Mandatory boolean parameter.
   */

  @DISPID(1611005967) //= 0x6006000f. The runtime will prefer the VTID if present
  @VTID(41)
  void trim(
    boolean oTrim);


  /**
   * <p>
   * Getter method for the COM property "TrimMode"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611005969) //= 0x60060011. The runtime will prefer the VTID if present
  @VTID(42)
  int trimMode();


  /**
   * <p>
   * Setter method for the COM property "TrimMode"
   * </p>
   * @param oTrim Mandatory int parameter.
   */

  @DISPID(1611005969) //= 0x60060011. The runtime will prefer the VTID if present
  @VTID(43)
  void trimMode(
    int oTrim);


  /**
   */

  @DISPID(1611005971) //= 0x60060013. The runtime will prefer the VTID if present
  @VTID(44)
  void invertFirstOrientation();


  /**
   */

  @DISPID(1611005972) //= 0x60060014. The runtime will prefer the VTID if present
  @VTID(45)
  void invertSecondOrientation();


  /**
   * <p>
   * Getter method for the COM property "BeginOfCorner"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611005973) //= 0x60060015. The runtime will prefer the VTID if present
  @VTID(46)
  int beginOfCorner();


  /**
   * <p>
   * Setter method for the COM property "BeginOfCorner"
   * </p>
   * @param oNumWireBegin Mandatory int parameter.
   */

  @DISPID(1611005973) //= 0x60060015. The runtime will prefer the VTID if present
  @VTID(47)
  void beginOfCorner(
    int oNumWireBegin);


  /**
   * <p>
   * Getter method for the COM property "FirstTangentOrientation"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611005975) //= 0x60060017. The runtime will prefer the VTID if present
  @VTID(48)
  int firstTangentOrientation();


  /**
   * <p>
   * Setter method for the COM property "FirstTangentOrientation"
   * </p>
   * @param oOrientation Mandatory int parameter.
   */

  @DISPID(1611005975) //= 0x60060017. The runtime will prefer the VTID if present
  @VTID(49)
  void firstTangentOrientation(
    int oOrientation);


  /**
   * <p>
   * Getter method for the COM property "SecondTangentOrientation"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611005977) //= 0x60060019. The runtime will prefer the VTID if present
  @VTID(50)
  int secondTangentOrientation();


  /**
   * <p>
   * Setter method for the COM property "SecondTangentOrientation"
   * </p>
   * @param oOrientation Mandatory int parameter.
   */

  @DISPID(1611005977) //= 0x60060019. The runtime will prefer the VTID if present
  @VTID(51)
  void secondTangentOrientation(
    int oOrientation);


  /**
   * <p>
   * Getter method for the COM property "CornerType"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611005979) //= 0x6006001b. The runtime will prefer the VTID if present
  @VTID(52)
  int cornerType();


  /**
   * <p>
   * Setter method for the COM property "CornerType"
   * </p>
   * @param oCornerType Mandatory int parameter.
   */

  @DISPID(1611005979) //= 0x6006001b. The runtime will prefer the VTID if present
  @VTID(53)
  void cornerType(
    int oCornerType);


  /**
   * <p>
   * Getter method for the COM property "OnVertex"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005981) //= 0x6006001d. The runtime will prefer the VTID if present
  @VTID(54)
  boolean onVertex();


  /**
   * <p>
   * Setter method for the COM property "OnVertex"
   * </p>
   * @param oOnVertex Mandatory boolean parameter.
   */

  @DISPID(1611005981) //= 0x6006001d. The runtime will prefer the VTID if present
  @VTID(55)
  void onVertex(
    boolean oOnVertex);


  // Properties:
}
