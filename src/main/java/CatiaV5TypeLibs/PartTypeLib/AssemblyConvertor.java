package CatiaV5TypeLibs.PartTypeLib;
import CatiaV5TypeLibs.InfTypeLib.*;
import CatiaV5TypeLibs.MecModTypeLib.*;
import CatiaV5TypeLibs.KnowledgewareTypeLib.*;

import com4j.*;

@IID("{50C18F38-40FC-11D3-9315-006094EB72E6}")
public interface AssemblyConvertor extends AnyObject {
  // Methods:
  /**
   * @param iFileType Mandatory Holder<java.lang.String> parameter.
   * @param iFile Mandatory Holder<java.lang.String> parameter.
   * @param iProduct Mandatory CatiaV5TypeLibs.PartItfTypeLib.Product parameter.
   */

  @DISPID(1610940416) //= 0x60050000. The runtime will prefer the VTID if present
  @VTID(22)
  void print(
    Holder<java.lang.String> iFileType,
    Holder<java.lang.String> iFile,
    Product iProduct);


  /**
   * @param ilistProps Mandatory java.lang.Object[] parameter.
   */

  @DISPID(1610940417) //= 0x60050001. The runtime will prefer the VTID if present
  @VTID(23)
  void setCurrentFormat(
    java.lang.Object[] ilistProps);


  /**
   * @param ilistProps Mandatory java.lang.Object[] parameter.
   */

  @DISPID(1610940418) //= 0x60050002. The runtime will prefer the VTID if present
  @VTID(24)
  void setSecondaryFormat(
    java.lang.Object[] ilistProps);


  // Properties:
}
