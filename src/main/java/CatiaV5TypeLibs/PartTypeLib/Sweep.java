package CatiaV5TypeLibs.PartTypeLib;
import CatiaV5TypeLibs.InfTypeLib.*;
import CatiaV5TypeLibs.MecModTypeLib.*;
import CatiaV5TypeLibs.KnowledgewareTypeLib.*;

import com4j.*;

@IID("{AA37BEAA-56B8-11D1-A273-0000F87546FD}")
public interface Sweep extends SketchBasedShape {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "CenterCurve"
   * </p>
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.Sketch
   */

  @DISPID(1611071488) //= 0x60070000. The runtime will prefer the VTID if present
  @VTID(24)
  Sketch centerCurve();


  /**
   * <p>
   * Getter method for the COM property "CenterCurveElement"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611071489) //= 0x60070001. The runtime will prefer the VTID if present
  @VTID(25)
  Reference centerCurveElement();


  /**
   * <p>
   * Setter method for the COM property "CenterCurveElement"
   * </p>
   * @param oCenterCurveElement Mandatory Reference parameter.
   */

  @DISPID(1611071489) //= 0x60070001. The runtime will prefer the VTID if present
  @VTID(26)
  void centerCurveElement(
    Reference oCenterCurveElement);


  /**
   * <p>
   * Getter method for the COM property "ReferenceSurfaceElement"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611071491) //= 0x60070003. The runtime will prefer the VTID if present
  @VTID(27)
  Reference referenceSurfaceElement();


  /**
   * <p>
   * Setter method for the COM property "ReferenceSurfaceElement"
   * </p>
   * @param oReferenceSurfaceElement Mandatory Reference parameter.
   */

  @DISPID(1611071491) //= 0x60070003. The runtime will prefer the VTID if present
  @VTID(28)
  void referenceSurfaceElement(
    Reference oReferenceSurfaceElement);


  /**
   * <p>
   * Getter method for the COM property "PullingDirElement"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611071493) //= 0x60070005. The runtime will prefer the VTID if present
  @VTID(29)
  Reference pullingDirElement();


  /**
   * <p>
   * Setter method for the COM property "PullingDirElement"
   * </p>
   * @param oPullingDirElement Mandatory Reference parameter.
   */

  @DISPID(1611071493) //= 0x60070005. The runtime will prefer the VTID if present
  @VTID(30)
  void pullingDirElement(
    Reference oPullingDirElement);


  /**
   * <p>
   * Getter method for the COM property "MergeMode"
   * </p>
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.CatMergeMode
   */

  @DISPID(1611071495) //= 0x60070007. The runtime will prefer the VTID if present
  @VTID(31)
  CatMergeMode mergeMode();


  /**
   * <p>
   * Setter method for the COM property "MergeMode"
   * </p>
   * @param oMergeMode Mandatory CatiaV5TypeLibs.PartItfTypeLib.CatMergeMode parameter.
   */

  @DISPID(1611071495) //= 0x60070007. The runtime will prefer the VTID if present
  @VTID(32)
  void mergeMode(
    CatMergeMode oMergeMode);


  /**
   */

  @DISPID(1611071497) //= 0x60070009. The runtime will prefer the VTID if present
  @VTID(33)
  void setKeepAngleOption();


  /**
   * <p>
   * Getter method for the COM property "IsThin"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1611071498) //= 0x6007000a. The runtime will prefer the VTID if present
  @VTID(34)
  boolean isThin();


  /**
   * <p>
   * Setter method for the COM property "IsThin"
   * </p>
   * @param oIsThin Mandatory boolean parameter.
   */

  @DISPID(1611071498) //= 0x6007000a. The runtime will prefer the VTID if present
  @VTID(35)
  void isThin(
    boolean oIsThin);


  /**
   * <p>
   * Getter method for the COM property "NeutralFiber"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1611071500) //= 0x6007000c. The runtime will prefer the VTID if present
  @VTID(36)
  boolean neutralFiber();


  /**
   * <p>
   * Setter method for the COM property "NeutralFiber"
   * </p>
   * @param oIsNeutralFiber Mandatory boolean parameter.
   */

  @DISPID(1611071500) //= 0x6007000c. The runtime will prefer the VTID if present
  @VTID(37)
  void neutralFiber(
    boolean oIsNeutralFiber);


  /**
   * <p>
   * Getter method for the COM property "MergeEnd"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1611071502) //= 0x6007000e. The runtime will prefer the VTID if present
  @VTID(38)
  boolean mergeEnd();


  /**
   * <p>
   * Setter method for the COM property "MergeEnd"
   * </p>
   * @param oIsMergeEnd Mandatory boolean parameter.
   */

  @DISPID(1611071502) //= 0x6007000e. The runtime will prefer the VTID if present
  @VTID(39)
  void mergeEnd(
    boolean oIsMergeEnd);


  /**
   * <p>
   * Getter method for the COM property "MoveProfileToPath"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1611071504) //= 0x60070010. The runtime will prefer the VTID if present
  @VTID(40)
  boolean moveProfileToPath();


  /**
   * <p>
   * Setter method for the COM property "MoveProfileToPath"
   * </p>
   * @param oIsMoveProfileToPath Mandatory boolean parameter.
   */

  @DISPID(1611071504) //= 0x60070010. The runtime will prefer the VTID if present
  @VTID(41)
  void moveProfileToPath(
    boolean oIsMoveProfileToPath);


  /**
   * <p>
   * Getter method for the COM property "NormalAxisDirReverse"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1611071506) //= 0x60070012. The runtime will prefer the VTID if present
  @VTID(42)
  boolean normalAxisDirReverse();


  /**
   * <p>
   * Setter method for the COM property "NormalAxisDirReverse"
   * </p>
   * @param oNormalAxisDirReverse Mandatory boolean parameter.
   */

  @DISPID(1611071506) //= 0x60070012. The runtime will prefer the VTID if present
  @VTID(43)
  void normalAxisDirReverse(
    boolean oNormalAxisDirReverse);


  /**
   * <p>
   * Getter method for the COM property "AnchorDirReverse"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1611071508) //= 0x60070014. The runtime will prefer the VTID if present
  @VTID(44)
  boolean anchorDirReverse();


  /**
   * <p>
   * Setter method for the COM property "AnchorDirReverse"
   * </p>
   * @param oAnchorDirReverse Mandatory boolean parameter.
   */

  @DISPID(1611071508) //= 0x60070014. The runtime will prefer the VTID if present
  @VTID(45)
  void anchorDirReverse(
    boolean oAnchorDirReverse);


  // Properties:
}
