import com4j.*;

@IID("{8964041B-BB8A-0000-0280-020E60000000}")
public interface HybridShapeFactory extends Factory {
  // Methods:
  /**
   * @return  Returns a value of type HybridShapeSpine
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(22)
  HybridShapeSpine addNewSpine();


  /**
   * @param iElement Mandatory Reference parameter.
   * @return  Returns a value of type HybridShapeAxisLine
   */

  @DISPID(1611005953) //= 0x60060001. The runtime will prefer the VTID if present
  @VTID(23)
  HybridShapeAxisLine addNewAxisLine(
    Reference iElement);


  /**
   * @param iReference Mandatory Reference parameter.
   * @param iDefinition Mandatory Reference parameter.
   * @return  Returns a value of type HybridShapeLawDistProj
   */

  @DISPID(1611005954) //= 0x60060002. The runtime will prefer the VTID if present
  @VTID(24)
  HybridShapeLawDistProj addNewLawDistProj(
    Reference iReference,
    Reference iDefinition);


  /**
   * @return  Returns a value of type HybridShapeBlend
   */

  @DISPID(1611005955) //= 0x60060003. The runtime will prefer the VTID if present
  @VTID(25)
  HybridShapeBlend addNewBlend();


  /**
   * @param iSupport Mandatory Reference parameter.
   * @param iStartingPoint Mandatory Reference parameter.
   * @param iEndPoint Mandatory Reference parameter.
   * @return  Returns a value of type HybridShapeConic
   */

  @DISPID(1611005956) //= 0x60060004. The runtime will prefer the VTID if present
  @VTID(26)
  HybridShapeConic addNewConic(
    Reference iSupport,
    Reference iStartingPoint,
    Reference iEndPoint);


  /**
   * @param iAxis Mandatory Reference parameter.
   * @param iInvertAxis Mandatory boolean parameter.
   * @param iStartingPoint Mandatory Reference parameter.
   * @param iPitch Mandatory double parameter.
   * @param iHeight Mandatory double parameter.
   * @param iClockwiseRevolution Mandatory boolean parameter.
   * @param iStartingAngle Mandatory double parameter.
   * @param iTaperAngle Mandatory double parameter.
   * @param iTaperOutward Mandatory boolean parameter.
   * @return  Returns a value of type HybridShapeHelix
   */

  @DISPID(1611005957) //= 0x60060005. The runtime will prefer the VTID if present
  @VTID(27)
  HybridShapeHelix addNewHelix(
    Reference iAxis,
    boolean iInvertAxis,
    Reference iStartingPoint,
    double iPitch,
    double iHeight,
    boolean iClockwiseRevolution,
    double iStartingAngle,
    double iTaperAngle,
    boolean iTaperOutward);


  /**
   * @param iFirstCurve Mandatory Reference parameter.
   * @param iSecondCurve Mandatory Reference parameter.
   * @param iNearestSolutions Mandatory int parameter.
   * @return  Returns a value of type HybridShapeCombine
   */

  @DISPID(1611005958) //= 0x60060006. The runtime will prefer the VTID if present
  @VTID(28)
  HybridShapeCombine addNewCombine(
    Reference iFirstCurve,
    Reference iSecondCurve,
    int iNearestSolutions);


  /**
   * @param iObjet Mandatory Reference parameter.
   * @param iDir Mandatory HybridShapeDirection parameter.
   * @param iMinMax Mandatory int parameter.
   * @return  Returns a value of type HybridShapeExtremum
   */

  @DISPID(1611005959) //= 0x60060007. The runtime will prefer the VTID if present
  @VTID(29)
  HybridShapeExtremum addNewExtremum(
    Reference iObjet,
    HybridShapeDirection iDir,
    int iMinMax);


  /**
   * @param iType Mandatory short parameter.
   * @param ipIAContour Mandatory Reference parameter.
   * @return  Returns a value of type HybridShapeExtremumPolar
   */

  @DISPID(1611005960) //= 0x60060008. The runtime will prefer the VTID if present
  @VTID(30)
  HybridShapeExtremumPolar addNewExtremumPolar(
    short iType,
    Reference ipIAContour);


  /**
   * @param iPoint1 Mandatory Reference parameter.
   * @param iPoint2 Mandatory Reference parameter.
   * @param iSupport Mandatory Reference parameter.
   * @param iGeodesic Mandatory boolean parameter.
   * @param iRadius Mandatory double parameter.
   * @param iOri Mandatory int parameter.
   * @return  Returns a value of type HybridShapeCircle2PointsRad
   */

  @DISPID(1611005961) //= 0x60060009. The runtime will prefer the VTID if present
  @VTID(31)
  HybridShapeCircle2PointsRad addNewCircle2PointsRad(
    Reference iPoint1,
    Reference iPoint2,
    Reference iSupport,
    boolean iGeodesic,
    double iRadius,
    int iOri);


  /**
   * @param iElement1 Mandatory Reference parameter.
   * @param iElement2 Mandatory Reference parameter.
   * @param iRadius Mandatory double parameter.
   * @param iOrientation1 Mandatory int parameter.
   * @param iOrientation2 Mandatory int parameter.
   * @param iSupportsTrimMode Mandatory int parameter.
   * @param iRibbonRelimitationMode Mandatory int parameter.
   * @return  Returns a value of type HybridShapeFilletBiTangent
   */

  @DISPID(1611005962) //= 0x6006000a. The runtime will prefer the VTID if present
  @VTID(32)
  HybridShapeFilletBiTangent addNewFilletBiTangent(
    Reference iElement1,
    Reference iElement2,
    double iRadius,
    int iOrientation1,
    int iOrientation2,
    int iSupportsTrimMode,
    int iRibbonRelimitationMode);


  /**
   * @param iElement1 Mandatory Reference parameter.
   * @param iElement2 Mandatory Reference parameter.
   * @param iRemoveElem Mandatory Reference parameter.
   * @param iOrientation1 Mandatory int parameter.
   * @param iOrientation2 Mandatory int parameter.
   * @param iRemoveOrientation Mandatory int parameter.
   * @param iSupportsTrimMode Mandatory int parameter.
   * @param iRibbonRelimitationMode Mandatory int parameter.
   * @return  Returns a value of type HybridShapeFilletTriTangent
   */

  @DISPID(1611005963) //= 0x6006000b. The runtime will prefer the VTID if present
  @VTID(33)
  HybridShapeFilletTriTangent addNewFilletTriTangent(
    Reference iElement1,
    Reference iElement2,
    Reference iRemoveElem,
    int iOrientation1,
    int iOrientation2,
    int iRemoveOrientation,
    int iSupportsTrimMode,
    int iRibbonRelimitationMode);


  /**
   * @param iPoint1 Mandatory Reference parameter.
   * @param iPoint2 Mandatory Reference parameter.
   * @param iPoint3 Mandatory Reference parameter.
   * @return  Returns a value of type HybridShapeCircle3Points
   */

  @DISPID(1611005964) //= 0x6006000c. The runtime will prefer the VTID if present
  @VTID(34)
  HybridShapeCircle3Points addNewCircle3Points(
    Reference iPoint1,
    Reference iPoint2,
    Reference iPoint3);


  /**
   * @param iCurve1 Mandatory Reference parameter.
   * @param iCurve2 Mandatory Reference parameter.
   * @param iPoint Mandatory Reference parameter.
   * @param iSupport Mandatory Reference parameter.
   * @param iOri1 Mandatory int parameter.
   * @param iOri2 Mandatory int parameter.
   * @return  Returns a value of type HybridShapeCircleBitangentPoint
   */

  @DISPID(1611005965) //= 0x6006000d. The runtime will prefer the VTID if present
  @VTID(35)
  HybridShapeCircleBitangentPoint addNewCircleBitangentPoint(
    Reference iCurve1,
    Reference iCurve2,
    Reference iPoint,
    Reference iSupport,
    int iOri1,
    int iOri2);


  /**
   * @param iCurve1 Mandatory Reference parameter.
   * @param iCurve2 Mandatory Reference parameter.
   * @param iSupport Mandatory Reference parameter.
   * @param iRadius Mandatory double parameter.
   * @param iOri1 Mandatory int parameter.
   * @param iOri2 Mandatory int parameter.
   * @return  Returns a value of type HybridShapeCircleBitangentRadius
   */

  @DISPID(1611005966) //= 0x6006000e. The runtime will prefer the VTID if present
  @VTID(36)
  HybridShapeCircleBitangentRadius addNewCircleBitangentRadius(
    Reference iCurve1,
    Reference iCurve2,
    Reference iSupport,
    double iRadius,
    int iOri1,
    int iOri2);


