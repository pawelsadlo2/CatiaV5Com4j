package CatiaV5TypeLibs.PartTypeLib;
import CatiaV5TypeLibs.InfTypeLib.*;
import CatiaV5TypeLibs.MecModTypeLib.*;
import CatiaV5TypeLibs.KnowledgewareTypeLib.*;

import com4j.*;

@IID("{FEDB0681-997D-11D2-8AE8-0008C719428C}")
public interface UserPattern extends Pattern {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "FeatureToLocatePositions"
   * </p>
   * @return  Returns a value of type AnyObject
   */

  @DISPID(1611137024) //= 0x60080000. The runtime will prefer the VTID if present
  @VTID(27)
  AnyObject featureToLocatePositions();


  /**
   * <p>
   * Getter method for the COM property "AnchorPoint"
   * </p>
   * @return  Returns a value of type AnyObject
   */

  @DISPID(1611137025) //= 0x60080001. The runtime will prefer the VTID if present
  @VTID(28)
  AnyObject anchorPoint();


  /**
   * <p>
   * Setter method for the COM property "AnchorPoint"
   * </p>
   * @param oAnchorPoint Mandatory AnyObject parameter.
   */

  @DISPID(1611137025) //= 0x60080001. The runtime will prefer the VTID if present
  @VTID(29)
  void anchorPoint(
    AnyObject oAnchorPoint);


  /**
   * @param iFeatureToLocatePositions Mandatory AnyObject parameter.
   */

  @DISPID(1611137027) //= 0x60080003. The runtime will prefer the VTID if present
  @VTID(30)
  void addFeatureToLocatePositions(
    AnyObject iFeatureToLocatePositions);


  // Properties:
}
