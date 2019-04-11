package CatiaV5TypeLibs.PartItfTypeLib;

import com4j.DISPID;
import com4j.IID;
import com4j.VTID;
import CatiaV5TypeLibs.InfItfTypeLib.*;

@IID("{BB818311-B192-46BE-ABC4-B55ED69DD092}")
public interface ParameterSet extends AnyObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "CatiaV5TypeLibs.PartItfTypeLib.ParameterSets"
   * </p>
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.ParameterSets
   */

  @DISPID(1610940416) //= 0x60050000. The runtime will prefer the VTID if present
  @VTID(22)
  ParameterSets parameterSets();


  /**
   * <p>
   * Getter method for the COM property "DirectParameters"
   * </p>
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.Parameters
   */

  @DISPID(1610940417) //= 0x60050001. The runtime will prefer the VTID if present
  @VTID(23)
  Parameters directParameters();


  /**
   * <p>
   * Getter method for the COM property "AllParameters"
   * </p>
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.Parameters
   */

  @DISPID(1610940418) //= 0x60050002. The runtime will prefer the VTID if present
  @VTID(24)
  Parameters allParameters();


  // Properties:
}
