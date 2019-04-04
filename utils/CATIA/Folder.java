import com4j.*;

@IID("{C324BBB0-C44E-11D3-B85C-0008C7191EA2}")
public interface Folder extends FileComponent {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Files"
   * </p>
   * @return  Returns a value of type Files
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(25)
  Files files();


  /**
   * <p>
   * Getter method for the COM property "SubFolders"
   * </p>
   * @return  Returns a value of type Folders
   */

  @DISPID(1611005953) //= 0x60060001. The runtime will prefer the VTID if present
  @VTID(26)
  Folders subFolders();


  // Properties:
}
