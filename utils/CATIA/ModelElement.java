import com4j.*;

@IID("{7A4B1870-C639-11D6-8055-0010B5FA1031}")
public interface ModelElement extends CATBaseDispatch {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "InternalName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610874880) //= 0x60040000. The runtime will prefer the VTID if present
  @VTID(17)
  java.lang.String internalName();


  /**
   * <p>
   * Getter method for the COM property "DisplayName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610874881) //= 0x60040001. The runtime will prefer the VTID if present
  @VTID(18)
  java.lang.String displayName();


  /**
   * <p>
   * Setter method for the COM property "DisplayName"
   * </p>
   * @param ioDisplayName Mandatory Holder<java.lang.String> parameter.
   */

  @DISPID(1610874881) //= 0x60040001. The runtime will prefer the VTID if present
  @VTID(19)
  void displayName(
    Holder<java.lang.String> ioDisplayName);


  /**
   * <p>
   * Getter method for the COM property "Document"
   * </p>
   * @return  Returns a value of type Document
   */

  @DISPID(1610874883) //= 0x60040003. The runtime will prefer the VTID if present
  @VTID(20)
  Document document();


  // Properties:
}
