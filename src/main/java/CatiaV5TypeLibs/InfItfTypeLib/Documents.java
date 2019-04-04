package CatiaV5TypeLibs.InfItfTypeLib;

import com4j.*;

@IID("{7FBD9BE6-3CBE-0000-0280-030BA6000000}")
public interface Documents extends Collection {
  // Methods:
  /**
   * @param docType Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type Document
   */

  @DISPID(1610940416) //= 0x60050000. The runtime will prefer the VTID if present
  @VTID(23)
  Document add(
    Holder<java.lang.String> docType);


  /**
   * @param iIndex Mandatory java.lang.Object parameter.
   * @return  Returns a value of type Document
   */

  @DISPID(1610940417) //= 0x60050001. The runtime will prefer the VTID if present
  @VTID(24)
  Document item(
    java.lang.Object iIndex);


  /**
   * @param iFileName Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type Document
   */

  @DISPID(1610940418) //= 0x60050002. The runtime will prefer the VTID if present
  @VTID(25)
  Document open(
    Holder<java.lang.String> iFileName);


  /**
   * @param iFileName Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type Document
   */

  @DISPID(1610940419) //= 0x60050003. The runtime will prefer the VTID if present
  @VTID(26)
  Document read(
    Holder<java.lang.String> iFileName);


  /**
   * @param iFileName Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type Document
   */

  @DISPID(1610940420) //= 0x60050004. The runtime will prefer the VTID if present
  @VTID(27)
  Document newFrom(
    Holder<java.lang.String> iFileName);


  // Properties:
}
