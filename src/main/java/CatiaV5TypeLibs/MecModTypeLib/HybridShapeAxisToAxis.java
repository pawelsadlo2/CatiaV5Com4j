package CatiaV5TypeLibs.MecModTypeLib;
import CatiaV5TypeLibs.KnowledgewareTypeLib.*;
import CatiaV5TypeLibs.InfTypeLib.*;

import com4j.*;

@IID("{42EA9880-60A2-11D5-9F09-00508B5FE60C}")
public interface HybridShapeAxisToAxis extends HybridShape {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "ElemToTransform"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(25)
  Reference elemToTransform();


  /**
   * <p>
   * Setter method for the COM property "ElemToTransform"
   * </p>
   * @param oElem Mandatory Reference parameter.
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(26)
  void elemToTransform(
    Reference oElem);


  /**
   * <p>
   * Getter method for the COM property "ReferenceAxis"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611005954) //= 0x60060002. The runtime will prefer the VTID if present
  @VTID(27)
  Reference referenceAxis();


  /**
   * <p>
   * Setter method for the COM property "ReferenceAxis"
   * </p>
   * @param oAxis Mandatory Reference parameter.
   */

  @DISPID(1611005954) //= 0x60060002. The runtime will prefer the VTID if present
  @VTID(28)
  void referenceAxis(
    Reference oAxis);


  /**
   * <p>
   * Getter method for the COM property "TargetAxis"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611005956) //= 0x60060004. The runtime will prefer the VTID if present
  @VTID(29)
  Reference targetAxis();


  /**
   * <p>
   * Setter method for the COM property "TargetAxis"
   * </p>
   * @param oAxis Mandatory Reference parameter.
   */

  @DISPID(1611005956) //= 0x60060004. The runtime will prefer the VTID if present
  @VTID(30)
  void targetAxis(
    Reference oAxis);


  /**
   * <p>
   * Getter method for the COM property "VolumeResult"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005958) //= 0x60060006. The runtime will prefer the VTID if present
  @VTID(31)
  boolean volumeResult();


  /**
   * <p>
   * Setter method for the COM property "VolumeResult"
   * </p>
   * @param oType Mandatory boolean parameter.
   */

  @DISPID(1611005958) //= 0x60060006. The runtime will prefer the VTID if present
  @VTID(32)
  void volumeResult(
    boolean oType);


  /**
   * <p>
   * Getter method for the COM property "CreationMode"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005960) //= 0x60060008. The runtime will prefer the VTID if present
  @VTID(33)
  boolean creationMode();


  /**
   * <p>
   * Setter method for the COM property "CreationMode"
   * </p>
   * @param oCreation Mandatory boolean parameter.
   */

  @DISPID(1611005960) //= 0x60060008. The runtime will prefer the VTID if present
  @VTID(34)
  void creationMode(
    boolean oCreation);


  // Properties:
}
