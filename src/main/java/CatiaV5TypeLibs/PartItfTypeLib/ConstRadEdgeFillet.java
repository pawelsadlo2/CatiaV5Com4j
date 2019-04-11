package CatiaV5TypeLibs.PartItfTypeLib;

import com4j.DISPID;
import com4j.IID;
import com4j.VTID;
import CatiaV5TypeLibs.InfItfTypeLib.*;

@IID("{F05E0A17-610B-11D1-A27D-0000F87546FD}")
public interface ConstRadEdgeFillet extends EdgeFillet {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "ObjectsToFillet"
   * </p>
   * @return  Returns a value of type References
   */

  @DISPID(1611202560) //= 0x60090000. The runtime will prefer the VTID if present
  @VTID(31)
  References objectsToFillet();


  /**
   * <p>
   * Getter method for the COM property "Radius"
   * </p>
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.Length
   */

  @DISPID(1611202561) //= 0x60090001. The runtime will prefer the VTID if present
  @VTID(32)
  Length radius();


  /**
   * @param iObjectToFillet Mandatory Reference parameter.
   */

  @DISPID(1611202562) //= 0x60090002. The runtime will prefer the VTID if present
  @VTID(33)
  void addObjectToFillet(
    Reference iObjectToFillet);


  /**
   * @param iObjectToWithdraw Mandatory Reference parameter.
   */

  @DISPID(1611202563) //= 0x60090003. The runtime will prefer the VTID if present
  @VTID(34)
  void withdrawObjectToFillet(
    Reference iObjectToWithdraw);


  // Properties:
}
