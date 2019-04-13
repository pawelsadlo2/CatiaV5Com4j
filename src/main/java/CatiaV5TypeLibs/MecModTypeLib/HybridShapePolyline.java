import CatiaV5TypeLibs.InfTypeLib.*;
import com4j.*;

@IID("{3D239BE8-8513-11D6-81BE-00065BDCB61F}")
public interface HybridShapePolyline extends HybridShape {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "NumberOfElements"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(25)
  int numberOfElements();


  /**
   * <p>
   * Getter method for the COM property "Closure"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005953) //= 0x60060001. The runtime will prefer the VTID if present
  @VTID(26)
  boolean closure();


  /**
   * <p>
   * Setter method for the COM property "Closure"
   * </p>
   * @param oClosure Mandatory boolean parameter.
   */

  @DISPID(1611005953) //= 0x60060001. The runtime will prefer the VTID if present
  @VTID(27)
  void closure(
    boolean oClosure);


  /**
   * @param iPoint Mandatory Reference parameter.
   * @param iPosition Mandatory int parameter.
   */

  @DISPID(1611005955) //= 0x60060003. The runtime will prefer the VTID if present
  @VTID(28)
  void insertElement(
    Reference iPoint,
    int iPosition);


  /**
   * @param iPoint Mandatory Reference parameter.
   * @param iPosition Mandatory int parameter.
   */

  @DISPID(1611005956) //= 0x60060004. The runtime will prefer the VTID if present
  @VTID(29)
  void replaceElement(
    Reference iPoint,
    int iPosition);


  /**
   * @param iPosition Mandatory int parameter.
   */

  @DISPID(1611005957) //= 0x60060005. The runtime will prefer the VTID if present
  @VTID(30)
  void removeElement(
    int iPosition);


  /**
   * @param iPosition Mandatory int parameter.
   * @param iRadius Mandatory double parameter.
   */

  @DISPID(1611005958) //= 0x60060006. The runtime will prefer the VTID if present
  @VTID(31)
  void setRadius(
    int iPosition,
    double iRadius);


  /**
   * @param iPosition Mandatory int parameter.
   * @param oElement Mandatory Holder<Reference> parameter.
   * @param oRadius Mandatory Holder<Length> parameter.
   */

  @DISPID(1611005959) //= 0x60060007. The runtime will prefer the VTID if present
  @VTID(32)
  void getElement(
    int iPosition,
    Holder<Reference> oElement,
    Holder<Length> oRadius);


  // Properties:
}
