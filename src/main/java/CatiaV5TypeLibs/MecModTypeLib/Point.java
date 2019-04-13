package CatiaV5TypeLibs.MecModTypeLib;
import CatiaV5TypeLibs.KnowledgewareTypeLib.*;

import CatiaV5TypeLibs.InfTypeLib.*;
import com4j.*;

@IID("{896403F0-F778-0000-0280-020E60000000}")
public interface Point extends HybridShape {
  // Methods:
  /**
   * @param oCoordinates Mandatory java.lang.Object[] parameter.
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(25)
  void getCoordinates(
    java.lang.Object[] oCoordinates);


  /**
   * @param oCoordinates Mandatory java.lang.Object[] parameter.
   */

  @DISPID(1611005953) //= 0x60060001. The runtime will prefer the VTID if present
  @VTID(26)
  void setCoordinates(
    java.lang.Object[] oCoordinates);


  // Properties:
}
