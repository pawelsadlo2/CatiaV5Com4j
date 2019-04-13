package CatiaV5TypeLibs.MecModTypeLib;
import CatiaV5TypeLibs.KnowledgewareTypeLib.*;
import CatiaV5TypeLibs.InfTypeLib.*;

import com4j.*;

@IID("{8C89B25C-2C3E-0000-0280-020E60000000}")
public interface HybridShapeTrim extends HybridShape {
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
   * Getter method for the COM property "FirstOrientation"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611005956) //= 0x60060004. The runtime will prefer the VTID if present
  @VTID(29)
  int firstOrientation();


  /**
   * <p>
   * Setter method for the COM property "FirstOrientation"
   * </p>
   * @param oOrientation Mandatory int parameter.
   */

  @DISPID(1611005956) //= 0x60060004. The runtime will prefer the VTID if present
  @VTID(30)
  void firstOrientation(
    int oOrientation);


  /**
   * <p>
   * Getter method for the COM property "SecondOrientation"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611005958) //= 0x60060006. The runtime will prefer the VTID if present
  @VTID(31)
  int secondOrientation();


  /**
   * <p>
   * Setter method for the COM property "SecondOrientation"
   * </p>
   * @param oOrientation Mandatory int parameter.
   */

  @DISPID(1611005958) //= 0x60060006. The runtime will prefer the VTID if present
  @VTID(32)
  void secondOrientation(
    int oOrientation);


  /**
   */

  @DISPID(1611005960) //= 0x60060008. The runtime will prefer the VTID if present
  @VTID(33)
  void invertFirstOrientation();


  /**
   */

  @DISPID(1611005961) //= 0x60060009. The runtime will prefer the VTID if present
  @VTID(34)
  void invertSecondOrientation();


  /**
   * <p>
   * Getter method for the COM property "Simplify"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005962) //= 0x6006000a. The runtime will prefer the VTID if present
  @VTID(35)
  boolean simplify();


  /**
   * <p>
   * Setter method for the COM property "Simplify"
   * </p>
   * @param oSimplify Mandatory boolean parameter.
   */

  @DISPID(1611005962) //= 0x6006000a. The runtime will prefer the VTID if present
  @VTID(36)
  void simplify(
    boolean oSimplify);


  /**
   * <p>
   * Getter method for the COM property "Support"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611005964) //= 0x6006000c. The runtime will prefer the VTID if present
  @VTID(37)
  Reference support();


  /**
   * <p>
   * Setter method for the COM property "Support"
   * </p>
   * @param oElem Mandatory Reference parameter.
   */

  @DISPID(1611005964) //= 0x6006000c. The runtime will prefer the VTID if present
  @VTID(38)
  void support(
    Reference oElem);


  /**
   * @param iElement Mandatory Reference parameter.
   */

  @DISPID(1611005966) //= 0x6006000e. The runtime will prefer the VTID if present
  @VTID(39)
  void addElementToKeep(
    Reference iElement);


  /**
   * @param iElement Mandatory Reference parameter.
   */

  @DISPID(1611005967) //= 0x6006000f. The runtime will prefer the VTID if present
  @VTID(40)
  void addElementToRemove(
    Reference iElement);


  /**
   * @param iRank Mandatory int parameter.
   * @return  Returns a value of type Reference
   */

  @DISPID(1611005968) //= 0x60060010. The runtime will prefer the VTID if present
  @VTID(41)
  Reference getKeptElem(
    int iRank);


  /**
   * @return  Returns a value of type int
   */

  @DISPID(1611005969) //= 0x60060011. The runtime will prefer the VTID if present
  @VTID(42)
  int getNbElementsToKeep();


  /**
   * @return  Returns a value of type int
   */

  @DISPID(1611005970) //= 0x60060012. The runtime will prefer the VTID if present
  @VTID(43)
  int getNbElementsToRemove();


  /**
   * @param iRank Mandatory int parameter.
   * @return  Returns a value of type Reference
   */

  @DISPID(1611005971) //= 0x60060013. The runtime will prefer the VTID if present
  @VTID(44)
  Reference getRemovedElem(
    int iRank);


  /**
   * @param iRank Mandatory int parameter.
   */

  @DISPID(1611005972) //= 0x60060014. The runtime will prefer the VTID if present
  @VTID(45)
  void removeElementToKeep(
    int iRank);


  /**
   * @param iRank Mandatory int parameter.
   */

  @DISPID(1611005973) //= 0x60060015. The runtime will prefer the VTID if present
  @VTID(46)
  void removeElementToRemove(
    int iRank);


  /**
   * <p>
   * Getter method for the COM property "AutomaticExtrapolationMode"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005974) //= 0x60060016. The runtime will prefer the VTID if present
  @VTID(47)
  boolean automaticExtrapolationMode();


  /**
   * <p>
   * Setter method for the COM property "AutomaticExtrapolationMode"
   * </p>
   * @param oMode Mandatory boolean parameter.
   */

  @DISPID(1611005974) //= 0x60060016. The runtime will prefer the VTID if present
  @VTID(48)
  void automaticExtrapolationMode(
    boolean oMode);


  /**
   * <p>
   * Getter method for the COM property "IntersectionComputation"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005976) //= 0x60060018. The runtime will prefer the VTID if present
  @VTID(49)
  boolean intersectionComputation();


  /**
   * <p>
   * Setter method for the COM property "IntersectionComputation"
   * </p>
   * @param oMode Mandatory boolean parameter.
   */

  @DISPID(1611005976) //= 0x60060018. The runtime will prefer the VTID if present
  @VTID(50)
  void intersectionComputation(
    boolean oMode);


  /**
   * @return  Returns a value of type int
   */

  @DISPID(1611005978) //= 0x6006001a. The runtime will prefer the VTID if present
  @VTID(51)
  int getNbElem();


  /**
   * @param iRank Mandatory int parameter.
   * @return  Returns a value of type Reference
   */

  @DISPID(1611005979) //= 0x6006001b. The runtime will prefer the VTID if present
  @VTID(52)
  Reference getElem(
    int iRank);


  /**
   * @param iRank Mandatory int parameter.
   * @param iElem Mandatory Reference parameter.
   */

  @DISPID(1611005980) //= 0x6006001c. The runtime will prefer the VTID if present
  @VTID(53)
  void setElem(
    int iRank,
    Reference iElem);


  /**
   * @param iRank Mandatory int parameter.
   * @return  Returns a value of type int
   */

  @DISPID(1611005981) //= 0x6006001d. The runtime will prefer the VTID if present
  @VTID(54)
  int getPreviousOrientation(
    int iRank);


  /**
   * @param iRank Mandatory int parameter.
   * @return  Returns a value of type int
   */

  @DISPID(1611005982) //= 0x6006001e. The runtime will prefer the VTID if present
  @VTID(55)
  int getNextOrientation(
    int iRank);


  /**
   * @param iRank Mandatory int parameter.
   * @param iOrientation Mandatory int parameter.
   */

  @DISPID(1611005983) //= 0x6006001f. The runtime will prefer the VTID if present
  @VTID(56)
  void setPreviousOrientation(
    int iRank,
    int iOrientation);


  /**
   * @param iRank Mandatory int parameter.
   * @param iOrientation Mandatory int parameter.
   */

  @DISPID(1611005984) //= 0x60060020. The runtime will prefer the VTID if present
  @VTID(57)
  void setNextOrientation(
    int iRank,
    int iOrientation);


  /**
   * <p>
   * Getter method for the COM property "Mode"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611005985) //= 0x60060021. The runtime will prefer the VTID if present
  @VTID(58)
  int mode();


  /**
   * <p>
   * Setter method for the COM property "Mode"
   * </p>
   * @param oMode Mandatory int parameter.
   */

  @DISPID(1611005985) //= 0x60060021. The runtime will prefer the VTID if present
  @VTID(59)
  void mode(
    int oMode);


  /**
   * @param iRank Mandatory int parameter.
   * @return  Returns a value of type int
   */

  @DISPID(1611005987) //= 0x60060023. The runtime will prefer the VTID if present
  @VTID(60)
  int getPortionToKeep(
    int iRank);


  /**
   * @param iRank Mandatory int parameter.
   * @param iPortionNumber Mandatory int parameter.
   */

  @DISPID(1611005988) //= 0x60060024. The runtime will prefer the VTID if present
  @VTID(61)
  void setPortionToKeep(
    int iRank,
    int iPortionNumber);


  /**
   * <p>
   * Getter method for the COM property "Connex"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005989) //= 0x60060025. The runtime will prefer the VTID if present
  @VTID(62)
  boolean connex();


  /**
   * <p>
   * Setter method for the COM property "Connex"
   * </p>
   * @param oMode Mandatory boolean parameter.
   */

  @DISPID(1611005989) //= 0x60060025. The runtime will prefer the VTID if present
  @VTID(63)
  void connex(
    boolean oMode);


  /**
   * <p>
   * Getter method for the COM property "Manifold"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005991) //= 0x60060027. The runtime will prefer the VTID if present
  @VTID(64)
  boolean manifold();


  /**
   * <p>
   * Setter method for the COM property "Manifold"
   * </p>
   * @param oMode Mandatory boolean parameter.
   */

  @DISPID(1611005991) //= 0x60060027. The runtime will prefer the VTID if present
  @VTID(65)
  void manifold(
    boolean oMode);


  // Properties:
}
