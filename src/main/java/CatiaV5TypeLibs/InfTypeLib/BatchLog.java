package CatiaV5TypeLibs.InfTypeLib;

import com4j.*;

@IID("{1C16BAAC-D500-11D4-85BB-00508B675233}")
public interface BatchLog extends AnyObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Path"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610940416) //= 0x60050000. The runtime will prefer the VTID if present
  @VTID(22)
  java.lang.String path();


  /**
   * <p>
   * Setter method for the COM property "Path"
   * </p>
   * @param oPath Mandatory Holder<java.lang.String> parameter.
   */

  @DISPID(1610940416) //= 0x60050000. The runtime will prefer the VTID if present
  @VTID(23)
  void path(
    Holder<java.lang.String> oPath);


  /**
   * <p>
   * Getter method for the COM property "OverWrite"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610940418) //= 0x60050002. The runtime will prefer the VTID if present
  @VTID(24)
  boolean overWrite();


  /**
   * <p>
   * Setter method for the COM property "OverWrite"
   * </p>
   * @param overWrite Mandatory boolean parameter.
   */

  @DISPID(1610940418) //= 0x60050002. The runtime will prefer the VTID if present
  @VTID(25)
  void overWrite(
    boolean overWrite);


  /**
   * @param iWrittenString Mandatory Holder<java.lang.String> parameter.
   */

  @DISPID(1610940420) //= 0x60050004. The runtime will prefer the VTID if present
  @VTID(26)
  void write(
    Holder<java.lang.String> iWrittenString);


  // Properties:
}
