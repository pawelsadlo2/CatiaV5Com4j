import com4j.*;

@IID("{81463C0E-BBCA-0000-0280-030BA6000000}")
public interface ShapeFactory extends Factory {
  // Methods:
  /**
   * @param iSketch Mandatory CatiaV5TypeLibs.PartItfTypeLib.Sketch parameter.
   * @param iHeight Mandatory double parameter.
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.Pad
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(22)
  Pad addNewPad(
    Sketch iSketch,
    double iHeight);


  /**
   * @param iSketch Mandatory CatiaV5TypeLibs.PartItfTypeLib.Sketch parameter.
   * @param iHeight Mandatory double parameter.
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.Pocket
   */

  @DISPID(1611005953) //= 0x60060001. The runtime will prefer the VTID if present
  @VTID(23)
  Pocket addNewPocket(
    Sketch iSketch,
    double iHeight);


  /**
   * @param iProfileElt Mandatory Reference parameter.
   * @param iHeight Mandatory double parameter.
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.Pad
   */

  @DISPID(1611005954) //= 0x60060002. The runtime will prefer the VTID if present
  @VTID(24)
  Pad addNewPadFromRef(
    Reference iProfileElt,
    double iHeight);


  /**
   * @param iProfileElt Mandatory Reference parameter.
   * @param iHeight Mandatory double parameter.
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.Pocket
   */

  @DISPID(1611005955) //= 0x60060003. The runtime will prefer the VTID if present
  @VTID(25)
  Pocket addNewPocketFromRef(
    Reference iProfileElt,
    double iHeight);


  /**
   * @param iSupport Mandatory Reference parameter.
   * @param iDepth Mandatory double parameter.
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.Hole
   */

  @DISPID(1611005956) //= 0x60060004. The runtime will prefer the VTID if present
  @VTID(26)
  Hole addNewHole(
    Reference iSupport,
    double iDepth);


  /**
   * @param iX Mandatory double parameter.
   * @param iY Mandatory double parameter.
   * @param iZ Mandatory double parameter.
   * @param iSupport Mandatory Reference parameter.
   * @param iDepth Mandatory double parameter.
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.Hole
   */

  @DISPID(1611005957) //= 0x60060005. The runtime will prefer the VTID if present
  @VTID(27)
  Hole addNewHoleFromPoint(
    double iX,
    double iY,
    double iZ,
    Reference iSupport,
    double iDepth);


  /**
   * @param iOrigin Mandatory Reference parameter.
   * @param iSupport Mandatory Reference parameter.
   * @param iDepth Mandatory double parameter.
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.Hole
   */

  @DISPID(1611005958) //= 0x60060006. The runtime will prefer the VTID if present
  @VTID(28)
  Hole addNewHoleFromRefPoint(
    Reference iOrigin,
    Reference iSupport,
    double iDepth);


  /**
   * @param iX Mandatory double parameter.
   * @param iY Mandatory double parameter.
   * @param iZ Mandatory double parameter.
   * @param iEdge Mandatory Reference parameter.
   * @param iSupport Mandatory Reference parameter.
   * @param iDepth Mandatory double parameter.
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.Hole
   */

  @DISPID(1611005959) //= 0x60060007. The runtime will prefer the VTID if present
  @VTID(29)
  Hole addNewHoleWithConstraint(
    double iX,
    double iY,
    double iZ,
    Reference iEdge,
    Reference iSupport,
    double iDepth);


  /**
   * @param iX Mandatory double parameter.
   * @param iY Mandatory double parameter.
   * @param iZ Mandatory double parameter.
   * @param iEdge1 Mandatory Reference parameter.
   * @param iEdge2 Mandatory Reference parameter.
   * @param iSupport Mandatory Reference parameter.
   * @param iDepth Mandatory double parameter.
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.Hole
   */

  @DISPID(1611005960) //= 0x60060008. The runtime will prefer the VTID if present
  @VTID(30)
  Hole addNewHoleWith2Constraints(
    double iX,
    double iY,
    double iZ,
    Reference iEdge1,
    Reference iEdge2,
    Reference iSupport,
    double iDepth);


  /**
   * @param iSketch Mandatory CatiaV5TypeLibs.PartItfTypeLib.Sketch parameter.
   * @param iDepth Mandatory double parameter.
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.Hole
   */

  @DISPID(1611005961) //= 0x60060009. The runtime will prefer the VTID if present
  @VTID(31)
  Hole addNewHoleFromSketch(
    Sketch iSketch,
    double iDepth);


  /**
   * @param iSketch Mandatory CatiaV5TypeLibs.PartItfTypeLib.Sketch parameter.
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.Shaft
   */

  @DISPID(1611005962) //= 0x6006000a. The runtime will prefer the VTID if present
  @VTID(32)
  Shaft addNewShaft(
    Sketch iSketch);


  /**
   * @param iSketch Mandatory CatiaV5TypeLibs.PartItfTypeLib.Sketch parameter.
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.Groove
   */

  @DISPID(1611005963) //= 0x6006000b. The runtime will prefer the VTID if present
  @VTID(33)
  Groove addNewGroove(
    Sketch iSketch);


  /**
   * @param iProfileElt Mandatory Reference parameter.
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.Shaft
   */

  @DISPID(1611005964) //= 0x6006000c. The runtime will prefer the VTID if present
  @VTID(34)
  Shaft addNewShaftFromRef(
    Reference iProfileElt);


  /**
   * @param iProfileElt Mandatory Reference parameter.
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.Groove
   */

  @DISPID(1611005965) //= 0x6006000d. The runtime will prefer the VTID if present
  @VTID(35)
  Groove addNewGrooveFromRef(
    Reference iProfileElt);


  /**
   * @param iLateralFace Mandatory Reference parameter.
   * @param iLimitFace Mandatory Reference parameter.
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.Thread
   */

