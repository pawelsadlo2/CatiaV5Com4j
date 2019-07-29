package CatiaV5TypeLibs.MecModTypeLib;
import CatiaV5TypeLibs.InfTypeLib.*;
import CatiaV5TypeLibs.MecModTypeLib.*;
import CatiaV5TypeLibs.KnowledgewareTypeLib.*;

import com4j.*;

@IID("{80EC7509-B0E8-0000-0280-030BA6000000}")
public interface Curve2D extends Geometry2D {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "StartPoint"
   * </p>
   * @return  Returns a value of type Point2D
   */

  @DISPID(1611071488) //= 0x60070000. The runtime will prefer the VTID if present
  @VTID(27)
  Point2D startPoint();


  /**
   * <p>
   * Setter method for the COM property "StartPoint"
   * </p>
   * @param oStartPoint Mandatory Point2D parameter.
   */

  @DISPID(1611071488) //= 0x60070000. The runtime will prefer the VTID if present
  @VTID(28)
  void startPoint(
    Point2D oStartPoint);


  /**
   * <p>
   * Getter method for the COM property "EndPoint"
   * </p>
   * @return  Returns a value of type Point2D
   */

  @DISPID(1611071490) //= 0x60070002. The runtime will prefer the VTID if present
  @VTID(29)
  Point2D endPoint();


  /**
   * <p>
   * Setter method for the COM property "EndPoint"
   * </p>
   * @param oEndPoint Mandatory Point2D parameter.
   */

  @DISPID(1611071490) //= 0x60070002. The runtime will prefer the VTID if present
  @VTID(30)
  void endPoint(
    Point2D oEndPoint);


  /**
   * <p>
   * Getter method for the COM property "Continuity"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(1611071492) //= 0x60070004. The runtime will prefer the VTID if present
  @VTID(31)
  short continuity();


  /**
   * <p>
   * Getter method for the COM property "Period"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(1611071493) //= 0x60070005. The runtime will prefer the VTID if present
  @VTID(32)
  double period();


  /**
   * @param iParam Mandatory double parameter.
   * @param oPoint Mandatory java.lang.Object[] parameter.
   */

  @DISPID(1611071494) //= 0x60070006. The runtime will prefer the VTID if present
  @VTID(33)
  void getPointAtParam(
    double iParam,
    java.lang.Object[] oPoint);


  /**
   * @param iParam Mandatory double parameter.
   * @param oTangency Mandatory java.lang.Object[] parameter.
   */

  @DISPID(1611071495) //= 0x60070007. The runtime will prefer the VTID if present
  @VTID(34)
  void getTangent(
    double iParam,
    java.lang.Object[] oTangency);


  /**
   * @param iParam Mandatory double parameter.
   * @param oCurvature Mandatory java.lang.Object[] parameter.
   */

  @DISPID(1611071496) //= 0x60070008. The runtime will prefer the VTID if present
  @VTID(35)
  void getCurvature(
    double iParam,
    java.lang.Object[] oCurvature);


  /**
   * @param iParam Mandatory double parameter.
   * @param oDerivative Mandatory java.lang.Object[] parameter.
   */

  @DISPID(1611071497) //= 0x60070009. The runtime will prefer the VTID if present
  @VTID(36)
  void getDerivatives(
    double iParam,
    java.lang.Object[] oDerivative);


  /**
   * @param iFromParam Mandatory double parameter.
   * @param iLength Mandatory double parameter.
   * @return  Returns a value of type double
   */

  @DISPID(1611071498) //= 0x6007000a. The runtime will prefer the VTID if present
  @VTID(37)
  double getParamAtLength(
    double iFromParam,
    double iLength);


  /**
   * @param iFromParam Mandatory double parameter.
   * @param iToParam Mandatory double parameter.
   * @return  Returns a value of type double
   */

  @DISPID(1611071499) //= 0x6007000b. The runtime will prefer the VTID if present
  @VTID(38)
  double getLengthAtParam(
    double iFromParam,
    double iToParam);


  /**
   * @return  Returns a value of type boolean
   */

  @DISPID(1611071500) //= 0x6007000c. The runtime will prefer the VTID if present
  @VTID(39)
  boolean isPeriodic();


  /**
   * @param oParams Mandatory java.lang.Object[] parameter.
   */

  @DISPID(1611071501) //= 0x6007000d. The runtime will prefer the VTID if present
  @VTID(40)
  void getParamExtents(
    java.lang.Object[] oParams);


  /**
   * @param oBoundPoint Mandatory java.lang.Object[] parameter.
   */

  @DISPID(1611071502) //= 0x6007000e. The runtime will prefer the VTID if present
  @VTID(41)
  void getRangeBox(
    java.lang.Object[] oBoundPoint);


  /**
   * @param oEndPoints Mandatory java.lang.Object[] parameter.
   */

  @DISPID(1611071503) //= 0x6007000f. The runtime will prefer the VTID if present
  @VTID(42)
  void getEndPoints(
    java.lang.Object[] oEndPoints);


  // Properties:
}
