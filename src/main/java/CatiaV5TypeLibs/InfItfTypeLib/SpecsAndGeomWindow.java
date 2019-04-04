package CatiaV5TypeLibs.InfItfTypeLib;

import com4j.*;

@IID("{80ECA576-04F4-0000-0280-030BA6000000}")
public interface SpecsAndGeomWindow extends Window {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "SpecsViewer"
   * </p>
   * @return  Returns a value of type SpecsViewer
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(45)
  SpecsViewer specsViewer();


  /**
   * <p>
   * Getter method for the COM property "Layout"
   * </p>
   * @return  Returns a value of type CatSpecsAndGeomWindowLayout
   */

  @DISPID(1611005953) //= 0x60060001. The runtime will prefer the VTID if present
  @VTID(46)
  CatSpecsAndGeomWindowLayout layout();


  /**
   * <p>
   * Setter method for the COM property "Layout"
   * </p>
   * @param oLayout Mandatory CatSpecsAndGeomWindowLayout parameter.
   */

  @DISPID(1611005953) //= 0x60060001. The runtime will prefer the VTID if present
  @VTID(47)
  void layout(
    CatSpecsAndGeomWindowLayout oLayout);


  // Properties:
}
