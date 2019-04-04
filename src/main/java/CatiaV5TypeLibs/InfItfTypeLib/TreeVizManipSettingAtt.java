package CatiaV5TypeLibs.InfItfTypeLib;

import com4j.*;

@IID("{67FF8DE5-294F-4B50-BE3F-27E6D6498D84}")
public interface TreeVizManipSettingAtt extends SettingController {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Type"
   * </p>
   * @return  Returns a value of type CatTreeTypeEnum
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(27)
  CatTreeTypeEnum type();


  /**
   * <p>
   * Setter method for the COM property "Type"
   * </p>
   * @param oType Mandatory CatTreeTypeEnum parameter.
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(28)
  void type(
    CatTreeTypeEnum oType);


  /**
   * @param ioAdminLevel Mandatory Holder<java.lang.String> parameter.
   * @param ioLocked Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005954) //= 0x60060002. The runtime will prefer the VTID if present
  @VTID(29)
  boolean getTypeInfo(
    Holder<java.lang.String> ioAdminLevel,
    Holder<java.lang.String> ioLocked);


  /**
   * @param iLocked Mandatory boolean parameter.
   */

  @DISPID(1611005955) //= 0x60060003. The runtime will prefer the VTID if present
  @VTID(30)
  void setTypeLock(
    boolean iLocked);


  /**
   * <p>
   * Getter method for the COM property "Orientation"
   * </p>
   * @return  Returns a value of type CatTreeOrientationEnum
   */

  @DISPID(1611005956) //= 0x60060004. The runtime will prefer the VTID if present
  @VTID(31)
  CatTreeOrientationEnum orientation();


  /**
   * <p>
   * Setter method for the COM property "Orientation"
   * </p>
   * @param oOrientation Mandatory CatTreeOrientationEnum parameter.
   */

  @DISPID(1611005956) //= 0x60060004. The runtime will prefer the VTID if present
  @VTID(32)
  void orientation(
    CatTreeOrientationEnum oOrientation);


  /**
   * @param ioAdminLevel Mandatory Holder<java.lang.String> parameter.
   * @param ioLocked Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005958) //= 0x60060006. The runtime will prefer the VTID if present
  @VTID(33)
  boolean getOrientationInfo(
    Holder<java.lang.String> ioAdminLevel,
    Holder<java.lang.String> ioLocked);


  /**
   * @param iLocked Mandatory boolean parameter.
   */

  @DISPID(1611005959) //= 0x60060007. The runtime will prefer the VTID if present
  @VTID(34)
  void setOrientationLock(
    boolean iLocked);


  /**
   * <p>
   * Getter method for the COM property "SizeType"
   * </p>
   * @return  Returns a value of type CatTreeSizeTypeEnum
   */

  @DISPID(1611005960) //= 0x60060008. The runtime will prefer the VTID if present
  @VTID(35)
  CatTreeSizeTypeEnum sizeType();


  /**
   * <p>
   * Setter method for the COM property "SizeType"
   * </p>
   * @param oSizeType Mandatory CatTreeSizeTypeEnum parameter.
   */

  @DISPID(1611005960) //= 0x60060008. The runtime will prefer the VTID if present
  @VTID(36)
  void sizeType(
    CatTreeSizeTypeEnum oSizeType);


  /**
   * @param ioAdminLevel Mandatory Holder<java.lang.String> parameter.
   * @param ioLocked Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005962) //= 0x6006000a. The runtime will prefer the VTID if present
  @VTID(37)
  boolean getSizeTypeInfo(
    Holder<java.lang.String> ioAdminLevel,
    Holder<java.lang.String> ioLocked);


  /**
   * @param iLocked Mandatory boolean parameter.
   */

  @DISPID(1611005963) //= 0x6006000b. The runtime will prefer the VTID if present
  @VTID(38)
  void setSizeTypeLock(
    boolean iLocked);


  /**
   * <p>
   * Getter method for the COM property "Size"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611005964) //= 0x6006000c. The runtime will prefer the VTID if present
  @VTID(39)
  int size();


  /**
   * <p>
   * Setter method for the COM property "Size"
   * </p>
   * @param oSize Mandatory int parameter.
   */

  @DISPID(1611005964) //= 0x6006000c. The runtime will prefer the VTID if present
  @VTID(40)
  void size(
    int oSize);


  /**
   * <p>
   * Getter method for the COM property "ShowActivation"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005966) //= 0x6006000e. The runtime will prefer the VTID if present
  @VTID(41)
  boolean showActivation();


  /**
   * <p>
   * Setter method for the COM property "ShowActivation"
   * </p>
   * @param oShowActivation Mandatory boolean parameter.
   */

  @DISPID(1611005966) //= 0x6006000e. The runtime will prefer the VTID if present
  @VTID(42)
  void showActivation(
    boolean oShowActivation);


  /**
   * @param ioAdminLevel Mandatory Holder<java.lang.String> parameter.
   * @param ioLocked Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005968) //= 0x60060010. The runtime will prefer the VTID if present
  @VTID(43)
  boolean getShowActivationInfo(
    Holder<java.lang.String> ioAdminLevel,
    Holder<java.lang.String> ioLocked);


  /**
   * @param iLocked Mandatory boolean parameter.
   */

