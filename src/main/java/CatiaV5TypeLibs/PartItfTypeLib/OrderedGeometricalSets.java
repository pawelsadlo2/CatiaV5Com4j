package CatiaV5TypeLibs.PartItfTypeLib;

import com4j.DISPID;
import com4j.IID;
import com4j.VTID;
import CatiaV5TypeLibs.InfItfTypeLib.*;

@IID("{E2277638-E3C1-4430-800E-14F232A52F69}")
public interface OrderedGeometricalSets extends Collection {
  // Methods:
  /**
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.OrderedGeometricalSet
   */

  @DISPID(1610940416) //= 0x60050000. The runtime will prefer the VTID if present
  @VTID(23)
  OrderedGeometricalSet add();


  /**
   * @param iIndex Mandatory java.lang.Object parameter.
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.OrderedGeometricalSet
   */

  @DISPID(1610940417) //= 0x60050001. The runtime will prefer the VTID if present
  @VTID(24)
  OrderedGeometricalSet item(
    java.lang.Object iIndex);


  // Properties:
}
