package CatiaV5TypeLibs.InfTypeLib;

import com4j.*;

@IID("{6EF9EAD4-7378-11D4-85B4-00508B675233}")
public interface SelectedElement extends AnyObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Type"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610940416) //= 0x60050000. The runtime will prefer the VTID if present
  @VTID(22)
  java.lang.String type();


  /**
   * <p>
   * Getter method for the COM property "Document"
   * </p>
   * @return  Returns a value of type Document
   */

  @DISPID(1610940417) //= 0x60050001. The runtime will prefer the VTID if present
  @VTID(23)
  Document document();


  /**
   * @param ioPoint Mandatory java.lang.Object[] parameter.
   */

  @DISPID(1610940418) //= 0x60050002. The runtime will prefer the VTID if present
  @VTID(24)
  void getCoordinates(
    java.lang.Object[] ioPoint);


  /**
   * <p>
   * Getter method for the COM property "Value"
   * </p>
   * @return  Returns a value of type CATBaseDispatch
   */

  @DISPID(1610940419) //= 0x60050003. The runtime will prefer the VTID if present
  @VTID(25)
  CATBaseDispatch value();


  /**
   * <p>
   * Getter method for the COM property "Reference"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1610940420) //= 0x60050004. The runtime will prefer the VTID if present
  @VTID(26)
  Reference reference();


  /**
   * <p>
   * Getter method for the COM property "LeafProduct"
   * </p>
   * @return  Returns a value of type AnyObject
   */

  @DISPID(1610940421) //= 0x60050005. The runtime will prefer the VTID if present
  @VTID(27)
  AnyObject leafProduct();


  // Properties:
}
