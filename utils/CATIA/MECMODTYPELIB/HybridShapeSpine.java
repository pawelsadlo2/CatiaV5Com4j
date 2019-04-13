import com4j.*;

@IID("{94199BAA-8489-0000-0280-020C4E000000}")
public interface HybridShapeSpine extends HybridShape {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "StartPoint"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(25)
  Reference startPoint();


  /**
   * <p>
   * Setter method for the COM property "StartPoint"
   * </p>
   * @param opIAPoint Mandatory Reference parameter.
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(26)
  void startPoint(
    Reference opIAPoint);


  /**
   * @param iPoint Mandatory Reference parameter.
   */

  @DISPID(1611005954) //= 0x60060002. The runtime will prefer the VTID if present
  @VTID(27)
  void setStartPoint(
    Reference iPoint);


  /**
   * @param iGuide Mandatory Reference parameter.
   */

  @DISPID(1611005955) //= 0x60060003. The runtime will prefer the VTID if present
  @VTID(28)
  void addGuide(
    Reference iGuide);


  /**
   * @param iSection Mandatory Reference parameter.
   */

  @DISPID(1611005956) //= 0x60060004. The runtime will prefer the VTID if present
  @VTID(29)
  void addSection(
    Reference iSection);


  /**
   * @param iGuide Mandatory Reference parameter.
   */

  @DISPID(1611005957) //= 0x60060005. The runtime will prefer the VTID if present
  @VTID(30)
  void removeGuide(
    Reference iGuide);


  /**
   * @param iSection Mandatory Reference parameter.
   */

  @DISPID(1611005958) //= 0x60060006. The runtime will prefer the VTID if present
  @VTID(31)
  void removeSection(
    Reference iSection);


  /**
   * @return  Returns a value of type int
   */

  @DISPID(1611005959) //= 0x60060007. The runtime will prefer the VTID if present
  @VTID(32)
  int getNumberOfGuides();


  /**
   * @return  Returns a value of type int
   */

  @DISPID(1611005960) //= 0x60060008. The runtime will prefer the VTID if present
  @VTID(33)
  int getNumberOfSections();


  /**
   * @param iIdx Mandatory int parameter.
   * @return  Returns a value of type Reference
   */

  @DISPID(1611005961) //= 0x60060009. The runtime will prefer the VTID if present
  @VTID(34)
  Reference getGuide(
    int iIdx);


  /**
   * @param iIdx Mandatory int parameter.
   * @return  Returns a value of type Reference
   */

  @DISPID(1611005962) //= 0x6006000a. The runtime will prefer the VTID if present
  @VTID(35)
  Reference getSection(
    int iIdx);


  /**
   * @param ipIASection Mandatory Reference parameter.
   * @param ipIANewSection Mandatory Reference parameter.
   */

  @DISPID(1611005963) //= 0x6006000b. The runtime will prefer the VTID if present
  @VTID(36)
  void modifySectionCurve(
    Reference ipIASection,
    Reference ipIANewSection);


  /**
   * @param ipIAGuide Mandatory Reference parameter.
   * @param ipIANewGuide Mandatory Reference parameter.
   */

  @DISPID(1611005964) //= 0x6006000c. The runtime will prefer the VTID if present
  @VTID(37)
  void modifyGuideCurve(
    Reference ipIAGuide,
    Reference ipIANewGuide);


  /**
   * <p>
   * Getter method for the COM property "Orientation"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611005965) //= 0x6006000d. The runtime will prefer the VTID if present
  @VTID(38)
  int orientation();


  /**
   * <p>
   * Setter method for the COM property "Orientation"
   * </p>
   * @param oOrientation Mandatory int parameter.
   */

  @DISPID(1611005965) //= 0x6006000d. The runtime will prefer the VTID if present
  @VTID(39)
  void orientation(
    int oOrientation);


  // Properties:
}
