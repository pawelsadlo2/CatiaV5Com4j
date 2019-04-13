import com4j.*;

@IID("{7029B284-8FD6-11D6-A2F4-00065BDD6075}")
public interface HybridShapeCurveSmooth extends HybridShape {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "CurveToSmooth"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(25)
  Reference curveToSmooth();


  /**
   * <p>
   * Setter method for the COM property "CurveToSmooth"
   * </p>
   * @param opIACurveToSmooth Mandatory Reference parameter.
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(26)
  void curveToSmooth(
    Reference opIACurveToSmooth);


  /**
   * <p>
   * Getter method for the COM property "Support"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611005954) //= 0x60060002. The runtime will prefer the VTID if present
  @VTID(27)
  Reference support();


  /**
   * <p>
   * Setter method for the COM property "Support"
   * </p>
   * @param opIASupport Mandatory Reference parameter.
   */

  @DISPID(1611005954) //= 0x60060002. The runtime will prefer the VTID if present
  @VTID(28)
  void support(
    Reference opIASupport);


  /**
   * <p>
   * Getter method for the COM property "TangencyThreshold"
   * </p>
   * @return  Returns a value of type Angle
   */

  @DISPID(1611005956) //= 0x60060004. The runtime will prefer the VTID if present
  @VTID(29)
  Angle tangencyThreshold();


  /**
   * <p>
   * Getter method for the COM property "CurvatureThreshold"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(1611005957) //= 0x60060005. The runtime will prefer the VTID if present
  @VTID(30)
  double curvatureThreshold();


  /**
   * <p>
   * Setter method for the COM property "CurvatureThreshold"
   * </p>
   * @param oCrvtreThsld Mandatory double parameter.
   */

  @DISPID(1611005957) //= 0x60060005. The runtime will prefer the VTID if present
  @VTID(31)
  void curvatureThreshold(
    double oCrvtreThsld);


  /**
   * <p>
   * Getter method for the COM property "CurvatureThresholdActivity"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005959) //= 0x60060007. The runtime will prefer the VTID if present
  @VTID(32)
  boolean curvatureThresholdActivity();


  /**
   * <p>
   * Setter method for the COM property "CurvatureThresholdActivity"
   * </p>
   * @param oCrvtreThsldActivity Mandatory boolean parameter.
   */

  @DISPID(1611005959) //= 0x60060007. The runtime will prefer the VTID if present
  @VTID(33)
  void curvatureThresholdActivity(
    boolean oCrvtreThsldActivity);


  /**
   * <p>
   * Getter method for the COM property "MaximumDeviation"
   * </p>
   * @return  Returns a value of type Length
   */

  @DISPID(1611005961) //= 0x60060009. The runtime will prefer the VTID if present
  @VTID(34)
  Length maximumDeviation();


  /**
   * <p>
   * Getter method for the COM property "MaximumDeviationActivity"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005962) //= 0x6006000a. The runtime will prefer the VTID if present
  @VTID(35)
  boolean maximumDeviationActivity();


  /**
   * <p>
   * Setter method for the COM property "MaximumDeviationActivity"
   * </p>
   * @param oMaxDevActivity Mandatory boolean parameter.
   */

  @DISPID(1611005962) //= 0x6006000a. The runtime will prefer the VTID if present
  @VTID(36)
  void maximumDeviationActivity(
    boolean oMaxDevActivity);


  /**
   * <p>
   * Getter method for the COM property "TopologySimplificationActivity"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005964) //= 0x6006000c. The runtime will prefer the VTID if present
  @VTID(37)
  boolean topologySimplificationActivity();


  /**
   * <p>
   * Setter method for the COM property "TopologySimplificationActivity"
   * </p>
   * @param oTopoSimplActivity Mandatory boolean parameter.
   */

  @DISPID(1611005964) //= 0x6006000c. The runtime will prefer the VTID if present
  @VTID(38)
  void topologySimplificationActivity(
    boolean oTopoSimplActivity);


  /**
   * <p>
   * Getter method for the COM property "CorrectionMode"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611005966) //= 0x6006000e. The runtime will prefer the VTID if present
  @VTID(39)
  int correctionMode();


  /**
   * <p>
   * Setter method for the COM property "CorrectionMode"
   * </p>
   * @param oMode Mandatory int parameter.
   */

