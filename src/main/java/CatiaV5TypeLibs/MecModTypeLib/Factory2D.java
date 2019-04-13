package CatiaV5TypeLibs.MecModTypeLib;
import CatiaV5TypeLibs.KnowledgewareTypeLib.*;
import CatiaV5TypeLibs.InfTypeLib.*;

import com4j.*;

@IID("{80EC75FA-AE47-0000-0280-030BA6000000}")
public interface Factory2D extends AnyObject {
  // Methods:
  /**
   * @param iX Mandatory double parameter.
   * @param iY Mandatory double parameter.
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.Point2D
   */

  @DISPID(1610940416) //= 0x60050000. The runtime will prefer the VTID if present
  @VTID(22)
  Point2D createPoint(
    double iX,
    double iY);


  /**
   * @param iX Mandatory double parameter.
   * @param iY Mandatory double parameter.
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.ControlPoint2D
   */

  @DISPID(1610940417) //= 0x60050001. The runtime will prefer the VTID if present
  @VTID(23)
  ControlPoint2D createControlPoint(
    double iX,
    double iY);


  /**
   * @param iX1 Mandatory double parameter.
   * @param iY1 Mandatory double parameter.
   * @param iX2 Mandatory double parameter.
   * @param iY2 Mandatory double parameter.
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.Line2D
   */

  @DISPID(1610940418) //= 0x60050002. The runtime will prefer the VTID if present
  @VTID(24)
  Line2D createLine(
    double iX1,
    double iY1,
    double iX2,
    double iY2);


  /**
   * @param iX1 Mandatory double parameter.
   * @param iY1 Mandatory double parameter.
   * @param iUX Mandatory double parameter.
   * @param iUY Mandatory double parameter.
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.Line2D
   */

  @DISPID(1610940419) //= 0x60050003. The runtime will prefer the VTID if present
  @VTID(25)
  Line2D createLineFromVector(
    double iX1,
    double iY1,
    double iUX,
    double iUY);


  /**
   * @param iCenterX Mandatory double parameter.
   * @param iCenterY Mandatory double parameter.
   * @param iRadius Mandatory double parameter.
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.Circle2D
   */

  @DISPID(1610940420) //= 0x60050004. The runtime will prefer the VTID if present
  @VTID(26)
  Circle2D createClosedCircle(
    double iCenterX,
    double iCenterY,
    double iRadius);


  /**
   * @param iCenterX Mandatory double parameter.
   * @param iCenterY Mandatory double parameter.
   * @param iRadius Mandatory double parameter.
   * @param iStartParam Mandatory double parameter.
   * @param iEndParam Mandatory double parameter.
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.Circle2D
   */

  @DISPID(1610940421) //= 0x60050005. The runtime will prefer the VTID if present
  @VTID(27)
  Circle2D createCircle(
    double iCenterX,
    double iCenterY,
    double iRadius,
    double iStartParam,
    double iEndParam);


  /**
   * @param iCenterX Mandatory double parameter.
   * @param iCenterY Mandatory double parameter.
   * @param iMajorX Mandatory double parameter.
   * @param iMajorY Mandatory double parameter.
   * @param iMajorRadius Mandatory double parameter.
   * @param iMinorRadius Mandatory double parameter.
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.Ellipse2D
   */

  @DISPID(1610940422) //= 0x60050006. The runtime will prefer the VTID if present
  @VTID(28)
  Ellipse2D createClosedEllipse(
    double iCenterX,
    double iCenterY,
    double iMajorX,
    double iMajorY,
    double iMajorRadius,
    double iMinorRadius);


  /**
   * @param iCenterX Mandatory double parameter.
   * @param iCenterY Mandatory double parameter.
   * @param iMajorX Mandatory double parameter.
   * @param iMajorY Mandatory double parameter.
   * @param iMajorRadius Mandatory double parameter.
   * @param iMinorRadius Mandatory double parameter.
   * @param iStartParam Mandatory double parameter.
   * @param iEndParam Mandatory double parameter.
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.Ellipse2D
   */

  @DISPID(1610940423) //= 0x60050007. The runtime will prefer the VTID if present
  @VTID(29)
  Ellipse2D createEllipse(
    double iCenterX,
    double iCenterY,
    double iMajorX,
    double iMajorY,
    double iMajorRadius,
    double iMinorRadius,
    double iStartParam,
    double iEndParam);


  /**
   * @param iPoles Mandatory java.lang.Object[] parameter.
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.Spline2D
   */

  @DISPID(1610940424) //= 0x60050008. The runtime will prefer the VTID if present
  @VTID(30)
  Spline2D createSpline(
    java.lang.Object[] iPoles);


  /**
   * @param iGeometry Mandatory Reference parameter.
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.GeometricElements
   */

  @DISPID(1610940425) //= 0x60050009. The runtime will prefer the VTID if present
  @VTID(31)
  GeometricElements createProjections(
    Reference iGeometry);


  /**
   * @param iGeometry Mandatory Reference parameter.
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.GeometricElements
   */

  @DISPID(1610940426) //= 0x6005000a. The runtime will prefer the VTID if present
  @VTID(32)
  GeometricElements createIntersections(
    Reference iGeometry);


  /**
   * @param iGeometry Mandatory Reference parameter.
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.Geometry2D
   */

  @DISPID(1610940427) //= 0x6005000b. The runtime will prefer the VTID if present
  @VTID(33)
  Geometry2D createProjection(
    Reference iGeometry);


  /**
   * @param iGeometry Mandatory Reference parameter.
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.Geometry2D
   */

  @DISPID(1610940428) //= 0x6005000c. The runtime will prefer the VTID if present
  @VTID(34)
  Geometry2D createIntersection(
    Reference iGeometry);


  /**
   * @param iCenterX Mandatory double parameter.
   * @param iCenterY Mandatory double parameter.
   * @param iAxisX Mandatory double parameter.
   * @param iAxisY Mandatory double parameter.
   * @param iFocalDistance Mandatory double parameter.
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.Parabola2D
   */

  @DISPID(1610940429) //= 0x6005000d. The runtime will prefer the VTID if present
  @VTID(35)
  Parabola2D createParabola(
    double iCenterX,
    double iCenterY,
    double iAxisX,
    double iAxisY,
    double iFocalDistance);


  /**
   * @param iCenterX Mandatory double parameter.
   * @param iCenterY Mandatory double parameter.
   * @param iAxisX Mandatory double parameter.
   * @param iAxisY Mandatory double parameter.
   * @param iMajorRadius Mandatory double parameter.
   * @param iMinorRadius Mandatory double parameter.
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.Hyperbola2D
   */

  @DISPID(1610940430) //= 0x6005000e. The runtime will prefer the VTID if present
  @VTID(36)
  Hyperbola2D createHyperbola(
    double iCenterX,
    double iCenterY,
    double iAxisX,
    double iAxisY,
    double iMajorRadius,
    double iMinorRadius);


  // Properties:
}