  /**
   * @param iCenter Mandatory Reference parameter.
   * @param iCrossingPoint Mandatory Reference parameter.
   * @param iSupport Mandatory Reference parameter.
   * @param iGeodesic Mandatory boolean parameter.
   * @param iStartAngle Mandatory double parameter.
   * @param iEndAngle Mandatory double parameter.
   * @return  Returns a value of type HybridShapeCircleCtrPt
   */

  @DISPID(1611005967) //= 0x6006000f. The runtime will prefer the VTID if present
  @VTID(37)
  HybridShapeCircleCtrPt addNewCircleCtrPtWithAngles(
    Reference iCenter,
    Reference iCrossingPoint,
    Reference iSupport,
    boolean iGeodesic,
    double iStartAngle,
    double iEndAngle);


  /**
   * @param iCenter Mandatory Reference parameter.
   * @param iCrossingPoint Mandatory Reference parameter.
   * @param iSupport Mandatory Reference parameter.
   * @param iGeodesic Mandatory boolean parameter.
   * @return  Returns a value of type HybridShapeCircleCtrPt
   */

  @DISPID(1611005968) //= 0x60060010. The runtime will prefer the VTID if present
  @VTID(38)
  HybridShapeCircleCtrPt addNewCircleCtrPt(
    Reference iCenter,
    Reference iCrossingPoint,
    Reference iSupport,
    boolean iGeodesic);


  /**
   * @param iCenter Mandatory Reference parameter.
   * @param iSupport Mandatory Reference parameter.
   * @param iGeodesic Mandatory boolean parameter.
   * @param iRadius Mandatory double parameter.
   * @param iStartAngle Mandatory double parameter.
   * @param iEndAngle Mandatory double parameter.
   * @return  Returns a value of type HybridShapeCircleCtrRad
   */

  @DISPID(1611005969) //= 0x60060011. The runtime will prefer the VTID if present
  @VTID(39)
  HybridShapeCircleCtrRad addNewCircleCtrRadWithAngles(
    Reference iCenter,
    Reference iSupport,
    boolean iGeodesic,
    double iRadius,
    double iStartAngle,
    double iEndAngle);


  /**
   * @param iCenter Mandatory Reference parameter.
   * @param iSupport Mandatory Reference parameter.
   * @param iGeodesic Mandatory boolean parameter.
   * @param iRadius Mandatory double parameter.
   * @return  Returns a value of type HybridShapeCircleCtrRad
   */

  @DISPID(1611005970) //= 0x60060012. The runtime will prefer the VTID if present
  @VTID(40)
  HybridShapeCircleCtrRad addNewCircleCtrRad(
    Reference iCenter,
    Reference iSupport,
    boolean iGeodesic,
    double iRadius);


  /**
   * @param iCurve1 Mandatory Reference parameter.
   * @param iCurve2 Mandatory Reference parameter.
   * @param iCurve3 Mandatory Reference parameter.
   * @param iSupport Mandatory Reference parameter.
   * @param iOri1 Mandatory int parameter.
   * @param iOri2 Mandatory int parameter.
   * @param iOri3 Mandatory int parameter.
   * @return  Returns a value of type HybridShapeCircleTritangent
   */

  @DISPID(1611005971) //= 0x60060013. The runtime will prefer the VTID if present
  @VTID(41)
  HybridShapeCircleTritangent addNewCircleTritangent(
    Reference iCurve1,
    Reference iCurve2,
    Reference iCurve3,
    Reference iSupport,
    int iOri1,
    int iOri2,
    int iOri3);


  /**
   * @param iMode Mandatory int parameter.
   * @param iToDevelop Mandatory Reference parameter.
   * @param iSupport Mandatory Reference parameter.
   * @return  Returns a value of type HybridShapeDevelop
   */

  @DISPID(1611005972) //= 0x60060014. The runtime will prefer the VTID if present
  @VTID(42)
  HybridShapeDevelop addNewDevelop(
    int iMode,
    Reference iToDevelop,
    Reference iSupport);


  /**
   * @return  Returns a value of type HybridShapeUnfold
   */

  @DISPID(1611005973) //= 0x60060015. The runtime will prefer the VTID if present
  @VTID(43)
  HybridShapeUnfold addNewUnfold();


  /**
   * @param iGuide1 Mandatory Reference parameter.
   * @return  Returns a value of type HybridShapeSweepCircle
   */

  @DISPID(1611005974) //= 0x60060016. The runtime will prefer the VTID if present
  @VTID(44)
  HybridShapeSweepCircle addNewSweepCircle(
    Reference iGuide1);


  /**
   * @param iProfile Mandatory Reference parameter.
   * @param iGuide Mandatory Reference parameter.
   * @return  Returns a value of type HybridShapeSweepExplicit
   */

  @DISPID(1611005975) //= 0x60060017. The runtime will prefer the VTID if present
  @VTID(45)
  HybridShapeSweepExplicit addNewSweepExplicit(
    Reference iProfile,
    Reference iGuide);


  /**
   * @param iGuide1 Mandatory Reference parameter.
   * @return  Returns a value of type HybridShapeSweepLine
   */

  @DISPID(1611005976) //= 0x60060018. The runtime will prefer the VTID if present
  @VTID(46)
  HybridShapeSweepLine addNewSweepLine(
    Reference iGuide1);


  /**
   * @param iMode Mandatory int parameter.
   * @return  Returns a value of type HybridShapePositionTransfo
   */

  @DISPID(1611005977) //= 0x60060019. The runtime will prefer the VTID if present
  @VTID(47)
  HybridShapePositionTransfo addNewPositionTransfo(
    int iMode);


  /**
   * @return  Returns a value of type HybridShapeLoft
   */

  @DISPID(1611005978) //= 0x6006001a. The runtime will prefer the VTID if present
  @VTID(48)
  HybridShapeLoft addNewLoft();


  /**
   * @param element1 Mandatory Reference parameter.
   * @param element2 Mandatory Reference parameter.
   * @return  Returns a value of type HybridShapeAssemble
   */

  @DISPID(1611005979) //= 0x6006001b. The runtime will prefer the VTID if present
  @VTID(49)
  HybridShapeAssemble addNewJoin(
    Reference element1,
    Reference element2);


  /**
   * @param element Mandatory Reference parameter.
   * @return  Returns a value of type HybridShapeExtract
   */

  @DISPID(1611005980) //= 0x6006001c. The runtime will prefer the VTID if present
  @VTID(50)
  HybridShapeExtract addNewExtract(
    Reference element);


  /**
   * @param element Mandatory Reference parameter.
   * @return  Returns a value of type HybridShapeExtractMulti
   */

  @DISPID(1611005981) //= 0x6006001d. The runtime will prefer the VTID if present
  @VTID(51)
  HybridShapeExtractMulti addNewExtractMulti(
    Reference element);


  /**
   * @param element Mandatory Reference parameter.
   * @param inverse Mandatory int parameter.
   * @return  Returns a value of type HybridShapeInverse
   */

  @DISPID(1611005982) //= 0x6006001e. The runtime will prefer the VTID if present
  @VTID(52)
  HybridShapeInverse addNewInverse(
    Reference element,
    int inverse);


  /**
   * @param multiElement Mandatory Reference parameter.
   * @param referenceElement Mandatory Reference parameter.
   * @return  Returns a value of type HybridShapeNear
   */

  @DISPID(1611005983) //= 0x6006001f. The runtime will prefer the VTID if present
  @VTID(53)
  HybridShapeNear addNewNear(
    Reference multiElement,
    Reference referenceElement);


  /**
   * @param iCurve1 Mandatory Reference parameter.
   * @param iPoint1 Mandatory Reference parameter.
   * @param iOrient1 Mandatory int parameter.
   * @param iContinuity1 Mandatory int parameter.
   * @param iTension1 Mandatory double parameter.
   * @param iCurve2 Mandatory Reference parameter.
   * @param iPoint2 Mandatory Reference parameter.
   * @param iOrient2 Mandatory int parameter.
   * @param iContinuity2 Mandatory int parameter.
   * @param iTension2 Mandatory double parameter.
   * @param trim Mandatory boolean parameter.
   * @return  Returns a value of type HybridShapeConnect
   */

