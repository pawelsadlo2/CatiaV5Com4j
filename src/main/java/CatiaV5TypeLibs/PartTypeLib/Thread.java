package CatiaV5TypeLibs.PartTypeLib;
import CatiaV5TypeLibs.InfTypeLib.*;
import CatiaV5TypeLibs.MecModTypeLib.*;
import CatiaV5TypeLibs.KnowledgewareTypeLib.*;

import com4j.*;

@IID("{16AECA35-EDE2-11D4-9F0C-00508B1316F4}")
public interface Thread extends DressUpShape {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "LateralFaceElement"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611071488) //= 0x60070000. The runtime will prefer the VTID if present
  @VTID(22)
  Reference lateralFaceElement();


  /**
   * <p>
   * Setter method for the COM property "LateralFaceElement"
   * </p>
   * @param oLateralFaceElement Mandatory Reference parameter.
   */

  @DISPID(1611071488) //= 0x60070000. The runtime will prefer the VTID if present
  @VTID(23)
  void lateralFaceElement(
    Reference oLateralFaceElement);


  /**
   * <p>
   * Getter method for the COM property "LimitFaceElement"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611071490) //= 0x60070002. The runtime will prefer the VTID if present
  @VTID(24)
  Reference limitFaceElement();


  /**
   * <p>
   * Setter method for the COM property "LimitFaceElement"
   * </p>
   * @param oLimitFaceElement Mandatory Reference parameter.
   */

  @DISPID(1611071490) //= 0x60070002. The runtime will prefer the VTID if present
  @VTID(25)
  void limitFaceElement(
    Reference oLimitFaceElement);


  /**
   */

  @DISPID(1611071492) //= 0x60070004. The runtime will prefer the VTID if present
  @VTID(26)
  void reverseDirection();


  /**
   * <p>
   * Getter method for the COM property "Side"
   * </p>
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.CatThreadSide
   */

  @DISPID(1611071493) //= 0x60070005. The runtime will prefer the VTID if present
  @VTID(27)
  CatThreadSide side();


  /**
   * <p>
   * Setter method for the COM property "Side"
   * </p>
   * @param oThreadSide Mandatory CatiaV5TypeLibs.PartItfTypeLib.CatThreadSide parameter.
   */

  @DISPID(1611071493) //= 0x60070005. The runtime will prefer the VTID if present
  @VTID(28)
  void side(
    CatThreadSide oThreadSide);


  /**
   * <p>
   * Getter method for the COM property "Depth"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(1611071495) //= 0x60070007. The runtime will prefer the VTID if present
  @VTID(29)
  double depth();


  /**
   * <p>
   * Setter method for the COM property "Depth"
   * </p>
   * @param oDepth Mandatory double parameter.
   */

  @DISPID(1611071495) //= 0x60070007. The runtime will prefer the VTID if present
  @VTID(30)
  void depth(
    double oDepth);


  /**
   * <p>
   * Getter method for the COM property "Diameter"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(1611071497) //= 0x60070009. The runtime will prefer the VTID if present
  @VTID(31)
  double diameter();


  /**
   * <p>
   * Setter method for the COM property "Diameter"
   * </p>
   * @param oDiameter Mandatory double parameter.
   */

  @DISPID(1611071497) //= 0x60070009. The runtime will prefer the VTID if present
  @VTID(32)
  void diameter(
    double oDiameter);


  /**
   * <p>
   * Getter method for the COM property "Pitch"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(1611071499) //= 0x6007000b. The runtime will prefer the VTID if present
  @VTID(33)
  double pitch();


  /**
   * <p>
   * Setter method for the COM property "Pitch"
   * </p>
   * @param oPitch Mandatory double parameter.
   */

  @DISPID(1611071499) //= 0x6007000b. The runtime will prefer the VTID if present
  @VTID(34)
  void pitch(
    double oPitch);


  /**
   * <p>
   * Getter method for the COM property "ThreadDescription"
   * </p>
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.StrParam
   */

  @DISPID(1611071501) //= 0x6007000d. The runtime will prefer the VTID if present
  @VTID(35)
  StrParam threadDescription();


  /**
   * @param iStandardType Mandatory CatiaV5TypeLibs.PartItfTypeLib.CatThreadStandard parameter.
   */

  @DISPID(1611071502) //= 0x6007000e. The runtime will prefer the VTID if present
  @VTID(36)
  void createStandardThreadDesignTable(
    CatThreadStandard iStandardType);


  /**
   * @param iStandardName Mandatory Holder<java.lang.String> parameter.
   * @param iPath Mandatory Holder<java.lang.String> parameter.
   */

  @DISPID(1611071503) //= 0x6007000f. The runtime will prefer the VTID if present
  @VTID(37)
  void createUserStandardDesignTable(
    Holder<java.lang.String> iStandardName,
    Holder<java.lang.String> iPath);


  /**
   * @param iThreadPolarity Mandatory CatiaV5TypeLibs.PartItfTypeLib.CatThreadPolarity parameter.
   */

  @DISPID(1611071504) //= 0x60070010. The runtime will prefer the VTID if present
  @VTID(38)
  void setExplicitPolarity(
    CatThreadPolarity iThreadPolarity);


  // Properties:
}
