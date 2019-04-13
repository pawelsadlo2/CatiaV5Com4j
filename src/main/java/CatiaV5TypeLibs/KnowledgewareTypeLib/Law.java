package CatiaV5TypeLibs.KnowledgewareTypeLib;
import CatiaV5TypeLibs.InfTypeLib.*;

import com4j.*;

@IID("{0F5CFC52-FB7B-11D4-9F02-00508B6408C7}")
public interface Law extends Relation {
  // Methods:
  /**
   * @param iName Mandatory Holder<java.lang.String> parameter.
   * @param iMagnitude Mandatory Holder<java.lang.String> parameter.
   */

  @DISPID(1611137024) //= 0x60080000. The runtime will prefer the VTID if present
  @VTID(39)
  void addFormalParameter(
    Holder<java.lang.String> iName,
    Holder<java.lang.String> iMagnitude);


  /**
   * @param iName Mandatory Holder<java.lang.String> parameter.
   */

  @DISPID(1611137025) //= 0x60080001. The runtime will prefer the VTID if present
  @VTID(40)
  void removeFormalParameter(
    Holder<java.lang.String> iName);


  // Properties:
}