  @DISPID(1611005966) //= 0x6006000e. The runtime will prefer the VTID if present
  @VTID(36)
  Thread addNewThreadWithRef(
    Reference iLateralFace,
    Reference iLimitFace);


  /**
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.Thread
   */

  @DISPID(1611005967) //= 0x6006000f. The runtime will prefer the VTID if present
  @VTID(37)
  Thread addNewThreadWithOutRef();


  /**
   * @param iSketch Mandatory CatiaV5TypeLibs.PartItfTypeLib.Sketch parameter.
   * @param iCenterCurve Mandatory CatiaV5TypeLibs.PartItfTypeLib.Sketch parameter.
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.Rib
   */

  @DISPID(1611005968) //= 0x60060010. The runtime will prefer the VTID if present
  @VTID(38)
  Rib addNewRib(
    Sketch iSketch,
    Sketch iCenterCurve);


  /**
   * @param iProfile Mandatory Reference parameter.
   * @param iCenterCurve Mandatory Reference parameter.
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.Rib
   */

  @DISPID(1611005969) //= 0x60060011. The runtime will prefer the VTID if present
  @VTID(39)
  Rib addNewRibFromRef(
    Reference iProfile,
    Reference iCenterCurve);


  /**
   * @param iSketch Mandatory CatiaV5TypeLibs.PartItfTypeLib.Sketch parameter.
   * @param iCenterCurve Mandatory CatiaV5TypeLibs.PartItfTypeLib.Sketch parameter.
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.Slot
   */

  @DISPID(1611005970) //= 0x60060012. The runtime will prefer the VTID if present
  @VTID(40)
  Slot addNewSlot(
    Sketch iSketch,
    Sketch iCenterCurve);


  /**
   * @param iProfile Mandatory Reference parameter.
   * @param iCenterCurve Mandatory Reference parameter.
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.Slot
   */

  @DISPID(1611005971) //= 0x60060013. The runtime will prefer the VTID if present
  @VTID(41)
  Slot addNewSlotFromRef(
    Reference iProfile,
    Reference iCenterCurve);


  /**
   * @param iSketch Mandatory CatiaV5TypeLibs.PartItfTypeLib.Sketch parameter.
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.Stiffener
   */

  @DISPID(1611005972) //= 0x60060014. The runtime will prefer the VTID if present
  @VTID(42)
  Stiffener addNewStiffener(
    Sketch iSketch);


  /**
   * @param iProfileElt Mandatory Reference parameter.
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.Stiffener
   */

  @DISPID(1611005973) //= 0x60060015. The runtime will prefer the VTID if present
  @VTID(43)
  Stiffener addNewStiffenerFromRef(
    Reference iProfileElt);


  /**
   * @param iScalingReference Mandatory Reference parameter.
   * @param iFactor Mandatory double parameter.
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.Scaling
   */

  @DISPID(1611005974) //= 0x60060016. The runtime will prefer the VTID if present
  @VTID(44)
  Scaling addNewScaling(
    Reference iScalingReference,
    double iFactor);


  /**
   * @param iF1 Mandatory Reference parameter.
   * @param iF2 Mandatory Reference parameter.
   * @param iRadius Mandatory double parameter.
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.FaceFillet
   */

  @DISPID(1611005975) //= 0x60060017. The runtime will prefer the VTID if present
  @VTID(45)
  FaceFillet addNewFaceFillet(
    Reference iF1,
    Reference iF2,
    double iRadius);


  /**
   * @param iEdgeToFillet Mandatory Reference parameter.
   * @param iPropagMode Mandatory CatiaV5TypeLibs.PartItfTypeLib.CatFilletEdgePropagation parameter.
   * @param iRadius Mandatory double parameter.
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.ConstRadEdgeFillet
   */

  @DISPID(1611005976) //= 0x60060018. The runtime will prefer the VTID if present
  @VTID(46)
  ConstRadEdgeFillet addNewEdgeFilletWithConstantRadius(
    Reference iEdgeToFillet,
    CatFilletEdgePropagation iPropagMode,
    double iRadius);


  /**
   * @param iEdgeToFillet Mandatory Reference parameter.
   * @param iPropagMode Mandatory CatiaV5TypeLibs.PartItfTypeLib.CatFilletEdgePropagation parameter.
   * @param iVariationMode Mandatory CatiaV5TypeLibs.PartItfTypeLib.CatFilletVariation parameter.
   * @param iDefaultRadius Mandatory double parameter.
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.VarRadEdgeFillet
   */

  @DISPID(1611005977) //= 0x60060019. The runtime will prefer the VTID if present
  @VTID(47)
  VarRadEdgeFillet addNewEdgeFilletWithVaryingRadius(
    Reference iEdgeToFillet,
    CatFilletEdgePropagation iPropagMode,
    CatFilletVariation iVariationMode,
    double iDefaultRadius);


  /**
   * @param iF1 Mandatory Reference parameter.
   * @param iF2 Mandatory Reference parameter.
   * @param iRemovedFace Mandatory Reference parameter.
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.TritangentFillet
   */

  @DISPID(1611005978) //= 0x6006001a. The runtime will prefer the VTID if present
  @VTID(48)
  TritangentFillet addNewTritangentFillet(
    Reference iF1,
    Reference iF2,
    Reference iRemovedFace);


  /**
   * @param iFaceToDraft Mandatory Reference parameter.
   * @param iNeutral Mandatory Reference parameter.
   * @param iNeutralMode Mandatory CatiaV5TypeLibs.PartItfTypeLib.CatDraftNeutralPropagationMode parameter.
   * @param iParting Mandatory Reference parameter.
   * @param iDirX Mandatory double parameter.
   * @param iDirY Mandatory double parameter.
   * @param iDirZ Mandatory double parameter.
   * @param iMode Mandatory CatiaV5TypeLibs.PartItfTypeLib.CatDraftMode parameter.
   * @param iAngle Mandatory double parameter.
   * @param iMultiselectionMode Mandatory CatiaV5TypeLibs.PartItfTypeLib.CatDraftMultiselectionMode parameter.
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.Draft
   */

