import CatiaV5TypeLibs.InfTypeLib.*;
import com4j.*;

@IID("{8D01DE12-3DC5-0000-0280-020E60000000}")
public interface HybridShapeSweepExplicit extends HybridShapeSweep {
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
   * Getter method for the COM property "Profile"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611071492) //= 0x60070004. The runtime will prefer the VTID if present
  @VTID(41)
  Reference profile();


  /**
   * <p>
   * Setter method for the COM property "Profile"
   * </p>
   * @param elem Mandatory Reference parameter.
   */

  @DISPID(1611071492) //= 0x60070004. The runtime will prefer the VTID if present
  @VTID(42)
  void profile(
    Reference elem);


  /**
   * <p>
   * Getter method for the COM property "PositionedProfile"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611071494) //= 0x60070006. The runtime will prefer the VTID if present
  @VTID(43)
  Reference positionedProfile();


  /**
   * <p>
   * Setter method for the COM property "PositionedProfile"
   * </p>
   * @param elem Mandatory Reference parameter.
   */

  @DISPID(1611071494) //= 0x60070006. The runtime will prefer the VTID if present
  @VTID(44)
  void positionedProfile(
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
   * Getter method for the COM property "Reference"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611071498) //= 0x6007000a. The runtime will prefer the VTID if present
  @VTID(47)
  Reference reference();


  /**
   * <p>
   * Setter method for the COM property "Reference"
   * </p>
   * @param elem Mandatory Reference parameter.
   */

  @DISPID(1611071498) //= 0x6007000a. The runtime will prefer the VTID if present
  @VTID(48)
  void reference(
    Reference elem);


  /**
   * @param ii Mandatory int parameter.
   * @return  Returns a value of type Angle
   */

  @DISPID(1611071500) //= 0x6007000c. The runtime will prefer the VTID if present
  @VTID(49)
  Angle getAngleRef(
    int ii);


  /**
   * @param ii Mandatory int parameter.
   * @param elem Mandatory double parameter.
   */

  @DISPID(1611071501) //= 0x6007000d. The runtime will prefer the VTID if present
  @VTID(50)
  void setAngleRef(
    int ii,
    double elem);


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
   * <p>
   * Getter method for the COM property "Mode"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611071508) //= 0x60070014. The runtime will prefer the VTID if present
  @VTID(57)
  int mode();


  /**
   * <p>
   * Setter method for the COM property "Mode"
   * </p>
   * @param elem Mandatory int parameter.
   */

  @DISPID(1611071508) //= 0x60070014. The runtime will prefer the VTID if present
  @VTID(58)
  void mode(
    int elem);


  /**
   * @param ii Mandatory int parameter.
   * @return  Returns a value of type Length
   */

  @DISPID(1611071510) //= 0x60070016. The runtime will prefer the VTID if present
  @VTID(59)
  Length getPosCoord(
    int ii);


  /**
   * @param ii Mandatory int parameter.
   * @param elem Mandatory double parameter.
   */

  @DISPID(1611071511) //= 0x60070017. The runtime will prefer the VTID if present
  @VTID(60)
  void setPosCoord(
    int ii,
    double elem);


  /**
   * @param ii Mandatory int parameter.
   * @return  Returns a value of type Angle
   */

  @DISPID(1611071512) //= 0x60070018. The runtime will prefer the VTID if present
  @VTID(61)
  Angle getPosAngle(
    int ii);


  /**
   * @param ii Mandatory int parameter.
   * @param elem Mandatory double parameter.
   */

  @DISPID(1611071513) //= 0x60070019. The runtime will prefer the VTID if present
  @VTID(62)
  void setPosAngle(
    int ii,
    double elem);


  /**
   * @param ii Mandatory int parameter.
   * @return  Returns a value of type int
   */

  @DISPID(1611071514) //= 0x6007001a. The runtime will prefer the VTID if present
  @VTID(63)
  int getPosSwapAxes(
    int ii);


  /**
   * @param ii Mandatory int parameter.
   * @param elem Mandatory int parameter.
   */

  @DISPID(1611071515) //= 0x6007001b. The runtime will prefer the VTID if present
  @VTID(64)
  void setPosSwapAxes(
    int ii,
    int elem);


  /**
   * @param ii Mandatory int parameter.
   * @return  Returns a value of type Reference
   */

  @DISPID(1611071516) //= 0x6007001c. The runtime will prefer the VTID if present
  @VTID(65)
  Reference getPosPoint(
    int ii);


  /**
   * @param ii Mandatory int parameter.
   * @param elem Mandatory Reference parameter.
   */

  @DISPID(1611071517) //= 0x6007001d. The runtime will prefer the VTID if present
  @VTID(66)
  void setPosPoint(
    int ii,
    Reference elem);


  /**
   * @param ii Mandatory int parameter.
   * @return  Returns a value of type Reference
   */

  @DISPID(1611071518) //= 0x6007001e. The runtime will prefer the VTID if present
  @VTID(67)
  Reference getPosDirection(
    int ii);


  /**
   * @param ii Mandatory int parameter.
   * @param elem Mandatory Reference parameter.
   */

  @DISPID(1611071519) //= 0x6007001f. The runtime will prefer the VTID if present
  @VTID(68)
  void setPosDirection(
    int ii,
    Reference elem);


  /**
   * <p>
   * Getter method for the COM property "SmoothActivity"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1611071520) //= 0x60070020. The runtime will prefer the VTID if present
  @VTID(69)
  boolean smoothActivity();


  /**
   * <p>
   * Setter method for the COM property "SmoothActivity"
   * </p>
   * @param oSmooth Mandatory boolean parameter.
   */

  @DISPID(1611071520) //= 0x60070020. The runtime will prefer the VTID if present
  @VTID(70)
  void smoothActivity(
    boolean oSmooth);


  /**
   * <p>
   * Getter method for the COM property "SmoothAngleThreshold"
   * </p>
   * @return  Returns a value of type Angle
   */

  @DISPID(1611071522) //= 0x60070022. The runtime will prefer the VTID if present
  @VTID(71)
  Angle smoothAngleThreshold();


  /**
   * <p>
   * Getter method for the COM property "GuideDeviationActivity"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1611071523) //= 0x60070023. The runtime will prefer the VTID if present
  @VTID(72)
  boolean guideDeviationActivity();


  /**
   * <p>
   * Setter method for the COM property "GuideDeviationActivity"
   * </p>
   * @param oActivity Mandatory boolean parameter.
   */

  @DISPID(1611071523) //= 0x60070023. The runtime will prefer the VTID if present
  @VTID(73)
  void guideDeviationActivity(
    boolean oActivity);


  /**
   * <p>
   * Getter method for the COM property "GuideDeviation"
   * </p>
   * @return  Returns a value of type Length
   */

  @DISPID(1611071525) //= 0x60070025. The runtime will prefer the VTID if present
  @VTID(74)
  Length guideDeviation();


  /**
   * @param iAngle Mandatory double parameter.
   */

  @DISPID(1611071526) //= 0x60070026. The runtime will prefer the VTID if present
  @VTID(75)
  void setSmoothAngleThreshold(
    double iAngle);


  /**
   * @param iLength Mandatory double parameter.
   */

  @DISPID(1611071527) //= 0x60070027. The runtime will prefer the VTID if present
  @VTID(76)
  void setGuideDeviation(
    double iLength);


  /**
   * @return  Returns a value of type int
   */

  @DISPID(1611071528) //= 0x60070028. The runtime will prefer the VTID if present
  @VTID(77)
  int getNbGuide();


  /**
   */

  @DISPID(1611071529) //= 0x60070029. The runtime will prefer the VTID if present
  @VTID(78)
  void removeGuide();


  /**
   * @param iBoolean Mandatory boolean parameter.
   */

  @DISPID(1611071530) //= 0x6007002a. The runtime will prefer the VTID if present
  @VTID(79)
  void useSketchAxisAsDefault(
    boolean iBoolean);


  /**
   * @return  Returns a value of type boolean
   */

  @DISPID(1611071531) //= 0x6007002b. The runtime will prefer the VTID if present
  @VTID(80)
  boolean isSketchAxisUsedAsDefault();


  /**
   * @param opIAElemA Mandatory Holder<Reference> parameter.
   * @param opIAElemB Mandatory Holder<Reference> parameter.
   */

  @DISPID(1611071532) //= 0x6007002c. The runtime will prefer the VTID if present
  @VTID(81)
  void getFittingPoints(
    Holder<Reference> opIAElemA,
    Holder<Reference> opIAElemB);


  /**
   * @param ipIAElemA Mandatory Reference parameter.
   * @param ipIAElemB Mandatory Reference parameter.
   */

  @DISPID(1611071533) //= 0x6007002d. The runtime will prefer the VTID if present
  @VTID(82)
  void setFittingPoints(
    Reference ipIAElemA,
    Reference ipIAElemB);


  /**
   */

  @DISPID(1611071534) //= 0x6007002e. The runtime will prefer the VTID if present
  @VTID(83)
  void removeFittingPoints();


  /**
   * @param opIAElemA Mandatory Holder<Reference> parameter.
   * @param opIAElemB Mandatory Holder<Reference> parameter.
   */

  @DISPID(1611071535) //= 0x6007002f. The runtime will prefer the VTID if present
  @VTID(84)
  void getLongitudinalRelimiters(
    Holder<Reference> opIAElemA,
    Holder<Reference> opIAElemB);


  /**
   * @param ipIAElemA Mandatory Reference parameter.
   * @param ipIAElemB Mandatory Reference parameter.
   */

  @DISPID(1611071536) //= 0x60070030. The runtime will prefer the VTID if present
  @VTID(85)
  void setLongitudinalRelimiters(
    Reference ipIAElemA,
    Reference ipIAElemB);


  /**
   * @param opIAElem1 Mandatory Holder<Reference> parameter.
   * @param opOrient1 Mandatory Holder<Integer> parameter.
   * @param opIAElem2 Mandatory Holder<Reference> parameter.
   * @param opOrient2 Mandatory Holder<Integer> parameter.
   */

  @DISPID(1611071537) //= 0x60070031. The runtime will prefer the VTID if present
  @VTID(86)
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

  @DISPID(1611071538) //= 0x60070032. The runtime will prefer the VTID if present
  @VTID(87)
  void setRelimiters(
    Reference ipIAElem1,
    int ipOrient1,
    Reference ipIAElem2,
    int ipOrient2);


  /**
   * @return  Returns a value of type int
   */

  @DISPID(1611071539) //= 0x60070033. The runtime will prefer the VTID if present
  @VTID(88)
  int getNbAngle();


  /**
   */

  @DISPID(1611071540) //= 0x60070034. The runtime will prefer the VTID if present
  @VTID(89)
  void removeAngle();


  /**
   * @return  Returns a value of type int
   */

  @DISPID(1611071541) //= 0x60070035. The runtime will prefer the VTID if present
  @VTID(90)
  int getNbPosCoord();


  /**
   * @return  Returns a value of type int
   */

  @DISPID(1611071542) //= 0x60070036. The runtime will prefer the VTID if present
  @VTID(91)
  int getNbPosAngle();


  /**
   * <p>
   * Getter method for the COM property "Context"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611071543) //= 0x60070037. The runtime will prefer the VTID if present
  @VTID(92)
  int context();


  /**
   * <p>
   * Setter method for the COM property "Context"
   * </p>
   * @param oContext Mandatory int parameter.
   */

  @DISPID(1611071543) //= 0x60070037. The runtime will prefer the VTID if present
  @VTID(93)
  void context(
    int oContext);


  /**
   * <p>
   * Getter method for the COM property "PositionMode"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611071545) //= 0x60070039. The runtime will prefer the VTID if present
  @VTID(94)
  int positionMode();


  /**
   * <p>
   * Setter method for the COM property "PositionMode"
   * </p>
   * @param oPosMode Mandatory int parameter.
   */

  @DISPID(1611071545) //= 0x60070039. The runtime will prefer the VTID if present
  @VTID(95)
  void positionMode(
    int oPosMode);


  /**
   * <p>
   * Getter method for the COM property "ProfileXAxisComputationMode"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611071547) //= 0x6007003b. The runtime will prefer the VTID if present
  @VTID(96)
  int profileXAxisComputationMode();


  /**
   * <p>
   * Setter method for the COM property "ProfileXAxisComputationMode"
   * </p>
   * @param oDirCompMode Mandatory int parameter.
   */

  @DISPID(1611071547) //= 0x6007003b. The runtime will prefer the VTID if present
  @VTID(97)
  void profileXAxisComputationMode(
    int oDirCompMode);


  /**
   * <p>
   * Getter method for the COM property "PullingDirection"
   * </p>
   * @return  Returns a value of type HybridShapeDirection
   */

  @DISPID(1611071549) //= 0x6007003d. The runtime will prefer the VTID if present
  @VTID(98)
  HybridShapeDirection pullingDirection();


  /**
   * <p>
   * Setter method for the COM property "PullingDirection"
   * </p>
   * @param ohDir Mandatory HybridShapeDirection parameter.
   */

  @DISPID(1611071549) //= 0x6007003d. The runtime will prefer the VTID if present
  @VTID(99)
  void pullingDirection(
    HybridShapeDirection ohDir);


  /**
   * <p>
   * Getter method for the COM property "GuideProjection"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1611071551) //= 0x6007003f. The runtime will prefer the VTID if present
  @VTID(100)
  boolean guideProjection();


  /**
   * <p>
   * Setter method for the COM property "GuideProjection"
   * </p>
   * @param oMode Mandatory boolean parameter.
   */

  @DISPID(1611071551) //= 0x6007003f. The runtime will prefer the VTID if present
  @VTID(101)
  void guideProjection(
    boolean oMode);


  /**
   * <p>
   * Getter method for the COM property "SolutionNo"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611071553) //= 0x60070041. The runtime will prefer the VTID if present
  @VTID(102)
  int solutionNo();


  /**
   * <p>
   * Setter method for the COM property "SolutionNo"
   * </p>
   * @param elem Mandatory int parameter.
   */

  @DISPID(1611071553) //= 0x60070041. The runtime will prefer the VTID if present
  @VTID(103)
  void solutionNo(
    int elem);


  /**
   * <p>
   * Getter method for the COM property "SubType"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611071555) //= 0x60070043. The runtime will prefer the VTID if present
  @VTID(104)
  int subType();


  /**
   * <p>
   * Setter method for the COM property "SubType"
   * </p>
   * @param elem Mandatory int parameter.
   */

  @DISPID(1611071555) //= 0x60070043. The runtime will prefer the VTID if present
  @VTID(105)
  void subType(
    int elem);


  // Properties:
}
