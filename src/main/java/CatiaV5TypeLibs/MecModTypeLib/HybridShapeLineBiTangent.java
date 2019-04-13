import CatiaV5TypeLibs.InfTypeLib.*;
import com4j.*;

@IID("{E989E914-EC76-11D4-AB2F-001083FFC223}")
public interface HybridShapeLineBiTangent extends Line {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Curve1"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611071488) //= 0x60070000. The runtime will prefer the VTID if present
  @VTID(32)
  Reference curve1();


  /**
   * <p>
   * Setter method for the COM property "Curve1"
   * </p>
   * @param oCurve Mandatory Reference parameter.
   */

  @DISPID(1611071488) //= 0x60070000. The runtime will prefer the VTID if present
  @VTID(33)
  void curve1(
    Reference oCurve);


  /**
   * <p>
   * Getter method for the COM property "Element2"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611071490) //= 0x60070002. The runtime will prefer the VTID if present
  @VTID(34)
  Reference element2();


  /**
   * <p>
   * Setter method for the COM property "Element2"
   * </p>
   * @param oElement Mandatory Reference parameter.
   */

  @DISPID(1611071490) //= 0x60070002. The runtime will prefer the VTID if present
  @VTID(35)
  void element2(
    Reference oElement);


  /**
   * <p>
   * Getter method for the COM property "Support"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611071492) //= 0x60070004. The runtime will prefer the VTID if present
  @VTID(36)
  Reference support();


  /**
   * <p>
   * Setter method for the COM property "Support"
   * </p>
   * @param oSurface Mandatory Reference parameter.
   */

  @DISPID(1611071492) //= 0x60070004. The runtime will prefer the VTID if present
  @VTID(37)
  void support(
    Reference oSurface);


  /**
   * @param val1 Mandatory Holder<Integer> parameter.
   * @param val2 Mandatory Holder<Integer> parameter.
   * @param val3 Mandatory Holder<Integer> parameter.
   * @param val4 Mandatory Holder<Integer> parameter.
   * @param val5 Mandatory Holder<Integer> parameter.
   */

  @DISPID(1611071494) //= 0x60070006. The runtime will prefer the VTID if present
  @VTID(38)
  void getChoiceNo(
    Holder<Integer> val1,
    Holder<Integer> val2,
    Holder<Integer> val3,
    Holder<Integer> val4,
    Holder<Integer> val5);


  /**
   * @param val1 Mandatory int parameter.
   * @param val2 Mandatory int parameter.
   * @param val3 Mandatory int parameter.
   * @param val4 Mandatory int parameter.
   * @param val5 Mandatory int parameter.
   */

  @DISPID(1611071495) //= 0x60070007. The runtime will prefer the VTID if present
  @VTID(39)
  void setChoiceNo(
    int val1,
    int val2,
    int val3,
    int val4,
    int val5);


  /**
   * @return  Returns a value of type int
   */

  @DISPID(1611071496) //= 0x60070008. The runtime will prefer the VTID if present
  @VTID(40)
  int getLengthType();


  /**
   * @param iType Mandatory int parameter.
   */

  @DISPID(1611071497) //= 0x60070009. The runtime will prefer the VTID if present
  @VTID(41)
  void setLengthType(
    int iType);


  // Properties:
}
