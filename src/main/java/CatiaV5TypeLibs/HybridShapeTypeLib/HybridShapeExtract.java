package CatiaV5TypeLibs.HybridShapeTypeLib;
import CatiaV5TypeLibs.InfTypeLib.*;
import CatiaV5TypeLibs.MecModTypeLib.*;

import com4j.*;

@IID("{8CCF2FDC-E8CC-0000-0280-020E60000000}")
public interface HybridShapeExtract extends HybridShape {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Elem"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(25)
  Reference elem();


  /**
   * <p>
   * Setter method for the COM property "Elem"
   * </p>
   * @param oElem Mandatory Reference parameter.
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(26)
  void elem(
    Reference oElem);


  /**
   * <p>
   * Getter method for the COM property "PropagationType"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611005954) //= 0x60060002. The runtime will prefer the VTID if present
  @VTID(27)
  int propagationType();


  /**
   * <p>
   * Setter method for the COM property "PropagationType"
   * </p>
   * @param oTypePropag Mandatory int parameter.
   */

  @DISPID(1611005954) //= 0x60060002. The runtime will prefer the VTID if present
  @VTID(28)
  void propagationType(
    int oTypePropag);


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
   * @param oSupport Mandatory Reference parameter.
   */

  @DISPID(1611005956) //= 0x60060004. The runtime will prefer the VTID if present
  @VTID(30)
  void support(
    Reference oSupport);


  /**
   * <p>
   * Getter method for the COM property "ComplementaryExtract"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005958) //= 0x60060006. The runtime will prefer the VTID if present
  @VTID(31)
  boolean complementaryExtract();


  /**
   * <p>
   * Setter method for the COM property "ComplementaryExtract"
   * </p>
   * @param oComplementaire Mandatory boolean parameter.
   */

  @DISPID(1611005958) //= 0x60060006. The runtime will prefer the VTID if present
  @VTID(32)
  void complementaryExtract(
    boolean oComplementaire);


  /**
   * <p>
   * Getter method for the COM property "IsFederated"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005960) //= 0x60060008. The runtime will prefer the VTID if present
  @VTID(33)
  boolean isFederated();


  /**
   * <p>
   * Setter method for the COM property "IsFederated"
   * </p>
   * @param oIsFederated Mandatory boolean parameter.
   */

  @DISPID(1611005960) //= 0x60060008. The runtime will prefer the VTID if present
  @VTID(34)
  void isFederated(
    boolean oIsFederated);


  /**
   * <p>
   * Getter method for the COM property "CurvatureThreshold"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(1611005962) //= 0x6006000a. The runtime will prefer the VTID if present
  @VTID(35)
  double curvatureThreshold();


  /**
   * <p>
   * Setter method for the COM property "CurvatureThreshold"
   * </p>
   * @param oCrvtreThsld Mandatory double parameter.
   */

  @DISPID(1611005962) //= 0x6006000a. The runtime will prefer the VTID if present
  @VTID(36)
  void curvatureThreshold(
    double oCrvtreThsld);


  /**
   * <p>
   * Getter method for the COM property "CurvatureThresholdActivity"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005964) //= 0x6006000c. The runtime will prefer the VTID if present
  @VTID(37)
  boolean curvatureThresholdActivity();


  /**
   * <p>
   * Setter method for the COM property "CurvatureThresholdActivity"
   * </p>
   * @param oCrvtreThsldActivity Mandatory boolean parameter.
   */

  @DISPID(1611005964) //= 0x6006000c. The runtime will prefer the VTID if present
  @VTID(38)
  void curvatureThresholdActivity(
    boolean oCrvtreThsldActivity);


  /**
   * <p>
   * Getter method for the COM property "DistanceThreshold"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(1611005966) //= 0x6006000e. The runtime will prefer the VTID if present
  @VTID(39)
  double distanceThreshold();


  /**
   * <p>
   * Setter method for the COM property "DistanceThreshold"
   * </p>
   * @param oDistreThsld Mandatory double parameter.
   */

  @DISPID(1611005966) //= 0x6006000e. The runtime will prefer the VTID if present
  @VTID(40)
  void distanceThreshold(
    double oDistreThsld);


  /**
   * <p>
   * Getter method for the COM property "DistanceThresholdActivity"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005968) //= 0x60060010. The runtime will prefer the VTID if present
  @VTID(41)
  boolean distanceThresholdActivity();


  /**
   * <p>
   * Setter method for the COM property "DistanceThresholdActivity"
   * </p>
   * @param oDistreThsldActivity Mandatory boolean parameter.
   */

  @DISPID(1611005968) //= 0x60060010. The runtime will prefer the VTID if present
  @VTID(42)
  void distanceThresholdActivity(
    boolean oDistreThsldActivity);


  /**
   * <p>
   * Getter method for the COM property "AngularThreshold"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(1611005970) //= 0x60060012. The runtime will prefer the VTID if present
  @VTID(43)
  double angularThreshold();


  /**
   * <p>
   * Setter method for the COM property "AngularThreshold"
   * </p>
   * @param oAngtreThsld Mandatory double parameter.
   */

  @DISPID(1611005970) //= 0x60060012. The runtime will prefer the VTID if present
  @VTID(44)
  void angularThreshold(
    double oAngtreThsld);


  /**
   * <p>
   * Getter method for the COM property "AngularThresholdActivity"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005972) //= 0x60060014. The runtime will prefer the VTID if present
  @VTID(45)
  boolean angularThresholdActivity();


  /**
   * <p>
   * Setter method for the COM property "AngularThresholdActivity"
   * </p>
   * @param oAngtreThsldActivity Mandatory boolean parameter.
   */

  @DISPID(1611005972) //= 0x60060014. The runtime will prefer the VTID if present
  @VTID(46)
  void angularThresholdActivity(
    boolean oAngtreThsldActivity);


  // Properties:
}
