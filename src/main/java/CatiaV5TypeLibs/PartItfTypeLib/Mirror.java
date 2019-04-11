package CatiaV5TypeLibs.PartItfTypeLib;

import com4j.DISPID;
import com4j.IID;
import com4j.VTID;
import CatiaV5TypeLibs.InfItfTypeLib.*;

@IID("{317D811F-65AA-11D1-A27F-0000F87546FD}")
public interface Mirror extends TransformationShape {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "MirroringPlane"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611071488) //= 0x60070000. The runtime will prefer the VTID if present
  @VTID(22)
  Reference mirroringPlane();


  /**
   * <p>
   * Setter method for the COM property "MirroringPlane"
   * </p>
   * @param oReferenceMirroringPlane Mandatory Reference parameter.
   */

  @DISPID(1611071488) //= 0x60070000. The runtime will prefer the VTID if present
  @VTID(23)
  void mirroringPlane(
    Reference oReferenceMirroringPlane);


  /**
   * <p>
   * Getter method for the COM property "MirroringObject"
   * </p>
   * @return  Returns a value of type AnyObject
   */

  @DISPID(1611071490) //= 0x60070002. The runtime will prefer the VTID if present
  @VTID(24)
  AnyObject mirroringObject();


  /**
   * @param iObject Mandatory AnyObject parameter.
   */

  @DISPID(1611071491) //= 0x60070003. The runtime will prefer the VTID if present
  @VTID(25)
  void addObjectToMirror(
    AnyObject iObject);


  // Properties:
}
