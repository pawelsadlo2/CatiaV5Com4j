package CatiaV5TypeLibs.PartTypeLib;
import CatiaV5TypeLibs.InfTypeLib.*;
import CatiaV5TypeLibs.MecModTypeLib.*;
import CatiaV5TypeLibs.KnowledgewareTypeLib.*;

import com4j.*;

@IID("{01032317-98BF-11D2-9F85-0008C7CA6093}")
public interface ThickSurface extends SurfaceBasedShape {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "TopOffset"
   * </p>
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.Length
   */

  @DISPID(1611071488) //= 0x60070000. The runtime will prefer the VTID if present
  @VTID(24)
  Length topOffset();


  /**
   * <p>
   * Getter method for the COM property "BotOffset"
   * </p>
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.Length
   */

  @DISPID(1611071489) //= 0x60070001. The runtime will prefer the VTID if present
  @VTID(25)
  Length botOffset();


  /**
   * <p>
   * Getter method for the COM property "OffsetSide"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611071490) //= 0x60070002. The runtime will prefer the VTID if present
  @VTID(26)
  int offsetSide();


  /**
   */

  @DISPID(1611071491) //= 0x60070003. The runtime will prefer the VTID if present
  @VTID(27)
  void swap_OffsetSide();


  // Properties:
}
