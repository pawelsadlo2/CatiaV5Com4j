import com4j.*;

@IID("{283E27F7-610A-11D1-A27D-0000F87546FD}")
public interface EdgeFillet extends Fillet {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "EdgePropagation"
   * </p>
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.CatFilletEdgePropagation
   */

  @DISPID(1611137024) //= 0x60080000. The runtime will prefer the VTID if present
  @VTID(26)
  CatFilletEdgePropagation edgePropagation();


  /**
   * <p>
   * Setter method for the COM property "EdgePropagation"
   * </p>
   * @param oPropagation Mandatory CatiaV5TypeLibs.PartItfTypeLib.CatFilletEdgePropagation parameter.
   */

  @DISPID(1611137024) //= 0x60080000. The runtime will prefer the VTID if present
  @VTID(27)
  void edgePropagation(
    CatFilletEdgePropagation oPropagation);


  /**
   * <p>
   * Getter method for the COM property "EdgesToKeep"
   * </p>
   * @return  Returns a value of type References
   */

  @DISPID(1611137026) //= 0x60080002. The runtime will prefer the VTID if present
  @VTID(28)
  References edgesToKeep();


  /**
   * @param iEdgeToKeep Mandatory Reference parameter.
   */

  @DISPID(1611137027) //= 0x60080003. The runtime will prefer the VTID if present
  @VTID(29)
  void addEdgeToKeep(
    Reference iEdgeToKeep);


  /**
   * @param iEdgeToWithdraw Mandatory Reference parameter.
   */

  @DISPID(1611137028) //= 0x60080004. The runtime will prefer the VTID if present
  @VTID(30)
  void withdrawEdgeToKeep(
    Reference iEdgeToWithdraw);


  // Properties:
}
