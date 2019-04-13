import com4j.*;

@IID("{80BA687F-12CE-0000-0280-030BA6000000}")
public interface Camera extends AnyObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Type"
   * </p>
   * @return  Returns a value of type CatCameraType
   */

  @DISPID(1610940416) //= 0x60050000. The runtime will prefer the VTID if present
  @VTID(22)
  CatCameraType type();


  // Properties:
}