  @DISPID(1611005979) //= 0x6006001b. The runtime will prefer the VTID if present
  @VTID(49)
  Draft addNewDraft(
    Reference iFaceToDraft,
    Reference iNeutral,
    CatDraftNeutralPropagationMode iNeutralMode,
    Reference iParting,
    double iDirX,
    double iDirY,
    double iDirZ,
    CatDraftMode iMode,
    double iAngle,
    CatDraftMultiselectionMode iMultiselectionMode);


  /**
   * @param iFaceToDraft Mandatory Reference parameter.
   * @param iNeutral Mandatory Reference parameter.
   * @param iNeutralMode Mandatory CatiaV5TypeLibs.PartItfTypeLib.CatDraftNeutralPropagationMode parameter.
   * @param iParting Mandatory Reference parameter.
   * @param iDirX Mandatory double parameter.
   * @param iDirY Mandatory double parameter.
   * @param iDirZ Mandatory double parameter.
   * @param iMode Mandatory CatiaV5TypeLibs.PartItfTypeLib.CatDraftMode parameter.
   * @param iAngle Mandatory double parameter.
   * @param iMultiselectionMode Mandatory CatiaV5TypeLibs.PartItfTypeLib.CatDraftMultiselectionMode parameter.
   * @param iType Mandatory int parameter.
   * @param iVolumeSupport Mandatory Reference parameter.
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.Draft
   */

  @DISPID(1611005980) //= 0x6006001c. The runtime will prefer the VTID if present
  @VTID(50)
  Draft addNewVolumicDraft(
    Reference iFaceToDraft,
    Reference iNeutral,
    CatDraftNeutralPropagationMode iNeutralMode,
    Reference iParting,
    double iDirX,
    double iDirY,
    double iDirZ,
    CatDraftMode iMode,
    double iAngle,
    CatDraftMultiselectionMode iMultiselectionMode,
    int iType,
    Reference iVolumeSupport);


  /**
   * @param iFaceToRemove Mandatory Reference parameter.
   * @param iInternalThickness Mandatory double parameter.
   * @param iExternalThickness Mandatory double parameter.
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.Shell
   */

  @DISPID(1611005981) //= 0x6006001d. The runtime will prefer the VTID if present
  @VTID(51)
  Shell addNewShell(
    Reference iFaceToRemove,
    double iInternalThickness,
    double iExternalThickness);


  /**
   * @param iFaceToThicken Mandatory Reference parameter.
   * @param iOffset Mandatory double parameter.
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.Thickness
   */

  @DISPID(1611005982) //= 0x6006001e. The runtime will prefer the VTID if present
  @VTID(52)
  Thickness addNewThickness(
    Reference iFaceToThicken,
    double iOffset);


  /**
   * @param iObjectToChamfer Mandatory Reference parameter.
   * @param iPropagation Mandatory CatiaV5TypeLibs.PartItfTypeLib.CatChamferPropagation parameter.
   * @param iMode Mandatory CatiaV5TypeLibs.PartItfTypeLib.CatChamferMode parameter.
   * @param iOrientation Mandatory CatiaV5TypeLibs.PartItfTypeLib.CatChamferOrientation parameter.
   * @param iLength1 Mandatory double parameter.
   * @param iLength2OrAngle Mandatory double parameter.
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.Chamfer
   */

  @DISPID(1611005983) //= 0x6006001f. The runtime will prefer the VTID if present
  @VTID(53)
  Chamfer addNewChamfer(
    Reference iObjectToChamfer,
    CatChamferPropagation iPropagation,
    CatChamferMode iMode,
    CatChamferOrientation iOrientation,
    double iLength1,
    double iLength2OrAngle);


  /**
   * @param iMirroringElement Mandatory Reference parameter.
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.Mirror
   */

  @DISPID(1611005984) //= 0x60060020. The runtime will prefer the VTID if present
  @VTID(54)
  Mirror addNewMirror(
    Reference iMirroringElement);


  /**
   * @param iShapeToCopy Mandatory AnyObject parameter.
   * @param iNbOfCopiesInDir1 Mandatory int parameter.
   * @param iNbOfCopiesInDir2 Mandatory int parameter.
   * @param iStepInDir1 Mandatory double parameter.
   * @param iStepInDir2 Mandatory double parameter.
   * @param iShapeToCopyPositionAlongDir1 Mandatory int parameter.
   * @param iShapeToCopyPositionAlongDir2 Mandatory int parameter.
   * @param iDir1 Mandatory Reference parameter.
   * @param iDir2 Mandatory Reference parameter.
   * @param iIsReversedDir1 Mandatory boolean parameter.
   * @param iIsReversedDir2 Mandatory boolean parameter.
   * @param iRotationAngle Mandatory double parameter.
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.RectPattern
   */

  @DISPID(1611005985) //= 0x60060021. The runtime will prefer the VTID if present
  @VTID(55)
  RectPattern addNewRectPattern(
    AnyObject iShapeToCopy,
    int iNbOfCopiesInDir1,
    int iNbOfCopiesInDir2,
    double iStepInDir1,
    double iStepInDir2,
    int iShapeToCopyPositionAlongDir1,
    int iShapeToCopyPositionAlongDir2,
    Reference iDir1,
    Reference iDir2,
    boolean iIsReversedDir1,
    boolean iIsReversedDir2,
    double iRotationAngle);


