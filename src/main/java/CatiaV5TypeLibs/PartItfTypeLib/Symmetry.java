package CatiaV5TypeLibs.PartItfTypeLib;

import com4j.DISPID;
import com4j.IID;
import com4j.VTID;
import CatiaV5TypeLibs.InfItfTypeLib.*;

@IID("{CDC680E0-FCDF-11D4-9EFC-00508B5FE787}")
public interface Symmetry extends Shape {
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
