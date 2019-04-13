import com4j.*;

@IID("{1CEA9860-FB46-11D3-9EE1-00508B675233}")
public interface BatchElement extends AnyObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Children"
   * </p>
   * @return  Returns a value of type BatchElements
   */

  @DISPID(1610940416) //= 0x60050000. The runtime will prefer the VTID if present
  @VTID(22)
  BatchElements children();


  /**
   * <p>
   * Getter method for the COM property "TagName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610940417) //= 0x60050001. The runtime will prefer the VTID if present
  @VTID(23)
  java.lang.String tagName();


  /**
   * <p>
   * Getter method for the COM property "ParentElement"
   * </p>
   * @return  Returns a value of type BatchElement
   */

  @DISPID(1610940418) //= 0x60050002. The runtime will prefer the VTID if present
  @VTID(24)
  BatchElement parentElement();


  /**
   * <p>
   * Getter method for the COM property "FileList"
   * </p>
   * @return  Returns a value of type BatchElements
   */

  @DISPID(1610940419) //= 0x60050003. The runtime will prefer the VTID if present
  @VTID(25)
  BatchElements fileList();


  /**
   * <p>
   * Getter method for the COM property "FolderList"
   * </p>
   * @return  Returns a value of type BatchElements
   */

  @DISPID(1610940420) //= 0x60050004. The runtime will prefer the VTID if present
  @VTID(26)
  BatchElements folderList();


  /**
   * <p>
   * Getter method for the COM property "PCList"
   * </p>
   * @return  Returns a value of type BatchElements
   */

  @DISPID(1610940421) //= 0x60050005. The runtime will prefer the VTID if present
  @VTID(27)
  BatchElements pcList();


  /**
   * <p>
   * Getter method for the COM property "Path"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610940422) //= 0x60050006. The runtime will prefer the VTID if present
  @VTID(28)
  java.lang.String path();


  /**
   * @param iAttrName Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1610940423) //= 0x60050007. The runtime will prefer the VTID if present
  @VTID(29)
  boolean boolValue(
    Holder<java.lang.String> iAttrName);


  /**
   * @param iAttrName Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type int
   */

  @DISPID(1610940424) //= 0x60050008. The runtime will prefer the VTID if present
  @VTID(30)
  int longValue(
    Holder<java.lang.String> iAttrName);


  /**
   * @param iAttrName Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type float
   */

  @DISPID(1610940425) //= 0x60050009. The runtime will prefer the VTID if present
  @VTID(31)
  float floatValue(
    Holder<java.lang.String> iAttrName);


  /**
   * @param iAttrName Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type double
   */

  @DISPID(1610940426) //= 0x6005000a. The runtime will prefer the VTID if present
  @VTID(32)
  double doubleValue(
    Holder<java.lang.String> iAttrName);


  /**
   * @param iAttrName Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610940427) //= 0x6005000b. The runtime will prefer the VTID if present
  @VTID(33)
  java.lang.String stringValue(
    Holder<java.lang.String> iAttrName);


  /**
   * @param iAttrName Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type Files
   */

  @DISPID(1610940428) //= 0x6005000c. The runtime will prefer the VTID if present
  @VTID(34)
  Files filesValue(
    Holder<java.lang.String> iAttrName);


  /**
   * @param iAttrName Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type Document
   */

  @DISPID(1610940429) //= 0x6005000d. The runtime will prefer the VTID if present
  @VTID(35)
  Document documentValue(
    Holder<java.lang.String> iAttrName);


  /**
   * @param oTag Mandatory Holder<java.lang.String> parameter.
   */

  @DISPID(1610940430) //= 0x6005000e. The runtime will prefer the VTID if present
  @VTID(36)
  void dataValue(
    Holder<java.lang.String> oTag);


  /**
   * @param iId Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type BatchElement
   */

  @DISPID(1610940431) //= 0x6005000f. The runtime will prefer the VTID if present
  @VTID(37)
  BatchElement parameter(
    Holder<java.lang.String> iId);


  /**
   * @return  Returns a value of type boolean
   */

  @DISPID(1610940432) //= 0x60050010. The runtime will prefer the VTID if present
  @VTID(38)
  boolean boolArg();


  /**
   * @return  Returns a value of type int
   */

  @DISPID(1610940433) //= 0x60050011. The runtime will prefer the VTID if present
  @VTID(39)
  int longArg();


  /**
   * @return  Returns a value of type float
   */

  @DISPID(1610940434) //= 0x60050012. The runtime will prefer the VTID if present
  @VTID(40)
  float floatArg();


  /**
   * @return  Returns a value of type double
   */

  @DISPID(1610940435) //= 0x60050013. The runtime will prefer the VTID if present
  @VTID(41)
  double doubleArg();


  /**
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610940436) //= 0x60050014. The runtime will prefer the VTID if present
  @VTID(42)
  java.lang.String stringArg();


  // Properties:
}
