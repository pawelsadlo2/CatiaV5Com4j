package CatiaV5TypeLibs.PartItfTypeLib;

import com4j.DISPID;
import com4j.IID;
import com4j.VTID;
import CatiaV5TypeLibs.InfItfTypeLib.*;

@IID("{9C5E3F56-5C2C-11D1-A275-0000F87546FD}")
public interface Stiffener extends SketchBasedShape {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "CatiaV5TypeLibs.PartItfTypeLib.Thickness"
   * </p>
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.Length
   */

  @DISPID(1611071488) //= 0x60070000. The runtime will prefer the VTID if present
  @VTID(24)
  Length thickness();


  /**
   * <p>
   * Getter method for the COM property "ThicknessFromTop"
   * </p>
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.Length
   */

  @DISPID(1611071489) //= 0x60070001. The runtime will prefer the VTID if present
  @VTID(25)
  Length thicknessFromTop();


  /**
   * <p>
   * Getter method for the COM property "IsFromTop"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1611071490) //= 0x60070002. The runtime will prefer the VTID if present
  @VTID(26)
  boolean isFromTop();


  /**
   * <p>
   * Setter method for the COM property "IsFromTop"
   * </p>
   * @param oIsFromTop Mandatory boolean parameter.
   */

  @DISPID(1611071490) //= 0x60070002. The runtime will prefer the VTID if present
  @VTID(27)
  void isFromTop(
    boolean oIsFromTop);


  /**
   * <p>
   * Getter method for the COM property "IsSymmetric"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1611071492) //= 0x60070004. The runtime will prefer the VTID if present
  @VTID(28)
  boolean isSymmetric();


  /**
   * <p>
   * Setter method for the COM property "IsSymmetric"
   * </p>
   * @param oIsSymmetric Mandatory boolean parameter.
   */

  @DISPID(1611071492) //= 0x60070004. The runtime will prefer the VTID if present
  @VTID(29)
  void isSymmetric(
    boolean oIsSymmetric);


  /**
   */

  @DISPID(1611071494) //= 0x60070006. The runtime will prefer the VTID if present
  @VTID(30)
  void reverseDepth();


  /**
   */

  @DISPID(1611071495) //= 0x60070007. The runtime will prefer the VTID if present
  @VTID(31)
  void reverseThickness();


  // Properties:
}
