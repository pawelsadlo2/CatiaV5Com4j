package CatiaV5TypeLibs.PartItfTypeLib;

import com4j.DISPID;
import com4j.IID;
import com4j.VTID;
import CatiaV5TypeLibs.InfItfTypeLib.*;

@IID("{CFC1B652-5466-11D1-A272-0000F87546FD}")
public interface Check extends Relation {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Severity"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611137024) //= 0x60080000. The runtime will prefer the VTID if present
  @VTID(39)
  int severity();


  /**
   * <p>
   * Setter method for the COM property "Severity"
   * </p>
   * @param oSeverity Mandatory int parameter.
   */

  @DISPID(1611137024) //= 0x60080000. The runtime will prefer the VTID if present
  @VTID(40)
  void severity(
    int oSeverity);


  /**
   * <p>
   * Getter method for the COM property "Diagnosis"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1611137026) //= 0x60080002. The runtime will prefer the VTID if present
  @VTID(41)
  boolean diagnosis();


  // Properties:
}
