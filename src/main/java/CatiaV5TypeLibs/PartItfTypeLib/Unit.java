package CatiaV5TypeLibs.PartItfTypeLib;

import com4j.DISPID;
import com4j.IID;
import com4j.VTID;
import CatiaV5TypeLibs.InfItfTypeLib.*;

@IID("{DD507FE4-A8F2-11D5-A39E-00D0B7AC63BE}")
public interface Unit extends AnyObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Magnitude"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610940416) //= 0x60050000. The runtime will prefer the VTID if present
  @VTID(22)
  java.lang.String magnitude();


  /**
   * <p>
   * Getter method for the COM property "Symbol"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610940417) //= 0x60050001. The runtime will prefer the VTID if present
  @VTID(23)
  java.lang.String symbol();


  /**
   * @param iValueInThisUnit Mandatory double parameter.
   * @return  Returns a value of type double
   */

  @DISPID(1610940418) //= 0x60050002. The runtime will prefer the VTID if present
  @VTID(24)
  double convertToMKS(
    double iValueInThisUnit);


  /**
   * @param iValueInMKS Mandatory double parameter.
   * @return  Returns a value of type double
   */

  @DISPID(1610940419) //= 0x60050003. The runtime will prefer the VTID if present
  @VTID(25)
  double convertFromMKS(
    double iValueInMKS);


  /**
   * @param iValueInThisUnit Mandatory double parameter.
   * @return  Returns a value of type double
   */

  @DISPID(1610940420) //= 0x60050004. The runtime will prefer the VTID if present
  @VTID(26)
  double convertToStorageUnit(
    double iValueInThisUnit);


  /**
   * @param iValueInStorageUnit Mandatory double parameter.
   * @return  Returns a value of type double
   */

  @DISPID(1610940421) //= 0x60050005. The runtime will prefer the VTID if present
  @VTID(27)
  double convertFromStorageUnit(
    double iValueInStorageUnit);


  // Properties:
}
