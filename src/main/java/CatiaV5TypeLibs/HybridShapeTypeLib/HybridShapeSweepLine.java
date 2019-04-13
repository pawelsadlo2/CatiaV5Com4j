package CatiaV5TypeLibs.HybridShapeTypeLib;
import CatiaV5TypeLibs.InfTypeLib.*;
import CatiaV5TypeLibs.MecModTypeLib.*;
import CatiaV5TypeLibs.KnowledgewareTypeLib.*;

import com4j.*;

@IID("{8D01DA12-6566-0000-0280-020E60000000}")
public interface HybridShapeSweepLine extends HybridShapeSweep {
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
   * Getter method for the COM property "FirstGuideSurf"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611071492) //= 0x60070004. The runtime will prefer the VTID if present
  @VTID(41)
  Reference firstGuideSurf();


  /**
   * <p>
   * Setter method for the COM property "FirstGuideSurf"
   * </p>
   * @param elem Mandatory Reference parameter.
   */

  @DISPID(1611071492) //= 0x60070004. The runtime will prefer the VTID if present
  @VTID(42)
  void firstGuideSurf(
    Reference elem);


  /**
   * <p>
   * Getter method for the COM property "SecondGuideSurf"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611071494) //= 0x60070006. The runtime will prefer the VTID if present
  @VTID(43)
  Reference secondGuideSurf();


  /**
   * <p>
   * Setter method for the COM property "SecondGuideSurf"
   * </p>
   * @param elem Mandatory Reference parameter.
   */

  @DISPID(1611071494) //= 0x60070006. The runtime will prefer the VTID if present
  @VTID(44)
  void secondGuideSurf(
    Reference elem);


  /**
   * <p>
   * Getter method for the COM property "Spine"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611071496) //= 0x60070008. The runtime will prefer the VTID if present
  @VTID(45)
  Reference spine();


  /**
   * <p>
   * Setter method for the COM property "Spine"
   * </p>
   * @param elem Mandatory Reference parameter.
   */

  @DISPID(1611071496) //= 0x60070008. The runtime will prefer the VTID if present
  @VTID(46)
  void spine(
    Reference elem);


  /**
   * <p>
   * Getter method for the COM property "Mode"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611071498) //= 0x6007000a. The runtime will prefer the VTID if present
  @VTID(47)
  int mode();


  /**
   * <p>
   * Setter method for the COM property "Mode"
   * </p>
   * @param elem Mandatory int parameter.
   */

  @DISPID(1611071498) //= 0x6007000a. The runtime will prefer the VTID if present
  @VTID(48)
  void mode(
    int elem);


  /**
   * @param ii Mandatory int parameter.
   * @return  Returns a value of type Angle
   */

  @DISPID(1611071500) //= 0x6007000c. The runtime will prefer the VTID if present
  @VTID(49)
  Angle getAngle(
    int ii);


  /**
   * @param ii Mandatory int parameter.
   * @param iElem Mandatory double parameter.
   */

  @DISPID(1611071501) //= 0x6007000d. The runtime will prefer the VTID if present
  @VTID(50)
  void setAngle(
    int ii,
    double iElem);


  /**
   * <p>
   * Getter method for the COM property "AngleLawType"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611071502) //= 0x6007000e. The runtime will prefer the VTID if present
  @VTID(51)
  int angleLawType();


  /**
   * <p>
   * Setter method for the COM property "AngleLawType"
   * </p>
   * @param oElem Mandatory int parameter.
   */

  @DISPID(1611071502) //= 0x6007000e. The runtime will prefer the VTID if present
  @VTID(52)
  void angleLawType(
    int oElem);


  /**
   * <p>
   * Getter method for the COM property "AngleLawInversion"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611071504) //= 0x60070010. The runtime will prefer the VTID if present
  @VTID(53)
  int angleLawInversion();


  /**
   * <p>
   * Setter method for the COM property "AngleLawInversion"
   * </p>
   * @param oElem Mandatory int parameter.
   */

  @DISPID(1611071504) //= 0x60070010. The runtime will prefer the VTID if present
  @VTID(54)
  void angleLawInversion(
    int oElem);


  /**
   * <p>
   * Getter method for the COM property "AngleLaw"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611071506) //= 0x60070012. The runtime will prefer the VTID if present
  @VTID(55)
  Reference angleLaw();


  /**
   * <p>
   * Setter method for the COM property "AngleLaw"
   * </p>
   * @param oElem Mandatory Reference parameter.
   */

  @DISPID(1611071506) //= 0x60070012. The runtime will prefer the VTID if present
  @VTID(56)
  void angleLaw(
    Reference oElem);


  /**
   * @param ii Mandatory int parameter.
   * @return  Returns a value of type Length
   */

  @DISPID(1611071508) //= 0x60070014. The runtime will prefer the VTID if present
  @VTID(57)
  Length getLength(
    int ii);


  /**
   * @param ii Mandatory int parameter.
   * @param iElem Mandatory double parameter.
   */

  @DISPID(1611071509) //= 0x60070015. The runtime will prefer the VTID if present
  @VTID(58)
  void setLength(
    int ii,
    double iElem);


  /**
   * <p>
   * Getter method for the COM property "FirstLengthLaw"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611071510) //= 0x60070016. The runtime will prefer the VTID if present
  @VTID(59)
  Reference firstLengthLaw();


  /**
   * <p>
   * Setter method for the COM property "FirstLengthLaw"
   * </p>
   * @param oElem Mandatory Reference parameter.
   */

  @DISPID(1611071510) //= 0x60070016. The runtime will prefer the VTID if present
  @VTID(60)
  void firstLengthLaw(
    Reference oElem);


  /**
   * @param oLength1 Mandatory Holder<Length> parameter.
   * @param oLength2 Mandatory Holder<Length> parameter.
   * @param oLawType Mandatory Holder<Integer> parameter.
   */

  @DISPID(1611071512) //= 0x60070018. The runtime will prefer the VTID if present
  @VTID(61)
  void getFirstLengthLaw(
    Holder<Length> oLength1,
    Holder<Length> oLength2,
    Holder<Integer> oLawType);


  /**
   * @param iLength1 Mandatory double parameter.
   * @param iLength2 Mandatory double parameter.
   * @param iLawType Mandatory int parameter.
   */

  @DISPID(1611071513) //= 0x60070019. The runtime will prefer the VTID if present
  @VTID(62)
  void setFirstLengthLaw(
    double iLength1,
    double iLength2,
    int iLawType);


  /**
   * <p>
   * Getter method for the COM property "FirstLengthLawInversion"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611071514) //= 0x6007001a. The runtime will prefer the VTID if present
  @VTID(63)
  int firstLengthLawInversion();


  /**
   * <p>
   * Setter method for the COM property "FirstLengthLawInversion"
   * </p>
   * @param oElem Mandatory int parameter.
   */

  @DISPID(1611071514) //= 0x6007001a. The runtime will prefer the VTID if present
  @VTID(64)
  void firstLengthLawInversion(
    int oElem);


  /**
   * <p>
   * Getter method for the COM property "SecondLengthLaw"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611071516) //= 0x6007001c. The runtime will prefer the VTID if present
  @VTID(65)
  Reference secondLengthLaw();


  /**
   * <p>
   * Setter method for the COM property "SecondLengthLaw"
   * </p>
   * @param oElem Mandatory Reference parameter.
   */

  @DISPID(1611071516) //= 0x6007001c. The runtime will prefer the VTID if present
  @VTID(66)
  void secondLengthLaw(
    Reference oElem);


  /**
   * @param oLength1 Mandatory Holder<Length> parameter.
   * @param oLength2 Mandatory Holder<Length> parameter.
   * @param oLawType Mandatory Holder<Integer> parameter.
   */

  @DISPID(1611071518) //= 0x6007001e. The runtime will prefer the VTID if present
  @VTID(67)
  void getSecondLengthLaw(
    Holder<Length> oLength1,
    Holder<Length> oLength2,
    Holder<Integer> oLawType);


  /**
   * @param iLength1 Mandatory double parameter.
   * @param iLength2 Mandatory double parameter.
   * @param iLawType Mandatory int parameter.
   */

  @DISPID(1611071519) //= 0x6007001f. The runtime will prefer the VTID if present
  @VTID(68)
  void setSecondLengthLaw(
    double iLength1,
    double iLength2,
    int iLawType);


  /**
   * <p>
   * Getter method for the COM property "SecondLengthLawInversion"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611071520) //= 0x60070020. The runtime will prefer the VTID if present
  @VTID(69)
  int secondLengthLawInversion();


  /**
   * <p>
   * Setter method for the COM property "SecondLengthLawInversion"
   * </p>
   * @param oElem Mandatory int parameter.
   */

  @DISPID(1611071520) //= 0x60070020. The runtime will prefer the VTID if present
  @VTID(70)
  void secondLengthLawInversion(
    int oElem);


  /**
   * @param oVal1 Mandatory Holder<Integer> parameter.
   * @param oVal2 Mandatory Holder<Integer> parameter.
   * @param oVal3 Mandatory Holder<Integer> parameter.
   */

  @DISPID(1611071522) //= 0x60070022. The runtime will prefer the VTID if present
  @VTID(71)
  void getChoiceNo(
    Holder<Integer> oVal1,
    Holder<Integer> oVal2,
    Holder<Integer> oVal3);


  /**
   * @param iVal1 Mandatory int parameter.
   * @param iVal2 Mandatory int parameter.
   * @param iVal3 Mandatory int parameter.
   */

  @DISPID(1611071523) //= 0x60070023. The runtime will prefer the VTID if present
  @VTID(72)
  void setChoiceNo(
    int iVal1,
    int iVal2,
    int iVal3);


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
   * Getter method for the COM property "SecondTrimOption"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611071526) //= 0x60070026. The runtime will prefer the VTID if present
  @VTID(75)
  int secondTrimOption();


  /**
   * <p>
   * Setter method for the COM property "SecondTrimOption"
   * </p>
   * @param elem Mandatory int parameter.
   */

  @DISPID(1611071526) //= 0x60070026. The runtime will prefer the VTID if present
  @VTID(76)
  void secondTrimOption(
    int elem);


  /**
   * <p>
   * Getter method for the COM property "SmoothActivity"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1611071528) //= 0x60070028. The runtime will prefer the VTID if present
  @VTID(77)
  boolean smoothActivity();


  /**
   * <p>
   * Setter method for the COM property "SmoothActivity"
   * </p>
   * @param oSmooth Mandatory boolean parameter.
   */

  @DISPID(1611071528) //= 0x60070028. The runtime will prefer the VTID if present
  @VTID(78)
  void smoothActivity(
    boolean oSmooth);


  /**
   * <p>
   * Getter method for the COM property "SmoothAngleThreshold"
   * </p>
   * @return  Returns a value of type Angle
   */

  @DISPID(1611071530) //= 0x6007002a. The runtime will prefer the VTID if present
  @VTID(79)
  Angle smoothAngleThreshold();


  /**
   * <p>
   * Getter method for the COM property "GuideDeviationActivity"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1611071531) //= 0x6007002b. The runtime will prefer the VTID if present
  @VTID(80)
  boolean guideDeviationActivity();


  /**
   * <p>
   * Setter method for the COM property "GuideDeviationActivity"
   * </p>
   * @param oActivity Mandatory boolean parameter.
   */

  @DISPID(1611071531) //= 0x6007002b. The runtime will prefer the VTID if present
  @VTID(81)
  void guideDeviationActivity(
    boolean oActivity);


  /**
   * <p>
   * Getter method for the COM property "GuideDeviation"
   * </p>
   * @return  Returns a value of type Length
   */

  @DISPID(1611071533) //= 0x6007002d. The runtime will prefer the VTID if present
  @VTID(82)
  Length guideDeviation();


  /**
   * <p>
   * Getter method for the COM property "DraftComputationMode"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611071534) //= 0x6007002e. The runtime will prefer the VTID if present
  @VTID(83)
  int draftComputationMode();


  /**
   * <p>
   * Setter method for the COM property "DraftComputationMode"
   * </p>
   * @param oDraftCompType Mandatory int parameter.
   */

  @DISPID(1611071534) //= 0x6007002e. The runtime will prefer the VTID if present
  @VTID(84)
  void draftComputationMode(
    int oDraftCompType);


  /**
   * <p>
   * Getter method for the COM property "DraftDirection"
   * </p>
   * @return  Returns a value of type HybridShapeDirection
   */

  @DISPID(1611071536) //= 0x60070030. The runtime will prefer the VTID if present
  @VTID(85)
  HybridShapeDirection draftDirection();


  /**
   * <p>
   * Setter method for the COM property "DraftDirection"
   * </p>
   * @param oDir Mandatory HybridShapeDirection parameter.
   */

  @DISPID(1611071536) //= 0x60070030. The runtime will prefer the VTID if present
  @VTID(86)
  void draftDirection(
    HybridShapeDirection oDir);


  /**
   * @return  Returns a value of type int
   */

  @DISPID(1611071538) //= 0x60070032. The runtime will prefer the VTID if present
  @VTID(87)
  int getNbGuideCrv();


  /**
   */

  @DISPID(1611071539) //= 0x60070033. The runtime will prefer the VTID if present
  @VTID(88)
  void removeGuideCrv();


  /**
   * @return  Returns a value of type int
   */

  @DISPID(1611071540) //= 0x60070034. The runtime will prefer the VTID if present
  @VTID(89)
  int getNbGuideSur();


  /**
   */

  @DISPID(1611071541) //= 0x60070035. The runtime will prefer the VTID if present
  @VTID(90)
  void removeGuideSur();


  /**
   * @param opIAElem1 Mandatory Holder<Reference> parameter.
   * @param opIAElem2 Mandatory Holder<Reference> parameter.
   */

  @DISPID(1611071542) //= 0x60070036. The runtime will prefer the VTID if present
  @VTID(91)
  void getLongitudinalRelimiters(
    Holder<Reference> opIAElem1,
    Holder<Reference> opIAElem2);


  /**
   * @param ipIAElem1 Mandatory Reference parameter.
   * @param ipIAElem2 Mandatory Reference parameter.
   */

  @DISPID(1611071543) //= 0x60070037. The runtime will prefer the VTID if present
  @VTID(92)
  void setLongitudinalRelimiters(
    Reference ipIAElem1,
    Reference ipIAElem2);


  /**
   * @param opIAElem1 Mandatory Holder<Reference> parameter.
   * @param opOrient1 Mandatory Holder<Integer> parameter.
   * @param opIAElem2 Mandatory Holder<Reference> parameter.
   * @param opOrient2 Mandatory Holder<Integer> parameter.
   */

  @DISPID(1611071544) //= 0x60070038. The runtime will prefer the VTID if present
  @VTID(93)
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

  @DISPID(1611071545) //= 0x60070039. The runtime will prefer the VTID if present
  @VTID(94)
  void setRelimiters(
    Reference ipIAElem1,
    int ipOrient1,
    Reference ipIAElem2,
    int ipOrient2);


  /**
   * @return  Returns a value of type int
   */

  @DISPID(1611071546) //= 0x6007003a. The runtime will prefer the VTID if present
  @VTID(95)
  int getNbAngle();


  /**
   */

  @DISPID(1611071547) //= 0x6007003b. The runtime will prefer the VTID if present
  @VTID(96)
  void removeAngle();


  /**
   * @param opStartAng Mandatory Holder<Angle> parameter.
   * @param opEndAng Mandatory Holder<Angle> parameter.
   * @param oLawType Mandatory Holder<Integer> parameter.
   */

  @DISPID(1611071548) //= 0x6007003c. The runtime will prefer the VTID if present
  @VTID(97)
  void getAngularLaw(
    Holder<Angle> opStartAng,
    Holder<Angle> opEndAng,
    Holder<Integer> oLawType);


  /**
   * @param iStartAng Mandatory double parameter.
   * @param iEndAng Mandatory double parameter.
   * @param iLawType Mandatory int parameter.
   */

  @DISPID(1611071549) //= 0x6007003d. The runtime will prefer the VTID if present
  @VTID(98)
  void setAngularLaw(
    double iStartAng,
    double iEndAng,
    int iLawType);


  /**
   * @return  Returns a value of type int
   */

  @DISPID(1611071550) //= 0x6007003e. The runtime will prefer the VTID if present
  @VTID(99)
  int getNbLength();


  /**
   */

  @DISPID(1611071551) //= 0x6007003f. The runtime will prefer the VTID if present
  @VTID(100)
  void removeLength();


  /**
   * @param iAngle Mandatory double parameter.
   */

  @DISPID(1611071552) //= 0x60070040. The runtime will prefer the VTID if present
  @VTID(101)
  void setSmoothAngleThreshold(
    double iAngle);


  /**
   * @param iLength Mandatory double parameter.
   */

  @DISPID(1611071553) //= 0x60070041. The runtime will prefer the VTID if present
  @VTID(102)
  void setGuideDeviation(
    double iLength);


  /**
   * @param iLoc Mandatory int parameter.
   * @param opIAElement Mandatory Holder<Reference> parameter.
   * @param oAngle Mandatory Holder<Angle> parameter.
   */

  @DISPID(1611071554) //= 0x60070042. The runtime will prefer the VTID if present
  @VTID(103)
  void getDraftAngleDefinitionLocation(
    int iLoc,
    Holder<Reference> opIAElement,
    Holder<Angle> oAngle);


  /**
   * @return  Returns a value of type int
   */

  @DISPID(1611071555) //= 0x60070043. The runtime will prefer the VTID if present
  @VTID(104)
  int getDraftAngleDefinitionLocationsNb();


  /**
   * @param ipIALocElem Mandatory Reference parameter.
   * @param iAng Mandatory double parameter.
   */

  @DISPID(1611071556) //= 0x60070044. The runtime will prefer the VTID if present
  @VTID(105)
  void addDraftAngleDefinitionLocation(
    Reference ipIALocElem,
    double iAng);


  /**
   * @param iPos Mandatory int parameter.
   */

  @DISPID(1611071557) //= 0x60070045. The runtime will prefer the VTID if present
  @VTID(106)
  void removeDraftAngleDefinitionLocationPosition(
    int iPos);


  /**
   * @param oFirstType Mandatory Holder<Integer> parameter.
   * @param opIAElem Mandatory Holder<Reference> parameter.
   */

  @DISPID(1611071558) //= 0x60070046. The runtime will prefer the VTID if present
  @VTID(107)
  void getFirstLengthDefinitionType(
    Holder<Integer> oFirstType,
    Holder<Reference> opIAElem);


  /**
   * @param iFirstType Mandatory int parameter.
   * @param ipIAElem Mandatory Reference parameter.
   */

  @DISPID(1611071559) //= 0x60070047. The runtime will prefer the VTID if present
  @VTID(108)
  void setFirstLengthDefinitionType(
    int iFirstType,
    Reference ipIAElem);


  /**
   * @param oSecondType Mandatory Holder<Integer> parameter.
   * @param opIAElem Mandatory Holder<Reference> parameter.
   */

  @DISPID(1611071560) //= 0x60070048. The runtime will prefer the VTID if present
  @VTID(109)
  void getSecondLengthDefinitionType(
    Holder<Integer> oSecondType,
    Holder<Reference> opIAElem);


  /**
   * @param iSecondType Mandatory int parameter.
   * @param ipIAElem Mandatory Reference parameter.
   */

  @DISPID(1611071561) //= 0x60070049. The runtime will prefer the VTID if present
  @VTID(110)
  void setSecondLengthDefinitionType(
    int iSecondType,
    Reference ipIAElem);


  /**
   * @param iElem Mandatory Reference parameter.
   * @param iAngle Mandatory Angle parameter.
   * @param iPos Mandatory int parameter.
   */

  @DISPID(1611071562) //= 0x6007004a. The runtime will prefer the VTID if present
  @VTID(111)
  void insertDraftAngleDefinitionLocation(
    Reference iElem,
    Angle iAngle,
    int iPos);


  /**
   */

  @DISPID(1611071563) //= 0x6007004b. The runtime will prefer the VTID if present
  @VTID(112)
  void removeAllDraftAngleDefinitionLocations();


  /**
   * @param oSurfOri1 Mandatory Holder<Integer> parameter.
   * @param oSurfOri2 Mandatory Holder<Integer> parameter.
   * @param oSurfCouplOri1 Mandatory Holder<Integer> parameter.
   * @param oSurfCouplOri2 Mandatory Holder<Integer> parameter.
   * @param oNo Mandatory Holder<Integer> parameter.
   */

  @DISPID(1611071564) //= 0x6007004c. The runtime will prefer the VTID if present
  @VTID(113)
  void getChoiceNbSurfaces(
    Holder<Integer> oSurfOri1,
    Holder<Integer> oSurfOri2,
    Holder<Integer> oSurfCouplOri1,
    Holder<Integer> oSurfCouplOri2,
    Holder<Integer> oNo);


  /**
   * @param iSurfOri1 Mandatory int parameter.
   * @param iSurfOri2 Mandatory int parameter.
   * @param iSurfCouplOri1 Mandatory int parameter.
   * @param iSurfCouplOri2 Mandatory int parameter.
   * @param iNo Mandatory int parameter.
   */

  @DISPID(1611071565) //= 0x6007004d. The runtime will prefer the VTID if present
  @VTID(114)
  void setChoiceNbSurfaces(
    int iSurfOri1,
    int iSurfOri2,
    int iSurfCouplOri1,
    int iSurfCouplOri2,
    int iNo);


  /**
   * @param oFirstType Mandatory Holder<Integer> parameter.
   * @param oSecondType Mandatory Holder<Integer> parameter.
   */

  @DISPID(1611071566) //= 0x6007004e. The runtime will prefer the VTID if present
  @VTID(115)
  void getLengthLawTypes(
    Holder<Integer> oFirstType,
    Holder<Integer> oSecondType);


  /**
   * @param iFirstType Mandatory int parameter.
   * @param iSecondType Mandatory int parameter.
   */

  @DISPID(1611071567) //= 0x6007004f. The runtime will prefer the VTID if present
  @VTID(116)
  void setLengthLawTypes(
    int iFirstType,
    int iSecondType);


  /**
   * <p>
   * Getter method for the COM property "Context"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611071568) //= 0x60070050. The runtime will prefer the VTID if present
  @VTID(117)
  int context();


  /**
   * <p>
   * Setter method for the COM property "Context"
   * </p>
   * @param oContext Mandatory int parameter.
   */

  @DISPID(1611071568) //= 0x60070050. The runtime will prefer the VTID if present
  @VTID(118)
  void context(
    int oContext);


  /**
   * <p>
   * Getter method for the COM property "SolutionNo"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611071570) //= 0x60070052. The runtime will prefer the VTID if present
  @VTID(119)
  int solutionNo();


  /**
   * <p>
   * Setter method for the COM property "SolutionNo"
   * </p>
   * @param elem Mandatory int parameter.
   */

  @DISPID(1611071570) //= 0x60070052. The runtime will prefer the VTID if present
  @VTID(120)
  void solutionNo(
    int elem);


  /**
   * <p>
   * Getter method for the COM property "CanonicalDetection"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611071572) //= 0x60070054. The runtime will prefer the VTID if present
  @VTID(121)
  int canonicalDetection();


  /**
   * <p>
   * Setter method for the COM property "CanonicalDetection"
   * </p>
   * @param oDetection Mandatory int parameter.
   */

  @DISPID(1611071572) //= 0x60070054. The runtime will prefer the VTID if present
  @VTID(122)
  void canonicalDetection(
    int oDetection);


  // Properties:
}
