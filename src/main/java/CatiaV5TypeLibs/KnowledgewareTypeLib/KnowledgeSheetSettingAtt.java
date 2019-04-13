package CatiaV5TypeLibs.KnowledgewareTypeLib;
import CatiaV5TypeLibs.InfTypeLib.*;

import com4j.*;

@IID("{64B95494-157E-488D-B0C0-ACEB225AB5E1}")
public interface KnowledgeSheetSettingAtt extends SettingController {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "ParameterTreeViewWithValue"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(27)
  short parameterTreeViewWithValue();


  /**
   * <p>
   * Setter method for the COM property "ParameterTreeViewWithValue"
   * </p>
   * @param oParameterTreeViewWithValue Mandatory short parameter.
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(28)
  void parameterTreeViewWithValue(
    short oParameterTreeViewWithValue);


  /**
   * @param ioAdminLevel Mandatory Holder<java.lang.String> parameter.
   * @param ioLocked Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005954) //= 0x60060002. The runtime will prefer the VTID if present
  @VTID(29)
  boolean getParameterTreeViewWithValueInfo(
    Holder<java.lang.String> ioAdminLevel,
    Holder<java.lang.String> ioLocked);


  /**
   * @param iLocked Mandatory boolean parameter.
   */

  @DISPID(1611005955) //= 0x60060003. The runtime will prefer the VTID if present
  @VTID(30)
  void setParameterTreeViewWithValueLock(
    boolean iLocked);


  /**
   * <p>
   * Getter method for the COM property "ParameterTreeViewWithFormula"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(1611005956) //= 0x60060004. The runtime will prefer the VTID if present
  @VTID(31)
  short parameterTreeViewWithFormula();


  /**
   * <p>
   * Setter method for the COM property "ParameterTreeViewWithFormula"
   * </p>
   * @param oParameterTreeViewWithFormula Mandatory short parameter.
   */

  @DISPID(1611005956) //= 0x60060004. The runtime will prefer the VTID if present
  @VTID(32)
  void parameterTreeViewWithFormula(
    short oParameterTreeViewWithFormula);


  /**
   * @param ioAdminLevel Mandatory Holder<java.lang.String> parameter.
   * @param ioLocked Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005958) //= 0x60060006. The runtime will prefer the VTID if present
  @VTID(33)
  boolean getParameterTreeViewWithFormulaInfo(
    Holder<java.lang.String> ioAdminLevel,
    Holder<java.lang.String> ioLocked);


  /**
   * @param iLocked Mandatory boolean parameter.
   */

  @DISPID(1611005959) //= 0x60060007. The runtime will prefer the VTID if present
  @VTID(34)
  void setParameterTreeViewWithFormulaLock(
    boolean iLocked);


  /**
   * <p>
   * Getter method for the COM property "ParameterNameSurroundedByTheSymbol"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(1611005960) //= 0x60060008. The runtime will prefer the VTID if present
  @VTID(35)
  short parameterNameSurroundedByTheSymbol();


  /**
   * <p>
   * Setter method for the COM property "ParameterNameSurroundedByTheSymbol"
   * </p>
   * @param oParameterNameSurroundedByTheSymbol Mandatory short parameter.
   */

  @DISPID(1611005960) //= 0x60060008. The runtime will prefer the VTID if present
  @VTID(36)
  void parameterNameSurroundedByTheSymbol(
    short oParameterNameSurroundedByTheSymbol);


  /**
   * @param ioAdminLevel Mandatory Holder<java.lang.String> parameter.
   * @param ioLocked Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005962) //= 0x6006000a. The runtime will prefer the VTID if present
  @VTID(37)
  boolean getParameterNameSurroundedByTheSymbolInfo(
    Holder<java.lang.String> ioAdminLevel,
    Holder<java.lang.String> ioLocked);


  /**
   * @param iLocked Mandatory boolean parameter.
   */

  @DISPID(1611005963) //= 0x6006000b. The runtime will prefer the VTID if present
  @VTID(38)
  void setParameterNameSurroundedByTheSymbolLock(
    boolean iLocked);


  /**
   * <p>
   * Getter method for the COM property "RelationsUpdateInPartContextSynchronousRelations"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(1611005964) //= 0x6006000c. The runtime will prefer the VTID if present
  @VTID(39)
  short relationsUpdateInPartContextSynchronousRelations();


  /**
   * <p>
   * Setter method for the COM property "RelationsUpdateInPartContextSynchronousRelations"
   * </p>
   * @param oRelationsUpdateInPartContextSynchronousRelations Mandatory short parameter.
   */

  @DISPID(1611005964) //= 0x6006000c. The runtime will prefer the VTID if present
  @VTID(40)
  void relationsUpdateInPartContextSynchronousRelations(
    short oRelationsUpdateInPartContextSynchronousRelations);


