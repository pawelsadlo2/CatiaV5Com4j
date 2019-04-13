import com4j.*;

@IID("{4865577D-3FF7-11D1-A26C-0000F87546FD}")
public interface Shapes extends Collection {
  // Methods:
  /**
   * @param iIndex Mandatory java.lang.Object parameter.
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.Shape
   */

  @DISPID(1610940416) //= 0x60050000. The runtime will prefer the VTID if present
  @VTID(23)
  Shape item(
    java.lang.Object iIndex);


  /**
   * @param iLabel Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.Boundary
   */

  @DISPID(1610940417) //= 0x60050001. The runtime will prefer the VTID if present
  @VTID(24)
  Boundary getBoundary(
    Holder<java.lang.String> iLabel);


  // Properties:
}
