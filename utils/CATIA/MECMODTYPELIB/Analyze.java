import com4j.*;

@IID("{1AAB6ED4-BA82-11D1-A5E7-00A0C95AF74C}")
public interface Analyze extends AnyObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Mass"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(1610940416) //= 0x60050000. The runtime will prefer the VTID if present
  @VTID(22)
  double mass();


  /**
   * <p>
   * Getter method for the COM property "Volume"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(1610940417) //= 0x60050001. The runtime will prefer the VTID if present
  @VTID(23)
  double volume();


  /**
   * <p>
   * Getter method for the COM property "WetArea"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(1610940418) //= 0x60050002. The runtime will prefer the VTID if present
  @VTID(24)
  double wetArea();


  /**
   * @param oGravityCenterCoordinatesArray Mandatory java.lang.Object[] parameter.
   */

  @DISPID(1610940419) //= 0x60050003. The runtime will prefer the VTID if present
  @VTID(25)
  void getGravityCenter(
    java.lang.Object[] oGravityCenterCoordinatesArray);


  /**
   * @param oInertiaMatrixArray Mandatory java.lang.Object[] parameter.
   */

  @DISPID(1610940420) //= 0x60050004. The runtime will prefer the VTID if present
  @VTID(26)
  void getInertia(
    java.lang.Object[] oInertiaMatrixArray);


  // Properties:
}