  @DISPID(1611005966) //= 0x6006000e. The runtime will prefer the VTID if present
  @VTID(40)
  void correctionMode(
    int oMode);


  /**
   * <p>
   * Getter method for the COM property "StartExtremityContinuity"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611005968) //= 0x60060010. The runtime will prefer the VTID if present
  @VTID(41)
  int startExtremityContinuity();


  /**
   * <p>
   * Setter method for the COM property "StartExtremityContinuity"
   * </p>
   * @param oContinuity Mandatory int parameter.
   */

  @DISPID(1611005968) //= 0x60060010. The runtime will prefer the VTID if present
  @VTID(42)
  void startExtremityContinuity(
    int oContinuity);


  /**
   * <p>
   * Getter method for the COM property "EndExtremityContinuity"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611005970) //= 0x60060012. The runtime will prefer the VTID if present
  @VTID(43)
  int endExtremityContinuity();


  /**
   * <p>
   * Setter method for the COM property "EndExtremityContinuity"
   * </p>
   * @param oContinuity Mandatory int parameter.
   */

  @DISPID(1611005970) //= 0x60060012. The runtime will prefer the VTID if present
  @VTID(44)
  void endExtremityContinuity(
    int oContinuity);


  /**
   * @param iTangencyThreshold Mandatory double parameter.
   */

  @DISPID(1611005972) //= 0x60060014. The runtime will prefer the VTID if present
  @VTID(45)
  void setTangencyThreshold(
    double iTangencyThreshold);


  /**
   * @param iMaxDeviation Mandatory double parameter.
   */

  @DISPID(1611005973) //= 0x60060015. The runtime will prefer the VTID if present
  @VTID(46)
  void setMaximumDeviation(
    double iMaxDeviation);


  /**
   * @param iCurve Mandatory Reference parameter.
   */

  @DISPID(1611005974) //= 0x60060016. The runtime will prefer the VTID if present
  @VTID(47)
  void addFrozenCurveSegment(
    Reference iCurve);


  /**
   * @return  Returns a value of type int
   */

  @DISPID(1611005975) //= 0x60060017. The runtime will prefer the VTID if present
  @VTID(48)
  int getFrozenCurveSegmentsSize();


  /**
   * @param iPos Mandatory int parameter.
   * @return  Returns a value of type Reference
   */

  @DISPID(1611005976) //= 0x60060018. The runtime will prefer the VTID if present
  @VTID(49)
  Reference getFrozenCurveSegment(
    int iPos);


  /**
   * @param iCurve Mandatory Reference parameter.
   */

  @DISPID(1611005977) //= 0x60060019. The runtime will prefer the VTID if present
  @VTID(50)
  void removeFrozenCurveSegment(
    Reference iCurve);


  /**
   */

  @DISPID(1611005978) //= 0x6006001a. The runtime will prefer the VTID if present
  @VTID(51)
  void removeAllFrozenCurveSegments();


  /**
   * @param iPoint Mandatory Reference parameter.
   */

  @DISPID(1611005979) //= 0x6006001b. The runtime will prefer the VTID if present
  @VTID(52)
  void addFrozenPoint(
    Reference iPoint);


  /**
   * @return  Returns a value of type int
   */

  @DISPID(1611005980) //= 0x6006001c. The runtime will prefer the VTID if present
  @VTID(53)
  int getFrozenPointsSize();


  /**
   * @param iPos Mandatory int parameter.
   * @return  Returns a value of type Reference
   */

  @DISPID(1611005981) //= 0x6006001d. The runtime will prefer the VTID if present
  @VTID(54)
  Reference getFrozenPoint(
    int iPos);


  /**
   * @param iPoint Mandatory Reference parameter.
   */

  @DISPID(1611005982) //= 0x6006001e. The runtime will prefer the VTID if present
  @VTID(55)
  void removeFrozenPoint(
    Reference iPoint);


  /**
   */

  @DISPID(1611005983) //= 0x6006001f. The runtime will prefer the VTID if present
  @VTID(56)
  void removeAllFrozenPoints();


  // Properties:
}
