package CatiaV5TypeLibs.InfTypeLib;

import com4j.*;

@IID("{7FBD9B52-C961-0000-0280-030BA6000000}")
public interface PageSetup extends AnyObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "PaperSize"
   * </p>
   * @return  Returns a value of type CatPaperSize
   */

  @DISPID(1610940416) //= 0x60050000. The runtime will prefer the VTID if present
  @VTID(22)
  CatPaperSize paperSize();


  /**
   * <p>
   * Setter method for the COM property "PaperSize"
   * </p>
   * @param oPaperSize Mandatory CatPaperSize parameter.
   */

  @DISPID(1610940416) //= 0x60050000. The runtime will prefer the VTID if present
  @VTID(23)
  void paperSize(
    CatPaperSize oPaperSize);


  /**
   * <p>
   * Getter method for the COM property "PaperWidth"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(1610940418) //= 0x60050002. The runtime will prefer the VTID if present
  @VTID(24)
  float paperWidth();


  /**
   * <p>
   * Setter method for the COM property "PaperWidth"
   * </p>
   * @param oPaperWidth Mandatory float parameter.
   */

  @DISPID(1610940418) //= 0x60050002. The runtime will prefer the VTID if present
  @VTID(25)
  void paperWidth(
    float oPaperWidth);


  /**
   * <p>
   * Getter method for the COM property "PaperHeight"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(1610940420) //= 0x60050004. The runtime will prefer the VTID if present
  @VTID(26)
  float paperHeight();


  /**
   * <p>
   * Setter method for the COM property "PaperHeight"
   * </p>
   * @param oPaperHeight Mandatory float parameter.
   */

  @DISPID(1610940420) //= 0x60050004. The runtime will prefer the VTID if present
  @VTID(27)
  void paperHeight(
    float oPaperHeight);


  /**
   * <p>
   * Getter method for the COM property "Orientation"
   * </p>
   * @return  Returns a value of type CatPaperOrientation
   */

  @DISPID(1610940422) //= 0x60050006. The runtime will prefer the VTID if present
  @VTID(28)
  CatPaperOrientation orientation();


  /**
   * <p>
   * Setter method for the COM property "Orientation"
   * </p>
   * @param orientation Mandatory CatPaperOrientation parameter.
   */

  @DISPID(1610940422) //= 0x60050006. The runtime will prefer the VTID if present
  @VTID(29)
  void orientation(
    CatPaperOrientation orientation);


  /**
   * <p>
   * Getter method for the COM property "BottomMargin"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(1610940424) //= 0x60050008. The runtime will prefer the VTID if present
  @VTID(30)
  float bottomMargin();


  /**
   * <p>
   * Setter method for the COM property "BottomMargin"
   * </p>
   * @param oBottomMargin Mandatory float parameter.
   */

  @DISPID(1610940424) //= 0x60050008. The runtime will prefer the VTID if present
  @VTID(31)
  void bottomMargin(
    float oBottomMargin);


  /**
   * <p>
   * Getter method for the COM property "TopMargin"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(1610940426) //= 0x6005000a. The runtime will prefer the VTID if present
  @VTID(32)
  float topMargin();


  /**
   * <p>
   * Setter method for the COM property "TopMargin"
   * </p>
   * @param oTopMargin Mandatory float parameter.
   */

  @DISPID(1610940426) //= 0x6005000a. The runtime will prefer the VTID if present
  @VTID(33)
  void topMargin(
    float oTopMargin);


  /**
   * <p>
   * Getter method for the COM property "LeftMargin"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(1610940428) //= 0x6005000c. The runtime will prefer the VTID if present
  @VTID(34)
  float leftMargin();


  /**
   * <p>
   * Setter method for the COM property "LeftMargin"
   * </p>
   * @param oLeftMargin Mandatory float parameter.
   */

  @DISPID(1610940428) //= 0x6005000c. The runtime will prefer the VTID if present
  @VTID(35)
  void leftMargin(
    float oLeftMargin);


  /**
   * <p>
   * Getter method for the COM property "RightMargin"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(1610940430) //= 0x6005000e. The runtime will prefer the VTID if present
  @VTID(36)
  float rightMargin();


  /**
   * <p>
   * Setter method for the COM property "RightMargin"
   * </p>
   * @param oRightMargin Mandatory float parameter.
   */

  @DISPID(1610940430) //= 0x6005000e. The runtime will prefer the VTID if present
  @VTID(37)
  void rightMargin(
    float oRightMargin);


  /**
   * <p>
   * Getter method for the COM property "MaximumSize"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610940432) //= 0x60050010. The runtime will prefer the VTID if present
  @VTID(38)
  boolean maximumSize();


  /**
   * <p>
   * Setter method for the COM property "MaximumSize"
   * </p>
   * @param oMaxSize Mandatory boolean parameter.
   */

  @DISPID(1610940432) //= 0x60050010. The runtime will prefer the VTID if present
  @VTID(39)
  void maximumSize(
    boolean oMaxSize);


  /**
   * <p>
   * Getter method for the COM property "Left"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(1610940434) //= 0x60050012. The runtime will prefer the VTID if present
  @VTID(40)
  float left();


  /**
   * <p>
   * Setter method for the COM property "Left"
   * </p>
   * @param oLeft Mandatory float parameter.
   */

  @DISPID(1610940434) //= 0x60050012. The runtime will prefer the VTID if present
  @VTID(41)
  void left(
    float oLeft);


  /**
   * <p>
   * Getter method for the COM property "Bottom"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(1610940436) //= 0x60050014. The runtime will prefer the VTID if present
  @VTID(42)
  float bottom();


  /**
   * <p>
   * Setter method for the COM property "Bottom"
   * </p>
   * @param oBottom Mandatory float parameter.
   */

  @DISPID(1610940436) //= 0x60050014. The runtime will prefer the VTID if present
  @VTID(43)
  void bottom(
    float oBottom);


  /**
   * <p>
   * Getter method for the COM property "Zoom"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(1610940438) //= 0x60050016. The runtime will prefer the VTID if present
  @VTID(44)
  float zoom();


  /**
   * <p>
   * Setter method for the COM property "Zoom"
   * </p>
   * @param oZoom Mandatory float parameter.
   */

  @DISPID(1610940438) //= 0x60050016. The runtime will prefer the VTID if present
  @VTID(45)
  void zoom(
    float oZoom);


  /**
   * <p>
   * Getter method for the COM property "Rotation"
   * </p>
   * @return  Returns a value of type CatImageRotation
   */

  @DISPID(1610940440) //= 0x60050018. The runtime will prefer the VTID if present
  @VTID(46)
  CatImageRotation rotation();


  /**
   * <p>
   * Setter method for the COM property "Rotation"
   * </p>
   * @param oRotation Mandatory CatImageRotation parameter.
   */

  @DISPID(1610940440) //= 0x60050018. The runtime will prefer the VTID if present
  @VTID(47)
  void rotation(
    CatImageRotation oRotation);


  /**
   * <p>
   * Getter method for the COM property "Banner"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610940442) //= 0x6005001a. The runtime will prefer the VTID if present
  @VTID(48)
  java.lang.String banner();


  /**
   * <p>
   * Setter method for the COM property "Banner"
   * </p>
   * @param oBanner Mandatory Holder<java.lang.String> parameter.
   */

  @DISPID(1610940442) //= 0x6005001a. The runtime will prefer the VTID if present
  @VTID(49)
  void banner(
    Holder<java.lang.String> oBanner);


  /**
   * <p>
   * Getter method for the COM property "BannerPosition"
   * </p>
   * @return  Returns a value of type CatBannerPosition
   */

  @DISPID(1610940444) //= 0x6005001c. The runtime will prefer the VTID if present
  @VTID(50)
  CatBannerPosition bannerPosition();


  /**
   * <p>
   * Setter method for the COM property "BannerPosition"
   * </p>
   * @param oBannerPosition Mandatory CatBannerPosition parameter.
   */

  @DISPID(1610940444) //= 0x6005001c. The runtime will prefer the VTID if present
  @VTID(51)
  void bannerPosition(
    CatBannerPosition oBannerPosition);


  /**
   * <p>
   * Getter method for the COM property "Logo"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610940446) //= 0x6005001e. The runtime will prefer the VTID if present
  @VTID(52)
  java.lang.String logo();


  /**
   * <p>
   * Setter method for the COM property "Logo"
   * </p>
   * @param oLogo Mandatory Holder<java.lang.String> parameter.
   */

  @DISPID(1610940446) //= 0x6005001e. The runtime will prefer the VTID if present
  @VTID(53)
  void logo(
    Holder<java.lang.String> oLogo);


  /**
   * <p>
   * Getter method for the COM property "Quality"
   * </p>
   * @return  Returns a value of type CatPrintQuality
   */

  @DISPID(1610940448) //= 0x60050020. The runtime will prefer the VTID if present
  @VTID(54)
  CatPrintQuality quality();


  /**
   * <p>
   * Setter method for the COM property "Quality"
   * </p>
   * @param oQuality Mandatory CatPrintQuality parameter.
   */

  @DISPID(1610940448) //= 0x60050020. The runtime will prefer the VTID if present
  @VTID(55)
  void quality(
    CatPrintQuality oQuality);


  /**
   * <p>
   * Getter method for the COM property "Scaling1To1"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610940450) //= 0x60050022. The runtime will prefer the VTID if present
  @VTID(56)
  boolean scaling1To1();


  /**
   * <p>
   * Setter method for the COM property "Scaling1To1"
   * </p>
   * @param oScaling1To1 Mandatory boolean parameter.
   */

  @DISPID(1610940450) //= 0x60050022. The runtime will prefer the VTID if present
  @VTID(57)
  void scaling1To1(
    boolean oScaling1To1);


  /**
   * <p>
   * Getter method for the COM property "color"
   * </p>
   * @return  Returns a value of type CatPrintColor
   */

  @DISPID(1610940452) //= 0x60050024. The runtime will prefer the VTID if present
  @VTID(58)
  CatPrintColor color();


  /**
   * <p>
   * Setter method for the COM property "color"
   * </p>
   * @param oColor Mandatory CatPrintColor parameter.
   */

  @DISPID(1610940452) //= 0x60050024. The runtime will prefer the VTID if present
  @VTID(59)
  void color(
    CatPrintColor oColor);


  /**
   * <p>
   * Getter method for the COM property "UseImageSize"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610940454) //= 0x60050026. The runtime will prefer the VTID if present
  @VTID(60)
  boolean useImageSize();


  /**
   * <p>
   * Setter method for the COM property "UseImageSize"
   * </p>
   * @param oUseImageSize Mandatory boolean parameter.
   */

  @DISPID(1610940454) //= 0x60050026. The runtime will prefer the VTID if present
  @VTID(61)
  void useImageSize(
    boolean oUseImageSize);


  /**
   * <p>
   * Getter method for the COM property "Dpi"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(1610940456) //= 0x60050028. The runtime will prefer the VTID if present
  @VTID(62)
  float dpi();


  /**
   * <p>
   * Setter method for the COM property "Dpi"
   * </p>
   * @param oDpi Mandatory float parameter.
   */

  @DISPID(1610940456) //= 0x60050028. The runtime will prefer the VTID if present
  @VTID(63)
  void dpi(
    float oDpi);


  /**
   * <p>
   * Getter method for the COM property "PrintRenderingMode"
   * </p>
   * @return  Returns a value of type CatPrintRenderingMode
   */

  @DISPID(1610940458) //= 0x6005002a. The runtime will prefer the VTID if present
  @VTID(64)
  CatPrintRenderingMode printRenderingMode();


  /**
   * <p>
   * Setter method for the COM property "PrintRenderingMode"
   * </p>
   * @param oRenderingMode Mandatory CatPrintRenderingMode parameter.
   */

  @DISPID(1610940458) //= 0x6005002a. The runtime will prefer the VTID if present
  @VTID(65)
  void printRenderingMode(
    CatPrintRenderingMode oRenderingMode);


  /**
   * <p>
   * Getter method for the COM property "TextBlanking"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610940460) //= 0x6005002c. The runtime will prefer the VTID if present
  @VTID(66)
  boolean textBlanking();


  /**
   * <p>
   * Setter method for the COM property "TextBlanking"
   * </p>
   * @param oTextBlanking Mandatory boolean parameter.
   */

  @DISPID(1610940460) //= 0x6005002c. The runtime will prefer the VTID if present
  @VTID(67)
  void textBlanking(
    boolean oTextBlanking);


  /**
   * <p>
   * Getter method for the COM property "WhiteVectorsInBlack"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610940462) //= 0x6005002e. The runtime will prefer the VTID if present
  @VTID(68)
  boolean whiteVectorsInBlack();


  /**
   * <p>
   * Setter method for the COM property "WhiteVectorsInBlack"
   * </p>
   * @param oWhiteVectorsInBlack Mandatory boolean parameter.
   */

  @DISPID(1610940462) //= 0x6005002e. The runtime will prefer the VTID if present
  @VTID(69)
  void whiteVectorsInBlack(
    boolean oWhiteVectorsInBlack);


  /**
   * <p>
   * Getter method for the COM property "BannerSize"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(1610940464) //= 0x60050030. The runtime will prefer the VTID if present
  @VTID(70)
  float bannerSize();


  /**
   * <p>
   * Setter method for the COM property "BannerSize"
   * </p>
   * @param oBannerSize Mandatory float parameter.
   */

  @DISPID(1610940464) //= 0x60050030. The runtime will prefer the VTID if present
  @VTID(71)
  void bannerSize(
    float oBannerSize);


  /**
   * <p>
   * Getter method for the COM property "LineWidthSpecification"
   * </p>
   * @return  Returns a value of type CatPrintLineSpecification
   */

  @DISPID(1610940466) //= 0x60050032. The runtime will prefer the VTID if present
  @VTID(72)
  CatPrintLineSpecification lineWidthSpecification();


  /**
   * <p>
   * Setter method for the COM property "LineWidthSpecification"
   * </p>
   * @param oLineWidthSpecification Mandatory CatPrintLineSpecification parameter.
   */

  @DISPID(1610940466) //= 0x60050032. The runtime will prefer the VTID if present
  @VTID(73)
  void lineWidthSpecification(
    CatPrintLineSpecification oLineWidthSpecification);


  /**
   * <p>
   * Getter method for the COM property "LineTypeSpecification"
   * </p>
   * @return  Returns a value of type CatPrintLineSpecification
   */

  @DISPID(1610940468) //= 0x60050034. The runtime will prefer the VTID if present
  @VTID(74)
  CatPrintLineSpecification lineTypeSpecification();


  /**
   * <p>
   * Setter method for the COM property "LineTypeSpecification"
   * </p>
   * @param oLineTypeSpecification Mandatory CatPrintLineSpecification parameter.
   */

  @DISPID(1610940468) //= 0x60050034. The runtime will prefer the VTID if present
  @VTID(75)
  void lineTypeSpecification(
    CatPrintLineSpecification oLineTypeSpecification);


  /**
   * <p>
   * Getter method for the COM property "LineCap"
   * </p>
   * @return  Returns a value of type CatPrintLineCap
   */

  @DISPID(1610940470) //= 0x60050036. The runtime will prefer the VTID if present
  @VTID(76)
  CatPrintLineCap lineCap();


  /**
   * <p>
   * Setter method for the COM property "LineCap"
   * </p>
   * @param oLineCap Mandatory CatPrintLineCap parameter.
   */

  @DISPID(1610940470) //= 0x60050036. The runtime will prefer the VTID if present
  @VTID(77)
  void lineCap(
    CatPrintLineCap oLineCap);


  /**
   * <p>
   * Getter method for the COM property "TextScaling"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610940472) //= 0x60050038. The runtime will prefer the VTID if present
  @VTID(78)
  boolean textScaling();


  /**
   * <p>
   * Setter method for the COM property "TextScaling"
   * </p>
   * @param oTextScaling Mandatory boolean parameter.
   */

  @DISPID(1610940472) //= 0x60050038. The runtime will prefer the VTID if present
  @VTID(79)
  void textScaling(
    boolean oTextScaling);


  /**
   * <p>
   * Getter method for the COM property "LineTypeOverlappingCheck"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610940474) //= 0x6005003a. The runtime will prefer the VTID if present
  @VTID(80)
  boolean lineTypeOverlappingCheck();


  /**
   * <p>
   * Setter method for the COM property "LineTypeOverlappingCheck"
   * </p>
   * @param oLineTypeOverlappingCheck Mandatory boolean parameter.
   */

  @DISPID(1610940474) //= 0x6005003a. The runtime will prefer the VTID if present
  @VTID(81)
  void lineTypeOverlappingCheck(
    boolean oLineTypeOverlappingCheck);


  /**
   * <p>
   * Getter method for the COM property "Use3DAccuracy"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610940476) //= 0x6005003c. The runtime will prefer the VTID if present
  @VTID(82)
  boolean use3DAccuracy();


  /**
   * <p>
   * Setter method for the COM property "Use3DAccuracy"
   * </p>
   * @param oUse3DAccuracy Mandatory boolean parameter.
   */

  @DISPID(1610940476) //= 0x6005003c. The runtime will prefer the VTID if present
  @VTID(83)
  void use3DAccuracy(
    boolean oUse3DAccuracy);


  /**
   * <p>
   * Getter method for the COM property "Gamma"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(1610940478) //= 0x6005003e. The runtime will prefer the VTID if present
  @VTID(84)
  float gamma();


  /**
   * <p>
   * Setter method for the COM property "Gamma"
   * </p>
   * @param oGamma Mandatory float parameter.
   */

  @DISPID(1610940478) //= 0x6005003e. The runtime will prefer the VTID if present
  @VTID(85)
  void gamma(
    float oGamma);


  /**
   * <p>
   * Getter method for the COM property "LogoVisibility"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610940480) //= 0x60050040. The runtime will prefer the VTID if present
  @VTID(86)
  boolean logoVisibility();


  /**
   * <p>
   * Setter method for the COM property "LogoVisibility"
   * </p>
   * @param oLogoVisibility Mandatory boolean parameter.
   */

  @DISPID(1610940480) //= 0x60050040. The runtime will prefer the VTID if present
  @VTID(87)
  void logoVisibility(
    boolean oLogoVisibility);


  // Properties:
}
