package CatiaV5TypeLibs.PartItfTypeLib;

import com4j.DISPID;
import com4j.Holder;
import com4j.IID;
import com4j.VTID;
import CatiaV5TypeLibs.InfItfTypeLib.*;

@IID("{72E2B242-BA26-11D4-A38D-00D0B7AC63BE}")
public interface OptimizationConstraints extends Collection {
  // Methods:
  /**
   * @param iIndex Mandatory java.lang.Object parameter.
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.OptimizationConstraint
   */

  @DISPID(1610940416) //= 0x60050000. The runtime will prefer the VTID if present
  @VTID(23)
  OptimizationConstraint item(
    java.lang.Object iIndex);


  /**
   * @param constraintExpression Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.OptimizationConstraint
   */

  @DISPID(1610940417) //= 0x60050001. The runtime will prefer the VTID if present
  @VTID(24)
  OptimizationConstraint addConstraint(
    Holder<java.lang.String> constraintExpression);


  /**
   * @param iIndex Mandatory java.lang.Object parameter.
   */

  @DISPID(1610940418) //= 0x60050002. The runtime will prefer the VTID if present
  @VTID(25)
  void removeConstraint(
    java.lang.Object iIndex);


  // Properties:
}
