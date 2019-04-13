import com4j.*;

@IID("{8142DD37-BEF4-0000-0280-030BA6000000}")
public interface Chamfer extends DressUpShape {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Mode"
   * </p>
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.CatChamferMode
   */

  @DISPID(1611071488) //= 0x60070000. The runtime will prefer the VTID if present
  @VTID(22)
  CatChamferMode mode();


  /**
   * <p>
   * Setter method for the COM property "Mode"
   * </p>
   * @param oMode Mandatory CatiaV5TypeLibs.PartItfTypeLib.CatChamferMode parameter.
   */

  @DISPID(1611071488) //= 0x60070000. The runtime will prefer the VTID if present
  @VTID(23)
  void mode(
    CatChamferMode oMode);


  /**
   * <p>
   * Getter method for the COM property "Propagation"
   * </p>
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.CatChamferPropagation
   */

  @DISPID(1611071490) //= 0x60070002. The runtime will prefer the VTID if present
  @VTID(24)
  CatChamferPropagation propagation();


  /**
   * <p>
   * Setter method for the COM property "Propagation"
   * </p>
   * @param oPropagation Mandatory CatiaV5TypeLibs.PartItfTypeLib.CatChamferPropagation parameter.
   */

  @DISPID(1611071490) //= 0x60070002. The runtime will prefer the VTID if present
  @VTID(25)
  void propagation(
    CatChamferPropagation oPropagation);


  /**
   * <p>
   * Getter method for the COM property "Orientation"
   * </p>
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.CatChamferOrientation
   */

  @DISPID(1611071492) //= 0x60070004. The runtime will prefer the VTID if present
  @VTID(26)
  CatChamferOrientation orientation();


  /**
   * <p>
   * Setter method for the COM property "Orientation"
   * </p>
   * @param oOrientation Mandatory CatiaV5TypeLibs.PartItfTypeLib.CatChamferOrientation parameter.
   */

  @DISPID(1611071492) //= 0x60070004. The runtime will prefer the VTID if present
  @VTID(27)
  void orientation(
    CatChamferOrientation oOrientation);


  /**
   * <p>
   * Getter method for the COM property "Length1"
   * </p>
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.Length
   */

  @DISPID(1611071494) //= 0x60070006. The runtime will prefer the VTID if present
  @VTID(28)
  Length length1();


  /**
   * <p>
   * Getter method for the COM property "Length2"
   * </p>
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.Length
   */

  @DISPID(1611071495) //= 0x60070007. The runtime will prefer the VTID if present
  @VTID(29)
  Length length2();


  /**
   * <p>
   * Getter method for the COM property "CatiaV5TypeLibs.PartItfTypeLib.Angle"
   * </p>
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.Angle
   */

  @DISPID(1611071496) //= 0x60070008. The runtime will prefer the VTID if present
  @VTID(30)
  Angle angle();


  /**
   * <p>
   * Getter method for the COM property "ElementsToChamfer"
   * </p>
   * @return  Returns a value of type References
   */

  @DISPID(1611071497) //= 0x60070009. The runtime will prefer the VTID if present
  @VTID(31)
  References elementsToChamfer();


  /**
   * @param iElementToChamfer Mandatory Reference parameter.
   */

  @DISPID(1611071498) //= 0x6007000a. The runtime will prefer the VTID if present
  @VTID(32)
  void addElementToChamfer(
    Reference iElementToChamfer);


  /**
   * @param iElementToWithdraw Mandatory Reference parameter.
   */

  @DISPID(1611071499) //= 0x6007000b. The runtime will prefer the VTID if present
  @VTID(33)
  void withdrawElementToChamfer(
    Reference iElementToWithdraw);


  // Properties:
}
