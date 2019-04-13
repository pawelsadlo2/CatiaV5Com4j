package CatiaV5TypeLibs.HybridShapeTypeLib;
import CatiaV5TypeLibs.InfTypeLib.*;
import CatiaV5TypeLibs.MecModTypeLib.*;
import CatiaV5TypeLibs.KnowledgewareTypeLib.*;

import com4j.*;

@IID("{6E1073C2-D7CB-11D3-85A0-00108301432B}")
public interface AxisSystem extends AnyObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Type"
   * </p>
   * @return  Returns a value of type CATAxisSystemMainType
   */

  @DISPID(1610940416) //= 0x60050000. The runtime will prefer the VTID if present
  @VTID(22)
  CATAxisSystemMainType type();


  /**
   * <p>
   * Setter method for the COM property "Type"
   * </p>
   * @param oType Mandatory CATAxisSystemMainType parameter.
   */

  @DISPID(1610940416) //= 0x60050000. The runtime will prefer the VTID if present
  @VTID(23)
  void type(
    CATAxisSystemMainType oType);


  /**
   * <p>
   * Getter method for the COM property "IsCurrent"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610940418) //= 0x60050002. The runtime will prefer the VTID if present
  @VTID(24)
  boolean isCurrent();


  /**
   * <p>
   * Setter method for the COM property "IsCurrent"
   * </p>
   * @param oIsCurrent Mandatory boolean parameter.
   */

  @DISPID(1610940418) //= 0x60050002. The runtime will prefer the VTID if present
  @VTID(25)
  void isCurrent(
    boolean oIsCurrent);


  /**
   * <p>
   * Getter method for the COM property "OriginType"
   * </p>
   * @return  Returns a value of type CATAxisSystemOriginType
   */

  @DISPID(1610940420) //= 0x60050004. The runtime will prefer the VTID if present
  @VTID(26)
  CATAxisSystemOriginType originType();


  /**
   * <p>
   * Setter method for the COM property "OriginType"
   * </p>
   * @param oOriginType Mandatory CATAxisSystemOriginType parameter.
   */

  @DISPID(1610940420) //= 0x60050004. The runtime will prefer the VTID if present
  @VTID(27)
  void originType(
    CATAxisSystemOriginType oOriginType);


  /**
   * <p>
   * Getter method for the COM property "OriginPoint"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1610940422) //= 0x60050006. The runtime will prefer the VTID if present
  @VTID(28)
  Reference originPoint();


  /**
   * <p>
   * Setter method for the COM property "OriginPoint"
   * </p>
   * @param oOriginPoint Mandatory Reference parameter.
   */

  @DISPID(1610940422) //= 0x60050006. The runtime will prefer the VTID if present
  @VTID(29)
  void originPoint(
    Reference oOriginPoint);


  /**
   * <p>
   * Getter method for the COM property "XAxisType"
   * </p>
   * @return  Returns a value of type CATAxisSystemAxisType
   */

  @DISPID(1610940424) //= 0x60050008. The runtime will prefer the VTID if present
  @VTID(30)
  CATAxisSystemAxisType xAxisType();


  /**
   * <p>
   * Setter method for the COM property "XAxisType"
   * </p>
   * @param oAxisType Mandatory CATAxisSystemAxisType parameter.
   */

  @DISPID(1610940424) //= 0x60050008. The runtime will prefer the VTID if present
  @VTID(31)
  void xAxisType(
    CATAxisSystemAxisType oAxisType);


  /**
   * <p>
   * Getter method for the COM property "YAxisType"
   * </p>
   * @return  Returns a value of type CATAxisSystemAxisType
   */

  @DISPID(1610940426) //= 0x6005000a. The runtime will prefer the VTID if present
  @VTID(32)
  CATAxisSystemAxisType yAxisType();


  /**
   * <p>
   * Setter method for the COM property "YAxisType"
   * </p>
   * @param oAxisType Mandatory CATAxisSystemAxisType parameter.
   */

  @DISPID(1610940426) //= 0x6005000a. The runtime will prefer the VTID if present
  @VTID(33)
  void yAxisType(
    CATAxisSystemAxisType oAxisType);


  /**
   * <p>
   * Getter method for the COM property "ZAxisType"
   * </p>
   * @return  Returns a value of type CATAxisSystemAxisType
   */

  @DISPID(1610940428) //= 0x6005000c. The runtime will prefer the VTID if present
  @VTID(34)
  CATAxisSystemAxisType zAxisType();


  /**
   * <p>
   * Setter method for the COM property "ZAxisType"
   * </p>
   * @param oAxisType Mandatory CATAxisSystemAxisType parameter.
   */

  @DISPID(1610940428) //= 0x6005000c. The runtime will prefer the VTID if present
  @VTID(35)
  void zAxisType(
    CATAxisSystemAxisType oAxisType);


  /**
   * <p>
   * Getter method for the COM property "XAxisDirection"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1610940430) //= 0x6005000e. The runtime will prefer the VTID if present
  @VTID(36)
  Reference xAxisDirection();


  /**
   * <p>
   * Setter method for the COM property "XAxisDirection"
   * </p>
   * @param oAxisDirection Mandatory Reference parameter.
   */

  @DISPID(1610940430) //= 0x6005000e. The runtime will prefer the VTID if present
  @VTID(37)
  void xAxisDirection(
    Reference oAxisDirection);


  /**
   * <p>
   * Getter method for the COM property "YAxisDirection"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1610940432) //= 0x60050010. The runtime will prefer the VTID if present
  @VTID(38)
  Reference yAxisDirection();


  /**
   * <p>
   * Setter method for the COM property "YAxisDirection"
   * </p>
   * @param oAxisDirection Mandatory Reference parameter.
   */

  @DISPID(1610940432) //= 0x60050010. The runtime will prefer the VTID if present
  @VTID(39)
  void yAxisDirection(
    Reference oAxisDirection);


  /**
   * <p>
   * Getter method for the COM property "ZAxisDirection"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1610940434) //= 0x60050012. The runtime will prefer the VTID if present
  @VTID(40)
  Reference zAxisDirection();


  /**
   * <p>
   * Setter method for the COM property "ZAxisDirection"
   * </p>
   * @param oAxisDirection Mandatory Reference parameter.
   */

  @DISPID(1610940434) //= 0x60050012. The runtime will prefer the VTID if present
  @VTID(41)
  void zAxisDirection(
    Reference oAxisDirection);


  /**
   * <p>
   * Getter method for the COM property "AxisRotationReference"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1610940436) //= 0x60050014. The runtime will prefer the VTID if present
  @VTID(42)
  Reference axisRotationReference();


  /**
   * <p>
   * Setter method for the COM property "AxisRotationReference"
   * </p>
   * @param oAxisRotationReference Mandatory Reference parameter.
   */

  @DISPID(1610940436) //= 0x60050014. The runtime will prefer the VTID if present
  @VTID(43)
  void axisRotationReference(
    Reference oAxisRotationReference);


  /**
   * <p>
   * Getter method for the COM property "AxisRotationAngle"
   * </p>
   * @return  Returns a value of type Angle
   */

  @DISPID(1610940438) //= 0x60050016. The runtime will prefer the VTID if present
  @VTID(44)
  Angle axisRotationAngle();


  /**
   * @param oOrigin Mandatory java.lang.Object[] parameter.
   */

  @DISPID(1610940439) //= 0x60050017. The runtime will prefer the VTID if present
  @VTID(45)
  void getOrigin(
    java.lang.Object[] oOrigin);


  /**
   * @param iOrigin Mandatory java.lang.Object[] parameter.
   */

  @DISPID(1610940440) //= 0x60050018. The runtime will prefer the VTID if present
  @VTID(46)
  void putOrigin(
    java.lang.Object[] iOrigin);


  /**
   * @param oVectorX Mandatory java.lang.Object[] parameter.
   * @param oVectorY Mandatory java.lang.Object[] parameter.
   */

  @DISPID(1610940441) //= 0x60050019. The runtime will prefer the VTID if present
  @VTID(47)
  void getVectors(
    java.lang.Object[] oVectorX,
    java.lang.Object[] oVectorY);


  /**
   * @param iVectorX Mandatory java.lang.Object[] parameter.
   * @param iVectorY Mandatory java.lang.Object[] parameter.
   */

  @DISPID(1610940442) //= 0x6005001a. The runtime will prefer the VTID if present
  @VTID(48)
  void putVectors(
    java.lang.Object[] iVectorX,
    java.lang.Object[] iVectorY);


  /**
   * @param oXAxis Mandatory java.lang.Object[] parameter.
   */

  @DISPID(1610940443) //= 0x6005001b. The runtime will prefer the VTID if present
  @VTID(49)
  void getXAxis(
    java.lang.Object[] oXAxis);


  /**
   * @param iXAxis Mandatory java.lang.Object[] parameter.
   */

  @DISPID(1610940444) //= 0x6005001c. The runtime will prefer the VTID if present
  @VTID(50)
  void putXAxis(
    java.lang.Object[] iXAxis);


  /**
   * @param oYAxis Mandatory java.lang.Object[] parameter.
   */

  @DISPID(1610940445) //= 0x6005001d. The runtime will prefer the VTID if present
  @VTID(51)
  void getYAxis(
    java.lang.Object[] oYAxis);


  /**
   * @param iYAxis Mandatory java.lang.Object[] parameter.
   */

  @DISPID(1610940446) //= 0x6005001e. The runtime will prefer the VTID if present
  @VTID(52)
  void putYAxis(
    java.lang.Object[] iYAxis);


  /**
   * @param oZAxis Mandatory java.lang.Object[] parameter.
   */

  @DISPID(1610940447) //= 0x6005001f. The runtime will prefer the VTID if present
  @VTID(53)
  void getZAxis(
    java.lang.Object[] oZAxis);


  /**
   * @param iZAxis Mandatory java.lang.Object[] parameter.
   */

  @DISPID(1610940448) //= 0x60050020. The runtime will prefer the VTID if present
  @VTID(54)
  void putZAxis(
    java.lang.Object[] iZAxis);


  /**
   * @param oFirstAngle Mandatory Holder<Angle> parameter.
   * @param oSecondAngle Mandatory Holder<Angle> parameter.
   * @param thirdAngle Mandatory Holder<Angle> parameter.
   */

  @DISPID(1610940449) //= 0x60050021. The runtime will prefer the VTID if present
  @VTID(55)
  void getEulerAngles(
    Holder<Angle> oFirstAngle,
    Holder<Angle> oSecondAngle,
    Holder<Angle> thirdAngle);


  // Properties:
}
