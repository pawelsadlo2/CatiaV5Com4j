package CatiaV5TypeLibs.PartTypeLib;
import CatiaV5TypeLibs.InfTypeLib.*;
import CatiaV5TypeLibs.MecModTypeLib.*;
import CatiaV5TypeLibs.KnowledgewareTypeLib.*;

import com4j.*;

@IID("{52EBDFFD-55F7-11D1-A272-0000F87546FD}")
public interface Prism extends SketchBasedShape {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "DirectionType"
   * </p>
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.CatPrismExtrusionDirection
   */

  @DISPID(1611071488) //= 0x60070000. The runtime will prefer the VTID if present
  @VTID(24)
  CatPrismExtrusionDirection directionType();


  /**
   * <p>
   * Setter method for the COM property "DirectionType"
   * </p>
   * @param oDirType Mandatory CatiaV5TypeLibs.PartItfTypeLib.CatPrismExtrusionDirection parameter.
   */

  @DISPID(1611071488) //= 0x60070000. The runtime will prefer the VTID if present
  @VTID(25)
  void directionType(
    CatPrismExtrusionDirection oDirType);


  /**
   * <p>
   * Getter method for the COM property "DirectionOrientation"
   * </p>
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.CatPrismOrientation
   */

  @DISPID(1611071490) //= 0x60070002. The runtime will prefer the VTID if present
  @VTID(26)
  CatPrismOrientation directionOrientation();


  /**
   * <p>
   * Setter method for the COM property "DirectionOrientation"
   * </p>
   * @param oOrientation Mandatory CatiaV5TypeLibs.PartItfTypeLib.CatPrismOrientation parameter.
   */

  @DISPID(1611071490) //= 0x60070002. The runtime will prefer the VTID if present
  @VTID(27)
  void directionOrientation(
    CatPrismOrientation oOrientation);


  /**
   * <p>
   * Getter method for the COM property "IsSymmetric"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1611071492) //= 0x60070004. The runtime will prefer the VTID if present
  @VTID(28)
  boolean isSymmetric();


  /**
   * <p>
   * Setter method for the COM property "IsSymmetric"
   * </p>
   * @param oIsSymmetric Mandatory boolean parameter.
   */

  @DISPID(1611071492) //= 0x60070004. The runtime will prefer the VTID if present
  @VTID(29)
  void isSymmetric(
    boolean oIsSymmetric);


  /**
   * <p>
   * Getter method for the COM property "IsThin"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1611071494) //= 0x60070006. The runtime will prefer the VTID if present
  @VTID(30)
  boolean isThin();


  /**
   * <p>
   * Setter method for the COM property "IsThin"
   * </p>
   * @param oIsThin Mandatory boolean parameter.
   */

  @DISPID(1611071494) //= 0x60070006. The runtime will prefer the VTID if present
  @VTID(31)
  void isThin(
    boolean oIsThin);


  /**
   * <p>
   * Getter method for the COM property "NeutralFiber"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1611071496) //= 0x60070008. The runtime will prefer the VTID if present
  @VTID(32)
  boolean neutralFiber();


  /**
   * <p>
   * Setter method for the COM property "NeutralFiber"
   * </p>
   * @param oIsNeutralFiber Mandatory boolean parameter.
   */

  @DISPID(1611071496) //= 0x60070008. The runtime will prefer the VTID if present
  @VTID(33)
  void neutralFiber(
    boolean oIsNeutralFiber);


  /**
   * <p>
   * Getter method for the COM property "MergeEnd"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1611071498) //= 0x6007000a. The runtime will prefer the VTID if present
  @VTID(34)
  boolean mergeEnd();


  /**
   * <p>
   * Setter method for the COM property "MergeEnd"
   * </p>
   * @param oIsMergeEnd Mandatory boolean parameter.
   */

  @DISPID(1611071498) //= 0x6007000a. The runtime will prefer the VTID if present
  @VTID(35)
  void mergeEnd(
    boolean oIsMergeEnd);


  /**
   * <p>
   * Getter method for the COM property "FirstLimit"
   * </p>
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.Limit
   */

  @DISPID(1611071500) //= 0x6007000c. The runtime will prefer the VTID if present
  @VTID(36)
  Limit firstLimit();


  /**
   * <p>
   * Getter method for the COM property "SecondLimit"
   * </p>
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.Limit
   */

  @DISPID(1611071501) //= 0x6007000d. The runtime will prefer the VTID if present
  @VTID(37)
  Limit secondLimit();


  /**
   * @param ioDirection Mandatory java.lang.Object[] parameter.
   */

  @DISPID(1611071502) //= 0x6007000e. The runtime will prefer the VTID if present
  @VTID(38)
  void getDirection(
    java.lang.Object[] ioDirection);


  /**
   * @param iLine Mandatory Reference parameter.
   */

  @DISPID(1611071503) //= 0x6007000f. The runtime will prefer the VTID if present
  @VTID(39)
  void setDirection(
    Reference iLine);


  /**
   */

  @DISPID(1611071504) //= 0x60070010. The runtime will prefer the VTID if present
  @VTID(40)
  void reverseInnerSide();


  // Properties:
}
