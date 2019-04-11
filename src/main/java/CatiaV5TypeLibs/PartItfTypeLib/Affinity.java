package CatiaV5TypeLibs.PartItfTypeLib;

import com4j.DISPID;
import com4j.IID;
import com4j.VTID;
import CatiaV5TypeLibs.InfItfTypeLib.*;

@IID("{5925B967-7E2F-4D1B-8F55-E66270563B26}")
public interface Affinity extends Shape {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "CatiaV5TypeLibs.PartItfTypeLib.HybridShape"
   * </p>
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.HybridShape
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(22)
  HybridShape hybridShape();


  // Properties:
}
