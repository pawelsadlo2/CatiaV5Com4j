package CatiaV5TypeLibs.InfItfTypeLib;

import com4j.*;

@IID("{21E56FA8-C455-11D3-B85C-0008C7191EA2}")
public interface TextStream extends AnyObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "AtEndOfLine"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610940416) //= 0x60050000. The runtime will prefer the VTID if present
  @VTID(22)
  boolean atEndOfLine();


  /**
   * <p>
   * Getter method for the COM property "AtEndOfStream"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610940417) //= 0x60050001. The runtime will prefer the VTID if present
  @VTID(23)
  boolean atEndOfStream();


  /**
   */

  @DISPID(1610940418) //= 0x60050002. The runtime will prefer the VTID if present
  @VTID(24)
  void close();


  /**
   * @param iNumOfChar Mandatory int parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610940419) //= 0x60050003. The runtime will prefer the VTID if present
  @VTID(25)
  java.lang.String read(
    int iNumOfChar);


  /**
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610940420) //= 0x60050004. The runtime will prefer the VTID if present
  @VTID(26)
  java.lang.String readLine();


  /**
   * @param iWrittenString Mandatory Holder<java.lang.String> parameter.
   */

  @DISPID(1610940421) //= 0x60050005. The runtime will prefer the VTID if present
  @VTID(27)
  void write(
    Holder<java.lang.String> iWrittenString);


  // Properties:
}
