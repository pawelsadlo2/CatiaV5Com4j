import com4j.*;

@IID("{FCA1E9F8-EC62-4E5A-8678-2783B0E7B192}")
public interface SearchSettingAtt extends SettingController {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "DefaultPowerInputPrefix"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(27)
  java.lang.String defaultPowerInputPrefix();


  /**
   * <p>
   * Setter method for the COM property "DefaultPowerInputPrefix"
   * </p>
   * @param oPrefix Mandatory Holder<java.lang.String> parameter.
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(28)
  void defaultPowerInputPrefix(
    Holder<java.lang.String> oPrefix);


  /**
   * @param oAdminLevel Mandatory Holder<java.lang.String> parameter.
   * @param oLocked Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005954) //= 0x60060002. The runtime will prefer the VTID if present
  @VTID(29)
  boolean getDefaultPowerInputPrefixInfo(
    Holder<java.lang.String> oAdminLevel,
    Holder<java.lang.String> oLocked);


  /**
   * @param iLocked Mandatory boolean parameter.
   */

  @DISPID(1611005955) //= 0x60060003. The runtime will prefer the VTID if present
  @VTID(30)
  void setDefaultPowerInputPrefixLock(
    boolean iLocked);


  /**
   * <p>
   * Getter method for the COM property "DefaultPowerInputContextScope"
   * </p>
   * @return  Returns a value of type CATSearchContextScope
   */

  @DISPID(1611005956) //= 0x60060004. The runtime will prefer the VTID if present
  @VTID(31)
  CATSearchContextScope defaultPowerInputContextScope();


  /**
   * <p>
   * Setter method for the COM property "DefaultPowerInputContextScope"
   * </p>
   * @param oScope Mandatory CATSearchContextScope parameter.
   */

  @DISPID(1611005956) //= 0x60060004. The runtime will prefer the VTID if present
  @VTID(32)
  void defaultPowerInputContextScope(
    CATSearchContextScope oScope);


  /**
   * @param oAdminLevel Mandatory Holder<java.lang.String> parameter.
   * @param oLocked Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005958) //= 0x60060006. The runtime will prefer the VTID if present
  @VTID(33)
  boolean getDefaultPowerInputContextScopeInfo(
    Holder<java.lang.String> oAdminLevel,
    Holder<java.lang.String> oLocked);


  /**
   * @param iLocked Mandatory boolean parameter.
   */

  @DISPID(1611005959) //= 0x60060007. The runtime will prefer the VTID if present
  @VTID(34)
  void setDefaultPowerInputContextScopeLock(
    boolean iLocked);


  /**
   * <p>
   * Getter method for the COM property "DefaultPowerInputContextPriority"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005960) //= 0x60060008. The runtime will prefer the VTID if present
  @VTID(35)
  boolean defaultPowerInputContextPriority();


  /**
   * <p>
   * Setter method for the COM property "DefaultPowerInputContextPriority"
   * </p>
   * @param oPriority Mandatory boolean parameter.
   */

  @DISPID(1611005960) //= 0x60060008. The runtime will prefer the VTID if present
  @VTID(36)
  void defaultPowerInputContextPriority(
    boolean oPriority);


  /**
   * @param oAdminLevel Mandatory Holder<java.lang.String> parameter.
   * @param oLocked Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005962) //= 0x6006000a. The runtime will prefer the VTID if present
  @VTID(37)
  boolean getDefaultPowerInputContextPriorityInfo(
    Holder<java.lang.String> oAdminLevel,
    Holder<java.lang.String> oLocked);


  /**
   * @param iLocked Mandatory boolean parameter.
   */

  @DISPID(1611005963) //= 0x6006000b. The runtime will prefer the VTID if present
  @VTID(38)
  void setDefaultPowerInputContextPriorityLock(
    boolean iLocked);


  /**
   * <p>
   * Getter method for the COM property "DeepSearchActivation"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005964) //= 0x6006000c. The runtime will prefer the VTID if present
  @VTID(39)
  boolean deepSearchActivation();


  /**
   * <p>
   * Setter method for the COM property "DeepSearchActivation"
   * </p>
   * @param oActivation Mandatory boolean parameter.
   */

  @DISPID(1611005964) //= 0x6006000c. The runtime will prefer the VTID if present
  @VTID(40)
  void deepSearchActivation(
    boolean oActivation);


  /**
   * @param oAdminLevel Mandatory Holder<java.lang.String> parameter.
   * @param oLocked Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005966) //= 0x6006000e. The runtime will prefer the VTID if present
  @VTID(41)
  boolean getDeepSearchActivationInfo(
    Holder<java.lang.String> oAdminLevel,
    Holder<java.lang.String> oLocked);


  /**
   * @param iLocked Mandatory boolean parameter.
   */

  @DISPID(1611005967) //= 0x6006000f. The runtime will prefer the VTID if present
  @VTID(42)
  void setDeepSearchActivationLock(
    boolean iLocked);


  /**
   * <p>
   * Getter method for the COM property "MaxDisplayedResults"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611005968) //= 0x60060010. The runtime will prefer the VTID if present
  @VTID(43)
  int maxDisplayedResults();


  /**
   * <p>
   * Setter method for the COM property "MaxDisplayedResults"
   * </p>
   * @param oValue Mandatory int parameter.
   */

  @DISPID(1611005968) //= 0x60060010. The runtime will prefer the VTID if present
  @VTID(44)
  void maxDisplayedResults(
    int oValue);


  /**
   * @param oAdminLevel Mandatory Holder<java.lang.String> parameter.
   * @param oLocked Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005970) //= 0x60060012. The runtime will prefer the VTID if present
  @VTID(45)
  boolean getMaxDisplayedResultsInfo(
    Holder<java.lang.String> oAdminLevel,
    Holder<java.lang.String> oLocked);


  /**
   * @param iLocked Mandatory boolean parameter.
   */

  @DISPID(1611005971) //= 0x60060013. The runtime will prefer the VTID if present
  @VTID(46)
  void setMaxDisplayedResultsLock(
    boolean iLocked);


  /**
   * <p>
   * Getter method for the COM property "MaxPreHighlightedElements"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611005972) //= 0x60060014. The runtime will prefer the VTID if present
  @VTID(47)
  int maxPreHighlightedElements();


  /**
   * <p>
   * Setter method for the COM property "MaxPreHighlightedElements"
   * </p>
   * @param oValue Mandatory int parameter.
   */

  @DISPID(1611005972) //= 0x60060014. The runtime will prefer the VTID if present
  @VTID(48)
  void maxPreHighlightedElements(
    int oValue);


  /**
   * @param oAdminLevel Mandatory Holder<java.lang.String> parameter.
   * @param oLocked Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005974) //= 0x60060016. The runtime will prefer the VTID if present
  @VTID(49)
  boolean getMaxPreHighlightedElementsInfo(
    Holder<java.lang.String> oAdminLevel,
    Holder<java.lang.String> oLocked);


  /**
   * @param iLocked Mandatory boolean parameter.
   */

  @DISPID(1611005975) //= 0x60060017. The runtime will prefer the VTID if present
  @VTID(50)
  void setMaxPreHighlightedElementsLock(
    boolean iLocked);


  // Properties:
}
