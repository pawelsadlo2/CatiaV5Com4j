import CatiaV5TypeLibs.InfTypeLib.*;
import com4j.*;

@IID("{8C0F417A-B42C-0000-0280-020E70000000}")
public interface HybridShapeHealing extends HybridShape {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "NoOfBodiesToHeal"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(25)
  int noOfBodiesToHeal();


  /**
   * <p>
   * Getter method for the COM property "NoOfElementsToFreeze"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611005953) //= 0x60060001. The runtime will prefer the VTID if present
  @VTID(26)
  int noOfElementsToFreeze();


  /**
   * <p>
   * Getter method for the COM property "NoOfEdgesToKeepSharp"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611005954) //= 0x60060002. The runtime will prefer the VTID if present
  @VTID(27)
  int noOfEdgesToKeepSharp();


  /**
   * <p>
   * Setter method for the COM property "Continuity"
   * </p>
   * @param oContinuity Mandatory int parameter.
   */

  @DISPID(1611005955) //= 0x60060003. The runtime will prefer the VTID if present
  @VTID(28)
  void continuity(
    int oContinuity);


  /**
   * <p>
   * Getter method for the COM property "Continuity"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611005955) //= 0x60060003. The runtime will prefer the VTID if present
  @VTID(29)
  int continuity();


  /**
   * <p>
   * Setter method for the COM property "CanonicFreeMode"
   * </p>
   * @param oMode Mandatory int parameter.
   */

  @DISPID(1611005957) //= 0x60060005. The runtime will prefer the VTID if present
  @VTID(30)
  void canonicFreeMode(
    int oMode);


  /**
   * <p>
   * Getter method for the COM property "CanonicFreeMode"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611005957) //= 0x60060005. The runtime will prefer the VTID if present
  @VTID(31)
  int canonicFreeMode();


  /**
   * <p>
   * Getter method for the COM property "MergingDistance"
   * </p>
   * @return  Returns a value of type Length
   */

  @DISPID(1611005959) //= 0x60060007. The runtime will prefer the VTID if present
  @VTID(32)
  Length mergingDistance();


  /**
   * <p>
   * Getter method for the COM property "DistanceObjective"
   * </p>
   * @return  Returns a value of type Length
   */

  @DISPID(1611005960) //= 0x60060008. The runtime will prefer the VTID if present
  @VTID(33)
  Length distanceObjective();


  /**
   * <p>
   * Getter method for the COM property "TangencyAngle"
   * </p>
   * @return  Returns a value of type Angle
   */

  @DISPID(1611005961) //= 0x60060009. The runtime will prefer the VTID if present
  @VTID(34)
  Angle tangencyAngle();


  /**
   * <p>
   * Getter method for the COM property "TangencyObjective"
   * </p>
   * @return  Returns a value of type Length
   */

  @DISPID(1611005962) //= 0x6006000a. The runtime will prefer the VTID if present
  @VTID(35)
  Length tangencyObjective();


  /**
   * <p>
   * Getter method for the COM property "SharpnessAngle"
   * </p>
   * @return  Returns a value of type Angle
   */

  @DISPID(1611005963) //= 0x6006000b. The runtime will prefer the VTID if present
  @VTID(36)
  Angle sharpnessAngle();


  /**
   * @param iMergingDistance Mandatory double parameter.
   */

  @DISPID(1611005964) //= 0x6006000c. The runtime will prefer the VTID if present
  @VTID(37)
  void setMergingDistance(
    double iMergingDistance);


  /**
   * @param iDistanceObjective Mandatory double parameter.
   */

  @DISPID(1611005965) //= 0x6006000d. The runtime will prefer the VTID if present
  @VTID(38)
  void setDistanceObjective(
    double iDistanceObjective);


  /**
   * @param iTangencyAngle Mandatory double parameter.
   */

  @DISPID(1611005966) //= 0x6006000e. The runtime will prefer the VTID if present
  @VTID(39)
  void setTangencyAngle(
    double iTangencyAngle);


  /**
   * @param iTangencyObjective Mandatory double parameter.
   */

  @DISPID(1611005967) //= 0x6006000f. The runtime will prefer the VTID if present
  @VTID(40)
  void setTangencyObjective(
    double iTangencyObjective);


  /**
   * @param iBody Mandatory Reference parameter.
   */

  @DISPID(1611005968) //= 0x60060010. The runtime will prefer the VTID if present
  @VTID(41)
  void addBodyToHeal(
    Reference iBody);


  /**
   * @param iPosition Mandatory int parameter.
   * @return  Returns a value of type Reference
   */

  @DISPID(1611005969) //= 0x60060011. The runtime will prefer the VTID if present
  @VTID(42)
  Reference getBodyToHeal(
    int iPosition);


  /**
   * @param iPosition Mandatory int parameter.
   */

  @DISPID(1611005970) //= 0x60060012. The runtime will prefer the VTID if present
  @VTID(43)
  void removeBodyToHeal(
    int iPosition);


  /**
   * @param iElement Mandatory Reference parameter.
   */

  @DISPID(1611005971) //= 0x60060013. The runtime will prefer the VTID if present
  @VTID(44)
  void addElementsToFreeze(
    Reference iElement);


  /**
   * @param iPosition Mandatory int parameter.
   * @return  Returns a value of type Reference
   */

  @DISPID(1611005972) //= 0x60060014. The runtime will prefer the VTID if present
  @VTID(45)
  Reference getElementToFreeze(
    int iPosition);


  /**
   * @param iPosition Mandatory int parameter.
   */

  @DISPID(1611005973) //= 0x60060015. The runtime will prefer the VTID if present
  @VTID(46)
  void removeElementToFreeze(
    int iPosition);


  /**
   * @param iEdge Mandatory Reference parameter.
   */

  @DISPID(1611005974) //= 0x60060016. The runtime will prefer the VTID if present
  @VTID(47)
  void addEdgeToKeepSharp(
    Reference iEdge);


  /**
   * @param iPosition Mandatory int parameter.
   * @return  Returns a value of type Reference
   */

  @DISPID(1611005975) //= 0x60060017. The runtime will prefer the VTID if present
  @VTID(48)
  Reference getEdgeToKeepSharp(
    int iPosition);


  /**
   * @param iPosition Mandatory int parameter.
   */

  @DISPID(1611005976) //= 0x60060018. The runtime will prefer the VTID if present
  @VTID(49)
  void removeEdgeToKeepSharp(
    int iPosition);


  /**
   * @param iSharpnessAngle Mandatory double parameter.
   */

  @DISPID(1611005977) //= 0x60060019. The runtime will prefer the VTID if present
  @VTID(50)
  void setSharpnessAngle(
    double iSharpnessAngle);


  /**
   * @param iIndex Mandatory int parameter.
   * @param iNewHeal Mandatory Reference parameter.
   */

  @DISPID(1611005978) //= 0x6006001a. The runtime will prefer the VTID if present
  @VTID(51)
  void replaceToHealElement(
    int iIndex,
    Reference iNewHeal);


  // Properties:
}
