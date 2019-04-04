package CatiaV5TypeLibs.InfItfTypeLib;

import com4j.*;

@IID("{C5A3063A-9DB3-4C71-BFF9-630DCFE22B33}")
public interface VisualizationSettingAtt extends SettingController {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "ColorBackgroundMode"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(27)
  boolean colorBackgroundMode();


  /**
   * <p>
   * Setter method for the COM property "ColorBackgroundMode"
   * </p>
   * @param oColorBackgroundMode Mandatory boolean parameter.
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(28)
  void colorBackgroundMode(
    boolean oColorBackgroundMode);


  /**
   * @param ioAdminLevel Mandatory Holder<java.lang.String> parameter.
   * @param ioLocked Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005954) //= 0x60060002. The runtime will prefer the VTID if present
  @VTID(29)
  boolean getColorBackgroundModeInfo(
    Holder<java.lang.String> ioAdminLevel,
    Holder<java.lang.String> ioLocked);


  /**
   * @param iLocked Mandatory boolean parameter.
   */

  @DISPID(1611005955) //= 0x60060003. The runtime will prefer the VTID if present
  @VTID(30)
  void setColorBackgroundModeLock(
    boolean iLocked);


  /**
   * @param ioR Mandatory Holder<Integer> parameter.
   * @param ioG Mandatory Holder<Integer> parameter.
   * @param ioB Mandatory Holder<Integer> parameter.
   */

  @DISPID(1611005956) //= 0x60060004. The runtime will prefer the VTID if present
  @VTID(31)
  void getBackgroundRGB(
    Holder<Integer> ioR,
    Holder<Integer> ioG,
    Holder<Integer> ioB);


  /**
   * @param iR Mandatory int parameter.
   * @param iG Mandatory int parameter.
   * @param iB Mandatory int parameter.
   */

  @DISPID(1611005957) //= 0x60060005. The runtime will prefer the VTID if present
  @VTID(32)
  void setBackgroundRGB(
    int iR,
    int iG,
    int iB);


  /**
   * @param ioAdminLevel Mandatory Holder<java.lang.String> parameter.
   * @param ioLocked Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005958) //= 0x60060006. The runtime will prefer the VTID if present
  @VTID(33)
  boolean getBackgroundRGBInfo(
    Holder<java.lang.String> ioAdminLevel,
    Holder<java.lang.String> ioLocked);


  /**
   * @param iLocked Mandatory boolean parameter.
   */

  @DISPID(1611005959) //= 0x60060007. The runtime will prefer the VTID if present
  @VTID(34)
  void setBackgroundRGBLock(
    boolean iLocked);


  /**
   * @param ioR Mandatory Holder<Integer> parameter.
   * @param ioG Mandatory Holder<Integer> parameter.
   * @param ioB Mandatory Holder<Integer> parameter.
   */

  @DISPID(1611005960) //= 0x60060008. The runtime will prefer the VTID if present
  @VTID(35)
  void getNoShowBackgroundRGB(
    Holder<Integer> ioR,
    Holder<Integer> ioG,
    Holder<Integer> ioB);


  /**
   * @param iR Mandatory int parameter.
   * @param iG Mandatory int parameter.
   * @param iB Mandatory int parameter.
   */

  @DISPID(1611005961) //= 0x60060009. The runtime will prefer the VTID if present
  @VTID(36)
  void setNoShowBackgroundRGB(
    int iR,
    int iG,
    int iB);


  /**
   * @param ioAdminLevel Mandatory Holder<java.lang.String> parameter.
   * @param ioLocked Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005962) //= 0x6006000a. The runtime will prefer the VTID if present
  @VTID(37)
  boolean getNoShowBackgroundRGBInfo(
    Holder<java.lang.String> ioAdminLevel,
    Holder<java.lang.String> ioLocked);


  /**
   * @param iLocked Mandatory boolean parameter.
   */

  @DISPID(1611005963) //= 0x6006000b. The runtime will prefer the VTID if present
  @VTID(38)
  void setNoShowBackgroundRGBLock(
    boolean iLocked);


  /**
   * @param ioR Mandatory Holder<Integer> parameter.
   * @param ioG Mandatory Holder<Integer> parameter.
   * @param ioB Mandatory Holder<Integer> parameter.
   */

  @DISPID(1611005964) //= 0x6006000c. The runtime will prefer the VTID if present
  @VTID(39)
  void getSelectedElementRGB(
    Holder<Integer> ioR,
    Holder<Integer> ioG,
    Holder<Integer> ioB);


  /**
   * @param iR Mandatory int parameter.
   * @param iG Mandatory int parameter.
   * @param iB Mandatory int parameter.
   */

  @DISPID(1611005965) //= 0x6006000d. The runtime will prefer the VTID if present
  @VTID(40)
  void setSelectedElementRGB(
    int iR,
    int iG,
    int iB);


  /**
   * @param ioAdminLevel Mandatory Holder<java.lang.String> parameter.
   * @param ioLocked Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005966) //= 0x6006000e. The runtime will prefer the VTID if present
  @VTID(41)
  boolean getSelectedElementRGBInfo(
    Holder<java.lang.String> ioAdminLevel,
    Holder<java.lang.String> ioLocked);


  /**
   * @param iLocked Mandatory boolean parameter.
   */

  @DISPID(1611005967) //= 0x6006000f. The runtime will prefer the VTID if present
  @VTID(42)
  void setSelectedElementRGBLock(
    boolean iLocked);


  /**
   * @param ioR Mandatory Holder<Integer> parameter.
   * @param ioG Mandatory Holder<Integer> parameter.
   * @param ioB Mandatory Holder<Integer> parameter.
   */

  @DISPID(1611005968) //= 0x60060010. The runtime will prefer the VTID if present
  @VTID(43)
  void getSelectedEdgeRGB(
    Holder<Integer> ioR,
    Holder<Integer> ioG,
    Holder<Integer> ioB);


  /**
   * @param iR Mandatory int parameter.
   * @param iG Mandatory int parameter.
   * @param iB Mandatory int parameter.
   */

  @DISPID(1611005969) //= 0x60060011. The runtime will prefer the VTID if present
  @VTID(44)
  void setSelectedEdgeRGB(
    int iR,
    int iG,
    int iB);


  /**
   * @param ioAdminLevel Mandatory Holder<java.lang.String> parameter.
   * @param ioLocked Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005970) //= 0x60060012. The runtime will prefer the VTID if present
  @VTID(45)
  boolean getSelectedEdgeRGBInfo(
    Holder<java.lang.String> ioAdminLevel,
    Holder<java.lang.String> ioLocked);


  /**
   * @param iLocked Mandatory boolean parameter.
   */

  @DISPID(1611005971) //= 0x60060013. The runtime will prefer the VTID if present
  @VTID(46)
  void setSelectedEdgeRGBLock(
    boolean iLocked);


  /**
   * @param ioR Mandatory Holder<Integer> parameter.
   * @param ioG Mandatory Holder<Integer> parameter.
   * @param ioB Mandatory Holder<Integer> parameter.
   */

  @DISPID(1611005972) //= 0x60060014. The runtime will prefer the VTID if present
  @VTID(47)
  void getPreselectedElementRGB(
    Holder<Integer> ioR,
    Holder<Integer> ioG,
    Holder<Integer> ioB);


  /**
   * @param iR Mandatory int parameter.
   * @param iG Mandatory int parameter.
   * @param iB Mandatory int parameter.
   */

  @DISPID(1611005973) //= 0x60060015. The runtime will prefer the VTID if present
  @VTID(48)
  void setPreselectedElementRGB(
    int iR,
    int iG,
    int iB);


  /**
   * @param ioAdminLevel Mandatory Holder<java.lang.String> parameter.
   * @param ioLocked Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005974) //= 0x60060016. The runtime will prefer the VTID if present
  @VTID(49)
  boolean getPreselectedElementRGBInfo(
    Holder<java.lang.String> ioAdminLevel,
    Holder<java.lang.String> ioLocked);


  /**
   * @param iLocked Mandatory boolean parameter.
   */

  @DISPID(1611005975) //= 0x60060017. The runtime will prefer the VTID if present
  @VTID(50)
  void setPreselectedElementRGBLock(
    boolean iLocked);


  /**
   * <p>
   * Getter method for the COM property "PreselectedElementLinetype"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611005976) //= 0x60060018. The runtime will prefer the VTID if present
  @VTID(51)
  int preselectedElementLinetype();


  /**
   * <p>
   * Setter method for the COM property "PreselectedElementLinetype"
   * </p>
   * @param oPreselectedElementLinetype Mandatory int parameter.
   */

  @DISPID(1611005976) //= 0x60060018. The runtime will prefer the VTID if present
  @VTID(52)
  void preselectedElementLinetype(
    int oPreselectedElementLinetype);


  /**
   * @param ioAdminLevel Mandatory Holder<java.lang.String> parameter.
   * @param ioLocked Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005978) //= 0x6006001a. The runtime will prefer the VTID if present
  @VTID(53)
  boolean getPreselectedElementLinetypeInfo(
    Holder<java.lang.String> ioAdminLevel,
    Holder<java.lang.String> ioLocked);


  /**
   * @param iLocked Mandatory boolean parameter.
   */

  @DISPID(1611005979) //= 0x6006001b. The runtime will prefer the VTID if present
  @VTID(54)
  void setPreselectedElementLinetypeLock(
    boolean iLocked);


  /**
   * @param ioR Mandatory Holder<Integer> parameter.
   * @param ioG Mandatory Holder<Integer> parameter.
   * @param ioB Mandatory Holder<Integer> parameter.
   */

  @DISPID(1611005980) //= 0x6006001c. The runtime will prefer the VTID if present
  @VTID(55)
  void getUnderIntensifiedRGB(
    Holder<Integer> ioR,
    Holder<Integer> ioG,
    Holder<Integer> ioB);


  /**
   * @param iR Mandatory int parameter.
   * @param iG Mandatory int parameter.
   * @param iB Mandatory int parameter.
   */

  @DISPID(1611005981) //= 0x6006001d. The runtime will prefer the VTID if present
  @VTID(56)
  void setUnderIntensifiedRGB(
    int iR,
    int iG,
    int iB);


  /**
   * @param ioAdminLevel Mandatory Holder<java.lang.String> parameter.
   * @param ioLocked Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005982) //= 0x6006001e. The runtime will prefer the VTID if present
  @VTID(57)
  boolean getUnderIntensifiedRGBInfo(
    Holder<java.lang.String> ioAdminLevel,
    Holder<java.lang.String> ioLocked);


  /**
   * @param iLocked Mandatory boolean parameter.
   */

  @DISPID(1611005983) //= 0x6006001f. The runtime will prefer the VTID if present
  @VTID(58)
  void setUnderIntensifiedRGBLock(
    boolean iLocked);


  /**
   * @param ioR Mandatory Holder<Integer> parameter.
   * @param ioG Mandatory Holder<Integer> parameter.
   * @param ioB Mandatory Holder<Integer> parameter.
   */

  @DISPID(1611005984) //= 0x60060020. The runtime will prefer the VTID if present
  @VTID(59)
  void getUpdateNeededRGB(
    Holder<Integer> ioR,
    Holder<Integer> ioG,
    Holder<Integer> ioB);


  /**
   * @param iR Mandatory int parameter.
   * @param iG Mandatory int parameter.
   * @param iB Mandatory int parameter.
   */

  @DISPID(1611005985) //= 0x60060021. The runtime will prefer the VTID if present
  @VTID(60)
  void setUpdateNeededRGB(
    int iR,
    int iG,
    int iB);


