package CatiaV5TypeLibs.MecModTypeLib;
import CatiaV5TypeLibs.KnowledgewareTypeLib.*;
import CatiaV5TypeLibs.InfTypeLib.*;

import com4j.*;

@IID("{06022001-1961-0001-0280-020E70000000}")
public interface HybridShapeBump extends HybridShape {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "BodyToBump"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(25)
  Reference bodyToBump();


  /**
   * <p>
   * Setter method for the COM property "BodyToBump"
   * </p>
   * @param oBodyToBump Mandatory Reference parameter.
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(26)
  void bodyToBump(
    Reference oBodyToBump);


  /**
   * <p>
   * Getter method for the COM property "LimitCurve"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611005954) //= 0x60060002. The runtime will prefer the VTID if present
  @VTID(27)
  Reference limitCurve();


  /**
   * <p>
   * Setter method for the COM property "LimitCurve"
   * </p>
   * @param oLimitCurve Mandatory Reference parameter.
   */

  @DISPID(1611005954) //= 0x60060002. The runtime will prefer the VTID if present
  @VTID(28)
  void limitCurve(
    Reference oLimitCurve);


  /**
   * <p>
   * Getter method for the COM property "DeformationCenter"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611005956) //= 0x60060004. The runtime will prefer the VTID if present
  @VTID(29)
  Reference deformationCenter();


  /**
   * <p>
   * Setter method for the COM property "DeformationCenter"
   * </p>
   * @param oDeformationCenter Mandatory Reference parameter.
   */

  @DISPID(1611005956) //= 0x60060004. The runtime will prefer the VTID if present
  @VTID(30)
  void deformationCenter(
    Reference oDeformationCenter);


  /**
   * <p>
   * Getter method for the COM property "DeformationDir"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611005958) //= 0x60060006. The runtime will prefer the VTID if present
  @VTID(31)
  Reference deformationDir();


  /**
   * <p>
   * Setter method for the COM property "DeformationDir"
   * </p>
   * @param oDeformationDir Mandatory Reference parameter.
   */

  @DISPID(1611005958) //= 0x60060006. The runtime will prefer the VTID if present
  @VTID(32)
  void deformationDir(
    Reference oDeformationDir);


  /**
   * <p>
   * Getter method for the COM property "DeformationDist"
   * </p>
   * @return  Returns a value of type Length
   */

  @DISPID(1611005960) //= 0x60060008. The runtime will prefer the VTID if present
  @VTID(33)
  Length deformationDist();


  /**
   * <p>
   * Setter method for the COM property "DeformationDist"
   * </p>
   * @param oDefDist Mandatory Length parameter.
   */

  @DISPID(1611005960) //= 0x60060008. The runtime will prefer the VTID if present
  @VTID(34)
  void deformationDist(
    Length oDefDist);


  /**
   * <p>
   * Getter method for the COM property "DeformationDistValue"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(1611005962) //= 0x6006000a. The runtime will prefer the VTID if present
  @VTID(35)
  double deformationDistValue();


  /**
   * <p>
   * Setter method for the COM property "DeformationDistValue"
   * </p>
   * @param oDefDistVal Mandatory double parameter.
   */

  @DISPID(1611005962) //= 0x6006000a. The runtime will prefer the VTID if present
  @VTID(36)
  void deformationDistValue(
    double oDefDistVal);


  /**
   * <p>
   * Getter method for the COM property "ContinuityType"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611005964) //= 0x6006000c. The runtime will prefer the VTID if present
  @VTID(37)
  int continuityType();


  /**
   * <p>
   * Setter method for the COM property "ContinuityType"
   * </p>
   * @param oContinuity Mandatory int parameter.
   */

  @DISPID(1611005964) //= 0x6006000c. The runtime will prefer the VTID if present
  @VTID(38)
  void continuityType(
    int oContinuity);


  /**
   * <p>
   * Getter method for the COM property "ProjectionDir"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611005966) //= 0x6006000e. The runtime will prefer the VTID if present
  @VTID(39)
  Reference projectionDir();


  /**
   * <p>
   * Setter method for the COM property "ProjectionDir"
   * </p>
   * @param oProjectionDir Mandatory Reference parameter.
   */

  @DISPID(1611005966) //= 0x6006000e. The runtime will prefer the VTID if present
  @VTID(40)
  void projectionDir(
    Reference oProjectionDir);


  /**
   * <p>
   * Getter method for the COM property "CenterTension"
   * </p>
   * @return  Returns a value of type RealParam
   */

  @DISPID(1611005968) //= 0x60060010. The runtime will prefer the VTID if present
  @VTID(41)
  RealParam centerTension();


  /**
   * <p>
   * Setter method for the COM property "CenterTension"
   * </p>
   * @param oCenterTension Mandatory RealParam parameter.
   */

  @DISPID(1611005968) //= 0x60060010. The runtime will prefer the VTID if present
  @VTID(42)
  void centerTension(
    RealParam oCenterTension);


  // Properties:
}
