package CatiaV5TypeLibs.PartItfTypeLib;

import com4j.DISPID;
import com4j.IID;
import com4j.VTID;
import CatiaV5TypeLibs.InfItfTypeLib.*;

@IID("{6F5BFC7C-55F7-11D1-A272-0000F87546FD}")
public interface Limit extends AnyObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "LimitMode"
   * </p>
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.CatLimitMode
   */

  @DISPID(1610940416) //= 0x60050000. The runtime will prefer the VTID if present
  @VTID(22)
  CatLimitMode limitMode();


  /**
   * <p>
   * Setter method for the COM property "LimitMode"
   * </p>
   * @param oLimitMode Mandatory CatiaV5TypeLibs.PartItfTypeLib.CatLimitMode parameter.
   */

  @DISPID(1610940416) //= 0x60050000. The runtime will prefer the VTID if present
  @VTID(23)
  void limitMode(
    CatLimitMode oLimitMode);


  /**
   * <p>
   * Getter method for the COM property "CatiaV5TypeLibs.PartItfTypeLib.Dimension"
   * </p>
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.Length
   */

  @DISPID(1610940418) //= 0x60050002. The runtime will prefer the VTID if present
  @VTID(24)
  Length dimension();


  /**
   * <p>
   * Getter method for the COM property "LimitingElement"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1610940419) //= 0x60050003. The runtime will prefer the VTID if present
  @VTID(25)
  Reference limitingElement();


  /**
   * <p>
   * Setter method for the COM property "LimitingElement"
   * </p>
   * @param oLimitingElement Mandatory Reference parameter.
   */

  @DISPID(1610940419) //= 0x60050003. The runtime will prefer the VTID if present
  @VTID(26)
  void limitingElement(
    Reference oLimitingElement);


  // Properties:
}
