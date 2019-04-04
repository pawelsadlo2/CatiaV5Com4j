package CatiaV5TypeLibs.InfItfTypeLib;

import com4j.*;

@IID("{C1D63CB8-C455-11D3-B85C-0008C7191EA2}")
public interface FileSystem extends AnyObject {
  // Methods:
  /**
   * @param iPath Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type Folder
   */

  @DISPID(1610940416) //= 0x60050000. The runtime will prefer the VTID if present
  @VTID(22)
  Folder getFolder(
    Holder<java.lang.String> iPath);


  /**
   * @param iSourcePath Mandatory Holder<java.lang.String> parameter.
   * @param iDestinationPath Mandatory Holder<java.lang.String> parameter.
   */

  @DISPID(1610940417) //= 0x60050001. The runtime will prefer the VTID if present
  @VTID(23)
  void copyFolder(
    Holder<java.lang.String> iSourcePath,
    Holder<java.lang.String> iDestinationPath);


  /**
   * @param iPath Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type Folder
   */

  @DISPID(1610940418) //= 0x60050002. The runtime will prefer the VTID if present
  @VTID(24)
  Folder createFolder(
    Holder<java.lang.String> iPath);


  /**
   * @param iPath Mandatory Holder<java.lang.String> parameter.
   */

  @DISPID(1610940419) //= 0x60050003. The runtime will prefer the VTID if present
  @VTID(25)
  void deleteFolder(
    Holder<java.lang.String> iPath);


  /**
   * @param iPath Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1610940420) //= 0x60050004. The runtime will prefer the VTID if present
  @VTID(26)
  boolean folderExists(
    Holder<java.lang.String> iPath);


  /**
   * @param iPath Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type File
   */

  @DISPID(1610940421) //= 0x60050005. The runtime will prefer the VTID if present
  @VTID(27)
  File getFile(
    Holder<java.lang.String> iPath);


  /**
   * @param iPathSource Mandatory Holder<java.lang.String> parameter.
   * @param iPathDestination Mandatory Holder<java.lang.String> parameter.
   * @param iOverwrite Mandatory boolean parameter.
   */

  @DISPID(1610940422) //= 0x60050006. The runtime will prefer the VTID if present
  @VTID(28)
  void copyFile(
    Holder<java.lang.String> iPathSource,
    Holder<java.lang.String> iPathDestination,
    boolean iOverwrite);


  /**
   * @param iPath Mandatory Holder<java.lang.String> parameter.
   * @param iOverwrite Mandatory boolean parameter.
   * @return  Returns a value of type File
   */

  @DISPID(1610940423) //= 0x60050007. The runtime will prefer the VTID if present
  @VTID(29)
  File createFile(
    Holder<java.lang.String> iPath,
    boolean iOverwrite);


  /**
   * @param iPath Mandatory Holder<java.lang.String> parameter.
   */

  @DISPID(1610940424) //= 0x60050008. The runtime will prefer the VTID if present
  @VTID(30)
  void deleteFile(
    Holder<java.lang.String> iPath);


  /**
   * @param iPath Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1610940425) //= 0x60050009. The runtime will prefer the VTID if present
  @VTID(31)
  boolean fileExists(
    Holder<java.lang.String> iPath);


  /**
   * <p>
   * Getter method for the COM property "TemporaryDirectory"
   * </p>
   * @return  Returns a value of type Folder
   */

  @DISPID(1610940426) //= 0x6005000a. The runtime will prefer the VTID if present
  @VTID(32)
  Folder temporaryDirectory();


  /**
   * <p>
   * Getter method for the COM property "PathSeparator"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610940427) //= 0x6005000b. The runtime will prefer the VTID if present
  @VTID(33)
  java.lang.String pathSeparator();


  /**
   * <p>
   * Getter method for the COM property "FileSeparator"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610940428) //= 0x6005000c. The runtime will prefer the VTID if present
  @VTID(34)
  java.lang.String fileSeparator();


  /**
   * @param iPathChunk1 Mandatory Holder<java.lang.String> parameter.
   * @param iPathChunk2 Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610940429) //= 0x6005000d. The runtime will prefer the VTID if present
  @VTID(35)
  java.lang.String concatenatePaths(
    Holder<java.lang.String> iPathChunk1,
    Holder<java.lang.String> iPathChunk2);


  // Properties:
}
