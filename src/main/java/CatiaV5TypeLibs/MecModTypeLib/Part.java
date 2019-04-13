package CatiaV5TypeLibs.MecModTypeLib;
import CatiaV5TypeLibs.KnowledgewareTypeLib.*;

import CatiaV5TypeLibs.InfTypeLib.*;
import com4j.*;

@IID("{D402D912-39A4-11D1-A26C-0000F87546FD}")
public interface Part extends AnyObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "MainBody"
   * </p>
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.Body
   */

  @DISPID(1610940416) //= 0x60050000. The runtime will prefer the VTID if present
  @VTID(22)
  Body mainBody();


  /**
   * <p>
   * Setter method for the COM property "MainBody"
   * </p>
   * @param oMainBody Mandatory CatiaV5TypeLibs.PartItfTypeLib.Body parameter.
   */

  @DISPID(1610940416) //= 0x60050000. The runtime will prefer the VTID if present
  @VTID(23)
  void mainBody(
    Body oMainBody);


  /**
   * <p>
   * Getter method for the COM property "InWorkObject"
   * </p>
   * @return  Returns a value of type AnyObject
   */

  @DISPID(1610940418) //= 0x60050002. The runtime will prefer the VTID if present
  @VTID(24)
  AnyObject inWorkObject();


  /**
   * <p>
   * Setter method for the COM property "InWorkObject"
   * </p>
   * @param oInWorkObject Mandatory AnyObject parameter.
   */

  @DISPID(1610940418) //= 0x60050002. The runtime will prefer the VTID if present
  @VTID(25)
  void inWorkObject(
    AnyObject oInWorkObject);


  /**
   * <p>
   * Getter method for the COM property "CatiaV5TypeLibs.PartItfTypeLib.Bodies"
   * </p>
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.Bodies
   */

  @DISPID(1610940420) //= 0x60050004. The runtime will prefer the VTID if present
  @VTID(26)
  Bodies bodies();


  /**
   * <p>
   * Getter method for the COM property "CatiaV5TypeLibs.PartItfTypeLib.HybridBodies"
   * </p>
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.HybridBodies
   */

  @DISPID(1610940421) //= 0x60050005. The runtime will prefer the VTID if present
  @VTID(27)
  HybridBodies hybridBodies();


  /**
   * <p>
   * Getter method for the COM property "CatiaV5TypeLibs.PartItfTypeLib.ShapeFactory"
   * </p>
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.Factory
   */

  @DISPID(1610940422) //= 0x60050006. The runtime will prefer the VTID if present
  @VTID(28)
  Factory shapeFactory();


  /**
   * <p>
   * Getter method for the COM property "HybridShapeFactory"
   * </p>
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.Factory
   */

  @DISPID(1610940423) //= 0x60050007. The runtime will prefer the VTID if present
  @VTID(29)
  Factory hybridShapeFactory();


  /**
   * <p>
   * Getter method for the COM property "SheetMetalFactory"
   * </p>
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.Factory
   */

  @DISPID(1610940424) //= 0x60050008. The runtime will prefer the VTID if present
  @VTID(30)
  Factory sheetMetalFactory();


  /**
   * <p>
   * Getter method for the COM property "SheetMetalParameters"
   * </p>
   * @return  Returns a value of type AnyObject
   */

  @DISPID(1610940425) //= 0x60050009. The runtime will prefer the VTID if present
  @VTID(31)
  AnyObject sheetMetalParameters();


  /**
   * <p>
   * Getter method for the COM property "CatiaV5TypeLibs.PartItfTypeLib.GeometricElements"
   * </p>
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.GeometricElements
   */

  @DISPID(1610940426) //= 0x6005000a. The runtime will prefer the VTID if present
  @VTID(32)
  GeometricElements geometricElements();


  /**
   * <p>
   * Getter method for the COM property "CatiaV5TypeLibs.PartItfTypeLib.Constraints"
   * </p>
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.Constraints
   */

  @DISPID(1610940427) //= 0x6005000b. The runtime will prefer the VTID if present
  @VTID(33)
  Constraints constraints();


  /**
   * <p>
   * Getter method for the COM property "CatiaV5TypeLibs.PartItfTypeLib.Relations"
   * </p>
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.Relations
   */

  @DISPID(1610940428) //= 0x6005000c. The runtime will prefer the VTID if present
  @VTID(34)
  Relations relations();


  /**
   * <p>
   * Getter method for the COM property "CatiaV5TypeLibs.PartItfTypeLib.Parameters"
   * </p>
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.Parameters
   */

  @DISPID(1610940429) //= 0x6005000d. The runtime will prefer the VTID if present
  @VTID(35)
  Parameters parameters();


  /**
   * <p>
   * Getter method for the COM property "AnnotationSets"
   * </p>
   * @return  Returns a value of type Collection
   */

  @DISPID(1610940430) //= 0x6005000e. The runtime will prefer the VTID if present
  @VTID(36)
  Collection annotationSets();


  /**
   * <p>
   * Getter method for the COM property "UserSurfaces"
   * </p>
   * @return  Returns a value of type Collection
   */

  @DISPID(1610940431) //= 0x6005000f. The runtime will prefer the VTID if present
  @VTID(37)
  Collection userSurfaces();


  /**
   * <p>
   * Getter method for the COM property "CatiaV5TypeLibs.PartItfTypeLib.AxisSystems"
   * </p>
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.AxisSystems
   */

  @DISPID(1610940432) //= 0x60050010. The runtime will prefer the VTID if present
  @VTID(38)
  AxisSystems axisSystems();


  /**
   * <p>
   * Getter method for the COM property "CatiaV5TypeLibs.PartItfTypeLib.OriginElements"
   * </p>
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.OriginElements
   */

  @DISPID(1610940433) //= 0x60050011. The runtime will prefer the VTID if present
  @VTID(39)
  OriginElements originElements();


  /**
   * <p>
   * Getter method for the COM property "Density"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(1610940434) //= 0x60050012. The runtime will prefer the VTID if present
  @VTID(40)
  double density();


  /**
   * @param iLabel Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type Reference
   */

  @DISPID(1610940435) //= 0x60050013. The runtime will prefer the VTID if present
  @VTID(41)
  Reference createReferenceFromName(
    Holder<java.lang.String> iLabel);


  /**
   * @param iObject Mandatory AnyObject parameter.
   * @return  Returns a value of type Reference
   */

  @DISPID(1610940436) //= 0x60050014. The runtime will prefer the VTID if present
  @VTID(42)
  Reference createReferenceFromGeometry(
    AnyObject iObject);


  /**
   * @param iObject Mandatory AnyObject parameter.
   * @return  Returns a value of type Reference
   */

  @DISPID(1610940437) //= 0x60050015. The runtime will prefer the VTID if present
  @VTID(43)
  Reference createReferenceFromObject(
    AnyObject iObject);


  /**
   * @param iObjName Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type AnyObject
   */

  @DISPID(1610940438) //= 0x60050016. The runtime will prefer the VTID if present
  @VTID(44)
  AnyObject findObjectByName(
    Holder<java.lang.String> iObjName);


  /**
   */

  @DISPID(1610940439) //= 0x60050017. The runtime will prefer the VTID if present
  @VTID(45)
  void update();


  /**
   * @param iObject Mandatory AnyObject parameter.
   */

  @DISPID(1610940440) //= 0x60050018. The runtime will prefer the VTID if present
  @VTID(46)
  void updateObject(
    AnyObject iObject);


  /**
   * @param iObject Mandatory AnyObject parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1610940441) //= 0x60050019. The runtime will prefer the VTID if present
  @VTID(47)
  boolean isUpToDate(
    AnyObject iObject);


  /**
   * @param iObject Mandatory AnyObject parameter.
   */

  @DISPID(1610940442) //= 0x6005001a. The runtime will prefer the VTID if present
  @VTID(48)
  void inactivate(
    AnyObject iObject);


  /**
   * @param iObject Mandatory AnyObject parameter.
   */

  @DISPID(1610940443) //= 0x6005001b. The runtime will prefer the VTID if present
  @VTID(49)
  void activate(
    AnyObject iObject);


  /**
   * @param iObject Mandatory AnyObject parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1610940444) //= 0x6005001c. The runtime will prefer the VTID if present
  @VTID(50)
  boolean isInactive(
    AnyObject iObject);


  /**
   * @param iLabel Mandatory Holder<java.lang.String> parameter.
   * @param iObjectContext Mandatory AnyObject parameter.
   * @return  Returns a value of type Reference
   */

  @DISPID(1610940445) //= 0x6005001d. The runtime will prefer the VTID if present
  @VTID(51)
  Reference createReferenceFromBRepName(
    Holder<java.lang.String> iLabel,
    AnyObject iObjectContext);


  /**
   * @param iFactoryIID Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.Factory
   */

  @DISPID(1610940446) //= 0x6005001e. The runtime will prefer the VTID if present
  @VTID(52)
  Factory getCustomerFactory(
    Holder<java.lang.String> iFactoryIID);


  /**
   * <p>
   * Getter method for the COM property "CatiaV5TypeLibs.PartItfTypeLib.OrderedGeometricalSets"
   * </p>
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.OrderedGeometricalSets
   */

  @DISPID(1610940447) //= 0x6005001f. The runtime will prefer the VTID if present
  @VTID(53)
  OrderedGeometricalSets orderedGeometricalSets();


  // Properties:
}
