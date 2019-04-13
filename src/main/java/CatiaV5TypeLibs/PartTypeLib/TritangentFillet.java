package CatiaV5TypeLibs.PartTypeLib;
import CatiaV5TypeLibs.InfTypeLib.*;
import CatiaV5TypeLibs.MecModTypeLib.*;
import CatiaV5TypeLibs.KnowledgewareTypeLib.*;

import com4j.*;

@IID("{6D7B62A8-610A-11D1-A27D-0000F87546FD}")
public interface TritangentFillet extends Fillet {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "FirstFace"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611137024) //= 0x60080000. The runtime will prefer the VTID if present
  @VTID(26)
  Reference firstFace();


  /**
   * <p>
   * Setter method for the COM property "FirstFace"
   * </p>
   * @param oFirstFace Mandatory Reference parameter.
   */

  @DISPID(1611137024) //= 0x60080000. The runtime will prefer the VTID if present
  @VTID(27)
  void firstFace(
    Reference oFirstFace);


  /**
   * <p>
   * Getter method for the COM property "SecondFace"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611137026) //= 0x60080002. The runtime will prefer the VTID if present
  @VTID(28)
  Reference secondFace();


  /**
   * <p>
   * Setter method for the COM property "SecondFace"
   * </p>
   * @param oSecondFace Mandatory Reference parameter.
   */

  @DISPID(1611137026) //= 0x60080002. The runtime will prefer the VTID if present
  @VTID(29)
  void secondFace(
    Reference oSecondFace);


  /**
   * <p>
   * Getter method for the COM property "FaceToRemove"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611137028) //= 0x60080004. The runtime will prefer the VTID if present
  @VTID(30)
  Reference faceToRemove();


  /**
   * <p>
   * Setter method for the COM property "FaceToRemove"
   * </p>
   * @param oFaceToRemove Mandatory Reference parameter.
   */

  @DISPID(1611137028) //= 0x60080004. The runtime will prefer the VTID if present
  @VTID(31)
  void faceToRemove(
    Reference oFaceToRemove);


  // Properties:
}
