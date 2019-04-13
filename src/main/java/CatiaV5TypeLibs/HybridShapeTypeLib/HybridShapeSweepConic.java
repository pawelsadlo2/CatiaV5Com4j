package CatiaV5TypeLibs.HybridShapeTypeLib;
import CatiaV5TypeLibs.InfTypeLib.*;
import CatiaV5TypeLibs.MecModTypeLib.*;
import CatiaV5TypeLibs.KnowledgewareTypeLib.*;

import com4j.*;

@IID("{993A12E1-C364-0000-0280-020C4E000000}")
public interface HybridShapeSweepConic extends HybridShapeSweep {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Spine"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611071488) //= 0x60070000. The runtime will prefer the VTID if present
  @VTID(37)
  Reference spine();


  /**
   * <p>
   * Setter method for the COM property "Spine"
   * </p>
   * @param elem Mandatory Reference parameter.
   */

  @DISPID(1611071488) //= 0x60070000. The runtime will prefer the VTID if present
  @VTID(38)
  void spine(
    Reference elem);


  /**
   * <p>
   * Getter method for the COM property "FirstGuideCrv"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611071490) //= 0x60070002. The runtime will prefer the VTID if present
  @VTID(39)
  Reference firstGuideCrv();


  /**
   * <p>
   * Setter method for the COM property "FirstGuideCrv"
   * </p>
   * @param opIAElem Mandatory Reference parameter.
   */

  @DISPID(1611071490) //= 0x60070002. The runtime will prefer the VTID if present
  @VTID(40)
  void firstGuideCrv(
    Reference opIAElem);


  /**
   * <p>
   * Getter method for the COM property "SecondGuideCrv"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611071492) //= 0x60070004. The runtime will prefer the VTID if present
  @VTID(41)
  Reference secondGuideCrv();


  /**
   * <p>
   * Setter method for the COM property "SecondGuideCrv"
   * </p>
   * @param opIAElem Mandatory Reference parameter.
   */

  @DISPID(1611071492) //= 0x60070004. The runtime will prefer the VTID if present
  @VTID(42)
  void secondGuideCrv(
    Reference opIAElem);


  /**
   * <p>
   * Getter method for the COM property "ThirdGuideCrv"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611071494) //= 0x60070006. The runtime will prefer the VTID if present
  @VTID(43)
  Reference thirdGuideCrv();


  /**
   * <p>
   * Setter method for the COM property "ThirdGuideCrv"
   * </p>
   * @param opIAElem Mandatory Reference parameter.
   */

  @DISPID(1611071494) //= 0x60070006. The runtime will prefer the VTID if present
  @VTID(44)
  void thirdGuideCrv(
    Reference opIAElem);


  /**
   * <p>
   * Getter method for the COM property "FourthGuideCrv"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611071496) //= 0x60070008. The runtime will prefer the VTID if present
  @VTID(45)
  Reference fourthGuideCrv();


  /**
   * <p>
   * Setter method for the COM property "FourthGuideCrv"
   * </p>
   * @param opIAElem Mandatory Reference parameter.
   */

  @DISPID(1611071496) //= 0x60070008. The runtime will prefer the VTID if present
  @VTID(46)
  void fourthGuideCrv(
    Reference opIAElem);


  /**
   * <p>
   * Getter method for the COM property "FifthGuideCrv"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611071498) //= 0x6007000a. The runtime will prefer the VTID if present
  @VTID(47)
  Reference fifthGuideCrv();


  /**
   * <p>
   * Setter method for the COM property "FifthGuideCrv"
   * </p>
   * @param opIAElem Mandatory Reference parameter.
   */

  @DISPID(1611071498) //= 0x6007000a. The runtime will prefer the VTID if present
  @VTID(48)
  void fifthGuideCrv(
    Reference opIAElem);


  /**
   * <p>
   * Getter method for the COM property "Parameter"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(1611071500) //= 0x6007000c. The runtime will prefer the VTID if present
  @VTID(49)
  double parameter();


  /**
   * <p>
   * Setter method for the COM property "Parameter"
   * </p>
   * @param oValue Mandatory double parameter.
   */

  @DISPID(1611071500) //= 0x6007000c. The runtime will prefer the VTID if present
  @VTID(50)
  void parameter(
    double oValue);


  /**
   * <p>
   * Getter method for the COM property "ParameterLawInversion"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1611071502) //= 0x6007000e. The runtime will prefer the VTID if present
  @VTID(51)
  boolean parameterLawInversion();


  /**
   * <p>
   * Setter method for the COM property "ParameterLawInversion"
   * </p>
   * @param oInversion Mandatory boolean parameter.
   */

  @DISPID(1611071502) //= 0x6007000e. The runtime will prefer the VTID if present
  @VTID(52)
  void parameterLawInversion(
    boolean oInversion);


