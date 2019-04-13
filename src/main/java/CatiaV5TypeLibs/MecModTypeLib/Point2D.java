package CatiaV5TypeLibs.MecModTypeLib;
import CatiaV5TypeLibs.KnowledgewareTypeLib.*;

import CatiaV5TypeLibs.InfTypeLib.*;
import com4j.*;

@IID("{6ED8AC55-6B19-11D1-A280-0000F87546FD}")
public interface Point2D extends Geometry2D {
  // Methods:
  /**
   * @param iX Mandatory double parameter.
   * @param iY Mandatory double parameter.
   */

  @DISPID(1611071488) //= 0x60070000. The runtime will prefer the VTID if present
  @VTID(27)
  void setData(
    double iX,
    double iY);


  /**
   * @param oPoint Mandatory java.lang.Object[] parameter.
   */

  @DISPID(1611071489) //= 0x60070001. The runtime will prefer the VTID if present
  @VTID(28)
  void getCoordinates(
    java.lang.Object[] oPoint);


  // Properties:
}
