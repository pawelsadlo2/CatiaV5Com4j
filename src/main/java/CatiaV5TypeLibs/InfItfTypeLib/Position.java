package CatiaV5TypeLibs.InfItfTypeLib;

import com4j.*;

@IID("{50884DF4-9405-11D1-A5E2-00A0C95AF74C}")
public interface Position extends Move {
  // Methods:
  /**
   * @param iAxisComponentsArray Mandatory java.lang.Object[] parameter.
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(24)
  void setComponents(
    java.lang.Object[] iAxisComponentsArray);


  /**
   * @param oAxisComponentsArray Mandatory java.lang.Object[] parameter.
   */

  @DISPID(1611005953) //= 0x60060001. The runtime will prefer the VTID if present
  @VTID(25)
  void getComponents(
    java.lang.Object[] oAxisComponentsArray);


  // Properties:
}