  /**
   * @param ioAdminLevel Mandatory Holder<java.lang.String> parameter.
   * @param ioLocked Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005986) //= 0x60060022. The runtime will prefer the VTID if present
  @VTID(61)
  boolean getUpdateNeededRGBInfo(
    Holder<java.lang.String> ioAdminLevel,
    Holder<java.lang.String> ioLocked);


  /**
   * @param iLocked Mandatory boolean parameter.
   */

  @DISPID(1611005987) //= 0x60060023. The runtime will prefer the VTID if present
  @VTID(62)
  void setUpdateNeededRGBLock(
    boolean iLocked);


  /**
   * @param ioR Mandatory Holder<Integer> parameter.
   * @param ioG Mandatory Holder<Integer> parameter.
   * @param ioB Mandatory Holder<Integer> parameter.
   */

  @DISPID(1611005988) //= 0x60060024. The runtime will prefer the VTID if present
  @VTID(63)
  void getHandlesRGB(
    Holder<Integer> ioR,
    Holder<Integer> ioG,
    Holder<Integer> ioB);


  /**
   * @param iR Mandatory int parameter.
   * @param iG Mandatory int parameter.
   * @param iB Mandatory int parameter.
   */

  @DISPID(1611005989) //= 0x60060025. The runtime will prefer the VTID if present
  @VTID(64)
  void setHandlesRGB(
    int iR,
    int iG,
    int iB);


  /**
   * @param ioAdminLevel Mandatory Holder<java.lang.String> parameter.
   * @param ioLocked Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005990) //= 0x60060026. The runtime will prefer the VTID if present
  @VTID(65)
  boolean getHandlesRGBInfo(
    Holder<java.lang.String> ioAdminLevel,
    Holder<java.lang.String> ioLocked);


  /**
   * @param iLocked Mandatory boolean parameter.
   */

  @DISPID(1611005991) //= 0x60060027. The runtime will prefer the VTID if present
  @VTID(66)
  void setHandlesRGBLock(
    boolean iLocked);


  /**
   * <p>
   * Getter method for the COM property "BorderEdgesMode"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005992) //= 0x60060028. The runtime will prefer the VTID if present
  @VTID(67)
  boolean borderEdgesMode();


  /**
   * <p>
   * Setter method for the COM property "BorderEdgesMode"
   * </p>
   * @param oBorderEdgesMode Mandatory boolean parameter.
   */

  @DISPID(1611005992) //= 0x60060028. The runtime will prefer the VTID if present
  @VTID(68)
  void borderEdgesMode(
    boolean oBorderEdgesMode);


  /**
   * @param ioAdminLevel Mandatory Holder<java.lang.String> parameter.
   * @param ioLocked Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005994) //= 0x6006002a. The runtime will prefer the VTID if present
  @VTID(69)
  boolean getBorderEdgesModeInfo(
    Holder<java.lang.String> ioAdminLevel,
    Holder<java.lang.String> ioLocked);


  /**
   * @param iLocked Mandatory boolean parameter.
   */

  @DISPID(1611005995) //= 0x6006002b. The runtime will prefer the VTID if present
  @VTID(70)
  void setBorderEdgesModeLock(
    boolean iLocked);


  /**
   * @param ioR Mandatory Holder<Integer> parameter.
   * @param ioG Mandatory Holder<Integer> parameter.
   * @param ioB Mandatory Holder<Integer> parameter.
   */

  @DISPID(1611005996) //= 0x6006002c. The runtime will prefer the VTID if present
  @VTID(71)
  void getBorderEdgesRGB(
    Holder<Integer> ioR,
    Holder<Integer> ioG,
    Holder<Integer> ioB);


  /**
   * @param iR Mandatory int parameter.
   * @param iG Mandatory int parameter.
   * @param iB Mandatory int parameter.
   */

  @DISPID(1611005997) //= 0x6006002d. The runtime will prefer the VTID if present
  @VTID(72)
  void setBorderEdgesRGB(
    int iR,
    int iG,
    int iB);


  /**
   * @param ioAdminLevel Mandatory Holder<java.lang.String> parameter.
   * @param ioLocked Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005998) //= 0x6006002e. The runtime will prefer the VTID if present
  @VTID(73)
  boolean getBorderEdgesRGBInfo(
    Holder<java.lang.String> ioAdminLevel,
    Holder<java.lang.String> ioLocked);


  /**
   * @param iLocked Mandatory boolean parameter.
   */

  @DISPID(1611005999) //= 0x6006002f. The runtime will prefer the VTID if present
  @VTID(74)
  void setBorderEdgesRGBLock(
    boolean iLocked);


  /**
   * <p>
   * Getter method for the COM property "BorderEdgesThickness"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611006000) //= 0x60060030. The runtime will prefer the VTID if present
  @VTID(75)
  int borderEdgesThickness();


  /**
   * <p>
   * Setter method for the COM property "BorderEdgesThickness"
   * </p>
   * @param oBorderEdgesThickness Mandatory int parameter.
   */

  @DISPID(1611006000) //= 0x60060030. The runtime will prefer the VTID if present
  @VTID(76)
  void borderEdgesThickness(
    int oBorderEdgesThickness);


  /**
   * @param ioAdminLevel Mandatory Holder<java.lang.String> parameter.
   * @param ioLocked Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1611006002) //= 0x60060032. The runtime will prefer the VTID if present
  @VTID(77)
  boolean getBorderEdgesThicknessInfo(
    Holder<java.lang.String> ioAdminLevel,
    Holder<java.lang.String> ioLocked);


  /**
   * @param iLocked Mandatory boolean parameter.
   */

  @DISPID(1611006003) //= 0x60060033. The runtime will prefer the VTID if present
  @VTID(78)
  void setBorderEdgesThicknessLock(
    boolean iLocked);


  /**
   * <p>
   * Getter method for the COM property "AllZBufferElementMode"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1611006004) //= 0x60060034. The runtime will prefer the VTID if present
  @VTID(79)
  boolean allZBufferElementMode();


  /**
   * <p>
   * Setter method for the COM property "AllZBufferElementMode"
   * </p>
   * @param oAllZBufferElementMode Mandatory boolean parameter.
   */

  @DISPID(1611006004) //= 0x60060034. The runtime will prefer the VTID if present
  @VTID(80)
  void allZBufferElementMode(
    boolean oAllZBufferElementMode);


  /**
   * @param ioAdminLevel Mandatory Holder<java.lang.String> parameter.
   * @param ioLocked Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1611006006) //= 0x60060036. The runtime will prefer the VTID if present
  @VTID(81)
  boolean getAllZBufferElementModeInfo(
    Holder<java.lang.String> ioAdminLevel,
    Holder<java.lang.String> ioLocked);


  /**
   * @param iLocked Mandatory boolean parameter.
   */

  @DISPID(1611006007) //= 0x60060037. The runtime will prefer the VTID if present
  @VTID(82)
  void setAllZBufferElementModeLock(
    boolean iLocked);


  /**
   * <p>
   * Getter method for the COM property "AntiAliasingMode"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1611006008) //= 0x60060038. The runtime will prefer the VTID if present
  @VTID(83)
  boolean antiAliasingMode();


  /**
   * <p>
   * Setter method for the COM property "AntiAliasingMode"
   * </p>
   * @param oAntiAliasingMode Mandatory boolean parameter.
   */

  @DISPID(1611006008) //= 0x60060038. The runtime will prefer the VTID if present
  @VTID(84)
  void antiAliasingMode(
    boolean oAntiAliasingMode);


  /**
   * @param ioAdminLevel Mandatory Holder<java.lang.String> parameter.
   * @param ioLocked Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1611006010) //= 0x6006003a. The runtime will prefer the VTID if present
  @VTID(85)
  boolean getAntiAliasingModeInfo(
    Holder<java.lang.String> ioAdminLevel,
    Holder<java.lang.String> ioLocked);


  /**
   * @param iLocked Mandatory boolean parameter.
   */

  @DISPID(1611006011) //= 0x6006003b. The runtime will prefer the VTID if present
  @VTID(86)
  void setAntiAliasingModeLock(
    boolean iLocked);


  /**
   * <p>
   * Getter method for the COM property "AntiAliasingOffset"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(1611006012) //= 0x6006003c. The runtime will prefer the VTID if present
  @VTID(87)
  double antiAliasingOffset();


  /**
   * <p>
   * Setter method for the COM property "AntiAliasingOffset"
   * </p>
   * @param oAntiAliasingOffset Mandatory double parameter.
   */

  @DISPID(1611006012) //= 0x6006003c. The runtime will prefer the VTID if present
  @VTID(88)
  void antiAliasingOffset(
    double oAntiAliasingOffset);


  /**
   * @param ioAdminLevel Mandatory Holder<java.lang.String> parameter.
   * @param ioLocked Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1611006014) //= 0x6006003e. The runtime will prefer the VTID if present
  @VTID(89)
  boolean getAntiAliasingOffsetInfo(
    Holder<java.lang.String> ioAdminLevel,
    Holder<java.lang.String> ioLocked);


  /**
   * @param iLocked Mandatory boolean parameter.
   */

  @DISPID(1611006015) //= 0x6006003f. The runtime will prefer the VTID if present
  @VTID(90)
  void setAntiAliasingOffsetLock(
    boolean iLocked);


  /**
   * <p>
   * Getter method for the COM property "FullSceneAntiAliasingMode"
   * </p>
   * @return  Returns a value of type CATFullSceneAntiAliasingMode
   */

  @DISPID(1611006016) //= 0x60060040. The runtime will prefer the VTID if present
  @VTID(91)
  CATFullSceneAntiAliasingMode fullSceneAntiAliasingMode();


  /**
   * <p>
   * Setter method for the COM property "FullSceneAntiAliasingMode"
   * </p>
   * @param oFullSceneAntiAliasingMode Mandatory CATFullSceneAntiAliasingMode parameter.
   */

  @DISPID(1611006016) //= 0x60060040. The runtime will prefer the VTID if present
  @VTID(92)
  void fullSceneAntiAliasingMode(
    CATFullSceneAntiAliasingMode oFullSceneAntiAliasingMode);


  /**
   * @param ioAdminLevel Mandatory Holder<java.lang.String> parameter.
   * @param ioLocked Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1611006018) //= 0x60060042. The runtime will prefer the VTID if present
  @VTID(93)
  boolean getFullSceneAntiAliasingModeInfo(
    Holder<java.lang.String> ioAdminLevel,
    Holder<java.lang.String> ioLocked);


  /**
   * @param iLocked Mandatory boolean parameter.
   */

  @DISPID(1611006019) //= 0x60060043. The runtime will prefer the VTID if present
  @VTID(94)
  void setFullSceneAntiAliasingModeLock(
    boolean iLocked);


  /**
   * <p>
   * Getter method for the COM property "StereoMode"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1611006020) //= 0x60060044. The runtime will prefer the VTID if present
  @VTID(95)
  boolean stereoMode();


  /**
   * <p>
   * Setter method for the COM property "StereoMode"
   * </p>
   * @param oStereoMode Mandatory boolean parameter.
   */

  @DISPID(1611006020) //= 0x60060044. The runtime will prefer the VTID if present
  @VTID(96)
  void stereoMode(
    boolean oStereoMode);


  /**
   * @param ioAdminLevel Mandatory Holder<java.lang.String> parameter.
   * @param ioLocked Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1611006022) //= 0x60060046. The runtime will prefer the VTID if present
  @VTID(97)
  boolean getStereoModeInfo(
    Holder<java.lang.String> ioAdminLevel,
    Holder<java.lang.String> ioLocked);


  /**
   * @param iLocked Mandatory boolean parameter.
   */

  @DISPID(1611006023) //= 0x60060047. The runtime will prefer the VTID if present
  @VTID(98)
  void setStereoModeLock(
    boolean iLocked);


