package CatiaV5TypeLibs.PartItfTypeLib;

import com4j.DISPID;
import com4j.Holder;
import com4j.IID;
import com4j.VTID;
import CatiaV5TypeLibs.InfItfTypeLib.*;

@IID("{0C6CBFE2-95E8-11D3-B803-0008C70FCBF2}")
public interface EnumParam extends Parameter {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "ValueEnum"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(35)
  java.lang.String valueEnum();


  /**
   * <p>
   * Setter method for the COM property "ValueEnum"
   * </p>
   * @param oValue Mandatory Holder<java.lang.String> parameter.
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(36)
  void valueEnum(
    Holder<java.lang.String> oValue);


  // Properties:
}
