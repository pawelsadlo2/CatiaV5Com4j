import com4j.*;

@IID("{72E2B244-BA26-11D4-A38D-00D0B7AC63BE}")
public interface FreeParameters extends Collection {
  // Methods:
  /**
   * @param iIndex Mandatory java.lang.Object parameter.
   * @return  Returns a value of type FreeParameter
   */

  @DISPID(1610940416) //= 0x60050000. The runtime will prefer the VTID if present
  @VTID(23)
  FreeParameter item(
    java.lang.Object iIndex);


  /**
   * @param parameter Mandatory RealParam parameter.
   * @return  Returns a value of type FreeParameter
   */

  @DISPID(1610940417) //= 0x60050001. The runtime will prefer the VTID if present
  @VTID(24)
  FreeParameter addFreeParameter(
    RealParam parameter);


  /**
   * @param iIndex Mandatory java.lang.Object parameter.
   */

  @DISPID(1610940418) //= 0x60050002. The runtime will prefer the VTID if present
  @VTID(25)
  void removeFreeParameter(
    java.lang.Object iIndex);


  // Properties:
}
