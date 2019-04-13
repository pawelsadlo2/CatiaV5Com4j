package CatiaV5TypeLibs.MecModTypeLib;
import CatiaV5TypeLibs.KnowledgewareTypeLib.*;
import CatiaV5TypeLibs.InfTypeLib.*;

import com4j.*;

@IID("{180C7AA4-5B43-11D1-A124-080009DCA4AE}")
public interface Product extends AnyObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "CatiaV5TypeLibs.PartItfTypeLib.Products"
   * </p>
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.Products
   */

  @DISPID(1610940416) //= 0x60050000. The runtime will prefer the VTID if present
  @VTID(22)
  Products products();


  /**
   * <p>
   * Getter method for the COM property "CatiaV5TypeLibs.PartItfTypeLib.Publications"
   * </p>
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.Publications
   */

  @DISPID(1610940417) //= 0x60050001. The runtime will prefer the VTID if present
  @VTID(23)
  Publications publications();


  /**
   * @param iShapePathName Mandatory Holder<java.lang.String> parameter.
   * @param iShapeName Mandatory Holder<java.lang.String> parameter.
   * @param iRepBehavior Mandatory CatiaV5TypeLibs.PartItfTypeLib.CatRepType parameter.
   * @param iContext Mandatory boolean parameter.
   */

  @DISPID(1610940418) //= 0x60050002. The runtime will prefer the VTID if present
  @VTID(24)
  void addShapeRepresentation(
    Holder<java.lang.String> iShapePathName,
    Holder<java.lang.String> iShapeName,
    CatRepType iRepBehavior,
    boolean iContext);


  /**
   * @param iShapeName Mandatory Holder<java.lang.String> parameter.
   * @param iRepBehavior Mandatory CatiaV5TypeLibs.PartItfTypeLib.CatRepType parameter.
   * @param iContext Mandatory boolean parameter.
   */

  @DISPID(1610940419) //= 0x60050003. The runtime will prefer the VTID if present
  @VTID(25)
  void removeShapeRepresentation(
    Holder<java.lang.String> iShapeName,
    CatRepType iRepBehavior,
    boolean iContext);


  /**
   * @param iShapeName Mandatory Holder<java.lang.String> parameter.
   * @param iRepBehavior Mandatory CatiaV5TypeLibs.PartItfTypeLib.CatRepType parameter.
   * @param iContext Mandatory boolean parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1610940420) //= 0x60050004. The runtime will prefer the VTID if present
  @VTID(26)
  boolean hasShapeRepresentation(
    Holder<java.lang.String> iShapeName,
    CatRepType iRepBehavior,
    boolean iContext);


  /**
   * @param iLoadIfNecessary Mandatory boolean parameter.
   * @param iShapeName Mandatory Holder<java.lang.String> parameter.
   * @param iRepBehavior Mandatory CatiaV5TypeLibs.PartItfTypeLib.CatRepType parameter.
   * @param iContext Mandatory boolean parameter.
   * @return  Returns a value of type CATBaseDispatch
   */

  @DISPID(1610940421) //= 0x60050005. The runtime will prefer the VTID if present
  @VTID(27)
  CATBaseDispatch getShapeRepresentation(
    boolean iLoadIfNecessary,
    Holder<java.lang.String> iShapeName,
    CatRepType iRepBehavior,
    boolean iContext);


  /**
   * @param iShapePathName Mandatory Holder<java.lang.String> parameter.
   */

  @DISPID(1610940422) //= 0x60050006. The runtime will prefer the VTID if present
  @VTID(28)
  void addMasterShapeRepresentation(
    Holder<java.lang.String> iShapePathName);


  /**
   */

  @DISPID(1610940423) //= 0x60050007. The runtime will prefer the VTID if present
  @VTID(29)
  void removeMasterShapeRepresentation();


  /**
   * @return  Returns a value of type boolean
   */

  @DISPID(1610940424) //= 0x60050008. The runtime will prefer the VTID if present
  @VTID(30)
  boolean hasAMasterShapeRepresentation();


  /**
   * @param iLoadIfNecessary Mandatory boolean parameter.
   * @return  Returns a value of type CATBaseDispatch
   */

  @DISPID(1610940425) //= 0x60050009. The runtime will prefer the VTID if present
  @VTID(31)
  CATBaseDispatch getMasterShapeRepresentation(
    boolean iLoadIfNecessary);


  /**
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610940426) //= 0x6005000a. The runtime will prefer the VTID if present
  @VTID(32)
  java.lang.String getMasterShapeRepresentationPathName();


  /**
   * <p>
   * Getter method for the COM property "PartNumber"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610940427) //= 0x6005000b. The runtime will prefer the VTID if present
  @VTID(33)
  java.lang.String partNumber();


  /**
   * <p>
   * Setter method for the COM property "PartNumber"
   * </p>
   * @param oPartNumber Mandatory Holder<java.lang.String> parameter.
   */

  @DISPID(1610940427) //= 0x6005000b. The runtime will prefer the VTID if present
  @VTID(34)
  void partNumber(
    Holder<java.lang.String> oPartNumber);


  /**
   * <p>
   * Getter method for the COM property "Revision"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610940429) //= 0x6005000d. The runtime will prefer the VTID if present
  @VTID(35)
  java.lang.String revision();


  /**
   * <p>
   * Setter method for the COM property "Revision"
   * </p>
   * @param oRevision Mandatory Holder<java.lang.String> parameter.
   */

  @DISPID(1610940429) //= 0x6005000d. The runtime will prefer the VTID if present
  @VTID(36)
  void revision(
    Holder<java.lang.String> oRevision);


  /**
   * <p>
   * Getter method for the COM property "Definition"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610940431) //= 0x6005000f. The runtime will prefer the VTID if present
  @VTID(37)
  java.lang.String definition();


  /**
   * <p>
   * Setter method for the COM property "Definition"
   * </p>
   * @param oDefinition Mandatory Holder<java.lang.String> parameter.
   */

  @DISPID(1610940431) //= 0x6005000f. The runtime will prefer the VTID if present
  @VTID(38)
  void definition(
    Holder<java.lang.String> oDefinition);


  /**
   * <p>
   * Getter method for the COM property "Nomenclature"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610940433) //= 0x60050011. The runtime will prefer the VTID if present
  @VTID(39)
  java.lang.String nomenclature();


  /**
   * <p>
   * Setter method for the COM property "Nomenclature"
   * </p>
   * @param oNomenclature Mandatory Holder<java.lang.String> parameter.
   */

  @DISPID(1610940433) //= 0x60050011. The runtime will prefer the VTID if present
  @VTID(40)
  void nomenclature(
    Holder<java.lang.String> oNomenclature);


  /**
   * <p>
   * Getter method for the COM property "Source"
   * </p>
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.CatProductSource
   */

  @DISPID(1610940435) //= 0x60050013. The runtime will prefer the VTID if present
  @VTID(41)
  CatProductSource source();


  /**
   * <p>
   * Setter method for the COM property "Source"
   * </p>
   * @param oSource Mandatory CatiaV5TypeLibs.PartItfTypeLib.CatProductSource parameter.
   */

  @DISPID(1610940435) //= 0x60050013. The runtime will prefer the VTID if present
  @VTID(42)
  void source(
    CatProductSource oSource);


  /**
   * <p>
   * Getter method for the COM property "DescriptionRef"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610940437) //= 0x60050015. The runtime will prefer the VTID if present
  @VTID(43)
  java.lang.String descriptionRef();


  /**
   * <p>
   * Setter method for the COM property "DescriptionRef"
   * </p>
   * @param oDescriptionRef Mandatory Holder<java.lang.String> parameter.
   */

  @DISPID(1610940437) //= 0x60050015. The runtime will prefer the VTID if present
  @VTID(44)
  void descriptionRef(
    Holder<java.lang.String> oDescriptionRef);


  /**
   * <p>
   * Getter method for the COM property "DescriptionInst"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610940439) //= 0x60050017. The runtime will prefer the VTID if present
  @VTID(45)
  java.lang.String descriptionInst();


  /**
   * <p>
   * Setter method for the COM property "DescriptionInst"
   * </p>
   * @param oDescriptionInst Mandatory Holder<java.lang.String> parameter.
   */

  @DISPID(1610940439) //= 0x60050017. The runtime will prefer the VTID if present
  @VTID(46)
  void descriptionInst(
    Holder<java.lang.String> oDescriptionInst);


  /**
   * @param iConnectionsType Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type Collection
   */

  @DISPID(1610940441) //= 0x60050019. The runtime will prefer the VTID if present
  @VTID(47)
  Collection connections(
    Holder<java.lang.String> iConnectionsType);


  /**
   * <p>
   * Getter method for the COM property "Move"
   * </p>
   * @return  Returns a value of type Move
   */

  @DISPID(1610940442) //= 0x6005001a. The runtime will prefer the VTID if present
  @VTID(48)
  Move move();


  /**
   * <p>
   * Getter method for the COM property "Position"
   * </p>
   * @return  Returns a value of type Position
   */

  @DISPID(1610940443) //= 0x6005001b. The runtime will prefer the VTID if present
  @VTID(49)
  Position position();


  /**
   * <p>
   * Getter method for the COM property "CatiaV5TypeLibs.PartItfTypeLib.Analyze"
   * </p>
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.Analyze
   */

  @DISPID(1610940444) //= 0x6005001c. The runtime will prefer the VTID if present
  @VTID(50)
  Analyze analyze();


  /**
   * @param iFileType Mandatory CatiaV5TypeLibs.PartItfTypeLib.CatFileType parameter.
   * @param iFile Mandatory Holder<java.lang.String> parameter.
   */

  @DISPID(1610940445) //= 0x6005001d. The runtime will prefer the VTID if present
  @VTID(51)
  void extractBOM(
    CatFileType iFileType,
    Holder<java.lang.String> iFile);


  /**
   */

  @DISPID(1610940446) //= 0x6005001e. The runtime will prefer the VTID if present
  @VTID(52)
  void update();


  /**
   * <p>
   * Getter method for the COM property "ReferenceProduct"
   * </p>
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.Product
   */

  @DISPID(1610940447) //= 0x6005001f. The runtime will prefer the VTID if present
  @VTID(53)
  Product referenceProduct();


  /**
   * <p>
   * Getter method for the COM property "CatiaV5TypeLibs.PartItfTypeLib.Parameters"
   * </p>
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.Parameters
   */

  @DISPID(1610940448) //= 0x60050020. The runtime will prefer the VTID if present
  @VTID(54)
  Parameters parameters();


  /**
   * <p>
   * Getter method for the COM property "UserRefProperties"
   * </p>
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.Parameters
   */

  @DISPID(1610940449) //= 0x60050021. The runtime will prefer the VTID if present
  @VTID(55)
  Parameters userRefProperties();


  /**
   * <p>
   * Getter method for the COM property "CatiaV5TypeLibs.PartItfTypeLib.Relations"
   * </p>
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.Relations
   */

  @DISPID(1610940450) //= 0x60050022. The runtime will prefer the VTID if present
  @VTID(56)
  Relations relations();


  /**
   * @param iLabel Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type Reference
   */

  @DISPID(1610940451) //= 0x60050023. The runtime will prefer the VTID if present
  @VTID(57)
  Reference createReferenceFromName(
    Holder<java.lang.String> iLabel);


  /**
   * @param newMode Mandatory CatiaV5TypeLibs.PartItfTypeLib.CatWorkModeType parameter.
   */

  @DISPID(1610940452) //= 0x60050024. The runtime will prefer the VTID if present
  @VTID(58)
  void applyWorkMode(
    CatWorkModeType newMode);


  /**
   */

  @DISPID(1610940453) //= 0x60050025. The runtime will prefer the VTID if present
  @VTID(59)
  void activateDefaultShape();


  /**
   */

  @DISPID(1610940454) //= 0x60050026. The runtime will prefer the VTID if present
  @VTID(60)
  void desactivateDefaultShape();


  /**
   * @param shapeName Mandatory Holder<java.lang.String> parameter.
   */

  @DISPID(1610940455) //= 0x60050027. The runtime will prefer the VTID if present
  @VTID(61)
  void activateShape(
    Holder<java.lang.String> shapeName);


  /**
   * @param shapeName Mandatory Holder<java.lang.String> parameter.
   */

  @DISPID(1610940456) //= 0x60050028. The runtime will prefer the VTID if present
  @VTID(62)
  void desactivateShape(
    Holder<java.lang.String> shapeName);


  /**
   * @return  Returns a value of type short
   */

  @DISPID(1610940457) //= 0x60050029. The runtime will prefer the VTID if present
  @VTID(63)
  short getNumberOfShapes();


  /**
   * @param olistshape Mandatory java.lang.Object[] parameter.
   */

  @DISPID(1610940458) //= 0x6005002a. The runtime will prefer the VTID if present
  @VTID(64)
  void getAllShapesNames(
    java.lang.Object[] olistshape);


  /**
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610940459) //= 0x6005002b. The runtime will prefer the VTID if present
  @VTID(65)
  java.lang.String getActiveShapeName();


  /**
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610940460) //= 0x6005002c. The runtime will prefer the VTID if present
  @VTID(66)
  java.lang.String getDefaultShapeName();


  /**
   * @param iShapeName Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610940461) //= 0x6005002d. The runtime will prefer the VTID if present
  @VTID(67)
  java.lang.String getShapePathName(
    Holder<java.lang.String> iShapeName);


  /**
   * @param iApplicationType Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type CATBaseDispatch
   */

  @DISPID(1610940462) //= 0x6005002e. The runtime will prefer the VTID if present
  @VTID(68)
  CATBaseDispatch getTechnologicalObject(
    Holder<java.lang.String> iApplicationType);


  // Properties:
}
