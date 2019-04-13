package CatiaV5TypeLibs.MecModTypeLib;
import CatiaV5TypeLibs.KnowledgewareTypeLib.*;

import CatiaV5TypeLibs.InfTypeLib.*;
import com4j.*;

@IID("{B403A94D-9242-4661-A5AA-61101E11E906}")
public interface HybridShapeIntegratedLaw extends HybridShape {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "PitchLawType"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(25)
  int pitchLawType();


  /**
   * <p>
   * Setter method for the COM property "PitchLawType"
   * </p>
   * @param oType Mandatory int parameter.
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(26)
  void pitchLawType(
    int oType);


  /**
   * <p>
   * Getter method for the COM property "InvertMappingLaw"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005954) //= 0x60060002. The runtime will prefer the VTID if present
  @VTID(27)
  boolean invertMappingLaw();


  /**
   * <p>
   * Setter method for the COM property "InvertMappingLaw"
   * </p>
   * @param oType Mandatory boolean parameter.
   */

  @DISPID(1611005954) //= 0x60060002. The runtime will prefer the VTID if present
  @VTID(28)
  void invertMappingLaw(
    boolean oType);


  /**
   * <p>
   * Getter method for the COM property "Spine"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611005956) //= 0x60060004. The runtime will prefer the VTID if present
  @VTID(29)
  Reference spine();


  /**
   * <p>
   * Setter method for the COM property "Spine"
   * </p>
   * @param oSpine Mandatory Reference parameter.
   */

  @DISPID(1611005956) //= 0x60060004. The runtime will prefer the VTID if present
  @VTID(30)
  void spine(
    Reference oSpine);


  /**
   * <p>
   * Getter method for the COM property "ImplicitLawInterpolationMode"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611005958) //= 0x60060006. The runtime will prefer the VTID if present
  @VTID(31)
  int implicitLawInterpolationMode();


  /**
   * <p>
   * Setter method for the COM property "ImplicitLawInterpolationMode"
   * </p>
   * @param oMode Mandatory int parameter.
   */

  @DISPID(1611005958) //= 0x60060006. The runtime will prefer the VTID if present
  @VTID(32)
  void implicitLawInterpolationMode(
    int oMode);


  /**
   * <p>
   * Getter method for the COM property "StartParam"
   * </p>
   * @return  Returns a value of type Length
   */

  @DISPID(1611005960) //= 0x60060008. The runtime will prefer the VTID if present
  @VTID(33)
  Length startParam();


  /**
   * @param iStartParam Mandatory int parameter.
   */

  @DISPID(1611005961) //= 0x60060009. The runtime will prefer the VTID if present
  @VTID(34)
  void setStartParam(
    int iStartParam);


  /**
   * <p>
   * Getter method for the COM property "EndParam"
   * </p>
   * @return  Returns a value of type Length
   */

  @DISPID(1611005962) //= 0x6006000a. The runtime will prefer the VTID if present
  @VTID(35)
  Length endParam();


  /**
   * @param iEndParam Mandatory int parameter.
   */

  @DISPID(1611005963) //= 0x6006000b. The runtime will prefer the VTID if present
  @VTID(36)
  void setEndParam(
    int iEndParam);


  /**
   * @param iPoint Mandatory Reference parameter.
   * @param iParam Mandatory int parameter.
   */

  @DISPID(1611005964) //= 0x6006000c. The runtime will prefer the VTID if present
  @VTID(37)
  void appendNewPointAndParam(
    Reference iPoint,
    int iParam);


  /**
   * @param iPoint Mandatory Reference parameter.
   */

  @DISPID(1611005965) //= 0x6006000d. The runtime will prefer the VTID if present
  @VTID(38)
  void removePointAndParam(
    Reference iPoint);


  /**
   */

  @DISPID(1611005966) //= 0x6006000e. The runtime will prefer the VTID if present
  @VTID(39)
  void removeAllPointsAndParams();


  /**
   * @param iPos Mandatory int parameter.
   * @param oPoint Mandatory Holder<Reference> parameter.
   * @param oParam Mandatory Holder<Reference> parameter.
   */

  @DISPID(1611005967) //= 0x6006000f. The runtime will prefer the VTID if present
  @VTID(40)
  void getPointAndParam(
    int iPos,
    Holder<Reference> oPoint,
    Holder<Reference> oParam);


  /**
   * @return  Returns a value of type int
   */

  @DISPID(1611005968) //= 0x60060010. The runtime will prefer the VTID if present
  @VTID(41)
  int getSize();


  /**
   * <p>
   * Getter method for the COM property "AdvancedLaw"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611005969) //= 0x60060011. The runtime will prefer the VTID if present
  @VTID(42)
  Reference advancedLaw();


  /**
   * <p>
   * Setter method for the COM property "AdvancedLaw"
   * </p>
   * @param oLaw Mandatory Reference parameter.
   */

  @DISPID(1611005969) //= 0x60060011. The runtime will prefer the VTID if present
  @VTID(43)
  void advancedLaw(
    Reference oLaw);


  // Properties:
}
