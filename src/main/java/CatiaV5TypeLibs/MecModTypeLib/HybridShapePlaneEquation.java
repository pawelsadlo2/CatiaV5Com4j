package CatiaV5TypeLibs.MecModTypeLib;
import CatiaV5TypeLibs.InfTypeLib.*;

import com4j.*;

@IID("{89D7661F-4ECE-0000-0280-020E60000000}")
public interface HybridShapePlaneEquation extends Plane {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "A"
   * </p>
   * @return  Returns a value of type RealParam
   */

  @DISPID(1611071488) //= 0x60070000. The runtime will prefer the VTID if present
  @VTID(35)
  RealParam a();


  /**
   * <p>
   * Getter method for the COM property "B"
   * </p>
   * @return  Returns a value of type RealParam
   */

  @DISPID(1611071489) //= 0x60070001. The runtime will prefer the VTID if present
  @VTID(36)
  RealParam b();


  /**
   * <p>
   * Getter method for the COM property "C"
   * </p>
   * @return  Returns a value of type RealParam
   */

  @DISPID(1611071490) //= 0x60070002. The runtime will prefer the VTID if present
  @VTID(37)
  RealParam c();


  /**
   * <p>
   * Getter method for the COM property "D"
   * </p>
   * @return  Returns a value of type Length
   */

  @DISPID(1611071491) //= 0x60070003. The runtime will prefer the VTID if present
  @VTID(38)
  Length d();


  /**
   * @return  Returns a value of type Reference
   */

  @DISPID(1611071492) //= 0x60070004. The runtime will prefer the VTID if present
  @VTID(39)
  Reference getReferencePoint();


  /**
   * @param iReferencePoint Mandatory Reference parameter.
   */

  @DISPID(1611071493) //= 0x60070005. The runtime will prefer the VTID if present
  @VTID(40)
  void setReferencePoint(
    Reference iReferencePoint);


  /**
   * <p>
   * Getter method for the COM property "RefAxisSystem"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611071494) //= 0x60070006. The runtime will prefer the VTID if present
  @VTID(41)
  Reference refAxisSystem();


  /**
   * <p>
   * Setter method for the COM property "RefAxisSystem"
   * </p>
   * @param oRefAxis Mandatory Reference parameter.
   */

  @DISPID(1611071494) //= 0x60070006. The runtime will prefer the VTID if present
  @VTID(42)
  void refAxisSystem(
    Reference oRefAxis);


  // Properties:
}