  /**
   * <p>
   * Getter method for the COM property "DisplayCurrentScale"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1611006024) //= 0x60060048. The runtime will prefer the VTID if present
  @VTID(99)
  boolean displayCurrentScale();


  /**
   * <p>
   * Setter method for the COM property "DisplayCurrentScale"
   * </p>
   * @param oDisplayCurrentScale Mandatory boolean parameter.
   */

  @DISPID(1611006024) //= 0x60060048. The runtime will prefer the VTID if present
  @VTID(100)
  void displayCurrentScale(
    boolean oDisplayCurrentScale);


  /**
   * @param ioAdminLevel Mandatory Holder<java.lang.String> parameter.
   * @param ioLocked Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1611006026) //= 0x6006004a. The runtime will prefer the VTID if present
  @VTID(101)
  boolean getDisplayCurrentScaleInfo(
    Holder<java.lang.String> ioAdminLevel,
    Holder<java.lang.String> ioLocked);


  /**
   * @param iLocked Mandatory boolean parameter.
   */

  @DISPID(1611006027) //= 0x6006004b. The runtime will prefer the VTID if present
  @VTID(102)
  void setDisplayCurrentScaleLock(
    boolean iLocked);


  /**
   * <p>
   * Getter method for the COM property "PreSelectionMode"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1611006028) //= 0x6006004c. The runtime will prefer the VTID if present
  @VTID(103)
  boolean preSelectionMode();


  /**
   * <p>
   * Setter method for the COM property "PreSelectionMode"
   * </p>
   * @param ioPreSelectionMode Mandatory boolean parameter.
   */

  @DISPID(1611006028) //= 0x6006004c. The runtime will prefer the VTID if present
  @VTID(104)
  void preSelectionMode(
    boolean ioPreSelectionMode);


  /**
   * @param ioAdminLevel Mandatory Holder<java.lang.String> parameter.
   * @param ioLocked Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1611006030) //= 0x6006004e. The runtime will prefer the VTID if present
  @VTID(105)
  boolean getPreSelectionModeInfo(
    Holder<java.lang.String> ioAdminLevel,
    Holder<java.lang.String> ioLocked);


  /**
   * @param iLocked Mandatory boolean parameter.
   */

  @DISPID(1611006031) //= 0x6006004f. The runtime will prefer the VTID if present
  @VTID(106)
  void setPreSelectionModeLock(
    boolean iLocked);


  /**
   * <p>
   * Getter method for the COM property "OtherSelectionTimeoutActivity"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1611006032) //= 0x60060050. The runtime will prefer the VTID if present
  @VTID(107)
  boolean otherSelectionTimeoutActivity();


  /**
   * <p>
   * Setter method for the COM property "OtherSelectionTimeoutActivity"
   * </p>
   * @param ioOtherSelectionTimeoutActivity Mandatory boolean parameter.
   */

  @DISPID(1611006032) //= 0x60060050. The runtime will prefer the VTID if present
  @VTID(108)
  void otherSelectionTimeoutActivity(
    boolean ioOtherSelectionTimeoutActivity);


  /**
   * @param ioAdminLevel Mandatory Holder<java.lang.String> parameter.
   * @param ioLocked Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1611006034) //= 0x60060052. The runtime will prefer the VTID if present
  @VTID(109)
  boolean getOtherSelectionTimeoutActivityInfo(
    Holder<java.lang.String> ioAdminLevel,
    Holder<java.lang.String> ioLocked);


  /**
   * @param iLocked Mandatory boolean parameter.
   */

  @DISPID(1611006035) //= 0x60060053. The runtime will prefer the VTID if present
  @VTID(110)
  void setOtherSelectionTimeoutActivityLock(
    boolean iLocked);


  /**
   * <p>
   * Getter method for the COM property "OtherSelectionTimeout"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(1611006036) //= 0x60060054. The runtime will prefer the VTID if present
  @VTID(111)
  double otherSelectionTimeout();


  /**
   * <p>
   * Setter method for the COM property "OtherSelectionTimeout"
   * </p>
   * @param ioOtherSelectionTimeout Mandatory double parameter.
   */

  @DISPID(1611006036) //= 0x60060054. The runtime will prefer the VTID if present
  @VTID(112)
  void otherSelectionTimeout(
    double ioOtherSelectionTimeout);


  /**
   * @param ioAdminLevel Mandatory Holder<java.lang.String> parameter.
   * @param ioLocked Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1611006038) //= 0x60060056. The runtime will prefer the VTID if present
  @VTID(113)
  boolean getOtherSelectionTimeoutInfo(
    Holder<java.lang.String> ioAdminLevel,
    Holder<java.lang.String> ioLocked);


  /**
   * @param iLocked Mandatory boolean parameter.
   */

  @DISPID(1611006039) //= 0x60060057. The runtime will prefer the VTID if present
  @VTID(114)
  void setOtherSelectionTimeoutLock(
    boolean iLocked);


  /**
   * <p>
   * Getter method for the COM property "NoZBufferSelectionMode"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1611006040) //= 0x60060058. The runtime will prefer the VTID if present
  @VTID(115)
  boolean noZBufferSelectionMode();


  /**
   * <p>
   * Setter method for the COM property "NoZBufferSelectionMode"
   * </p>
   * @param ioNoZBufferSelectionMode Mandatory boolean parameter.
   */

  @DISPID(1611006040) //= 0x60060058. The runtime will prefer the VTID if present
  @VTID(116)
  void noZBufferSelectionMode(
    boolean ioNoZBufferSelectionMode);


  /**
   * @param ioAdminLevel Mandatory Holder<java.lang.String> parameter.
   * @param ioLocked Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1611006042) //= 0x6006005a. The runtime will prefer the VTID if present
  @VTID(117)
  boolean getNoZBufferSelectionModeInfo(
    Holder<java.lang.String> ioAdminLevel,
    Holder<java.lang.String> ioLocked);


  /**
   * @param iLocked Mandatory boolean parameter.
   */

  @DISPID(1611006043) //= 0x6006005b. The runtime will prefer the VTID if present
  @VTID(118)
  void setNoZBufferSelectionModeLock(
    boolean iLocked);


  /**
   * <p>
   * Getter method for the COM property "BoundingBoxSelectionMode"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1611006044) //= 0x6006005c. The runtime will prefer the VTID if present
  @VTID(119)
  boolean boundingBoxSelectionMode();


  /**
   * <p>
   * Setter method for the COM property "BoundingBoxSelectionMode"
   * </p>
   * @param ioBoundingBoxSelectionMode Mandatory boolean parameter.
   */

  @DISPID(1611006044) //= 0x6006005c. The runtime will prefer the VTID if present
  @VTID(120)
  void boundingBoxSelectionMode(
    boolean ioBoundingBoxSelectionMode);


  /**
   * @param ioAdminLevel Mandatory Holder<java.lang.String> parameter.
   * @param ioLocked Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1611006046) //= 0x6006005e. The runtime will prefer the VTID if present
  @VTID(121)
  boolean getBoundingBoxSelectionModeInfo(
    Holder<java.lang.String> ioAdminLevel,
    Holder<java.lang.String> ioLocked);


  /**
   * @param iLocked Mandatory boolean parameter.
   */

  @DISPID(1611006047) //= 0x6006005f. The runtime will prefer the VTID if present
  @VTID(122)
  void setBoundingBoxSelectionModeLock(
    boolean iLocked);


  /**
   * <p>
   * Getter method for the COM property "MaxSelectionMove"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611006048) //= 0x60060060. The runtime will prefer the VTID if present
  @VTID(123)
  int maxSelectionMove();


  /**
   * <p>
   * Setter method for the COM property "MaxSelectionMove"
   * </p>
   * @param ioMaxSelectionMove Mandatory int parameter.
   */

  @DISPID(1611006048) //= 0x60060060. The runtime will prefer the VTID if present
  @VTID(124)
  void maxSelectionMove(
    int ioMaxSelectionMove);


  /**
   * @param ioAdminLevel Mandatory Holder<java.lang.String> parameter.
   * @param ioLocked Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1611006050) //= 0x60060062. The runtime will prefer the VTID if present
  @VTID(125)
  boolean getMaxSelectionMoveInfo(
    Holder<java.lang.String> ioAdminLevel,
    Holder<java.lang.String> ioLocked);


  /**
   * @param iLocked Mandatory boolean parameter.
   */

  @DISPID(1611006051) //= 0x60060063. The runtime will prefer the VTID if present
  @VTID(126)
  void setMaxSelectionMoveLock(
    boolean iLocked);


  /**
   * <p>
   * Getter method for the COM property "DisplayDrillList"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1611006052) //= 0x60060064. The runtime will prefer the VTID if present
  @VTID(127)
  boolean displayDrillList();


  /**
   * <p>
   * Setter method for the COM property "DisplayDrillList"
   * </p>
   * @param ioDisplayDrillList Mandatory boolean parameter.
   */

  @DISPID(1611006052) //= 0x60060064. The runtime will prefer the VTID if present
  @VTID(128)
  void displayDrillList(
    boolean ioDisplayDrillList);


  /**
   * @param ioAdminLevel Mandatory Holder<java.lang.String> parameter.
   * @param ioLocked Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1611006054) //= 0x60060066. The runtime will prefer the VTID if present
  @VTID(129)
  boolean getDisplayDrillListInfo(
    Holder<java.lang.String> ioAdminLevel,
    Holder<java.lang.String> ioLocked);


  /**
   * @param iLocked Mandatory boolean parameter.
   */

  @DISPID(1611006055) //= 0x60060067. The runtime will prefer the VTID if present
  @VTID(130)
  void setDisplayDrillListLock(
    boolean iLocked);


  /**
   * <p>
   * Getter method for the COM property "AuxiliaryDrillViewer"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1611006056) //= 0x60060068. The runtime will prefer the VTID if present
  @VTID(131)
  boolean auxiliaryDrillViewer();


  /**
   * <p>
   * Setter method for the COM property "AuxiliaryDrillViewer"
   * </p>
   * @param ioAuxiliaryDrillViewer Mandatory boolean parameter.
   */

  @DISPID(1611006056) //= 0x60060068. The runtime will prefer the VTID if present
  @VTID(132)
  void auxiliaryDrillViewer(
    boolean ioAuxiliaryDrillViewer);


  /**
   * @param ioAdminLevel Mandatory Holder<java.lang.String> parameter.
   * @param ioLocked Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1611006058) //= 0x6006006a. The runtime will prefer the VTID if present
  @VTID(133)
  boolean getAuxiliaryDrillViewerInfo(
    Holder<java.lang.String> ioAdminLevel,
    Holder<java.lang.String> ioLocked);


  /**
   * @param iLocked Mandatory boolean parameter.
   */

  @DISPID(1611006059) //= 0x6006006b. The runtime will prefer the VTID if present
  @VTID(134)
  void setAuxiliaryDrillViewerLock(
    boolean iLocked);


  /**
   * <p>
   * Getter method for the COM property "FaceHLDrill"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1611006060) //= 0x6006006c. The runtime will prefer the VTID if present
  @VTID(135)
  boolean faceHLDrill();


  /**
   * <p>
   * Setter method for the COM property "FaceHLDrill"
   * </p>
   * @param ioFaceHLDrill Mandatory boolean parameter.
   */

  @DISPID(1611006060) //= 0x6006006c. The runtime will prefer the VTID if present
  @VTID(136)
  void faceHLDrill(
    boolean ioFaceHLDrill);


  /**
   * @param ioAdminLevel Mandatory Holder<java.lang.String> parameter.
   * @param ioLocked Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1611006062) //= 0x6006006e. The runtime will prefer the VTID if present
  @VTID(137)
  boolean getFaceHLDrillInfo(
    Holder<java.lang.String> ioAdminLevel,
    Holder<java.lang.String> ioLocked);


  /**
   * @param iLocked Mandatory boolean parameter.
   */