  /**
   * @param iShapeToCopy Mandatory AnyObject parameter.
   * @param iNbOfCopiesInDir1 Mandatory int parameter.
   * @param iNbOfCopiesInDir2 Mandatory int parameter.
   * @param iStepInDir1 Mandatory double parameter.
   * @param iStepInDir2 Mandatory double parameter.
   * @param iShapeToCopyPositionAlongDir1 Mandatory int parameter.
   * @param iShapeToCopyPositionAlongDir2 Mandatory int parameter.
   * @param iDir1 Mandatory Reference parameter.
   * @param iDir2 Mandatory Reference parameter.
   * @param iIsReversedDir1 Mandatory boolean parameter.
   * @param iIsReversedDir2 Mandatory boolean parameter.
   * @param iRotationAngle Mandatory double parameter.
   * @param iType Mandatory double parameter.
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.RectPattern
   */

  @DISPID(1611005986) //= 0x60060022. The runtime will prefer the VTID if present
  @VTID(56)
  RectPattern addNewGSDRectPattern(
    AnyObject iShapeToCopy,
    int iNbOfCopiesInDir1,
    int iNbOfCopiesInDir2,
    double iStepInDir1,
    double iStepInDir2,
    int iShapeToCopyPositionAlongDir1,
    int iShapeToCopyPositionAlongDir2,
    Reference iDir1,
    Reference iDir2,
    boolean iIsReversedDir1,
    boolean iIsReversedDir2,
    double iRotationAngle,
    double iType);


  /**
   * @param iShapeToCopy Mandatory AnyObject parameter.
   * @param iNbOfCopiesInDir1 Mandatory int parameter.
   * @param iNbOfCopiesInDir2 Mandatory int parameter.
   * @param iStepInDir1 Mandatory double parameter.
   * @param iStepInDir2 Mandatory double parameter.
   * @param iShapeToCopyPositionAlongDir1 Mandatory int parameter.
   * @param iShapeToCopyPositionAlongDir2 Mandatory int parameter.
   * @param iDir1 Mandatory Reference parameter.
   * @param iDir2 Mandatory Reference parameter.
   * @param iIsReversedDir1 Mandatory boolean parameter.
   * @param iIsReversedDir2 Mandatory boolean parameter.
   * @param iRotationAngle Mandatory double parameter.
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.RectPattern
   */

  @DISPID(1611005987) //= 0x60060023. The runtime will prefer the VTID if present
  @VTID(57)
  RectPattern addNewSurfacicRectPattern(
    AnyObject iShapeToCopy,
    int iNbOfCopiesInDir1,
    int iNbOfCopiesInDir2,
    double iStepInDir1,
    double iStepInDir2,
    int iShapeToCopyPositionAlongDir1,
    int iShapeToCopyPositionAlongDir2,
    Reference iDir1,
    Reference iDir2,
    boolean iIsReversedDir1,
    boolean iIsReversedDir2,
    double iRotationAngle);


  /**
   * @param iShapeToCopy Mandatory AnyObject parameter.
   * @param iNbOfCopiesInRadialDir Mandatory int parameter.
   * @param iNbOfCopiesInAngularDir Mandatory int parameter.
   * @param iStepInRadialDir Mandatory double parameter.
   * @param iStepInAngularDir Mandatory double parameter.
   * @param iShapeToCopyPositionAlongRadialDir Mandatory int parameter.
   * @param iShapeToCopyPositionAlongAngularDir Mandatory int parameter.
   * @param iRotationCenter Mandatory Reference parameter.
   * @param iRotationAxis Mandatory Reference parameter.
   * @param iIsReversedRotationAxis Mandatory boolean parameter.
   * @param iRotationAngle Mandatory double parameter.
   * @param iIsRadiusAligned Mandatory boolean parameter.
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.CircPattern
   */

  @DISPID(1611005988) //= 0x60060024. The runtime will prefer the VTID if present
  @VTID(58)
  CircPattern addNewCircPattern(
    AnyObject iShapeToCopy,
    int iNbOfCopiesInRadialDir,
    int iNbOfCopiesInAngularDir,
    double iStepInRadialDir,
    double iStepInAngularDir,
    int iShapeToCopyPositionAlongRadialDir,
    int iShapeToCopyPositionAlongAngularDir,
    Reference iRotationCenter,
    Reference iRotationAxis,
    boolean iIsReversedRotationAxis,
    double iRotationAngle,
    boolean iIsRadiusAligned);


  /**
   * @param iShapeToCopy Mandatory AnyObject parameter.
   * @param iNbOfCopiesInRadialDir Mandatory int parameter.
   * @param iNbOfCopiesInAngularDir Mandatory int parameter.
   * @param iStepInRadialDir Mandatory double parameter.
   * @param iStepInAngularDir Mandatory double parameter.
   * @param iShapeToCopyPositionAlongRadialDir Mandatory int parameter.
   * @param iShapeToCopyPositionAlongAngularDir Mandatory int parameter.
   * @param iRotationCenter Mandatory Reference parameter.
   * @param iRotationAxis Mandatory Reference parameter.
   * @param iIsReversedRotationAxis Mandatory boolean parameter.
   * @param iRotationAngle Mandatory double parameter.
   * @param iIsRadiusAligned Mandatory boolean parameter.
   * @param iCompleteCrown Mandatory boolean parameter.
   * @param iType Mandatory double parameter.
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.CircPattern
   */

  @DISPID(1611005989) //= 0x60060025. The runtime will prefer the VTID if present
  @VTID(59)
  CircPattern addNewGSDCircPattern(
    AnyObject iShapeToCopy,
    int iNbOfCopiesInRadialDir,
    int iNbOfCopiesInAngularDir,
    double iStepInRadialDir,
    double iStepInAngularDir,
    int iShapeToCopyPositionAlongRadialDir,
    int iShapeToCopyPositionAlongAngularDir,
    Reference iRotationCenter,
    Reference iRotationAxis,
    boolean iIsReversedRotationAxis,
    double iRotationAngle,
    boolean iIsRadiusAligned,
    boolean iCompleteCrown,
    double iType);


