import com4j.*;

@IID("{010508C6-7218-11D1-A5EE-00A0C9575177}")
public interface SystemService extends AnyObject {
  // Methods:
  /**
   * @param iEnvString Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610940416) //= 0x60050000. The runtime will prefer the VTID if present
  @VTID(22)
  java.lang.String environ(
    Holder<java.lang.String> iEnvString);


  /**
   * @param iString Mandatory Holder<java.lang.String> parameter.
   */

  @DISPID(1610940417) //= 0x60050001. The runtime will prefer the VTID if present
  @VTID(23)
  void print(
    Holder<java.lang.String> iString);


  /**
   * @param iExecutablePath Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type int
   */

  @DISPID(1610940418) //= 0x60050002. The runtime will prefer the VTID if present
  @VTID(24)
  int executeProcessus(
    Holder<java.lang.String> iExecutablePath);


  /**
   * @param iExecutablePath Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type int
   */

  @DISPID(1610940419) //= 0x60050003. The runtime will prefer the VTID if present
  @VTID(25)
  int executeBackgroundProcessus(
    Holder<java.lang.String> iExecutablePath);


  /**
   * @param iLibraryName Mandatory Holder<java.lang.String> parameter.
   * @param iType Mandatory CatScriptLibraryType parameter.
   * @param iProgramName Mandatory Holder<java.lang.String> parameter.
   * @param iFunctionName Mandatory Holder<java.lang.String> parameter.
   * @param iParameters Mandatory java.lang.Object[] parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(1610940420) //= 0x60050004. The runtime will prefer the VTID if present
  @VTID(26)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object executeScript(
    Holder<java.lang.String> iLibraryName,
    CatScriptLibraryType iType,
    Holder<java.lang.String> iProgramName,
    Holder<java.lang.String> iFunctionName,
    java.lang.Object[] iParameters);


  /**
   * @param iScriptText Mandatory Holder<java.lang.String> parameter.
   * @param iLanguage Mandatory CATScriptLanguage parameter.
   * @param iFunctionName Mandatory Holder<java.lang.String> parameter.
   * @param iParameters Mandatory java.lang.Object[] parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(1610940421) //= 0x60050005. The runtime will prefer the VTID if present
  @VTID(27)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object evaluate(
    Holder<java.lang.String> iScriptText,
    CATScriptLanguage iLanguage,
    Holder<java.lang.String> iFunctionName,
    java.lang.Object[] iParameters);


  // Properties:
}
