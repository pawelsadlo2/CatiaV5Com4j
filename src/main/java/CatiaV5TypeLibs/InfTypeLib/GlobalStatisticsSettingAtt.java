package CatiaV5TypeLibs.InfTypeLib;

import com4j.*;

@IID("{8776C0C8-B64A-4B81-A025-AA9D05EBD8DC}")
public interface GlobalStatisticsSettingAtt extends SettingController {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "MaxSizePerFile"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(27)
  int maxSizePerFile();


  /**
   * <p>
   * Setter method for the COM property "MaxSizePerFile"
   * </p>
   * @param size Mandatory int parameter.
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(28)
  void maxSizePerFile(
    int size);


  /**
   * <p>
   * Getter method for the COM property "MaxCopyFile"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611005954) //= 0x60060002. The runtime will prefer the VTID if present
  @VTID(29)
  int maxCopyFile();


  /**
   * <p>
   * Setter method for the COM property "MaxCopyFile"
   * </p>
   * @param oNb Mandatory int parameter.
   */

  @DISPID(1611005954) //= 0x60060002. The runtime will prefer the VTID if present
  @VTID(30)
  void maxCopyFile(
    int oNb);


  /**
   * <p>
   * Getter method for the COM property "BufferSize"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611005956) //= 0x60060004. The runtime will prefer the VTID if present
  @VTID(31)
  int bufferSize();


  /**
   * <p>
   * Setter method for the COM property "BufferSize"
   * </p>
   * @param oSize Mandatory int parameter.
   */

  @DISPID(1611005956) //= 0x60060004. The runtime will prefer the VTID if present
  @VTID(32)
  void bufferSize(
    int oSize);


  /**
   * <p>
   * Getter method for the COM property "CopyDirectory"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1611005958) //= 0x60060006. The runtime will prefer the VTID if present
  @VTID(33)
  java.lang.String copyDirectory();


  /**
   * <p>
   * Setter method for the COM property "CopyDirectory"
   * </p>
   * @param oCopyDir Mandatory Holder<java.lang.String> parameter.
   */

  @DISPID(1611005958) //= 0x60060006. The runtime will prefer the VTID if present
  @VTID(34)
  void copyDirectory(
    Holder<java.lang.String> oCopyDir);


  /**
   * @param iLocked Mandatory boolean parameter.
   */

  @DISPID(1611005960) //= 0x60060008. The runtime will prefer the VTID if present
  @VTID(35)
  void setThematicsParameterLock(
    boolean iLocked);


  /**
   * @param adminLevel Mandatory Holder<java.lang.String> parameter.
   * @param oLocked Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005961) //= 0x60060009. The runtime will prefer the VTID if present
  @VTID(36)
  boolean getThematicsParameterInfo(
    Holder<java.lang.String> adminLevel,
    Holder<java.lang.String> oLocked);


  // Properties:
}
