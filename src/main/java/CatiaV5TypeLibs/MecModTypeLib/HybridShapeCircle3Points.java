import CatiaV5TypeLibs.InfTypeLib.*;
import com4j.*;

@IID("{8D7E9C71-72C7-0000-0280-020E60000000}")
public interface HybridShapeCircle3Points extends HybridShapeCircle {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Element1"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611071488) //= 0x60070000. The runtime will prefer the VTID if present
  @VTID(38)
  Reference element1();


  /**
   * <p>
   * Setter method for the COM property "Element1"
   * </p>
   * @param oElem Mandatory Reference parameter.
   */

  @DISPID(1611071488) //= 0x60070000. The runtime will prefer the VTID if present
  @VTID(39)
  void element1(
    Reference oElem);


  /**
   * <p>
   * Getter method for the COM property "Element2"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611071490) //= 0x60070002. The runtime will prefer the VTID if present
  @VTID(40)
  Reference element2();


  /**
   * <p>
   * Setter method for the COM property "Element2"
   * </p>
   * @param oElem Mandatory Reference parameter.
   */

  @DISPID(1611071490) //= 0x60070002. The runtime will prefer the VTID if present
  @VTID(41)
  void element2(
    Reference oElem);


  /**
   * <p>
   * Getter method for the COM property "Element3"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611071492) //= 0x60070004. The runtime will prefer the VTID if present
  @VTID(42)
  Reference element3();


  /**
   * <p>
   * Setter method for the COM property "Element3"
   * </p>
   * @param oElem Mandatory Reference parameter.
   */

  @DISPID(1611071492) //= 0x60070004. The runtime will prefer the VTID if present
  @VTID(43)
  void element3(
    Reference oElem);


  /**
   * <p>
   * Getter method for the COM property "Support"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611071494) //= 0x60070006. The runtime will prefer the VTID if present
  @VTID(44)
  Reference support();


  /**
   * <p>
   * Setter method for the COM property "Support"
   * </p>
   * @param oSupport Mandatory Reference parameter.
   */

  @DISPID(1611071494) //= 0x60070006. The runtime will prefer the VTID if present
  @VTID(45)
  void support(
    Reference oSupport);


  /**
   */

  @DISPID(1611071496) //= 0x60070008. The runtime will prefer the VTID if present
  @VTID(46)
  void removeSupport();


  // Properties:
}
