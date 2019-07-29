package CatiaV5TypeLibs.HybridShapeTypeLib;
import CatiaV5TypeLibs.InfTypeLib.*;
import CatiaV5TypeLibs.MecModTypeLib.*;

import com4j.*;

@IID("{97D3E643-DE62-0000-0206-040C4E000000}")
public interface HybridShapeWrapSurface extends HybridShape {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Surface"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(25)
  Reference surface();


  /**
   * <p>
   * Setter method for the COM property "Surface"
   * </p>
   * @param oSurface Mandatory Reference parameter.
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(26)
  void surface(
    Reference oSurface);


  /**
   * <p>
   * Getter method for the COM property "ReferenceSurface"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611005954) //= 0x60060002. The runtime will prefer the VTID if present
  @VTID(27)
  Reference referenceSurface();


  /**
   * <p>
   * Setter method for the COM property "ReferenceSurface"
   * </p>
   * @param oReferenceSurface Mandatory Reference parameter.
   */

  @DISPID(1611005954) //= 0x60060002. The runtime will prefer the VTID if present
  @VTID(28)
  void referenceSurface(
    Reference oReferenceSurface);


  /**
   * <p>
   * Getter method for the COM property "TargetSurface"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611005956) //= 0x60060004. The runtime will prefer the VTID if present
  @VTID(29)
  Reference targetSurface();


  /**
   * <p>
   * Setter method for the COM property "TargetSurface"
   * </p>
   * @param oTargetSurface Mandatory Reference parameter.
   */

  @DISPID(1611005956) //= 0x60060004. The runtime will prefer the VTID if present
  @VTID(30)
  void targetSurface(
    Reference oTargetSurface);


  /**
   * <p>
   * Getter method for the COM property "DeformationMode"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611005958) //= 0x60060006. The runtime will prefer the VTID if present
  @VTID(31)
  int deformationMode();


  /**
   * <p>
   * Setter method for the COM property "DeformationMode"
   * </p>
   * @param oDeformationMode Mandatory int parameter.
   */

  @DISPID(1611005958) //= 0x60060006. The runtime will prefer the VTID if present
  @VTID(32)
  void deformationMode(
    int oDeformationMode);


  // Properties:
}
