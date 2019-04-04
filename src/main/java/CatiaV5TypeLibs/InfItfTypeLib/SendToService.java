package CatiaV5TypeLibs.InfItfTypeLib;

import com4j.*;

@IID("{963C65AB-5A4A-0000-0280-030EC7000000}")
public interface SendToService extends AnyObject {
  // Methods:
  /**
   * @param iPath Mandatory Holder<java.lang.String> parameter.
   */

  @DISPID(1610940416) //= 0x60050000. The runtime will prefer the VTID if present
  @VTID(22)
  void setInitialFile(
    Holder<java.lang.String> iPath);


  /**
   * @param oDependant Mandatory java.lang.Object[] parameter.
   */

  @DISPID(1610940417) //= 0x60050001. The runtime will prefer the VTID if present
  @VTID(23)
  void getListOfDependantFile(
    java.lang.Object[] oDependant);


  /**
   * @param oWillBeCopied Mandatory java.lang.Object[] parameter.
   */

  @DISPID(1610940418) //= 0x60050002. The runtime will prefer the VTID if present
  @VTID(24)
  void getListOfToBeCopiedFiles(
    java.lang.Object[] oWillBeCopied);


  /**
   * @param iPath Mandatory Holder<java.lang.String> parameter.
   */

  @DISPID(1610940419) //= 0x60050003. The runtime will prefer the VTID if present
  @VTID(25)
  void addFile(
    Holder<java.lang.String> iPath);


  /**
   * @param iFile Mandatory Holder<java.lang.String> parameter.
   */

  @DISPID(1610940420) //= 0x60050004. The runtime will prefer the VTID if present
  @VTID(26)
  void removeFile(
    Holder<java.lang.String> iFile);


  /**
   * @param iKeep Mandatory boolean parameter.
   */

  @DISPID(1610940421) //= 0x60050005. The runtime will prefer the VTID if present
  @VTID(27)
  void keepDirectory(
    boolean iKeep);


  /**
   * @param iDirectory Mandatory Holder<java.lang.String> parameter.
   */

  @DISPID(1610940422) //= 0x60050006. The runtime will prefer the VTID if present
  @VTID(28)
  void setDirectoryFile(
    Holder<java.lang.String> iDirectory);


  /**
   * @param iFile Mandatory Holder<java.lang.String> parameter.
   * @param iDirectory Mandatory Holder<java.lang.String> parameter.
   */

  @DISPID(1610940423) //= 0x60050007. The runtime will prefer the VTID if present
  @VTID(29)
  void setDirectoryOneFile(
    Holder<java.lang.String> iFile,
    Holder<java.lang.String> iDirectory);


  /**
   * @param iOldname Mandatory Holder<java.lang.String> parameter.
   * @param iNewName Mandatory Holder<java.lang.String> parameter.
   */

  @DISPID(1610940424) //= 0x60050008. The runtime will prefer the VTID if present
  @VTID(30)
  void setRenameFile(
    Holder<java.lang.String> iOldname,
    Holder<java.lang.String> iNewName);


  /**
   */

  @DISPID(1610940425) //= 0x60050009. The runtime will prefer the VTID if present
  @VTID(31)
  void run();


  /**
   * @param oErrorParam Mandatory Holder<java.lang.String> parameter.
   * @param oErrorCode Mandatory Holder<Integer> parameter.
   */

  @DISPID(1610940426) //= 0x6005000a. The runtime will prefer the VTID if present
  @VTID(32)
  void getLastSendToMethodError(
    Holder<java.lang.String> oErrorParam,
    Holder<Integer> oErrorCode);


  // Properties:
}
