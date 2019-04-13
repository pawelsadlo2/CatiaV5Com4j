package CatiaV5TypeLibs.MecModTypeLib;
import CatiaV5TypeLibs.KnowledgewareTypeLib.*;

import CatiaV5TypeLibs.InfTypeLib.*;
import com4j.*;

@IID("{7BDD662E-48E7-11D3-A581-006094B9ADCE}")
public interface HybridShapeScaling extends HybridShape {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "ElemToScale"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(25)
  Reference elemToScale();


  /**
   * <p>
   * Setter method for the COM property "ElemToScale"
   * </p>
   * @param oX Mandatory Reference parameter.
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(26)
  void elemToScale(
    Reference oX);


  /**
   * <p>
   * Getter method for the COM property "Center"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611005954) //= 0x60060002. The runtime will prefer the VTID if present
  @VTID(27)
  Reference center();


  /**
   * <p>
   * Setter method for the COM property "Center"
   * </p>
   * @param oX Mandatory Reference parameter.
   */

  @DISPID(1611005954) //= 0x60060002. The runtime will prefer the VTID if present
  @VTID(28)
  void center(
    Reference oX);


  /**
   * <p>
   * Getter method for the COM property "Ratio"
   * </p>
   * @return  Returns a value of type RealParam
   */

  @DISPID(1611005956) //= 0x60060004. The runtime will prefer the VTID if present
  @VTID(29)
  RealParam ratio();


  /**
   * <p>
   * Getter method for the COM property "RatioValue"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(1611005957) //= 0x60060005. The runtime will prefer the VTID if present
  @VTID(30)
  double ratioValue();


  /**
   * <p>
   * Setter method for the COM property "RatioValue"
   * </p>
   * @param oX Mandatory double parameter.
   */

  @DISPID(1611005957) //= 0x60060005. The runtime will prefer the VTID if present
  @VTID(31)
  void ratioValue(
    double oX);


  /**
   * <p>
   * Getter method for the COM property "VolumeResult"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005959) //= 0x60060007. The runtime will prefer the VTID if present
  @VTID(32)
  boolean volumeResult();


  /**
   * <p>
   * Setter method for the COM property "VolumeResult"
   * </p>
   * @param oType Mandatory boolean parameter.
   */

  @DISPID(1611005959) //= 0x60060007. The runtime will prefer the VTID if present
  @VTID(33)
  void volumeResult(
    boolean oType);


  /**
   * <p>
   * Getter method for the COM property "CreationMode"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005961) //= 0x60060009. The runtime will prefer the VTID if present
  @VTID(34)
  boolean creationMode();


  /**
   * <p>
   * Setter method for the COM property "CreationMode"
   * </p>
   * @param oCreation Mandatory boolean parameter.
   */

  @DISPID(1611005961) //= 0x60060009. The runtime will prefer the VTID if present
  @VTID(35)
  void creationMode(
    boolean oCreation);


  // Properties:
}
