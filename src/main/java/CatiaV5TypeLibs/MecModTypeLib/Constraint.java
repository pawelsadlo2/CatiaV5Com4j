package CatiaV5TypeLibs.MecModTypeLib;
import CatiaV5TypeLibs.KnowledgewareTypeLib.*;

import CatiaV5TypeLibs.InfTypeLib.*;
import com4j.*;

@IID("{CAC0042A-6BD0-11D1-A280-0000F87546FD}")
public interface Constraint extends AnyObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Type"
   * </p>
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.CatConstraintType
   */

  @DISPID(1610940416) //= 0x60050000. The runtime will prefer the VTID if present
  @VTID(22)
  CatConstraintType type();


  /**
   * <p>
   * Getter method for the COM property "CatiaV5TypeLibs.PartItfTypeLib.Dimension"
   * </p>
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.Dimension
   */

  @DISPID(1610940417) //= 0x60050001. The runtime will prefer the VTID if present
  @VTID(23)
  Dimension dimension();


  /**
   * <p>
   * Getter method for the COM property "Mode"
   * </p>
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.CatConstraintMode
   */

  @DISPID(1610940418) //= 0x60050002. The runtime will prefer the VTID if present
  @VTID(24)
  CatConstraintMode mode();


  /**
   * <p>
   * Setter method for the COM property "Mode"
   * </p>
   * @param oMode Mandatory CatiaV5TypeLibs.PartItfTypeLib.CatConstraintMode parameter.
   */

  @DISPID(1610940418) //= 0x60050002. The runtime will prefer the VTID if present
  @VTID(25)
  void mode(
    CatConstraintMode oMode);


  /**
   * <p>
   * Getter method for the COM property "Side"
   * </p>
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.CatConstraintSide
   */

  @DISPID(1610940420) //= 0x60050004. The runtime will prefer the VTID if present
  @VTID(26)
  CatConstraintSide side();


  /**
   * <p>
   * Setter method for the COM property "Side"
   * </p>
   * @param oCurrentSide Mandatory CatiaV5TypeLibs.PartItfTypeLib.CatConstraintSide parameter.
   */

  @DISPID(1610940420) //= 0x60050004. The runtime will prefer the VTID if present
  @VTID(27)
  void side(
    CatConstraintSide oCurrentSide);


  /**
   * <p>
   * Getter method for the COM property "Orientation"
   * </p>
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.CatConstraintOrientation
   */

  @DISPID(1610940422) //= 0x60050006. The runtime will prefer the VTID if present
  @VTID(28)
  CatConstraintOrientation orientation();


  /**
   * <p>
   * Setter method for the COM property "Orientation"
   * </p>
   * @param oOrient Mandatory CatiaV5TypeLibs.PartItfTypeLib.CatConstraintOrientation parameter.
   */

  @DISPID(1610940422) //= 0x60050006. The runtime will prefer the VTID if present
  @VTID(29)
  void orientation(
    CatConstraintOrientation oOrient);


  /**
   * <p>
   * Getter method for the COM property "DistanceConfig"
   * </p>
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.CatConstraintDistConfig
   */

  @DISPID(1610940424) //= 0x60050008. The runtime will prefer the VTID if present
  @VTID(30)
  CatConstraintDistConfig distanceConfig();


  /**
   * <p>
   * Setter method for the COM property "DistanceConfig"
   * </p>
   * @param oCurrentConf Mandatory CatiaV5TypeLibs.PartItfTypeLib.CatConstraintDistConfig parameter.
   */

  @DISPID(1610940424) //= 0x60050008. The runtime will prefer the VTID if present
  @VTID(31)
  void distanceConfig(
    CatConstraintDistConfig oCurrentConf);


  /**
   * <p>
   * Getter method for the COM property "DistanceDirection"
   * </p>
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.CatConstraintDistDirection
   */

  @DISPID(1610940426) //= 0x6005000a. The runtime will prefer the VTID if present
  @VTID(32)
  CatConstraintDistDirection distanceDirection();


  /**
   * <p>
   * Setter method for the COM property "DistanceDirection"
   * </p>
   * @param oCurrentDirection Mandatory CatiaV5TypeLibs.PartItfTypeLib.CatConstraintDistDirection parameter.
   */

  @DISPID(1610940426) //= 0x6005000a. The runtime will prefer the VTID if present
  @VTID(33)
  void distanceDirection(
    CatConstraintDistDirection oCurrentDirection);


  /**
   * <p>
   * Getter method for the COM property "AngleSector"
   * </p>
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.CatConstraintAngleSector
   */

  @DISPID(1610940428) //= 0x6005000c. The runtime will prefer the VTID if present
  @VTID(34)
  CatConstraintAngleSector angleSector();


  /**
   * <p>
   * Setter method for the COM property "AngleSector"
   * </p>
   * @param oCurrentSector Mandatory CatiaV5TypeLibs.PartItfTypeLib.CatConstraintAngleSector parameter.
   */

  @DISPID(1610940428) //= 0x6005000c. The runtime will prefer the VTID if present
  @VTID(35)
  void angleSector(
    CatConstraintAngleSector oCurrentSector);


  /**
   * <p>
   * Getter method for the COM property "ReferenceAxis"
   * </p>
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.CatConstraintRefAxis
   */

  @DISPID(1610940430) //= 0x6005000e. The runtime will prefer the VTID if present
  @VTID(36)
  CatConstraintRefAxis referenceAxis();


  /**
   * <p>
   * Setter method for the COM property "ReferenceAxis"
   * </p>
   * @param oCurrentRefAxis Mandatory CatiaV5TypeLibs.PartItfTypeLib.CatConstraintRefAxis parameter.
   */

  @DISPID(1610940430) //= 0x6005000e. The runtime will prefer the VTID if present
  @VTID(37)
  void referenceAxis(
    CatConstraintRefAxis oCurrentRefAxis);


  /**
   * <p>
   * Getter method for the COM property "ReferenceType"
   * </p>
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.CatConstraintRefType
   */

  @DISPID(1610940432) //= 0x60050010. The runtime will prefer the VTID if present
  @VTID(38)
  CatConstraintRefType referenceType();


  /**
   * <p>
   * Setter method for the COM property "ReferenceType"
   * </p>
   * @param oCurrentRefType Mandatory CatiaV5TypeLibs.PartItfTypeLib.CatConstraintRefType parameter.
   */

  @DISPID(1610940432) //= 0x60050010. The runtime will prefer the VTID if present
  @VTID(39)
  void referenceType(
    CatConstraintRefType oCurrentRefType);


  /**
   * <p>
   * Getter method for the COM property "Status"
   * </p>
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.CatConstraintStatus
   */

  @DISPID(1610940434) //= 0x60050012. The runtime will prefer the VTID if present
  @VTID(40)
  CatConstraintStatus status();


  /**
   * @param oAnchorPoint Mandatory java.lang.Object[] parameter.
   * @param oAnchorVector Mandatory java.lang.Object[] parameter.
   */

  @DISPID(1610940435) //= 0x60050013. The runtime will prefer the VTID if present
  @VTID(41)
  void getConstraintVisuLocation(
    java.lang.Object[] oAnchorPoint,
    java.lang.Object[] oAnchorVector);


  /**
   * @param iNewX Mandatory double parameter.
   * @param iNewY Mandatory double parameter.
   * @param iNewZ Mandatory double parameter.
   */

  @DISPID(1610940436) //= 0x60050014. The runtime will prefer the VTID if present
  @VTID(42)
  void setConstraintVisuLocation(
    double iNewX,
    double iNewY,
    double iNewZ);


  /**
   * @param iElementNumber Mandatory int parameter.
   * @return  Returns a value of type Reference
   */

  @DISPID(1610940437) //= 0x60050015. The runtime will prefer the VTID if present
  @VTID(43)
  Reference getConstraintElement(
    int iElementNumber);


  /**
   * @param iElementNumber Mandatory int parameter.
   * @param iNewElement Mandatory Reference parameter.
   */

  @DISPID(1610940438) //= 0x60050016. The runtime will prefer the VTID if present
  @VTID(44)
  void setConstraintElement(
    int iElementNumber,
    Reference iNewElement);


  /**
   */

  @DISPID(1610940439) //= 0x60050017. The runtime will prefer the VTID if present
  @VTID(45)
  void deactivate();


  /**
   */

  @DISPID(1610940440) //= 0x60050018. The runtime will prefer the VTID if present
  @VTID(46)
  void activate();


  /**
   * @return  Returns a value of type boolean
   */

  @DISPID(1610940441) //= 0x60050019. The runtime will prefer the VTID if present
  @VTID(47)
  boolean isInactive();


  // Properties:
}
