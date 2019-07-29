package CatiaV5TypeLibs.HybridShapeTypeLib;
import CatiaV5TypeLibs.InfTypeLib.*;
import CatiaV5TypeLibs.MecModTypeLib.*;

import com4j.*;

@IID("{B11D247F-BB0F-0000-0280-031551000000}")
public interface HybridShapeExtractMulti extends HybridShape {
  // Methods:
  /**
   * @param iPos Mandatory int parameter.
   * @return  Returns a value of type Reference
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(25)
  Reference getElement(
    int iPos);


  /**
   * @param iPos Mandatory int parameter.
   * @param iElem Mandatory Reference parameter.
   */

  @DISPID(1611005953) //= 0x60060001. The runtime will prefer the VTID if present
  @VTID(26)
  void setElement(
    int iPos,
    Reference iElem);


  /**
   * @param iPos Mandatory int parameter.
   * @return  Returns a value of type int
   */

  @DISPID(1611005954) //= 0x60060002. The runtime will prefer the VTID if present
  @VTID(27)
  int getPropagationType(
    int iPos);


  /**
   * @param iPos Mandatory int parameter.
   * @param iTypePropag Mandatory int parameter.
   */

  @DISPID(1611005955) //= 0x60060003. The runtime will prefer the VTID if present
  @VTID(28)
  void setPropagationType(
    int iPos,
    int iTypePropag);


  /**
   * @param iPos Mandatory int parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005956) //= 0x60060004. The runtime will prefer the VTID if present
  @VTID(29)
  boolean getComplementaryExtractMulti(
    int iPos);


  /**
   * @param iPos Mandatory int parameter.
   * @param iComplementaire Mandatory boolean parameter.
   */

  @DISPID(1611005957) //= 0x60060005. The runtime will prefer the VTID if present
  @VTID(30)
  void setComplementaryExtractMulti(
    int iPos,
    boolean iComplementaire);


  /**
   * @param iPos Mandatory int parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005958) //= 0x60060006. The runtime will prefer the VTID if present
  @VTID(31)
  boolean getIsFederated(
    int iPos);


  /**
   * @param iPos Mandatory int parameter.
   * @param iIsFederated Mandatory boolean parameter.
   */

  @DISPID(1611005959) //= 0x60060007. The runtime will prefer the VTID if present
  @VTID(32)
  void setIsFederated(
    int iPos,
    boolean iIsFederated);


  /**
   * @param iPos Mandatory int parameter.
   * @return  Returns a value of type double
   */

  @DISPID(1611005960) //= 0x60060008. The runtime will prefer the VTID if present
  @VTID(33)
  double getCurvatureThreshold(
    int iPos);


  /**
   * @param iPos Mandatory int parameter.
   * @param iCrvtreThsld Mandatory double parameter.
   */

  @DISPID(1611005961) //= 0x60060009. The runtime will prefer the VTID if present
  @VTID(34)
  void setCurvatureThreshold(
    int iPos,
    double iCrvtreThsld);


  /**
   * @param iPos Mandatory int parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005962) //= 0x6006000a. The runtime will prefer the VTID if present
  @VTID(35)
  boolean getCurvatureThresholdActivity(
    int iPos);


  /**
   * @param iPos Mandatory int parameter.
   * @param iCrvtreThsldActivity Mandatory boolean parameter.
   */

  @DISPID(1611005963) //= 0x6006000b. The runtime will prefer the VTID if present
  @VTID(36)
  void setCurvatureThresholdActivity(
    int iPos,
    boolean iCrvtreThsldActivity);


  /**
   * @return  Returns a value of type int
   */

  @DISPID(1611005964) //= 0x6006000c. The runtime will prefer the VTID if present
  @VTID(37)
  int getNbConstraints();


  /**
   * @param oListOfExtractedConstraints Mandatory java.lang.Object[] parameter.
   */

  @DISPID(1611005965) //= 0x6006000d. The runtime will prefer the VTID if present
  @VTID(38)
  void getListOfConstraints(
    java.lang.Object[] oListOfExtractedConstraints);


  /**
   * @param iConstraint Mandatory Reference parameter.
   * @param iType Mandatory int parameter.
   * @param iComplementaire Mandatory boolean parameter.
   * @param iIsFederated Mandatory boolean parameter.
   * @param iCrvtreThsld Mandatory double parameter.
   * @param iPos Mandatory int parameter.
   */

