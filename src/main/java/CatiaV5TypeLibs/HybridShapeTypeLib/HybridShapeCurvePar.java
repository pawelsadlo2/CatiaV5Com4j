package CatiaV5TypeLibs.HybridShapeTypeLib;
import CatiaV5TypeLibs.InfTypeLib.*;
import CatiaV5TypeLibs.MecModTypeLib.*;
import CatiaV5TypeLibs.KnowledgewareTypeLib.*;

import com4j.*;

@IID("{8C91DAF8-48CC-0000-0280-020B5C000000}")
public interface HybridShapeCurvePar extends HybridShape {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Offset"
   * </p>
   * @return  Returns a value of type Length
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(25)
  Length offset();


  /**
   * <p>
   * Getter method for the COM property "Offset2"
   * </p>
   * @return  Returns a value of type Length
   */

  @DISPID(1611005953) //= 0x60060001. The runtime will prefer the VTID if present
  @VTID(26)
  Length offset2();


  /**
   * <p>
   * Getter method for the COM property "CurveOffseted"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611005954) //= 0x60060002. The runtime will prefer the VTID if present
  @VTID(27)
  Reference curveOffseted();


  /**
   * <p>
   * Setter method for the COM property "CurveOffseted"
   * </p>
   * @param oFaceToCurvePar Mandatory Reference parameter.
   */

  @DISPID(1611005954) //= 0x60060002. The runtime will prefer the VTID if present
  @VTID(28)
  void curveOffseted(
    Reference oFaceToCurvePar);


  /**
   * <p>
   * Getter method for the COM property "SmoothingType"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611005956) //= 0x60060004. The runtime will prefer the VTID if present
  @VTID(29)
  int smoothingType();


  /**
   * <p>
   * Setter method for the COM property "SmoothingType"
   * </p>
   * @param oType Mandatory int parameter.
   */

  @DISPID(1611005956) //= 0x60060004. The runtime will prefer the VTID if present
  @VTID(30)
  void smoothingType(
    int oType);


  /**
   * <p>
   * Getter method for the COM property "MaximumDeviationValue"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(1611005958) //= 0x60060006. The runtime will prefer the VTID if present
  @VTID(31)
  double maximumDeviationValue();


  /**
   * <p>
   * Setter method for the COM property "MaximumDeviationValue"
   * </p>
   * @param oDevValue Mandatory double parameter.
   */

  @DISPID(1611005958) //= 0x60060006. The runtime will prefer the VTID if present
  @VTID(32)
  void maximumDeviationValue(
    double oDevValue);


  /**
   * <p>
   * Getter method for the COM property "p3DSmoothing"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005960) //= 0x60060008. The runtime will prefer the VTID if present
  @VTID(33)
  boolean p3DSmoothing();


  /**
   * <p>
   * Setter method for the COM property "p3DSmoothing"
   * </p>
   * @param o3DSmoothing Mandatory boolean parameter.
   */

  @DISPID(1611005960) //= 0x60060008. The runtime will prefer the VTID if present
  @VTID(34)
  void p3DSmoothing(
    boolean o3DSmoothing);


  /**
   * <p>
   * Getter method for the COM property "PassingPoint"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611005962) //= 0x6006000a. The runtime will prefer the VTID if present
  @VTID(35)
  Reference passingPoint();


  /**
   * <p>
   * Setter method for the COM property "PassingPoint"
   * </p>
   * @param oPassingPoint Mandatory Reference parameter.
   */

  @DISPID(1611005962) //= 0x6006000a. The runtime will prefer the VTID if present
  @VTID(36)
  void passingPoint(
    Reference oPassingPoint);


  /**
   * <p>
   * Getter method for the COM property "KeepBothSides"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005964) //= 0x6006000c. The runtime will prefer the VTID if present
  @VTID(37)
  boolean keepBothSides();


  /**
   * <p>
   * Setter method for the COM property "KeepBothSides"
   * </p>
   * @param oKeepBothSides Mandatory boolean parameter.
   */

  @DISPID(1611005964) //= 0x6006000c. The runtime will prefer the VTID if present
  @VTID(38)
  void keepBothSides(
    boolean oKeepBothSides);


