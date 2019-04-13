import com4j.*;

@IID("{8502E722-B1A2-0000-0280-020A0D000000}")
public interface Trim extends BooleanShape {
  // Methods:
  /**
   * @param iFaceToRemove Mandatory Reference parameter.
   */

  @DISPID(1611071488) //= 0x60070000. The runtime will prefer the VTID if present
  @VTID(25)
  void addFaceToRemove(
    Reference iFaceToRemove);


  /**
   * @param iFaceToRemove Mandatory Reference parameter.
   * @param iFaceAdjacentForRemove Mandatory Reference parameter.
   */

  @DISPID(1611071489) //= 0x60070001. The runtime will prefer the VTID if present
  @VTID(26)
  void addFaceToRemove2(
    Reference iFaceToRemove,
    Reference iFaceAdjacentForRemove);


  /**
   * @param iFaceToWithdraw Mandatory Reference parameter.
   */

  @DISPID(1611071490) //= 0x60070002. The runtime will prefer the VTID if present
  @VTID(27)
  void withdrawFaceToRemove(
    Reference iFaceToWithdraw);


  /**
   * @param iFaceToWithdraw Mandatory Reference parameter.
   * @param iFaceAdjacentForRemove Mandatory Reference parameter.
   */

  @DISPID(1611071491) //= 0x60070003. The runtime will prefer the VTID if present
  @VTID(28)
  void withdrawFaceToRemove2(
    Reference iFaceToWithdraw,
    Reference iFaceAdjacentForRemove);


  /**
   * @param iFaceToKeep Mandatory Reference parameter.
   */

  @DISPID(1611071492) //= 0x60070004. The runtime will prefer the VTID if present
  @VTID(29)
  void addFaceToKeep(
    Reference iFaceToKeep);


  /**
   * @param iFaceToKeep Mandatory Reference parameter.
   * @param iFaceAdjacentForKeep Mandatory Reference parameter.
   */

  @DISPID(1611071493) //= 0x60070005. The runtime will prefer the VTID if present
  @VTID(30)
  void addFaceToKeep2(
    Reference iFaceToKeep,
    Reference iFaceAdjacentForKeep);


  /**
   * @param iFaceToWithdraw Mandatory Reference parameter.
   */

  @DISPID(1611071494) //= 0x60070006. The runtime will prefer the VTID if present
  @VTID(31)
  void withdrawFaceToKeep(
    Reference iFaceToWithdraw);


  /**
   * @param iFaceToWithdraw Mandatory Reference parameter.
   * @param iFaceAdjacentForKeep Mandatory Reference parameter.
   */

  @DISPID(1611071495) //= 0x60070007. The runtime will prefer the VTID if present
  @VTID(32)
  void withdrawFaceToKeep2(
    Reference iFaceToWithdraw,
    Reference iFaceAdjacentForKeep);


  // Properties:
}