  @DISPID(1611005984) //= 0x60060020. The runtime will prefer the VTID if present
  @VTID(54)
  HybridShapeConnect addNewConnect(
    Reference iCurve1,
    Reference iPoint1,
    int iOrient1,
    int iContinuity1,
    double iTension1,
    Reference iCurve2,
    Reference iPoint2,
    int iOrient2,
    int iContinuity2,
    double iTension2,
    boolean trim);


  /**
   * @param curve Mandatory Reference parameter.
   * @param support Mandatory Reference parameter.
   * @param distance Mandatory double parameter.
   * @param invertDirection Mandatory boolean parameter.
   * @param geodesic Mandatory boolean parameter.
   * @return  Returns a value of type HybridShapeCurvePar
   */

  @DISPID(1611005985) //= 0x60060021. The runtime will prefer the VTID if present
  @VTID(55)
  HybridShapeCurvePar addNewCurvePar(
    Reference curve,
    Reference support,
    double distance,
    boolean invertDirection,
    boolean geodesic);


  /**
   * @param ipIACurve Mandatory Reference parameter.
   * @return  Returns a value of type HybridShapeCurveSmooth
   */

  @DISPID(1611005986) //= 0x60060022. The runtime will prefer the VTID if present
  @VTID(56)
  HybridShapeCurveSmooth addNewCurveSmooth(
    Reference ipIACurve);


  /**
   * @param iElement Mandatory Reference parameter.
   * @param iDirection Mandatory HybridShapeDirection parameter.
   * @param iDistance Mandatory double parameter.
   * @return  Returns a value of type HybridShapeTranslate
   */

  @DISPID(1611005987) //= 0x60060023. The runtime will prefer the VTID if present
  @VTID(57)
  HybridShapeTranslate addNewTranslate(
    Reference iElement,
    HybridShapeDirection iDirection,
    double iDistance);


  /**
   * @return  Returns a value of type HybridShapeTranslate
   */

  @DISPID(1611005988) //= 0x60060024. The runtime will prefer the VTID if present
  @VTID(58)
  HybridShapeTranslate addNewEmptyTranslate();


  /**
   * @param iElement Mandatory Reference parameter.
   * @param iXRatio Mandatory double parameter.
   * @param iYRatio Mandatory double parameter.
   * @param iZRatio Mandatory double parameter.
   * @return  Returns a value of type HybridShapeAffinity
   */

  @DISPID(1611005989) //= 0x60060025. The runtime will prefer the VTID if present
  @VTID(59)
  HybridShapeAffinity addNewAffinity(
    Reference iElement,
    double iXRatio,
    double iYRatio,
    double iZRatio);


  /**
   * @param iElement1 Mandatory Reference parameter.
   * @param iElement2 Mandatory Reference parameter.
   * @param iOrientation Mandatory int parameter.
   * @return  Returns a value of type HybridShapeSplit
   */

  @DISPID(1611005990) //= 0x60060026. The runtime will prefer the VTID if present
  @VTID(60)
  HybridShapeSplit addNewHybridSplit(
    Reference iElement1,
    Reference iElement2,
    int iOrientation);


  /**
   * @param iElement1 Mandatory Reference parameter.
   * @param iOrientation1 Mandatory int parameter.
   * @param iElement2 Mandatory Reference parameter.
   * @param iOrientation2 Mandatory int parameter.
   * @return  Returns a value of type HybridShapeTrim
   */

  @DISPID(1611005991) //= 0x60060027. The runtime will prefer the VTID if present
  @VTID(61)
  HybridShapeTrim addNewHybridTrim(
    Reference iElement1,
    int iOrientation1,
    Reference iElement2,
    int iOrientation2);


  /**
   * @param iElement Mandatory Reference parameter.
   * @param iSupport Mandatory Reference parameter.
   * @return  Returns a value of type HybridShapeProject
   */

  @DISPID(1611005992) //= 0x60060028. The runtime will prefer the VTID if present
  @VTID(62)
  HybridShapeProject addNewProject(
    Reference iElement,
    Reference iSupport);


  /**
   * @param iElement1 Mandatory Reference parameter.
   * @param iElement2 Mandatory Reference parameter.
   * @param iSupport Mandatory Reference parameter.
   * @param iRadius Mandatory double parameter.
   * @param iOrientation1 Mandatory int parameter.
   * @param iOrientation2 Mandatory int parameter.
   * @param iTrim Mandatory boolean parameter.
   * @return  Returns a value of type HybridShapeCorner
   */

  @DISPID(1611005993) //= 0x60060029. The runtime will prefer the VTID if present
  @VTID(63)
  HybridShapeCorner addNewCorner(
    Reference iElement1,
    Reference iElement2,
    Reference iSupport,
    double iRadius,
    int iOrientation1,
    int iOrientation2,
    boolean iTrim);


  /**
   * @param iElement1 Mandatory Reference parameter.
   * @param iElement2 Mandatory Reference parameter.
   * @param iDirection Mandatory HybridShapeDirection parameter.
   * @param iRadius Mandatory double parameter.
   * @param iOrientation1 Mandatory int parameter.
   * @param iOrientation2 Mandatory int parameter.
   * @param iTrim Mandatory boolean parameter.
   * @return  Returns a value of type HybridShapeCorner
   */

  @DISPID(1611005994) //= 0x6006002a. The runtime will prefer the VTID if present
  @VTID(64)
  HybridShapeCorner addNew3DCorner(
    Reference iElement1,
    Reference iElement2,
    HybridShapeDirection iDirection,
    double iRadius,
    int iOrientation1,
    int iOrientation2,
    boolean iTrim);


  /**
   * @param iBoundary Mandatory Reference parameter.
   * @param iToExtrapol Mandatory Reference parameter.
   * @param iUntil Mandatory Reference parameter.
   * @return  Returns a value of type HybridShapeExtrapol
   */

  @DISPID(1611005995) //= 0x6006002b. The runtime will prefer the VTID if present
  @VTID(65)
  HybridShapeExtrapol addNewExtrapolUntil(
    Reference iBoundary,
    Reference iToExtrapol,
    Reference iUntil);


  /**
   * @param iBoundary Mandatory Reference parameter.
   * @param iToExtrapol Mandatory Reference parameter.
   * @param iLength Mandatory double parameter.
   * @return  Returns a value of type HybridShapeExtrapol
   */

  @DISPID(1611005996) //= 0x6006002c. The runtime will prefer the VTID if present
  @VTID(66)
  HybridShapeExtrapol addNewExtrapolLength(
    Reference iBoundary,
    Reference iToExtrapol,
    double iLength);


  /**
   * @param iToRotate Mandatory Reference parameter.
   * @param iAxis Mandatory Reference parameter.
   * @param iAngle Mandatory double parameter.
   * @return  Returns a value of type HybridShapeRotate
   */

  @DISPID(1611005997) //= 0x6006002d. The runtime will prefer the VTID if present
  @VTID(67)
  HybridShapeRotate addNewRotate(
    Reference iToRotate,
    Reference iAxis,
    double iAngle);


  /**
   * @return  Returns a value of type HybridShapeRotate
   */

  @DISPID(1611005998) //= 0x6006002e. The runtime will prefer the VTID if present
  @VTID(68)
  HybridShapeRotate addNewEmptyRotate();


  /**
   * @param iObject1 Mandatory Reference parameter.
   * @param iObject2 Mandatory Reference parameter.
   * @return  Returns a value of type HybridShapeIntersection
   */

  @DISPID(1611005999) //= 0x6006002f. The runtime will prefer the VTID if present
  @VTID(69)
  HybridShapeIntersection addNewIntersection(
    Reference iObject1,
    Reference iObject2);


  /**
   * @param iObject Mandatory Reference parameter.
   * @param iReference Mandatory Reference parameter.
   * @return  Returns a value of type HybridShapeSymmetry
   */

  @DISPID(1611006000) //= 0x60060030. The runtime will prefer the VTID if present
  @VTID(70)
  HybridShapeSymmetry addNewSymmetry(
    Reference iObject,
    Reference iReference);


  /**
   * @param iObject Mandatory Reference parameter.
   * @param iReferenceAxis Mandatory Reference parameter.
   * @param iTargetAxis Mandatory Reference parameter.
   * @return  Returns a value of type HybridShapeAxisToAxis
   */

  @DISPID(1611006001) //= 0x60060031. The runtime will prefer the VTID if present
  @VTID(71)
  HybridShapeAxisToAxis addNewAxisToAxis(
    Reference iObject,
    Reference iReferenceAxis,
    Reference iTargetAxis);