  /**
   * <p>
   * Getter method for the COM property "OtherSide"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611005966) //= 0x6006000e. The runtime will prefer the VTID if present
  @VTID(39)
  Reference otherSide();


  /**
   * <p>
   * Getter method for the COM property "Support"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611005967) //= 0x6006000f. The runtime will prefer the VTID if present
  @VTID(40)
  Reference support();


  /**
   * <p>
   * Setter method for the COM property "Support"
   * </p>
   * @param oElem Mandatory Reference parameter.
   */

  @DISPID(1611005967) //= 0x6006000f. The runtime will prefer the VTID if present
  @VTID(41)
  void support(
    Reference oElem);


  /**
   * <p>
   * Getter method for the COM property "Geodesic"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005969) //= 0x60060011. The runtime will prefer the VTID if present
  @VTID(42)
  boolean geodesic();


  /**
   * <p>
   * Setter method for the COM property "Geodesic"
   * </p>
   * @param oMode Mandatory boolean parameter.
   */

  @DISPID(1611005969) //= 0x60060011. The runtime will prefer the VTID if present
  @VTID(43)
  void geodesic(
    boolean oMode);


  /**
   * <p>
   * Getter method for the COM property "LawType"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611005971) //= 0x60060013. The runtime will prefer the VTID if present
  @VTID(44)
  int lawType();


  /**
   * <p>
   * Setter method for the COM property "LawType"
   * </p>
   * @param oLawType Mandatory int parameter.
   */

  @DISPID(1611005971) //= 0x60060013. The runtime will prefer the VTID if present
  @VTID(45)
  void lawType(
    int oLawType);


  /**
   * <p>
   * Getter method for the COM property "CurveParType"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611005973) //= 0x60060015. The runtime will prefer the VTID if present
  @VTID(46)
  int curveParType();


  /**
   * <p>
   * Setter method for the COM property "CurveParType"
   * </p>
   * @param oCurveParType Mandatory int parameter.
   */

  @DISPID(1611005973) //= 0x60060015. The runtime will prefer the VTID if present
  @VTID(47)
  void curveParType(
    int oCurveParType);


  /**
   * <p>
   * Getter method for the COM property "CurveParLaw"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611005975) //= 0x60060017. The runtime will prefer the VTID if present
  @VTID(48)
  Reference curveParLaw();


  /**
   * <p>
   * Setter method for the COM property "CurveParLaw"
   * </p>
   * @param oLaw Mandatory Reference parameter.
   */

  @DISPID(1611005975) //= 0x60060017. The runtime will prefer the VTID if present
  @VTID(49)
  void curveParLaw(
    Reference oLaw);


  /**
   * <p>
   * Getter method for the COM property "InvertMappingLaw"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005977) //= 0x60060019. The runtime will prefer the VTID if present
  @VTID(50)
  boolean invertMappingLaw();


  /**
   * <p>
   * Setter method for the COM property "InvertMappingLaw"
   * </p>
   * @param oInvert Mandatory boolean parameter.
   */

  @DISPID(1611005977) //= 0x60060019. The runtime will prefer the VTID if present
  @VTID(51)
  void invertMappingLaw(
    boolean oInvert);


  /**
   * <p>
   * Getter method for the COM property "InvertDirection"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005979) //= 0x6006001b. The runtime will prefer the VTID if present
  @VTID(52)
  boolean invertDirection();


  /**
   * <p>
   * Setter method for the COM property "InvertDirection"
   * </p>
   * @param oInvert Mandatory boolean parameter.
   */

  @DISPID(1611005979) //= 0x6006001b. The runtime will prefer the VTID if present
  @VTID(53)
  void invertDirection(
    boolean oInvert);


  /**
   * @param oNormal Mandatory java.lang.Object[] parameter.
   */

  @DISPID(1611005981) //= 0x6006001d. The runtime will prefer the VTID if present
  @VTID(54)
  void getPlaneNormal(
    java.lang.Object[] oNormal);


  /**
   * @param iNormal Mandatory java.lang.Object[] parameter.
   */

  @DISPID(1611005982) //= 0x6006001e. The runtime will prefer the VTID if present
  @VTID(55)
  void putPlaneNormal(
    java.lang.Object[] iNormal);


  // Properties:
}
