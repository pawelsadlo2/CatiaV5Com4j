package CatiaV5TypeLibs.InfItfTypeLib;

import com4j.*;

@IID("{BA6ADDF0-6E41-11D6-8051-0010B5FA1031}")
public interface SystemConfiguration extends AnyObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "OperatingSystem"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610940416) //= 0x60050000. The runtime will prefer the VTID if present
  @VTID(22)
  java.lang.String operatingSystem();


  /**
   * <p>
   * Getter method for the COM property "Version"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610940417) //= 0x60050001. The runtime will prefer the VTID if present
  @VTID(23)
  int version();


  /**
   * <p>
   * Getter method for the COM property "Release"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610940418) //= 0x60050002. The runtime will prefer the VTID if present
  @VTID(24)
  int release();


  /**
   * <p>
   * Getter method for the COM property "ServicePack"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610940419) //= 0x60050003. The runtime will prefer the VTID if present
  @VTID(25)
  int servicePack();


  /**
   * <p>
   * Getter method for the COM property "ProductCount"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610940420) //= 0x60050004. The runtime will prefer the VTID if present
  @VTID(26)
  int productCount();


  /**
   * @param ioProductNames Mandatory java.lang.Object[] parameter.
   */

  @DISPID(1610940421) //= 0x60050005. The runtime will prefer the VTID if present
  @VTID(27)
  void getProductNames(
    java.lang.Object[] ioProductNames);


  /**
   * @param iProductName Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1610940422) //= 0x60050006. The runtime will prefer the VTID if present
  @VTID(28)
  boolean isProductAuthorized(
    Holder<java.lang.String> iProductName);


  // Properties:
}