  /**
   * @param iShapeToCopy Mandatory AnyObject parameter.
   * @param iNbOfCopiesInRadialDir Mandatory int parameter.
   * @param iNbOfCopiesInAngularDir Mandatory int parameter.
   * @param iStepInRadialDir Mandatory double parameter.
   * @param iStepInAngularDir Mandatory double parameter.
   * @param iShapeToCopyPositionAlongRadialDir Mandatory int parameter.
   * @param iShapeToCopyPositionAlongAngularDir Mandatory int parameter.
   * @param iRotationCenter Mandatory Reference parameter.
   * @param iRotationAxis Mandatory Reference parameter.
   * @param iIsReversedRotationAxis Mandatory boolean parameter.
   * @param iRotationAngle Mandatory double parameter.
   * @param iIsRadiusAligned Mandatory boolean parameter.
   * @param iCompleteCrown Mandatory boolean parameter.
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.CircPattern
   */

  @DISPID(1611005990) //= 0x60060026. The runtime will prefer the VTID if present
  @VTID(60)
  CircPattern addNewSurfacicCircPattern(
    AnyObject iShapeToCopy,
    int iNbOfCopiesInRadialDir,
    int iNbOfCopiesInAngularDir,
    double iStepInRadialDir,
    double iStepInAngularDir,
    int iShapeToCopyPositionAlongRadialDir,
    int iShapeToCopyPositionAlongAngularDir,
    Reference iRotationCenter,
    Reference iRotationAxis,
    boolean iIsReversedRotationAxis,
    double iRotationAngle,
    boolean iIsRadiusAligned,
    boolean iCompleteCrown);


  /**
   * @param iShapeToCopy Mandatory AnyObject parameter.
   * @param iNbOfCopies Mandatory int parameter.
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.UserPattern
   */

  @DISPID(1611005991) //= 0x60060027. The runtime will prefer the VTID if present
  @VTID(61)
  UserPattern addNewUserPattern(
    AnyObject iShapeToCopy,
    int iNbOfCopies);


  /**
   * @param iShapeToCopy Mandatory AnyObject parameter.
   * @param iNbOfCopies Mandatory int parameter.
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.UserPattern
   */

  @DISPID(1611005992) //= 0x60060028. The runtime will prefer the VTID if present
  @VTID(62)
  UserPattern addNewSurfacicUserPattern(
    AnyObject iShapeToCopy,
    int iNbOfCopies);


  /**
   * @param iShapeToCopy Mandatory AnyObject parameter.
   * @param iNbOfCopiesInDir1 Mandatory int parameter.
   * @param iNbOfCopiesInDir2 Mandatory int parameter.
   * @param iStepInDir1 Mandatory double parameter.
   * @param iStepInDir2 Mandatory double parameter.
   * @param iShapeToCopyPositionAlongDir1 Mandatory int parameter.
   * @param iShapeToCopyPositionAlongDir2 Mandatory int parameter.
   * @param iDir1 Mandatory Reference parameter.
   * @param iDir2 Mandatory Reference parameter.
   * @param iIsReversedDir1 Mandatory boolean parameter.
   * @param iIsReversedDir2 Mandatory boolean parameter.
   * @param iRotationAngle Mandatory double parameter.
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.RectPattern
   */

  @DISPID(1611005993) //= 0x60060029. The runtime will prefer the VTID if present
  @VTID(63)
  RectPattern addNewRectPatternofList(
    AnyObject iShapeToCopy,
    int iNbOfCopiesInDir1,
    int iNbOfCopiesInDir2,
    double iStepInDir1,
    double iStepInDir2,
    int iShapeToCopyPositionAlongDir1,
    int iShapeToCopyPositionAlongDir2,
    Reference iDir1,
    Reference iDir2,
    boolean iIsReversedDir1,
    boolean iIsReversedDir2,
    double iRotationAngle);


  /**
   * @param iShapeToCopy Mandatory AnyObject parameter.
   * @param iNbOfCopiesInRadialDir Mandatory int parameter.
   * @param iNbOfCopiesInAngularDir Mandatory int parameter.
   * @param iStepInRadialDir Mandatory double parameter.
   * @param iStepInAngularDir Mandatory double parameter.
   * @param iShapeToCopyPositionAlongRadialDir Mandatory int parameter.
   * @param iShapeToCopyPositionAlongAngularDir Mandatory int parameter.
   * @param iRotationCenter Mandatory Reference parameter.
   * @param iRotationAxis Mandatory Reference parameter.
   * @param iIsReversedRotationAxis Mandatory boolean parameter.
   * @param iRotationAngle Mandatory double parameter.
   * @param iIsRadiusAligned Mandatory boolean parameter.
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.CircPattern
   */

  @DISPID(1611005994) //= 0x6006002a. The runtime will prefer the VTID if present
  @VTID(64)
  CircPattern addNewCircPatternofList(
    AnyObject iShapeToCopy,
    int iNbOfCopiesInRadialDir,
    int iNbOfCopiesInAngularDir,
    double iStepInRadialDir,
    double iStepInAngularDir,
    int iShapeToCopyPositionAlongRadialDir,
    int iShapeToCopyPositionAlongAngularDir,
    Reference iRotationCenter,
    Reference iRotationAxis,
    boolean iIsReversedRotationAxis,
    double iRotationAngle,
    boolean iIsRadiusAligned);


  /**
   * @param iShapeToCopy Mandatory AnyObject parameter.
   * @param iNbOfCopies Mandatory int parameter.
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.UserPattern
   */

  @DISPID(1611005995) //= 0x6006002b. The runtime will prefer the VTID if present
  @VTID(65)
  UserPattern addNewUserPatternofList(
    AnyObject iShapeToCopy,
    int iNbOfCopies);


