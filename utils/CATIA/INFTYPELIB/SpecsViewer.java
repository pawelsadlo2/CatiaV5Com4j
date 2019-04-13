import com4j.*;

@IID("{80ECA4E1-790B-0000-0280-030BA6000000}")
public interface SpecsViewer extends Viewer2D {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Layout"
   * </p>
   * @return  Returns a value of type CatSpecsLayout
   */

  @DISPID(1611071488) //= 0x60070000. The runtime will prefer the VTID if present
  @VTID(37)
  CatSpecsLayout layout();


  /**
   * <p>
   * Setter method for the COM property "Layout"
   * </p>
   * @param oLayout Mandatory CatSpecsLayout parameter.
   */

  @DISPID(1611071488) //= 0x60070000. The runtime will prefer the VTID if present
  @VTID(38)
  void layout(
    CatSpecsLayout oLayout);


  // Properties:
}
