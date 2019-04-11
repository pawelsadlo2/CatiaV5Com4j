package CatiaV5TypeLibs.PartItfTypeLib;

import com4j.DISPID;
import com4j.Holder;
import com4j.IID;
import com4j.VTID;
import CatiaV5TypeLibs.InfItfTypeLib.*;

@IID("{299B41D0-B0A6-11D4-A38C-00D0B7AC63BE}")
public interface Optimizations extends Collection {
  // Methods:
  /**
   * @param iIndex Mandatory java.lang.Object parameter.
   * @return  Returns a value of type AnyObject
   */

  @DISPID(1610940416) //= 0x60050000. The runtime will prefer the VTID if present
  @VTID(23)
  AnyObject item(
    java.lang.Object iIndex);


  /**
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.Optimization
   */

  @DISPID(1610940417) //= 0x60050001. The runtime will prefer the VTID if present
  @VTID(24)
  Optimization createOptimization();


  /**
   * @param iName Mandatory Holder<java.lang.String> parameter.
   * @param iComment Mandatory Holder<java.lang.String> parameter.
   * @param iFormulaBody Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.SetOfEquation
   */

  @DISPID(1610940418) //= 0x60050002. The runtime will prefer the VTID if present
  @VTID(25)
  SetOfEquation createConstraintsSatisfaction(
    Holder<java.lang.String> iName,
    Holder<java.lang.String> iComment,
    Holder<java.lang.String> iFormulaBody);


  // Properties:
}
