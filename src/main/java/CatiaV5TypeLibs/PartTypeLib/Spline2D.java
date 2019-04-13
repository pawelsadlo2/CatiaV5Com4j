package CatiaV5TypeLibs.PartTypeLib;
import CatiaV5TypeLibs.InfTypeLib.*;
import CatiaV5TypeLibs.MecModTypeLib.*;
import CatiaV5TypeLibs.KnowledgewareTypeLib.*;

import com4j.*;

@IID("{80EC78F7-EF72-0000-0280-030BA6000000}")
public interface Spline2D extends Curve2D {
  // Methods:
  /**
   * @param oCtrlPoints Mandatory java.lang.Object[] parameter.
   */

  @DISPID(1611137024) //= 0x60080000. The runtime will prefer the VTID if present
  @VTID(43)
  void getControlPoints(
    java.lang.Object[] oCtrlPoints);


  /**
   * @param iCtrlPoint Mandatory CatiaV5TypeLibs.PartItfTypeLib.Point2D parameter.
   * @param iPosition Mandatory int parameter.
   */

  @DISPID(1611137025) //= 0x60080001. The runtime will prefer the VTID if present
  @VTID(44)
  void insertControlPointAfter(
    Point2D iCtrlPoint,
    int iPosition);


  /**
   * @return  Returns a value of type double
   */

  @DISPID(1611137026) //= 0x60080002. The runtime will prefer the VTID if present
  @VTID(45)
  double getNumberOfControlPoints();


  // Properties:
}
