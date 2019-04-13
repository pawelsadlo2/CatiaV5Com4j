package CatiaV5TypeLibs.MecModTypeLib;
import CatiaV5TypeLibs.KnowledgewareTypeLib.*;
import CatiaV5TypeLibs.InfTypeLib.*;

import com4j.*;

@IID("{8CD8DAC4-103D-0000-0280-020E60000000}")
public interface HybridShapeLoft extends HybridShape {
  // Methods:
  /**
   * @param iSpine Mandatory Reference parameter.
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(25)
  void setSpine(
    Reference iSpine);


  /**
   * @param iTangentSection Mandatory Reference parameter.
   */

  @DISPID(1611005953) //= 0x60060001. The runtime will prefer the VTID if present
  @VTID(26)
  void setStartSectionTangent(
    Reference iTangentSection);


  /**
   * @param iTangentSection Mandatory Reference parameter.
   */

  @DISPID(1611005954) //= 0x60060002. The runtime will prefer the VTID if present
  @VTID(27)
  void setEndSectionTangent(
    Reference iTangentSection);


  /**
   * @param iFace Mandatory Reference parameter.
   */

  @DISPID(1611005955) //= 0x60060003. The runtime will prefer the VTID if present
  @VTID(28)
  void setStartFaceForClosing(
    Reference iFace);


  /**
   * @param iFace Mandatory Reference parameter.
   */

  @DISPID(1611005956) //= 0x60060004. The runtime will prefer the VTID if present
  @VTID(29)
  void setEndFaceForClosing(
    Reference iFace);


  /**
   * @param iGuide Mandatory Reference parameter.
   */

  @DISPID(1611005957) //= 0x60060005. The runtime will prefer the VTID if present
  @VTID(30)
  void addGuide(
    Reference iGuide);


  /**
   * @param iGuide Mandatory Reference parameter.
   * @param iTangent Mandatory Reference parameter.
   */

  @DISPID(1611005958) //= 0x60060006. The runtime will prefer the VTID if present
  @VTID(31)
  void addGuideWithTangent(
    Reference iGuide,
    Reference iTangent);


  /**
   * @param iCrv Mandatory Reference parameter.
   * @param iOri Mandatory int parameter.
   * @param iPoint Mandatory Reference parameter.
   */

  @DISPID(1611005959) //= 0x60060007. The runtime will prefer the VTID if present
  @VTID(32)
  void addSectionToLoft(
    Reference iCrv,
    int iOri,
    Reference iPoint);


  /**
   * @param iGuide Mandatory Reference parameter.
   */

  @DISPID(1611005960) //= 0x60060008. The runtime will prefer the VTID if present
  @VTID(33)
  void removeGuide(
    Reference iGuide);


  /**
   * @param iSection Mandatory Reference parameter.
   */

  @DISPID(1611005961) //= 0x60060009. The runtime will prefer the VTID if present
  @VTID(34)
  void removeSection(
    Reference iSection);


  /**
   * @param iRank Mandatory int parameter.
   * @param oCrv Mandatory Holder<Reference> parameter.
   * @param oOri Mandatory Holder<Integer> parameter.
   * @param oPoint Mandatory Holder<Reference> parameter.
   */

  @DISPID(1611005962) //= 0x6006000a. The runtime will prefer the VTID if present
  @VTID(35)
  void getSectionFromLoft(
    int iRank,
    Holder<Reference> oCrv,
    Holder<Integer> oOri,
    Holder<Reference> oPoint);


  /**
   * @param iPosition Mandatory int parameter.
   */

  @DISPID(1611005963) //= 0x6006000b. The runtime will prefer the VTID if present
  @VTID(36)
  void insertCoupling(
    int iPosition);


  /**
   * @param iCouplingIndex Mandatory int parameter.
   * @param iPosition Mandatory int parameter.
   * @param iPoint Mandatory Reference parameter.
   */

  @DISPID(1611005964) //= 0x6006000c. The runtime will prefer the VTID if present
  @VTID(37)
  void insertCouplingPoint(
    int iCouplingIndex,
    int iPosition,
    Reference iPoint);


  /**
   * <p>
   * Getter method for the COM property "SectionCoupling"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611005965) //= 0x6006000d. The runtime will prefer the VTID if present
  @VTID(38)
  int sectionCoupling();


  /**
   * <p>
   * Setter method for the COM property "SectionCoupling"
   * </p>
   * @param oCoupling Mandatory int parameter.
   */

  @DISPID(1611005965) //= 0x6006000d. The runtime will prefer the VTID if present
  @VTID(39)
  void sectionCoupling(
    int oCoupling);


  /**
   * <p>
   * Getter method for the COM property "Relimitation"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611005967) //= 0x6006000f. The runtime will prefer the VTID if present
  @VTID(40)
  int relimitation();


  /**
   * <p>
   * Setter method for the COM property "Relimitation"
   * </p>
   * @param oRelimitation Mandatory int parameter.
   */