  /**
   * @param iObject Mandatory Reference parameter.
   * @return  Returns a value of type HybridShapePointExplicit
   */

  @DISPID(1611006002) //= 0x60060032. The runtime will prefer the VTID if present
  @VTID(72)
  HybridShapePointExplicit addNewPointDatum(
    Reference iObject);


  /**
   * @param iObject Mandatory Reference parameter.
   * @return  Returns a value of type HybridShapeLineExplicit
   */

  @DISPID(1611006003) //= 0x60060033. The runtime will prefer the VTID if present
  @VTID(73)
  HybridShapeLineExplicit addNewLineDatum(
    Reference iObject);


  /**
   * @param iObject Mandatory Reference parameter.
   * @return  Returns a value of type HybridShapePlaneExplicit
   */

  @DISPID(1611006004) //= 0x60060034. The runtime will prefer the VTID if present
  @VTID(74)
  HybridShapePlaneExplicit addNewPlaneDatum(
    Reference iObject);


  /**
   * @param iObject Mandatory Reference parameter.
   * @return  Returns a value of type HybridShapeCurveExplicit
   */

  @DISPID(1611006005) //= 0x60060035. The runtime will prefer the VTID if present
  @VTID(75)
  HybridShapeCurveExplicit addNewCurveDatum(
    Reference iObject);


  /**
   * @param iObject Mandatory Reference parameter.
   * @return  Returns a value of type HybridShapeCircleExplicit
   */

  @DISPID(1611006006) //= 0x60060036. The runtime will prefer the VTID if present
  @VTID(76)
  HybridShapeCircleExplicit addNewCircleDatum(
    Reference iObject);


  /**
   * @param iObject Mandatory Reference parameter.
   * @return  Returns a value of type HybridShapeSurfaceExplicit
   */

  @DISPID(1611006007) //= 0x60060037. The runtime will prefer the VTID if present
  @VTID(77)
  HybridShapeSurfaceExplicit addNewSurfaceDatum(
    Reference iObject);


  /**
   * @param iObject Mandatory Reference parameter.
   * @return  Returns a value of type HybridShapeVolumeExplicit
   */

  @DISPID(1611006008) //= 0x60060038. The runtime will prefer the VTID if present
  @VTID(78)
  HybridShapeVolumeExplicit addNewVolumeDatum(
    Reference iObject);


  /**
   * @param iObject Mandatory Reference parameter.
   */

  @DISPID(1611006009) //= 0x60060039. The runtime will prefer the VTID if present
  @VTID(79)
  void deleteObjectForDatum(
    Reference iObject);


  /**
   * @return  Returns a value of type HybridShapeFill
   */

  @DISPID(1611006010) //= 0x6006003a. The runtime will prefer the VTID if present
  @VTID(80)
  HybridShapeFill addNewFill();


  /**
   * @return  Returns a value of type HybridShapeSpline
   */

  @DISPID(1611006011) //= 0x6006003b. The runtime will prefer the VTID if present
  @VTID(81)
  HybridShapeSpline addNewSpline();


  /**
   * @param iType Mandatory int parameter.
   * @param iSupport Mandatory Reference parameter.
   * @param iCenterPoint Mandatory Reference parameter.
   * @param iAxis Mandatory HybridShapeDirection parameter.
   * @param iStartingRadius Mandatory double parameter.
   * @param iClockwiseRevolution Mandatory boolean parameter.
   * @return  Returns a value of type HybridShapeSpiral
   */

  @DISPID(1611006012) //= 0x6006003c. The runtime will prefer the VTID if present
  @VTID(82)
  HybridShapeSpiral addNewSpiral(
    int iType,
    Reference iSupport,
    Reference iCenterPoint,
    HybridShapeDirection iAxis,
    double iStartingRadius,
    boolean iClockwiseRevolution);


  /**
   * @param iInitialElement Mandatory Reference parameter.
   * @param iSupport Mandatory Reference parameter.
   * @param iTypedePropagation Mandatory int parameter.
   * @return  Returns a value of type HybridShapeBoundary
   */

  @DISPID(1611006013) //= 0x6006003d. The runtime will prefer the VTID if present
  @VTID(83)
  HybridShapeBoundary addNewBoundary(
    Reference iInitialElement,
    Reference iSupport,
    int iTypedePropagation);


  /**
   * @param surface Mandatory Reference parameter.
   * @return  Returns a value of type HybridShapeBoundary
   */

  @DISPID(1611006014) //= 0x6006003e. The runtime will prefer the VTID if present
  @VTID(84)
  HybridShapeBoundary addNewBoundaryOfSurface(
    Reference surface);


  /**
   * @param iX Mandatory double parameter.
   * @param iY Mandatory double parameter.
   * @param iZ Mandatory double parameter.
   * @return  Returns a value of type HybridShapePointCoord
   */

  @DISPID(1611006015) //= 0x6006003f. The runtime will prefer the VTID if present
  @VTID(85)
  HybridShapePointCoord addNewPointCoord(
    double iX,
    double iY,
    double iZ);


  /**
   * @param iX Mandatory double parameter.
   * @param iY Mandatory double parameter.
   * @param iZ Mandatory double parameter.
   * @param iPt Mandatory Reference parameter.
   * @return  Returns a value of type HybridShapePointCoord
   */

  @DISPID(1611006016) //= 0x60060040. The runtime will prefer the VTID if present
  @VTID(86)
  HybridShapePointCoord addNewPointCoordWithReference(
    double iX,
    double iY,
    double iZ,
    Reference iPt);


  /**
   * @param iPoint1 Mandatory Reference parameter.
   * @param iPoint2 Mandatory Reference parameter.
   * @param iRatio Mandatory double parameter.
   * @param iOrientation Mandatory int parameter.
   * @return  Returns a value of type HybridShapePointBetween
   */

  @DISPID(1611006017) //= 0x60060041. The runtime will prefer the VTID if present
  @VTID(87)
  HybridShapePointBetween addNewPointBetween(
    Reference iPoint1,
    Reference iPoint2,
    double iRatio,
    int iOrientation);


  /**
   * @param iCrv Mandatory Reference parameter.
   * @param iPt Mandatory Reference parameter.
   * @param iLong Mandatory double parameter.
   * @param iOrientation Mandatory boolean parameter.
   * @return  Returns a value of type HybridShapePointOnCurve
   */

  @DISPID(1611006018) //= 0x60060042. The runtime will prefer the VTID if present
  @VTID(88)
  HybridShapePointOnCurve addNewPointOnCurveWithReferenceFromDistance(
    Reference iCrv,
    Reference iPt,
    double iLong,
    boolean iOrientation);


  /**
   * @param iCrv Mandatory Reference parameter.
   * @param iLong Mandatory double parameter.
   * @param iOrientation Mandatory boolean parameter.
   * @return  Returns a value of type HybridShapePointOnCurve
   */

  @DISPID(1611006019) //= 0x60060043. The runtime will prefer the VTID if present
  @VTID(89)
  HybridShapePointOnCurve addNewPointOnCurveFromDistance(
    Reference iCrv,
    double iLong,
    boolean iOrientation);


  /**
   * @param iCrv Mandatory Reference parameter.
   * @param iPt Mandatory Reference parameter.
   * @param iLong Mandatory double parameter.
   * @param iOrientation Mandatory boolean parameter.
   * @return  Returns a value of type HybridShapePointOnCurve
   */

  @DISPID(1611006020) //= 0x60060044. The runtime will prefer the VTID if present
  @VTID(90)
  HybridShapePointOnCurve addNewPointOnCurveWithReferenceFromPercent(
    Reference iCrv,
    Reference iPt,
    double iLong,
    boolean iOrientation);


  /**
   * @param iCrv Mandatory Reference parameter.
   * @param iLong Mandatory double parameter.
   * @param iOrientation Mandatory boolean parameter.
   * @return  Returns a value of type HybridShapePointOnCurve
   */

  @DISPID(1611006021) //= 0x60060045. The runtime will prefer the VTID if present
  @VTID(91)
  HybridShapePointOnCurve addNewPointOnCurveFromPercent(
    Reference iCrv,
    double iLong,
    boolean iOrientation);


  /**
   * @param iPlane Mandatory Reference parameter.
   * @param iPt Mandatory Reference parameter.
   * @param iX Mandatory double parameter.
   * @param iY Mandatory double parameter.
   * @return  Returns a value of type HybridShapePointOnPlane
   */

