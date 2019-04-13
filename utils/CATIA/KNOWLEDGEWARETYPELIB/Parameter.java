import com4j.*;

@IID("{633D122D-51C9-11D1-A271-0000F87546FD}")
public interface Parameter extends AnyObject {
  // Methods:
  /**
   * @param iValue Mandatory Holder<java.lang.String> parameter.
   */

  @DISPID(1610940416) //= 0x60050000. The runtime will prefer the VTID if present
  @VTID(22)
  void valuateFromString(
    Holder<java.lang.String> iValue);


  /**
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610940417) //= 0x60050001. The runtime will prefer the VTID if present
  @VTID(23)
  java.lang.String valueAsString();


  /**
   * <p>
   * Getter method for the COM property "OptionalRelation"
   * </p>
   * @return  Returns a value of type Relation
   */

  @DISPID(1610940418) //= 0x60050002. The runtime will prefer the VTID if present
  @VTID(24)
  Relation optionalRelation();


  /**
   * <p>
   * Getter method for the COM property "ReadOnly"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610940419) //= 0x60050003. The runtime will prefer the VTID if present
  @VTID(25)
  boolean readOnly();


  /**
   * @param iName Mandatory Holder<java.lang.String> parameter.
   */

  @DISPID(1610940420) //= 0x60050004. The runtime will prefer the VTID if present
  @VTID(26)
  void rename(
    Holder<java.lang.String> iName);


  /**
   * <p>
   * Getter method for the COM property "Comment"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610940421) //= 0x60050005. The runtime will prefer the VTID if present
  @VTID(27)
  java.lang.String comment();


  /**
   * <p>
   * Setter method for the COM property "Comment"
   * </p>
   * @param oComment Mandatory Holder<java.lang.String> parameter.
   */

  @DISPID(1610940421) //= 0x60050005. The runtime will prefer the VTID if present
  @VTID(28)
  void comment(
    Holder<java.lang.String> oComment);


  /**
   * <p>
   * Getter method for the COM property "Hidden"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610940423) //= 0x60050007. The runtime will prefer the VTID if present
  @VTID(29)
  boolean hidden();


  /**
   * <p>
   * Setter method for the COM property "Hidden"
   * </p>
   * @param oHidden Mandatory boolean parameter.
   */

  @DISPID(1610940423) //= 0x60050007. The runtime will prefer the VTID if present
  @VTID(30)
  void hidden(
    boolean oHidden);


  /**
   * <p>
   * Getter method for the COM property "UserAccessMode"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610940425) //= 0x60050009. The runtime will prefer the VTID if present
  @VTID(31)
  int userAccessMode();


  /**
   * <p>
   * Getter method for the COM property "Context"
   * </p>
   * @return  Returns a value of type AnyObject
   */

  @DISPID(1610940426) //= 0x6005000a. The runtime will prefer the VTID if present
  @VTID(32)
  AnyObject context();


  /**
   * <p>
   * Getter method for the COM property "Renamed"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610940427) //= 0x6005000b. The runtime will prefer the VTID if present
  @VTID(33)
  boolean renamed();


  /**
   * <p>
   * Getter method for the COM property "IsTrueParameter"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610940428) //= 0x6005000c. The runtime will prefer the VTID if present
  @VTID(34)
  boolean isTrueParameter();


  // Properties:
}
