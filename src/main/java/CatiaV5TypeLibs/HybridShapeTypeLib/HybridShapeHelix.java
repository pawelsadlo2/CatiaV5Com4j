package CatiaV5TypeLibs.HybridShapeTypeLib;
import CatiaV5TypeLibs.InfTypeLib.*;
import CatiaV5TypeLibs.MecModTypeLib.*;
import CatiaV5TypeLibs.KnowledgewareTypeLib.*;

import com4j.*;

@IID("{281BCFF0-EAD9-11D3-84EF-0000863E1BCE}")
public interface HybridShapeHelix extends HybridShape {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Axis"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(25)
  Reference axis();


  /**
   * <p>
   * Setter method for the COM property "Axis"
   * </p>
   * @param oAxis Mandatory Reference parameter.
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(26)
  void axis(
    Reference oAxis);


  /**
   * <p>
   * Getter method for the COM property "InvertAxis"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005954) //= 0x60060002. The runtime will prefer the VTID if present
  @VTID(27)
  boolean invertAxis();


  /**
   * <p>
   * Setter method for the COM property "InvertAxis"
   * </p>
   * @param oInvert Mandatory boolean parameter.
   */

  @DISPID(1611005954) //= 0x60060002. The runtime will prefer the VTID if present
  @VTID(28)
  void invertAxis(
    boolean oInvert);


  /**
   * <p>
   * Getter method for the COM property "StartingPoint"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611005956) //= 0x60060004. The runtime will prefer the VTID if present
  @VTID(29)
  Reference startingPoint();


  /**
   * <p>
   * Setter method for the COM property "StartingPoint"
   * </p>
   * @param oStPt Mandatory Reference parameter.
   */

  @DISPID(1611005956) //= 0x60060004. The runtime will prefer the VTID if present
  @VTID(30)
  void startingPoint(
    Reference oStPt);


  /**
   * <p>
   * Getter method for the COM property "Pitch"
   * </p>
   * @return  Returns a value of type Length
   */

  @DISPID(1611005958) //= 0x60060006. The runtime will prefer the VTID if present
  @VTID(31)
  Length pitch();


  /**
   * <p>
   * Getter method for the COM property "Height"
   * </p>
   * @return  Returns a value of type Length
   */

  @DISPID(1611005959) //= 0x60060007. The runtime will prefer the VTID if present
  @VTID(32)
  Length height();


  /**
   * <p>
   * Getter method for the COM property "RevolNumber"
   * </p>
   * @return  Returns a value of type RealParam
   */

  @DISPID(1611005960) //= 0x60060008. The runtime will prefer the VTID if present
  @VTID(33)
  RealParam revolNumber();


  /**
   * <p>
   * Getter method for the COM property "ClockwiseRevolution"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005961) //= 0x60060009. The runtime will prefer the VTID if present
  @VTID(34)
  boolean clockwiseRevolution();


  /**
   * <p>
   * Setter method for the COM property "ClockwiseRevolution"
   * </p>
   * @param oClockwiseRevolution Mandatory boolean parameter.
   */

  @DISPID(1611005961) //= 0x60060009. The runtime will prefer the VTID if present
  @VTID(35)
  void clockwiseRevolution(
    boolean oClockwiseRevolution);


  /**
   * <p>
   * Getter method for the COM property "StartingAngle"
   * </p>
   * @return  Returns a value of type Angle
   */

  @DISPID(1611005963) //= 0x6006000b. The runtime will prefer the VTID if present
  @VTID(36)
  Angle startingAngle();


  /**
   * <p>
   * Getter method for the COM property "TaperAngle"
   * </p>
   * @return  Returns a value of type Angle
   */

  @DISPID(1611005964) //= 0x6006000c. The runtime will prefer the VTID if present
  @VTID(37)
  Angle taperAngle();


  /**
   * <p>
   * Getter method for the COM property "TaperOutward"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005965) //= 0x6006000d. The runtime will prefer the VTID if present
  @VTID(38)
  boolean taperOutward();


  /**
   * <p>
   * Setter method for the COM property "TaperOutward"
   * </p>
   * @param oTaperOutward Mandatory boolean parameter.
   */

  @DISPID(1611005965) //= 0x6006000d. The runtime will prefer the VTID if present
  @VTID(39)
  void taperOutward(
    boolean oTaperOutward);


  /**
   * @param iTaperAngle Mandatory double parameter.
   */

  @DISPID(1611005967) //= 0x6006000f. The runtime will prefer the VTID if present
  @VTID(40)
  void setTaperAngle(
    double iTaperAngle);


  /**
   * @param iStartingAngle Mandatory double parameter.
   */

  @DISPID(1611005968) //= 0x60060010. The runtime will prefer the VTID if present
  @VTID(41)
  void setStartingAngle(
    double iStartingAngle);


  /**
   * @param iHeight Mandatory double parameter.
   */

  @DISPID(1611005969) //= 0x60060011. The runtime will prefer the VTID if present
  @VTID(42)
  void setHeight(
    double iHeight);


  /**
   * @param iPitch Mandatory double parameter.
   */

  @DISPID(1611005970) //= 0x60060012. The runtime will prefer the VTID if present
  @VTID(43)
  void setPitch(
    double iPitch);


  /**
   * <p>
   * Getter method for the COM property "Profile"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611005971) //= 0x60060013. The runtime will prefer the VTID if present
  @VTID(44)
  Reference profile();


  /**
   * <p>
   * Setter method for the COM property "Profile"
   * </p>
   * @param oProfile Mandatory Reference parameter.
   */

  @DISPID(1611005971) //= 0x60060013. The runtime will prefer the VTID if present
  @VTID(45)
  void profile(
    Reference oProfile);


  /**
   * <p>
   * Getter method for the COM property "PitchLawType"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611005973) //= 0x60060015. The runtime will prefer the VTID if present
  @VTID(46)
  int pitchLawType();


  /**
   * <p>
   * Setter method for the COM property "PitchLawType"
   * </p>
   * @param oLawType Mandatory int parameter.
   */

  @DISPID(1611005973) //= 0x60060015. The runtime will prefer the VTID if present
  @VTID(47)
  void pitchLawType(
    int oLawType);


  /**
   * <p>
   * Getter method for the COM property "Pitch2"
   * </p>
   * @return  Returns a value of type Length
   */

  @DISPID(1611005975) //= 0x60060017. The runtime will prefer the VTID if present
  @VTID(48)
  Length pitch2();


  /**
   * @param iPitch2 Mandatory double parameter.
   */

  @DISPID(1611005976) //= 0x60060018. The runtime will prefer the VTID if present
  @VTID(49)
  void setPitch2(
    double iPitch2);


  /**
   * @param iNbRevol Mandatory double parameter.
   */

  @DISPID(1611005977) //= 0x60060019. The runtime will prefer the VTID if present
  @VTID(50)
  void setRevolutionNumber(
    double iNbRevol);


  // Properties:
}
