package CatiaV5TypeLibs.InfTypeLib;

import com4j.*;

@IID("{91D1D553-495C-11D1-A26E-0000F87546FD}")
public interface Collection extends CATBaseDispatch,Iterable<Com4jObject> {
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
   * @param idName Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type CATBaseDispatch
   */

  @DISPID(1610874882) //= 0x60040002. The runtime will prefer the VTID if present
  @VTID(19)
  CATBaseDispatch getItem(
    Holder<java.lang.String> idName);


  /**
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610874883) //= 0x60040003. The runtime will prefer the VTID if present
  @VTID(20)
  java.lang.String name();


  /**
   * <p>
   * Getter method for the COM property "Count"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610874884) //= 0x60040004. The runtime will prefer the VTID if present
  @VTID(21)
  int count();


  /**
   * <p>
   * Getter method for the COM property "_NewEnum"
   * </p>
   */

  @DISPID(-4) //= 0xfffffffc. The runtime will prefer the VTID if present
  @VTID(22)
  java.util.Iterator<Com4jObject> iterator();

  // Properties:
}
