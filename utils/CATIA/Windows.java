import com4j.*;

@IID("{7FBD96B9-3FA0-0000-0280-030BA6000000}")
public interface Windows extends Collection {
  // Methods:
  /**
   * @param iIndex Mandatory java.lang.Object parameter.
   * @return  Returns a value of type Window
   */

  @DISPID(1610940416) //= 0x60050000. The runtime will prefer the VTID if present
  @VTID(23)
  Window item(
    java.lang.Object iIndex);


  /**
   * @param iStyle Mandatory CatArrangeStyle parameter.
   */

  @DISPID(1610940417) //= 0x60050001. The runtime will prefer the VTID if present
  @VTID(24)
  void arrange(
    CatArrangeStyle iStyle);


  // Properties:
}
