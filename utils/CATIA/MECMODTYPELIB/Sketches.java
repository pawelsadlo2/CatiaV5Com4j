import com4j.*;

@IID("{680371C6-3B2B-11D1-A26C-0000F87546FD}")
public interface Sketches extends Collection {
  // Methods:
  /**
   * @param iPlane Mandatory Reference parameter.
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.Sketch
   */

  @DISPID(1610940416) //= 0x60050000. The runtime will prefer the VTID if present
  @VTID(23)
  Sketch add(
    Reference iPlane);


  /**
   * @param iIndex Mandatory java.lang.Object parameter.
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.Sketch
   */

  @DISPID(1610940417) //= 0x60050001. The runtime will prefer the VTID if present
  @VTID(24)
  Sketch item(
    java.lang.Object iIndex);


  /**
   * @param iLabel Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.Boundary
   */

  @DISPID(1610940418) //= 0x60050002. The runtime will prefer the VTID if present
  @VTID(25)
  Boundary getBoundary(
    Holder<java.lang.String> iLabel);


  // Properties:
}
