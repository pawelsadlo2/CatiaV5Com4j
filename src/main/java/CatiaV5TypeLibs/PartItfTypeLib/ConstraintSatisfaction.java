package CatiaV5TypeLibs.PartItfTypeLib;

import com4j.DISPID;
import com4j.IID;
import com4j.VTID;
import CatiaV5TypeLibs.InfItfTypeLib.*;

@IID("{B0814111-8916-11D6-807A-0010B5D45472}")
public interface ConstraintSatisfaction extends SetOfEquation {
  // Methods:
  /**
   */

  @DISPID(1611202560) //= 0x60090000. The runtime will prefer the VTID if present
  @VTID(50)
  void solve();


  // Properties:
}