  @DISPID(1611006063) //= 0x6006006f. The runtime will prefer the VTID if present
  @VTID(138)
  void setFaceHLDrillLock(
    boolean iLocked);


  /**
   * <p>
   * Getter method for the COM property "DisplayImmersiveDrillViewer"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1611006064) //= 0x60060070. The runtime will prefer the VTID if present
  @VTID(139)
  boolean displayImmersiveDrillViewer();


  /**
   * <p>
   * Setter method for the COM property "DisplayImmersiveDrillViewer"
   * </p>
   * @param ioDisplayImmersiveDrillViewer Mandatory boolean parameter.
   */

  @DISPID(1611006064) //= 0x60060070. The runtime will prefer the VTID if present
  @VTID(140)
  void displayImmersiveDrillViewer(
    boolean ioDisplayImmersiveDrillViewer);


  /**
   * @param ioAdminLevel Mandatory Holder<java.lang.String> parameter.
   * @param ioLocked Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1611006066) //= 0x60060072. The runtime will prefer the VTID if present
  @VTID(141)
  boolean getDisplayImmersiveDrillViewerInfo(
    Holder<java.lang.String> ioAdminLevel,
    Holder<java.lang.String> ioLocked);


  /**
   * @param iLocked Mandatory boolean parameter.
   */

  @DISPID(1611006067) //= 0x60060073. The runtime will prefer the VTID if present
  @VTID(142)
  void setDisplayImmersiveDrillViewerLock(
    boolean iLocked);


  /**
   * <p>
   * Getter method for the COM property "Gravity"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1611006068) //= 0x60060074. The runtime will prefer the VTID if present
  @VTID(143)
  boolean gravity();


  /**
   * <p>
   * Setter method for the COM property "Gravity"
   * </p>
   * @param ioGravity Mandatory boolean parameter.
   */

  @DISPID(1611006068) //= 0x60060074. The runtime will prefer the VTID if present
  @VTID(144)
  void gravity(
    boolean ioGravity);


  /**
   * @param ioAdminLevel Mandatory Holder<java.lang.String> parameter.
   * @param ioLocked Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1611006070) //= 0x60060076. The runtime will prefer the VTID if present
  @VTID(145)
  boolean getGravityInfo(
    Holder<java.lang.String> ioAdminLevel,
    Holder<java.lang.String> ioLocked);


  /**
   * @param iLocked Mandatory boolean parameter.
   */

  @DISPID(1611006071) //= 0x60060077. The runtime will prefer the VTID if present
  @VTID(146)
  void setGravityLock(
    boolean iLocked);


  /**
   * <p>
   * Getter method for the COM property "GravityAxis"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611006072) //= 0x60060078. The runtime will prefer the VTID if present
  @VTID(147)
  int gravityAxis();


  /**
   * <p>
   * Setter method for the COM property "GravityAxis"
   * </p>
   * @param ioGravityAxis Mandatory int parameter.
   */

  @DISPID(1611006072) //= 0x60060078. The runtime will prefer the VTID if present
  @VTID(148)
  void gravityAxis(
    int ioGravityAxis);


  /**
   * @param ioAdminLevel Mandatory Holder<java.lang.String> parameter.
   * @param ioLocked Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1611006074) //= 0x6006007a. The runtime will prefer the VTID if present
  @VTID(149)
  boolean getGravityAxisInfo(
    Holder<java.lang.String> ioAdminLevel,
    Holder<java.lang.String> ioLocked);


  /**
   * @param iLocked Mandatory boolean parameter.
   */

  @DISPID(1611006075) //= 0x6006007b. The runtime will prefer the VTID if present
  @VTID(150)
  void setGravityAxisLock(
    boolean iLocked);


  /**
   * <p>
   * Getter method for the COM property "FollowGroundMode"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1611006076) //= 0x6006007c. The runtime will prefer the VTID if present
  @VTID(151)
  boolean followGroundMode();


  /**
   * <p>
   * Setter method for the COM property "FollowGroundMode"
   * </p>
   * @param ioFollowGroundMode Mandatory boolean parameter.
   */

  @DISPID(1611006076) //= 0x6006007c. The runtime will prefer the VTID if present
  @VTID(152)
  void followGroundMode(
    boolean ioFollowGroundMode);


  /**
   * @param ioAdminLevel Mandatory Holder<java.lang.String> parameter.
   * @param ioLocked Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1611006078) //= 0x6006007e. The runtime will prefer the VTID if present
  @VTID(153)
  boolean getFollowGroundModeInfo(
    Holder<java.lang.String> ioAdminLevel,
    Holder<java.lang.String> ioLocked);


  /**
   * @param iLocked Mandatory boolean parameter.
   */

  @DISPID(1611006079) //= 0x6006007f. The runtime will prefer the VTID if present
  @VTID(154)
  void setFollowGroundModeLock(
    boolean iLocked);


  /**
   * <p>
   * Getter method for the COM property "FollowGroundAltitude"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(1611006080) //= 0x60060080. The runtime will prefer the VTID if present
  @VTID(155)
  double followGroundAltitude();


  /**
   * <p>
   * Setter method for the COM property "FollowGroundAltitude"
   * </p>
   * @param ioFollowGroundAltitude Mandatory double parameter.
   */

  @DISPID(1611006080) //= 0x60060080. The runtime will prefer the VTID if present
  @VTID(156)
  void followGroundAltitude(
    double ioFollowGroundAltitude);


  /**
   * @param ioAdminLevel Mandatory Holder<java.lang.String> parameter.
   * @param ioLocked Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1611006082) //= 0x60060082. The runtime will prefer the VTID if present
  @VTID(157)
  boolean getFollowGroundAltitudeInfo(
    Holder<java.lang.String> ioAdminLevel,
    Holder<java.lang.String> ioLocked);


  /**
   * @param iLocked Mandatory boolean parameter.
   */

  @DISPID(1611006083) //= 0x60060083. The runtime will prefer the VTID if present
  @VTID(158)
  void setFollowGroundAltitudeLock(
    boolean iLocked);


  /**
   * <p>
   * Getter method for the COM property "ViewpointAnimationMode"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1611006084) //= 0x60060084. The runtime will prefer the VTID if present
  @VTID(159)
  boolean viewpointAnimationMode();


  /**
   * <p>
   * Setter method for the COM property "ViewpointAnimationMode"
   * </p>
   * @param ioViewpointAnimationMode Mandatory boolean parameter.
   */

  @DISPID(1611006084) //= 0x60060084. The runtime will prefer the VTID if present
  @VTID(160)
  void viewpointAnimationMode(
    boolean ioViewpointAnimationMode);


  /**
   * @param ioAdminLevel Mandatory Holder<java.lang.String> parameter.
   * @param ioLocked Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1611006086) //= 0x60060086. The runtime will prefer the VTID if present
  @VTID(161)
  boolean getViewpointAnimationModeInfo(
    Holder<java.lang.String> ioAdminLevel,
    Holder<java.lang.String> ioLocked);


  /**
   * @param iLocked Mandatory boolean parameter.
   */

  @DISPID(1611006087) //= 0x60060087. The runtime will prefer the VTID if present
  @VTID(162)
  void setViewpointAnimationModeLock(
    boolean iLocked);


  /**
   * <p>
   * Getter method for the COM property "RotationSphereMode"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1611006088) //= 0x60060088. The runtime will prefer the VTID if present
  @VTID(163)
  boolean rotationSphereMode();


  /**
   * <p>
   * Setter method for the COM property "RotationSphereMode"
   * </p>
   * @param ioRotationSphereMode Mandatory boolean parameter.
   */

  @DISPID(1611006088) //= 0x60060088. The runtime will prefer the VTID if present
  @VTID(164)
  void rotationSphereMode(
    boolean ioRotationSphereMode);


  /**
   * @param ioAdminLevel Mandatory Holder<java.lang.String> parameter.
   * @param ioLocked Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1611006090) //= 0x6006008a. The runtime will prefer the VTID if present
  @VTID(165)
  boolean getRotationSphereModeInfo(
    Holder<java.lang.String> ioAdminLevel,
    Holder<java.lang.String> ioLocked);


  /**
   * @param iLocked Mandatory boolean parameter.
   */

  @DISPID(1611006091) //= 0x6006008b. The runtime will prefer the VTID if present
  @VTID(166)
  void setRotationSphereModeLock(
    boolean iLocked);


  /**
   * <p>
   * Getter method for the COM property "FlyCollisionMode"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1611006092) //= 0x6006008c. The runtime will prefer the VTID if present
  @VTID(167)
  boolean flyCollisionMode();


  /**
   * <p>
   * Setter method for the COM property "FlyCollisionMode"
   * </p>
   * @param ioFlyCollisionMode Mandatory boolean parameter.
   */

  @DISPID(1611006092) //= 0x6006008c. The runtime will prefer the VTID if present
  @VTID(168)
  void flyCollisionMode(
    boolean ioFlyCollisionMode);


  /**
   * @param ioAdminLevel Mandatory Holder<java.lang.String> parameter.
   * @param ioLocked Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1611006094) //= 0x6006008e. The runtime will prefer the VTID if present
  @VTID(169)
  boolean getFlyCollisionModeInfo(
    Holder<java.lang.String> ioAdminLevel,
    Holder<java.lang.String> ioLocked);


  /**
   * @param iLocked Mandatory boolean parameter.
   */

  @DISPID(1611006095) //= 0x6006008f. The runtime will prefer the VTID if present
  @VTID(170)
  void setFlyCollisionModeLock(
    boolean iLocked);


  /**
   * <p>
   * Getter method for the COM property "FlyCollisionType"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611006096) //= 0x60060090. The runtime will prefer the VTID if present
  @VTID(171)
  int flyCollisionType();


  /**
   * <p>
   * Setter method for the COM property "FlyCollisionType"
   * </p>
   * @param ioFlyCollisionType Mandatory int parameter.
   */

  @DISPID(1611006096) //= 0x60060090. The runtime will prefer the VTID if present
  @VTID(172)
  void flyCollisionType(
    int ioFlyCollisionType);


  /**
   * @param ioAdminLevel Mandatory Holder<java.lang.String> parameter.
   * @param ioLocked Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1611006098) //= 0x60060092. The runtime will prefer the VTID if present
  @VTID(173)
  boolean getFlyCollisionTypeInfo(
    Holder<java.lang.String> ioAdminLevel,
    Holder<java.lang.String> ioLocked);


  /**
   * @param iLocked Mandatory boolean parameter.
   */

  @DISPID(1611006099) //= 0x60060093. The runtime will prefer the VTID if present
  @VTID(174)
  void setFlyCollisionTypeLock(
    boolean iLocked);


  /**
   * <p>
   * Getter method for the COM property "FlyCollisionSphereRadius"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(1611006100) //= 0x60060094. The runtime will prefer the VTID if present
  @VTID(175)
  double flyCollisionSphereRadius();


  /**
   * <p>
   * Setter method for the COM property "FlyCollisionSphereRadius"
   * </p>
   * @param ioFlyCollisionSphereRadius Mandatory double parameter.
   */

  @DISPID(1611006100) //= 0x60060094. The runtime will prefer the VTID if present
  @VTID(176)
  void flyCollisionSphereRadius(
    double ioFlyCollisionSphereRadius);


  /**
   * @param ioAdminLevel Mandatory Holder<java.lang.String> parameter.
   * @param ioLocked Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1611006102) //= 0x60060096. The runtime will prefer the VTID if present
  @VTID(177)
  boolean getFlyCollisionSphereRadiusInfo(
    Holder<java.lang.String> ioAdminLevel,
    Holder<java.lang.String> ioLocked);


  /**
   * @param iLocked Mandatory boolean parameter.
   */

