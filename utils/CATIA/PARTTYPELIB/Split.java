import com4j.*;

@IID("{20D0ECB9-65AD-11D1-A27F-0000F87546FD}")
public interface Split extends SurfaceBasedShape {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "SplittingSide"
   * </p>
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.CatSplitSide
   */

  @DISPID(1611071488) //= 0x60070000. The runtime will prefer the VTID if present
  @VTID(24)
  CatSplitSide splittingSide();


  /**
   * <p>
   * Setter method for the COM property "SplittingSide"
   * </p>
   * @param oSplittingSide Mandatory CatiaV5TypeLibs.PartItfTypeLib.CatSplitSide parameter.
   */

  @DISPID(1611071488) //= 0x60070000. The runtime will prefer the VTID if present
  @VTID(25)
  void splittingSide(
    CatSplitSide oSplittingSide);


  // Properties:
}
