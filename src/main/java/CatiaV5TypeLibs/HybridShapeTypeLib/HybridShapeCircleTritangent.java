package CatiaV5TypeLibs.HybridShapeTypeLib;
import CatiaV5TypeLibs.InfTypeLib.*;
import CatiaV5TypeLibs.MecModTypeLib.*;
import CatiaV5TypeLibs.KnowledgewareTypeLib.*;

import com4j.*;

@IID("{8D7E9B7C-1D32-0000-0280-020E60000000}")
public interface HybridShapeCircleTritangent extends HybridShapeCircle {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Curve1"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611071488) //= 0x60070000. The runtime will prefer the VTID if present
  @VTID(38)
  Reference curve1();


  /**
   * <p>
   * Setter method for the COM property "Curve1"
   * </p>
   * @param oCrv Mandatory Reference parameter.
   */

  @DISPID(1611071488) //= 0x60070000. The runtime will prefer the VTID if present
  @VTID(39)
  void curve1(
    Reference oCrv);


  /**
   * <p>
   * Getter method for the COM property "Curve2"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611071490) //= 0x60070002. The runtime will prefer the VTID if present
  @VTID(40)
  Reference curve2();


  /**
   * <p>
   * Setter method for the COM property "Curve2"
   * </p>
   * @param oCrv Mandatory Reference parameter.
   */

  @DISPID(1611071490) //= 0x60070002. The runtime will prefer the VTID if present
  @VTID(41)
  void curve2(
    Reference oCrv);


  /**
   * <p>
   * Getter method for the COM property "Curve3"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611071492) //= 0x60070004. The runtime will prefer the VTID if present
  @VTID(42)
  Reference curve3();


  /**
   * <p>
   * Setter method for the COM property "Curve3"
   * </p>
   * @param oCrv Mandatory Reference parameter.
   */

  @DISPID(1611071492) //= 0x60070004. The runtime will prefer the VTID if present
  @VTID(43)
  void curve3(
    Reference oCrv);


  /**
   * <p>
   * Getter method for the COM property "Support"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611071494) //= 0x60070006. The runtime will prefer the VTID if present
  @VTID(44)
  Reference support();


  /**
   * <p>
   * Setter method for the COM property "Support"
   * </p>
   * @param oSupport Mandatory Reference parameter.
   */

  @DISPID(1611071494) //= 0x60070006. The runtime will prefer the VTID if present
  @VTID(45)
  void support(
    Reference oSupport);


  /**
   * <p>
   * Getter method for the COM property "Orientation1"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611071496) //= 0x60070008. The runtime will prefer the VTID if present
  @VTID(46)
  int orientation1();


  /**
   * <p>
   * Setter method for the COM property "Orientation1"
   * </p>
   * @param oOri Mandatory int parameter.
   */

  @DISPID(1611071496) //= 0x60070008. The runtime will prefer the VTID if present
  @VTID(47)
  void orientation1(
    int oOri);


  /**
   * <p>
   * Getter method for the COM property "Orientation2"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611071498) //= 0x6007000a. The runtime will prefer the VTID if present
  @VTID(48)
  int orientation2();


  /**
   * <p>
   * Setter method for the COM property "Orientation2"
   * </p>
   * @param oOri Mandatory int parameter.
   */

  @DISPID(1611071498) //= 0x6007000a. The runtime will prefer the VTID if present
  @VTID(49)
  void orientation2(
    int oOri);


  /**
   * <p>
   * Getter method for the COM property "Orientation3"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611071500) //= 0x6007000c. The runtime will prefer the VTID if present
  @VTID(50)
  int orientation3();


  /**
   * <p>
   * Setter method for the COM property "Orientation3"
   * </p>
   * @param oOri Mandatory int parameter.
   */

  @DISPID(1611071500) //= 0x6007000c. The runtime will prefer the VTID if present
  @VTID(51)
  void orientation3(
    int oOri);


  /**
   * <p>
   * Getter method for the COM property "DiscriminationIndex"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611071502) //= 0x6007000e. The runtime will prefer the VTID if present
  @VTID(52)
  int discriminationIndex();


  /**
   * <p>
   * Setter method for the COM property "DiscriminationIndex"
   * </p>
   * @param oDiscriminationIndex Mandatory int parameter.
   */

  @DISPID(1611071502) //= 0x6007000e. The runtime will prefer the VTID if present
  @VTID(53)
  void discriminationIndex(
    int oDiscriminationIndex);


  /**
   * <p>
   * Getter method for the COM property "BeginOfCircle"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611071504) //= 0x60070010. The runtime will prefer the VTID if present
  @VTID(54)
  int beginOfCircle();


  /**
   * <p>
   * Setter method for the COM property "BeginOfCircle"
   * </p>
   * @param oNumWireBegin Mandatory int parameter.
   */

  @DISPID(1611071504) //= 0x60070010. The runtime will prefer the VTID if present
  @VTID(55)
  void beginOfCircle(
    int oNumWireBegin);


  /**
   * <p>
   * Getter method for the COM property "TangentOrientation1"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611071506) //= 0x60070012. The runtime will prefer the VTID if present
  @VTID(56)
  int tangentOrientation1();


  /**
   * <p>
   * Setter method for the COM property "TangentOrientation1"
   * </p>
   * @param oOrientation Mandatory int parameter.
   */

  @DISPID(1611071506) //= 0x60070012. The runtime will prefer the VTID if present
  @VTID(57)
  void tangentOrientation1(
    int oOrientation);


  /**
   * <p>
   * Getter method for the COM property "TangentOrientation2"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611071508) //= 0x60070014. The runtime will prefer the VTID if present
  @VTID(58)
  int tangentOrientation2();


  /**
   * <p>
   * Setter method for the COM property "TangentOrientation2"
   * </p>
   * @param oOrientation Mandatory int parameter.
   */

  @DISPID(1611071508) //= 0x60070014. The runtime will prefer the VTID if present
  @VTID(59)
  void tangentOrientation2(
    int oOrientation);


  /**
   * <p>
   * Getter method for the COM property "TangentOrientation3"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611071510) //= 0x60070016. The runtime will prefer the VTID if present
  @VTID(60)
  int tangentOrientation3();


  /**
   * <p>
   * Setter method for the COM property "TangentOrientation3"
   * </p>
   * @param oOrientation Mandatory int parameter.
   */

  @DISPID(1611071510) //= 0x60070016. The runtime will prefer the VTID if present
  @VTID(61)
  void tangentOrientation3(
    int oOrientation);


  /**
   * <p>
   * Getter method for the COM property "TrimMode"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611071512) //= 0x60070018. The runtime will prefer the VTID if present
  @VTID(62)
  int trimMode();


  /**
   * <p>
   * Setter method for the COM property "TrimMode"
   * </p>
   * @param oTrim Mandatory int parameter.
   */

  @DISPID(1611071512) //= 0x60070018. The runtime will prefer the VTID if present
  @VTID(63)
  void trimMode(
    int oTrim);


  // Properties:
}
