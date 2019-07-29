package CatiaV5TypeLibs.HybridShapeTypeLib;
import CatiaV5TypeLibs.InfTypeLib.*;
import CatiaV5TypeLibs.MecModTypeLib.*;

import com4j.*;

@IID("{8C0A5606-0737-0000-0280-020E60000000}")
public interface HybridShapeSymmetry extends HybridShape {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "ElemToSymmetry"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(25)
  Reference elemToSymmetry();


  /**
   * <p>
   * Setter method for the COM property "ElemToSymmetry"
   * </p>
   * @param oElem Mandatory Reference parameter.
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(26)
  void elemToSymmetry(
    Reference oElem);


  /**
   * <p>
   * Getter method for the COM property "Reference"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611005954) //= 0x60060002. The runtime will prefer the VTID if present
  @VTID(27)
  Reference reference();


  /**
   * <p>
   * Setter method for the COM property "Reference"
   * </p>
   * @param oElem Mandatory Reference parameter.
   */

  @DISPID(1611005954) //= 0x60060002. The runtime will prefer the VTID if present
  @VTID(28)
  void reference(
    Reference oElem);


  /**
   * <p>
   * Getter method for the COM property "VolumeResult"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005956) //= 0x60060004. The runtime will prefer the VTID if present
  @VTID(29)
  boolean volumeResult();


  /**
   * <p>
   * Setter method for the COM property "VolumeResult"
   * </p>
   * @param oType Mandatory boolean parameter.
   */

  @DISPID(1611005956) //= 0x60060004. The runtime will prefer the VTID if present
  @VTID(30)
  void volumeResult(
    boolean oType);


  /**
   * <p>
   * Getter method for the COM property "CreationMode"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005958) //= 0x60060006. The runtime will prefer the VTID if present
  @VTID(31)
  boolean creationMode();


  /**
   * <p>
   * Setter method for the COM property "CreationMode"
   * </p>
   * @param oCreation Mandatory boolean parameter.
   */

  @DISPID(1611005958) //= 0x60060006. The runtime will prefer the VTID if present
  @VTID(32)
  void creationMode(
    boolean oCreation);


  // Properties:
}
