package CatiaV5TypeLibs.InfItfTypeLib;

import com4j.*;

@IID("{7FAFF68C-2E6A-0000-0280-020AEF000000}")
public interface AnyObject extends CATBaseDispatch {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of type Application
   */

  @DISPID(1610874880) //= 0x60040000. The runtime will prefer the VTID if present
  @VTID(17)
  Application application();


  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type CATBaseDispatch
   */

  @DISPID(1610874881) //= 0x60040001. The runtime will prefer the VTID if present
  @VTID(18)
  CATBaseDispatch parent();


  /**
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610874882) //= 0x60040002. The runtime will prefer the VTID if present
  @VTID(19)
  java.lang.String name();


  /**
   * <p>
   * Setter method for the COM property "Name"
   * </p>
   * @param oNameBSTR Mandatory Holder<java.lang.String> parameter.
   */

  @DISPID(1610874882) //= 0x60040002. The runtime will prefer the VTID if present
  @VTID(20)
  void name(
    Holder<java.lang.String> oNameBSTR);


  /**
   * @param idName Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type CATBaseDispatch
   */

  @DISPID(1610874884) //= 0x60040004. The runtime will prefer the VTID if present
  @VTID(21)
  CATBaseDispatch getItem(
    Holder<java.lang.String> idName);


  // Properties:
}
