package CatiaV5TypeLibs.PartTypeLib;
import CatiaV5TypeLibs.InfTypeLib.*;
import CatiaV5TypeLibs.MecModTypeLib.*;
import CatiaV5TypeLibs.KnowledgewareTypeLib.*;

import com4j.*;

@IID("{80EC7806-0752-0000-0280-030BA6000000}")
public interface Parabola2D extends Curve2D {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "FocalDistance"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(1611137024) //= 0x60080000. The runtime will prefer the VTID if present
  @VTID(43)
  double focalDistance();


  /**
   * @param iCenterX Mandatory double parameter.
   * @param iCenterY Mandatory double parameter.
   * @param iAxisX Mandatory double parameter.
   * @param iAxisY Mandatory double parameter.
   * @param iFocalDistance Mandatory double parameter.
   */

  @DISPID(1611137025) //= 0x60080001. The runtime will prefer the VTID if present
  @VTID(44)
  void setData(
    double iCenterX,
    double iCenterY,
    double iAxisX,
    double iAxisY,
    double iFocalDistance);


  /**
   * @param oCenter Mandatory java.lang.Object[] parameter.
   */

  @DISPID(1611137026) //= 0x60080002. The runtime will prefer the VTID if present
  @VTID(45)
  void getCenter(
    java.lang.Object[] oCenter);


  /**
   * @param oAxis Mandatory java.lang.Object[] parameter.
   */

  @DISPID(1611137027) //= 0x60080003. The runtime will prefer the VTID if present
  @VTID(46)
  void getAxis(
    java.lang.Object[] oAxis);


  // Properties:
}
