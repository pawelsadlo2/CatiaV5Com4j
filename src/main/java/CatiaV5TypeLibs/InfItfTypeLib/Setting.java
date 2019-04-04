package CatiaV5TypeLibs.InfItfTypeLib;

import com4j.*;

@IID("{082B1347-9B29-458F-A757-D5A2466252F0}")
public interface Setting extends AnyObject {
  // Methods:
  /**
   * <p>
   * Setter method for the COM property "Value"
   * </p>
   * @param oValue Mandatory java.lang.Object parameter.
   */

  @DISPID(1610940416) //= 0x60050000. The runtime will prefer the VTID if present
  @VTID(22)
  void value(
    java.lang.Object oValue);


  /**
   * <p>
   * Getter method for the COM property "Value"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(1610940416) //= 0x60050000. The runtime will prefer the VTID if present
  @VTID(23)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object value();


  /**
   * <p>
   * Getter method for the COM property "LockState"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610940418) //= 0x60050002. The runtime will prefer the VTID if present
  @VTID(24)
  boolean lockState();


  /**
   * <p>
   * Setter method for the COM property "LockState"
   * </p>
   * @param oLocked Mandatory boolean parameter.
   */

  @DISPID(1610940418) //= 0x60050002. The runtime will prefer the VTID if present
  @VTID(25)
  void lockState(
    boolean oLocked);


  /**
   * <p>
   * Getter method for the COM property "AdminLevel"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610940420) //= 0x60050004. The runtime will prefer the VTID if present
  @VTID(26)
  java.lang.String adminLevel();


  /**
   * <p>
   * Getter method for the COM property "IsModified"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610940421) //= 0x60050005. The runtime will prefer the VTID if present
  @VTID(27)
  boolean isModified();


  // Properties:
}