  @DISPID(1611006022) //= 0x60060046. The runtime will prefer the VTID if present
  @VTID(92)
  HybridShapePointOnPlane addNewPointOnPlaneWithReference(
    Reference iPlane,
    Reference iPt,
    double iX,
    double iY);


  /**
   * @param iPlane Mandatory Reference parameter.
   * @param iX Mandatory double parameter.
   * @param iY Mandatory double parameter.
   * @return  Returns a value of type HybridShapePointOnPlane
   */

  @DISPID(1611006023) //= 0x60060047. The runtime will prefer the VTID if present
  @VTID(93)
  HybridShapePointOnPlane addNewPointOnPlane(
    Reference iPlane,
    double iX,
    double iY);


  /**
   * @param iSurface Mandatory Reference parameter.
   * @param iPt Mandatory Reference parameter.
   * @param iDirection Mandatory HybridShapeDirection parameter.
   * @param iX Mandatory double parameter.
   * @return  Returns a value of type HybridShapePointOnSurface
   */

  @DISPID(1611006024) //= 0x60060048. The runtime will prefer the VTID if present
  @VTID(94)
  HybridShapePointOnSurface addNewPointOnSurfaceWithReference(
    Reference iSurface,
    Reference iPt,
    HybridShapeDirection iDirection,
    double iX);


  /**
   * @param iSurface Mandatory Reference parameter.
   * @param iDirection Mandatory HybridShapeDirection parameter.
   * @param iX Mandatory double parameter.
   * @return  Returns a value of type HybridShapePointOnSurface
   */

  @DISPID(1611006025) //= 0x60060049. The runtime will prefer the VTID if present
  @VTID(95)
  HybridShapePointOnSurface addNewPointOnSurface(
    Reference iSurface,
    HybridShapeDirection iDirection,
    double iX);


  /**
   * @param iCurve Mandatory Reference parameter.
   * @return  Returns a value of type HybridShapePointCenter
   */

  @DISPID(1611006026) //= 0x6006004a. The runtime will prefer the VTID if present
  @VTID(96)
  HybridShapePointCenter addNewPointCenter(
    Reference iCurve);


  /**
   * @param iCurve Mandatory Reference parameter.
   * @param iDirection Mandatory HybridShapeDirection parameter.
   * @return  Returns a value of type HybridShapePointTangent
   */

  @DISPID(1611006027) //= 0x6006004b. The runtime will prefer the VTID if present
  @VTID(97)
  HybridShapePointTangent addNewPointTangent(
    Reference iCurve,
    HybridShapeDirection iDirection);


  /**
   * @param iPtOrigine Mandatory Reference parameter.
   * @param iPtExtremite Mandatory Reference parameter.
   * @return  Returns a value of type HybridShapeLinePtPt
   */

  @DISPID(1611006028) //= 0x6006004c. The runtime will prefer the VTID if present
  @VTID(98)
  HybridShapeLinePtPt addNewLinePtPt(
    Reference iPtOrigine,
    Reference iPtExtremite);


  /**
   * @param iPtOrigine Mandatory Reference parameter.
   * @param iPtExtremite Mandatory Reference parameter.
   * @param iSupport Mandatory Reference parameter.
   * @return  Returns a value of type HybridShapeLinePtPt
   */

  @DISPID(1611006029) //= 0x6006004d. The runtime will prefer the VTID if present
  @VTID(99)
  HybridShapeLinePtPt addNewLinePtPtOnSupport(
    Reference iPtOrigine,
    Reference iPtExtremite,
    Reference iSupport);


  /**
   * @param iPtOrigine Mandatory Reference parameter.
   * @param iPtExtremite Mandatory Reference parameter.
   * @param iBeginOffset Mandatory double parameter.
   * @param iEndOffset Mandatory double parameter.
   * @return  Returns a value of type HybridShapeLinePtPt
   */

  @DISPID(1611006030) //= 0x6006004e. The runtime will prefer the VTID if present
  @VTID(100)
  HybridShapeLinePtPt addNewLinePtPtExtended(
    Reference iPtOrigine,
    Reference iPtExtremite,
    double iBeginOffset,
    double iEndOffset);


  /**
   * @param iPtOrigine Mandatory Reference parameter.
   * @param iPtExtremite Mandatory Reference parameter.
   * @param iSupport Mandatory Reference parameter.
   * @param iBeginOffset Mandatory double parameter.
   * @param iEndOffset Mandatory double parameter.
   * @return  Returns a value of type HybridShapeLinePtPt
   */

  @DISPID(1611006031) //= 0x6006004f. The runtime will prefer the VTID if present
  @VTID(101)
  HybridShapeLinePtPt addNewLinePtPtOnSupportExtended(
    Reference iPtOrigine,
    Reference iPtExtremite,
    Reference iSupport,
    double iBeginOffset,
    double iEndOffset);


  /**
   * @param iPt Mandatory Reference parameter.
   * @param iDirection Mandatory HybridShapeDirection parameter.
   * @param iBeginOffset Mandatory double parameter.
   * @param iEndOffset Mandatory double parameter.
   * @param iOrientation Mandatory boolean parameter.
   * @return  Returns a value of type HybridShapeLinePtDir
   */

  @DISPID(1611006032) //= 0x60060050. The runtime will prefer the VTID if present
  @VTID(102)
  HybridShapeLinePtDir addNewLinePtDir(
    Reference iPt,
    HybridShapeDirection iDirection,
    double iBeginOffset,
    double iEndOffset,
    boolean iOrientation);


  /**
   * @param iPt Mandatory Reference parameter.
   * @param iDirection Mandatory HybridShapeDirection parameter.
   * @param iSupport Mandatory Reference parameter.
   * @param iBeginOffset Mandatory double parameter.
   * @param iEndOffset Mandatory double parameter.
   * @param iOrientation Mandatory boolean parameter.
   * @return  Returns a value of type HybridShapeLinePtDir
   */

  @DISPID(1611006033) //= 0x60060051. The runtime will prefer the VTID if present
  @VTID(103)
  HybridShapeLinePtDir addNewLinePtDirOnSupport(
    Reference iPt,
    HybridShapeDirection iDirection,
    Reference iSupport,
    double iBeginOffset,
    double iEndOffset,
    boolean iOrientation);


  /**
   * @param iCurve Mandatory Reference parameter.
   * @param iSurface Mandatory Reference parameter.
   * @param iPoint Mandatory Reference parameter.
   * @param iGeodesic Mandatory boolean parameter.
   * @param iBeginOffset Mandatory double parameter.
   * @param iEndOffset Mandatory double parameter.
   * @param iAngle Mandatory double parameter.
   * @param iOrientation Mandatory boolean parameter.
   * @return  Returns a value of type HybridShapeLineAngle
   */

  @DISPID(1611006034) //= 0x60060052. The runtime will prefer the VTID if present
  @VTID(104)
  HybridShapeLineAngle addNewLineAngle(
    Reference iCurve,
    Reference iSurface,
    Reference iPoint,
    boolean iGeodesic,
    double iBeginOffset,
    double iEndOffset,
    double iAngle,
    boolean iOrientation);


  /**
   * @param iCurve Mandatory Reference parameter.
   * @param iPoint Mandatory Reference parameter.
   * @param iBeginOffset Mandatory double parameter.
   * @param iEndOffset Mandatory double parameter.
   * @param iOrientation Mandatory boolean parameter.
   * @return  Returns a value of type HybridShapeLineTangency
   */

  @DISPID(1611006035) //= 0x60060053. The runtime will prefer the VTID if present
  @VTID(105)
  HybridShapeLineTangency addNewLineTangency(
    Reference iCurve,
    Reference iPoint,
    double iBeginOffset,
    double iEndOffset,
    boolean iOrientation);


  /**
   * @param iCurve1 Mandatory Reference parameter.
   * @param iElement2 Mandatory Reference parameter.
   * @param iSupport Mandatory Reference parameter.
   * @return  Returns a value of type HybridShapeLineBiTangent
   */

  @DISPID(1611006036) //= 0x60060054. The runtime will prefer the VTID if present
  @VTID(106)
  HybridShapeLineBiTangent addNewLineBiTangent(
    Reference iCurve1,
    Reference iElement2,
    Reference iSupport);


  /**
   * @param iCurve Mandatory Reference parameter.
   * @param iPoint Mandatory Reference parameter.
   * @param iSupport Mandatory Reference parameter.
   * @param iBeginOffset Mandatory double parameter.
   * @param iEndOffset Mandatory double parameter.
   * @param iOrientation Mandatory boolean parameter.
   * @return  Returns a value of type HybridShapeLineTangency
   */

