package CatiaV5TypeLibs.MecModTypeLib;
import CatiaV5TypeLibs.KnowledgewareTypeLib.*;

import CatiaV5TypeLibs.InfTypeLib.*;
import com4j.*;

@IID("{8C87CAC5-D294-0000-0280-020E60000000}")
public interface HybridShapeRotate extends HybridShape {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "ElemToRotate"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(25)
  Reference elemToRotate();


  /**
   * <p>
   * Setter method for the COM property "ElemToRotate"
   * </p>
   * @param oX Mandatory Reference parameter.
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(26)
  void elemToRotate(
    Reference oX);


  /**
   * <p>
   * Getter method for the COM property "Axis"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611005954) //= 0x60060002. The runtime will prefer the VTID if present
  @VTID(27)
  Reference axis();


  /**
   * <p>
   * Setter method for the COM property "Axis"
   * </p>
   * @param oX Mandatory Reference parameter.
   */

  @DISPID(1611005954) //= 0x60060002. The runtime will prefer the VTID if present
  @VTID(28)
  void axis(
    Reference oX);


  /**
   * <p>
   * Getter method for the COM property "Angle"
   * </p>
   * @return  Returns a value of type Angle
   */

  @DISPID(1611005956) //= 0x60060004. The runtime will prefer the VTID if present
  @VTID(29)
  Angle angle();


  /**
   * <p>
   * Getter method for the COM property "AngleValue"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(1611005957) //= 0x60060005. The runtime will prefer the VTID if present
  @VTID(30)
  double angleValue();


  /**
   * <p>
   * Setter method for the COM property "AngleValue"
   * </p>
   * @param oX Mandatory double parameter.
   */

  @DISPID(1611005957) //= 0x60060005. The runtime will prefer the VTID if present
  @VTID(31)
  void angleValue(
    double oX);


  /**
   * <p>
   * Getter method for the COM property "VolumeResult"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005959) //= 0x60060007. The runtime will prefer the VTID if present
  @VTID(32)
  boolean volumeResult();


  /**
   * <p>
   * Setter method for the COM property "VolumeResult"
   * </p>
   * @param oType Mandatory boolean parameter.
   */

  @DISPID(1611005959) //= 0x60060007. The runtime will prefer the VTID if present
  @VTID(33)
  void volumeResult(
    boolean oType);


  /**
   * @param iCreation Mandatory boolean parameter.
   */

  @DISPID(1611005961) //= 0x60060009. The runtime will prefer the VTID if present
  @VTID(34)
  void setCreationMode(
    boolean iCreation);


  /**
   * @return  Returns a value of type int
   */

  @DISPID(1611005962) //= 0x6006000a. The runtime will prefer the VTID if present
  @VTID(35)
  int getCreationMode();


  /**
   * <p>
   * Getter method for the COM property "RotationType"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611005963) //= 0x6006000b. The runtime will prefer the VTID if present
  @VTID(36)
  int rotationType();


  /**
   * <p>
   * Setter method for the COM property "RotationType"
   * </p>
   * @param oType Mandatory int parameter.
   */

  @DISPID(1611005963) //= 0x6006000b. The runtime will prefer the VTID if present
  @VTID(37)
  void rotationType(
    int oType);


  /**
   * <p>
   * Getter method for the COM property "FirstElement"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611005965) //= 0x6006000d. The runtime will prefer the VTID if present
  @VTID(38)
  Reference firstElement();


  /**
   * <p>
   * Setter method for the COM property "FirstElement"
   * </p>
   * @param oElem Mandatory Reference parameter.
   */

  @DISPID(1611005965) //= 0x6006000d. The runtime will prefer the VTID if present
  @VTID(39)
  void firstElement(
    Reference oElem);


  /**
   * <p>
   * Getter method for the COM property "SecondElement"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611005967) //= 0x6006000f. The runtime will prefer the VTID if present
  @VTID(40)
  Reference secondElement();


  /**
   * <p>
   * Setter method for the COM property "SecondElement"
   * </p>
   * @param oElem Mandatory Reference parameter.
   */

  @DISPID(1611005967) //= 0x6006000f. The runtime will prefer the VTID if present
  @VTID(41)
  void secondElement(
    Reference oElem);


  /**
   * <p>
   * Getter method for the COM property "FirstPoint"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611005969) //= 0x60060011. The runtime will prefer the VTID if present
  @VTID(42)
  Reference firstPoint();


  /**
   * <p>
   * Setter method for the COM property "FirstPoint"
   * </p>
   * @param oPoint Mandatory Reference parameter.
   */

  @DISPID(1611005969) //= 0x60060011. The runtime will prefer the VTID if present
  @VTID(43)
  void firstPoint(
    Reference oPoint);


  /**
   * <p>
   * Getter method for the COM property "SecondPoint"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611005971) //= 0x60060013. The runtime will prefer the VTID if present
  @VTID(44)
  Reference secondPoint();


  /**
   * <p>
   * Setter method for the COM property "SecondPoint"
   * </p>
   * @param oPoint Mandatory Reference parameter.
   */

  @DISPID(1611005971) //= 0x60060013. The runtime will prefer the VTID if present
  @VTID(45)
  void secondPoint(
    Reference oPoint);


  /**
   * <p>
   * Getter method for the COM property "ThirdPoint"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611005973) //= 0x60060015. The runtime will prefer the VTID if present
  @VTID(46)
  Reference thirdPoint();


  /**
   * <p>
   * Setter method for the COM property "ThirdPoint"
   * </p>
   * @param oPoint Mandatory Reference parameter.
   */

  @DISPID(1611005973) //= 0x60060015. The runtime will prefer the VTID if present
  @VTID(47)
  void thirdPoint(
    Reference oPoint);


  /**
   * <p>
   * Getter method for the COM property "OrientationOfFirstElement"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005975) //= 0x60060017. The runtime will prefer the VTID if present
  @VTID(48)
  boolean orientationOfFirstElement();


  /**
   * <p>
   * Setter method for the COM property "OrientationOfFirstElement"
   * </p>
   * @param oOrientation Mandatory boolean parameter.
   */

  @DISPID(1611005975) //= 0x60060017. The runtime will prefer the VTID if present
  @VTID(49)
  void orientationOfFirstElement(
    boolean oOrientation);


  /**
   * <p>
   * Getter method for the COM property "OrientationOfSecondElement"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005977) //= 0x60060019. The runtime will prefer the VTID if present
  @VTID(50)
  boolean orientationOfSecondElement();


  /**
   * <p>
   * Setter method for the COM property "OrientationOfSecondElement"
   * </p>
   * @param oOrientation Mandatory boolean parameter.
   */

  @DISPID(1611005977) //= 0x60060019. The runtime will prefer the VTID if present
  @VTID(51)
  void orientationOfSecondElement(
    boolean oOrientation);


  // Properties:
}
