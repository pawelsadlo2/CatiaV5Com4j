package CatiaV5TypeLibs.PartTypeLib;
import CatiaV5TypeLibs.InfTypeLib.*;
import CatiaV5TypeLibs.MecModTypeLib.*;
import CatiaV5TypeLibs.KnowledgewareTypeLib.*;

import com4j.*;

@IID("{A014ABDE-6B19-11D1-A280-0000F87546FD}")
public interface Line2D extends Curve2D {
  // Methods:
  /**
   * @param oOrigin Mandatory java.lang.Object[] parameter.
   */

  @DISPID(1611137024) //= 0x60080000. The runtime will prefer the VTID if present
  @VTID(43)
  void getOrigin(
    java.lang.Object[] oOrigin);


  /**
   * @param oDirection Mandatory java.lang.Object[] parameter.
   */

  @DISPID(1611137025) //= 0x60080001. The runtime will prefer the VTID if present
  @VTID(44)
  void getDirection(
    java.lang.Object[] oDirection);


  /**
   * @param iX Mandatory double parameter.
   * @param iY Mandatory double parameter.
   * @param iXDirection Mandatory double parameter.
   * @param iYDirection Mandatory double parameter.
   */

  @DISPID(1611137026) //= 0x60080002. The runtime will prefer the VTID if present
  @VTID(45)
  void setData(
    double iX,
    double iY,
    double iXDirection,
    double iYDirection);


  // Properties:
}
