package CatiaV5TypeLibs.InfTypeLib;

import com4j.*;

@IID("{6294F41C-7B6A-427E-9460-F00DEDE45FBD}")
public interface PCSStatisticsSettingAtt extends GeneralStatisticsSettingAtt {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "MemUse"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1611071488) //= 0x60070000. The runtime will prefer the VTID if present
  @VTID(61)
  boolean memUse();


  /**
   * <p>
   * Setter method for the COM property "MemUse"
   * </p>
   * @param oStatus Mandatory boolean parameter.
   */

  @DISPID(1611071488) //= 0x60070000. The runtime will prefer the VTID if present
  @VTID(62)
  void memUse(
    boolean oStatus);


  // Properties:
}
