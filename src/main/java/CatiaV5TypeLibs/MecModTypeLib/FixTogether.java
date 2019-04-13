package CatiaV5TypeLibs.MecModTypeLib;
import CatiaV5TypeLibs.InfTypeLib.*;

import com4j.*;

@IID("{82734590-41D2-11D4-9EE1-00508B5FE56F}")
public interface FixTogether extends AnyObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "ProductsCount"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610940416) //= 0x60050000. The runtime will prefer the VTID if present
  @VTID(22)
  int productsCount();


  /**
   * <p>
   * Getter method for the COM property "FixTogethersCount"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610940417) //= 0x60050001. The runtime will prefer the VTID if present
  @VTID(23)
  int fixTogethersCount();


  /**
   * @param iProduct Mandatory CatiaV5TypeLibs.PartItfTypeLib.Product parameter.
   */

  @DISPID(1610940418) //= 0x60050002. The runtime will prefer the VTID if present
  @VTID(24)
  void addProduct(
    Product iProduct);


  /**
   * @param iIndex Mandatory java.lang.Object parameter.
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.Product
   */

  @DISPID(1610940419) //= 0x60050003. The runtime will prefer the VTID if present
  @VTID(25)
  Product getProduct(
    java.lang.Object iIndex);


  /**
   * @param iIndex Mandatory java.lang.Object parameter.
   */

  @DISPID(1610940420) //= 0x60050004. The runtime will prefer the VTID if present
  @VTID(26)
  void removeProduct(
    java.lang.Object iIndex);


  /**
   * @param iFixTogether Mandatory CatiaV5TypeLibs.PartItfTypeLib.FixTogether parameter.
   */

  @DISPID(1610940421) //= 0x60050005. The runtime will prefer the VTID if present
  @VTID(27)
  void addFixTogether(
    FixTogether iFixTogether);


  /**
   * @param iIndex Mandatory java.lang.Object parameter.
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.FixTogether
   */

  @DISPID(1610940422) //= 0x60050006. The runtime will prefer the VTID if present
  @VTID(28)
  FixTogether getFixTogether(
    java.lang.Object iIndex);


  /**
   * @param iIndex Mandatory java.lang.Object parameter.
   */

  @DISPID(1610940423) //= 0x60050007. The runtime will prefer the VTID if present
  @VTID(29)
  void removeFixTogether(
    java.lang.Object iIndex);


  // Properties:
}
