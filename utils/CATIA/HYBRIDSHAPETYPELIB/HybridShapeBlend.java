import com4j.*;

@IID("{D54BCEB0-0561-11D4-8510-0000863E1BCE}")
public interface HybridShapeBlend extends HybridShape {
  // Methods:
  /**
   * @param iBlendLimit Mandatory int parameter.
   * @param iCurve Mandatory Reference parameter.
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(25)
  void setCurve(
    int iBlendLimit,
    Reference iCurve);


  /**
   * @param iBlendLimit Mandatory int parameter.
   * @return  Returns a value of type Reference
   */

  @DISPID(1611005953) //= 0x60060001. The runtime will prefer the VTID if present
  @VTID(26)
  Reference getCurve(
    int iBlendLimit);


  /**
   * @param iBlendLimit Mandatory int parameter.
   * @param iClosingPoint Mandatory Reference parameter.
   */

  @DISPID(1611005954) //= 0x60060002. The runtime will prefer the VTID if present
  @VTID(27)
  void setClosingPoint(
    int iBlendLimit,
    Reference iClosingPoint);


  /**
   * @param iBlendLimit Mandatory int parameter.
   * @return  Returns a value of type Reference
   */

  @DISPID(1611005955) //= 0x60060003. The runtime will prefer the VTID if present
  @VTID(28)
  Reference getClosingPoint(
    int iBlendLimit);


  /**
   * @param iBlendLimit Mandatory int parameter.
   */

  @DISPID(1611005956) //= 0x60060004. The runtime will prefer the VTID if present
  @VTID(29)
  void unsetClosingPoint(
    int iBlendLimit);


  /**
   * @param iBlendLimit Mandatory int parameter.
   * @param iOrientation Mandatory int parameter.
   */

  @DISPID(1611005957) //= 0x60060005. The runtime will prefer the VTID if present
  @VTID(30)
  void setOrientation(
    int iBlendLimit,
    int iOrientation);


  /**
   * @param iBlendLimit Mandatory int parameter.
   * @return  Returns a value of type int
   */

  @DISPID(1611005958) //= 0x60060006. The runtime will prefer the VTID if present
  @VTID(31)
  int getOrientation(
    int iBlendLimit);


  /**
   * @param iBlendLimit Mandatory int parameter.
   * @param iSupport Mandatory Reference parameter.
   */

  @DISPID(1611005959) //= 0x60060007. The runtime will prefer the VTID if present
  @VTID(32)
  void setSupport(
    int iBlendLimit,
    Reference iSupport);


  /**
   * @param iBlendLimit Mandatory int parameter.
   * @return  Returns a value of type Reference
   */

  @DISPID(1611005960) //= 0x60060008. The runtime will prefer the VTID if present
  @VTID(33)
  Reference getSupport(
    int iBlendLimit);


  /**
   * @param iBlendLimit Mandatory int parameter.
   */

  @DISPID(1611005961) //= 0x60060009. The runtime will prefer the VTID if present
  @VTID(34)
  void unsetSupport(
    int iBlendLimit);


  /**
   * @param iBlendLimit Mandatory int parameter.
   * @param iTransition Mandatory int parameter.
   */

  @DISPID(1611005962) //= 0x6006000a. The runtime will prefer the VTID if present
  @VTID(35)
  void setTransition(
    int iBlendLimit,
    int iTransition);


  /**
   * @param iBlendLimit Mandatory int parameter.
   * @return  Returns a value of type int
   */

  @DISPID(1611005963) //= 0x6006000b. The runtime will prefer the VTID if present
  @VTID(36)
  int getTransition(
    int iBlendLimit);


  /**
   * @param iBlendLimit Mandatory int parameter.
   * @param iContinuity Mandatory int parameter.
   */

  @DISPID(1611005964) //= 0x6006000c. The runtime will prefer the VTID if present
  @VTID(37)
  void setContinuity(
    int iBlendLimit,
    int iContinuity);