  @DISPID(1611005967) //= 0x6006000f. The runtime will prefer the VTID if present
  @VTID(41)
  void relimitation(
    int oRelimitation);


  /**
   * <p>
   * Getter method for the COM property "CanonicalDetection"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611005969) //= 0x60060011. The runtime will prefer the VTID if present
  @VTID(42)
  int canonicalDetection();


  /**
   * <p>
   * Setter method for the COM property "CanonicalDetection"
   * </p>
   * @param oDetection Mandatory int parameter.
   */

  @DISPID(1611005969) //= 0x60060011. The runtime will prefer the VTID if present
  @VTID(43)
  void canonicalDetection(
    int oDetection);


  /**
   * <p>
   * Getter method for the COM property "CompStartSectionTangent"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611005971) //= 0x60060013. The runtime will prefer the VTID if present
  @VTID(44)
  int compStartSectionTangent();


  /**
   * <p>
   * Setter method for the COM property "CompStartSectionTangent"
   * </p>
   * @param oComputedTangent Mandatory int parameter.
   */

  @DISPID(1611005971) //= 0x60060013. The runtime will prefer the VTID if present
  @VTID(45)
  void compStartSectionTangent(
    int oComputedTangent);


  /**
   * <p>
   * Getter method for the COM property "CompEndSectionTangent"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611005973) //= 0x60060015. The runtime will prefer the VTID if present
  @VTID(46)
  int compEndSectionTangent();


  /**
   * <p>
   * Setter method for the COM property "CompEndSectionTangent"
   * </p>
   * @param oComputedTangent Mandatory int parameter.
   */

  @DISPID(1611005973) //= 0x60060015. The runtime will prefer the VTID if present
  @VTID(47)
  void compEndSectionTangent(
    int oComputedTangent);


  /**
   * <p>
   * Getter method for the COM property "SmoothDeviationActivity"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005975) //= 0x60060017. The runtime will prefer the VTID if present
  @VTID(48)
  boolean smoothDeviationActivity();


  /**
   * <p>
   * Setter method for the COM property "SmoothDeviationActivity"
   * </p>
   * @param oSmoothDeviationActivity Mandatory boolean parameter.
   */

  @DISPID(1611005975) //= 0x60060017. The runtime will prefer the VTID if present
  @VTID(49)
  void smoothDeviationActivity(
    boolean oSmoothDeviationActivity);


  /**
   * <p>
   * Getter method for the COM property "SmoothDeviation"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(1611005977) //= 0x60060019. The runtime will prefer the VTID if present
  @VTID(50)
  double smoothDeviation();


  /**
   * <p>
   * Setter method for the COM property "SmoothDeviation"
   * </p>
   * @param oSmoothDeviation Mandatory double parameter.
   */

  @DISPID(1611005977) //= 0x60060019. The runtime will prefer the VTID if present
  @VTID(51)
  void smoothDeviation(
    double oSmoothDeviation);


  /**
   * <p>
   * Getter method for the COM property "SmoothAngleThresholdActivity"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005979) //= 0x6006001b. The runtime will prefer the VTID if present
  @VTID(52)
  boolean smoothAngleThresholdActivity();


  /**
   * <p>
   * Setter method for the COM property "SmoothAngleThresholdActivity"
   * </p>
   * @param oSmoothAngleThresholdActivity Mandatory boolean parameter.
   */

  @DISPID(1611005979) //= 0x6006001b. The runtime will prefer the VTID if present
  @VTID(53)
  void smoothAngleThresholdActivity(
    boolean oSmoothAngleThresholdActivity);


  /**
   * <p>
   * Getter method for the COM property "SmoothAngleThreshold"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(1611005981) //= 0x6006001d. The runtime will prefer the VTID if present
  @VTID(54)
  double smoothAngleThreshold();


  /**
   * <p>
   * Setter method for the COM property "SmoothAngleThreshold"
   * </p>
   * @param oSmoothAngleThreshold Mandatory double parameter.
   */

  @DISPID(1611005981) //= 0x6006001d. The runtime will prefer the VTID if present
  @VTID(55)
  void smoothAngleThreshold(
    double oSmoothAngleThreshold);


  /**
   * <p>
   * Getter method for the COM property "Context"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611005983) //= 0x6006001f. The runtime will prefer the VTID if present
  @VTID(56)
  int context();


  /**
   * <p>
   * Setter method for the COM property "Context"
   * </p>
   * @param oContext Mandatory int parameter.
   */

  @DISPID(1611005983) //= 0x6006001f. The runtime will prefer the VTID if present
  @VTID(57)
  void context(
    int oContext);


  /**
   * @param oStartSectionTangent Mandatory Holder<Reference> parameter.
   * @param oEndSectionTangent Mandatory Holder<Reference> parameter.
   */

