import com4j.*;

@IID("{063624EB-B9B6-4AAC-AE1E-F7532D1A4213}")
public interface HybridShapeSection extends HybridShape {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "SectionPlane"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(25)
  Reference sectionPlane();


  /**
   * <p>
   * Setter method for the COM property "SectionPlane"
   * </p>
   * @param oPlane Mandatory Reference parameter.
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(26)
  void sectionPlane(
    Reference oPlane);


  // Properties:
}
