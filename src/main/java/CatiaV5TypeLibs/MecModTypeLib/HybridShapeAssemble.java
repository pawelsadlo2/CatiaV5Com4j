package CatiaV5TypeLibs.MecModTypeLib;
import CatiaV5TypeLibs.KnowledgewareTypeLib.*;
import CatiaV5TypeLibs.InfTypeLib.*;

import com4j.*;

@IID("{8CD8DBDC-65F4-0000-0280-020E60000000}")
public interface HybridShapeAssemble extends HybridShape {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Invert"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(25)
  boolean invert();


  /**
   * <p>
   * Setter method for the COM property "Invert"
   * </p>
   * @param oInvert Mandatory boolean parameter.
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(26)
  void invert(
    boolean oInvert);


  /**
   * @param iElement Mandatory Reference parameter.
   */

  @DISPID(1611005954) //= 0x60060002. The runtime will prefer the VTID if present
  @VTID(27)
  void addElement(
    Reference iElement);


  /**
   * @return  Returns a value of type int
   */

  @DISPID(1611005955) //= 0x60060003. The runtime will prefer the VTID if present
  @VTID(28)
  int getElementsSize();


  /**
   * @param iRank Mandatory int parameter.
   * @return  Returns a value of type Reference
   */

  @DISPID(1611005956) //= 0x60060004. The runtime will prefer the VTID if present
  @VTID(29)
  Reference getElement(
    int iRank);


  /**
   * @param iPos Mandatory int parameter.
   * @param iElement Mandatory Reference parameter.
   */

  @DISPID(1611005957) //= 0x60060005. The runtime will prefer the VTID if present
  @VTID(30)
  void replaceElement(
    int iPos,
    Reference iElement);


  /**
   * @param iRank Mandatory int parameter.
   */

  @DISPID(1611005958) //= 0x60060006. The runtime will prefer the VTID if present
  @VTID(31)
  void removeElement(
    int iRank);


  /**
   * @return  Returns a value of type double
   */

  @DISPID(1611005959) //= 0x60060007. The runtime will prefer the VTID if present
  @VTID(32)
  double getDeviation();


  /**
   * @param ideviation Mandatory double parameter.
   */

  @DISPID(1611005960) //= 0x60060008. The runtime will prefer the VTID if present
  @VTID(33)
  void setDeviation(
    double ideviation);


  /**
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005961) //= 0x60060009. The runtime will prefer the VTID if present
  @VTID(34)
  boolean getAngularToleranceMode();


  /**
   * @param iValue Mandatory boolean parameter.
   */

  @DISPID(1611005962) //= 0x6006000a. The runtime will prefer the VTID if present
  @VTID(35)
  void setAngularToleranceMode(
    boolean iValue);


  /**
   * @return  Returns a value of type double
   */

  @DISPID(1611005963) //= 0x6006000b. The runtime will prefer the VTID if present
  @VTID(36)
  double getAngularTolerance();


  /**
   * @param iValue Mandatory double parameter.
   */

  @DISPID(1611005964) //= 0x6006000c. The runtime will prefer the VTID if present
  @VTID(37)
  void setAngularTolerance(
    double iValue);


  /**
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005965) //= 0x6006000d. The runtime will prefer the VTID if present
  @VTID(38)
  boolean getConnex();


  /**
   * @param iConnex Mandatory boolean parameter.
   */

  @DISPID(1611005966) //= 0x6006000e. The runtime will prefer the VTID if present
  @VTID(39)
  void setConnex(
    boolean iConnex);


  /**
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005967) //= 0x6006000f. The runtime will prefer the VTID if present
  @VTID(40)
  boolean getManifold();


  /**
   * @param iManifold Mandatory boolean parameter.
   */

  @DISPID(1611005968) //= 0x60060010. The runtime will prefer the VTID if present
  @VTID(41)
  void setManifold(
    boolean iManifold);


  /**
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005969) //= 0x60060011. The runtime will prefer the VTID if present
  @VTID(42)
  boolean getTangencyContinuity();


  /**
   * @param iTangencyContinuity Mandatory boolean parameter.
   */

  @DISPID(1611005970) //= 0x60060012. The runtime will prefer the VTID if present
  @VTID(43)
  void setTangencyContinuity(
    boolean iTangencyContinuity);


  /**
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005971) //= 0x60060013. The runtime will prefer the VTID if present
  @VTID(44)
  boolean getSimplify();


  /**
   * @param iSimplify Mandatory boolean parameter.
   */

  @DISPID(1611005972) //= 0x60060014. The runtime will prefer the VTID if present
  @VTID(45)
  void setSimplify(
    boolean iSimplify);


  /**
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005973) //= 0x60060015. The runtime will prefer the VTID if present
  @VTID(46)
  boolean getSuppressMode();


  /**
   * @param iSuppressMode Mandatory boolean parameter.
   */

  @DISPID(1611005974) //= 0x60060016. The runtime will prefer the VTID if present
  @VTID(47)
  void setSuppressMode(
    boolean iSuppressMode);


  /**
   * @return  Returns a value of type int
   */

  @DISPID(1611005975) //= 0x60060017. The runtime will prefer the VTID if present
  @VTID(48)
  int getFederationPropagation();


  /**
   * @param iMode Mandatory int parameter.
   */

  @DISPID(1611005976) //= 0x60060018. The runtime will prefer the VTID if present
  @VTID(49)
  void setFederationPropagation(
    int iMode);


  /**
   * @param iRank Mandatory int parameter.
   * @return  Returns a value of type Reference
   */

  @DISPID(1611005977) //= 0x60060019. The runtime will prefer the VTID if present
  @VTID(50)
  Reference getFederatedElement(
    int iRank);


  /**
   * @return  Returns a value of type int
   */

  @DISPID(1611005978) //= 0x6006001a. The runtime will prefer the VTID if present
  @VTID(51)
  int getFederatedElementsSize();


  /**
   * @param iElement Mandatory Reference parameter.
   */

  @DISPID(1611005979) //= 0x6006001b. The runtime will prefer the VTID if present
  @VTID(52)
  void appendFederatedElement(
    Reference iElement);


  /**
   * @param iRank Mandatory int parameter.
   */

  @DISPID(1611005980) //= 0x6006001c. The runtime will prefer the VTID if present
  @VTID(53)
  void removeFederatedElement(
    int iRank);


  /**
   * @param iSubElement Mandatory Reference parameter.
   */

  @DISPID(1611005981) //= 0x6006001d. The runtime will prefer the VTID if present
  @VTID(54)
  void addSubElement(
    Reference iSubElement);


  /**
   * @return  Returns a value of type int
   */

  @DISPID(1611005982) //= 0x6006001e. The runtime will prefer the VTID if present
  @VTID(55)
  int getSubElementsSize();


  /**
   * @param iRank Mandatory int parameter.
   * @return  Returns a value of type Reference
   */

  @DISPID(1611005983) //= 0x6006001f. The runtime will prefer the VTID if present
  @VTID(56)
  Reference getSubElement(
    int iRank);


  /**
   * @param iRank Mandatory int parameter.
   */

  @DISPID(1611005984) //= 0x60060020. The runtime will prefer the VTID if present
  @VTID(57)
  void removeSubElement(
    int iRank);


  // Properties:
}