  /**
   * @param ioAdminLevel Mandatory Holder<java.lang.String> parameter.
   * @param ioLocked Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005966) //= 0x6006000e. The runtime will prefer the VTID if present
  @VTID(41)
  boolean getRelationsUpdateInPartContextSynchronousRelationsInfo(
    Holder<java.lang.String> ioAdminLevel,
    Holder<java.lang.String> ioLocked);


  /**
   * @param iLocked Mandatory boolean parameter.
   */

  @DISPID(1611005967) //= 0x6006000f. The runtime will prefer the VTID if present
  @VTID(42)
  void setRelationsUpdateInPartContextSynchronousRelationsLock(
    boolean iLocked);


  /**
   * <p>
   * Getter method for the COM property "RelationsUpdateInPartContextEvaluateDuringUpdate"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(1611005968) //= 0x60060010. The runtime will prefer the VTID if present
  @VTID(43)
  short relationsUpdateInPartContextEvaluateDuringUpdate();


  /**
   * <p>
   * Setter method for the COM property "RelationsUpdateInPartContextEvaluateDuringUpdate"
   * </p>
   * @param oRelationsUpdateInPartContextEvaluateDuringUpdate Mandatory short parameter.
   */

  @DISPID(1611005968) //= 0x60060010. The runtime will prefer the VTID if present
  @VTID(44)
  void relationsUpdateInPartContextEvaluateDuringUpdate(
    short oRelationsUpdateInPartContextEvaluateDuringUpdate);


  /**
   * @param ioAdminLevel Mandatory Holder<java.lang.String> parameter.
   * @param ioLocked Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005970) //= 0x60060012. The runtime will prefer the VTID if present
  @VTID(45)
  boolean getRelationsUpdateInPartContextEvaluateDuringUpdateInfo(
    Holder<java.lang.String> ioAdminLevel,
    Holder<java.lang.String> ioLocked);


  /**
   * @param iLocked Mandatory boolean parameter.
   */

  @DISPID(1611005971) //= 0x60060013. The runtime will prefer the VTID if present
  @VTID(46)
  void setRelationsUpdateInPartContextEvaluateDuringUpdateLock(
    boolean iLocked);


  /**
   * <p>
   * Getter method for the COM property "DesignTablesSynchronization"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(1611005972) //= 0x60060014. The runtime will prefer the VTID if present
  @VTID(47)
  short designTablesSynchronization();


  /**
   * <p>
   * Setter method for the COM property "DesignTablesSynchronization"
   * </p>
   * @param oDesignTablesSynchronization Mandatory short parameter.
   */

  @DISPID(1611005972) //= 0x60060014. The runtime will prefer the VTID if present
  @VTID(48)
  void designTablesSynchronization(
    short oDesignTablesSynchronization);


  /**
   * @param ioAdminLevel Mandatory Holder<java.lang.String> parameter.
   * @param ioLocked Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005974) //= 0x60060016. The runtime will prefer the VTID if present
  @VTID(49)
  boolean getDesignTablesSynchronizationInfo(
    Holder<java.lang.String> ioAdminLevel,
    Holder<java.lang.String> ioLocked);


  /**
   * @param iLocked Mandatory boolean parameter.
   */

  @DISPID(1611005975) //= 0x60060017. The runtime will prefer the VTID if present
  @VTID(50)
  void setDesignTablesSynchronizationLock(
    boolean iLocked);


  /**
   * <p>
   * Getter method for the COM property "DesignTablesCopyData"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(1611005976) //= 0x60060018. The runtime will prefer the VTID if present
  @VTID(51)
  short designTablesCopyData();


  /**
   * <p>
   * Setter method for the COM property "DesignTablesCopyData"
   * </p>
   * @param oDesignTablesCopyData Mandatory short parameter.
   */

  @DISPID(1611005976) //= 0x60060018. The runtime will prefer the VTID if present
  @VTID(52)
  void designTablesCopyData(
    short oDesignTablesCopyData);


  /**
   * @param ioAdminLevel Mandatory Holder<java.lang.String> parameter.
   * @param ioLocked Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005978) //= 0x6006001a. The runtime will prefer the VTID if present
  @VTID(53)
  boolean getDesignTablesCopyDataInfo(
    Holder<java.lang.String> ioAdminLevel,
    Holder<java.lang.String> ioLocked);


  /**
   * @param iLocked Mandatory boolean parameter.
   */

  @DISPID(1611005979) //= 0x6006001b. The runtime will prefer the VTID if present
  @VTID(54)
  void setDesignTablesCopyDataLock(
    boolean iLocked);


  // Properties:
}
