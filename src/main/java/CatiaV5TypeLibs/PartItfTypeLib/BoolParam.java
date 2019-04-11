package CatiaV5TypeLibs.PartItfTypeLib;

import com4j.DISPID;
import com4j.IID;
import com4j.VTID;
import CatiaV5TypeLibs.InfItfTypeLib.*;

@IID("{7E1498CB-5464-11D1-A272-0000F87546FD}")
public interface BoolParam extends EnumParam {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Value"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1611071488) //= 0x60070000. The runtime will prefer the VTID if present
  @VTID(37)
  boolean value();


  /**
   * <p>
   * Setter method for the COM property "Value"
   * </p>
   * @param oValue Mandatory boolean parameter.
   */

  @DISPID(1611071488) //= 0x60070000. The runtime will prefer the VTID if present
  @VTID(38)
  void value(
    boolean oValue);


  // Properties:
}
