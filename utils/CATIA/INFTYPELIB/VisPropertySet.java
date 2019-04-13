import com4j.*;

@IID("{69274990-9DBE-11D4-A74B-0004AC37AE57}")
public interface VisPropertySet extends AnyObject {
  // Methods:
  /**
   * @param iRed Mandatory int parameter.
   * @param iGreen Mandatory int parameter.
   * @param iBlue Mandatory int parameter.
   * @param iInheritance Mandatory int parameter.
   */

  @DISPID(1610940416) //= 0x60050000. The runtime will prefer the VTID if present
  @VTID(22)
  void setRealColor(
    int iRed,
    int iGreen,
    int iBlue,
    int iInheritance);


  /**
   * @param iOpacity Mandatory int parameter.
   * @param iInheritance Mandatory int parameter.
   */

  @DISPID(1610940417) //= 0x60050001. The runtime will prefer the VTID if present
  @VTID(23)
  void setRealOpacity(
    int iOpacity,
    int iInheritance);


  /**
   * @param iLineWidth Mandatory int parameter.
   * @param iInheritance Mandatory int parameter.
   */

  @DISPID(1610940418) //= 0x60050002. The runtime will prefer the VTID if present
  @VTID(24)
  void setRealWidth(
    int iLineWidth,
    int iInheritance);


  /**
   * @param iLineType Mandatory int parameter.
   * @param iInheritance Mandatory int parameter.
   */

  @DISPID(1610940419) //= 0x60050003. The runtime will prefer the VTID if present
  @VTID(25)
  void setRealLineType(
    int iLineType,
    int iInheritance);


  /**
   * @param iSymbolType Mandatory int parameter.
   */

  @DISPID(1610940420) //= 0x60050004. The runtime will prefer the VTID if present
  @VTID(26)
  void setSymbolType(
    int iSymbolType);


  /**
   * @param oRed Mandatory Holder<Integer> parameter.
   * @param oGreen Mandatory Holder<Integer> parameter.
   * @param oBlue Mandatory Holder<Integer> parameter.
   * @return  Returns a value of type CatVisPropertyStatus
   */

  @DISPID(1610940421) //= 0x60050005. The runtime will prefer the VTID if present
  @VTID(27)
  CatVisPropertyStatus getRealColor(
    Holder<Integer> oRed,
    Holder<Integer> oGreen,
    Holder<Integer> oBlue);


  /**
   * @param oOpacity Mandatory Holder<Integer> parameter.
   * @return  Returns a value of type CatVisPropertyStatus
   */

  @DISPID(1610940422) //= 0x60050006. The runtime will prefer the VTID if present
  @VTID(28)
  CatVisPropertyStatus getRealOpacity(
    Holder<Integer> oOpacity);


  /**
   * @param oLineWidth Mandatory Holder<Integer> parameter.
   * @return  Returns a value of type CatVisPropertyStatus
   */

  @DISPID(1610940423) //= 0x60050007. The runtime will prefer the VTID if present
  @VTID(29)
  CatVisPropertyStatus getRealWidth(
    Holder<Integer> oLineWidth);


  /**
   * @param oLineType Mandatory Holder<Integer> parameter.
   * @return  Returns a value of type CatVisPropertyStatus
   */

  @DISPID(1610940424) //= 0x60050008. The runtime will prefer the VTID if present
  @VTID(30)
  CatVisPropertyStatus getRealLineType(
    Holder<Integer> oLineType);


  /**
   * @param oSymbolType Mandatory Holder<Integer> parameter.
   * @return  Returns a value of type CatVisPropertyStatus
   */

  @DISPID(1610940425) //= 0x60050009. The runtime will prefer the VTID if present
  @VTID(31)
  CatVisPropertyStatus getSymbolType(
    Holder<Integer> oSymbolType);


  /**
   * @param iPropertyType Mandatory CatVisPropertyType parameter.
   * @param oInheritance Mandatory Holder<Integer> parameter.
   * @return  Returns a value of type CatVisPropertyStatus
   */

  @DISPID(1610940426) //= 0x6005000a. The runtime will prefer the VTID if present
  @VTID(32)
  CatVisPropertyStatus getRealInheritance(
    CatVisPropertyType iPropertyType,
    Holder<Integer> oInheritance);


  /**
   * @param iRed Mandatory int parameter.
   * @param iGreen Mandatory int parameter.
   * @param iBlue Mandatory int parameter.
   * @param iInheritance Mandatory int parameter.
   */

  @DISPID(1610940427) //= 0x6005000b. The runtime will prefer the VTID if present
  @VTID(33)
  void setVisibleColor(
    int iRed,
    int iGreen,
    int iBlue,
    int iInheritance);


  /**
   * @param iOpacity Mandatory int parameter.
   * @param iInheritance Mandatory int parameter.
   */

