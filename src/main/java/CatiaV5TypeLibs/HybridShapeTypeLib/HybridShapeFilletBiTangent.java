package CatiaV5TypeLibs.HybridShapeTypeLib;
import CatiaV5TypeLibs.InfTypeLib.*;
import CatiaV5TypeLibs.MecModTypeLib.*;
import CatiaV5TypeLibs.KnowledgewareTypeLib.*;

import com4j.*;

@IID("{B957EE23-25B0-4410-BCB6-5F54BCA35828}")
public interface HybridShapeFilletBiTangent extends HybridShape {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "FirstElem"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(25)
  Reference firstElem();


  /**
   * <p>
   * Setter method for the COM property "FirstElem"
   * </p>
   * @param oElem Mandatory Reference parameter.
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(26)
  void firstElem(
    Reference oElem);


  /**
   * <p>
   * Getter method for the COM property "SecondElem"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611005954) //= 0x60060002. The runtime will prefer the VTID if present
  @VTID(27)
  Reference secondElem();


  /**
   * <p>
   * Setter method for the COM property "SecondElem"
   * </p>
   * @param oElem Mandatory Reference parameter.
   */

  @DISPID(1611005954) //= 0x60060002. The runtime will prefer the VTID if present
  @VTID(28)
  void secondElem(
    Reference oElem);


  /**
   * <p>
   * Getter method for the COM property "Radius"
   * </p>
   * @return  Returns a value of type Length
   */

  @DISPID(1611005956) //= 0x60060004. The runtime will prefer the VTID if present
  @VTID(29)
  Length radius();


  /**
   * <p>
   * Getter method for the COM property "RadiusValue"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(1611005957) //= 0x60060005. The runtime will prefer the VTID if present
  @VTID(30)
  double radiusValue();


  /**
   * <p>
   * Setter method for the COM property "RadiusValue"
   * </p>
   * @param oX Mandatory double parameter.
   */

  @DISPID(1611005957) //= 0x60060005. The runtime will prefer the VTID if present
  @VTID(31)
  void radiusValue(
    double oX);


  /**
   * <p>
   * Getter method for the COM property "FirstOrientation"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611005959) //= 0x60060007. The runtime will prefer the VTID if present
  @VTID(32)
  int firstOrientation();


  /**
   * <p>
   * Setter method for the COM property "FirstOrientation"
   * </p>
   * @param oOrientation Mandatory int parameter.
   */

  @DISPID(1611005959) //= 0x60060007. The runtime will prefer the VTID if present
  @VTID(33)
  void firstOrientation(
    int oOrientation);


  /**
   * <p>
   * Getter method for the COM property "SecondOrientation"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611005961) //= 0x60060009. The runtime will prefer the VTID if present
  @VTID(34)
  int secondOrientation();


  /**
   * <p>
   * Setter method for the COM property "SecondOrientation"
   * </p>
   * @param oOrientation Mandatory int parameter.
   */

  @DISPID(1611005961) //= 0x60060009. The runtime will prefer the VTID if present
  @VTID(35)
  void secondOrientation(
    int oOrientation);


  /**
   */

  @DISPID(1611005963) //= 0x6006000b. The runtime will prefer the VTID if present
  @VTID(36)
  void invertFirstOrientation();


  /**
   */

  @DISPID(1611005964) //= 0x6006000c. The runtime will prefer the VTID if present
  @VTID(37)
  void invertSecondOrientation();


  /**
   * <p>
   * Getter method for the COM property "SupportsTrimMode"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611005965) //= 0x6006000d. The runtime will prefer the VTID if present
  @VTID(38)
  int supportsTrimMode();


  /**
   * <p>
   * Setter method for the COM property "SupportsTrimMode"
   * </p>
   * @param oTrimMode Mandatory int parameter.
   */

  @DISPID(1611005965) //= 0x6006000d. The runtime will prefer the VTID if present
  @VTID(39)
  void supportsTrimMode(
    int oTrimMode);


  /**
   * <p>
   * Getter method for the COM property "RibbonRelimitationMode"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611005967) //= 0x6006000f. The runtime will prefer the VTID if present
  @VTID(40)
  int ribbonRelimitationMode();


  /**
   * <p>
   * Setter method for the COM property "RibbonRelimitationMode"
   * </p>
   * @param oRelimitationMode Mandatory int parameter.
   */

  @DISPID(1611005967) //= 0x6006000f. The runtime will prefer the VTID if present
  @VTID(41)
  void ribbonRelimitationMode(
    int oRelimitationMode);


  /**
   * <p>
   * Getter method for the COM property "Spine"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611005969) //= 0x60060011. The runtime will prefer the VTID if present
  @VTID(42)
  Reference spine();


  /**
   * <p>
   * Setter method for the COM property "Spine"
   * </p>
   * @param oElem Mandatory Reference parameter.
   */

