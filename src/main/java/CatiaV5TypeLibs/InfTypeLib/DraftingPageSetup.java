package CatiaV5TypeLibs.InfTypeLib;

import com4j.*;

@IID("{79FB72D7-28CE-11D5-9074-0004AC96EF3C}")
public interface DraftingPageSetup extends PageSetup {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "ChooseBestOrientation"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(88)
  boolean chooseBestOrientation();


  /**
   * <p>
   * Setter method for the COM property "ChooseBestOrientation"
   * </p>
   * @param oBestOrientationOn Mandatory boolean parameter.
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(89)
  void chooseBestOrientation(
    boolean oBestOrientationOn);


  /**
   * <p>
   * Getter method for the COM property "FitToPrinterFormat"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005954) //= 0x60060002. The runtime will prefer the VTID if present
  @VTID(90)
  boolean fitToPrinterFormat();


  /**
   * <p>
   * Setter method for the COM property "FitToPrinterFormat"
   * </p>
   * @param oFitToPrinterFormatOn Mandatory boolean parameter.
   */

  @DISPID(1611005954) //= 0x60060002. The runtime will prefer the VTID if present
  @VTID(91)
  void fitToPrinterFormat(
    boolean oFitToPrinterFormatOn);


  /**
   * <p>
   * Getter method for the COM property "FitToSheetFormat"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005956) //= 0x60060004. The runtime will prefer the VTID if present
  @VTID(92)
  boolean fitToSheetFormat();


  /**
   * <p>
   * Setter method for the COM property "FitToSheetFormat"
   * </p>
   * @param oFitToSheetFormatOn Mandatory boolean parameter.
   */

  @DISPID(1611005956) //= 0x60060004. The runtime will prefer the VTID if present
  @VTID(93)
  void fitToSheetFormat(
    boolean oFitToSheetFormatOn);


  // Properties:
}