  /**
   * <p>
   * Getter method for the COM property "ParameterLaw"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611071504) //= 0x60070010. The runtime will prefer the VTID if present
  @VTID(53)
  Reference parameterLaw();


  /**
   * <p>
   * Setter method for the COM property "ParameterLaw"
   * </p>
   * @param opIAElem Mandatory Reference parameter.
   */

  @DISPID(1611071504) //= 0x60070010. The runtime will prefer the VTID if present
  @VTID(54)
  void parameterLaw(
    Reference opIAElem);


  /**
   * <p>
   * Getter method for the COM property "ParameterLawType"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611071506) //= 0x60070012. The runtime will prefer the VTID if present
  @VTID(55)
  int parameterLawType();


  /**
   * <p>
   * Setter method for the COM property "ParameterLawType"
   * </p>
   * @param oLawType Mandatory int parameter.
   */

  @DISPID(1611071506) //= 0x60070012. The runtime will prefer the VTID if present
  @VTID(56)
  void parameterLawType(
    int oLawType);


  /**
   * <p>
   * Getter method for the COM property "SmoothActivity"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1611071508) //= 0x60070014. The runtime will prefer the VTID if present
  @VTID(57)
  boolean smoothActivity();


  /**
   * <p>
   * Setter method for the COM property "SmoothActivity"
   * </p>
   * @param oSmooth Mandatory boolean parameter.
   */

  @DISPID(1611071508) //= 0x60070014. The runtime will prefer the VTID if present
  @VTID(58)
  void smoothActivity(
    boolean oSmooth);


  /**
   * <p>
   * Getter method for the COM property "SmoothAngleThreshold"
   * </p>
   * @return  Returns a value of type Angle
   */

  @DISPID(1611071510) //= 0x60070016. The runtime will prefer the VTID if present
  @VTID(59)
  Angle smoothAngleThreshold();


  /**
   * <p>
   * Getter method for the COM property "GuideDeviationActivity"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1611071511) //= 0x60070017. The runtime will prefer the VTID if present
  @VTID(60)
  boolean guideDeviationActivity();


  /**
   * <p>
   * Setter method for the COM property "GuideDeviationActivity"
   * </p>
   * @param oActivity Mandatory boolean parameter.
   */

  @DISPID(1611071511) //= 0x60070017. The runtime will prefer the VTID if present
  @VTID(61)
  void guideDeviationActivity(
    boolean oActivity);


  /**
   * <p>
   * Getter method for the COM property "GuideDeviation"
   * </p>
   * @return  Returns a value of type Length
   */

  @DISPID(1611071513) //= 0x60070019. The runtime will prefer the VTID if present
  @VTID(62)
  Length guideDeviation();


  /**
   * @param opIAElem Mandatory Holder<Reference> parameter.
   * @param opIAAngleStart Mandatory Holder<Angle> parameter.
   * @param opIAAngleEnd Mandatory Holder<Angle> parameter.
   * @param oLawType Mandatory Holder<Integer> parameter.
   * @param iIndex Mandatory int parameter.
   */

  @DISPID(1611071514) //= 0x6007001a. The runtime will prefer the VTID if present
  @VTID(63)
  void getTangency(
    Holder<Reference> opIAElem,
    Holder<Angle> opIAAngleStart,
    Holder<Angle> opIAAngleEnd,
    Holder<Integer> oLawType,
    int iIndex);


  /**
   * @param ipIAElem Mandatory Reference parameter.
   * @param iAngleStart Mandatory double parameter.
   * @param iAngleEnd Mandatory double parameter.
   * @param iLawType Mandatory int parameter.
   * @param iIndex Mandatory int parameter.
   */

  @DISPID(1611071515) //= 0x6007001b. The runtime will prefer the VTID if present
  @VTID(64)
  void setTangency(
    Reference ipIAElem,
    double iAngleStart,
    double iAngleEnd,
    int iLawType,
    int iIndex);


  /**
   * @param opIAElem Mandatory Holder<Reference> parameter.
   * @param opIALaw Mandatory Holder<Reference> parameter.
   * @param iIndex Mandatory int parameter.
   */

  @DISPID(1611071516) //= 0x6007001c. The runtime will prefer the VTID if present
  @VTID(65)
  void getTangencyLaw(
    Holder<Reference> opIAElem,
    Holder<Reference> opIALaw,
    int iIndex);


  /**
   * @param ipIAElem Mandatory Reference parameter.
   * @param ipIALaw Mandatory Reference parameter.
   * @param iIndex Mandatory int parameter.
   */

  @DISPID(1611071517) //= 0x6007001d. The runtime will prefer the VTID if present
  @VTID(66)
  void setTangencyLaw(
    Reference ipIAElem,
    Reference ipIALaw,
    int iIndex);


  /**
   * @param iIndex Mandatory int parameter.
   * @return  Returns a value of type int
   */

  @DISPID(1611071518) //= 0x6007001e. The runtime will prefer the VTID if present
  @VTID(67)
  int getTangencyAngleLawInversion(
    int iIndex);