  /**
   * @param iBlendLimit Mandatory int parameter.
   * @return  Returns a value of type int
   */

  @DISPID(1611005965) //= 0x6006000d. The runtime will prefer the VTID if present
  @VTID(38)
  int getContinuity(
    int iBlendLimit);


  /**
   * @param iBlendLimit Mandatory int parameter.
   * @param iTrimSupport Mandatory int parameter.
   */

  @DISPID(1611005966) //= 0x6006000e. The runtime will prefer the VTID if present
  @VTID(39)
  void setTrimSupport(
    int iBlendLimit,
    int iTrimSupport);


  /**
   * @param iBlendLimit Mandatory int parameter.
   * @return  Returns a value of type int
   */

  @DISPID(1611005967) //= 0x6006000f. The runtime will prefer the VTID if present
  @VTID(40)
  int getTrimSupport(
    int iBlendLimit);


  /**
   * @param iBlendLimit Mandatory int parameter.
   * @param iBorder Mandatory int parameter.
   */

  @DISPID(1611005968) //= 0x60060010. The runtime will prefer the VTID if present
  @VTID(41)
  void setBorderMode(
    int iBlendLimit,
    int iBorder);


  /**
   * @param iBlendLimit Mandatory int parameter.
   * @return  Returns a value of type int
   */

  @DISPID(1611005969) //= 0x60060011. The runtime will prefer the VTID if present
  @VTID(42)
  int getBorderMode(
    int iBlendLimit);


  /**
   * @param iBlendLimit Mandatory int parameter.
   * @param iTensionType Mandatory int parameter.
   * @param iFirstTension Mandatory double parameter.
   * @param iSecondTension Mandatory double parameter.
   */

  @DISPID(1611005970) //= 0x60060012. The runtime will prefer the VTID if present
  @VTID(43)
  void setTensionInDouble(
    int iBlendLimit,
    int iTensionType,
    double iFirstTension,
    double iSecondTension);


  /**
   * @param iBlendLimit Mandatory int parameter.
   * @param iRank Mandatory int parameter.
   * @return  Returns a value of type RealParam
   */

  @DISPID(1611005971) //= 0x60060013. The runtime will prefer the VTID if present
  @VTID(44)
  RealParam getTensionInDouble(
    int iBlendLimit,
    int iRank);


  /**
   * @param iBlendLimit Mandatory int parameter.
   * @param iTensionType Mandatory int parameter.
   */

  @DISPID(1611005972) //= 0x60060014. The runtime will prefer the VTID if present
  @VTID(45)
  void setTensionType(
    int iBlendLimit,
    int iTensionType);


  /**
   * @param iBlendLimit Mandatory int parameter.
   * @return  Returns a value of type int
   */

  @DISPID(1611005973) //= 0x60060015. The runtime will prefer the VTID if present
  @VTID(46)
  int getTensionType(
    int iBlendLimit);


  /**
   * @param iPosition Mandatory int parameter.
   */

  @DISPID(1611005974) //= 0x60060016. The runtime will prefer the VTID if present
  @VTID(47)
  void insertCoupling(
    int iPosition);


  /**
   * @param iCouplingIndex Mandatory int parameter.
   * @param iPosition Mandatory int parameter.
   * @param iPoint Mandatory Reference parameter.
   */

  @DISPID(1611005975) //= 0x60060017. The runtime will prefer the VTID if present
  @VTID(48)
  void insertCouplingPoint(
    int iCouplingIndex,
    int iPosition,
    Reference iPoint);


  /**
   * <p>
   * Getter method for the COM property "Coupling"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611005976) //= 0x60060018. The runtime will prefer the VTID if present
  @VTID(49)
  int coupling();


  /**
   * <p>
   * Setter method for the COM property "Coupling"
   * </p>
   * @param oCoupling Mandatory int parameter.
   */

  @DISPID(1611005976) //= 0x60060018. The runtime will prefer the VTID if present
  @VTID(50)
  void coupling(
    int oCoupling);


