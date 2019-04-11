package CatiaV5TypeLibs.PartItfTypeLib;

import com4j.DISPID;
import com4j.IID;
import com4j.VTID;
import CatiaV5TypeLibs.InfItfTypeLib.*;

@IID("{8C4D6500-8AA0-11D2-9F83-0008C7CA6093}")
public interface SewSurface extends SurfaceBasedShape {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "SewingSide"
   * </p>
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.CatSplitSide
   */

  @DISPID(1611071488) //= 0x60070000. The runtime will prefer the VTID if present
  @VTID(24)
  CatSplitSide sewingSide();


  /**
   * <p>
   * Setter method for the COM property "SewingSide"
   * </p>
   * @param oSewingSide Mandatory CatiaV5TypeLibs.PartItfTypeLib.CatSplitSide parameter.
   */

  @DISPID(1611071488) //= 0x60070000. The runtime will prefer the VTID if present
  @VTID(25)
  void sewingSide(
    CatSplitSide oSewingSide);


  /**
   * <p>
   * Getter method for the COM property "SewingIntersectionMode"
   * </p>
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.CatSewingIntersectionMode
   */

  @DISPID(1611071490) //= 0x60070002. The runtime will prefer the VTID if present
  @VTID(26)
  CatSewingIntersectionMode sewingIntersectionMode();


  /**
   * <p>
   * Setter method for the COM property "SewingIntersectionMode"
   * </p>
   * @param oSewingIntersectionMode Mandatory CatiaV5TypeLibs.PartItfTypeLib.CatSewingIntersectionMode parameter.
   */

  @DISPID(1611071490) //= 0x60070002. The runtime will prefer the VTID if present
  @VTID(27)
  void sewingIntersectionMode(
    CatSewingIntersectionMode oSewingIntersectionMode);


  /**
   * @param iVolume Mandatory Reference parameter.
   */

  @DISPID(1611071492) //= 0x60070004. The runtime will prefer the VTID if present
  @VTID(28)
  void setVolumeSupport(
    Reference iVolume);


  // Properties:
}