  /**
   * @param iBodyToAssemble Mandatory CatiaV5TypeLibs.PartItfTypeLib.Body parameter.
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.Assemble
   */

  @DISPID(1611005996) //= 0x6006002c. The runtime will prefer the VTID if present
  @VTID(66)
  Assemble addNewAssemble(
    Body iBodyToAssemble);


  /**
   * @param iBodyToAdd Mandatory CatiaV5TypeLibs.PartItfTypeLib.Body parameter.
   * @return  Returns a value of type Add
   */

  @DISPID(1611005997) //= 0x6006002d. The runtime will prefer the VTID if present
  @VTID(67)
  Add addNewAdd(
    Body iBodyToAdd);


  /**
   * @param iBodyToRemove Mandatory CatiaV5TypeLibs.PartItfTypeLib.Body parameter.
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.Remove
   */

  @DISPID(1611005998) //= 0x6006002e. The runtime will prefer the VTID if present
  @VTID(68)
  Remove addNewRemove(
    Body iBodyToRemove);


  /**
   * @param iBodyToIntersect Mandatory CatiaV5TypeLibs.PartItfTypeLib.Body parameter.
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.Intersect
   */

  @DISPID(1611005999) //= 0x6006002f. The runtime will prefer the VTID if present
  @VTID(69)
  Intersect addNewIntersect(
    Body iBodyToIntersect);


  /**
   * @param iBodyToTrim Mandatory CatiaV5TypeLibs.PartItfTypeLib.Body parameter.
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.Trim
   */

  @DISPID(1611006000) //= 0x60060030. The runtime will prefer the VTID if present
  @VTID(70)
  Trim addNewTrim(
    Body iBodyToTrim);


  /**
   * @param iSplittingElement Mandatory Reference parameter.
   * @param iSplitSide Mandatory CatiaV5TypeLibs.PartItfTypeLib.CatSplitSide parameter.
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.Split
   */

  @DISPID(1611006001) //= 0x60060031. The runtime will prefer the VTID if present
  @VTID(71)
  Split addNewSplit(
    Reference iSplittingElement,
    CatSplitSide iSplitSide);


  /**
   * @param iSewingElement Mandatory Reference parameter.
   * @param iSewingSide Mandatory CatiaV5TypeLibs.PartItfTypeLib.CatSplitSide parameter.
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.SewSurface
   */

  @DISPID(1611006002) //= 0x60060032. The runtime will prefer the VTID if present
  @VTID(72)
  SewSurface addNewSewSurface(
    Reference iSewingElement,
    CatSplitSide iSewingSide);


  /**
   * @param iCloseElement Mandatory Reference parameter.
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.CloseSurface
   */

  @DISPID(1611006003) //= 0x60060033. The runtime will prefer the VTID if present
  @VTID(73)
  CloseSurface addNewCloseSurface(
    Reference iCloseElement);


  /**
   * @param iOffsetElement Mandatory Reference parameter.
   * @param iIsensOffset Mandatory int parameter.
   * @param iTopOffset Mandatory double parameter.
   * @param iBotOffset Mandatory double parameter.
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.ThickSurface
   */

  @DISPID(1611006004) //= 0x60060034. The runtime will prefer the VTID if present
  @VTID(74)
  ThickSurface addNewThickSurface(
    Reference iOffsetElement,
    int iIsensOffset,
    double iTopOffset,
    double iBotOffset);


  /**
   * @return  Returns a value of type AnyObject
   */

  @DISPID(1611006005) //= 0x60060035. The runtime will prefer the VTID if present
  @VTID(75)
  AnyObject addNewLoft();


  /**
   * @return  Returns a value of type AnyObject
   */

  @DISPID(1611006006) //= 0x60060036. The runtime will prefer the VTID if present
  @VTID(76)
  AnyObject addNewRemovedLoft();


  /**
   * @return  Returns a value of type AnyObject
   */

  @DISPID(1611006007) //= 0x60060037. The runtime will prefer the VTID if present
  @VTID(77)
  AnyObject addNewBlend();


  /**
   * @return  Returns a value of type AnyObject
   */

  @DISPID(1611006008) //= 0x60060038. The runtime will prefer the VTID if present
  @VTID(78)
  AnyObject addNewRemovedBlend();


  /**
   * @param iReference Mandatory Reference parameter.
   * @return  Returns a value of type AnyObject
   */

  @DISPID(1611006009) //= 0x60060039. The runtime will prefer the VTID if present
  @VTID(79)
  AnyObject addNewSymmetry2(
    Reference iReference);


  /**
   * @param iDistance Mandatory double parameter.
   * @return  Returns a value of type AnyObject
   */

  @DISPID(1611006010) //= 0x6006003a. The runtime will prefer the VTID if present
  @VTID(80)
  AnyObject addNewTranslate2(
    double iDistance);


  /**
   * @param iScalingReference Mandatory Reference parameter.
   * @param iFactor Mandatory double parameter.
   * @return  Returns a value of type AnyObject
   */

  @DISPID(1611006011) //= 0x6006003b. The runtime will prefer the VTID if present
  @VTID(81)
  AnyObject addNewScaling2(
    Reference iScalingReference,
    double iFactor);


  /**
   * @param iAxis Mandatory Reference parameter.
   * @param iAngle Mandatory double parameter.
   * @return  Returns a value of type AnyObject
   */

  @DISPID(1611006012) //= 0x6006003c. The runtime will prefer the VTID if present
  @VTID(82)
  AnyObject addNewRotate2(
    Reference iAxis,
    double iAngle);


  /**
   * @param iProfileEltFirst Mandatory Reference parameter.
   * @param iProfileEltSecond Mandatory Reference parameter.
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.SolidCombine
   */

