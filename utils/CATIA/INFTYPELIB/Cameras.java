import com4j.*;

@IID("{80BA682E-7C1B-0000-0280-030BA6000000}")
public interface Cameras extends Collection {
  // Methods:
  /**
   * @param iIndex Mandatory java.lang.Object parameter.
   * @return  Returns a value of type Camera
   */

  @DISPID(1610940416) //= 0x60050000. The runtime will prefer the VTID if present
  @VTID(23)
  Camera item(
    java.lang.Object iIndex);


  /**
   * @param iIndex Mandatory java.lang.Object parameter.
   */

  @DISPID(1610940417) //= 0x60050001. The runtime will prefer the VTID if present
  @VTID(24)
  void remove(
    java.lang.Object iIndex);


  // Properties:
}
