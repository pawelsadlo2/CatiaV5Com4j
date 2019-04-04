import com4j.*;

@IID("{50305E98-2949-11D3-B051-006094EB7CE3}")
public interface Attachments extends AnyObject {
  // Methods:
  /**
   * @param iFilePath Mandatory Holder<java.lang.String> parameter.
   * @param iTmpFilePath Mandatory Holder<java.lang.String> parameter.
   */

  @DISPID(1610940416) //= 0x60050000. The runtime will prefer the VTID if present
  @VTID(22)
  void add(
    Holder<java.lang.String> iFilePath,
    Holder<java.lang.String> iTmpFilePath);


  /**
   */

  @DISPID(1610940417) //= 0x60050001. The runtime will prefer the VTID if present
  @VTID(23)
  void removeAll();


  // Properties:
}
