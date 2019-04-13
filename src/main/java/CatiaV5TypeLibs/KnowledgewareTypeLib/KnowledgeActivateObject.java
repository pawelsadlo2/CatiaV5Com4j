package CatiaV5TypeLibs.KnowledgewareTypeLib;
import CatiaV5TypeLibs.InfTypeLib.*;

import com4j.*;

@IID("{7B0EC7EB-9EC6-4193-95CB-47AA52F757DA}")
public interface KnowledgeActivateObject extends KnowledgeObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Activated"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(26)
  boolean activated();


  /**
   */

  @DISPID(1611005953) //= 0x60060001. The runtime will prefer the VTID if present
  @VTID(27)
  void activate();


  /**
   */

  @DISPID(1611005954) //= 0x60060002. The runtime will prefer the VTID if present
  @VTID(28)
  void deactivate();


  // Properties:
}
