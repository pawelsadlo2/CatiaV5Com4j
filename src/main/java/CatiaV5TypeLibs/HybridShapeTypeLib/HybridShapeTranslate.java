package CatiaV5TypeLibs.HybridShapeTypeLib;
import CatiaV5TypeLibs.InfTypeLib.*;
import CatiaV5TypeLibs.MecModTypeLib.*;
import CatiaV5TypeLibs.KnowledgewareTypeLib.*;

import com4j.*;

@IID("{8C89B278-662C-0000-0280-020E60000000}")
public interface HybridShapeTranslate extends HybridShape {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "VectorType"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(25)
  int vectorType();


  /**
   * <p>
   * Setter method for the COM property "VectorType"
   * </p>
   * @param oVectorType Mandatory int parameter.
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(26)
  void vectorType(
    int oVectorType);


  /**
   * <p>
   * Getter method for the COM property "ElemToTranslate"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611005954) //= 0x60060002. The runtime will prefer the VTID if present
  @VTID(27)
  Reference elemToTranslate();


  /**
   * <p>
   * Setter method for the COM property "ElemToTranslate"
   * </p>
   * @param oX Mandatory Reference parameter.
   */

  @DISPID(1611005954) //= 0x60060002. The runtime will prefer the VTID if present
  @VTID(28)
  void elemToTranslate(
    Reference oX);


  /**
   * <p>
   * Getter method for the COM property "FirstPoint"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611005956) //= 0x60060004. The runtime will prefer the VTID if present
  @VTID(29)
  Reference firstPoint();


  /**
   * <p>
   * Setter method for the COM property "FirstPoint"
   * </p>
   * @param oX Mandatory Reference parameter.
   */

  @DISPID(1611005956) //= 0x60060004. The runtime will prefer the VTID if present
  @VTID(30)
  void firstPoint(
    Reference oX);


  /**
   * <p>
   * Getter method for the COM property "SecondPoint"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611005958) //= 0x60060006. The runtime will prefer the VTID if present
  @VTID(31)
  Reference secondPoint();


  /**
   * <p>
   * Setter method for the COM property "SecondPoint"
   * </p>
   * @param oX Mandatory Reference parameter.
   */

  @DISPID(1611005958) //= 0x60060006. The runtime will prefer the VTID if present
  @VTID(32)
  void secondPoint(
    Reference oX);


  /**
   * <p>
   * Getter method for the COM property "Direction"
   * </p>
   * @return  Returns a value of type HybridShapeDirection
   */

  @DISPID(1611005960) //= 0x60060008. The runtime will prefer the VTID if present
  @VTID(33)
  HybridShapeDirection direction();


  /**
   * <p>
   * Setter method for the COM property "Direction"
   * </p>
   * @param oX Mandatory HybridShapeDirection parameter.
   */

  @DISPID(1611005960) //= 0x60060008. The runtime will prefer the VTID if present
  @VTID(34)
  void direction(
    HybridShapeDirection oX);


  /**
   * <p>
   * Getter method for the COM property "Distance"
   * </p>
   * @return  Returns a value of type Length
   */

  @DISPID(1611005962) //= 0x6006000a. The runtime will prefer the VTID if present
  @VTID(35)
  Length distance();


  /**
   * <p>
   * Getter method for the COM property "DistanceValue"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(1611005963) //= 0x6006000b. The runtime will prefer the VTID if present
  @VTID(36)
  double distanceValue();


  /**
   * <p>
   * Setter method for the COM property "DistanceValue"
   * </p>
   * @param oX Mandatory double parameter.
   */

  @DISPID(1611005963) //= 0x6006000b. The runtime will prefer the VTID if present
  @VTID(37)
  void distanceValue(
    double oX);


  /**
   * <p>
   * Getter method for the COM property "CoordXValue"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(1611005965) //= 0x6006000d. The runtime will prefer the VTID if present
  @VTID(38)
  double coordXValue();


  /**
   * <p>
   * Setter method for the COM property "CoordXValue"
   * </p>
   * @param oValue Mandatory double parameter.
   */

  @DISPID(1611005965) //= 0x6006000d. The runtime will prefer the VTID if present
  @VTID(39)
  void coordXValue(
    double oValue);


  /**
   * <p>
   * Getter method for the COM property "CoordYValue"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(1611005967) //= 0x6006000f. The runtime will prefer the VTID if present
  @VTID(40)
  double coordYValue();


  /**
   * <p>
   * Setter method for the COM property "CoordYValue"
   * </p>
   * @param oValue Mandatory double parameter.
   */

  @DISPID(1611005967) //= 0x6006000f. The runtime will prefer the VTID if present
  @VTID(41)
  void coordYValue(
    double oValue);


  /**
   * <p>
   * Getter method for the COM property "CoordZValue"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(1611005969) //= 0x60060011. The runtime will prefer the VTID if present
  @VTID(42)
  double coordZValue();


  /**
   * <p>
   * Setter method for the COM property "CoordZValue"
   * </p>
   * @param oValue Mandatory double parameter.
   */

  @DISPID(1611005969) //= 0x60060011. The runtime will prefer the VTID if present
  @VTID(43)
  void coordZValue(
    double oValue);


  /**
   * <p>
   * Getter method for the COM property "VolumeResult"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005971) //= 0x60060013. The runtime will prefer the VTID if present
  @VTID(44)
  boolean volumeResult();


  /**
   * <p>
   * Setter method for the COM property "VolumeResult"
   * </p>
   * @param oType Mandatory boolean parameter.
   */

  @DISPID(1611005971) //= 0x60060013. The runtime will prefer the VTID if present
  @VTID(45)
  void volumeResult(
    boolean oType);


  /**
   * @param iCreation Mandatory boolean parameter.
   */

  @DISPID(1611005973) //= 0x60060015. The runtime will prefer the VTID if present
  @VTID(46)
  void setCreationMode(
    boolean iCreation);


  /**
   * @return  Returns a value of type int
   */

  @DISPID(1611005974) //= 0x60060016. The runtime will prefer the VTID if present
  @VTID(47)
  int getCreationMode();


  /**
   * <p>
   * Getter method for the COM property "RefAxisSystem"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611005975) //= 0x60060017. The runtime will prefer the VTID if present
  @VTID(48)
  Reference refAxisSystem();


  /**
   * <p>
   * Setter method for the COM property "RefAxisSystem"
   * </p>
   * @param oRefAxis Mandatory Reference parameter.
   */

  @DISPID(1611005975) //= 0x60060017. The runtime will prefer the VTID if present
  @VTID(49)
  void refAxisSystem(
    Reference oRefAxis);


  // Properties:
}
