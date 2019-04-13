package CatiaV5TypeLibs.PartTypeLib;
import CatiaV5TypeLibs.InfTypeLib.*;
import CatiaV5TypeLibs.MecModTypeLib.*;
import CatiaV5TypeLibs.KnowledgewareTypeLib.*;

import com4j.*;

@IID("{629953B8-6745-11D1-A27F-0000F87546FD}")
public interface AngularRepartition extends Repartition {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "AngularSpacing"
   * </p>
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.Angle
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(23)
  Angle angularSpacing();


  /**
   * <p>
   * Getter method for the COM property "InstanceSpacing"
   * </p>
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.Angle
   */

  @DISPID(1611005953) //= 0x60060001. The runtime will prefer the VTID if present
  @VTID(24)
  Angle instanceSpacing();


  // Properties:
}
