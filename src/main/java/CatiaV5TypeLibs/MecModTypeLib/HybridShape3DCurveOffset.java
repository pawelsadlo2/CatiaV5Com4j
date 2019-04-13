package CatiaV5TypeLibs.MecModTypeLib;
import CatiaV5TypeLibs.InfTypeLib.*;

import com4j.*;

@IID("{EDB7F706-F1FC-4744-99C5-F046AEF22C84}")
public interface HybridShape3DCurveOffset extends HybridShape {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "CurveToOffset"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(25)
  Reference curveToOffset();


  /**
   * <p>
   * Setter method for the COM property "CurveToOffset"
   * </p>
   * @param opIACurveToOffset Mandatory Reference parameter.
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(26)
  void curveToOffset(
    Reference opIACurveToOffset);


  /**
   * <p>
   * Getter method for the COM property "Direction"
   * </p>
   * @return  Returns a value of type HybridShapeDirection
   */

  @DISPID(1611005954) //= 0x60060002. The runtime will prefer the VTID if present
  @VTID(27)
  HybridShapeDirection direction();


  /**
   * <p>
   * Setter method for the COM property "Direction"
   * </p>
   * @param oDirection Mandatory HybridShapeDirection parameter.
   */

  @DISPID(1611005954) //= 0x60060002. The runtime will prefer the VTID if present
  @VTID(28)
  void direction(
    HybridShapeDirection oDirection);


  /**
   * <p>
   * Getter method for the COM property "OffsetValue"
   * </p>
   * @return  Returns a value of type Length
   */

  @DISPID(1611005956) //= 0x60060004. The runtime will prefer the VTID if present
  @VTID(29)
  Length offsetValue();


  /**
   * <p>
   * Setter method for the COM property "OffsetValue"
   * </p>
   * @param oOffset Mandatory Length parameter.
   */

  @DISPID(1611005956) //= 0x60060004. The runtime will prefer the VTID if present
  @VTID(30)
  void offsetValue(
    Length oOffset);


  /**
   * <p>
   * Getter method for the COM property "CornerRadiusValue"
   * </p>
   * @return  Returns a value of type Length
   */

  @DISPID(1611005958) //= 0x60060006. The runtime will prefer the VTID if present
  @VTID(31)
  Length cornerRadiusValue();


  /**
   * <p>
   * Setter method for the COM property "CornerRadiusValue"
   * </p>
   * @param oCornerRadius Mandatory Length parameter.
   */

  @DISPID(1611005958) //= 0x60060006. The runtime will prefer the VTID if present
  @VTID(32)
  void cornerRadiusValue(
    Length oCornerRadius);


  /**
   * <p>
   * Getter method for the COM property "CornerTensionValue"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(1611005960) //= 0x60060008. The runtime will prefer the VTID if present
  @VTID(33)
  double cornerTensionValue();


  /**
   * <p>
   * Setter method for the COM property "CornerTensionValue"
   * </p>
   * @param oCornerTension Mandatory double parameter.
   */

  @DISPID(1611005960) //= 0x60060008. The runtime will prefer the VTID if present
  @VTID(34)
  void cornerTensionValue(
    double oCornerTension);


  /**
   * <p>
   * Getter method for the COM property "InvertDirection"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005962) //= 0x6006000a. The runtime will prefer the VTID if present
  @VTID(35)
  boolean invertDirection();


  /**
   * <p>
   * Setter method for the COM property "InvertDirection"
   * </p>
   * @param oInvert Mandatory boolean parameter.
   */

  @DISPID(1611005962) //= 0x6006000a. The runtime will prefer the VTID if present
  @VTID(36)
  void invertDirection(
    boolean oInvert);


  // Properties:
}
