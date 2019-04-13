import com4j.*;

@IID("{80BA6760-FB5E-0000-0280-030BA6000000}")
public interface LightSources extends Collection {
  // Methods:
  /**
   * @param iIndex Mandatory int parameter.
   * @return  Returns a value of type LightSource
   */

  @DISPID(1610940416) //= 0x60050000. The runtime will prefer the VTID if present
  @VTID(23)
  LightSource item(
    int iIndex);


  /**
   * @return  Returns a value of type LightSource
   */

  @DISPID(1610940417) //= 0x60050001. The runtime will prefer the VTID if present
  @VTID(24)
  LightSource add();


  /**
   * @param iIndex Mandatory int parameter.
   */

  @DISPID(1610940418) //= 0x60050002. The runtime will prefer the VTID if present
  @VTID(25)
  void remove(
    int iIndex);


  // Properties:
}
