package CatiaV5TypeLibs.PartTypeLib;
import CatiaV5TypeLibs.InfTypeLib.*;
import CatiaV5TypeLibs.MecModTypeLib.*;
import CatiaV5TypeLibs.KnowledgewareTypeLib.*;

import com4j.*;

@IID("{EFF6B576-55F6-11D1-A272-0000F87546FD}")
public interface SketchBasedShape extends Shape {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "CatiaV5TypeLibs.PartItfTypeLib.Sketch"
   * </p>
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.Sketch
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(22)
  Sketch sketch();


  /**
   * @param iProfileElement Mandatory Reference parameter.
   */

  @DISPID(1611005953) //= 0x60060001. The runtime will prefer the VTID if present
  @VTID(23)
  void setProfileElement(
    Reference iProfileElement);


  // Properties:
}
