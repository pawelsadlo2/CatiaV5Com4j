package CatiaV5TypeLibs.MecModTypeLib;
import CatiaV5TypeLibs.InfTypeLib.*;

import com4j.*;

@IID("{8E3491A3-B6FC-11D3-904B-0004AC96F573}")
public interface Publication extends AnyObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Next"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(1610940416) //= 0x60050000. The runtime will prefer the VTID if present
  @VTID(22)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object next();


  /**
   * <p>
   * Setter method for the COM property "Next"
   * </p>
   * @param oDirect Mandatory java.lang.Object parameter.
   */

  @DISPID(1610940416) //= 0x60050000. The runtime will prefer the VTID if present
  @VTID(23)
  void next(
    java.lang.Object oDirect);


  /**
   * <p>
   * Getter method for the COM property "Valuation"
   * </p>
   * @return  Returns a value of type CATBaseDispatch
   */

  @DISPID(1610940418) //= 0x60050002. The runtime will prefer the VTID if present
  @VTID(24)
  CATBaseDispatch valuation();


  /**
   * <p>
   * Setter method for the COM property "Valuation"
   * </p>
   * @param oRef Mandatory CATBaseDispatch parameter.
   */

  @DISPID(1610940418) //= 0x60050002. The runtime will prefer the VTID if present
  @VTID(25)
  void valuation(
    CATBaseDispatch oRef);


  /**
   * <p>
   * Setter method for the COM property "Relay"
   * </p>
   * @param rhs Mandatory CatiaV5TypeLibs.PartItfTypeLib.Publication parameter.
   */

  @DISPID(1610940420) //= 0x60050004. The runtime will prefer the VTID if present
  @VTID(26)
  void relay(
    Publication rhs);


  // Properties:
}
