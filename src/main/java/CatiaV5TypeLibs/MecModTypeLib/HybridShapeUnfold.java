import CatiaV5TypeLibs.InfTypeLib.*;
import com4j.*;

@IID("{8CD8DBDC-65F5-0000-0280-020E60000000}")
public interface HybridShapeUnfold extends HybridShape {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "SurfaceToUnfold"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(25)
  Reference surfaceToUnfold();


  /**
   * <p>
   * Setter method for the COM property "SurfaceToUnfold"
   * </p>
   * @param oElem Mandatory Reference parameter.
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(26)
  void surfaceToUnfold(
    Reference oElem);


  /**
   * <p>
   * Getter method for the COM property "OriginToUnfold"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611005954) //= 0x60060002. The runtime will prefer the VTID if present
  @VTID(27)
  Reference originToUnfold();


  /**
   * <p>
   * Setter method for the COM property "OriginToUnfold"
   * </p>
   * @param oElem Mandatory Reference parameter.
   */

  @DISPID(1611005954) //= 0x60060002. The runtime will prefer the VTID if present
  @VTID(28)
  void originToUnfold(
    Reference oElem);


  /**
   * <p>
   * Getter method for the COM property "DirectionToUnfold"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611005956) //= 0x60060004. The runtime will prefer the VTID if present
  @VTID(29)
  Reference directionToUnfold();


  /**
   * <p>
   * Setter method for the COM property "DirectionToUnfold"
   * </p>
   * @param oElem Mandatory Reference parameter.
   */

  @DISPID(1611005956) //= 0x60060004. The runtime will prefer the VTID if present
  @VTID(30)
  void directionToUnfold(
    Reference oElem);


  /**
   * <p>
   * Getter method for the COM property "TargetPlane"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611005958) //= 0x60060006. The runtime will prefer the VTID if present
  @VTID(31)
  Reference targetPlane();


  /**
   * <p>
   * Setter method for the COM property "TargetPlane"
   * </p>
   * @param oElem Mandatory Reference parameter.
   */

  @DISPID(1611005958) //= 0x60060006. The runtime will prefer the VTID if present
  @VTID(32)
  void targetPlane(
    Reference oElem);


  /**
   * @param iElement Mandatory Reference parameter.
   */

  @DISPID(1611005960) //= 0x60060008. The runtime will prefer the VTID if present
  @VTID(33)
  void addEdgeToTear(
    Reference iElement);


  /**
   * @param iRank Mandatory int parameter.
   * @return  Returns a value of type Reference
   */

  @DISPID(1611005961) //= 0x60060009. The runtime will prefer the VTID if present
  @VTID(34)
  Reference getEdgeToTear(
    int iRank);


  /**
   * @param iRank Mandatory int parameter.
   */

  @DISPID(1611005962) //= 0x6006000a. The runtime will prefer the VTID if present
  @VTID(35)
  void removeEdgeToTear(
    int iRank);


  /**
   * <p>
   * Getter method for the COM property "SurfaceType"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611005963) //= 0x6006000b. The runtime will prefer the VTID if present
  @VTID(36)
  int surfaceType();


  /**
   * <p>
   * Setter method for the COM property "SurfaceType"
   * </p>
   * @param oType Mandatory int parameter.
   */

  @DISPID(1611005963) //= 0x6006000b. The runtime will prefer the VTID if present
  @VTID(37)
  void surfaceType(
    int oType);


  /**
   * <p>
   * Getter method for the COM property "TargetOrientationMode"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611005965) //= 0x6006000d. The runtime will prefer the VTID if present
  @VTID(38)
  int targetOrientationMode();


  /**
   * <p>
   * Setter method for the COM property "TargetOrientationMode"
   * </p>
   * @param oMode Mandatory int parameter.
   */

  @DISPID(1611005965) //= 0x6006000d. The runtime will prefer the VTID if present
  @VTID(39)
  void targetOrientationMode(
    int oMode);


  /**
   * <p>
   * Getter method for the COM property "EdgeToTearPositioningOrientation"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611005967) //= 0x6006000f. The runtime will prefer the VTID if present
  @VTID(40)
  int edgeToTearPositioningOrientation();


  /**
   * <p>
   * Setter method for the COM property "EdgeToTearPositioningOrientation"
   * </p>
   * @param oMode Mandatory int parameter.
   */

  @DISPID(1611005967) //= 0x6006000f. The runtime will prefer the VTID if present
  @VTID(41)
  void edgeToTearPositioningOrientation(
    int oMode);


  // Properties:
}
