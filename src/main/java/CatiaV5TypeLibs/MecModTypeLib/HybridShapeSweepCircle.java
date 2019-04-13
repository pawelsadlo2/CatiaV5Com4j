import CatiaV5TypeLibs.InfTypeLib.*;
import com4j.*;

@IID("{8D01DE2F-4D15-0000-0280-020E60000000}")
public interface HybridShapeSweepCircle extends HybridShapeSweep {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "FirstGuideCrv"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611071488) //= 0x60070000. The runtime will prefer the VTID if present
  @VTID(37)
  Reference firstGuideCrv();


  /**
   * <p>
   * Setter method for the COM property "FirstGuideCrv"
   * </p>
   * @param elem Mandatory Reference parameter.
   */

  @DISPID(1611071488) //= 0x60070000. The runtime will prefer the VTID if present
  @VTID(38)
  void firstGuideCrv(
    Reference elem);


  /**
   * <p>
   * Getter method for the COM property "SecondGuideCrv"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611071490) //= 0x60070002. The runtime will prefer the VTID if present
  @VTID(39)
  Reference secondGuideCrv();


  /**
   * <p>
   * Setter method for the COM property "SecondGuideCrv"
   * </p>
   * @param elem Mandatory Reference parameter.
   */

  @DISPID(1611071490) //= 0x60070002. The runtime will prefer the VTID if present
  @VTID(40)
  void secondGuideCrv(
    Reference elem);


  /**
   * <p>
   * Getter method for the COM property "ThirdGuideCrv"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611071492) //= 0x60070004. The runtime will prefer the VTID if present
  @VTID(41)
  Reference thirdGuideCrv();


  /**
   * <p>
   * Setter method for the COM property "ThirdGuideCrv"
   * </p>
   * @param elem Mandatory Reference parameter.
   */

  @DISPID(1611071492) //= 0x60070004. The runtime will prefer the VTID if present
  @VTID(42)
  void thirdGuideCrv(
    Reference elem);


  /**
   * <p>
   * Getter method for the COM property "Spine"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611071494) //= 0x60070006. The runtime will prefer the VTID if present
  @VTID(43)
  Reference spine();


  /**
   * <p>
   * Setter method for the COM property "Spine"
   * </p>
   * @param elem Mandatory Reference parameter.
   */

  @DISPID(1611071494) //= 0x60070006. The runtime will prefer the VTID if present
  @VTID(44)
  void spine(
    Reference elem);


  /**
   * <p>
   * Getter method for the COM property "Mode"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611071496) //= 0x60070008. The runtime will prefer the VTID if present
  @VTID(45)
  int mode();


  /**
   * <p>
   * Setter method for the COM property "Mode"
   * </p>
   * @param elem Mandatory int parameter.
   */

  @DISPID(1611071496) //= 0x60070008. The runtime will prefer the VTID if present
  @VTID(46)
  void mode(
    int elem);


  /**
   * <p>
   * Getter method for the COM property "ChoiceNo"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611071498) //= 0x6007000a. The runtime will prefer the VTID if present
  @VTID(47)
  int choiceNo();


  /**
   * <p>
   * Setter method for the COM property "ChoiceNo"
   * </p>
   * @param elem Mandatory int parameter.
   */

  @DISPID(1611071498) //= 0x6007000a. The runtime will prefer the VTID if present
  @VTID(48)
  void choiceNo(
    int elem);


  /**
   * <p>
   * Getter method for the COM property "Reference"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611071500) //= 0x6007000c. The runtime will prefer the VTID if present
  @VTID(49)
  Reference reference();


  /**
   * <p>
   * Setter method for the COM property "Reference"
   * </p>
   * @param elem Mandatory Reference parameter.
   */

  @DISPID(1611071500) //= 0x6007000c. The runtime will prefer the VTID if present
  @VTID(50)
  void reference(
    Reference elem);


  /**
   * @param ii Mandatory int parameter.
   * @return  Returns a value of type Angle
   */

  @DISPID(1611071502) //= 0x6007000e. The runtime will prefer the VTID if present
  @VTID(51)
  Angle getAngle(
    int ii);


  /**
   * @param ii Mandatory int parameter.
   * @param iElem Mandatory double parameter.
   */

  @DISPID(1611071503) //= 0x6007000f. The runtime will prefer the VTID if present
  @VTID(52)
  void setAngle(
    int ii,
    double iElem);


  /**
   * <p>
   * Getter method for the COM property "FirstAngleLaw"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611071504) //= 0x60070010. The runtime will prefer the VTID if present
  @VTID(53)
  Reference firstAngleLaw();


  /**
   * <p>
   * Setter method for the COM property "FirstAngleLaw"
   * </p>
   * @param oElem Mandatory Reference parameter.
   */

  @DISPID(1611071504) //= 0x60070010. The runtime will prefer the VTID if present
  @VTID(54)
  void firstAngleLaw(
    Reference oElem);


  /**
   * @param oElem1 Mandatory Holder<Angle> parameter.
   * @param oElem2 Mandatory Holder<Angle> parameter.
   * @param olLawType Mandatory Holder<Integer> parameter.
   */

  @DISPID(1611071506) //= 0x60070012. The runtime will prefer the VTID if present
  @VTID(55)
  void getFirstAngleLaw(
    Holder<Angle> oElem1,
    Holder<Angle> oElem2,
    Holder<Integer> olLawType);


  /**
   * @param iElem1 Mandatory double parameter.
   * @param iElem2 Mandatory double parameter.
   * @param ilLawType Mandatory int parameter.
   */

  @DISPID(1611071507) //= 0x60070013. The runtime will prefer the VTID if present
  @VTID(56)
  void setFirstAngleLaw(
    double iElem1,
    double iElem2,
    int ilLawType);


  /**
   * <p>
   * Getter method for the COM property "FirstAngleLawInversion"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611071508) //= 0x60070014. The runtime will prefer the VTID if present
  @VTID(57)
  int firstAngleLawInversion();


  /**
   * <p>
   * Setter method for the COM property "FirstAngleLawInversion"
   * </p>
   * @param oElem Mandatory int parameter.
   */

  @DISPID(1611071508) //= 0x60070014. The runtime will prefer the VTID if present
  @VTID(58)
  void firstAngleLawInversion(
    int oElem);


  /**
   * <p>
   * Getter method for the COM property "SecondAngleLaw"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611071510) //= 0x60070016. The runtime will prefer the VTID if present
  @VTID(59)
  Reference secondAngleLaw();


  /**
   * <p>
   * Setter method for the COM property "SecondAngleLaw"
   * </p>
   * @param oElem Mandatory Reference parameter.
   */

  @DISPID(1611071510) //= 0x60070016. The runtime will prefer the VTID if present
  @VTID(60)
  void secondAngleLaw(
    Reference oElem);


  /**
   * @param oElem1 Mandatory Holder<Angle> parameter.
   * @param oElem2 Mandatory Holder<Angle> parameter.
   * @param olLawType Mandatory Holder<Integer> parameter.
   */

  @DISPID(1611071512) //= 0x60070018. The runtime will prefer the VTID if present
  @VTID(61)
  void getSecondAngleLaw(
    Holder<Angle> oElem1,
    Holder<Angle> oElem2,
    Holder<Integer> olLawType);


  /**
   * @param iElem1 Mandatory double parameter.
   * @param iElem2 Mandatory double parameter.
   * @param ilLawType Mandatory int parameter.
   */

  @DISPID(1611071513) //= 0x60070019. The runtime will prefer the VTID if present
  @VTID(62)
  void setSecondAngleLaw(
    double iElem1,
    double iElem2,
    int ilLawType);


  /**
   * <p>
   * Getter method for the COM property "SecondAngleLawInversion"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611071514) //= 0x6007001a. The runtime will prefer the VTID if present
  @VTID(63)
  int secondAngleLawInversion();


  /**
   * <p>
   * Setter method for the COM property "SecondAngleLawInversion"
   * </p>
   * @param oElem Mandatory int parameter.
   */

  @DISPID(1611071514) //= 0x6007001a. The runtime will prefer the VTID if present
  @VTID(64)
  void secondAngleLawInversion(
    int oElem);


  /**
   * @param ii Mandatory int parameter.
   * @return  Returns a value of type Length
   */

  @DISPID(1611071516) //= 0x6007001c. The runtime will prefer the VTID if present
  @VTID(65)
  Length getRadius(
    int ii);


  /**
   * @param ii Mandatory int parameter.
   * @param iRadius Mandatory double parameter.
   */

  @DISPID(1611071517) //= 0x6007001d. The runtime will prefer the VTID if present
  @VTID(66)
  void setRadius(
    int ii,
    double iRadius);


  /**
   * <p>
   * Getter method for the COM property "RadiusLawType"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611071518) //= 0x6007001e. The runtime will prefer the VTID if present
  @VTID(67)
  int radiusLawType();


  /**
   * <p>
   * Setter method for the COM property "RadiusLawType"
   * </p>
   * @param oElem Mandatory int parameter.
   */

  @DISPID(1611071518) //= 0x6007001e. The runtime will prefer the VTID if present
  @VTID(68)
  void radiusLawType(
    int oElem);


  /**
   * <p>
   * Getter method for the COM property "RadiusLawInversion"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611071520) //= 0x60070020. The runtime will prefer the VTID if present
  @VTID(69)
  int radiusLawInversion();


  /**
   * <p>
   * Setter method for the COM property "RadiusLawInversion"
   * </p>
   * @param oElem Mandatory int parameter.
   */

  @DISPID(1611071520) //= 0x60070020. The runtime will prefer the VTID if present
  @VTID(70)
  void radiusLawInversion(
    int oElem);


  /**
   * <p>
   * Getter method for the COM property "RadiusLaw"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611071522) //= 0x60070022. The runtime will prefer the VTID if present
  @VTID(71)
  Reference radiusLaw();


  /**
   * <p>
   * Setter method for the COM property "RadiusLaw"
   * </p>
   * @param oElem Mandatory Reference parameter.
   */

  @DISPID(1611071522) //= 0x60070022. The runtime will prefer the VTID if present
  @VTID(72)
  void radiusLaw(
    Reference oElem);


  /**
   * <p>
   * Getter method for the COM property "TrimOption"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611071524) //= 0x60070024. The runtime will prefer the VTID if present
  @VTID(73)
  int trimOption();


  /**
   * <p>
   * Setter method for the COM property "TrimOption"
   * </p>
   * @param elem Mandatory int parameter.
   */

  @DISPID(1611071524) //= 0x60070024. The runtime will prefer the VTID if present
  @VTID(74)
  void trimOption(
    int elem);


  /**
   * <p>
   * Getter method for the COM property "SmoothActivity"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1611071526) //= 0x60070026. The runtime will prefer the VTID if present
  @VTID(75)
  boolean smoothActivity();


  /**
   * <p>
   * Setter method for the COM property "SmoothActivity"
   * </p>
   * @param oSmooth Mandatory boolean parameter.
   */

  @DISPID(1611071526) //= 0x60070026. The runtime will prefer the VTID if present
  @VTID(76)
  void smoothActivity(
    boolean oSmooth);


  /**
   * <p>
   * Getter method for the COM property "SmoothAngleThreshold"
   * </p>
   * @return  Returns a value of type Angle
   */

  @DISPID(1611071528) //= 0x60070028. The runtime will prefer the VTID if present
  @VTID(77)
  Angle smoothAngleThreshold();


  /**
   * <p>
   * Getter method for the COM property "GuideDeviationActivity"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1611071529) //= 0x60070029. The runtime will prefer the VTID if present
  @VTID(78)
  boolean guideDeviationActivity();


  /**
   * <p>
   * Setter method for the COM property "GuideDeviationActivity"
   * </p>
   * @param oActivity Mandatory boolean parameter.
   */

  @DISPID(1611071529) //= 0x60070029. The runtime will prefer the VTID if present
  @VTID(79)
  void guideDeviationActivity(
    boolean oActivity);


  /**
   * <p>
   * Getter method for the COM property "GuideDeviation"
   * </p>
   * @return  Returns a value of type Length
   */

  @DISPID(1611071531) //= 0x6007002b. The runtime will prefer the VTID if present
  @VTID(80)
  Length guideDeviation();


  /**
   * @param iAngle Mandatory double parameter.
   */

  @DISPID(1611071532) //= 0x6007002c. The runtime will prefer the VTID if present
  @VTID(81)
  void setSmoothAngleThreshold(
    double iAngle);


  /**
   * @param iLength Mandatory double parameter.
   */

  @DISPID(1611071533) //= 0x6007002d. The runtime will prefer the VTID if present
  @VTID(82)
  void setGuideDeviation(
    double iLength);


  /**
   * @return  Returns a value of type int
   */

  @DISPID(1611071534) //= 0x6007002e. The runtime will prefer the VTID if present
  @VTID(83)
  int getNbGuide();


  /**
   */

  @DISPID(1611071535) //= 0x6007002f. The runtime will prefer the VTID if present
  @VTID(84)
  void removeGuide();


  /**
   * @param opIAElem1 Mandatory Holder<Reference> parameter.
   * @param opIAElem2 Mandatory Holder<Reference> parameter.
   */

  @DISPID(1611071536) //= 0x60070030. The runtime will prefer the VTID if present
  @VTID(85)
  void getLongitudinalRelimiters(
    Holder<Reference> opIAElem1,
    Holder<Reference> opIAElem2);


  /**
   * @param ipIAElem1 Mandatory Reference parameter.
   * @param ipIAElem2 Mandatory Reference parameter.
   */

  @DISPID(1611071537) //= 0x60070031. The runtime will prefer the VTID if present
  @VTID(86)
  void setLongitudinalRelimiters(
    Reference ipIAElem1,
    Reference ipIAElem2);


  /**
   * @param opIAElem1 Mandatory Holder<Reference> parameter.
   * @param opOrient1 Mandatory Holder<Integer> parameter.
   * @param opIAElem2 Mandatory Holder<Reference> parameter.
   * @param opOrient2 Mandatory Holder<Integer> parameter.
   */

  @DISPID(1611071538) //= 0x60070032. The runtime will prefer the VTID if present
  @VTID(87)
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

  @DISPID(1611071539) //= 0x60070033. The runtime will prefer the VTID if present
  @VTID(88)
  void setRelimiters(
    Reference ipIAElem1,
    int ipOrient1,
    Reference ipIAElem2,
    int ipOrient2);


  /**
   * @param oNo Mandatory Holder<Integer> parameter.
   * @param oShellOri Mandatory Holder<Integer> parameter.
   * @param oGuideOri Mandatory Holder<Integer> parameter.
   */

  @DISPID(1611071540) //= 0x60070034. The runtime will prefer the VTID if present
  @VTID(89)
  void getTangencyChoiceNo(
    Holder<Integer> oNo,
    Holder<Integer> oShellOri,
    Holder<Integer> oGuideOri);


  /**
   * @param iShellOri Mandatory int parameter.
   * @param iGuideOri Mandatory int parameter.
   * @param iNo Mandatory int parameter.
   */

  @DISPID(1611071541) //= 0x60070035. The runtime will prefer the VTID if present
  @VTID(90)
  void setTangencyChoiceNo(
    int iShellOri,
    int iGuideOri,
    int iNo);


  /**
   * @return  Returns a value of type int
   */

  @DISPID(1611071542) //= 0x60070036. The runtime will prefer the VTID if present
  @VTID(91)
  int getNbRadius();


  /**
   */

  @DISPID(1611071543) //= 0x60070037. The runtime will prefer the VTID if present
  @VTID(92)
  void removeRadius();


  /**
   * @return  Returns a value of type int
   */

  @DISPID(1611071544) //= 0x60070038. The runtime will prefer the VTID if present
  @VTID(93)
  int getNbAngle();


  /**
   */

  @DISPID(1611071545) //= 0x60070039. The runtime will prefer the VTID if present
  @VTID(94)
  void removeAngle();


  /**
   * @param oFirstType Mandatory Holder<Integer> parameter.
   * @param oSecondType Mandatory Holder<Integer> parameter.
   */

  @DISPID(1611071546) //= 0x6007003a. The runtime will prefer the VTID if present
  @VTID(95)
  void getAngleLawTypes(
    Holder<Integer> oFirstType,
    Holder<Integer> oSecondType);


  /**
   * @param iFirstType Mandatory int parameter.
   * @param iSecondType Mandatory int parameter.
   */

  @DISPID(1611071547) //= 0x6007003b. The runtime will prefer the VTID if present
  @VTID(96)
  void setAngleLawTypes(
    int iFirstType,
    int iSecondType);


  /**
   * <p>
   * Getter method for the COM property "Context"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611071548) //= 0x6007003c. The runtime will prefer the VTID if present
  @VTID(97)
  int context();


  /**
   * <p>
   * Setter method for the COM property "Context"
   * </p>
   * @param oContext Mandatory int parameter.
   */

  @DISPID(1611071548) //= 0x6007003c. The runtime will prefer the VTID if present
  @VTID(98)
  void context(
    int oContext);


  /**
   * <p>
   * Getter method for the COM property "CanonicalDetection"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611071550) //= 0x6007003e. The runtime will prefer the VTID if present
  @VTID(99)
  int canonicalDetection();


  /**
   * <p>
   * Setter method for the COM property "CanonicalDetection"
   * </p>
   * @param oDetection Mandatory int parameter.
   */

  @DISPID(1611071550) //= 0x6007003e. The runtime will prefer the VTID if present
  @VTID(100)
  void canonicalDetection(
    int oDetection);


  // Properties:
}
