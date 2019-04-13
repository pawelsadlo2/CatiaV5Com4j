package CatiaV5TypeLibs.MecModTypeLib;
import CatiaV5TypeLibs.InfTypeLib.*;

import com4j.*;

@IID("{EE3021B2-3B09-11D1-A26C-0000F87546FD}")
public interface Sketch extends AnyObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "CatiaV5TypeLibs.PartItfTypeLib.GeometricElements"
   * </p>
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.GeometricElements
   */

  @DISPID(1610940416) //= 0x60050000. The runtime will prefer the VTID if present
  @VTID(22)
  GeometricElements geometricElements();


  /**
   * <p>
   * Getter method for the COM property "CatiaV5TypeLibs.PartItfTypeLib.Constraints"
   * </p>
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.Constraints
   */

  @DISPID(1610940417) //= 0x60050001. The runtime will prefer the VTID if present
  @VTID(23)
  Constraints constraints();


  /**
   * <p>
   * Getter method for the COM property "CatiaV5TypeLibs.PartItfTypeLib.Factory2D"
   * </p>
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.Factory2D
   */

  @DISPID(1610940418) //= 0x60050002. The runtime will prefer the VTID if present
  @VTID(24)
  Factory2D factory2D();


  /**
   * <p>
   * Getter method for the COM property "CenterLine"
   * </p>
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.Line2D
   */

  @DISPID(1610940419) //= 0x60050003. The runtime will prefer the VTID if present
  @VTID(25)
  Line2D centerLine();


  /**
   * <p>
   * Setter method for the COM property "CenterLine"
   * </p>
   * @param oLine Mandatory CatiaV5TypeLibs.PartItfTypeLib.Line2D parameter.
   */

  @DISPID(1610940419) //= 0x60050003. The runtime will prefer the VTID if present
  @VTID(26)
  void centerLine(
    Line2D oLine);


  /**
   * <p>
   * Getter method for the COM property "AbsoluteAxis"
   * </p>
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.Axis2D
   */

  @DISPID(1610940421) //= 0x60050005. The runtime will prefer the VTID if present
  @VTID(27)
  Axis2D absoluteAxis();


  /**
   * @param oAxisData Mandatory java.lang.Object[] parameter.
   */

  @DISPID(1610940422) //= 0x60050006. The runtime will prefer the VTID if present
  @VTID(28)
  void getAbsoluteAxisData(
    java.lang.Object[] oAxisData);


  /**
   * @param iAxisData Mandatory java.lang.Object[] parameter.
   */

  @DISPID(1610940423) //= 0x60050007. The runtime will prefer the VTID if present
  @VTID(29)
  void setAbsoluteAxisData(
    java.lang.Object[] iAxisData);


  /**
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.Factory2D
   */

  @DISPID(1610940424) //= 0x60050008. The runtime will prefer the VTID if present
  @VTID(30)
  Factory2D openEdition();


  /**
   */

  @DISPID(1610940425) //= 0x60050009. The runtime will prefer the VTID if present
  @VTID(31)
  void closeEdition();


  /**
   */

  @DISPID(1610940426) //= 0x6005000a. The runtime will prefer the VTID if present
  @VTID(32)
  void inverseOrientation();


  /**
   */

  @DISPID(1610940427) //= 0x6005000b. The runtime will prefer the VTID if present
  @VTID(33)
  void evaluate();


  // Properties:
}
