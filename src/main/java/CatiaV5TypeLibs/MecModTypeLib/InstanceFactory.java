import CatiaV5TypeLibs.InfTypeLib.*;
import com4j.*;

@IID("{FC7949EC-BC89-11D5-A396-00D0B7AC7ADB}")
public interface InstanceFactory extends Factory {
  // Methods:
  /**
   * @param iReference Mandatory AnyObject parameter.
   * @return  Returns a value of type AnyObject
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(22)
  AnyObject addInstance(
    AnyObject iReference);


  /**
   * @param iNameOfReference Mandatory Holder<java.lang.String> parameter.
   * @param iNameOfDocument Mandatory Holder<java.lang.String> parameter.
   */

  @DISPID(1611005953) //= 0x60060001. The runtime will prefer the VTID if present
  @VTID(23)
  void beginInstanceFactory(
    Holder<java.lang.String> iNameOfReference,
    Holder<java.lang.String> iNameOfDocument);


  /**
   */

  @DISPID(1611005954) //= 0x60060002. The runtime will prefer the VTID if present
  @VTID(24)
  void beginInstantiate();


  /**
   * @param iName Mandatory Holder<java.lang.String> parameter.
   * @param iInput Mandatory CATBaseDispatch parameter.
   */

  @DISPID(1611005955) //= 0x60060003. The runtime will prefer the VTID if present
  @VTID(25)
  void putInputData(
    Holder<java.lang.String> iName,
    CATBaseDispatch iInput);


  /**
   * @param iName Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type AnyObject
   */

  @DISPID(1611005956) //= 0x60060004. The runtime will prefer the VTID if present
  @VTID(26)
  AnyObject getParameter(
    Holder<java.lang.String> iName);


  /**
   * @return  Returns a value of type AnyObject
   */

  @DISPID(1611005957) //= 0x60060005. The runtime will prefer the VTID if present
  @VTID(27)
  AnyObject instantiate();


  /**
   */

  @DISPID(1611005958) //= 0x60060006. The runtime will prefer the VTID if present
  @VTID(28)
  void endInstantiate();


  /**
   */

  @DISPID(1611005959) //= 0x60060007. The runtime will prefer the VTID if present
  @VTID(29)
  void endInstanceFactory();


  // Properties:
}
