package CatiaV5TypeLibs.InfItfTypeLib;

import com4j.*;

@IID("{80BA67B5-BBAB-0000-0280-030BA6000000}")
public interface LightSource extends AnyObject {
  // Methods:
  /**
   * @param oDirection Mandatory java.lang.Object[] parameter.
   */

  @DISPID(1610940416) //= 0x60050000. The runtime will prefer the VTID if present
  @VTID(22)
  void getDirection(
    java.lang.Object[] oDirection);


  /**
   * @param oDirection Mandatory java.lang.Object[] parameter.
   */

  @DISPID(1610940417) //= 0x60050001. The runtime will prefer the VTID if present
  @VTID(23)
  void putDirection(
    java.lang.Object[] oDirection);


  // Properties:
}
