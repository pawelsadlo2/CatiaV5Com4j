package CatiaV5TypeLibs.PartItfTypeLib;

import com4j.DISPID;
import com4j.IID;
import com4j.VTID;
import CatiaV5TypeLibs.InfItfTypeLib.*;

@IID("{CB9CE830-6744-11D1-A27F-0000F87546FD}")
public interface LinearRepartition extends Repartition {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Spacing"
   * </p>
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.Length
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(23)
  Length spacing();


  // Properties:
}
