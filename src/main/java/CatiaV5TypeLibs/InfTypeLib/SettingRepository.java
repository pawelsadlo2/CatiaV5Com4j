package CatiaV5TypeLibs.InfTypeLib;

import com4j.*;

@IID("{B9FF6571-BAC8-0000-0280-031074000000}")
public interface SettingRepository extends SettingController {
  // Methods:
  /**
   * @param iAttrName Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(27)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object getAttr(
    Holder<java.lang.String> iAttrName);


  /**
   * @param iAttrName Mandatory Holder<java.lang.String> parameter.
   * @param iAttr Mandatory java.lang.Object parameter.
   */

  @DISPID(1611005953) //= 0x60060001. The runtime will prefer the VTID if present
  @VTID(28)
  void putAttr(
    Holder<java.lang.String> iAttrName,
    java.lang.Object iAttr);


  /**
   * @param iAttrName Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type java.lang.Object[]
   */

  @DISPID(1611005954) //= 0x60060002. The runtime will prefer the VTID if present
  @VTID(29)
  java.lang.Object[] getAttrArray(
    Holder<java.lang.String> iAttrName);


  /**
   * @param iAttrName Mandatory Holder<java.lang.String> parameter.
   * @param iArray Mandatory java.lang.Object[] parameter.
   */

  @DISPID(1611005955) //= 0x60060003. The runtime will prefer the VTID if present
  @VTID(30)
  void putAttrArray(
    Holder<java.lang.String> iAttrName,
    java.lang.Object[] iArray);


  /**
   * @param iAttrName Mandatory Holder<java.lang.String> parameter.
   * @param iLocked Mandatory boolean parameter.
   */

  @DISPID(1611005956) //= 0x60060004. The runtime will prefer the VTID if present
  @VTID(31)
  void setAttrLock(
    Holder<java.lang.String> iAttrName,
    boolean iLocked);


  /**
   * @param iAttrName Mandatory Holder<java.lang.String> parameter.
   * @param adminLevel Mandatory Holder<java.lang.String> parameter.
   * @param locked Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005957) //= 0x60060005. The runtime will prefer the VTID if present
  @VTID(32)
  boolean getAttrInfo(
    Holder<java.lang.String> iAttrName,
    Holder<java.lang.String> adminLevel,
    Holder<java.lang.String> locked);


  // Properties:
}
