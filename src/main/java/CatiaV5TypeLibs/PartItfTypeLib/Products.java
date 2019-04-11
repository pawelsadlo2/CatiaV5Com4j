package CatiaV5TypeLibs.PartItfTypeLib;

import com4j.DISPID;
import com4j.Holder;
import com4j.IID;
import com4j.VTID;
import CatiaV5TypeLibs.InfItfTypeLib.*;

@IID("{01B73398-5B43-11D1-A124-080009DCA4AE}")
public interface Products extends Collection {
  // Methods:
  /**
   * @param iReferenceProduct Mandatory CatiaV5TypeLibs.PartItfTypeLib.Product parameter.
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.Product
   */

  @DISPID(1610940416) //= 0x60050000. The runtime will prefer the VTID if present
  @VTID(23)
  Product addComponent(
    Product iReferenceProduct);


  /**
   * @param iPartNumber Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.Product
   */

  @DISPID(1610940417) //= 0x60050001. The runtime will prefer the VTID if present
  @VTID(24)
  Product addNewProduct(
    Holder<java.lang.String> iPartNumber);


  /**
   * @param iProductDocument Mandatory Document parameter.
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.Product
   */

  @DISPID(1610940418) //= 0x60050002. The runtime will prefer the VTID if present
  @VTID(25)
  Product addExternalComponent(
    Document iProductDocument);


  /**
   * @param iDocumenType Mandatory Holder<java.lang.String> parameter.
   * @param iPartNumber Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.Product
   */

  @DISPID(1610940419) //= 0x60050003. The runtime will prefer the VTID if present
  @VTID(26)
  Product addNewComponent(
    Holder<java.lang.String> iDocumenType,
    Holder<java.lang.String> iPartNumber);


  /**
   * @param iIndex Mandatory java.lang.Object parameter.
   */

  @DISPID(1610940420) //= 0x60050004. The runtime will prefer the VTID if present
  @VTID(27)
  void remove(
    java.lang.Object iIndex);


  /**
   * @param iIndex Mandatory java.lang.Object parameter.
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.Product
   */

  @DISPID(1610940421) //= 0x60050005. The runtime will prefer the VTID if present
  @VTID(28)
  Product item(
    java.lang.Object iIndex);


  /**
   * @param iFilesList Mandatory java.lang.Object[] parameter.
   * @param iMethod Mandatory Holder<java.lang.String> parameter.
   */

  @DISPID(1610940422) //= 0x60050006. The runtime will prefer the VTID if present
  @VTID(29)
  void addComponentsFromFiles(
    java.lang.Object[] iFilesList,
    Holder<java.lang.String> iMethod);


  /**
   * @param iOldComponent Mandatory CatiaV5TypeLibs.PartItfTypeLib.Product parameter.
   * @param iFilePath Mandatory Holder<java.lang.String> parameter.
   * @param iMultiInstances Mandatory boolean parameter.
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.Product
   */

  @DISPID(1610940423) //= 0x60050007. The runtime will prefer the VTID if present
  @VTID(30)
  Product replaceComponent(
    Product iOldComponent,
    Holder<java.lang.String> iFilePath,
    boolean iMultiInstances);


  /**
   * @param iOldComponent Mandatory CatiaV5TypeLibs.PartItfTypeLib.Product parameter.
   * @param iNewReference Mandatory CatiaV5TypeLibs.PartItfTypeLib.Product parameter.
   * @param iMultiInstances Mandatory boolean parameter.
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.Product
   */

  @DISPID(1610940424) //= 0x60050008. The runtime will prefer the VTID if present
  @VTID(31)
  Product replaceProduct(
    Product iOldComponent,
    Product iNewReference,
    boolean iMultiInstances);


  // Properties:
}