  @DISPID(1611006037) //= 0x60060055. The runtime will prefer the VTID if present
  @VTID(107)
  HybridShapeLineTangency addNewLineTangencyOnSupport(
    Reference iCurve,
    Reference iPoint,
    Reference iSupport,
    double iBeginOffset,
    double iEndOffset,
    boolean iOrientation);


  /**
   * @param iSurface Mandatory Reference parameter.
   * @param iPoint Mandatory Reference parameter.
   * @param iBeginOffset Mandatory double parameter.
   * @param iEndOffset Mandatory double parameter.
   * @param iOrientation Mandatory boolean parameter.
   * @return  Returns a value of type HybridShapeLineNormal
   */

  @DISPID(1611006038) //= 0x60060056. The runtime will prefer the VTID if present
  @VTID(108)
  HybridShapeLineNormal addNewLineNormal(
    Reference iSurface,
    Reference iPoint,
    double iBeginOffset,
    double iEndOffset,
    boolean iOrientation);


  /**
   * @param iLine1 Mandatory Reference parameter.
   * @param iLine2 Mandatory Reference parameter.
   * @param iBeginOffset Mandatory double parameter.
   * @param iEndOffset Mandatory double parameter.
   * @param iOrientation Mandatory boolean parameter.
   * @param solutionNb Mandatory int parameter.
   * @return  Returns a value of type HybridShapeLineBisecting
   */

  @DISPID(1611006039) //= 0x60060057. The runtime will prefer the VTID if present
  @VTID(109)
  HybridShapeLineBisecting addNewLineBisecting(
    Reference iLine1,
    Reference iLine2,
    double iBeginOffset,
    double iEndOffset,
    boolean iOrientation,
    int solutionNb);


  /**
   * @param iLine1 Mandatory Reference parameter.
   * @param iLine2 Mandatory Reference parameter.
   * @param iSurface Mandatory Reference parameter.
   * @param iBeginOffset Mandatory double parameter.
   * @param iEndOffset Mandatory double parameter.
   * @param iOrientation Mandatory boolean parameter.
   * @param solutionNb Mandatory int parameter.
   * @return  Returns a value of type HybridShapeLineBisecting
   */

  @DISPID(1611006040) //= 0x60060058. The runtime will prefer the VTID if present
  @VTID(110)
  HybridShapeLineBisecting addNewLineBisectingOnSupport(
    Reference iLine1,
    Reference iLine2,
    Reference iSurface,
    double iBeginOffset,
    double iEndOffset,
    boolean iOrientation,
    int solutionNb);


  /**
   * @param iLine1 Mandatory Reference parameter.
   * @param iLine2 Mandatory Reference parameter.
   * @param iRefPoint Mandatory Reference parameter.
   * @param iBeginOffset Mandatory double parameter.
   * @param iEndOffset Mandatory double parameter.
   * @param iOrientation Mandatory boolean parameter.
   * @param solutionNb Mandatory int parameter.
   * @return  Returns a value of type HybridShapeLineBisecting
   */

  @DISPID(1611006041) //= 0x60060059. The runtime will prefer the VTID if present
  @VTID(111)
  HybridShapeLineBisecting addNewLineBisectingWithPoint(
    Reference iLine1,
    Reference iLine2,
    Reference iRefPoint,
    double iBeginOffset,
    double iEndOffset,
    boolean iOrientation,
    int solutionNb);


  /**
   * @param iLine1 Mandatory Reference parameter.
   * @param iLine2 Mandatory Reference parameter.
   * @param iRefPoint Mandatory Reference parameter.
   * @param iSurface Mandatory Reference parameter.
   * @param iBeginOffset Mandatory double parameter.
   * @param iEndOffset Mandatory double parameter.
   * @param iOrientation Mandatory boolean parameter.
   * @param solutionNb Mandatory int parameter.
   * @return  Returns a value of type HybridShapeLineBisecting
   */

  @DISPID(1611006042) //= 0x6006005a. The runtime will prefer the VTID if present
  @VTID(112)
  HybridShapeLineBisecting addNewLineBisectingOnSupportWithPoint(
    Reference iLine1,
    Reference iLine2,
    Reference iRefPoint,
    Reference iSurface,
    double iBeginOffset,
    double iEndOffset,
    boolean iOrientation,
    int solutionNb);


  /**
   * @param iA_Coeff Mandatory double parameter.
   * @param iB_Coeff Mandatory double parameter.
   * @param iC_Coeff Mandatory double parameter.
   * @param iD_Coeff Mandatory double parameter.
   * @return  Returns a value of type HybridShapePlaneEquation
   */

  @DISPID(1611006043) //= 0x6006005b. The runtime will prefer the VTID if present
  @VTID(113)
  HybridShapePlaneEquation addNewPlaneEquation(
    double iA_Coeff,
    double iB_Coeff,
    double iC_Coeff,
    double iD_Coeff);


  /**
   * @param iPt1 Mandatory Reference parameter.
   * @param iPt2 Mandatory Reference parameter.
   * @param iPt3 Mandatory Reference parameter.
   * @return  Returns a value of type HybridShapePlane3Points
   */

  @DISPID(1611006044) //= 0x6006005c. The runtime will prefer the VTID if present
  @VTID(114)
  HybridShapePlane3Points addNewPlane3Points(
    Reference iPt1,
    Reference iPt2,
    Reference iPt3);


  /**
   * @param iLn1 Mandatory Reference parameter.
   * @param iLn2 Mandatory Reference parameter.
   * @return  Returns a value of type HybridShapePlane2Lines
   */

  @DISPID(1611006045) //= 0x6006005d. The runtime will prefer the VTID if present
  @VTID(115)
  HybridShapePlane2Lines addNewPlane2Lines(
    Reference iLn1,
    Reference iLn2);


  /**
   * @param iLn Mandatory Reference parameter.
   * @param iPt Mandatory Reference parameter.
   * @return  Returns a value of type HybridShapePlane1Line1Pt
   */

  @DISPID(1611006046) //= 0x6006005e. The runtime will prefer the VTID if present
  @VTID(116)
  HybridShapePlane1Line1Pt addNewPlane1Line1Pt(
    Reference iLn,
    Reference iPt);


  /**
   * @param iPlanarCurve Mandatory Reference parameter.
   * @return  Returns a value of type HybridShapePlane1Curve
   */

  @DISPID(1611006047) //= 0x6006005f. The runtime will prefer the VTID if present
  @VTID(117)
  HybridShapePlane1Curve addNewPlane1Curve(
    Reference iPlanarCurve);


  /**
   * @param iSurface Mandatory Reference parameter.
   * @param iPt Mandatory Reference parameter.
   * @return  Returns a value of type HybridShapePlaneTangent
   */

  @DISPID(1611006048) //= 0x60060060. The runtime will prefer the VTID if present
  @VTID(118)
  HybridShapePlaneTangent addNewPlaneTangent(
    Reference iSurface,
    Reference iPt);


  /**
   * @param iCurve Mandatory Reference parameter.
   * @param iPt Mandatory Reference parameter.
   * @return  Returns a value of type HybridShapePlaneNormal
   */

  @DISPID(1611006049) //= 0x60060061. The runtime will prefer the VTID if present
  @VTID(119)
  HybridShapePlaneNormal addNewPlaneNormal(
    Reference iCurve,
    Reference iPt);


  /**
   * @param iPlane Mandatory Reference parameter.
   * @param iOffset Mandatory double parameter.
   * @param iOrientation Mandatory boolean parameter.
   * @return  Returns a value of type HybridShapePlaneOffset
   */

  @DISPID(1611006050) //= 0x60060062. The runtime will prefer the VTID if present
  @VTID(120)
  HybridShapePlaneOffset addNewPlaneOffset(
    Reference iPlane,
    double iOffset,
    boolean iOrientation);


  /**
   * @param iPlane Mandatory Reference parameter.
   * @param iPt Mandatory Reference parameter.
   * @return  Returns a value of type HybridShapePlaneOffsetPt
   */

  @DISPID(1611006051) //= 0x60060063. The runtime will prefer the VTID if present
  @VTID(121)
  HybridShapePlaneOffsetPt addNewPlaneOffsetPt(
    Reference iPlane,
    Reference iPt);


  /**
   * @param iPlane Mandatory Reference parameter.
   * @param iRevolAxis Mandatory Reference parameter.
   * @param iAngle Mandatory double parameter.
   * @param iOrientation Mandatory boolean parameter.
   * @return  Returns a value of type HybridShapePlaneAngle
   */

