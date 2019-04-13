package CatiaV5TypeLibs.InfTypeLib;

import com4j.*;

@IID("{81799037-B0F2-0000-0280-030D3B000000}")
public interface Reference extends AnyObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "DisplayName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610940416) //= 0x60050000. The runtime will prefer the VTID if present
  @VTID(22)
  java.lang.String displayName();


  /**
   * @param iReference Mandatory Reference parameter.
   * @return  Returns a value of type Reference
   */

  @DISPID(1610940417) //= 0x60050001. The runtime will prefer the VTID if present
  @VTID(23)
  Reference composeWith(
    Reference iReference);


  // Properties:
}
