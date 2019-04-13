import com4j.*;

@IID("{6E155DC8-7916-11D6-BEA8-0002B349A513}")
public interface List extends Collection {
  // Methods:
  /**
   * @param iIndex Mandatory java.lang.Object parameter.
   * @return  Returns a value of type AnyObject
   */

  @DISPID(1610940416) //= 0x60050000. The runtime will prefer the VTID if present
  @VTID(23)
  AnyObject item(
    java.lang.Object iIndex);


  /**
   * @param iIndex Mandatory java.lang.Object parameter.
   * @param iItemValue Mandatory AnyObject parameter.
   */

  @DISPID(1610940417) //= 0x60050001. The runtime will prefer the VTID if present
  @VTID(24)
  void replace(
    java.lang.Object iIndex,
    AnyObject iItemValue);


  /**
   * @param iItemValue Mandatory AnyObject parameter.
   */

  @DISPID(1610940418) //= 0x60050002. The runtime will prefer the VTID if present
  @VTID(25)
  void add(
    AnyObject iItemValue);


  /**
   * @param iIndexCurrent Mandatory java.lang.Object parameter.
   * @param iIndexTarget Mandatory java.lang.Object parameter.
   */

  @DISPID(1610940419) //= 0x60050003. The runtime will prefer the VTID if present
  @VTID(26)
  void reorder(
    java.lang.Object iIndexCurrent,
    java.lang.Object iIndexTarget);


  /**
   * @param iIndex Mandatory java.lang.Object parameter.
   */

  @DISPID(1610940420) //= 0x60050004. The runtime will prefer the VTID if present
  @VTID(27)
  void remove(
    java.lang.Object iIndex);


  /**
   * <p>
   * Getter method for the COM property "FeatureGenerator"
   * </p>
   * @return  Returns a value of type FeatureGenerator
   */

  @DISPID(1610940421) //= 0x60050005. The runtime will prefer the VTID if present
  @VTID(28)
  FeatureGenerator featureGenerator();


  // Properties:
}