  @DISPID(1611006103) //= 0x60060097. The runtime will prefer the VTID if present
  @VTID(178)
  void setFlyCollisionSphereRadiusLock(
    boolean iLocked);


  /**
   * <p>
   * Getter method for the COM property "FlySensitivity"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611006104) //= 0x60060098. The runtime will prefer the VTID if present
  @VTID(179)
  int flySensitivity();


  /**
   * <p>
   * Setter method for the COM property "FlySensitivity"
   * </p>
   * @param ioFlySensitivity Mandatory int parameter.
   */

  @DISPID(1611006104) //= 0x60060098. The runtime will prefer the VTID if present
  @VTID(180)
  void flySensitivity(
    int ioFlySensitivity);


  /**
   * @param ioAdminLevel Mandatory Holder<java.lang.String> parameter.
   * @param ioLocked Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1611006106) //= 0x6006009a. The runtime will prefer the VTID if present
  @VTID(181)
  boolean getFlySensitivityInfo(
    Holder<java.lang.String> ioAdminLevel,
    Holder<java.lang.String> ioLocked);


  /**
   * @param iLocked Mandatory boolean parameter.
   */

  @DISPID(1611006107) //= 0x6006009b. The runtime will prefer the VTID if present
  @VTID(182)
  void setFlySensitivityLock(
    boolean iLocked);


  /**
   * <p>
   * Getter method for the COM property "FlySpeedMode"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611006108) //= 0x6006009c. The runtime will prefer the VTID if present
  @VTID(183)
  int flySpeedMode();


  /**
   * <p>
   * Setter method for the COM property "FlySpeedMode"
   * </p>
   * @param ioFlySpeedMode Mandatory int parameter.
   */

  @DISPID(1611006108) //= 0x6006009c. The runtime will prefer the VTID if present
  @VTID(184)
  void flySpeedMode(
    int ioFlySpeedMode);


  /**
   * @param ioAdminLevel Mandatory Holder<java.lang.String> parameter.
   * @param ioLocked Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1611006110) //= 0x6006009e. The runtime will prefer the VTID if present
  @VTID(185)
  boolean getFlySpeedModeInfo(
    Holder<java.lang.String> ioAdminLevel,
    Holder<java.lang.String> ioLocked);


  /**
   * @param iLocked Mandatory boolean parameter.
   */

  @DISPID(1611006111) //= 0x6006009f. The runtime will prefer the VTID if present
  @VTID(186)
  void setFlySpeedModeLock(
    boolean iLocked);


  /**
   * <p>
   * Getter method for the COM property "FlySpeed"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611006112) //= 0x600600a0. The runtime will prefer the VTID if present
  @VTID(187)
  int flySpeed();


  /**
   * <p>
   * Setter method for the COM property "FlySpeed"
   * </p>
   * @param ioFlySpeed Mandatory int parameter.
   */

  @DISPID(1611006112) //= 0x600600a0. The runtime will prefer the VTID if present
  @VTID(188)
  void flySpeed(
    int ioFlySpeed);


  /**
   * @param ioAdminLevel Mandatory Holder<java.lang.String> parameter.
   * @param ioLocked Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1611006114) //= 0x600600a2. The runtime will prefer the VTID if present
  @VTID(189)
  boolean getFlySpeedInfo(
    Holder<java.lang.String> ioAdminLevel,
    Holder<java.lang.String> ioLocked);


  /**
   * @param iLocked Mandatory boolean parameter.
   */

  @DISPID(1611006115) //= 0x600600a3. The runtime will prefer the VTID if present
  @VTID(190)
  void setFlySpeedLock(
    boolean iLocked);


  /**
   * <p>
   * Getter method for the COM property "MouseSpeedValue"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611006116) //= 0x600600a4. The runtime will prefer the VTID if present
  @VTID(191)
  int mouseSpeedValue();


  /**
   * <p>
   * Setter method for the COM property "MouseSpeedValue"
   * </p>
   * @param ioMouseSpeedValue Mandatory int parameter.
   */

  @DISPID(1611006116) //= 0x600600a4. The runtime will prefer the VTID if present
  @VTID(192)
  void mouseSpeedValue(
    int ioMouseSpeedValue);


  /**
   * @param ioAdminLevel Mandatory Holder<java.lang.String> parameter.
   * @param ioLocked Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1611006118) //= 0x600600a6. The runtime will prefer the VTID if present
  @VTID(193)
  boolean getMouseSpeedValueInfo(
    Holder<java.lang.String> ioAdminLevel,
    Holder<java.lang.String> ioLocked);


  /**
   * @param iLocked Mandatory boolean parameter.
   */

  @DISPID(1611006119) //= 0x600600a7. The runtime will prefer the VTID if present
  @VTID(194)
  void setMouseSpeedValueLock(
    boolean iLocked);


  /**
   * <p>
   * Getter method for the COM property "KeyboardRotationAngleValue"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611006120) //= 0x600600a8. The runtime will prefer the VTID if present
  @VTID(195)
  int keyboardRotationAngleValue();


  /**
   * <p>
   * Setter method for the COM property "KeyboardRotationAngleValue"
   * </p>
   * @param ioKeyboardRotationAngleValue Mandatory int parameter.
   */

  @DISPID(1611006120) //= 0x600600a8. The runtime will prefer the VTID if present
  @VTID(196)
  void keyboardRotationAngleValue(
    int ioKeyboardRotationAngleValue);


  /**
   * @param ioAdminLevel Mandatory Holder<java.lang.String> parameter.
   * @param ioLocked Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1611006122) //= 0x600600aa. The runtime will prefer the VTID if present
  @VTID(197)
  boolean getKeyboardRotationAngleValueInfo(
    Holder<java.lang.String> ioAdminLevel,
    Holder<java.lang.String> ioLocked);


  /**
   * @param iLocked Mandatory boolean parameter.
   */

  @DISPID(1611006123) //= 0x600600ab. The runtime will prefer the VTID if present
  @VTID(198)
  void setKeyboardRotationAngleValueLock(
    boolean iLocked);


  /**
   * <p>
   * Getter method for the COM property "OcclusionCullingMode"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1611006124) //= 0x600600ac. The runtime will prefer the VTID if present
  @VTID(199)
  boolean occlusionCullingMode();


  /**
   * <p>
   * Setter method for the COM property "OcclusionCullingMode"
   * </p>
   * @param ioOcclusionCullingMode Mandatory boolean parameter.
   */

  @DISPID(1611006124) //= 0x600600ac. The runtime will prefer the VTID if present
  @VTID(200)
  void occlusionCullingMode(
    boolean ioOcclusionCullingMode);


  /**
   * @param ioAdminLevel Mandatory Holder<java.lang.String> parameter.
   * @param ioLocked Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1611006126) //= 0x600600ae. The runtime will prefer the VTID if present
  @VTID(201)
  boolean getOcclusionCullingModeInfo(
    Holder<java.lang.String> ioAdminLevel,
    Holder<java.lang.String> ioLocked);


  /**
   * @param iLocked Mandatory boolean parameter.
   */

  @DISPID(1611006127) //= 0x600600af. The runtime will prefer the VTID if present
  @VTID(202)
  void setOcclusionCullingModeLock(
    boolean iLocked);


  /**
   * <p>
   * Getter method for the COM property "Viz3DAccuracyMode"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1611006128) //= 0x600600b0. The runtime will prefer the VTID if present
  @VTID(203)
  boolean viz3DAccuracyMode();


  /**
   * <p>
   * Setter method for the COM property "Viz3DAccuracyMode"
   * </p>
   * @param io3DAccuracyMode Mandatory boolean parameter.
   */

  @DISPID(1611006128) //= 0x600600b0. The runtime will prefer the VTID if present
  @VTID(204)
  void viz3DAccuracyMode(
    boolean io3DAccuracyMode);


  /**
   * @param ioAdminLevel Mandatory Holder<java.lang.String> parameter.
   * @param ioLocked Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1611006130) //= 0x600600b2. The runtime will prefer the VTID if present
  @VTID(205)
  boolean getViz3DAccuracyModeInfo(
    Holder<java.lang.String> ioAdminLevel,
    Holder<java.lang.String> ioLocked);


  /**
   * @param iLocked Mandatory boolean parameter.
   */

  @DISPID(1611006131) //= 0x600600b3. The runtime will prefer the VTID if present
  @VTID(206)
  void setViz3DAccuracyModeLock(
    boolean iLocked);


  /**
   * <p>
   * Getter method for the COM property "Viz3DProportionnalAccuracy"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(1611006132) //= 0x600600b4. The runtime will prefer the VTID if present
  @VTID(207)
  double viz3DProportionnalAccuracy();


  /**
   * <p>
   * Setter method for the COM property "Viz3DProportionnalAccuracy"
   * </p>
   * @param io3DProportionnalAccuracy Mandatory double parameter.
   */

  @DISPID(1611006132) //= 0x600600b4. The runtime will prefer the VTID if present
  @VTID(208)
  void viz3DProportionnalAccuracy(
    double io3DProportionnalAccuracy);


  /**
   * @param ioAdminLevel Mandatory Holder<java.lang.String> parameter.
   * @param ioLocked Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1611006134) //= 0x600600b6. The runtime will prefer the VTID if present
  @VTID(209)
  boolean getViz3DProportionnalAccuracyInfo(
    Holder<java.lang.String> ioAdminLevel,
    Holder<java.lang.String> ioLocked);


  /**
   * @param iLocked Mandatory boolean parameter.
   */

  @DISPID(1611006135) //= 0x600600b7. The runtime will prefer the VTID if present
  @VTID(210)
  void setViz3DProportionnalAccuracyLock(
    boolean iLocked);


  /**
   * <p>
   * Getter method for the COM property "Viz3DFixedAccuracy"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(1611006136) //= 0x600600b8. The runtime will prefer the VTID if present
  @VTID(211)
  double viz3DFixedAccuracy();


  /**
   * <p>
   * Setter method for the COM property "Viz3DFixedAccuracy"
   * </p>
   * @param io3DFixedAccuracy Mandatory double parameter.
   */

  @DISPID(1611006136) //= 0x600600b8. The runtime will prefer the VTID if present
  @VTID(212)
  void viz3DFixedAccuracy(
    double io3DFixedAccuracy);


  /**
   * @param ioAdminLevel Mandatory Holder<java.lang.String> parameter.
   * @param ioLocked Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1611006138) //= 0x600600ba. The runtime will prefer the VTID if present
  @VTID(213)
  boolean getViz3DFixedAccuracyInfo(
    Holder<java.lang.String> ioAdminLevel,
    Holder<java.lang.String> ioLocked);


  /**
   * @param iLocked Mandatory boolean parameter.
   */

  @DISPID(1611006139) //= 0x600600bb. The runtime will prefer the VTID if present
  @VTID(214)
  void setViz3DFixedAccuracyLock(
    boolean iLocked);


  /**
   * <p>
   * Getter method for the COM property "Viz3DCurveAccuracy"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(1611006140) //= 0x600600bc. The runtime will prefer the VTID if present
  @VTID(215)
  double viz3DCurveAccuracy();


  /**
   * <p>
   * Setter method for the COM property "Viz3DCurveAccuracy"
   * </p>
   * @param io3DCurveAccuracy Mandatory double parameter.
   */

  @DISPID(1611006140) //= 0x600600bc. The runtime will prefer the VTID if present
  @VTID(216)
  void viz3DCurveAccuracy(
    double io3DCurveAccuracy);