  @DISPID(1611006013) //= 0x6006003d. The runtime will prefer the VTID if present
  @VTID(83)
  SolidCombine addNewSolidCombine(
    Reference iProfileEltFirst,
    Reference iProfileEltSecond);


  /**
   * @param iKeepFaces Mandatory Reference parameter.
   * @param iRemoveFaces Mandatory Reference parameter.
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.RemoveFace
   */

  @DISPID(1611006014) //= 0x6006003e. The runtime will prefer the VTID if present
  @VTID(84)
  RemoveFace addNewRemoveFace(
    Reference iKeepFaces,
    Reference iRemoveFaces);


  /**
   * @param iSplitPlane Mandatory Reference parameter.
   * @param iRemoveFace Mandatory Reference parameter.
   * @param iSplittingSide Mandatory CatiaV5TypeLibs.PartItfTypeLib.CatSplitSide parameter.
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.ReplaceFace
   */

  @DISPID(1611006015) //= 0x6006003f. The runtime will prefer the VTID if present
  @VTID(85)
  ReplaceFace addNewReplaceFace(
    Reference iSplitPlane,
    Reference iRemoveFace,
    CatSplitSide iSplittingSide);


  /**
   * @param iBody1 Mandatory Reference parameter.
   * @param iBody2 Mandatory Reference parameter.
   * @param iType Mandatory double parameter.
   * @return  Returns a value of type Add
   */

  @DISPID(1611006016) //= 0x60060040. The runtime will prefer the VTID if present
  @VTID(86)
  Add addNewVolumeAdd(
    Reference iBody1,
    Reference iBody2,
    double iType);


  /**
   * @param iBody1 Mandatory Reference parameter.
   * @param iBody2 Mandatory Reference parameter.
   * @param iType Mandatory double parameter.
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.Remove
   */

  @DISPID(1611006017) //= 0x60060041. The runtime will prefer the VTID if present
  @VTID(87)
  Remove addNewVolumeRemove(
    Reference iBody1,
    Reference iBody2,
    double iType);


  /**
   * @param iBody1 Mandatory Reference parameter.
   * @param iBody2 Mandatory Reference parameter.
   * @param iType Mandatory double parameter.
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.Intersect
   */

  @DISPID(1611006018) //= 0x60060042. The runtime will prefer the VTID if present
  @VTID(88)
  Intersect addNewVolumeIntersect(
    Reference iBody1,
    Reference iBody2,
    double iType);


  /**
   * @param iType Mandatory int parameter.
   * @param iSupportVolume Mandatory Reference parameter.
   * @param iSewingElement Mandatory Reference parameter.
   * @param iSewingSide Mandatory CatiaV5TypeLibs.PartItfTypeLib.CatSplitSide parameter.
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.SewSurface
   */

  @DISPID(1611006019) //= 0x60060043. The runtime will prefer the VTID if present
  @VTID(89)
  SewSurface addNewVolumeSewSurface(
    int iType,
    Reference iSupportVolume,
    Reference iSewingElement,
    CatSplitSide iSewingSide);


  /**
   * @param iFaceToRemove Mandatory Reference parameter.
   * @param iInternalThickness Mandatory double parameter.
   * @param iExternalThickness Mandatory double parameter.
   * @param iVolumeSupport Mandatory Reference parameter.
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.Shell
   */

  @DISPID(1611006020) //= 0x60060044. The runtime will prefer the VTID if present
  @VTID(90)
  Shell addNewVolumeShell(
    Reference iFaceToRemove,
    double iInternalThickness,
    double iExternalThickness,
    Reference iVolumeSupport);


  /**
   * @param iSupportVolume Mandatory Reference parameter.
   * @param iCuttingVolume Mandatory Reference parameter.
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.Trim
   */

  @DISPID(1611006021) //= 0x60060045. The runtime will prefer the VTID if present
  @VTID(91)
  Trim addNewVolumeTrim(
    Reference iSupportVolume,
    Reference iCuttingVolume);


  /**
   * @param iCloseElement Mandatory Reference parameter.
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.CloseSurface
   */

  @DISPID(1611006022) //= 0x60060046. The runtime will prefer the VTID if present
  @VTID(92)
  CloseSurface addNewVolumeCloseSurface(
    Reference iCloseElement);


  /**
   * @param iOffsetElement Mandatory Reference parameter.
   * @param iIsensOffset Mandatory int parameter.
   * @param iTopOffset Mandatory double parameter.
   * @param iBotOffset Mandatory double parameter.
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.ThickSurface
   */

  @DISPID(1611006023) //= 0x60060047. The runtime will prefer the VTID if present
  @VTID(93)
  ThickSurface addNewVolumeThickSurface(
    Reference iOffsetElement,
    int iIsensOffset,
    double iTopOffset,
    double iBotOffset);


  /**
   * @param iF1 Mandatory Reference parameter.
   * @param iF2 Mandatory Reference parameter.
   * @param iRadius Mandatory double parameter.
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.FaceFillet
   */

  @DISPID(1611006024) //= 0x60060048. The runtime will prefer the VTID if present
  @VTID(94)
  FaceFillet addNewSolidFaceFillet(
    Reference iF1,
    Reference iF2,
    double iRadius);


  /**
   * @param iEdgeToFillet Mandatory Reference parameter.
   * @param iPropagMode Mandatory CatiaV5TypeLibs.PartItfTypeLib.CatFilletEdgePropagation parameter.
   * @param iRadius Mandatory double parameter.
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.ConstRadEdgeFillet
   */

  @DISPID(1611006025) //= 0x60060049. The runtime will prefer the VTID if present
  @VTID(95)
  ConstRadEdgeFillet addNewSolidEdgeFilletWithConstantRadius(
    Reference iEdgeToFillet,
    CatFilletEdgePropagation iPropagMode,
    double iRadius);