  @DISPID(1611005966) //= 0x6006000e. The runtime will prefer the VTID if present
  @VTID(39)
  void addConstraint(
    Reference iConstraint,
    int iType,
    boolean iComplementaire,
    boolean iIsFederated,
    double iCrvtreThsld,
    int iPos);


  /**
   * @param iConstraint Mandatory Reference parameter.
   * @param iType Mandatory int parameter.
   * @param iComplementaire Mandatory boolean parameter.
   * @param iIsFederated Mandatory boolean parameter.
   * @param iDistreThsld Mandatory double parameter.
   * @param iAngtreThsld Mandatory double parameter.
   * @param iCrvtreThsld Mandatory double parameter.
   * @param iPos Mandatory int parameter.
   */

  @DISPID(1611005967) //= 0x6006000f. The runtime will prefer the VTID if present
  @VTID(40)
  void addConstraintTolerant(
    Reference iConstraint,
    int iType,
    boolean iComplementaire,
    boolean iIsFederated,
    double iDistreThsld,
    double iAngtreThsld,
    double iCrvtreThsld,
    int iPos);


  /**
   * @param iExtractToReplace Mandatory Reference parameter.
   * @param iNewExtract Mandatory Reference parameter.
   * @param iPos Mandatory int parameter.
   */

  @DISPID(1611005968) //= 0x60060010. The runtime will prefer the VTID if present
  @VTID(41)
  void replaceElement(
    Reference iExtractToReplace,
    Reference iNewExtract,
    int iPos);


  /**
   * @param iPosition Mandatory int parameter.
   */

  @DISPID(1611005969) //= 0x60060011. The runtime will prefer the VTID if present
  @VTID(42)
  void removeElement(
    int iPosition);


  /**
   * @param iPos Mandatory int parameter.
   * @return  Returns a value of type double
   */

  @DISPID(1611005970) //= 0x60060012. The runtime will prefer the VTID if present
  @VTID(43)
  double getDistanceThreshold(
    int iPos);


  /**
   * @param iPos Mandatory int parameter.
   * @param iDistreThsld Mandatory double parameter.
   */

  @DISPID(1611005971) //= 0x60060013. The runtime will prefer the VTID if present
  @VTID(44)
  void setDistanceThreshold(
    int iPos,
    double iDistreThsld);


  /**
   * @param iPos Mandatory int parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005972) //= 0x60060014. The runtime will prefer the VTID if present
  @VTID(45)
  boolean getDistanceThresholdActivity(
    int iPos);


  /**
   * @param iPos Mandatory int parameter.
   * @param iDistreThsldActivity Mandatory boolean parameter.
   */

  @DISPID(1611005973) //= 0x60060015. The runtime will prefer the VTID if present
  @VTID(46)
  void setDistanceThresholdActivity(
    int iPos,
    boolean iDistreThsldActivity);


  /**
   * @param iPos Mandatory int parameter.
   * @return  Returns a value of type double
   */

  @DISPID(1611005974) //= 0x60060016. The runtime will prefer the VTID if present
  @VTID(47)
  double getAngularThreshold(
    int iPos);


  /**
   * @param iPos Mandatory int parameter.
   * @param iAngtreThsld Mandatory double parameter.
   */

  @DISPID(1611005975) //= 0x60060017. The runtime will prefer the VTID if present
  @VTID(48)
  void setAngularThreshold(
    int iPos,
    double iAngtreThsld);


  /**
   * @param iPos Mandatory int parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005976) //= 0x60060018. The runtime will prefer the VTID if present
  @VTID(49)
  boolean getAngularThresholdActivity(
    int iPos);


  /**
   * @param iPos Mandatory int parameter.
   * @param iAngtreThsldActivity Mandatory boolean parameter.
   */

  @DISPID(1611005977) //= 0x60060019. The runtime will prefer the VTID if present
  @VTID(50)
  void setAngularThresholdActivity(
    int iPos,
    boolean iAngtreThsldActivity);


  /**
   * @param iPos Mandatory int parameter.
   * @return  Returns a value of type Reference
   */

  @DISPID(1611005978) //= 0x6006001a. The runtime will prefer the VTID if present
  @VTID(51)
  Reference getSupport(
    int iPos);


  /**
   * @param iPos Mandatory int parameter.
   * @param iSupport Mandatory Reference parameter.
   */

  @DISPID(1611005979) //= 0x6006001b. The runtime will prefer the VTID if present
  @VTID(52)
  void setSupport(
    int iPos,
    Reference iSupport);


  // Properties:
}
