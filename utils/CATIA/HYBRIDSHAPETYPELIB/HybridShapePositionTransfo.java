import com4j.*;

@IID("{8D01DDCD-5DFC-0000-0280-020E60000000}")
public interface HybridShapePositionTransfo extends HybridShape {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Mode"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(25)
  int mode();


  /**
   * <p>
   * Setter method for the COM property "Mode"
   * </p>
   * @param elem Mandatory int parameter.
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(26)
  void mode(
    int elem);


  /**
   * <p>
   * Getter method for the COM property "Profile"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611005954) //= 0x60060002. The runtime will prefer the VTID if present
  @VTID(27)
  Reference profile();


  /**
   * <p>
   * Setter method for the COM property "Profile"
   * </p>
   * @param elem Mandatory Reference parameter.
   */

  @DISPID(1611005954) //= 0x60060002. The runtime will prefer the VTID if present
  @VTID(28)
  void profile(
    Reference elem);


  /**
   * @param ii Mandatory int parameter.
   * @return  Returns a value of type Length
   */

  @DISPID(1611005956) //= 0x60060004. The runtime will prefer the VTID if present
  @VTID(29)
  Length getPosCoord(
    int ii);


  /**
   * @param ii Mandatory int parameter.
   * @return  Returns a value of type Angle
   */

  @DISPID(1611005957) //= 0x60060005. The runtime will prefer the VTID if present
  @VTID(30)
  Angle getPosAngle(
    int ii);


  /**
   * @param ii Mandatory int parameter.
   * @param iCoordinate Mandatory Length parameter.
   */

  @DISPID(1611005958) //= 0x60060006. The runtime will prefer the VTID if present
  @VTID(31)
  void setPosCoord(
    int ii,
    Length iCoordinate);


  /**
   * @param ii Mandatory int parameter.
   * @param iAngle Mandatory Angle parameter.
   */

  @DISPID(1611005959) //= 0x60060007. The runtime will prefer the VTID if present
  @VTID(32)
  void setPosAngle(
    int ii,
    Angle iAngle);


  /**
   * @param ii Mandatory int parameter.
   * @return  Returns a value of type int
   */

  @DISPID(1611005960) //= 0x60060008. The runtime will prefer the VTID if present
  @VTID(33)
  int getPosSwapAxes(
    int ii);


  /**
   * @param ii Mandatory int parameter.
   * @param iInversion Mandatory int parameter.
   */

  @DISPID(1611005961) //= 0x60060009. The runtime will prefer the VTID if present
  @VTID(34)
  void setPosSwapAxes(
    int ii,
    int iInversion);


  /**
   * @param ii Mandatory int parameter.
   * @return  Returns a value of type Reference
   */

  @DISPID(1611005962) //= 0x6006000a. The runtime will prefer the VTID if present
  @VTID(35)
  Reference getPosPoint(
    int ii);


  /**
   * @param ii Mandatory int parameter.
   * @param iElem Mandatory Reference parameter.
   */

  @DISPID(1611005963) //= 0x6006000b. The runtime will prefer the VTID if present
  @VTID(36)
  void setPosPoint(
    int ii,
    Reference iElem);


  /**
   * @param ii Mandatory int parameter.
   * @return  Returns a value of type HybridShapeDirection
   */

  @DISPID(1611005964) //= 0x6006000c. The runtime will prefer the VTID if present
  @VTID(37)
  HybridShapeDirection getPositionDirection(
    int ii);


  /**
   * @param ii Mandatory int parameter.
   * @param iElem Mandatory HybridShapeDirection parameter.
   */

  @DISPID(1611005965) //= 0x6006000d. The runtime will prefer the VTID if present
  @VTID(38)
  void setPositionDirection(
    int ii,
    HybridShapeDirection iElem);


  /**
   * @return  Returns a value of type int
   */

  @DISPID(1611005966) //= 0x6006000e. The runtime will prefer the VTID if present
  @VTID(39)
  int getNbPosAngle();


  /**
   * @return  Returns a value of type int
   */

  @DISPID(1611005967) //= 0x6006000f. The runtime will prefer the VTID if present
  @VTID(40)
  int getNbPosCoord();


  /**
   */

  @DISPID(1611005968) //= 0x60060010. The runtime will prefer the VTID if present
  @VTID(41)
  void removeAllPosAngle();


  /**
   */

  @DISPID(1611005969) //= 0x60060011. The runtime will prefer the VTID if present
  @VTID(42)
  void removeAllPosCoord();


  /**
   * <p>
   * Getter method for the COM property "InitialDirectionComputationMode"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611005970) //= 0x60060012. The runtime will prefer the VTID if present
  @VTID(43)
  int initialDirectionComputationMode();


  /**
   * <p>
   * Setter method for the COM property "InitialDirectionComputationMode"
   * </p>
   * @param oDirCompMode Mandatory int parameter.
   */

  @DISPID(1611005970) //= 0x60060012. The runtime will prefer the VTID if present
  @VTID(44)
  void initialDirectionComputationMode(
    int oDirCompMode);


  // Properties:
}
