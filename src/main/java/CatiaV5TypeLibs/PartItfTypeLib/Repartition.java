package CatiaV5TypeLibs.PartItfTypeLib;

import com4j.DISPID;
import com4j.IID;
import com4j.VTID;
import CatiaV5TypeLibs.InfItfTypeLib.*;

@IID("{FF357D85-6742-11D1-A27F-0000F87546FD}")
public interface Repartition extends AnyObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "InstancesCount"
   * </p>
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.IntParam
   */

  @DISPID(1610940416) //= 0x60050000. The runtime will prefer the VTID if present
  @VTID(22)
  IntParam instancesCount();


  // Properties:
}
