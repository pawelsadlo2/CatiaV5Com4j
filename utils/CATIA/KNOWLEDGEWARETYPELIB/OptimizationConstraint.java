import com4j.*;

@IID("{72E2B246-BA26-11D4-A38D-00D0B7AC63BE}")
public interface OptimizationConstraint extends Check {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Satisfaction"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1611202560) //= 0x60090000. The runtime will prefer the VTID if present
  @VTID(42)
  boolean satisfaction();


  /**
   * <p>
   * Getter method for the COM property "DistanceToSatisfaction"
   * </p>
   * @return  Returns a value of type RealParam
   */

  @DISPID(1611202561) //= 0x60090001. The runtime will prefer the VTID if present
  @VTID(43)
  RealParam distanceToSatisfaction();


  /**
   * <p>
   * Getter method for the COM property "Precision"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(1611202562) //= 0x60090002. The runtime will prefer the VTID if present
  @VTID(44)
  double precision();


  /**
   * <p>
   * Setter method for the COM property "Precision"
   * </p>
   * @param oPrecision Mandatory double parameter.
   */

  @DISPID(1611202562) //= 0x60090002. The runtime will prefer the VTID if present
  @VTID(45)
  void precision(
    double oPrecision);


  // Properties:
}
