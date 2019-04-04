package CatiaV5TypeLibs.InfItfTypeLib;

import com4j.*;

@IID("{A5B37198-1729-11D3-B806-0008C73F2494}")
public interface Printer extends AnyObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "DeviceName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610940416) //= 0x60050000. The runtime will prefer the VTID if present
  @VTID(22)
  java.lang.String deviceName();


  /**
   * <p>
   * Getter method for the COM property "PaperSize"
   * </p>
   * @return  Returns a value of type CatPaperSize
   */

  @DISPID(1610940417) //= 0x60050001. The runtime will prefer the VTID if present
  @VTID(23)
  CatPaperSize paperSize();


  /**
   * <p>
   * Getter method for the COM property "Orientation"
   * </p>
   * @return  Returns a value of type CatPaperOrientation
   */

  @DISPID(1610940418) //= 0x60050002. The runtime will prefer the VTID if present
  @VTID(24)
  CatPaperOrientation orientation();


  /**
   * <p>
   * Getter method for the COM property "PaperWidth"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(1610940419) //= 0x60050003. The runtime will prefer the VTID if present
  @VTID(25)
  float paperWidth();


  /**
   * <p>
   * Getter method for the COM property "PaperHeight"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(1610940420) //= 0x60050004. The runtime will prefer the VTID if present
  @VTID(26)
  float paperHeight();


  // Properties:
}
