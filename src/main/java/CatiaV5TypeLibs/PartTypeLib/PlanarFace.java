package CatiaV5TypeLibs.PartTypeLib;
import CatiaV5TypeLibs.InfTypeLib.*;
import CatiaV5TypeLibs.MecModTypeLib.*;
import CatiaV5TypeLibs.KnowledgewareTypeLib.*;

import com4j.*;

@IID("{1B7551D0-1BE1-11D6-8060-0010B5D44AB2}")
public interface PlanarFace extends Face {
  // Methods:
  /**
   * @param oOrigin Mandatory java.lang.Object[] parameter.
   */

  @DISPID(1611137024) //= 0x60080000. The runtime will prefer the VTID if present
  @VTID(24)
  void getOrigin(
    java.lang.Object[] oOrigin);


  /**
   * @param oFirstAxis Mandatory java.lang.Object[] parameter.
   */

  @DISPID(1611137025) //= 0x60080001. The runtime will prefer the VTID if present
  @VTID(25)
  void getFirstAxis(
    java.lang.Object[] oFirstAxis);


  /**
   * @param oSecondAxis Mandatory java.lang.Object[] parameter.
   */

  @DISPID(1611137026) //= 0x60080002. The runtime will prefer the VTID if present
  @VTID(26)
  void getSecondAxis(
    java.lang.Object[] oSecondAxis);


  // Properties:
}
