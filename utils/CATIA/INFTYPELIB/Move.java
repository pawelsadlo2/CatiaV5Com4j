import com4j.*;

@IID("{8DB9CA92-9403-11D1-A5E2-00A0C95AF74C}")
public interface Move extends AnyObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "MovableObject"
   * </p>
   * @return  Returns a value of type Move
   */

  @DISPID(1610940416) //= 0x60050000. The runtime will prefer the VTID if present
  @VTID(22)
  Move movableObject();


  /**
   * @param iTransformationArray Mandatory java.lang.Object[] parameter.
   */

  @DISPID(1610940417) //= 0x60050001. The runtime will prefer the VTID if present
  @VTID(23)
  void apply(
    java.lang.Object[] iTransformationArray);


  // Properties:
}
