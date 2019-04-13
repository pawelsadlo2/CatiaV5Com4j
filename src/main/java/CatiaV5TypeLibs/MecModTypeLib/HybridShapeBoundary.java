package CatiaV5TypeLibs.MecModTypeLib;
import CatiaV5TypeLibs.KnowledgewareTypeLib.*;
import CatiaV5TypeLibs.InfTypeLib.*;

import com4j.*;

@IID("{8A838F17-10AD-0000-0280-020E60000000}")
public interface HybridShapeBoundary extends HybridShape {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Propagation"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(25)
  int propagation();


  /**
   * <p>
   * Setter method for the COM property "Propagation"
   * </p>
   * @param oProp Mandatory int parameter.
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(26)
  void propagation(
    int oProp);


  /**
   * <p>
   * Getter method for the COM property "InitialElement"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611005954) //= 0x60060002. The runtime will prefer the VTID if present
  @VTID(27)
  Reference initialElement();


  /**
   * <p>
   * Setter method for the COM property "InitialElement"
   * </p>
   * @param oObject Mandatory Reference parameter.
   */

  @DISPID(1611005954) //= 0x60060002. The runtime will prefer the VTID if present
  @VTID(28)
  void initialElement(
    Reference oObject);


  /**
   * <p>
   * Getter method for the COM property "Support"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611005956) //= 0x60060004. The runtime will prefer the VTID if present
  @VTID(29)
  Reference support();


  /**
   * <p>
   * Setter method for the COM property "Support"
   * </p>
   * @param oObject Mandatory Reference parameter.
   */

  @DISPID(1611005956) //= 0x60060004. The runtime will prefer the VTID if present
  @VTID(30)
  void support(
    Reference oObject);


  /**
   * <p>
   * Getter method for the COM property "To"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611005958) //= 0x60060006. The runtime will prefer the VTID if present
  @VTID(31)
  Reference to();


  /**
   * <p>
   * Setter method for the COM property "To"
   * </p>
   * @param opIATo Mandatory Reference parameter.
   */

  @DISPID(1611005958) //= 0x60060006. The runtime will prefer the VTID if present
  @VTID(32)
  void to(
    Reference opIATo);


  /**
   * <p>
   * Getter method for the COM property "From"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611005960) //= 0x60060008. The runtime will prefer the VTID if present
  @VTID(33)
  Reference from();


  /**
   * <p>
   * Setter method for the COM property "From"
   * </p>
   * @param opIAFrom Mandatory Reference parameter.
   */

  @DISPID(1611005960) //= 0x60060008. The runtime will prefer the VTID if present
  @VTID(34)
  void from(
    Reference opIAFrom);


  /**
   * <p>
   * Getter method for the COM property "ToOrientation"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611005962) //= 0x6006000a. The runtime will prefer the VTID if present
  @VTID(35)
  int toOrientation();


  /**
   * <p>
   * Setter method for the COM property "ToOrientation"
   * </p>
   * @param oToOrientation Mandatory int parameter.
   */

  @DISPID(1611005962) //= 0x6006000a. The runtime will prefer the VTID if present
  @VTID(36)
  void toOrientation(
    int oToOrientation);


  /**
   * <p>
   * Getter method for the COM property "FromOrientation"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611005964) //= 0x6006000c. The runtime will prefer the VTID if present
  @VTID(37)
  int fromOrientation();


  /**
   * <p>
   * Setter method for the COM property "FromOrientation"
   * </p>
   * @param oFromOrientation Mandatory int parameter.
   */

  @DISPID(1611005964) //= 0x6006000c. The runtime will prefer the VTID if present
  @VTID(38)
  void fromOrientation(
    int oFromOrientation);


  // Properties:
}
