package CatiaV5TypeLibs.PartItfTypeLib;

import com4j.DISPID;
import com4j.IID;
import com4j.VTID;
import CatiaV5TypeLibs.InfItfTypeLib.*;

@IID("{322F5870-669C-11D1-A27F-0000F87546FD}")
public interface RectPattern extends Pattern {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "FirstDirectionRow"
   * </p>
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.IntParam
   */

  @DISPID(1611137024) //= 0x60080000. The runtime will prefer the VTID if present
  @VTID(27)
  IntParam firstDirectionRow();


  /**
   * <p>
   * Getter method for the COM property "SecondDirectionRow"
   * </p>
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.IntParam
   */

  @DISPID(1611137025) //= 0x60080001. The runtime will prefer the VTID if present
  @VTID(28)
  IntParam secondDirectionRow();


  /**
   * <p>
   * Getter method for the COM property "FirstOrientation"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1611137026) //= 0x60080002. The runtime will prefer the VTID if present
  @VTID(29)
  boolean firstOrientation();


  /**
   * <p>
   * Setter method for the COM property "FirstOrientation"
   * </p>
   * @param oIsAligned Mandatory boolean parameter.
   */

  @DISPID(1611137026) //= 0x60080002. The runtime will prefer the VTID if present
  @VTID(30)
  void firstOrientation(
    boolean oIsAligned);


  /**
   * <p>
   * Getter method for the COM property "SecondOrientation"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1611137028) //= 0x60080004. The runtime will prefer the VTID if present
  @VTID(31)
  boolean secondOrientation();


  /**
   * <p>
   * Setter method for the COM property "SecondOrientation"
   * </p>
   * @param oIsAligned Mandatory boolean parameter.
   */

  @DISPID(1611137028) //= 0x60080004. The runtime will prefer the VTID if present
  @VTID(32)
  void secondOrientation(
    boolean oIsAligned);


  /**
   * <p>
   * Getter method for the COM property "FirstDirectionRepartition"
   * </p>
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.LinearRepartition
   */

  @DISPID(1611137030) //= 0x60080006. The runtime will prefer the VTID if present
  @VTID(33)
  LinearRepartition firstDirectionRepartition();


  /**
   * <p>
   * Getter method for the COM property "SecondDirectionRepartition"
   * </p>
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.LinearRepartition
   */

  @DISPID(1611137031) //= 0x60080007. The runtime will prefer the VTID if present
  @VTID(34)
  LinearRepartition secondDirectionRepartition();


  /**
   * @param ioFirstDirection Mandatory java.lang.Object[] parameter.
   */

  @DISPID(1611137032) //= 0x60080008. The runtime will prefer the VTID if present
  @VTID(35)
  void getFirstDirection(
    java.lang.Object[] ioFirstDirection);


  /**
   * @param iFirstDirection Mandatory Reference parameter.
   */

  @DISPID(1611137033) //= 0x60080009. The runtime will prefer the VTID if present
  @VTID(36)
  void setFirstDirection(
    Reference iFirstDirection);


  /**
   * @param ioSecondDirection Mandatory java.lang.Object[] parameter.
   */

  @DISPID(1611137034) //= 0x6008000a. The runtime will prefer the VTID if present
  @VTID(37)
  void getSecondDirection(
    java.lang.Object[] ioSecondDirection);


  /**
   * @param iSecondDirection Mandatory Reference parameter.
   */

  @DISPID(1611137035) //= 0x6008000b. The runtime will prefer the VTID if present
  @VTID(38)
  void setSecondDirection(
    Reference iSecondDirection);


  /**
   * @param iInstanceNumber Mandatory int parameter.
   * @param iSpacing Mandatory double parameter.
   * @param iDirection Mandatory int parameter.
   */

  @DISPID(1611137036) //= 0x6008000c. The runtime will prefer the VTID if present
  @VTID(39)
  void setInstanceSpacing(
    int iInstanceNumber,
    double iSpacing,
    int iDirection);


  /**
   * @param iInstanceNumber Mandatory int parameter.
   * @param iDirection Mandatory int parameter.
   */

  @DISPID(1611137037) //= 0x6008000d. The runtime will prefer the VTID if present
  @VTID(40)
  void setUnequalInstanceNumber(
    int iInstanceNumber,
    int iDirection);


  /**
   * <p>
   * Getter method for the COM property "FirstRectangularPatternParameters"
   * </p>
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.CatRectangularPatternParameters
   */

  @DISPID(1611137038) //= 0x6008000e. The runtime will prefer the VTID if present
  @VTID(41)
  CatRectangularPatternParameters firstRectangularPatternParameters();


  /**
   * <p>
   * Setter method for the COM property "FirstRectangularPatternParameters"
   * </p>
   * @param oParameters Mandatory CatiaV5TypeLibs.PartItfTypeLib.CatRectangularPatternParameters parameter.
   */

  @DISPID(1611137038) //= 0x6008000e. The runtime will prefer the VTID if present
  @VTID(42)
  void firstRectangularPatternParameters(
    CatRectangularPatternParameters oParameters);


  /**
   * <p>
   * Getter method for the COM property "SecondRectangularPatternParameters"
   * </p>
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.CatRectangularPatternParameters
   */

  @DISPID(1611137040) //= 0x60080010. The runtime will prefer the VTID if present
  @VTID(43)
  CatRectangularPatternParameters secondRectangularPatternParameters();


  /**
   * <p>
   * Setter method for the COM property "SecondRectangularPatternParameters"
   * </p>
   * @param oParameters Mandatory CatiaV5TypeLibs.PartItfTypeLib.CatRectangularPatternParameters parameter.
   */

  @DISPID(1611137040) //= 0x60080010. The runtime will prefer the VTID if present
  @VTID(44)
  void secondRectangularPatternParameters(
    CatRectangularPatternParameters oParameters);


  // Properties:
}
