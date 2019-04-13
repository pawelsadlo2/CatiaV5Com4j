package CatiaV5TypeLibs.PartTypeLib;
import CatiaV5TypeLibs.InfTypeLib.*;
import CatiaV5TypeLibs.MecModTypeLib.*;
import CatiaV5TypeLibs.KnowledgewareTypeLib.*;

import com4j.*;

@IID("{E9500386-7A60-4074-AFE6-97DC747350C7}")
public interface ReplaceFace extends SurfaceBasedShape {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "CatiaV5TypeLibs.PartItfTypeLib.RemoveFace"
   * </p>
   * @return  Returns a value of type References
   */

  @DISPID(1611071488) //= 0x60070000. The runtime will prefer the VTID if present
  @VTID(24)
  References removeFace();


  /**
   * <p>
   * Getter method for the COM property "SplittingSide"
   * </p>
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.CatSplitSide
   */

  @DISPID(1611071489) //= 0x60070001. The runtime will prefer the VTID if present
  @VTID(25)
  CatSplitSide splittingSide();


  /**
   * <p>
   * Setter method for the COM property "SplittingSide"
   * </p>
   * @param oSplittingSide Mandatory CatiaV5TypeLibs.PartItfTypeLib.CatSplitSide parameter.
   */

  @DISPID(1611071489) //= 0x60070001. The runtime will prefer the VTID if present
  @VTID(26)
  void splittingSide(
    CatSplitSide oSplittingSide);


  /**
   * @param iRemoveFace Mandatory Reference parameter.
   */

  @DISPID(1611071491) //= 0x60070003. The runtime will prefer the VTID if present
  @VTID(27)
  void deleteRemoveFace(
    Reference iRemoveFace);


  /**
   * @param iRemoveFace Mandatory Reference parameter.
   */

  @DISPID(1611071492) //= 0x60070004. The runtime will prefer the VTID if present
  @VTID(28)
  void addRemoveFace(
    Reference iRemoveFace);


  /**
   * @param iSplitPlane Mandatory Reference parameter.
   */

  @DISPID(1611071493) //= 0x60070005. The runtime will prefer the VTID if present
  @VTID(29)
  void addSplitPlane(
    Reference iSplitPlane);


  // Properties:
}