  /**
   * <p>
   * Getter method for the COM property "Spine"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611005978) //= 0x6006001a. The runtime will prefer the VTID if present
  @VTID(51)
  Reference spine();


  /**
   * <p>
   * Setter method for the COM property "Spine"
   * </p>
   * @param oSpine Mandatory Reference parameter.
   */

  @DISPID(1611005978) //= 0x6006001a. The runtime will prefer the VTID if present
  @VTID(52)
  void spine(
    Reference oSpine);


  /**
   * <p>
   * Getter method for the COM property "SmoothAngleThresholdActivity"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005980) //= 0x6006001c. The runtime will prefer the VTID if present
  @VTID(53)
  boolean smoothAngleThresholdActivity();


  /**
   * <p>
   * Setter method for the COM property "SmoothAngleThresholdActivity"
   * </p>
   * @param oSmooth Mandatory boolean parameter.
   */

  @DISPID(1611005980) //= 0x6006001c. The runtime will prefer the VTID if present
  @VTID(54)
  void smoothAngleThresholdActivity(
    boolean oSmooth);


  /**
   * <p>
   * Getter method for the COM property "SmoothAngleThreshold"
   * </p>
   * @return  Returns a value of type Angle
   */

  @DISPID(1611005982) //= 0x6006001e. The runtime will prefer the VTID if present
  @VTID(55)
  Angle smoothAngleThreshold();


  /**
   * <p>
   * Getter method for the COM property "SmoothDeviationActivity"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005983) //= 0x6006001f. The runtime will prefer the VTID if present
  @VTID(56)
  boolean smoothDeviationActivity();


  /**
   * <p>
   * Setter method for the COM property "SmoothDeviationActivity"
   * </p>
   * @param oActivity Mandatory boolean parameter.
   */

  @DISPID(1611005983) //= 0x6006001f. The runtime will prefer the VTID if present
  @VTID(57)
  void smoothDeviationActivity(
    boolean oActivity);


  /**
   * <p>
   * Getter method for the COM property "SmoothDeviation"
   * </p>
   * @return  Returns a value of type Length
   */

  @DISPID(1611005985) //= 0x60060021. The runtime will prefer the VTID if present
  @VTID(58)
  Length smoothDeviation();


  /**
   * <p>
   * Getter method for the COM property "RuledDevelopableSurface"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005986) //= 0x60060022. The runtime will prefer the VTID if present
  @VTID(59)
  boolean ruledDevelopableSurface();


  /**
   * <p>
   * Setter method for the COM property "RuledDevelopableSurface"
   * </p>
   * @param oMode Mandatory boolean parameter.
   */

  @DISPID(1611005986) //= 0x60060022. The runtime will prefer the VTID if present
  @VTID(60)
  void ruledDevelopableSurface(
    boolean oMode);


  /**
   * @param iBlendLimit Mandatory int parameter.
   * @return  Returns a value of type int
   */

  @DISPID(1611005988) //= 0x60060024. The runtime will prefer the VTID if present
  @VTID(61)
  int getRuledDevelopableSurfaceConnection(
    int iBlendLimit);


  /**
   * @param iBlendLimit Mandatory int parameter.
   * @param iBlendConnection Mandatory int parameter.
   */

  @DISPID(1611005989) //= 0x60060025. The runtime will prefer the VTID if present
  @VTID(62)
  void setRuledDevelopableSurfaceConnection(
    int iBlendLimit,
    int iBlendConnection);


  /**
   * @param iAngle Mandatory double parameter.
   */

  @DISPID(1611005990) //= 0x60060026. The runtime will prefer the VTID if present
  @VTID(63)
  void setSmoothAngleThreshold(
    double iAngle);


  /**
   * @param iLength Mandatory double parameter.
   */

  @DISPID(1611005991) //= 0x60060027. The runtime will prefer the VTID if present
  @VTID(64)
  void setSmoothDeviation(
    double iLength);


  // Properties:
}
