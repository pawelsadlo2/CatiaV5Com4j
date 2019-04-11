package CatiaV5TypeLibs.PartItfTypeLib;

import com4j.DISPID;
import com4j.IID;
import com4j.VTID;
import CatiaV5TypeLibs.InfItfTypeLib.*;

@IID("{928EE6BE-BF1B-40B4-8A12-7507BB1E4B15}")
public interface AutoDraft extends DressUpShape {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "FunctionalFaces"
   * </p>
   * @return  Returns a value of type References
   */

  @DISPID(1611071488) //= 0x60070000. The runtime will prefer the VTID if present
  @VTID(22)
  References functionalFaces();


  /**
   * <p>
   * Setter method for the COM property "FunctionalFace"
   * </p>
   * @param rhs Mandatory Reference parameter.
   */

  @DISPID(1611071489) //= 0x60070001. The runtime will prefer the VTID if present
  @VTID(23)
  void functionalFace(
    Reference rhs);


  /**
   * <p>
   * Getter method for the COM property "PartingElement"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611071490) //= 0x60070002. The runtime will prefer the VTID if present
  @VTID(24)
  Reference partingElement();


  /**
   * <p>
   * Setter method for the COM property "PartingElement"
   * </p>
   * @param oPartingElement Mandatory Reference parameter.
   */

  @DISPID(1611071490) //= 0x60070002. The runtime will prefer the VTID if present
  @VTID(25)
  void partingElement(
    Reference oPartingElement);


  /**
   * <p>
   * Getter method for the COM property "PullingDirection"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611071492) //= 0x60070004. The runtime will prefer the VTID if present
  @VTID(26)
  Reference pullingDirection();


  /**
   * <p>
   * Setter method for the COM property "PullingDirection"
   * </p>
   * @param oPullingDirection Mandatory Reference parameter.
   */

  @DISPID(1611071492) //= 0x60070004. The runtime will prefer the VTID if present
  @VTID(27)
  void pullingDirection(
    Reference oPullingDirection);


  /**
   * <p>
   * Getter method for the COM property "MainDraftAngle"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611071494) //= 0x60070006. The runtime will prefer the VTID if present
  @VTID(28)
  Reference mainDraftAngle();


  /**
   * <p>
   * Setter method for the COM property "MainDraftAngle"
   * </p>
   * @param oMainDraftAngle Mandatory Reference parameter.
   */

  @DISPID(1611071494) //= 0x60070006. The runtime will prefer the VTID if present
  @VTID(29)
  void mainDraftAngle(
    Reference oMainDraftAngle);


  /**
   * <p>
   * Getter method for the COM property "Mode"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611071496) //= 0x60070008. The runtime will prefer the VTID if present
  @VTID(30)
  Reference mode();


  /**
   * <p>
   * Setter method for the COM property "Mode"
   * </p>
   * @param oMode Mandatory Reference parameter.
   */

  @DISPID(1611071496) //= 0x60070008. The runtime will prefer the VTID if present
  @VTID(31)
  void mode(
    Reference oMode);


  // Properties:
}
