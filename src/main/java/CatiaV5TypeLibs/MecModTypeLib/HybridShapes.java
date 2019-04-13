package CatiaV5TypeLibs.MecModTypeLib;
import CatiaV5TypeLibs.KnowledgewareTypeLib.*;

import CatiaV5TypeLibs.InfTypeLib.*;
import com4j.*;

@IID("{89734E01-834A-0000-0280-020C70000000}")
public interface HybridShapes extends Collection {
  // Methods:
  /**
   * @param iIndex Mandatory java.lang.Object parameter.
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.HybridShape
   */

  @DISPID(1610940416) //= 0x60050000. The runtime will prefer the VTID if present
  @VTID(23)
  HybridShape item(
    java.lang.Object iIndex);


  /**
   * @param iLabel Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.Boundary
   */

  @DISPID(1610940417) //= 0x60050001. The runtime will prefer the VTID if present
  @VTID(24)
  Boundary getBoundary(
    Holder<java.lang.String> iLabel);


  // Properties:
}