  @DISPID(1611005969) //= 0x60060011. The runtime will prefer the VTID if present
  @VTID(43)
  void spine(
    Reference oElem);


  /**
   * <p>
   * Getter method for the COM property "HoldCurve"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611005971) //= 0x60060013. The runtime will prefer the VTID if present
  @VTID(44)
  Reference holdCurve();


  /**
   * <p>
   * Setter method for the COM property "HoldCurve"
   * </p>
   * @param oElem Mandatory Reference parameter.
   */

  @DISPID(1611005971) //= 0x60060013. The runtime will prefer the VTID if present
  @VTID(45)
  void holdCurve(
    Reference oElem);


  /**
   * @param iPos Mandatory int parameter.
   * @return  Returns a value of type Reference
   */

  @DISPID(1611005973) //= 0x60060015. The runtime will prefer the VTID if present
  @VTID(46)
  Reference getFaceToKeep(
    int iPos);


  /**
   * @param iFace Mandatory Reference parameter.
   */

  @DISPID(1611005974) //= 0x60060016. The runtime will prefer the VTID if present
  @VTID(47)
  void appendNewFaceToKeep(
    Reference iFace);


  /**
   * @param iFace Mandatory Reference parameter.
   */

  @DISPID(1611005975) //= 0x60060017. The runtime will prefer the VTID if present
  @VTID(48)
  void removeFaceToKeep(
    Reference iFace);


  /**
   */

  @DISPID(1611005976) //= 0x60060018. The runtime will prefer the VTID if present
  @VTID(49)
  void removeAllFacesToKeep();


  /**
   * <p>
   * Getter method for the COM property "FirstLawRelimiter"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611005977) //= 0x60060019. The runtime will prefer the VTID if present
  @VTID(50)
  Reference firstLawRelimiter();


  /**
   * <p>
   * Setter method for the COM property "FirstLawRelimiter"
   * </p>
   * @param oFirstLaw Mandatory Reference parameter.
   */

  @DISPID(1611005977) //= 0x60060019. The runtime will prefer the VTID if present
  @VTID(51)
  void firstLawRelimiter(
    Reference oFirstLaw);


  /**
   * <p>
   * Getter method for the COM property "SecondLawRelimiter"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611005979) //= 0x6006001b. The runtime will prefer the VTID if present
  @VTID(52)
  Reference secondLawRelimiter();


  /**
   * <p>
   * Setter method for the COM property "SecondLawRelimiter"
   * </p>
   * @param oSecondLaw Mandatory Reference parameter.
   */

  @DISPID(1611005979) //= 0x6006001b. The runtime will prefer the VTID if present
  @VTID(53)
  void secondLawRelimiter(
    Reference oSecondLaw);


  /**
   * <p>
   * Getter method for the COM property "IntegratedLaw"
   * </p>
   * @return  Returns a value of type HybridShapeIntegratedLaw
   */

  @DISPID(1611005981) //= 0x6006001d. The runtime will prefer the VTID if present
  @VTID(54)
  HybridShapeIntegratedLaw integratedLaw();


  /**
   * <p>
   * Setter method for the COM property "IntegratedLaw"
   * </p>
   * @param oIntegratedLaw Mandatory HybridShapeIntegratedLaw parameter.
   */

  @DISPID(1611005981) //= 0x6006001d. The runtime will prefer the VTID if present
  @VTID(55)
  void integratedLaw(
    HybridShapeIntegratedLaw oIntegratedLaw);


  /**
   * <p>
   * Getter method for the COM property "RadiusType"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611005983) //= 0x6006001f. The runtime will prefer the VTID if present
  @VTID(56)
  int radiusType();


  /**
   * <p>
   * Setter method for the COM property "RadiusType"
   * </p>
   * @param oRadiusType Mandatory int parameter.
   */

  @DISPID(1611005983) //= 0x6006001f. The runtime will prefer the VTID if present
  @VTID(57)
  void radiusType(
    int oRadiusType);


  /**
   * <p>
   * Getter method for the COM property "SectionType"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611005985) //= 0x60060021. The runtime will prefer the VTID if present
  @VTID(58)
  int sectionType();


  /**
   * <p>
   * Setter method for the COM property "SectionType"
   * </p>
   * @param oSectionType Mandatory int parameter.
   */

  @DISPID(1611005985) //= 0x60060021. The runtime will prefer the VTID if present
  @VTID(59)
  void sectionType(
    int oSectionType);


  /**
   * <p>
   * Getter method for the COM property "ConicalSectionParameter"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(1611005987) //= 0x60060023. The runtime will prefer the VTID if present
  @VTID(60)
  double conicalSectionParameter();


  /**
   * <p>
   * Setter method for the COM property "ConicalSectionParameter"
   * </p>
   * @param oX Mandatory double parameter.
   */

  @DISPID(1611005987) //= 0x60060023. The runtime will prefer the VTID if present
  @VTID(61)
  void conicalSectionParameter(
    double oX);


  // Properties:
}
