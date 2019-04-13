import com4j.*;

@IID("{816AAD14-C5E5-0000-0280-030D3B000000}")
public interface Selection extends AnyObject {
  // Methods:
  /**
   * @param iObject Mandatory AnyObject parameter.
   */

  @DISPID(1610940416) //= 0x60050000. The runtime will prefer the VTID if present
  @VTID(22)
  void add(
    AnyObject iObject);


  /**
   */

  @DISPID(1610940417) //= 0x60050001. The runtime will prefer the VTID if present
  @VTID(23)
  void clear();


  /**
   */

  @DISPID(1610940418) //= 0x60050002. The runtime will prefer the VTID if present
  @VTID(24)
  void cut();


  /**
   */

  @DISPID(1610940419) //= 0x60050003. The runtime will prefer the VTID if present
  @VTID(25)
  void copy();


  /**
   */

  @DISPID(1610940420) //= 0x60050004. The runtime will prefer the VTID if present
  @VTID(26)
  void paste();


  /**
   * @param iFormat Mandatory Holder<java.lang.String> parameter.
   */

  @DISPID(1610940421) //= 0x60050005. The runtime will prefer the VTID if present
  @VTID(27)
  void pasteSpecial(
    Holder<java.lang.String> iFormat);


  /**
   */

  @DISPID(1610940422) //= 0x60050006. The runtime will prefer the VTID if present
  @VTID(28)
  void pasteLink();


  /**
   */

  @DISPID(1610940423) //= 0x60050007. The runtime will prefer the VTID if present
  @VTID(29)
  void delete();


  /**
   * @param iIndex Mandatory int parameter.
   */

  @DISPID(1610940424) //= 0x60050008. The runtime will prefer the VTID if present
  @VTID(30)
  void remove(
    int iIndex);


  /**
   * @param iIndex Mandatory int parameter.
   */

  @DISPID(1610940425) //= 0x60050009. The runtime will prefer the VTID if present
  @VTID(31)
  void remove2(
    int iIndex);


  /**
   * @param iObjectType Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type AnyObject
   */

  @DISPID(1610940426) //= 0x6005000a. The runtime will prefer the VTID if present
  @VTID(32)
  AnyObject findObject(
    Holder<java.lang.String> iObjectType);


  /**
   * @param iStringBSTR Mandatory Holder<java.lang.String> parameter.
   */

  @DISPID(1610940427) //= 0x6005000b. The runtime will prefer the VTID if present
  @VTID(33)
  void search(
    Holder<java.lang.String> iStringBSTR);


  /**
   * <p>
   * Getter method for the COM property "Selection"
   * </p>
   * @return  Returns a value of type Selection
   */

  @DISPID(1610940428) //= 0x6005000c. The runtime will prefer the VTID if present
  @VTID(34)
  Selection selection();


  /**
   * <p>
   * Getter method for the COM property "VisProperties"
   * </p>
   * @return  Returns a value of type VisPropertySet
   */

  @DISPID(1610940429) //= 0x6005000d. The runtime will prefer the VTID if present
  @VTID(35)
  VisPropertySet visProperties();


  /**
   * <p>
   * Getter method for the COM property "Count"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610940430) //= 0x6005000e. The runtime will prefer the VTID if present
  @VTID(36)
  int count();


  /**
   * <p>
   * Getter method for the COM property "Count2"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610940431) //= 0x6005000f. The runtime will prefer the VTID if present
  @VTID(37)
  int count2();


  /**
   * @param iIndex Mandatory int parameter.
   * @return  Returns a value of type SelectedElement
   */

  @DISPID(1610940432) //= 0x60050010. The runtime will prefer the VTID if present
  @VTID(38)
  SelectedElement item(
    int iIndex);


  /**
   * @param iIndex Mandatory int parameter.
   * @return  Returns a value of type SelectedElement
   */

  @DISPID(1610940433) //= 0x60050011. The runtime will prefer the VTID if present
  @VTID(39)
  SelectedElement item2(
    int iIndex);