  @DISPID(1610940428) //= 0x6005000c. The runtime will prefer the VTID if present
  @VTID(34)
  void setVisibleOpacity(
    int iOpacity,
    int iInheritance);


  /**
   * @param iWidth Mandatory int parameter.
   * @param iInheritance Mandatory int parameter.
   */

  @DISPID(1610940429) //= 0x6005000d. The runtime will prefer the VTID if present
  @VTID(35)
  void setVisibleWidth(
    int iWidth,
    int iInheritance);


  /**
   * @param iLineType Mandatory int parameter.
   * @param iInheritance Mandatory int parameter.
   */

  @DISPID(1610940430) //= 0x6005000e. The runtime will prefer the VTID if present
  @VTID(36)
  void setVisibleLineType(
    int iLineType,
    int iInheritance);


  /**
   * @param oRed Mandatory Holder<Integer> parameter.
   * @param oGreen Mandatory Holder<Integer> parameter.
   * @param oBlue Mandatory Holder<Integer> parameter.
   * @return  Returns a value of type CatVisPropertyStatus
   */

  @DISPID(1610940431) //= 0x6005000f. The runtime will prefer the VTID if present
  @VTID(37)
  CatVisPropertyStatus getVisibleColor(
    Holder<Integer> oRed,
    Holder<Integer> oGreen,
    Holder<Integer> oBlue);


  /**
   * @param oOpacity Mandatory Holder<Integer> parameter.
   * @return  Returns a value of type CatVisPropertyStatus
   */

  @DISPID(1610940432) //= 0x60050010. The runtime will prefer the VTID if present
  @VTID(38)
  CatVisPropertyStatus getVisibleOpacity(
    Holder<Integer> oOpacity);


  /**
   * @param oLineWidth Mandatory Holder<Integer> parameter.
   * @return  Returns a value of type CatVisPropertyStatus
   */

  @DISPID(1610940433) //= 0x60050011. The runtime will prefer the VTID if present
  @VTID(39)
  CatVisPropertyStatus getVisibleWidth(
    Holder<Integer> oLineWidth);


  /**
   * @param oLineType Mandatory Holder<Integer> parameter.
   * @return  Returns a value of type CatVisPropertyStatus
   */

  @DISPID(1610940434) //= 0x60050012. The runtime will prefer the VTID if present
  @VTID(40)
  CatVisPropertyStatus getVisibleLineType(
    Holder<Integer> oLineType);


  /**
   * @param iPropertyType Mandatory CatVisPropertyType parameter.
   * @param oInheritance Mandatory Holder<Integer> parameter.
   * @return  Returns a value of type CatVisPropertyStatus
   */

  @DISPID(1610940435) //= 0x60050013. The runtime will prefer the VTID if present
  @VTID(41)
  CatVisPropertyStatus getVisibleInheritance(
    CatVisPropertyType iPropertyType,
    Holder<Integer> oInheritance);


  /**
   * @param iShow Mandatory CatVisPropertyShow parameter.
   */

  @DISPID(1610940436) //= 0x60050014. The runtime will prefer the VTID if present
  @VTID(42)
  void setShow(
    CatVisPropertyShow iShow);


  /**
   * @param oShow Mandatory Holder<CatVisPropertyShow> parameter.
   * @return  Returns a value of type CatVisPropertyStatus
   */

  @DISPID(1610940437) //= 0x60050015. The runtime will prefer the VTID if present
  @VTID(43)
  CatVisPropertyStatus getShow(
    Holder<CatVisPropertyShow> oShow);


  /**
   * @param iPick Mandatory CatVisPropertyPick parameter.
   */

  @DISPID(1610940438) //= 0x60050016. The runtime will prefer the VTID if present
  @VTID(44)
  void setPick(
    CatVisPropertyPick iPick);


  /**
   * @param oPick Mandatory Holder<CatVisPropertyPick> parameter.
   * @return  Returns a value of type CatVisPropertyStatus
   */

  @DISPID(1610940439) //= 0x60050017. The runtime will prefer the VTID if present
  @VTID(45)
  CatVisPropertyStatus getPick(
    Holder<CatVisPropertyPick> oPick);


  /**
   * @param iLayerType Mandatory CatVisLayerType parameter.
   * @param iLayerValue Mandatory int parameter.
   */

  @DISPID(1610940440) //= 0x60050018. The runtime will prefer the VTID if present
  @VTID(46)
  void setLayer(
    CatVisLayerType iLayerType,
    int iLayerValue);


  /**
   * @param oLayerType Mandatory Holder<CatVisLayerType> parameter.
   * @param oLayerValue Mandatory Holder<Integer> parameter.
   * @return  Returns a value of type CatVisPropertyStatus
   */

  @DISPID(1610940441) //= 0x60050019. The runtime will prefer the VTID if present
  @VTID(47)
  CatVisPropertyStatus getLayer(
    Holder<CatVisLayerType> oLayerType,
    Holder<Integer> oLayerValue);


  // Properties:
}
