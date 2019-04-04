package CatiaV5TypeLibs.InfItfTypeLib;

import com4j.*;

@IID("{01C7EB5C-A78A-11D5-85D4-00508B675233}")
public interface FileComponent extends AnyObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Path"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610940416) //= 0x60050000. The runtime will prefer the VTID if present
  @VTID(22)
  java.lang.String path();


  /**
   * <p>
   * Getter method for the COM property "ParentFolder"
   * </p>
   * @return  Returns a value of type Folder
   */

  @DISPID(1610940417) //= 0x60050001. The runtime will prefer the VTID if present
  @VTID(23)
  Folder parentFolder();


  /**
   * <p>
   * Setter method for the COM property "ParentFolder"
   * </p>
   * @param oParentFolder Mandatory Folder parameter.
   */

  @DISPID(1610940417) //= 0x60050001. The runtime will prefer the VTID if present
  @VTID(24)
  void parentFolder(
    Folder oParentFolder);


  // Properties:
}
