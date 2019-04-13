package CatiaV5TypeLibs.MecModTypeLib;
import CatiaV5TypeLibs.KnowledgewareTypeLib.*;

import CatiaV5TypeLibs.InfTypeLib.*;
import com4j.*;

@IID("{80EC7321-4B09-0000-0280-030BA6000000}")
public interface Circle2D extends Curve2D {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "CenterPoint"
   * </p>
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.Point2D
   */

  @DISPID(1611137024) //= 0x60080000. The runtime will prefer the VTID if present
  @VTID(43)
  Point2D centerPoint();


  /**
   * <p>
   * Setter method for the COM property "CenterPoint"
   * </p>
   * @param oCenterPoint Mandatory CatiaV5TypeLibs.PartItfTypeLib.Point2D parameter.
   */

  @DISPID(1611137024) //= 0x60080000. The runtime will prefer the VTID if present
  @VTID(44)
  void centerPoint(
    Point2D oCenterPoint);


  /**
   * <p>
   * Getter method for the COM property "Radius"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(1611137026) //= 0x60080002. The runtime will prefer the VTID if present
  @VTID(45)
  double radius();


  /**
   * @param iCenterX Mandatory double parameter.
   * @param iCenterY Mandatory double parameter.
   * @param iRadius Mandatory double parameter.
   */

  @DISPID(1611137027) //= 0x60080003. The runtime will prefer the VTID if present
  @VTID(46)
  void setData(
    double iCenterX,
    double iCenterY,
    double iRadius);


  /**
   * @param oData Mandatory java.lang.Object[] parameter.
   */

  @DISPID(1611137028) //= 0x60080004. The runtime will prefer the VTID if present
  @VTID(47)
  void getCenter(
    java.lang.Object[] oData);


  // Properties:
}