  /**
   * @param ioAdminLevel Mandatory Holder<java.lang.String> parameter.
   * @param ioLocked Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1611006142) //= 0x600600be. The runtime will prefer the VTID if present
  @VTID(217)
  boolean getViz3DCurveAccuracyInfo(
    Holder<java.lang.String> ioAdminLevel,
    Holder<java.lang.String> ioLocked);


  /**
   * @param iLocked Mandatory boolean parameter.
   */

  @DISPID(1611006143) //= 0x600600bf. The runtime will prefer the VTID if present
  @VTID(218)
  void setViz3DCurveAccuracyLock(
    boolean iLocked);


  /**
   * <p>
   * Getter method for the COM property "Viz2DAccuracyMode"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1611006144) //= 0x600600c0. The runtime will prefer the VTID if present
  @VTID(219)
  boolean viz2DAccuracyMode();


  /**
   * <p>
   * Setter method for the COM property "Viz2DAccuracyMode"
   * </p>
   * @param io2DAccuracyMode Mandatory boolean parameter.
   */

  @DISPID(1611006144) //= 0x600600c0. The runtime will prefer the VTID if present
  @VTID(220)
  void viz2DAccuracyMode(
    boolean io2DAccuracyMode);


  /**
   * @param ioAdminLevel Mandatory Holder<java.lang.String> parameter.
   * @param ioLocked Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1611006146) //= 0x600600c2. The runtime will prefer the VTID if present
  @VTID(221)
  boolean getViz2DAccuracyModeInfo(
    Holder<java.lang.String> ioAdminLevel,
    Holder<java.lang.String> ioLocked);


  /**
   * @param iLocked Mandatory boolean parameter.
   */

  @DISPID(1611006147) //= 0x600600c3. The runtime will prefer the VTID if present
  @VTID(222)
  void setViz2DAccuracyModeLock(
    boolean iLocked);


  /**
   * <p>
   * Getter method for the COM property "Viz2DProportionnalAccuracy"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(1611006148) //= 0x600600c4. The runtime will prefer the VTID if present
  @VTID(223)
  double viz2DProportionnalAccuracy();


  /**
   * <p>
   * Setter method for the COM property "Viz2DProportionnalAccuracy"
   * </p>
   * @param io2DProportionnalAccuracy Mandatory double parameter.
   */

  @DISPID(1611006148) //= 0x600600c4. The runtime will prefer the VTID if present
  @VTID(224)
  void viz2DProportionnalAccuracy(
    double io2DProportionnalAccuracy);


  /**
   * @param ioAdminLevel Mandatory Holder<java.lang.String> parameter.
   * @param ioLocked Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1611006150) //= 0x600600c6. The runtime will prefer the VTID if present
  @VTID(225)
  boolean getViz2DProportionnalAccuracyInfo(
    Holder<java.lang.String> ioAdminLevel,
    Holder<java.lang.String> ioLocked);


  /**
   * @param iLocked Mandatory boolean parameter.
   */

  @DISPID(1611006151) //= 0x600600c7. The runtime will prefer the VTID if present
  @VTID(226)
  void setViz2DProportionnalAccuracyLock(
    boolean iLocked);


  /**
   * <p>
   * Getter method for the COM property "Viz2DFixedAccuracy"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(1611006152) //= 0x600600c8. The runtime will prefer the VTID if present
  @VTID(227)
  double viz2DFixedAccuracy();


  /**
   * <p>
   * Setter method for the COM property "Viz2DFixedAccuracy"
   * </p>
   * @param io2DFixedAccuracy Mandatory double parameter.
   */

  @DISPID(1611006152) //= 0x600600c8. The runtime will prefer the VTID if present
  @VTID(228)
  void viz2DFixedAccuracy(
    double io2DFixedAccuracy);


  /**
   * @param ioAdminLevel Mandatory Holder<java.lang.String> parameter.
   * @param ioLocked Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1611006154) //= 0x600600ca. The runtime will prefer the VTID if present
  @VTID(229)
  boolean getViz2DFixedAccuracyInfo(
    Holder<java.lang.String> ioAdminLevel,
    Holder<java.lang.String> ioLocked);


  /**
   * @param iLocked Mandatory boolean parameter.
   */

  @DISPID(1611006155) //= 0x600600cb. The runtime will prefer the VTID if present
  @VTID(230)
  void setViz2DFixedAccuracyLock(
    boolean iLocked);


  /**
   * <p>
   * Getter method for the COM property "StaticLOD"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(1611006156) //= 0x600600cc. The runtime will prefer the VTID if present
  @VTID(231)
  double staticLOD();


  /**
   * <p>
   * Setter method for the COM property "StaticLOD"
   * </p>
   * @param ioStaticLOD Mandatory double parameter.
   */

  @DISPID(1611006156) //= 0x600600cc. The runtime will prefer the VTID if present
  @VTID(232)
  void staticLOD(
    double ioStaticLOD);


  /**
   * @param ioAdminLevel Mandatory Holder<java.lang.String> parameter.
   * @param ioLocked Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1611006158) //= 0x600600ce. The runtime will prefer the VTID if present
  @VTID(233)
  boolean getStaticLODInfo(
    Holder<java.lang.String> ioAdminLevel,
    Holder<java.lang.String> ioLocked);


  /**
   * @param iLocked Mandatory boolean parameter.
   */

  @DISPID(1611006159) //= 0x600600cf. The runtime will prefer the VTID if present
  @VTID(234)
  void setStaticLODLock(
    boolean iLocked);


  /**
   * <p>
   * Getter method for the COM property "DynamicLOD"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(1611006160) //= 0x600600d0. The runtime will prefer the VTID if present
  @VTID(235)
  double dynamicLOD();


  /**
   * <p>
   * Setter method for the COM property "DynamicLOD"
   * </p>
   * @param ioDynamicLOD Mandatory double parameter.
   */

  @DISPID(1611006160) //= 0x600600d0. The runtime will prefer the VTID if present
  @VTID(236)
  void dynamicLOD(
    double ioDynamicLOD);


  /**
   * @param ioAdminLevel Mandatory Holder<java.lang.String> parameter.
   * @param ioLocked Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1611006162) //= 0x600600d2. The runtime will prefer the VTID if present
  @VTID(237)
  boolean getDynamicLODInfo(
    Holder<java.lang.String> ioAdminLevel,
    Holder<java.lang.String> ioLocked);


  /**
   * @param iLocked Mandatory boolean parameter.
   */

  @DISPID(1611006163) //= 0x600600d3. The runtime will prefer the VTID if present
  @VTID(238)
  void setDynamicLODLock(
    boolean iLocked);


  /**
   * <p>
   * Getter method for the COM property "StaticCull"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611006164) //= 0x600600d4. The runtime will prefer the VTID if present
  @VTID(239)
  int staticCull();


  /**
   * <p>
   * Setter method for the COM property "StaticCull"
   * </p>
   * @param ioStaticCull Mandatory int parameter.
   */

  @DISPID(1611006164) //= 0x600600d4. The runtime will prefer the VTID if present
  @VTID(240)
  void staticCull(
    int ioStaticCull);


  /**
   * @param ioAdminLevel Mandatory Holder<java.lang.String> parameter.
   * @param ioLocked Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1611006166) //= 0x600600d6. The runtime will prefer the VTID if present
  @VTID(241)
  boolean getStaticCullInfo(
    Holder<java.lang.String> ioAdminLevel,
    Holder<java.lang.String> ioLocked);


  /**
   * @param iLocked Mandatory boolean parameter.
   */

  @DISPID(1611006167) //= 0x600600d7. The runtime will prefer the VTID if present
  @VTID(242)
  void setStaticCullLock(
    boolean iLocked);


  /**
   * <p>
   * Getter method for the COM property "DynamicCull"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611006168) //= 0x600600d8. The runtime will prefer the VTID if present
  @VTID(243)
  int dynamicCull();


  /**
   * <p>
   * Setter method for the COM property "DynamicCull"
   * </p>
   * @param ioDynamicCull Mandatory int parameter.
   */

  @DISPID(1611006168) //= 0x600600d8. The runtime will prefer the VTID if present
  @VTID(244)
  void dynamicCull(
    int ioDynamicCull);


  /**
   * @param ioAdminLevel Mandatory Holder<java.lang.String> parameter.
   * @param ioLocked Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1611006170) //= 0x600600da. The runtime will prefer the VTID if present
  @VTID(245)
  boolean getDynamicCullInfo(
    Holder<java.lang.String> ioAdminLevel,
    Holder<java.lang.String> ioLocked);


  /**
   * @param iLocked Mandatory boolean parameter.
   */

  @DISPID(1611006171) //= 0x600600db. The runtime will prefer the VTID if present
  @VTID(246)
  void setDynamicCullLock(
    boolean iLocked);


  /**
   * <p>
   * Getter method for the COM property "TransparencyMode"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1611006172) //= 0x600600dc. The runtime will prefer the VTID if present
  @VTID(247)
  boolean transparencyMode();


  /**
   * <p>
   * Setter method for the COM property "TransparencyMode"
   * </p>
   * @param ioTransparencyMode Mandatory boolean parameter.
   */

  @DISPID(1611006172) //= 0x600600dc. The runtime will prefer the VTID if present
  @VTID(248)
  void transparencyMode(
    boolean ioTransparencyMode);


  /**
   * @param ioAdminLevel Mandatory Holder<java.lang.String> parameter.
   * @param ioLocked Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1611006174) //= 0x600600de. The runtime will prefer the VTID if present
  @VTID(249)
  boolean getTransparencyModeInfo(
    Holder<java.lang.String> ioAdminLevel,
    Holder<java.lang.String> ioLocked);


  /**
   * @param iLocked Mandatory boolean parameter.
   */

  @DISPID(1611006175) //= 0x600600df. The runtime will prefer the VTID if present
  @VTID(250)
  void setTransparencyModeLock(
    boolean iLocked);


  /**
   * <p>
   * Getter method for the COM property "MinimumFPSMode"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1611006176) //= 0x600600e0. The runtime will prefer the VTID if present
  @VTID(251)
  boolean minimumFPSMode();


  /**
   * <p>
   * Setter method for the COM property "MinimumFPSMode"
   * </p>
   * @param ioMinimumFPSMode Mandatory boolean parameter.
   */

  @DISPID(1611006176) //= 0x600600e0. The runtime will prefer the VTID if present
  @VTID(252)
  void minimumFPSMode(
    boolean ioMinimumFPSMode);


  /**
   * @param ioAdminLevel Mandatory Holder<java.lang.String> parameter.
   * @param ioLocked Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1611006178) //= 0x600600e2. The runtime will prefer the VTID if present
  @VTID(253)
  boolean getMinimumFPSModeInfo(
    Holder<java.lang.String> ioAdminLevel,
    Holder<java.lang.String> ioLocked);


  /**
   * @param iLocked Mandatory boolean parameter.
   */

  @DISPID(1611006179) //= 0x600600e3. The runtime will prefer the VTID if present
  @VTID(254)
  void setMinimumFPSModeLock(
    boolean iLocked);


  /**
   * <p>
   * Getter method for the COM property "NumberOfMinimumFPS"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611006180) //= 0x600600e4. The runtime will prefer the VTID if present
  @VTID(255)
  int numberOfMinimumFPS();


  /**
   * <p>
   * Setter method for the COM property "NumberOfMinimumFPS"
   * </p>
   * @param ioNumberOfMinimumFPS Mandatory int parameter.
   */

  @DISPID(1611006180) //= 0x600600e4. The runtime will prefer the VTID if present
  @VTID(256)
  void numberOfMinimumFPS(
    int ioNumberOfMinimumFPS);


  /**
   * @param ioAdminLevel Mandatory Holder<java.lang.String> parameter.
   * @param ioLocked Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1611006182) //= 0x600600e6. The runtime will prefer the VTID if present
  @VTID(257)
  boolean getNumberOfMinimumFPSInfo(
    Holder<java.lang.String> ioAdminLevel,
    Holder<java.lang.String> ioLocked);


  /**
   * @param iLocked Mandatory boolean parameter.
   */