  @DISPID(1611006052) //= 0x60060064. The runtime will prefer the VTID if present
  @VTID(122)
  HybridShapePlaneAngle addNewPlaneAngle(
    Reference iPlane,
    Reference iRevolAxis,
    double iAngle,
    boolean iOrientation);


  /**
   * @param iListOfPoints Mandatory java.lang.Object[] parameter.
   * @param nbPoint Mandatory int parameter.
   * @return  Returns a value of type HybridShapePlaneMean
   */

  @DISPID(1611006053) //= 0x60060065. The runtime will prefer the VTID if present
  @VTID(123)
  HybridShapePlaneMean addNewPlaneMean(
    java.lang.Object[] iListOfPoints,
    int nbPoint);


  /**
   * @param iObjectToExtrude Mandatory Reference parameter.
   * @param iOffsetDebut Mandatory double parameter.
   * @param iOffsetFin Mandatory double parameter.
   * @param iDirection Mandatory HybridShapeDirection parameter.
   * @return  Returns a value of type HybridShapeExtrude
   */

  @DISPID(1611006054) //= 0x60060066. The runtime will prefer the VTID if present
  @VTID(124)
  HybridShapeExtrude addNewExtrude(
    Reference iObjectToExtrude,
    double iOffsetDebut,
    double iOffsetFin,
    HybridShapeDirection iDirection);


  /**
   * @param iCenter Mandatory Reference parameter.
   * @param iRadius Mandatory double parameter.
   * @param iFirstLength Mandatory double parameter.
   * @param iSecondLength Mandatory double parameter.
   * @param iDirection Mandatory HybridShapeDirection parameter.
   * @return  Returns a value of type HybridShapeCylinder
   */

  @DISPID(1611006055) //= 0x60060067. The runtime will prefer the VTID if present
  @VTID(125)
  HybridShapeCylinder addNewCylinder(
    Reference iCenter,
    double iRadius,
    double iFirstLength,
    double iSecondLength,
    HybridShapeDirection iDirection);


  /**
   * @param iObjectToExtrude Mandatory Reference parameter.
   * @param iOffsetDebut Mandatory double parameter.
   * @param iOffsetFin Mandatory double parameter.
   * @param iAxis Mandatory Reference parameter.
   * @return  Returns a value of type HybridShapeRevol
   */

  @DISPID(1611006056) //= 0x60060068. The runtime will prefer the VTID if present
  @VTID(126)
  HybridShapeRevol addNewRevol(
    Reference iObjectToExtrude,
    double iOffsetDebut,
    double iOffsetFin,
    Reference iAxis);


  /**
   * @param iElement Mandatory Reference parameter.
   * @return  Returns a value of type HybridShapeDirection
   */

  @DISPID(1611006057) //= 0x60060069. The runtime will prefer the VTID if present
  @VTID(127)
  HybridShapeDirection addNewDirection(
    Reference iElement);


  /**
   * @param iX Mandatory double parameter.
   * @param iY Mandatory double parameter.
   * @param iZ Mandatory double parameter.
   * @return  Returns a value of type HybridShapeDirection
   */

  @DISPID(1611006058) //= 0x6006006a. The runtime will prefer the VTID if present
  @VTID(128)
  HybridShapeDirection addNewDirectionByCoord(
    double iX,
    double iY,
    double iZ);


  /**
   * @param iObjectToOffset Mandatory Reference parameter.
   * @param iOffset Mandatory double parameter.
   * @param iOrientation Mandatory boolean parameter.
   * @param iPrecision Mandatory double parameter.
   * @return  Returns a value of type HybridShapeOffset
   */

  @DISPID(1611006059) //= 0x6006006b. The runtime will prefer the VTID if present
  @VTID(129)
  HybridShapeOffset addNewOffset(
    Reference iObjectToOffset,
    double iOffset,
    boolean iOrientation,
    double iPrecision);


  /**
   * @param iElemToScale Mandatory Reference parameter.
   * @param iCenter Mandatory Reference parameter.
   * @param iRatio Mandatory double parameter.
   * @return  Returns a value of type HybridShapeScaling
   */

  @DISPID(1611006060) //= 0x6006006c. The runtime will prefer the VTID if present
  @VTID(130)
  HybridShapeScaling addNewHybridScaling(
    Reference iElemToScale,
    Reference iCenter,
    double iRatio);


  /**
   * @param iBodyToheal Mandatory Reference parameter.
   * @return  Returns a value of type HybridShapeHealing
   */

  @DISPID(1611006061) //= 0x6006006d. The runtime will prefer the VTID if present
  @VTID(131)
  HybridShapeHealing addNewHealing(
    Reference iBodyToheal);


  /**
   * @return  Returns a value of type HybridShapeRollingOffset
   */

  @DISPID(1611006062) //= 0x6006006e. The runtime will prefer the VTID if present
  @VTID(132)
  HybridShapeRollingOffset addNewRollingOffset();


  /**
   * @param iSupport Mandatory Reference parameter.
   * @param iDir Mandatory HybridShapeDirection parameter.
   * @param iAngle Mandatory double parameter.
   * @param iOrientationSupport Mandatory int parameter.
   * @param iOrientationDirection Mandatory int parameter.
   * @return  Returns a value of type HybridShapeReflectLine
   */

  @DISPID(1611006063) //= 0x6006006f. The runtime will prefer the VTID if present
  @VTID(133)
  HybridShapeReflectLine addNewReflectLine(
    Reference iSupport,
    HybridShapeDirection iDir,
    double iAngle,
    int iOrientationSupport,
    int iOrientationDirection);


  /**
   * @param iSupport Mandatory Reference parameter.
   * @param iDir Mandatory HybridShapeDirection parameter.
   * @param iAngle Mandatory double parameter.
   * @param iOrientationSupport Mandatory int parameter.
   * @param iOrientationDirection Mandatory int parameter.
   * @param iType Mandatory int parameter.
   * @return  Returns a value of type HybridShapeReflectLine
   */

  @DISPID(1611006064) //= 0x60060070. The runtime will prefer the VTID if present
  @VTID(134)
  HybridShapeReflectLine addNewReflectLineWithType(
    Reference iSupport,
    HybridShapeDirection iDir,
    double iAngle,
    int iOrientationSupport,
    int iOrientationDirection,
    int iType);


  /**
   * @param iSupport Mandatory Reference parameter.
   * @param iOrigin Mandatory Reference parameter.
   * @param iAngle Mandatory double parameter.
   * @param iOrientationSupport Mandatory int parameter.
   * @param iType Mandatory int parameter.
   * @return  Returns a value of type HybridShapeReflectLine
   */

  @DISPID(1611006065) //= 0x60060071. The runtime will prefer the VTID if present
  @VTID(135)
  HybridShapeReflectLine addNewConicalReflectLineWithType(
    Reference iSupport,
    Reference iOrigin,
    double iAngle,
    int iOrientationSupport,
    int iType);


  /**
   * @param iCenter Mandatory Reference parameter.
   * @param iAxis Mandatory Reference parameter.
   * @param iRadius Mandatory double parameter.
   * @param iBeginParallelAngle Mandatory double parameter.
   * @param iEndParallelAngle Mandatory double parameter.
   * @param iBeginMeridianAngle Mandatory double parameter.
   * @param iEndMeridianAngle Mandatory double parameter.
   * @return  Returns a value of type HybridShapeSphere
   */

  @DISPID(1611006066) //= 0x60060072. The runtime will prefer the VTID if present
  @VTID(136)
  HybridShapeSphere addNewSphere(
    Reference iCenter,
    Reference iAxis,
    double iRadius,
    double iBeginParallelAngle,
    double iEndParallelAngle,
    double iBeginMeridianAngle,
    double iEndMeridianAngle);


  /**
   * @param iBodyToBump Mandatory Reference parameter.
   * @return  Returns a value of type HybridShapeBump
   */

  @DISPID(1611006067) //= 0x60060073. The runtime will prefer the VTID if present
  @VTID(137)
  HybridShapeBump addNewBump(
    Reference iBodyToBump);


  /**
   * @return  Returns a value of type HybridShapeWrapCurve
   */

  @DISPID(1611006068) //= 0x60060074. The runtime will prefer the VTID if present
  @VTID(138)
  HybridShapeWrapCurve addNewWrapCurve();


  /**
   * @param iBodyToDeform Mandatory Reference parameter.
   * @return  Returns a value of type HybridShapeWrapSurface
   */

