package CatiaV5TypeLibs.HybridShapeTypeLib;
import CatiaV5TypeLibs.InfTypeLib.*;
import CatiaV5TypeLibs.MecModTypeLib.*;
import CatiaV5TypeLibs.KnowledgewareTypeLib.*;

import com4j.*;

@IID("{89D765F5-B292-0000-0280-020E60000000}")
public interface HybridShapeLineBisecting extends Line {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Elem1"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611071488) //= 0x60070000. The runtime will prefer the VTID if present
  @VTID(32)
  Reference elem1();


  /**
   * <p>
   * Setter method for the COM property "Elem1"
   * </p>
   * @param oElem Mandatory Reference parameter.
   */

  @DISPID(1611071488) //= 0x60070000. The runtime will prefer the VTID if present
  @VTID(33)
  void elem1(
    Reference oElem);


  /**
   * <p>
   * Getter method for the COM property "Elem2"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611071490) //= 0x60070002. The runtime will prefer the VTID if present
  @VTID(34)
  Reference elem2();


  /**
   * <p>
   * Setter method for the COM property "Elem2"
   * </p>
   * @param oElem Mandatory Reference parameter.
   */

  @DISPID(1611071490) //= 0x60070002. The runtime will prefer the VTID if present
  @VTID(35)
  void elem2(
    Reference oElem);


  /**
   * <p>
   * Getter method for the COM property "RefPoint"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611071492) //= 0x60070004. The runtime will prefer the VTID if present
  @VTID(36)
  Reference refPoint();


  /**
   * <p>
   * Setter method for the COM property "RefPoint"
   * </p>
   * @param oElem Mandatory Reference parameter.
   */

  @DISPID(1611071492) //= 0x60070004. The runtime will prefer the VTID if present
  @VTID(37)
  void refPoint(
    Reference oElem);


  /**
   * <p>
   * Getter method for the COM property "Support"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611071494) //= 0x60070006. The runtime will prefer the VTID if present
  @VTID(38)
  Reference support();


  /**
   * <p>
   * Setter method for the COM property "Support"
   * </p>
   * @param oElem Mandatory Reference parameter.
   */

  @DISPID(1611071494) //= 0x60070006. The runtime will prefer the VTID if present
  @VTID(39)
  void support(
    Reference oElem);


  /**
   * <p>
   * Getter method for the COM property "BeginOffset"
   * </p>
   * @return  Returns a value of type Length
   */

  @DISPID(1611071496) //= 0x60070008. The runtime will prefer the VTID if present
  @VTID(40)
  Length beginOffset();


  /**
   * <p>
   * Getter method for the COM property "EndOffset"
   * </p>
   * @return  Returns a value of type Length
   */

  @DISPID(1611071497) //= 0x60070009. The runtime will prefer the VTID if present
  @VTID(41)
  Length endOffset();


  /**
   * <p>
   * Getter method for the COM property "Orientation"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611071498) //= 0x6007000a. The runtime will prefer the VTID if present
  @VTID(42)
  int orientation();


  /**
   * <p>
   * Setter method for the COM property "Orientation"
   * </p>
   * @param oOrientation Mandatory int parameter.
   */

  @DISPID(1611071498) //= 0x6007000a. The runtime will prefer the VTID if present
  @VTID(43)
  void orientation(
    int oOrientation);


  /**
   * <p>
   * Getter method for the COM property "SolutionType"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1611071500) //= 0x6007000c. The runtime will prefer the VTID if present
  @VTID(44)
  boolean solutionType();


  /**
   * <p>
   * Setter method for the COM property "SolutionType"
   * </p>
   * @param oSolutionType Mandatory boolean parameter.
   */

  @DISPID(1611071500) //= 0x6007000c. The runtime will prefer the VTID if present
  @VTID(45)
  void solutionType(
    boolean oSolutionType);


  /**
   * @return  Returns a value of type int
   */

  @DISPID(1611071502) //= 0x6007000e. The runtime will prefer the VTID if present
  @VTID(46)
  int getLengthType();


  /**
   * @param iType Mandatory int parameter.
   */

  @DISPID(1611071503) //= 0x6007000f. The runtime will prefer the VTID if present
  @VTID(47)
  void setLengthType(
    int iType);


  /**
   * @param iSym Mandatory boolean parameter.
   */

  @DISPID(1611071504) //= 0x60070010. The runtime will prefer the VTID if present
  @VTID(48)
  void setSymmetricalExtension(
    boolean iSym);


  /**
   * @return  Returns a value of type boolean
   */

  @DISPID(1611071505) //= 0x60070011. The runtime will prefer the VTID if present
  @VTID(49)
  boolean getSymmetricalExtension();


  // Properties:
}
