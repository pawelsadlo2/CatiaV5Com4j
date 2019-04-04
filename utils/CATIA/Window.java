import com4j.*;

@IID("{7FBD9AB0-6840-0000-0280-030BA6000000}")
public interface Window extends AnyObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "ActiveViewer"
   * </p>
   * @return  Returns a value of type Viewer
   */

  @DISPID(1610940416) //= 0x60050000. The runtime will prefer the VTID if present
  @VTID(22)
  Viewer activeViewer();


  /**
   * <p>
   * Getter method for the COM property "Viewers"
   * </p>
   * @return  Returns a value of type Viewers
   */

  @DISPID(1610940417) //= 0x60050001. The runtime will prefer the VTID if present
  @VTID(23)
  Viewers viewers();


  /**
   * <p>
   * Getter method for the COM property "WindowState"
   * </p>
   * @return  Returns a value of type CatWindowState
   */

  @DISPID(1610940418) //= 0x60050002. The runtime will prefer the VTID if present
  @VTID(24)
  CatWindowState windowState();


  /**
   * <p>
   * Setter method for the COM property "WindowState"
   * </p>
   * @param oWindowState Mandatory CatWindowState parameter.
   */

  @DISPID(1610940418) //= 0x60050002. The runtime will prefer the VTID if present
  @VTID(25)
  void windowState(
    CatWindowState oWindowState);


  /**
   * <p>
   * Getter method for the COM property "Caption"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610940420) //= 0x60050004. The runtime will prefer the VTID if present
  @VTID(26)
  java.lang.String caption();


  /**
   * <p>
   * Setter method for the COM property "Caption"
   * </p>
   * @param oCaption Mandatory Holder<java.lang.String> parameter.
   */

  @DISPID(1610940420) //= 0x60050004. The runtime will prefer the VTID if present
  @VTID(27)
  void caption(
    Holder<java.lang.String> oCaption);


  /**
   * <p>
   * Getter method for the COM property "Width"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610940422) //= 0x60050006. The runtime will prefer the VTID if present
  @VTID(28)
  int width();


  /**
   * <p>
   * Setter method for the COM property "Width"
   * </p>
   * @param oWidth Mandatory int parameter.
   */

  @DISPID(1610940422) //= 0x60050006. The runtime will prefer the VTID if present
  @VTID(29)
  void width(
    int oWidth);


  /**
   * <p>
   * Getter method for the COM property "Height"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610940424) //= 0x60050008. The runtime will prefer the VTID if present
  @VTID(30)
  int height();


  /**
   * <p>
   * Setter method for the COM property "Height"
   * </p>
   * @param oHeight Mandatory int parameter.
   */

  @DISPID(1610940424) //= 0x60050008. The runtime will prefer the VTID if present
  @VTID(31)
  void height(
    int oHeight);


  /**
   * <p>
   * Getter method for the COM property "Left"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610940426) //= 0x6005000a. The runtime will prefer the VTID if present
  @VTID(32)
  int left();


  /**
   * <p>
   * Setter method for the COM property "Left"
   * </p>
   * @param oLeft Mandatory int parameter.
   */

  @DISPID(1610940426) //= 0x6005000a. The runtime will prefer the VTID if present
  @VTID(33)
  void left(
    int oLeft);


  /**
   * <p>
   * Getter method for the COM property "Top"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610940428) //= 0x6005000c. The runtime will prefer the VTID if present
  @VTID(34)
  int top();


  /**
   * <p>
   * Setter method for the COM property "Top"
   * </p>
   * @param oTop Mandatory int parameter.
   */

  @DISPID(1610940428) //= 0x6005000c. The runtime will prefer the VTID if present
  @VTID(35)
  void top(
    int oTop);


  /**
   * <p>
   * Getter method for the COM property "PageSetup"
   * </p>
   * @return  Returns a value of type PageSetup
   */

  @DISPID(1610940430) //= 0x6005000e. The runtime will prefer the VTID if present
  @VTID(36)
  PageSetup pageSetup();


  /**
   * <p>
   * Setter method for the COM property "PageSetup"
   * </p>
   * @param oPageSetup Mandatory PageSetup parameter.
   */

  @DISPID(1610940430) //= 0x6005000e. The runtime will prefer the VTID if present
  @VTID(37)
  void pageSetup(
    PageSetup oPageSetup);


  /**
   * @return  Returns a value of type Window
   */

  @DISPID(1610940432) //= 0x60050010. The runtime will prefer the VTID if present
  @VTID(38)
  Window newWindow();


  /**
   */

  @DISPID(1610940433) //= 0x60050011. The runtime will prefer the VTID if present
  @VTID(39)
  void activate();


  /**
   */

  @DISPID(1610940434) //= 0x60050012. The runtime will prefer the VTID if present
  @VTID(40)
  void activateNext();


  /**
   */

  @DISPID(1610940435) //= 0x60050013. The runtime will prefer the VTID if present
  @VTID(41)
  void activatePrevious();


  /**
   */

  @DISPID(1610940436) //= 0x60050014. The runtime will prefer the VTID if present
  @VTID(42)
  void printOut();


  /**
   * @param fileName Mandatory Holder<java.lang.String> parameter.
   */

  @DISPID(1610940437) //= 0x60050015. The runtime will prefer the VTID if present
  @VTID(43)
  void printToFile(
    Holder<java.lang.String> fileName);


  /**
   */

  @DISPID(1610940438) //= 0x60050016. The runtime will prefer the VTID if present
  @VTID(44)
  void close();


  // Properties:
}