  @DISPID(1611005969) //= 0x60060011. The runtime will prefer the VTID if present
  @VTID(44)
  void setShowActivationLock(
    boolean iLocked);


  /**
   * <p>
   * Getter method for the COM property "DisplayGeomOnScrolling"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005970) //= 0x60060012. The runtime will prefer the VTID if present
  @VTID(45)
  boolean displayGeomOnScrolling();


  /**
   * <p>
   * Setter method for the COM property "DisplayGeomOnScrolling"
   * </p>
   * @param oDisplayGeomOnScrolling Mandatory boolean parameter.
   */

  @DISPID(1611005970) //= 0x60060012. The runtime will prefer the VTID if present
  @VTID(46)
  void displayGeomOnScrolling(
    boolean oDisplayGeomOnScrolling);


  /**
   * @param ioAdminLevel Mandatory Holder<java.lang.String> parameter.
   * @param ioLocked Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005972) //= 0x60060014. The runtime will prefer the VTID if present
  @VTID(47)
  boolean getDisplayGeomOnScrollingInfo(
    Holder<java.lang.String> ioAdminLevel,
    Holder<java.lang.String> ioLocked);


  /**
   * @param iLocked Mandatory boolean parameter.
   */

  @DISPID(1611005973) //= 0x60060015. The runtime will prefer the VTID if present
  @VTID(48)
  void setDisplayGeomOnScrollingLock(
    boolean iLocked);


  /**
   * <p>
   * Getter method for the COM property "AutoExpandActivation"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005974) //= 0x60060016. The runtime will prefer the VTID if present
  @VTID(49)
  boolean autoExpandActivation();


  /**
   * <p>
   * Setter method for the COM property "AutoExpandActivation"
   * </p>
   * @param oAutoExpandActivation Mandatory boolean parameter.
   */

  @DISPID(1611005974) //= 0x60060016. The runtime will prefer the VTID if present
  @VTID(50)
  void autoExpandActivation(
    boolean oAutoExpandActivation);


  /**
   * @param ioAdminLevel Mandatory Holder<java.lang.String> parameter.
   * @param ioLocked Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005976) //= 0x60060018. The runtime will prefer the VTID if present
  @VTID(51)
  boolean getAutoExpandActivationInfo(
    Holder<java.lang.String> ioAdminLevel,
    Holder<java.lang.String> ioLocked);


  /**
   * @param iLocked Mandatory boolean parameter.
   */

  @DISPID(1611005977) //= 0x60060019. The runtime will prefer the VTID if present
  @VTID(52)
  void setAutoExpandActivationLock(
    boolean iLocked);


  /**
   * <p>
   * Getter method for the COM property "ArcSelectionActivation"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005978) //= 0x6006001a. The runtime will prefer the VTID if present
  @VTID(53)
  boolean arcSelectionActivation();


  /**
   * <p>
   * Setter method for the COM property "ArcSelectionActivation"
   * </p>
   * @param oArcSelectionActivation Mandatory boolean parameter.
   */

  @DISPID(1611005978) //= 0x6006001a. The runtime will prefer the VTID if present
  @VTID(54)
  void arcSelectionActivation(
    boolean oArcSelectionActivation);


  /**
   * @param ioAdminLevel Mandatory Holder<java.lang.String> parameter.
   * @param ioLocked Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005980) //= 0x6006001c. The runtime will prefer the VTID if present
  @VTID(55)
  boolean getArcSelectionActivationInfo(
    Holder<java.lang.String> ioAdminLevel,
    Holder<java.lang.String> ioLocked);


  /**
   * @param iLocked Mandatory boolean parameter.
   */

  @DISPID(1611005981) //= 0x6006001d. The runtime will prefer the VTID if present
  @VTID(56)
  void setArcSelectionActivationLock(
    boolean iLocked);


  /**
   * <p>
   * Getter method for the COM property "AutoScrollActivation"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005982) //= 0x6006001e. The runtime will prefer the VTID if present
  @VTID(57)
  boolean autoScrollActivation();


  /**
   * <p>
   * Setter method for the COM property "AutoScrollActivation"
   * </p>
   * @param oAutoScrollActivation Mandatory boolean parameter.
   */

  @DISPID(1611005982) //= 0x6006001e. The runtime will prefer the VTID if present
  @VTID(58)
  void autoScrollActivation(
    boolean oAutoScrollActivation);


  /**
   * @param ioAdminLevel Mandatory Holder<java.lang.String> parameter.
   * @param ioLocked Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005984) //= 0x60060020. The runtime will prefer the VTID if present
  @VTID(59)
  boolean getAutoScrollActivationInfo(
    Holder<java.lang.String> ioAdminLevel,
    Holder<java.lang.String> ioLocked);


  /**
   * @param iLocked Mandatory boolean parameter.
   */

  @DISPID(1611005985) //= 0x60060021. The runtime will prefer the VTID if present
  @VTID(60)
  void setAutoScrollActivationLock(
    boolean iLocked);


  // Properties:
}
