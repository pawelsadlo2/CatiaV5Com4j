package CatiaV5TypeLibs.HybridShapeTypeLib;
import CatiaV5TypeLibs.InfTypeLib.*;
import CatiaV5TypeLibs.MecModTypeLib.*;
import CatiaV5TypeLibs.KnowledgewareTypeLib.*;

import com4j.*;

@IID("{8E5D1C0E-4087-0000-0280-020E60000000}")
public interface HybridShapeExtremum extends HybridShape {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Direction"
   * </p>
   * @return  Returns a value of type HybridShapeDirection
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(25)
  HybridShapeDirection direction();


  /**
   * <p>
   * Setter method for the COM property "Direction"
   * </p>
   * @param oDir Mandatory HybridShapeDirection parameter.
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(26)
  void direction(
    HybridShapeDirection oDir);


  /**
   * <p>
   * Getter method for the COM property "Direction2"
   * </p>
   * @return  Returns a value of type HybridShapeDirection
   */

  @DISPID(1611005954) //= 0x60060002. The runtime will prefer the VTID if present
  @VTID(27)
  HybridShapeDirection direction2();


  /**
   * <p>
   * Setter method for the COM property "Direction2"
   * </p>
   * @param oDir Mandatory HybridShapeDirection parameter.
   */

  @DISPID(1611005954) //= 0x60060002. The runtime will prefer the VTID if present
  @VTID(28)
  void direction2(
    HybridShapeDirection oDir);


  /**
   * <p>
   * Getter method for the COM property "Direction3"
   * </p>
   * @return  Returns a value of type HybridShapeDirection
   */

  @DISPID(1611005956) //= 0x60060004. The runtime will prefer the VTID if present
  @VTID(29)
  HybridShapeDirection direction3();


  /**
   * <p>
   * Setter method for the COM property "Direction3"
   * </p>
   * @param oDir Mandatory HybridShapeDirection parameter.
   */

  @DISPID(1611005956) //= 0x60060004. The runtime will prefer the VTID if present
  @VTID(30)
  void direction3(
    HybridShapeDirection oDir);


  /**
   * <p>
   * Getter method for the COM property "ReferenceElement"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611005958) //= 0x60060006. The runtime will prefer the VTID if present
  @VTID(31)
  Reference referenceElement();


  /**
   * <p>
   * Setter method for the COM property "ReferenceElement"
   * </p>
   * @param oRefElem Mandatory Reference parameter.
   */

  @DISPID(1611005958) //= 0x60060006. The runtime will prefer the VTID if present
  @VTID(32)
  void referenceElement(
    Reference oRefElem);


  /**
   * <p>
   * Getter method for the COM property "ExtremumType"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611005960) //= 0x60060008. The runtime will prefer the VTID if present
  @VTID(33)
  int extremumType();


  /**
   * <p>
   * Setter method for the COM property "ExtremumType"
   * </p>
   * @param oType Mandatory int parameter.
   */

  @DISPID(1611005960) //= 0x60060008. The runtime will prefer the VTID if present
  @VTID(34)
  void extremumType(
    int oType);


  /**
   * <p>
   * Getter method for the COM property "ExtremumType2"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611005962) //= 0x6006000a. The runtime will prefer the VTID if present
  @VTID(35)
  int extremumType2();


  /**
   * <p>
   * Setter method for the COM property "ExtremumType2"
   * </p>
   * @param oType Mandatory int parameter.
   */

  @DISPID(1611005962) //= 0x6006000a. The runtime will prefer the VTID if present
  @VTID(36)
  void extremumType2(
    int oType);


  /**
   * <p>
   * Getter method for the COM property "ExtremumType3"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611005964) //= 0x6006000c. The runtime will prefer the VTID if present
  @VTID(37)
  int extremumType3();


  /**
   * <p>
   * Setter method for the COM property "ExtremumType3"
   * </p>
   * @param oType Mandatory int parameter.
   */

  @DISPID(1611005964) //= 0x6006000c. The runtime will prefer the VTID if present
  @VTID(38)
  void extremumType3(
    int oType);


  // Properties:
}
