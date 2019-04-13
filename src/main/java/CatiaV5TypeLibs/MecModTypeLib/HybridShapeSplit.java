package CatiaV5TypeLibs.MecModTypeLib;
import CatiaV5TypeLibs.KnowledgewareTypeLib.*;
import CatiaV5TypeLibs.InfTypeLib.*;

import com4j.*;

@IID("{8C89B265-4A22-0000-0280-020E60000000}")
public interface HybridShapeSplit extends HybridShape {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "ElemToCut"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(25)
  Reference elemToCut();


  /**
   * <p>
   * Setter method for the COM property "ElemToCut"
   * </p>
   * @param oElem Mandatory Reference parameter.
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(26)
  void elemToCut(
    Reference oElem);


  /**
   * <p>
   * Getter method for the COM property "CuttingElem"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611005954) //= 0x60060002. The runtime will prefer the VTID if present
  @VTID(27)
  Reference cuttingElem();


  /**
   * <p>
   * Setter method for the COM property "CuttingElem"
   * </p>
   * @param oElem Mandatory Reference parameter.
   */

  @DISPID(1611005954) //= 0x60060002. The runtime will prefer the VTID if present
  @VTID(28)
  void cuttingElem(
    Reference oElem);


  /**
   * <p>
   * Getter method for the COM property "Orientation"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611005956) //= 0x60060004. The runtime will prefer the VTID if present
  @VTID(29)
  int orientation();


  /**
   * <p>
   * Setter method for the COM property "Orientation"
   * </p>
   * @param oOrientation Mandatory int parameter.
   */

  @DISPID(1611005956) //= 0x60060004. The runtime will prefer the VTID if present
  @VTID(30)
  void orientation(
    int oOrientation);


  /**
   */

  @DISPID(1611005958) //= 0x60060006. The runtime will prefer the VTID if present
  @VTID(31)
  void invertOrientation();


  /**
   * <p>
   * Getter method for the COM property "Support"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611005959) //= 0x60060007. The runtime will prefer the VTID if present
  @VTID(32)
  Reference support();


  /**
   * <p>
   * Setter method for the COM property "Support"
   * </p>
   * @param oElem Mandatory Reference parameter.
   */

  @DISPID(1611005959) //= 0x60060007. The runtime will prefer the VTID if present
  @VTID(33)
  void support(
    Reference oElem);


  /**
   * <p>
   * Getter method for the COM property "VolumeResult"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611005961) //= 0x60060009. The runtime will prefer the VTID if present
  @VTID(34)
  int volumeResult();


  /**
   * <p>
   * Setter method for the COM property "VolumeResult"
   * </p>
   * @param oType Mandatory int parameter.
   */

  @DISPID(1611005961) //= 0x60060009. The runtime will prefer the VTID if present
  @VTID(35)
  void volumeResult(
    int oType);


  /**
   * @param iElem Mandatory Reference parameter.
   * @param iOrientation Mandatory int parameter.
   */

  @DISPID(1611005963) //= 0x6006000b. The runtime will prefer the VTID if present
  @VTID(36)
  void addCuttingElem(
    Reference iElem,
    int iOrientation);


  /**
   * @param iElement Mandatory Reference parameter.
   */

  @DISPID(1611005964) //= 0x6006000c. The runtime will prefer the VTID if present
  @VTID(37)
  void addElementToKeep(
    Reference iElement);


  /**
   * @param iElement Mandatory Reference parameter.
   */

  @DISPID(1611005965) //= 0x6006000d. The runtime will prefer the VTID if present
  @VTID(38)
  void addElementToRemove(
    Reference iElement);


  /**
   * @param iRank Mandatory int parameter.
   * @return  Returns a value of type Reference
   */

  @DISPID(1611005966) //= 0x6006000e. The runtime will prefer the VTID if present
  @VTID(39)
  Reference getIntersection(
    int iRank);


  /**
   * @param iRank Mandatory int parameter.
   * @return  Returns a value of type Reference
   */

  @DISPID(1611005967) //= 0x6006000f. The runtime will prefer the VTID if present
  @VTID(40)
  Reference getKeptElem(
    int iRank);


