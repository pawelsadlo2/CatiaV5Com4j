package CatiaV5TypeLibs.PartTypeLib;
import CatiaV5TypeLibs.InfTypeLib.*;
import CatiaV5TypeLibs.MecModTypeLib.*;
import CatiaV5TypeLibs.KnowledgewareTypeLib.*;

import com4j.*;

@IID("{8BE882D1-1339-0000-0280-030D0E000000}")
public interface Publications extends Collection {
  // Methods:
  /**
   * @param iIdentifier Mandatory java.lang.Object parameter.
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.Publication
   */

  @DISPID(1610940416) //= 0x60050000. The runtime will prefer the VTID if present
  @VTID(23)
  Publication item(
    java.lang.Object iIdentifier);


  /**
   * @param iPublicName Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.Publication
   */

  @DISPID(1610940417) //= 0x60050001. The runtime will prefer the VTID if present
  @VTID(24)
  Publication add(
    Holder<java.lang.String> iPublicName);


  /**
   * @param iIdentifier Mandatory Holder<java.lang.String> parameter.
   */

  @DISPID(1610940418) //= 0x60050002. The runtime will prefer the VTID if present
  @VTID(25)
  void remove(
    Holder<java.lang.String> iIdentifier);


  /**
   * @param iIdentifier Mandatory java.lang.Object parameter.
   * @param iRelayer Mandatory CatiaV5TypeLibs.PartItfTypeLib.Publications parameter.
   * @param iNameInRelay Mandatory java.lang.Object parameter.
   */

  @DISPID(1610940419) //= 0x60050003. The runtime will prefer the VTID if present
  @VTID(26)
  void setRelay(
    java.lang.Object iIdentifier,
    Publications iRelayer,
    java.lang.Object iNameInRelay);


  /**
   * @param iIdentifier Mandatory java.lang.Object parameter.
   * @param iPointed Mandatory Reference parameter.
   */

  @DISPID(1610940420) //= 0x60050004. The runtime will prefer the VTID if present
  @VTID(27)
  void setDirect(
    java.lang.Object iIdentifier,
    Reference iPointed);


  // Properties:
}
