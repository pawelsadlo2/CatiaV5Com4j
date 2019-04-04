import com4j.*;

@IID("{CAFF2870-C44A-11D3-B85C-0008C7191EA2}")
public interface File extends FileComponent {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Size"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(25)
  int size();


  /**
   * <p>
   * Getter method for the COM property "Type"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1611005953) //= 0x60060001. The runtime will prefer the VTID if present
  @VTID(26)
  java.lang.String type();


  /**
   * @param iMode Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type TextStream
   */

  @DISPID(1611005954) //= 0x60060002. The runtime will prefer the VTID if present
  @VTID(27)
  TextStream openAsTextStream(
    Holder<java.lang.String> iMode);


  // Properties:
}
