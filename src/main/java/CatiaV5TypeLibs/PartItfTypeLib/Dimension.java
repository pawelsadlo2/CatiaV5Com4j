package CatiaV5TypeLibs.PartItfTypeLib;

import com4j.DISPID;
import com4j.IID;
import com4j.VTID;
import CatiaV5TypeLibs.InfItfTypeLib.*;

@IID("{87A59B77-3A76-11D1-A26C-0000F87546FD}")
public interface Dimension extends RealParam {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "CatiaV5TypeLibs.PartItfTypeLib.Unit"
   * </p>
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.Unit
   */

  @DISPID(1611071488) //= 0x60070000. The runtime will prefer the VTID if present
  @VTID(54)
  Unit unit();


  /**
   * @param iNbDecimals Mandatory int parameter.
   * @param iShowTrailingZeros Mandatory boolean parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1611071489) //= 0x60070001. The runtime will prefer the VTID if present
  @VTID(55)
  java.lang.String valueAsString2(
    int iNbDecimals,
    boolean iShowTrailingZeros);


  // Properties:
}
