import com4j.*;

@IID("{DB27F662-21F0-11D6-99B2-00D0590B48C5}")
public interface FeatureGenerator extends AnyObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Script"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610940416) //= 0x60050000. The runtime will prefer the VTID if present
  @VTID(22)
  java.lang.String script();


  /**
   * <p>
   * Setter method for the COM property "Script"
   * </p>
   * @param oValue Mandatory Holder<java.lang.String> parameter.
   */

  @DISPID(1610940416) //= 0x60050000. The runtime will prefer the VTID if present
  @VTID(23)
  void script(
    Holder<java.lang.String> oValue);


  /**
   * @param iFilePath Mandatory Holder<java.lang.String> parameter.
   */

  @DISPID(1610940418) //= 0x60050002. The runtime will prefer the VTID if present
  @VTID(24)
  void loadScriptFromFilePath(
    Holder<java.lang.String> iFilePath);


  /**
   * @param iContext Mandatory AnyObject parameter.
   */

  @DISPID(1610940419) //= 0x60050003. The runtime will prefer the VTID if present
  @VTID(25)
  void generate(
    AnyObject iContext);


  /**
   * @param iInputsArray Mandatory java.lang.Object[] parameter.
   */

  @DISPID(1610940420) //= 0x60050004. The runtime will prefer the VTID if present
  @VTID(26)
  void generateInContext(
    java.lang.Object[] iInputsArray);


  /**
   * <p>
   * Getter method for the COM property "NbGeneratedFeatures"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610940421) //= 0x60050005. The runtime will prefer the VTID if present
  @VTID(27)
  int nbGeneratedFeatures();


  // Properties:
}
