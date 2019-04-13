import com4j.*;

@IID("{F166C07E-0DB3-46DE-8762-62ADB7402BA3}")
public interface HybridShapeCircleCenterTangent extends HybridShapeCircle {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "CenterElem"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611071488) //= 0x60070000. The runtime will prefer the VTID if present
  @VTID(38)
  Reference centerElem();


  /**
   * <p>
   * Setter method for the COM property "CenterElem"
   * </p>
   * @param oCenterElem Mandatory Reference parameter.
   */

  @DISPID(1611071488) //= 0x60070000. The runtime will prefer the VTID if present
  @VTID(39)
  void centerElem(
    Reference oCenterElem);


  /**
   * <p>
   * Getter method for the COM property "TangentCurve"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611071490) //= 0x60070002. The runtime will prefer the VTID if present
  @VTID(40)
  Reference tangentCurve();


  /**
   * <p>
   * Setter method for the COM property "TangentCurve"
   * </p>
   * @param oTgtCrv Mandatory Reference parameter.
   */

  @DISPID(1611071490) //= 0x60070002. The runtime will prefer the VTID if present
  @VTID(41)
  void tangentCurve(
    Reference oTgtCrv);


  /**
   * <p>
   * Getter method for the COM property "Support"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611071492) //= 0x60070004. The runtime will prefer the VTID if present
  @VTID(42)
  Reference support();


  /**
   * <p>
   * Setter method for the COM property "Support"
   * </p>
   * @param oSupport Mandatory Reference parameter.
   */

  @DISPID(1611071492) //= 0x60070004. The runtime will prefer the VTID if present
  @VTID(43)
  void support(
    Reference oSupport);


  /**
   * <p>
   * Getter method for the COM property "Orientation1"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611071494) //= 0x60070006. The runtime will prefer the VTID if present
  @VTID(44)
  int orientation1();


  /**
   * <p>
   * Setter method for the COM property "Orientation1"
   * </p>
   * @param oOri Mandatory int parameter.
   */

  @DISPID(1611071494) //= 0x60070006. The runtime will prefer the VTID if present
  @VTID(45)
  void orientation1(
    int oOri);


  /**
   * <p>
   * Getter method for the COM property "Orientation2"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611071496) //= 0x60070008. The runtime will prefer the VTID if present
  @VTID(46)
  int orientation2();


  /**
   * <p>
   * Setter method for the COM property "Orientation2"
   * </p>
   * @param oOri Mandatory int parameter.
   */

  @DISPID(1611071496) //= 0x60070008. The runtime will prefer the VTID if present
  @VTID(47)
  void orientation2(
    int oOri);


  /**
   * <p>
   * Getter method for the COM property "DiameterMode"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1611071498) //= 0x6007000a. The runtime will prefer the VTID if present
  @VTID(48)
  boolean diameterMode();


  /**
   * <p>
   * Setter method for the COM property "DiameterMode"
   * </p>
   * @param oDiameterMode Mandatory boolean parameter.
   */

  @DISPID(1611071498) //= 0x6007000a. The runtime will prefer the VTID if present
  @VTID(49)
  void diameterMode(
    boolean oDiameterMode);


  /**
   * <p>
   * Getter method for the COM property "Radius"
   * </p>
   * @return  Returns a value of type Length
   */

  @DISPID(1611071500) //= 0x6007000c. The runtime will prefer the VTID if present
  @VTID(50)
  Length radius();


  /**
   * <p>
   * Getter method for the COM property "Diameter"
   * </p>
   * @return  Returns a value of type Length
   */

  @DISPID(1611071501) //= 0x6007000d. The runtime will prefer the VTID if present
  @VTID(51)
  Length diameter();


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


  // Properties:
}
