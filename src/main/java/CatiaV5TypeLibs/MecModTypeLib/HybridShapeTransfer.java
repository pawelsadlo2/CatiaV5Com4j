package CatiaV5TypeLibs.MecModTypeLib;
import CatiaV5TypeLibs.KnowledgewareTypeLib.*;
import CatiaV5TypeLibs.InfTypeLib.*;

import com4j.*;

@IID("{915FDAE2-42D1-4E1D-8E82-EFFD9072518A}")
public interface HybridShapeTransfer extends HybridShape {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "ElementToTransfer"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(25)
  Reference elementToTransfer();


  /**
   * <p>
   * Setter method for the COM property "ElementToTransfer"
   * </p>
   * @param oElem Mandatory Reference parameter.
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(26)
  void elementToTransfer(
    Reference oElem);


  /**
   * <p>
   * Getter method for the COM property "SurfaceToUnfold"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611005954) //= 0x60060002. The runtime will prefer the VTID if present
  @VTID(27)
  Reference surfaceToUnfold();


  /**
   * <p>
   * Setter method for the COM property "SurfaceToUnfold"
   * </p>
   * @param oElem Mandatory Reference parameter.
   */

  @DISPID(1611005954) //= 0x60060002. The runtime will prefer the VTID if present
  @VTID(28)
  void surfaceToUnfold(
    Reference oElem);


  /**
   * <p>
   * Getter method for the COM property "UnfoldedSurface"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611005956) //= 0x60060004. The runtime will prefer the VTID if present
  @VTID(29)
  Reference unfoldedSurface();


  /**
   * <p>
   * Setter method for the COM property "UnfoldedSurface"
   * </p>
   * @param oElem Mandatory Reference parameter.
   */

  @DISPID(1611005956) //= 0x60060004. The runtime will prefer the VTID if present
  @VTID(30)
  void unfoldedSurface(
    Reference oElem);


  /**
   * <p>
   * Getter method for the COM property "TypeOfTransfer"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611005958) //= 0x60060006. The runtime will prefer the VTID if present
  @VTID(31)
  int typeOfTransfer();


  /**
   * <p>
   * Setter method for the COM property "TypeOfTransfer"
   * </p>
   * @param oType Mandatory int parameter.
   */

  @DISPID(1611005958) //= 0x60060006. The runtime will prefer the VTID if present
  @VTID(32)
  void typeOfTransfer(
    int oType);


  /**
   * <p>
   * Getter method for the COM property "UnfoldType"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611005960) //= 0x60060008. The runtime will prefer the VTID if present
  @VTID(33)
  int unfoldType();


  /**
   * <p>
   * Setter method for the COM property "UnfoldType"
   * </p>
   * @param oType Mandatory int parameter.
   */

  @DISPID(1611005960) //= 0x60060008. The runtime will prefer the VTID if present
  @VTID(34)
  void unfoldType(
    int oType);


  // Properties:
}