  @DISPID(1611006183) //= 0x600600e7. The runtime will prefer the VTID if present
  @VTID(258)
  void setNumberOfMinimumFPSLock(
    boolean iLocked);


  /**
   * <p>
   * Getter method for the COM property "MinimumSpaceFPSMode"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1611006184) //= 0x600600e8. The runtime will prefer the VTID if present
  @VTID(259)
  boolean minimumSpaceFPSMode();


  /**
   * <p>
   * Setter method for the COM property "MinimumSpaceFPSMode"
   * </p>
   * @param ioMinimumSpaceFPSMode Mandatory boolean parameter.
   */

  @DISPID(1611006184) //= 0x600600e8. The runtime will prefer the VTID if present
  @VTID(260)
  void minimumSpaceFPSMode(
    boolean ioMinimumSpaceFPSMode);


  /**
   * @param ioAdminLevel Mandatory Holder<java.lang.String> parameter.
   * @param ioLocked Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1611006186) //= 0x600600ea. The runtime will prefer the VTID if present
  @VTID(261)
  boolean getMinimumSpaceFPSModeInfo(
    Holder<java.lang.String> ioAdminLevel,
    Holder<java.lang.String> ioLocked);


  /**
   * @param iLocked Mandatory boolean parameter.
   */

  @DISPID(1611006187) //= 0x600600eb. The runtime will prefer the VTID if present
  @VTID(262)
  void setMinimumSpaceFPSModeLock(
    boolean iLocked);


  /**
   * <p>
   * Getter method for the COM property "NumberOfMinimumSpaceFPS"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611006188) //= 0x600600ec. The runtime will prefer the VTID if present
  @VTID(263)
  int numberOfMinimumSpaceFPS();


  /**
   * <p>
   * Setter method for the COM property "NumberOfMinimumSpaceFPS"
   * </p>
   * @param ioNumberOfMinimumSpaceFPS Mandatory int parameter.
   */

  @DISPID(1611006188) //= 0x600600ec. The runtime will prefer the VTID if present
  @VTID(264)
  void numberOfMinimumSpaceFPS(
    int ioNumberOfMinimumSpaceFPS);


  /**
   * @param ioAdminLevel Mandatory Holder<java.lang.String> parameter.
   * @param ioLocked Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1611006190) //= 0x600600ee. The runtime will prefer the VTID if present
  @VTID(265)
  boolean getNumberOfMinimumSpaceFPSInfo(
    Holder<java.lang.String> ioAdminLevel,
    Holder<java.lang.String> ioLocked);


  /**
   * @param iLocked Mandatory boolean parameter.
   */

  @DISPID(1611006191) //= 0x600600ef. The runtime will prefer the VTID if present
  @VTID(266)
  void setNumberOfMinimumSpaceFPSLock(
    boolean iLocked);


  /**
   * <p>
   * Getter method for the COM property "IsoparGenerationMode"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1611006192) //= 0x600600f0. The runtime will prefer the VTID if present
  @VTID(267)
  boolean isoparGenerationMode();


  /**
   * <p>
   * Setter method for the COM property "IsoparGenerationMode"
   * </p>
   * @param ioIsoparGenerationMode Mandatory boolean parameter.
   */

  @DISPID(1611006192) //= 0x600600f0. The runtime will prefer the VTID if present
  @VTID(268)
  void isoparGenerationMode(
    boolean ioIsoparGenerationMode);


  /**
   * @param ioAdminLevel Mandatory Holder<java.lang.String> parameter.
   * @param ioLocked Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1611006194) //= 0x600600f2. The runtime will prefer the VTID if present
  @VTID(269)
  boolean getIsoparGenerationModeInfo(
    Holder<java.lang.String> ioAdminLevel,
    Holder<java.lang.String> ioLocked);


  /**
   * @param iLocked Mandatory boolean parameter.
   */

  @DISPID(1611006195) //= 0x600600f3. The runtime will prefer the VTID if present
  @VTID(270)
  void setIsoparGenerationModeLock(
    boolean iLocked);


  /**
   * <p>
   * Getter method for the COM property "NbIsopars"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611006196) //= 0x600600f4. The runtime will prefer the VTID if present
  @VTID(271)
  int nbIsopars();


  /**
   * <p>
   * Setter method for the COM property "NbIsopars"
   * </p>
   * @param ioNbIsopars Mandatory int parameter.
   */

  @DISPID(1611006196) //= 0x600600f4. The runtime will prefer the VTID if present
  @VTID(272)
  void nbIsopars(
    int ioNbIsopars);


  /**
   * @param ioAdminLevel Mandatory Holder<java.lang.String> parameter.
   * @param ioLocked Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1611006198) //= 0x600600f6. The runtime will prefer the VTID if present
  @VTID(273)
  boolean getNbIsoparsInfo(
    Holder<java.lang.String> ioAdminLevel,
    Holder<java.lang.String> ioLocked);


  /**
   * @param iLocked Mandatory boolean parameter.
   */

  @DISPID(1611006199) //= 0x600600f7. The runtime will prefer the VTID if present
  @VTID(274)
  void setNbIsoparsLock(
    boolean iLocked);


  /**
   * <p>
   * Getter method for the COM property "TwoSideLightingMode"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1611006200) //= 0x600600f8. The runtime will prefer the VTID if present
  @VTID(275)
  boolean twoSideLightingMode();


  /**
   * <p>
   * Setter method for the COM property "TwoSideLightingMode"
   * </p>
   * @param ioTwoSideLightingMode Mandatory boolean parameter.
   */

  @DISPID(1611006200) //= 0x600600f8. The runtime will prefer the VTID if present
  @VTID(276)
  void twoSideLightingMode(
    boolean ioTwoSideLightingMode);


  /**
   * @param ioAdminLevel Mandatory Holder<java.lang.String> parameter.
   * @param ioLocked Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1611006202) //= 0x600600fa. The runtime will prefer the VTID if present
  @VTID(277)
  boolean getTwoSideLightingModeInfo(
    Holder<java.lang.String> ioAdminLevel,
    Holder<java.lang.String> ioLocked);


  /**
   * @param iLocked Mandatory boolean parameter.
   */

  @DISPID(1611006203) //= 0x600600fb. The runtime will prefer the VTID if present
  @VTID(278)
  void setTwoSideLightingModeLock(
    boolean iLocked);


  /**
   * <p>
   * Getter method for the COM property "BackFaceCullingMode"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1611006204) //= 0x600600fc. The runtime will prefer the VTID if present
  @VTID(279)
  boolean backFaceCullingMode();


  /**
   * <p>
   * Setter method for the COM property "BackFaceCullingMode"
   * </p>
   * @param ioBackFaceCullingMode Mandatory boolean parameter.
   */

  @DISPID(1611006204) //= 0x600600fc. The runtime will prefer the VTID if present
  @VTID(280)
  void backFaceCullingMode(
    boolean ioBackFaceCullingMode);


  /**
   * @return  Returns a value of type CATBackFaceCullingMode
   */

  @DISPID(1611006206) //= 0x600600fe. The runtime will prefer the VTID if present
  @VTID(281)
  CATBackFaceCullingMode getBackFaceCullingMode();


  /**
   * @param iBackFaceCullingMode Mandatory CATBackFaceCullingMode parameter.
   */

  @DISPID(1611006207) //= 0x600600ff. The runtime will prefer the VTID if present
  @VTID(282)
  void putBackFaceCullingMode(
    CATBackFaceCullingMode iBackFaceCullingMode);


  /**
   * @param ioAdminLevel Mandatory Holder<java.lang.String> parameter.
   * @param ioLocked Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1611006208) //= 0x60060100. The runtime will prefer the VTID if present
  @VTID(283)
  boolean getBackFaceCullingModeInfo(
    Holder<java.lang.String> ioAdminLevel,
    Holder<java.lang.String> ioLocked);


  /**
   * @param iLocked Mandatory boolean parameter.
   */

  @DISPID(1611006209) //= 0x60060101. The runtime will prefer the VTID if present
  @VTID(284)
  void setBackFaceCullingModeLock(
    boolean iLocked);


  /**
   * <p>
   * Getter method for the COM property "LightViewerMode"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1611006210) //= 0x60060102. The runtime will prefer the VTID if present
  @VTID(285)
  boolean lightViewerMode();


  /**
   * <p>
   * Setter method for the COM property "LightViewerMode"
   * </p>
   * @param ioLightViewerMode Mandatory boolean parameter.
   */

  @DISPID(1611006210) //= 0x60060102. The runtime will prefer the VTID if present
  @VTID(286)
  void lightViewerMode(
    boolean ioLightViewerMode);


  /**
   * @param ioAdminLevel Mandatory Holder<java.lang.String> parameter.
   * @param ioLocked Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1611006212) //= 0x60060104. The runtime will prefer the VTID if present
  @VTID(287)
  boolean getLightViewerModeInfo(
    Holder<java.lang.String> ioAdminLevel,
    Holder<java.lang.String> ioLocked);


  /**
   * @param iLocked Mandatory boolean parameter.
   */

  @DISPID(1611006213) //= 0x60060105. The runtime will prefer the VTID if present
  @VTID(288)
  void setLightViewerModeLock(
    boolean iLocked);


  /**
   * <p>
   * Getter method for the COM property "LineicCgrMode"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1611006214) //= 0x60060106. The runtime will prefer the VTID if present
  @VTID(289)
  boolean lineicCgrMode();


  /**
   * <p>
   * Setter method for the COM property "LineicCgrMode"
   * </p>
   * @param ioLineicCgrMode Mandatory boolean parameter.
   */

  @DISPID(1611006214) //= 0x60060106. The runtime will prefer the VTID if present
  @VTID(290)
  void lineicCgrMode(
    boolean ioLineicCgrMode);


  /**
   * @param ioAdminLevel Mandatory Holder<java.lang.String> parameter.
   * @param ioLocked Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1611006216) //= 0x60060108. The runtime will prefer the VTID if present
  @VTID(291)
  boolean getLineicCgrModeInfo(
    Holder<java.lang.String> ioAdminLevel,
    Holder<java.lang.String> ioLocked);


  /**
   * @param iLocked Mandatory boolean parameter.
   */

  @DISPID(1611006217) //= 0x60060109. The runtime will prefer the VTID if present
  @VTID(292)
  void setLineicCgrModeLock(
    boolean iLocked);


  /**
   * <p>
   * Getter method for the COM property "ShaderMode"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1611006218) //= 0x6006010a. The runtime will prefer the VTID if present
  @VTID(293)
  boolean shaderMode();


  /**
   * <p>
   * Setter method for the COM property "ShaderMode"
   * </p>
   * @param ioShaderMode Mandatory boolean parameter.
   */

  @DISPID(1611006218) //= 0x6006010a. The runtime will prefer the VTID if present
  @VTID(294)
  void shaderMode(
    boolean ioShaderMode);


  /**
   * @param ioAdminLevel Mandatory Holder<java.lang.String> parameter.
   * @param ioLocked Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1611006220) //= 0x6006010c. The runtime will prefer the VTID if present
  @VTID(295)
  boolean getShaderModeInfo(
    Holder<java.lang.String> ioAdminLevel,
    Holder<java.lang.String> ioLocked);


  /**
   * @param iLocked Mandatory boolean parameter.
   */

  @DISPID(1611006221) //= 0x6006010d. The runtime will prefer the VTID if present
  @VTID(296)
  void setShaderModeLock(
    boolean iLocked);


