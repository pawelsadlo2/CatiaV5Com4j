import CatiaV5TypeLibs.InfTypeLib.*;
import com4j.*;

@IID("{1CB24CFA-C543-40EF-BB77-309D3DBB3F11}")
public interface HybridShapeFilletTriTangent extends HybridShape {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "FirstElem"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(25)
  Reference firstElem();


  /**
   * <p>
   * Setter method for the COM property "FirstElem"
   * </p>
   * @param oElem Mandatory Reference parameter.
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(26)
  void firstElem(
    Reference oElem);


  /**
   * <p>
   * Getter method for the COM property "SecondElem"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611005954) //= 0x60060002. The runtime will prefer the VTID if present
  @VTID(27)
  Reference secondElem();


  /**
   * <p>
   * Setter method for the COM property "SecondElem"
   * </p>
   * @param oElem Mandatory Reference parameter.
   */

  @DISPID(1611005954) //= 0x60060002. The runtime will prefer the VTID if present
  @VTID(28)
  void secondElem(
    Reference oElem);


  /**
   * <p>
   * Getter method for the COM property "RemoveElem"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611005956) //= 0x60060004. The runtime will prefer the VTID if present
  @VTID(29)
  Reference removeElem();


  /**
   * <p>
   * Setter method for the COM property "RemoveElem"
   * </p>
   * @param oElem Mandatory Reference parameter.
   */

  @DISPID(1611005956) //= 0x60060004. The runtime will prefer the VTID if present
  @VTID(30)
  void removeElem(
    Reference oElem);


  /**
   * <p>
   * Getter method for the COM property "FirstOrientation"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611005958) //= 0x60060006. The runtime will prefer the VTID if present
  @VTID(31)
  int firstOrientation();


  /**
   * <p>
   * Setter method for the COM property "FirstOrientation"
   * </p>
   * @param oOrientation Mandatory int parameter.
   */

  @DISPID(1611005958) //= 0x60060006. The runtime will prefer the VTID if present
  @VTID(32)
  void firstOrientation(
    int oOrientation);


  /**
   * <p>
   * Getter method for the COM property "SecondOrientation"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611005960) //= 0x60060008. The runtime will prefer the VTID if present
  @VTID(33)
  int secondOrientation();


  /**
   * <p>
   * Setter method for the COM property "SecondOrientation"
   * </p>
   * @param oOrientation Mandatory int parameter.
   */

  @DISPID(1611005960) //= 0x60060008. The runtime will prefer the VTID if present
  @VTID(34)
  void secondOrientation(
    int oOrientation);


  /**
   * <p>
   * Getter method for the COM property "RemoveOrientation"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611005962) //= 0x6006000a. The runtime will prefer the VTID if present
  @VTID(35)
  int removeOrientation();


  /**
   * <p>
   * Setter method for the COM property "RemoveOrientation"
   * </p>
   * @param oOrientation Mandatory int parameter.
   */

  @DISPID(1611005962) //= 0x6006000a. The runtime will prefer the VTID if present
  @VTID(36)
  void removeOrientation(
    int oOrientation);


  /**
   * <p>
   * Getter method for the COM property "SupportsTrimMode"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611005964) //= 0x6006000c. The runtime will prefer the VTID if present
  @VTID(37)
  int supportsTrimMode();


  /**
   * <p>
   * Setter method for the COM property "SupportsTrimMode"
   * </p>
   * @param oTrimMode Mandatory int parameter.
   */

  @DISPID(1611005964) //= 0x6006000c. The runtime will prefer the VTID if present
  @VTID(38)
  void supportsTrimMode(
    int oTrimMode);


  /**
   * <p>
   * Getter method for the COM property "RibbonRelimitationMode"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611005966) //= 0x6006000e. The runtime will prefer the VTID if present
  @VTID(39)
  int ribbonRelimitationMode();


  /**
   * <p>
   * Setter method for the COM property "RibbonRelimitationMode"
   * </p>
   * @param oRelimitationMode Mandatory int parameter.
   */

  @DISPID(1611005966) //= 0x6006000e. The runtime will prefer the VTID if present
  @VTID(40)
  void ribbonRelimitationMode(
    int oRelimitationMode);


  /**
   */

  @DISPID(1611005968) //= 0x60060010. The runtime will prefer the VTID if present
  @VTID(41)
  void invertFirstOrientation();


  /**
   */

  @DISPID(1611005969) //= 0x60060011. The runtime will prefer the VTID if present
  @VTID(42)
  void invertSecondOrientation();


  /**
   */

  @DISPID(1611005970) //= 0x60060012. The runtime will prefer the VTID if present
  @VTID(43)
  void invertRemoveOrientation();


  // Properties:
}
