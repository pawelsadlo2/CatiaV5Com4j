import CatiaV5TypeLibs.InfTypeLib.*;
import com4j.*;

@IID("{80EC7432-4CB8-0000-0280-030BA6000000}")
public interface ControlPoint2D extends Point2D {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Curvature"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(1611137024) //= 0x60080000. The runtime will prefer the VTID if present
  @VTID(29)
  double curvature();


  /**
   * <p>
   * Setter method for the COM property "Curvature"
   * </p>
   * @param oCurvature Mandatory double parameter.
   */

  @DISPID(1611137024) //= 0x60080000. The runtime will prefer the VTID if present
  @VTID(30)
  void curvature(
    double oCurvature);


  /**
   * @param iTangentX Mandatory double parameter.
   * @param iTangentY Mandatory double parameter.
   */

  @DISPID(1611137026) //= 0x60080002. The runtime will prefer the VTID if present
  @VTID(31)
  void setTangent(
    double iTangentX,
    double iTangentY);


  /**
   */

  @DISPID(1611137027) //= 0x60080003. The runtime will prefer the VTID if present
  @VTID(32)
  void unsetTangent();


  /**
   */

  @DISPID(1611137028) //= 0x60080004. The runtime will prefer the VTID if present
  @VTID(33)
  void unsetCurvature();


  /**
   * @param oTangent Mandatory java.lang.Object[] parameter.
   */

  @DISPID(1611137029) //= 0x60080005. The runtime will prefer the VTID if present
  @VTID(34)
  void getTangent(
    java.lang.Object[] oTangent);


  // Properties:
}
