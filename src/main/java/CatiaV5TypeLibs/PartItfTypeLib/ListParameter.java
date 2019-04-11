package CatiaV5TypeLibs.PartItfTypeLib;

import com4j.DISPID;
import com4j.IID;
import com4j.VTID;
import CatiaV5TypeLibs.InfItfTypeLib.*;

@IID("{AEF778B8-7A2F-11D6-BEA8-0002B349A513}")
public interface ListParameter extends Parameter {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "ValueList"
   * </p>
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.List
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(35)
  List valueList();


  // Properties:
}