  /**
   * @param iEdgeToFillet Mandatory Reference parameter.
   * @param iPropagMode Mandatory CatiaV5TypeLibs.PartItfTypeLib.CatFilletEdgePropagation parameter.
   * @param iVariationMode Mandatory CatiaV5TypeLibs.PartItfTypeLib.CatFilletVariation parameter.
   * @param iDefaultRadius Mandatory double parameter.
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.VarRadEdgeFillet
   */

  @DISPID(1611006026) //= 0x6006004a. The runtime will prefer the VTID if present
  @VTID(96)
  VarRadEdgeFillet addNewSolidEdgeFilletWithVaryingRadius(
    Reference iEdgeToFillet,
    CatFilletEdgePropagation iPropagMode,
    CatFilletVariation iVariationMode,
    double iDefaultRadius);


  /**
   * @param iF1 Mandatory Reference parameter.
   * @param iF2 Mandatory Reference parameter.
   * @param iRemovedFace Mandatory Reference parameter.
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.TritangentFillet
   */

  @DISPID(1611006027) //= 0x6006004b. The runtime will prefer the VTID if present
  @VTID(97)
  TritangentFillet addNewSolidTritangentFillet(
    Reference iF1,
    Reference iF2,
    Reference iRemovedFace);


  /**
   * @param iF1 Mandatory Reference parameter.
   * @param iF2 Mandatory Reference parameter.
   * @param iRadius Mandatory double parameter.
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.FaceFillet
   */

  @DISPID(1611006028) //= 0x6006004c. The runtime will prefer the VTID if present
  @VTID(98)
  FaceFillet addNewSurfaceFaceFillet(
    Reference iF1,
    Reference iF2,
    double iRadius);


  /**
   * @param iEdgeToFillet Mandatory Reference parameter.
   * @param iPropagMode Mandatory CatiaV5TypeLibs.PartItfTypeLib.CatFilletEdgePropagation parameter.
   * @param iRadius Mandatory double parameter.
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.ConstRadEdgeFillet
   */

  @DISPID(1611006029) //= 0x6006004d. The runtime will prefer the VTID if present
  @VTID(99)
  ConstRadEdgeFillet addNewSurfaceEdgeFilletWithConstantRadius(
    Reference iEdgeToFillet,
    CatFilletEdgePropagation iPropagMode,
    double iRadius);


  /**
   * @param iEdgeToFillet Mandatory Reference parameter.
   * @param iPropagMode Mandatory CatiaV5TypeLibs.PartItfTypeLib.CatFilletEdgePropagation parameter.
   * @param iVariationMode Mandatory CatiaV5TypeLibs.PartItfTypeLib.CatFilletVariation parameter.
   * @param iDefaultRadius Mandatory double parameter.
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.VarRadEdgeFillet
   */

  @DISPID(1611006030) //= 0x6006004e. The runtime will prefer the VTID if present
  @VTID(100)
  VarRadEdgeFillet addNewSurfaceEdgeFilletWithVaryingRadius(
    Reference iEdgeToFillet,
    CatFilletEdgePropagation iPropagMode,
    CatFilletVariation iVariationMode,
    double iDefaultRadius);


  /**
   * @param iF1 Mandatory Reference parameter.
   * @param iF2 Mandatory Reference parameter.
   * @param iRemovedFace Mandatory Reference parameter.
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.TritangentFillet
   */

  @DISPID(1611006031) //= 0x6006004f. The runtime will prefer the VTID if present
  @VTID(101)
  TritangentFillet addNewSurfaceTritangentFillet(
    Reference iF1,
    Reference iF2,
    Reference iRemovedFace);


  /**
   * @param iFaceToThicken Mandatory Reference parameter.
   * @param iOffset Mandatory double parameter.
   * @param iType Mandatory int parameter.
   * @param iVolumeSupport Mandatory Reference parameter.
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.Thickness
   */

  @DISPID(1611006032) //= 0x60060050. The runtime will prefer the VTID if present
  @VTID(102)
  Thickness addNewVolumeThickness(
    Reference iFaceToThicken,
    double iOffset,
    int iType,
    Reference iVolumeSupport);


  /**
   * @param iFilletRadius Mandatory double parameter.
   * @param iRoundRadius Mandatory double parameter.
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.AutoFillet
   */

  @DISPID(1611006033) //= 0x60060051. The runtime will prefer the VTID if present
  @VTID(103)
  AutoFillet addNewAutoFillet(
    double iFilletRadius,
    double iRoundRadius);


  /**
   * @param iReference Mandatory Reference parameter.
   * @param iTarget Mandatory Reference parameter.
   * @return  Returns a value of type AnyObject
   */

  @DISPID(1611006034) //= 0x60060052. The runtime will prefer the VTID if present
  @VTID(104)
  AnyObject addNewAxisToAxis2(
    Reference iReference,
    Reference iTarget);


  /**
   * @param xRatio Mandatory double parameter.
   * @param yRatio Mandatory double parameter.
   * @param zRatio Mandatory double parameter.
   * @return  Returns a value of type AnyObject
   */

  @DISPID(1611006035) //= 0x60060053. The runtime will prefer the VTID if present
  @VTID(105)
  AnyObject addNewAffinity2(
    double xRatio,
    double yRatio,
    double zRatio);


  /**
   * @param iDraftAngle Mandatory double parameter.
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.AutoDraft
   */

  @DISPID(1611006036) //= 0x60060054. The runtime will prefer the VTID if present
  @VTID(106)
  AutoDraft addNewAutoDraft(
    double iDraftAngle);


  /**
   * @param iFilletRadius Mandatory double parameter.
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.AutoFillet
   */

  @DISPID(1611006037) //= 0x60060055. The runtime will prefer the VTID if present
  @VTID(107)
  AutoFillet addNewSurfacicAutoFillet(
    double iFilletRadius);


  // Properties:
}
