package CatiaV5TypeLibs.PartItfTypeLib;

import com4j.DISPID;
import com4j.IID;
import com4j.VTID;
import CatiaV5TypeLibs.InfItfTypeLib.*;

@IID("{4B220C60-2412-41BC-8B9C-B5E7718DAE5F}")
public interface KnowledgeObject extends AnyObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Hidden"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610940416) //= 0x60050000. The runtime will prefer the VTID if present
  @VTID(22)
  boolean hidden();


  /**
   * <p>
   * Setter method for the COM property "Hidden"
   * </p>
   * @param oHidden Mandatory boolean parameter.
   */

  @DISPID(1610940416) //= 0x60050000. The runtime will prefer the VTID if present
  @VTID(23)
  void hidden(
    boolean oHidden);


  /**
   * <p>
   * Getter method for the COM property "IsConst"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610940418) //= 0x60050002. The runtime will prefer the VTID if present
  @VTID(24)
  boolean isConst();


  /**
   * <p>
   * Setter method for the COM property "IsConst"
   * </p>
   * @param oIsConst Mandatory boolean parameter.
   */

  @DISPID(1610940418) //= 0x60050002. The runtime will prefer the VTID if present
  @VTID(25)
  void isConst(
    boolean oIsConst);


  // Properties:
}