  /**
   * @param iRank Mandatory int parameter.
   * @return  Returns a value of type Reference
   */

  @DISPID(1611005968) //= 0x60060010. The runtime will prefer the VTID if present
  @VTID(41)
  Reference getCuttingElem(
    int iRank);


  /**
   * @return  Returns a value of type int
   */

  @DISPID(1611005969) //= 0x60060011. The runtime will prefer the VTID if present
  @VTID(42)
  int getNbCuttingElem();


  /**
   * @return  Returns a value of type int
   */

  @DISPID(1611005970) //= 0x60060012. The runtime will prefer the VTID if present
  @VTID(43)
  int getNbElementsToKeep();


  /**
   * @return  Returns a value of type int
   */

  @DISPID(1611005971) //= 0x60060013. The runtime will prefer the VTID if present
  @VTID(44)
  int getNbElementsToRemove();


  /**
   * @return  Returns a value of type Reference
   */

  @DISPID(1611005972) //= 0x60060014. The runtime will prefer the VTID if present
  @VTID(45)
  Reference getOtherSide();


  /**
   * @param iRank Mandatory int parameter.
   * @return  Returns a value of type Reference
   */

  @DISPID(1611005973) //= 0x60060015. The runtime will prefer the VTID if present
  @VTID(46)
  Reference getRemovedElem(
    int iRank);


  /**
   * @param iElem Mandatory Reference parameter.
   */

  @DISPID(1611005974) //= 0x60060016. The runtime will prefer the VTID if present
  @VTID(47)
  void removeCuttingElem(
    Reference iElem);


  /**
   * @param iRank Mandatory int parameter.
   */

  @DISPID(1611005975) //= 0x60060017. The runtime will prefer the VTID if present
  @VTID(48)
  void removeElementToKeep(
    int iRank);


  /**
   * @param iRank Mandatory int parameter.
   */

  @DISPID(1611005976) //= 0x60060018. The runtime will prefer the VTID if present
  @VTID(49)
  void removeElementToRemove(
    int iRank);


  /**
   * @param iRank Mandatory int parameter.
   * @return  Returns a value of type int
   */

  @DISPID(1611005977) //= 0x60060019. The runtime will prefer the VTID if present
  @VTID(50)
  int getOrientation(
    int iRank);


  /**
   * @param iRank Mandatory int parameter.
   * @param iOrientation Mandatory int parameter.
   */

  @DISPID(1611005978) //= 0x6006001a. The runtime will prefer the VTID if present
  @VTID(51)
  void setOrientation(
    int iRank,
    int iOrientation);


  /**
   * <p>
   * Getter method for the COM property "AutomaticExtrapolationMode"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005979) //= 0x6006001b. The runtime will prefer the VTID if present
  @VTID(52)
  boolean automaticExtrapolationMode();


  /**
   * <p>
   * Setter method for the COM property "AutomaticExtrapolationMode"
   * </p>
   * @param oMode Mandatory boolean parameter.
   */

  @DISPID(1611005979) //= 0x6006001b. The runtime will prefer the VTID if present
  @VTID(53)
  void automaticExtrapolationMode(
    boolean oMode);


  /**
   * <p>
   * Getter method for the COM property "BothSidesMode"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005981) //= 0x6006001d. The runtime will prefer the VTID if present
  @VTID(54)
  boolean bothSidesMode();


  /**
   * <p>
   * Setter method for the COM property "BothSidesMode"
   * </p>
   * @param oMode Mandatory boolean parameter.
   */

  @DISPID(1611005981) //= 0x6006001d. The runtime will prefer the VTID if present
  @VTID(55)
  void bothSidesMode(
    boolean oMode);


  /**
   * <p>
   * Getter method for the COM property "IntersectionComputation"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005983) //= 0x6006001f. The runtime will prefer the VTID if present
  @VTID(56)
  boolean intersectionComputation();


  /**
   * <p>
   * Setter method for the COM property "IntersectionComputation"
   * </p>
   * @param oMode Mandatory boolean parameter.
   */

  @DISPID(1611005983) //= 0x6006001f. The runtime will prefer the VTID if present
  @VTID(57)
  void intersectionComputation(
    boolean oMode);


  // Properties:
}
