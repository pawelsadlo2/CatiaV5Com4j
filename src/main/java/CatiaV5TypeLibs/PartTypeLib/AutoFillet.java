package CatiaV5TypeLibs.PartTypeLib;
import CatiaV5TypeLibs.InfTypeLib.*;
import CatiaV5TypeLibs.MecModTypeLib.*;
import CatiaV5TypeLibs.KnowledgewareTypeLib.*;

import com4j.*;

@IID("{AF328AAD-8CB0-45A6-A4EF-968D5B33B706}")
public interface AutoFillet extends DressUpShape {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "FilletRadius"
   * </p>
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.Length
   */

  @DISPID(1611071488) //= 0x60070000. The runtime will prefer the VTID if present
  @VTID(22)
  Length filletRadius();


  /**
   * <p>
   * Getter method for the COM property "RoundRadius"
   * </p>
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.Length
   */

  @DISPID(1611071489) //= 0x60070001. The runtime will prefer the VTID if present
  @VTID(23)
  Length roundRadius();


  /**
   * <p>
   * Getter method for the COM property "CurvatureRadius"
   * </p>
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.Length
   */

  @DISPID(1611071490) //= 0x60070002. The runtime will prefer the VTID if present
  @VTID(24)
  Length curvatureRadius();


  /**
   * <p>
   * Getter method for the COM property "FunctionalFaces"
   * </p>
   * @return  Returns a value of type References
   */

  @DISPID(1611071491) //= 0x60070003. The runtime will prefer the VTID if present
  @VTID(25)
  References functionalFaces();


  /**
   * <p>
   * Setter method for the COM property "FunctionalFace"
   * </p>
   * @param rhs Mandatory Reference parameter.
   */

  @DISPID(1611071492) //= 0x60070004. The runtime will prefer the VTID if present
  @VTID(26)
  void functionalFace(
    Reference rhs);


  /**
   * <p>
   * Getter method for the COM property "SliversAndCracks"
   * </p>
   * @return  Returns a value of type References
   */

  @DISPID(1611071493) //= 0x60070005. The runtime will prefer the VTID if present
  @VTID(27)
  References sliversAndCracks();


  /**
   * <p>
   * Setter method for the COM property "SliversAndCrack"
   * </p>
   * @param rhs Mandatory Reference parameter.
   */

  @DISPID(1611071494) //= 0x60070006. The runtime will prefer the VTID if present
  @VTID(28)
  void sliversAndCrack(
    Reference rhs);


  /**
   * <p>
   * Getter method for the COM property "PartingElement"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611071495) //= 0x60070007. The runtime will prefer the VTID if present
  @VTID(29)
  Reference partingElement();


  /**
   * <p>
   * Setter method for the COM property "PartingElement"
   * </p>
   * @param oPartingElement Mandatory Reference parameter.
   */

  @DISPID(1611071495) //= 0x60070007. The runtime will prefer the VTID if present
  @VTID(30)
  void partingElement(
    Reference oPartingElement);


  /**
   * <p>
   * Getter method for the COM property "FacesToFillet"
   * </p>
   * @return  Returns a value of type References
   */

  @DISPID(1611071497) //= 0x60070009. The runtime will prefer the VTID if present
  @VTID(31)
  References facesToFillet();


  /**
   * <p>
   * Setter method for the COM property "FacesToFillets"
   * </p>
   * @param rhs Mandatory Reference parameter.
   */

  @DISPID(1611071498) //= 0x6007000a. The runtime will prefer the VTID if present
  @VTID(32)
  void facesToFillets(
    Reference rhs);


  /**
   * <p>
   * Getter method for the COM property "RoundRadiusActivation"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1611071499) //= 0x6007000b. The runtime will prefer the VTID if present
  @VTID(33)
  boolean roundRadiusActivation();


  /**
   * <p>
   * Setter method for the COM property "RoundRadiusActivation"
   * </p>
   * @param oRoundRadActivation Mandatory boolean parameter.
   */

  @DISPID(1611071499) //= 0x6007000b. The runtime will prefer the VTID if present
  @VTID(34)
  void roundRadiusActivation(
    boolean oRoundRadActivation);


  /**
   * <p>
   * Getter method for the COM property "SupportSurface"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611071501) //= 0x6007000d. The runtime will prefer the VTID if present
  @VTID(35)
  Reference supportSurface();


  /**
   * <p>
   * Setter method for the COM property "SupportSurface"
   * </p>
   * @param oSupportSurface Mandatory Reference parameter.
   */

  @DISPID(1611071501) //= 0x6007000d. The runtime will prefer the VTID if present
  @VTID(36)
  void supportSurface(
    Reference oSupportSurface);


  // Properties:
}