  /**
   * @param iFilterType Mandatory java.lang.Object[] parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1610940434) //= 0x60050012. The runtime will prefer the VTID if present
  @VTID(40)
  boolean filterCorrespondence(
    java.lang.Object[] iFilterType);


  /**
   * @param iFilterType Mandatory java.lang.Object[] parameter.
   * @param iMessage Mandatory Holder<java.lang.String> parameter.
   * @param iObjectSelectionBeforeCommandUsePossibility Mandatory boolean parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610940435) //= 0x60050013. The runtime will prefer the VTID if present
  @VTID(41)
  java.lang.String selectElement2(
    java.lang.Object[] iFilterType,
    Holder<java.lang.String> iMessage,
    boolean iObjectSelectionBeforeCommandUsePossibility);


  /**
   * @param iFilterType Mandatory java.lang.Object[] parameter.
   * @param iMessage Mandatory Holder<java.lang.String> parameter.
   * @param iObjectSelectionBeforeCommandUsePossibility Mandatory boolean parameter.
   * @param iMultiSelectionMode Mandatory CATMultiSelectionMode parameter.
   * @param iTooltip Mandatory boolean parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610940436) //= 0x60050014. The runtime will prefer the VTID if present
  @VTID(42)
  java.lang.String selectElement3(
    java.lang.Object[] iFilterType,
    Holder<java.lang.String> iMessage,
    boolean iObjectSelectionBeforeCommandUsePossibility,
    CATMultiSelectionMode iMultiSelectionMode,
    boolean iTooltip);


  /**
   * @param iFilterType Mandatory java.lang.Object[] parameter.
   * @param iActiveDocumentMessage Mandatory Holder<java.lang.String> parameter.
   * @param iNonActiveDocumentMessage Mandatory Holder<java.lang.String> parameter.
   * @param iTooltip Mandatory boolean parameter.
   * @param oDocument Mandatory Holder<Document> parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610940437) //= 0x60050015. The runtime will prefer the VTID if present
  @VTID(43)
  java.lang.String selectElement4(
    java.lang.Object[] iFilterType,
    Holder<java.lang.String> iActiveDocumentMessage,
    Holder<java.lang.String> iNonActiveDocumentMessage,
    boolean iTooltip,
    Holder<Document> oDocument);


  /**
   * @param iMessage Mandatory Holder<java.lang.String> parameter.
   * @param iFilterType Mandatory java.lang.Object[] parameter.
   * @param iObjectSelectionBeforeCommandUsePossibility Mandatory boolean parameter.
   * @param iTooltip Mandatory boolean parameter.
   * @param iTriggeringOnMouseMove Mandatory boolean parameter.
   * @param oObjectSelected Mandatory Holder<Boolean> parameter.
   * @param oDocumentWindowLocation Mandatory java.lang.Object[] parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610940438) //= 0x60050016. The runtime will prefer the VTID if present
  @VTID(44)
  java.lang.String indicateOrSelectElement2D(
    Holder<java.lang.String> iMessage,
    java.lang.Object[] iFilterType,
    boolean iObjectSelectionBeforeCommandUsePossibility,
    boolean iTooltip,
    boolean iTriggeringOnMouseMove,
    Holder<Boolean> oObjectSelected,
    java.lang.Object[] oDocumentWindowLocation);


  /**
   * @param iPlanarGeometricObject Mandatory AnyObject parameter.
   * @param iMessage Mandatory Holder<java.lang.String> parameter.
   * @param iFilterType Mandatory java.lang.Object[] parameter.
   * @param iObjectSelectionBeforeCommandUsePossibility Mandatory boolean parameter.
   * @param iTooltip Mandatory boolean parameter.
   * @param iTriggeringOnMouseMove Mandatory boolean parameter.
   * @param oObjectSelected Mandatory Holder<Boolean> parameter.
   * @param oWindowLocation2D Mandatory java.lang.Object[] parameter.
   * @param oWindowLocation3D Mandatory java.lang.Object[] parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610940439) //= 0x60050017. The runtime will prefer the VTID if present
  @VTID(45)
  java.lang.String indicateOrSelectElement3D(
    AnyObject iPlanarGeometricObject,
    Holder<java.lang.String> iMessage,
    java.lang.Object[] iFilterType,
    boolean iObjectSelectionBeforeCommandUsePossibility,
    boolean iTooltip,
    boolean iTriggeringOnMouseMove,
    Holder<Boolean> oObjectSelected,
    java.lang.Object[] oWindowLocation2D,
    java.lang.Object[] oWindowLocation3D);


  // Properties:
}
