package CatiaV5TypeLibs.PartItfTypeLib;

import com4j.DISPID;
import com4j.IID;
import com4j.VTID;
import CatiaV5TypeLibs.InfItfTypeLib.*;

@IID("{C88E60D1-997F-11D2-8AE8-0008C719428C}")
public interface UserRepartition extends Repartition {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "FeatureToLocatePositions"
   * </p>
   * @return  Returns a value of type AnyObject
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(23)
  AnyObject featureToLocatePositions();


  /**
   * @param iFeatureToLocatePositions Mandatory AnyObject parameter.
   */

  @DISPID(1611005953) //= 0x60060001. The runtime will prefer the VTID if present
  @VTID(24)
  void addFeatureToLocatePositions(
    AnyObject iFeatureToLocatePositions);


  // Properties:
}