  /**
   * @param iIndex Mandatory int parameter.
   * @param iInversion Mandatory int parameter.
   */

  @DISPID(1611071519) //= 0x6007001f. The runtime will prefer the VTID if present
  @VTID(68)
  void setTangencyAngleLawInversion(
    int iIndex,
    int iInversion);


  /**
   * @param oParamStart Mandatory Holder<Double> parameter.
   * @param oParamEnd Mandatory Holder<Double> parameter.
   * @param oLawType Mandatory Holder<Integer> parameter.
   */

  @DISPID(1611071520) //= 0x60070020. The runtime will prefer the VTID if present
  @VTID(69)
  void getParameterLaw(
    Holder<Double> oParamStart,
    Holder<Double> oParamEnd,
    Holder<Integer> oLawType);


  /**
   * @param iParamStart Mandatory double parameter.
   * @param iParamEnd Mandatory double parameter.
   * @param iLawType Mandatory int parameter.
   */

  @DISPID(1611071521) //= 0x60070021. The runtime will prefer the VTID if present
  @VTID(70)
  void setParameterLaw(
    double iParamStart,
    double iParamEnd,
    int iLawType);


  /**
   * @param iIndex Mandatory int parameter.
   */

  @DISPID(1611071522) //= 0x60070022. The runtime will prefer the VTID if present
  @VTID(71)
  void removeGuide(
    int iIndex);


  /**
   * @return  Returns a value of type int
   */

  @DISPID(1611071523) //= 0x60070023. The runtime will prefer the VTID if present
  @VTID(72)
  int getNbGuides();


  /**
   * @param iIndex Mandatory int parameter.
   */

  @DISPID(1611071524) //= 0x60070024. The runtime will prefer the VTID if present
  @VTID(73)
  void removeTangency(
    int iIndex);


  /**
   * @param opIAElem1 Mandatory Holder<Reference> parameter.
   * @param opIAElem2 Mandatory Holder<Reference> parameter.
   */

  @DISPID(1611071525) //= 0x60070025. The runtime will prefer the VTID if present
  @VTID(74)
  void getLongitudinalRelimiters(
    Holder<Reference> opIAElem1,
    Holder<Reference> opIAElem2);


  /**
   * @param ipIAElem1 Mandatory Reference parameter.
   * @param ipIAElem2 Mandatory Reference parameter.
   */

  @DISPID(1611071526) //= 0x60070026. The runtime will prefer the VTID if present
  @VTID(75)
  void setLongitudinalRelimiters(
    Reference ipIAElem1,
    Reference ipIAElem2);


  /**
   * @param opIAElem1 Mandatory Holder<Reference> parameter.
   * @param opOrient1 Mandatory Holder<Integer> parameter.
   * @param opIAElem2 Mandatory Holder<Reference> parameter.
   * @param opOrient2 Mandatory Holder<Integer> parameter.
   */

  @DISPID(1611071527) //= 0x60070027. The runtime will prefer the VTID if present
  @VTID(76)
  void getRelimiters(
    Holder<Reference> opIAElem1,
    Holder<Integer> opOrient1,
    Holder<Reference> opIAElem2,
    Holder<Integer> opOrient2);


  /**
   * @param ipIAElem1 Mandatory Reference parameter.
   * @param ipOrient1 Mandatory int parameter.
   * @param ipIAElem2 Mandatory Reference parameter.
   * @param ipOrient2 Mandatory int parameter.
   */

  @DISPID(1611071528) //= 0x60070028. The runtime will prefer the VTID if present
  @VTID(77)
  void setRelimiters(
    Reference ipIAElem1,
    int ipOrient1,
    Reference ipIAElem2,
    int ipOrient2);


  /**
   * @param iAngle Mandatory double parameter.
   */

  @DISPID(1611071529) //= 0x60070029. The runtime will prefer the VTID if present
  @VTID(78)
  void setSmoothAngleThreshold(
    double iAngle);


  /**
   * @param iLength Mandatory double parameter.
   */

  @DISPID(1611071530) //= 0x6007002a. The runtime will prefer the VTID if present
  @VTID(79)
  void setGuideDeviation(
    double iLength);


  /**
   */

  @DISPID(1611071531) //= 0x6007002b. The runtime will prefer the VTID if present
  @VTID(80)
  void removeParameter();


  /**
   * <p>
   * Getter method for the COM property "CanonicalDetection"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611071532) //= 0x6007002c. The runtime will prefer the VTID if present
  @VTID(81)
  int canonicalDetection();


  /**
   * <p>
   * Setter method for the COM property "CanonicalDetection"
   * </p>
   * @param oDetection Mandatory int parameter.
   */

  @DISPID(1611071532) //= 0x6007002c. The runtime will prefer the VTID if present
  @VTID(82)
  void canonicalDetection(
    int oDetection);


  // Properties:
}