  /**
   * <p>
   * Getter method for the COM property "HaloMode"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1611006222) //= 0x6006010e. The runtime will prefer the VTID if present
  @VTID(297)
  boolean haloMode();


  /**
   * <p>
   * Setter method for the COM property "HaloMode"
   * </p>
   * @param ioHaloMode Mandatory boolean parameter.
   */

  @DISPID(1611006222) //= 0x6006010e. The runtime will prefer the VTID if present
  @VTID(298)
  void haloMode(
    boolean ioHaloMode);


  /**
   * @param ioAdminLevel Mandatory Holder<java.lang.String> parameter.
   * @param ioLocked Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1611006224) //= 0x60060110. The runtime will prefer the VTID if present
  @VTID(299)
  boolean getHaloModeInfo(
    Holder<java.lang.String> ioAdminLevel,
    Holder<java.lang.String> ioLocked);


  /**
   * @param iLocked Mandatory boolean parameter.
   */

  @DISPID(1611006225) //= 0x60060111. The runtime will prefer the VTID if present
  @VTID(300)
  void setHaloModeLock(
    boolean iLocked);


  /**
   * <p>
   * Getter method for the COM property "PickingWindowSize"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611006226) //= 0x60060112. The runtime will prefer the VTID if present
  @VTID(301)
  int pickingWindowSize();


  /**
   * <p>
   * Setter method for the COM property "PickingWindowSize"
   * </p>
   * @param ioPickingWindowSize Mandatory int parameter.
   */

  @DISPID(1611006226) //= 0x60060112. The runtime will prefer the VTID if present
  @VTID(302)
  void pickingWindowSize(
    int ioPickingWindowSize);


  /**
   * @param ioAdminLevel Mandatory Holder<java.lang.String> parameter.
   * @param ioLocked Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1611006228) //= 0x60060114. The runtime will prefer the VTID if present
  @VTID(303)
  boolean getPickingWindowSizeInfo(
    Holder<java.lang.String> ioAdminLevel,
    Holder<java.lang.String> ioLocked);


  /**
   * @param iLocked Mandatory boolean parameter.
   */

  @DISPID(1611006229) //= 0x60060115. The runtime will prefer the VTID if present
  @VTID(304)
  void setPickingWindowSizeLock(
    boolean iLocked);


  /**
   * <p>
   * Getter method for the COM property "AccuratePickingMode"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1611006230) //= 0x60060116. The runtime will prefer the VTID if present
  @VTID(305)
  boolean accuratePickingMode();


  /**
   * <p>
   * Setter method for the COM property "AccuratePickingMode"
   * </p>
   * @param ioAccuratePickingMode Mandatory boolean parameter.
   */

  @DISPID(1611006230) //= 0x60060116. The runtime will prefer the VTID if present
  @VTID(306)
  void accuratePickingMode(
    boolean ioAccuratePickingMode);


  /**
   * @param ioAdminLevel Mandatory Holder<java.lang.String> parameter.
   * @param ioLocked Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1611006232) //= 0x60060118. The runtime will prefer the VTID if present
  @VTID(307)
  boolean getAccuratePickingModeInfo(
    Holder<java.lang.String> ioAdminLevel,
    Holder<java.lang.String> ioLocked);


  /**
   * @param iLocked Mandatory boolean parameter.
   */

  @DISPID(1611006233) //= 0x60060119. The runtime will prefer the VTID if present
  @VTID(308)
  void setAccuratePickingModeLock(
    boolean iLocked);


  /**
   * <p>
   * Getter method for the COM property "AccuratePickingWindowSize"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611006234) //= 0x6006011a. The runtime will prefer the VTID if present
  @VTID(309)
  int accuratePickingWindowSize();


  /**
   * <p>
   * Setter method for the COM property "AccuratePickingWindowSize"
   * </p>
   * @param ioAccuratePickingWindowSize Mandatory int parameter.
   */

  @DISPID(1611006234) //= 0x6006011a. The runtime will prefer the VTID if present
  @VTID(310)
  void accuratePickingWindowSize(
    int ioAccuratePickingWindowSize);


  /**
   * @param ioAdminLevel Mandatory Holder<java.lang.String> parameter.
   * @param ioLocked Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1611006236) //= 0x6006011c. The runtime will prefer the VTID if present
  @VTID(311)
  boolean getAccuratePickingWindowSizeInfo(
    Holder<java.lang.String> ioAdminLevel,
    Holder<java.lang.String> ioLocked);


  /**
   * @param iLocked Mandatory boolean parameter.
   */

  @DISPID(1611006237) //= 0x6006011d. The runtime will prefer the VTID if present
  @VTID(312)
  void setAccuratePickingWindowSizeLock(
    boolean iLocked);


  /**
   * <p>
   * Getter method for the COM property "MouseDoubleClicDelay"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611006238) //= 0x6006011e. The runtime will prefer the VTID if present
  @VTID(313)
  int mouseDoubleClicDelay();


  /**
   * <p>
   * Setter method for the COM property "MouseDoubleClicDelay"
   * </p>
   * @param ioMouseDoubleClicDelay Mandatory int parameter.
   */

  @DISPID(1611006238) //= 0x6006011e. The runtime will prefer the VTID if present
  @VTID(314)
  void mouseDoubleClicDelay(
    int ioMouseDoubleClicDelay);


  /**
   * @param ioAdminLevel Mandatory Holder<java.lang.String> parameter.
   * @param ioLocked Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1611006240) //= 0x60060120. The runtime will prefer the VTID if present
  @VTID(315)
  boolean getMouseDoubleClicDelayInfo(
    Holder<java.lang.String> ioAdminLevel,
    Holder<java.lang.String> ioLocked);


  /**
   * @param iLocked Mandatory boolean parameter.
   */

  @DISPID(1611006241) //= 0x60060121. The runtime will prefer the VTID if present
  @VTID(316)
  void setMouseDoubleClicDelayLock(
    boolean iLocked);


  /**
   * <p>
   * Getter method for the COM property "AmbientActivation"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611006242) //= 0x60060122. The runtime will prefer the VTID if present
  @VTID(317)
  int ambientActivation();


  /**
   * <p>
   * Setter method for the COM property "AmbientActivation"
   * </p>
   * @param ioAmbientActivation Mandatory int parameter.
   */

  @DISPID(1611006242) //= 0x60060122. The runtime will prefer the VTID if present
  @VTID(318)
  void ambientActivation(
    int ioAmbientActivation);


  /**
   * @param ioAdminLevel Mandatory Holder<java.lang.String> parameter.
   * @param ioLocked Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1611006244) //= 0x60060124. The runtime will prefer the VTID if present
  @VTID(319)
  boolean getAmbientActivationInfo(
    Holder<java.lang.String> ioAdminLevel,
    Holder<java.lang.String> ioLocked);


  /**
   * @param iLocked Mandatory boolean parameter.
   */

  @DISPID(1611006245) //= 0x60060125. The runtime will prefer the VTID if present
  @VTID(320)
  void setAmbientActivationLock(
    boolean iLocked);


  /**
   * <p>
   * Getter method for the COM property "DefaultDiffuseAmbientCoefficient"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(1611006246) //= 0x60060126. The runtime will prefer the VTID if present
  @VTID(321)
  double defaultDiffuseAmbientCoefficient();


  /**
   * <p>
   * Setter method for the COM property "DefaultDiffuseAmbientCoefficient"
   * </p>
   * @param ioDefaultDiffuseAmbientCoefficient Mandatory double parameter.
   */

  @DISPID(1611006246) //= 0x60060126. The runtime will prefer the VTID if present
  @VTID(322)
  void defaultDiffuseAmbientCoefficient(
    double ioDefaultDiffuseAmbientCoefficient);


  /**
   * @param ioAdminLevel Mandatory Holder<java.lang.String> parameter.
   * @param ioLocked Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1611006248) //= 0x60060128. The runtime will prefer the VTID if present
  @VTID(323)
  boolean getDefaultDiffuseAmbientCoefficientInfo(
    Holder<java.lang.String> ioAdminLevel,
    Holder<java.lang.String> ioLocked);


  /**
   * @param iLocked Mandatory boolean parameter.
   */

  @DISPID(1611006249) //= 0x60060129. The runtime will prefer the VTID if present
  @VTID(324)
  void setDefaultDiffuseAmbientCoefficientLock(
    boolean iLocked);


  /**
   * <p>
   * Getter method for the COM property "DefaultSpecularCoefficient"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(1611006250) //= 0x6006012a. The runtime will prefer the VTID if present
  @VTID(325)
  double defaultSpecularCoefficient();


  /**
   * <p>
   * Setter method for the COM property "DefaultSpecularCoefficient"
   * </p>
   * @param ioDefaultSpecularCoefficient Mandatory double parameter.
   */

  @DISPID(1611006250) //= 0x6006012a. The runtime will prefer the VTID if present
  @VTID(326)
  void defaultSpecularCoefficient(
    double ioDefaultSpecularCoefficient);


  /**
   * @param ioAdminLevel Mandatory Holder<java.lang.String> parameter.
   * @param ioLocked Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1611006252) //= 0x6006012c. The runtime will prefer the VTID if present
  @VTID(327)
  boolean getDefaultSpecularCoefficientInfo(
    Holder<java.lang.String> ioAdminLevel,
    Holder<java.lang.String> ioLocked);


  /**
   * @param iLocked Mandatory boolean parameter.
   */

  @DISPID(1611006253) //= 0x6006012d. The runtime will prefer the VTID if present
  @VTID(328)
  void setDefaultSpecularCoefficientLock(
    boolean iLocked);


  /**
   * <p>
   * Getter method for the COM property "DefaultShininess"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(1611006254) //= 0x6006012e. The runtime will prefer the VTID if present
  @VTID(329)
  double defaultShininess();


  /**
   * <p>
   * Setter method for the COM property "DefaultShininess"
   * </p>
   * @param ioDefaultShininess Mandatory double parameter.
   */

  @DISPID(1611006254) //= 0x6006012e. The runtime will prefer the VTID if present
  @VTID(330)
  void defaultShininess(
    double ioDefaultShininess);


  /**
   * @param ioAdminLevel Mandatory Holder<java.lang.String> parameter.
   * @param ioLocked Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1611006256) //= 0x60060130. The runtime will prefer the VTID if present
  @VTID(331)
  boolean getDefaultShininessInfo(
    Holder<java.lang.String> ioAdminLevel,
    Holder<java.lang.String> ioLocked);


  /**
   * @param iLocked Mandatory boolean parameter.
   */

  @DISPID(1611006257) //= 0x60060131. The runtime will prefer the VTID if present
  @VTID(332)
  void setDefaultShininessLock(
    boolean iLocked);


  /**
   * <p>
   * Getter method for the COM property "OpaqueFaces"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1611006258) //= 0x60060132. The runtime will prefer the VTID if present
  @VTID(333)
  boolean opaqueFaces();


  /**
   * <p>
   * Setter method for the COM property "OpaqueFaces"
   * </p>
   * @param oOpaqueFaces Mandatory boolean parameter.
   */

  @DISPID(1611006258) //= 0x60060132. The runtime will prefer the VTID if present
  @VTID(334)
  void opaqueFaces(
    boolean oOpaqueFaces);


  /**
   * @param ioAdminLevel Mandatory Holder<java.lang.String> parameter.
   * @param ioLocked Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1611006260) //= 0x60060134. The runtime will prefer the VTID if present
  @VTID(335)
  boolean getOpaqueFacesInfo(
    Holder<java.lang.String> ioAdminLevel,
    Holder<java.lang.String> ioLocked);


  /**
   * @param iLocked Mandatory boolean parameter.
   */

  @DISPID(1611006261) //= 0x60060135. The runtime will prefer the VTID if present
  @VTID(336)
  void setOpaqueFacesLock(
    boolean iLocked);


  // Properties:
}
