package CatiaV5TypeLibs.InfItfTypeLib;

import com4j.*;

@IID("{7FBD9D5A-CFBA-0000-0280-030BA6000000}")
public interface Document extends AnyObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "FullName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610940416) //= 0x60050000. The runtime will prefer the VTID if present
  @VTID(22)
  java.lang.String fullName();


  /**
   * <p>
   * Getter method for the COM property "Path"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610940417) //= 0x60050001. The runtime will prefer the VTID if present
  @VTID(23)
  java.lang.String path();


  /**
   * <p>
   * Getter method for the COM property "ReadOnly"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610940418) //= 0x60050002. The runtime will prefer the VTID if present
  @VTID(24)
  boolean readOnly();


  /**
   * <p>
   * Getter method for the COM property "Saved"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610940419) //= 0x60050003. The runtime will prefer the VTID if present
  @VTID(25)
  boolean saved();


  /**
   * <p>
   * Getter method for the COM property "SeeHiddenElements"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610940420) //= 0x60050004. The runtime will prefer the VTID if present
  @VTID(26)
  boolean seeHiddenElements();


  /**
   * <p>
   * Setter method for the COM property "SeeHiddenElements"
   * </p>
   * @param oSeeHiddenElements Mandatory boolean parameter.
   */

  @DISPID(1610940420) //= 0x60050004. The runtime will prefer the VTID if present
  @VTID(27)
  void seeHiddenElements(
    boolean oSeeHiddenElements);


  /**
   * <p>
   * Getter method for the COM property "Cameras"
   * </p>
   * @return  Returns a value of type Cameras
   */

  @DISPID(1610940422) //= 0x60050006. The runtime will prefer the VTID if present
  @VTID(28)
  Cameras cameras();


  /**
   * <p>
   * Getter method for the COM property "Selection"
   * </p>
   * @return  Returns a value of type Selection
   */

  @DISPID(1610940423) //= 0x60050007. The runtime will prefer the VTID if present
  @VTID(29)
  Selection selection();


  /**
   * <p>
   * Getter method for the COM property "CurrentLayer"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610940424) //= 0x60050008. The runtime will prefer the VTID if present
  @VTID(30)
  java.lang.String currentLayer();


  /**
   * <p>
   * Setter method for the COM property "CurrentLayer"
   * </p>
   * @param oCurrentLayer Mandatory Holder<java.lang.String> parameter.
   */

  @DISPID(1610940424) //= 0x60050008. The runtime will prefer the VTID if present
  @VTID(31)
  void currentLayer(
    Holder<java.lang.String> oCurrentLayer);


  /**
   * <p>
   * Getter method for the COM property "CurrentFilter"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610940426) //= 0x6005000a. The runtime will prefer the VTID if present
  @VTID(32)
  java.lang.String currentFilter();


  /**
   * <p>
   * Setter method for the COM property "CurrentFilter"
   * </p>
   * @param oCurrentFilter Mandatory Holder<java.lang.String> parameter.
   */

  @DISPID(1610940426) //= 0x6005000a. The runtime will prefer the VTID if present
  @VTID(33)
  void currentFilter(
    Holder<java.lang.String> oCurrentFilter);


  /**
   * @param iFilterName Mandatory Holder<java.lang.String> parameter.
   * @param iFilterDefinition Mandatory Holder<java.lang.String> parameter.
   */

  @DISPID(1610940428) //= 0x6005000c. The runtime will prefer the VTID if present
  @VTID(34)
  void createFilter(
    Holder<java.lang.String> iFilterName,
    Holder<java.lang.String> iFilterDefinition);


  /**
   * @param iFilterName Mandatory Holder<java.lang.String> parameter.
   */

  @DISPID(1610940429) //= 0x6005000d. The runtime will prefer the VTID if present
  @VTID(35)
  void removeFilter(
    Holder<java.lang.String> iFilterName);


  /**
   * @param iMessage Mandatory Holder<java.lang.String> parameter.
   * @param ioDocumentWindowLocation Mandatory java.lang.Object[] parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610940430) //= 0x6005000e. The runtime will prefer the VTID if present
  @VTID(36)
  java.lang.String indicate2D(
    Holder<java.lang.String> iMessage,
    java.lang.Object[] ioDocumentWindowLocation);


  /**
   * @param iPlanarGeometricObject Mandatory AnyObject parameter.
   * @param iMessage Mandatory Holder<java.lang.String> parameter.
   * @param ioWindowLocation2D Mandatory java.lang.Object[] parameter.
   * @param ioWindowLocation3D Mandatory java.lang.Object[] parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610940431) //= 0x6005000f. The runtime will prefer the VTID if present
  @VTID(37)
  java.lang.String indicate3D(
    AnyObject iPlanarGeometricObject,
    Holder<java.lang.String> iMessage,
    java.lang.Object[] ioWindowLocation2D,
    java.lang.Object[] ioWindowLocation3D);


  /**
   * @param iLabel Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type Reference
   */

  @DISPID(1610940432) //= 0x60050010. The runtime will prefer the VTID if present
  @VTID(38)
  Reference createReferenceFromName(
    Holder<java.lang.String> iLabel);


  /**
   * @return  Returns a value of type Window
   */

  @DISPID(1610940433) //= 0x60050011. The runtime will prefer the VTID if present
  @VTID(39)
  Window newWindow();


  /**
   */

  @DISPID(1610940434) //= 0x60050012. The runtime will prefer the VTID if present
  @VTID(40)
  void activate();


  /**
   */

  @DISPID(1610940435) //= 0x60050013. The runtime will prefer the VTID if present
  @VTID(41)
  void save();


  /**
   * @param fileName Mandatory Holder<java.lang.String> parameter.
   */

  @DISPID(1610940436) //= 0x60050014. The runtime will prefer the VTID if present
  @VTID(42)
  void saveAs(
    Holder<java.lang.String> fileName);


  /**
   * @param fileName Mandatory Holder<java.lang.String> parameter.
   * @param format Mandatory Holder<java.lang.String> parameter.
   */

  @DISPID(1610940437) //= 0x60050015. The runtime will prefer the VTID if present
  @VTID(43)
  void exportData(
    Holder<java.lang.String> fileName,
    Holder<java.lang.String> format);


  /**
   */

  @DISPID(1610940438) //= 0x60050016. The runtime will prefer the VTID if present
  @VTID(44)
  void close();


  /**
   * @param workbenchName Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type Workbench
   */

  @DISPID(1610940439) //= 0x60050017. The runtime will prefer the VTID if present
  @VTID(45)
  Workbench getWorkbench(
    Holder<java.lang.String> workbenchName);


  // Properties:
}
