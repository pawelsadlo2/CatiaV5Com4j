import CatiaV5TypeLibs.InfTypeLib.*;
import com4j.*;

@IID("{339F6470-31F1-11D6-8066-0010B5D44AB2}")
public interface RectilinearTriDimFeatEdge extends TriDimFeatEdge {
  // Methods:
  /**
   * @param oOrigin Mandatory java.lang.Object[] parameter.
   */

  @DISPID(1611202560) //= 0x60090000. The runtime will prefer the VTID if present
  @VTID(24)
  void getOrigin(
    java.lang.Object[] oOrigin);


  /**
   * @param oDirection Mandatory java.lang.Object[] parameter.
   */

  @DISPID(1611202561) //= 0x60090001. The runtime will prefer the VTID if present
  @VTID(25)
  void getDirection(
    java.lang.Object[] oDirection);


  // Properties:
}