  @DISPID(1611006069) //= 0x60060075. The runtime will prefer the VTID if present
  @VTID(139)
  HybridShapeWrapSurface addNewWrapSurface(
    Reference iBodyToDeform);


  /**
   * @return  Returns a value of type HybridShapePolyline
   */

  @DISPID(1611006070) //= 0x60060076. The runtime will prefer the VTID if present
  @VTID(140)
  HybridShapePolyline addNewPolyline();


  /**
   * @param ipIAGuide1 Mandatory Reference parameter.
   * @return  Returns a value of type HybridShapeSweepConic
   */

  @DISPID(1611006071) //= 0x60060077. The runtime will prefer the VTID if present
  @VTID(141)
  HybridShapeSweepConic addNewSweepConic(
    Reference ipIAGuide1);


  /**
   * @param iCenterElem Mandatory Reference parameter.
   * @param iTangentCurve Mandatory Reference parameter.
   * @param iSupport Mandatory Reference parameter.
   * @param iRadius Mandatory double parameter.
   * @return  Returns a value of type HybridShapeCircleCenterTangent
   */

  @DISPID(1611006072) //= 0x60060078. The runtime will prefer the VTID if present
  @VTID(142)
  HybridShapeCircleCenterTangent addNewCircleCenterTangent(
    Reference iCenterElem,
    Reference iTangentCurve,
    Reference iSupport,
    double iRadius);


  /**
   * @param iAxis Mandatory Reference parameter.
   * @param iPoint Mandatory Reference parameter.
   * @param iValue Mandatory double parameter.
   * @param iProjection Mandatory boolean parameter.
   * @return  Returns a value of type HybridShapeCircleCenterAxis
   */

  @DISPID(1611006073) //= 0x60060079. The runtime will prefer the VTID if present
  @VTID(143)
  HybridShapeCircleCenterAxis addNewCircleCenterAxis(
    Reference iAxis,
    Reference iPoint,
    double iValue,
    boolean iProjection);


  /**
   * @param iAxis Mandatory Reference parameter.
   * @param iPoint Mandatory Reference parameter.
   * @param iValue Mandatory double parameter.
   * @param iProjection Mandatory boolean parameter.
   * @param iStartAngle Mandatory double parameter.
   * @param iEndAngle Mandatory double parameter.
   * @return  Returns a value of type HybridShapeCircleCenterAxis
   */

  @DISPID(1611006074) //= 0x6006007a. The runtime will prefer the VTID if present
  @VTID(144)
  HybridShapeCircleCenterAxis addNewCircleCenterAxisWithAngles(
    Reference iAxis,
    Reference iPoint,
    double iValue,
    boolean iProjection,
    double iStartAngle,
    double iEndAngle);


  /**
   * @param iGlobalSurface Mandatory Reference parameter.
   * @return  Returns a value of type HybridShapeVariableOffset
   */

  @DISPID(1611006075) //= 0x6006007b. The runtime will prefer the VTID if present
  @VTID(145)
  HybridShapeVariableOffset addNewVariableOffset(
    Reference iGlobalSurface);


  /**
   * @param iCurveToOffset Mandatory Reference parameter.
   * @param iDirection Mandatory HybridShapeDirection parameter.
   * @param iOffset Mandatory double parameter.
   * @param iCornerRadius Mandatory double parameter.
   * @param iCornerTension Mandatory double parameter.
   * @return  Returns a value of type HybridShape3DCurveOffset
   */

  @DISPID(1611006076) //= 0x6006007c. The runtime will prefer the VTID if present
  @VTID(146)
  HybridShape3DCurveOffset addNew3DCurveOffset(
    Reference iCurveToOffset,
    HybridShapeDirection iDirection,
    double iOffset,
    double iCornerRadius,
    double iCornerTension);


  /**
   * @return  Returns a value of type HybridShapeSection
   */

  @DISPID(1611006077) //= 0x6006007d. The runtime will prefer the VTID if present
  @VTID(147)
  HybridShapeSection addNewSection();


  /**
   * @param iType Mandatory int parameter.
   * @return  Returns a value of type HybridShapeIntegratedLaw
   */

  @DISPID(1611006078) //= 0x6006007e. The runtime will prefer the VTID if present
  @VTID(148)
  HybridShapeIntegratedLaw addNewIntegratedLaw(
    int iType);


  /**
   * @param iElem Mandatory Reference parameter.
   * @return  Returns a value of type java.lang.Object[]
   */

  @DISPID(1611006079) //= 0x6006007f. The runtime will prefer the VTID if present
  @VTID(149)
  java.lang.Object[] addNewDatums(
    Reference iElem);


  /**
   * @param iElem Mandatory Reference parameter.
   * @return  Returns a value of type short
   */

  @DISPID(1611006080) //= 0x60060080. The runtime will prefer the VTID if present
  @VTID(150)
  short getGeometricalFeatureType(
    Reference iElem);


  /**
   * @param iElem Mandatory Reference parameter.
   * @param show Mandatory int parameter.
   */

  @DISPID(1611006081) //= 0x60060081. The runtime will prefer the VTID if present
  @VTID(151)
  void gsmVisibility(
    Reference iElem,
    int show);


  /**
   * @param iElem Mandatory Reference parameter.
   * @param name Mandatory Holder<java.lang.String> parameter.
   */

  @DISPID(1611006082) //= 0x60060082. The runtime will prefer the VTID if present
  @VTID(152)
  void changeFeatureName(
    Reference iElem,
    Holder<java.lang.String> name);


  /**
   * @param iElementToTransfer Mandatory Reference parameter.
   * @param iTypeOfTransfer Mandatory int parameter.
   * @return  Returns a value of type HybridShapeTransfer
   */

  @DISPID(1611006083) //= 0x60060083. The runtime will prefer the VTID if present
  @VTID(153)
  HybridShapeTransfer addNewTransfer(
    Reference iElementToTransfer,
    int iTypeOfTransfer);


  /**
   * @param iElem Mandatory Reference parameter.
   * @return  Returns a value of type HybridShape
   */

  @DISPID(1611006084) //= 0x60060084. The runtime will prefer the VTID if present
  @VTID(154)
  HybridShape gsmGetObjectFromReference(
    Reference iElem);


  /**
   * @param iRef Mandatory Reference parameter.
   * @return  Returns a value of type HybridShape
   */

  @DISPID(1611006085) //= 0x60060085. The runtime will prefer the VTID if present
  @VTID(155)
  HybridShape duplicateGSMSpec(
    Reference iRef);


  /**
   * @param iSpec Mandatory Reference parameter.
   * @param iNewRef Mandatory Reference parameter.
   */

  @DISPID(1611006086) //= 0x60060086. The runtime will prefer the VTID if present
  @VTID(156)
  void setReferenceElemForMultiple(
    Reference iSpec,
    Reference iNewRef);


  /**
   * @param iSpec Mandatory Reference parameter.
   * @param iNewParam Mandatory Dimension parameter.
   */

  @DISPID(1611006087) //= 0x60060087. The runtime will prefer the VTID if present
  @VTID(157)
  void setReferenceParmForMultiple(
    Reference iSpec,
    Dimension iNewParam);


  /**
   * @param iCrv Mandatory Reference parameter.
   * @param iPt Mandatory Reference parameter.
   * @param iLong Mandatory double parameter.
   * @param iOrientation Mandatory boolean parameter.
   * @param iDirection Mandatory HybridShapeDirection parameter.
   * @return  Returns a value of type HybridShapePointOnCurve
   */

  @DISPID(1611006088) //= 0x60060088. The runtime will prefer the VTID if present
  @VTID(158)
  HybridShapePointOnCurve addNewPointOnCurveWithReferenceAlongDirection(
    Reference iCrv,
    Reference iPt,
    double iLong,
    boolean iOrientation,
    HybridShapeDirection iDirection);


  /**
   * @param iCrv Mandatory Reference parameter.
   * @param iLong Mandatory double parameter.
   * @param iOrientation Mandatory boolean parameter.
   * @param iDirection Mandatory HybridShapeDirection parameter.
   * @return  Returns a value of type HybridShapePointOnCurve
   */

  @DISPID(1611006089) //= 0x60060089. The runtime will prefer the VTID if present
  @VTID(159)
  HybridShapePointOnCurve addNewPointOnCurveAlongDirection(
    Reference iCrv,
    double iLong,
    boolean iOrientation,
    HybridShapeDirection iDirection);


  // Properties:
}
