import com4j.*;

@IID("{89B52F57-4465-0000-0280-020E60000000}")
public interface Plane extends HybridShape {
  // Methods:
  /**
   * @param oOrigin Mandatory java.lang.Object[] parameter.
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(25)
  void getOrigin(
    java.lang.Object[] oOrigin);


  /**
   * @param oFirstAxis Mandatory java.lang.Object[] parameter.
   */

  @DISPID(1611005953) //= 0x60060001. The runtime will prefer the VTID if present
  @VTID(26)
  void getFirstAxis(
    java.lang.Object[] oFirstAxis);


  /**
   * @param oSecondAxis Mandatory java.lang.Object[] parameter.
   */

  @DISPID(1611005954) //= 0x60060002. The runtime will prefer the VTID if present
  @VTID(27)
  void getSecondAxis(
    java.lang.Object[] oSecondAxis);


  /**
   * @param iOrigin Mandatory java.lang.Object[] parameter.
   */

  @DISPID(1611005955) //= 0x60060003. The runtime will prefer the VTID if present
  @VTID(28)
  void putOrigin(
    java.lang.Object[] iOrigin);


  /**
   * @param iFirstAxis Mandatory java.lang.Object[] parameter.
   */

  @DISPID(1611005956) //= 0x60060004. The runtime will prefer the VTID if present
  @VTID(29)
  void putFirstAxis(
    java.lang.Object[] iFirstAxis);


  /**
   * @param iSecondAxis Mandatory java.lang.Object[] parameter.
   */

  @DISPID(1611005957) //= 0x60060005. The runtime will prefer the VTID if present
  @VTID(30)
  void putSecondAxis(
    java.lang.Object[] iSecondAxis);


  /**
   * @param oX Mandatory Holder<Double> parameter.
   * @param oY Mandatory Holder<Double> parameter.
   * @param oZ Mandatory Holder<Double> parameter.
   */

  @DISPID(1611005958) //= 0x60060006. The runtime will prefer the VTID if present
  @VTID(31)
  void getPosition(
    Holder<Double> oX,
    Holder<Double> oY,
    Holder<Double> oZ);


  /**
   * @param iX Mandatory double parameter.
   * @param iY Mandatory double parameter.
   * @param iZ Mandatory double parameter.
   */

  @DISPID(1611005959) //= 0x60060007. The runtime will prefer the VTID if present
  @VTID(32)
  void setPosition(
    double iX,
    double iY,
    double iZ);


  /**
   */

  @DISPID(1611005960) //= 0x60060008. The runtime will prefer the VTID if present
  @VTID(33)
  void removePosition();


  /**
   * @return  Returns a value of type int
   */

  @DISPID(1611005961) //= 0x60060009. The runtime will prefer the VTID if present
  @VTID(34)
  int isARefPlane();


  // Properties:
}
