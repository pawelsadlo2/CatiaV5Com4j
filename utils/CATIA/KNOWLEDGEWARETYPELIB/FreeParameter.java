import com4j.*;

@IID("{72E2B248-BA26-11D4-A38D-00D0B7AC63BE}")
public interface FreeParameter extends AnyObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Parameter"
   * </p>
   * @return  Returns a value of type RealParam
   */

  @DISPID(1610940416) //= 0x60050000. The runtime will prefer the VTID if present
  @VTID(22)
  RealParam parameter();


  /**
   * <p>
   * Setter method for the COM property "Parameter"
   * </p>
   * @param oParameter Mandatory RealParam parameter.
   */

  @DISPID(1610940416) //= 0x60050000. The runtime will prefer the VTID if present
  @VTID(23)
  void parameter(
    RealParam oParameter);


  /**
   * <p>
   * Getter method for the COM property "InfRange"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(1610940418) //= 0x60050002. The runtime will prefer the VTID if present
  @VTID(24)
  double infRange();


  /**
   * <p>
   * Setter method for the COM property "InfRange"
   * </p>
   * @param oInfRange Mandatory double parameter.
   */

  @DISPID(1610940418) //= 0x60050002. The runtime will prefer the VTID if present
  @VTID(25)
  void infRange(
    double oInfRange);


  /**
   * <p>
   * Getter method for the COM property "SupRange"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(1610940420) //= 0x60050004. The runtime will prefer the VTID if present
  @VTID(26)
  double supRange();


  /**
   * <p>
   * Setter method for the COM property "SupRange"
   * </p>
   * @param oSupRange Mandatory double parameter.
   */

  @DISPID(1610940420) //= 0x60050004. The runtime will prefer the VTID if present
  @VTID(27)
  void supRange(
    double oSupRange);


  /**
   * <p>
   * Getter method for the COM property "Step"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(1610940422) //= 0x60050006. The runtime will prefer the VTID if present
  @VTID(28)
  double step();


  /**
   * <p>
   * Setter method for the COM property "Step"
   * </p>
   * @param oStep Mandatory double parameter.
   */

  @DISPID(1610940422) //= 0x60050006. The runtime will prefer the VTID if present
  @VTID(29)
  void step(
    double oStep);


  // Properties:
}
