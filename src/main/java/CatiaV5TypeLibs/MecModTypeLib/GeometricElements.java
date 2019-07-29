package CatiaV5TypeLibs.MecModTypeLib;
import CatiaV5TypeLibs.InfTypeLib.*;
import CatiaV5TypeLibs.MecModTypeLib.*;
import CatiaV5TypeLibs.KnowledgewareTypeLib.*;

import com4j.*;

@IID("{6ECEC8A4-6A86-11D1-A280-0000F87546FD}")
public interface GeometricElements extends Collection {
  // Methods:
  /**
   * @param iIndex Mandatory java.lang.Object parameter.
   * @return  Returns a value of type GeometricElement
   */

  @DISPID(1610940416) //= 0x60050000. The runtime will prefer the VTID if present
  @VTID(23)
  GeometricElement item(
    java.lang.Object iIndex);


  // Properties:
}
