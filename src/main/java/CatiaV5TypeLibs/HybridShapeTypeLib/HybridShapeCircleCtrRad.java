package CatiaV5TypeLibs.HybridShapeTypeLib;
import CatiaV5TypeLibs.InfTypeLib.*;
import CatiaV5TypeLibs.MecModTypeLib.*;
import CatiaV5TypeLibs.KnowledgewareTypeLib.*;

import com4j.*;

@IID("{8D7E9C46-6EB6-0000-0280-020E60000000}")
public interface HybridShapeCircleCtrRad extends HybridShapeCircle {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Center"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611071488) //= 0x60070000. The runtime will prefer the VTID if present
  @VTID(38)
  Reference center();


  /**
   * <p>
   * Setter method for the COM property "Center"
   * </p>
   * @param oPt Mandatory Reference parameter.
   */

  @DISPID(1611071488) //= 0x60070000. The runtime will prefer the VTID if present
  @VTID(39)
  void center(
    Reference oPt);


  /**
   * <p>
   * Getter method for the COM property "Support"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611071490) //= 0x60070002. The runtime will prefer the VTID if present
  @VTID(40)
  Reference support();


  /**
   * <p>
   * Setter method for the COM property "Support"
   * </p>
   * @param oSupport Mandatory Reference parameter.
   */

  @DISPID(1611071490) //= 0x60070002. The runtime will prefer the VTID if present
  @VTID(41)
  void support(
    Reference oSupport);


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
   * Getter method for the COM property "Radius"
   * </p>
   * @return  Returns a value of type Length
   */

  @DISPID(1611071494) //= 0x60070006. The runtime will prefer the VTID if present
  @VTID(44)
  Length radius();


  /**
   * <p>
   * Getter method for the COM property "Diameter"
   * </p>
   * @return  Returns a value of type Length
   */

  @DISPID(1611071495) //= 0x60070007. The runtime will prefer the VTID if present
  @VTID(45)
  Length diameter();


  /**
   * <p>
   * Getter method for the COM property "FirstDirection"
   * </p>
   * @return  Returns a value of type HybridShapeDirection
   */

  @DISPID(1611071496) //= 0x60070008. The runtime will prefer the VTID if present
  @VTID(46)
  HybridShapeDirection firstDirection();


  /**
   * <p>
   * Setter method for the COM property "FirstDirection"
   * </p>
   * @param elem Mandatory HybridShapeDirection parameter.
   */

  @DISPID(1611071496) //= 0x60070008. The runtime will prefer the VTID if present
  @VTID(47)
  void firstDirection(
    HybridShapeDirection elem);


  /**
   * @return  Returns a value of type boolean
   */

  @DISPID(1611071498) //= 0x6007000a. The runtime will prefer the VTID if present
  @VTID(48)
  boolean isGeodesic();


  /**
   */

  @DISPID(1611071499) //= 0x6007000b. The runtime will prefer the VTID if present
  @VTID(49)
  void setGeometryOnSupport();


  /**
   */

  @DISPID(1611071500) //= 0x6007000c. The runtime will prefer the VTID if present
  @VTID(50)
  void unsetGeometryOnSupport();


  /**
   * @param oDirX Mandatory Holder<Double> parameter.
   * @param oDirY Mandatory Holder<Double> parameter.
   * @param oDirZ Mandatory Holder<Double> parameter.
   */

  @DISPID(1611071501) //= 0x6007000d. The runtime will prefer the VTID if present
  @VTID(51)
  void getSecondDirection(
    Holder<Double> oDirX,
    Holder<Double> oDirY,
    Holder<Double> oDirZ);


  /**
   * @param iDirX Mandatory double parameter.
   * @param iDirY Mandatory double parameter.
   * @param iDirZ Mandatory double parameter.
   */

  @DISPID(1611071502) //= 0x6007000e. The runtime will prefer the VTID if present
  @VTID(52)
  void setSecondDirection(
    double iDirX,
    double iDirY,
    double iDirZ);


  // Properties:
}
