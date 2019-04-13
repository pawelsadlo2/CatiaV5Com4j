package CatiaV5TypeLibs.HybridShapeTypeLib;
import CatiaV5TypeLibs.InfTypeLib.*;
import CatiaV5TypeLibs.MecModTypeLib.*;
import CatiaV5TypeLibs.KnowledgewareTypeLib.*;

import com4j.*;

@IID("{9BABE7DE-6A87-11D1-A280-0000F87546FD}")
public interface GeometricElement extends AnyObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "GeometricType"
   * </p>
   * @return  Returns a value of type CatGeometricType
   */

  @DISPID(1610940416) //= 0x60050000. The runtime will prefer the VTID if present
  @VTID(22)
  CatGeometricType geometricType();


  // Properties:
}
