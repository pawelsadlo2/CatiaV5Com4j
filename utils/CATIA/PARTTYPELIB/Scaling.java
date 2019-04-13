import com4j.*;

@IID("{F8897848-6647-11D1-A27F-0000F87546FD}")
public interface Scaling extends DressUpShape {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "ScalingReference"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611071488) //= 0x60070000. The runtime will prefer the VTID if present
  @VTID(22)
  Reference scalingReference();


  /**
   * <p>
   * Setter method for the COM property "ScalingReference"
   * </p>
   * @param oReferenceScalingSupport Mandatory Reference parameter.
   */

  @DISPID(1611071488) //= 0x60070000. The runtime will prefer the VTID if present
  @VTID(23)
  void scalingReference(
    Reference oReferenceScalingSupport);


  /**
   * <p>
   * Getter method for the COM property "Factor"
   * </p>
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.RealParam
   */

  @DISPID(1611071490) //= 0x60070002. The runtime will prefer the VTID if present
  @VTID(24)
  RealParam factor();


  // Properties:
}
