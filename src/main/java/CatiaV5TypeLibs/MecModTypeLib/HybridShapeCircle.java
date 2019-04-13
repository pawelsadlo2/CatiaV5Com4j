package CatiaV5TypeLibs.MecModTypeLib;
import CatiaV5TypeLibs.KnowledgewareTypeLib.*;
import CatiaV5TypeLibs.InfTypeLib.*;

import com4j.*;

@IID("{8CD8D302-EBEB-0000-0280-020E60000000}")
public interface HybridShapeCircle extends HybridShape {
  // Methods:
  /**
   * @return  Returns a value of type double
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(25)
  double getFreeRadius();


  /**
   * @param ioCenter Mandatory java.lang.Object[] parameter.
   */

  @DISPID(1611005953) //= 0x60060001. The runtime will prefer the VTID if present
  @VTID(26)
  void getFreeCenter(
    java.lang.Object[] ioCenter);


  /**
   * @param geodesic Mandatory boolean parameter.
   */

  @DISPID(1611005954) //= 0x60060002. The runtime will prefer the VTID if present
  @VTID(27)
  void setGeodesic(
    boolean geodesic);


  /**
   * @param iLimitation Mandatory int parameter.
   */

  @DISPID(1611005955) //= 0x60060003. The runtime will prefer the VTID if present
  @VTID(28)
  void setLimitation(
    int iLimitation);


  /**
   * <p>
   * Getter method for the COM property "StartAngle"
   * </p>
   * @return  Returns a value of type Angle
   */

  @DISPID(1611005956) //= 0x60060004. The runtime will prefer the VTID if present
  @VTID(29)
  Angle startAngle();


  /**
   * <p>
   * Getter method for the COM property "EndAngle"
   * </p>
   * @return  Returns a value of type Angle
   */

  @DISPID(1611005957) //= 0x60060005. The runtime will prefer the VTID if present
  @VTID(30)
  Angle endAngle();


  /**
   * <p>
   * Getter method for the COM property "AxisComputation"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005958) //= 0x60060006. The runtime will prefer the VTID if present
  @VTID(31)
  boolean axisComputation();


  /**
   * <p>
   * Setter method for the COM property "AxisComputation"
   * </p>
   * @param oAxisComputation Mandatory boolean parameter.
   */

  @DISPID(1611005958) //= 0x60060006. The runtime will prefer the VTID if present
  @VTID(32)
  void axisComputation(
    boolean oAxisComputation);


  /**
   * <p>
   * Getter method for the COM property "AxisDirection"
   * </p>
   * @return  Returns a value of type HybridShapeDirection
   */

  @DISPID(1611005960) //= 0x60060008. The runtime will prefer the VTID if present
  @VTID(33)
  HybridShapeDirection axisDirection();


  /**
   * <p>
   * Setter method for the COM property "AxisDirection"
   * </p>
   * @param oDir Mandatory HybridShapeDirection parameter.
   */

  @DISPID(1611005960) //= 0x60060008. The runtime will prefer the VTID if present
  @VTID(34)
  void axisDirection(
    HybridShapeDirection oDir);


  /**
   * @param iPosition Mandatory int parameter.
   * @return  Returns a value of type Reference
   */

  @DISPID(1611005962) //= 0x6006000a. The runtime will prefer the VTID if present
  @VTID(35)
  Reference getAxis(
    int iPosition);


  /**
   * @param oCenterX Mandatory Holder<Double> parameter.
   * @param oCenterY Mandatory Holder<Double> parameter.
   * @param oCenterZ Mandatory Holder<Double> parameter.
   */

  @DISPID(1611005963) //= 0x6006000b. The runtime will prefer the VTID if present
  @VTID(36)
  void getCenter(
    Holder<Double> oCenterX,
    Holder<Double> oCenterY,
    Holder<Double> oCenterZ);


  /**
   * @return  Returns a value of type int
   */

  @DISPID(1611005964) //= 0x6006000c. The runtime will prefer the VTID if present
  @VTID(37)
  int getLimitation();


  // Properties:
}
