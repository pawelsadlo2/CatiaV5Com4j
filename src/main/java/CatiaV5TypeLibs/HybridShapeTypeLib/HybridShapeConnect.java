package CatiaV5TypeLibs.HybridShapeTypeLib;
import CatiaV5TypeLibs.InfTypeLib.*;
import CatiaV5TypeLibs.MecModTypeLib.*;
import CatiaV5TypeLibs.KnowledgewareTypeLib.*;

import com4j.*;

@IID("{8C89B290-82AD-0000-0280-020E60000000}")
public interface HybridShapeConnect extends HybridShape {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "FirstTension"
   * </p>
   * @return  Returns a value of type RealParam
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(25)
  RealParam firstTension();


  /**
   * <p>
   * Getter method for the COM property "SecondTension"
   * </p>
   * @return  Returns a value of type RealParam
   */

  @DISPID(1611005953) //= 0x60060001. The runtime will prefer the VTID if present
  @VTID(26)
  RealParam secondTension();


  /**
   * <p>
   * Getter method for the COM property "Support"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611005954) //= 0x60060002. The runtime will prefer the VTID if present
  @VTID(27)
  Reference support();


  /**
   * <p>
   * Setter method for the COM property "Support"
   * </p>
   * @param oT Mandatory Reference parameter.
   */

  @DISPID(1611005954) //= 0x60060002. The runtime will prefer the VTID if present
  @VTID(28)
  void support(
    Reference oT);


  /**
   * <p>
   * Getter method for the COM property "BaseCurve"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611005956) //= 0x60060004. The runtime will prefer the VTID if present
  @VTID(29)
  Reference baseCurve();


  /**
   * <p>
   * Setter method for the COM property "BaseCurve"
   * </p>
   * @param oT Mandatory Reference parameter.
   */

  @DISPID(1611005956) //= 0x60060004. The runtime will prefer the VTID if present
  @VTID(30)
  void baseCurve(
    Reference oT);


  /**
   * <p>
   * Getter method for the COM property "ConnectType"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611005958) //= 0x60060006. The runtime will prefer the VTID if present
  @VTID(31)
  int connectType();


  /**
   * <p>
   * Setter method for the COM property "ConnectType"
   * </p>
   * @param oConnectType Mandatory int parameter.
   */

  @DISPID(1611005958) //= 0x60060006. The runtime will prefer the VTID if present
  @VTID(32)
  void connectType(
    int oConnectType);


  /**
   * <p>
   * Getter method for the COM property "FirstContinuity"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611005960) //= 0x60060008. The runtime will prefer the VTID if present
  @VTID(33)
  int firstContinuity();


  /**
   * <p>
   * Setter method for the COM property "FirstContinuity"
   * </p>
   * @param oFirstContinuity Mandatory int parameter.
   */

  @DISPID(1611005960) //= 0x60060008. The runtime will prefer the VTID if present
  @VTID(34)
  void firstContinuity(
    int oFirstContinuity);


  /**
   * <p>
   * Getter method for the COM property "FirstCurve"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611005962) //= 0x6006000a. The runtime will prefer the VTID if present
  @VTID(35)
  Reference firstCurve();


  /**
   * <p>
   * Setter method for the COM property "FirstCurve"
   * </p>
   * @param oFirstCurve Mandatory Reference parameter.
   */

  @DISPID(1611005962) //= 0x6006000a. The runtime will prefer the VTID if present
  @VTID(36)
  void firstCurve(
    Reference oFirstCurve);


  /**
   * <p>
   * Getter method for the COM property "FirstOrientation"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611005964) //= 0x6006000c. The runtime will prefer the VTID if present
  @VTID(37)
  int firstOrientation();


  /**
   * <p>
   * Setter method for the COM property "FirstOrientation"
   * </p>
   * @param oFirstOrientation Mandatory int parameter.
   */

  @DISPID(1611005964) //= 0x6006000c. The runtime will prefer the VTID if present
  @VTID(38)
  void firstOrientation(
    int oFirstOrientation);


  /**
   * <p>
   * Getter method for the COM property "FirstPoint"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611005966) //= 0x6006000e. The runtime will prefer the VTID if present
  @VTID(39)
  Reference firstPoint();


  /**
   * <p>
   * Setter method for the COM property "FirstPoint"
   * </p>
   * @param oFirstPoint Mandatory Reference parameter.
   */

  @DISPID(1611005966) //= 0x6006000e. The runtime will prefer the VTID if present
  @VTID(40)
  void firstPoint(
    Reference oFirstPoint);


  /**
   * <p>
   * Getter method for the COM property "SecondContinuity"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611005968) //= 0x60060010. The runtime will prefer the VTID if present
  @VTID(41)
  int secondContinuity();


  /**
   * <p>
   * Setter method for the COM property "SecondContinuity"
   * </p>
   * @param oSecondContinuity Mandatory int parameter.
   */

  @DISPID(1611005968) //= 0x60060010. The runtime will prefer the VTID if present
  @VTID(42)
  void secondContinuity(
    int oSecondContinuity);


  /**
   * <p>
   * Getter method for the COM property "SecondCurve"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611005970) //= 0x60060012. The runtime will prefer the VTID if present
  @VTID(43)
  Reference secondCurve();


  /**
   * <p>
   * Setter method for the COM property "SecondCurve"
   * </p>
   * @param oSecondCurve Mandatory Reference parameter.
   */

  @DISPID(1611005970) //= 0x60060012. The runtime will prefer the VTID if present
  @VTID(44)
  void secondCurve(
    Reference oSecondCurve);


  /**
   * <p>
   * Getter method for the COM property "SecondOrientation"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611005972) //= 0x60060014. The runtime will prefer the VTID if present
  @VTID(45)
  int secondOrientation();


  /**
   * <p>
   * Setter method for the COM property "SecondOrientation"
   * </p>
   * @param oSecondOrientation Mandatory int parameter.
   */

  @DISPID(1611005972) //= 0x60060014. The runtime will prefer the VTID if present
  @VTID(46)
  void secondOrientation(
    int oSecondOrientation);


  /**
   * <p>
   * Getter method for the COM property "SecondPoint"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611005974) //= 0x60060016. The runtime will prefer the VTID if present
  @VTID(47)
  Reference secondPoint();


  /**
   * <p>
   * Setter method for the COM property "SecondPoint"
   * </p>
   * @param oSecondPoint Mandatory Reference parameter.
   */

  @DISPID(1611005974) //= 0x60060016. The runtime will prefer the VTID if present
  @VTID(48)
  void secondPoint(
    Reference oSecondPoint);


  /**
   * <p>
   * Getter method for the COM property "Trim"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005976) //= 0x60060018. The runtime will prefer the VTID if present
  @VTID(49)
  boolean trim();


  /**
   * <p>
   * Setter method for the COM property "Trim"
   * </p>
   * @param oTrim Mandatory boolean parameter.
   */

  @DISPID(1611005976) //= 0x60060018. The runtime will prefer the VTID if present
  @VTID(50)
  void trim(
    boolean oTrim);


  // Properties:
}