  @DISPID(1611005985) //= 0x60060021. The runtime will prefer the VTID if present
  @VTID(58)
  void getStartAndEndSectionTangent(
    Holder<Reference> oStartSectionTangent,
    Holder<Reference> oEndSectionTangent);


  /**
   * @param oStartFace Mandatory Holder<Reference> parameter.
   * @param oEndFace Mandatory Holder<Reference> parameter.
   */

  @DISPID(1611005986) //= 0x60060022. The runtime will prefer the VTID if present
  @VTID(59)
  void getFacesForClosing(
    Holder<Reference> oStartFace,
    Holder<Reference> oEndFace);


  /**
   * @param oSpineType Mandatory Holder<Integer> parameter.
   * @param oSpine Mandatory Holder<Reference> parameter.
   */

  @DISPID(1611005987) //= 0x60060023. The runtime will prefer the VTID if present
  @VTID(60)
  void getSpine(
    Holder<Integer> oSpineType,
    Holder<Reference> oSpine);


  /**
   * @param iGuide Mandatory Reference parameter.
   * @param iNewGuide Mandatory Reference parameter.
   */

  @DISPID(1611005988) //= 0x60060024. The runtime will prefer the VTID if present
  @VTID(61)
  void modifyGuideCurve(
    Reference iGuide,
    Reference iNewGuide);


  /**
   * @param iSection Mandatory Reference parameter.
   * @param iOrient Mandatory int parameter.
   */

  @DISPID(1611005989) //= 0x60060025. The runtime will prefer the VTID if present
  @VTID(62)
  void modifySectionOrient(
    Reference iSection,
    int iOrient);


  /**
   * @param iSection Mandatory Reference parameter.
   */

  @DISPID(1611005990) //= 0x60060026. The runtime will prefer the VTID if present
  @VTID(63)
  void removeFaceForClosing(
    Reference iSection);


  /**
   * @param iGuide Mandatory Reference parameter.
   */

  @DISPID(1611005991) //= 0x60060027. The runtime will prefer the VTID if present
  @VTID(64)
  void removeGuideTangent(
    Reference iGuide);


  /**
   * @param iSection Mandatory Reference parameter.
   */

  @DISPID(1611005992) //= 0x60060028. The runtime will prefer the VTID if present
  @VTID(65)
  void removeSectionPoint(
    Reference iSection);


  /**
   * @param iSection Mandatory Reference parameter.
   */

  @DISPID(1611005993) //= 0x60060029. The runtime will prefer the VTID if present
  @VTID(66)
  void removeSectionTangent(
    Reference iSection);


  /**
   * @param iPos Mandatory int parameter.
   * @param oGuide Mandatory Holder<Reference> parameter.
   * @param oGuideTangent Mandatory Holder<Reference> parameter.
   */

  @DISPID(1611005994) //= 0x6006002a. The runtime will prefer the VTID if present
  @VTID(67)
  void getGuide(
    int iPos,
    Holder<Reference> oGuide,
    Holder<Reference> oGuideTangent);


  /**
   * @return  Returns a value of type int
   */

  @DISPID(1611005995) //= 0x6006002b. The runtime will prefer the VTID if present
  @VTID(68)
  int getNbOfGuides();


  /**
   * @param iSection Mandatory Reference parameter.
   * @param iNewSection Mandatory Reference parameter.
   * @param oCurveSection Mandatory Holder<Reference> parameter.
   * @param oClosingPoint Mandatory Holder<Reference> parameter.
   * @param oPtDiag Mandatory Holder<Integer> parameter.
   */

  @DISPID(1611005996) //= 0x6006002c. The runtime will prefer the VTID if present
  @VTID(69)
  void modifySectionCurve(
    Reference iSection,
    Reference iNewSection,
    Holder<Reference> oCurveSection,
    Holder<Reference> oClosingPoint,
    Holder<Integer> oPtDiag);


  /**
   * <p>
   * Getter method for the COM property "BooleanOperation"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611005997) //= 0x6006002d. The runtime will prefer the VTID if present
  @VTID(70)
  int booleanOperation();


  /**
   * <p>
   * Setter method for the COM property "BooleanOperation"
   * </p>
   * @param oBool Mandatory int parameter.
   */

  @DISPID(1611005997) //= 0x6006002d. The runtime will prefer the VTID if present
  @VTID(71)
  void booleanOperation(
    int oBool);


  /**
   * @param iType Mandatory boolean parameter.
   * @param iCrv Mandatory Reference parameter.
   * @param iOri Mandatory int parameter.
   * @param iPoint Mandatory Reference parameter.
   * @param iSectionRef Mandatory Reference parameter.
   */

  @DISPID(1611005999) //= 0x6006002f. The runtime will prefer the VTID if present
  @VTID(72)
  void insertSectionToLoft(
    boolean iType,
    Reference iCrv,
    int iOri,
    Reference iPoint,
    Reference iSectionRef);


  // Properties:
}
