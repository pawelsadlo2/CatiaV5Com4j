package CatiaV5TypeLibs.HybridShapeTypeLib;
import CatiaV5TypeLibs.InfTypeLib.*;
import CatiaV5TypeLibs.MecModTypeLib.*;
import CatiaV5TypeLibs.KnowledgewareTypeLib.*;

import com4j.*;

@IID("{89640403-B42C-0000-0280-020E60000000}")
public interface HybridShapeOffset extends HybridShape {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "OffsetedObject"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(25)
  Reference offsetedObject();


  /**
   * <p>
   * Setter method for the COM property "OffsetedObject"
   * </p>
   * @param oFaceToOffset Mandatory Reference parameter.
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(26)
  void offsetedObject(
    Reference oFaceToOffset);


  /**
   * <p>
   * Getter method for the COM property "OffsetValue"
   * </p>
   * @return  Returns a value of type Length
   */

  @DISPID(1611005954) //= 0x60060002. The runtime will prefer the VTID if present
  @VTID(27)
  Length offsetValue();


  /**
   * <p>
   * Setter method for the COM property "OffsetValue"
   * </p>
   * @param oOffset Mandatory Length parameter.
   */

  @DISPID(1611005954) //= 0x60060002. The runtime will prefer the VTID if present
  @VTID(28)
  void offsetValue(
    Length oOffset);


  /**
   * <p>
   * Getter method for the COM property "OffsetDirection"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005956) //= 0x60060004. The runtime will prefer the VTID if present
  @VTID(29)
  boolean offsetDirection();


  /**
   * <p>
   * Setter method for the COM property "OffsetDirection"
   * </p>
   * @param oOffsetDirection Mandatory boolean parameter.
   */

  @DISPID(1611005956) //= 0x60060004. The runtime will prefer the VTID if present
  @VTID(30)
  void offsetDirection(
    boolean oOffsetDirection);


  /**
   * <p>
   * Getter method for the COM property "SuppressMode"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005958) //= 0x60060006. The runtime will prefer the VTID if present
  @VTID(31)
  boolean suppressMode();


  /**
   * <p>
   * Setter method for the COM property "SuppressMode"
   * </p>
   * @param oSuppressMode Mandatory boolean parameter.
   */

  @DISPID(1611005958) //= 0x60060006. The runtime will prefer the VTID if present
  @VTID(32)
  void suppressMode(
    boolean oSuppressMode);


  /**
   * @param iRank Mandatory int parameter.
   * @return  Returns a value of type Reference
   */

  @DISPID(1611005960) //= 0x60060008. The runtime will prefer the VTID if present
  @VTID(33)
  Reference getTrickyFace(
    int iRank);


  /**
   * @param iTrickyFace Mandatory Reference parameter.
   */

  @DISPID(1611005961) //= 0x60060009. The runtime will prefer the VTID if present
  @VTID(34)
  void addTrickyFace(
    Reference iTrickyFace);


  /**
   * @param iRank Mandatory int parameter.
   */

  @DISPID(1611005962) //= 0x6006000a. The runtime will prefer the VTID if present
  @VTID(35)
  void removeTrickyFace(
    int iRank);


  /**
   * @param iOffset Mandatory double parameter.
   */

  @DISPID(1611005963) //= 0x6006000b. The runtime will prefer the VTID if present
  @VTID(36)
  void setOffsetValue(
    double iOffset);


  // Properties:
}
