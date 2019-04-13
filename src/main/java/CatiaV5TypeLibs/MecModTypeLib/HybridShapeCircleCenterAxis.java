package CatiaV5TypeLibs.MecModTypeLib;
import CatiaV5TypeLibs.KnowledgewareTypeLib.*;

import CatiaV5TypeLibs.InfTypeLib.*;
import com4j.*;

@IID("{1C9D9BBA-2EA2-4153-8FB3-9246ADA644F6}")
public interface HybridShapeCircleCenterAxis extends HybridShapeCircle {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Point"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611071488) //= 0x60070000. The runtime will prefer the VTID if present
  @VTID(38)
  Reference point();


  /**
   * <p>
   * Setter method for the COM property "Point"
   * </p>
   * @param oPt Mandatory Reference parameter.
   */

  @DISPID(1611071488) //= 0x60070000. The runtime will prefer the VTID if present
  @VTID(39)
  void point(
    Reference oPt);


  /**
   * <p>
   * Getter method for the COM property "Axis"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611071490) //= 0x60070002. The runtime will prefer the VTID if present
  @VTID(40)
  Reference axis();


  /**
   * <p>
   * Setter method for the COM property "Axis"
   * </p>
   * @param oAxis Mandatory Reference parameter.
   */

  @DISPID(1611071490) //= 0x60070002. The runtime will prefer the VTID if present
  @VTID(41)
  void axis(
    Reference oAxis);


  /**
   * <p>
   * Getter method for the COM property "DiameterMode"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1611071492) //= 0x60070004. The runtime will prefer the VTID if present
  @VTID(42)
  boolean diameterMode();


  /**
   * <p>
   * Setter method for the COM property "DiameterMode"
   * </p>
   * @param oDiameterMode Mandatory boolean parameter.
   */

  @DISPID(1611071492) //= 0x60070004. The runtime will prefer the VTID if present
  @VTID(43)
  void diameterMode(
    boolean oDiameterMode);


  /**
   * <p>
   * Getter method for the COM property "ProjectionMode"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1611071494) //= 0x60070006. The runtime will prefer the VTID if present
  @VTID(44)
  boolean projectionMode();


  /**
   * <p>
   * Setter method for the COM property "ProjectionMode"
   * </p>
   * @param oProjectionMode Mandatory boolean parameter.
   */

  @DISPID(1611071494) //= 0x60070006. The runtime will prefer the VTID if present
  @VTID(45)
  void projectionMode(
    boolean oProjectionMode);


  /**
   * <p>
   * Getter method for the COM property "Radius"
   * </p>
   * @return  Returns a value of type Length
   */

  @DISPID(1611071496) //= 0x60070008. The runtime will prefer the VTID if present
  @VTID(46)
  Length radius();


  /**
   * <p>
   * Getter method for the COM property "Diameter"
   * </p>
   * @return  Returns a value of type Length
   */

  @DISPID(1611071497) //= 0x60070009. The runtime will prefer the VTID if present
  @VTID(47)
  Length diameter();


  // Properties:
}
