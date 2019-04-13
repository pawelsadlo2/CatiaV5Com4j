package CatiaV5TypeLibs.HybridShapeTypeLib;
import CatiaV5TypeLibs.InfTypeLib.*;
import CatiaV5TypeLibs.MecModTypeLib.*;
import CatiaV5TypeLibs.KnowledgewareTypeLib.*;

import com4j.*;

@IID("{89640411-A336-0000-0280-020E60000000}")
public interface Line extends HybridShape {
  // Methods:
  /**
   * @param oOrigin Mandatory java.lang.Object[] parameter.
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(25)
  void getOrigin(
    java.lang.Object[] oOrigin);


  /**
   * @param oDirection Mandatory java.lang.Object[] parameter.
   */

  @DISPID(1611005953) //= 0x60060001. The runtime will prefer the VTID if present
  @VTID(26)
  void getDirection(
    java.lang.Object[] oDirection);


  /**
   * @param iDirection Mandatory java.lang.Object[] parameter.
   */

  @DISPID(1611005954) //= 0x60060002. The runtime will prefer the VTID if present
  @VTID(27)
  void putDirection(
    java.lang.Object[] iDirection);


  /**
   * <p>
   * Getter method for the COM property "FirstUptoElem"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611005955) //= 0x60060003. The runtime will prefer the VTID if present
  @VTID(28)
  Reference firstUptoElem();


  /**
   * <p>
   * Setter method for the COM property "FirstUptoElem"
   * </p>
   * @param oFirstUpto Mandatory Reference parameter.
   */

  @DISPID(1611005955) //= 0x60060003. The runtime will prefer the VTID if present
  @VTID(29)
  void firstUptoElem(
    Reference oFirstUpto);


  /**
   * <p>
   * Getter method for the COM property "SecondUptoElem"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611005957) //= 0x60060005. The runtime will prefer the VTID if present
  @VTID(30)
  Reference secondUptoElem();


  /**
   * <p>
   * Setter method for the COM property "SecondUptoElem"
   * </p>
   * @param oSecondUpto Mandatory Reference parameter.
   */

  @DISPID(1611005957) //= 0x60060005. The runtime will prefer the VTID if present
  @VTID(31)
  void secondUptoElem(
    Reference oSecondUpto);


  // Properties:
}
