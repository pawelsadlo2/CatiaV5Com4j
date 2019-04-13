import com4j.*;

@IID("{8142DE11-AEC0-0000-0280-030BA6000000}")
public interface BooleanShape extends Shape {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "CatiaV5TypeLibs.PartItfTypeLib.Body"
   * </p>
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.Body
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(22)
  Body body();


  /**
   * @param iReferenceObject Mandatory Reference parameter.
   */

  @DISPID(1611005953) //= 0x60060001. The runtime will prefer the VTID if present
  @VTID(23)
  void setOperatedObject(
    Reference iReferenceObject);


  /**
   * @param iReferenceObject Mandatory Reference parameter.
   */

  @DISPID(1611005954) //= 0x60060002. The runtime will prefer the VTID if present
  @VTID(24)
  void setOperatingVolume(
    Reference iReferenceObject);


  // Properties:
}
