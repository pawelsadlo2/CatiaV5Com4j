package CatiaV5TypeLibs.KnowledgewareTypeLib;
import CatiaV5TypeLibs.InfTypeLib.*;

import com4j.*;

@IID("{9817625E-7257-11D2-8378-0060941974FF}")
public interface DesignTable extends Relation {
  // Methods:
  /**
   * @param iParameter Mandatory Parameter parameter.
   * @param iSheetColumn Mandatory Holder<java.lang.String> parameter.
   */

  @DISPID(1611137024) //= 0x60080000. The runtime will prefer the VTID if present
  @VTID(39)
  void addAssociation(
    Parameter iParameter,
    Holder<java.lang.String> iSheetColumn);


  /**
   * @param iSheetColumn Mandatory Holder<java.lang.String> parameter.
   */

  @DISPID(1611137025) //= 0x60080001. The runtime will prefer the VTID if present
  @VTID(40)
  void removeAssociation(
    Holder<java.lang.String> iSheetColumn);


  /**
   */

  @DISPID(1611137026) //= 0x60080002. The runtime will prefer the VTID if present
  @VTID(41)
  void addNewRow();


  /**
   * <p>
   * Getter method for the COM property "CopyMode"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1611137027) //= 0x60080003. The runtime will prefer the VTID if present
  @VTID(42)
  boolean copyMode();


  /**
   * <p>
   * Setter method for the COM property "CopyMode"
   * </p>
   * @param oMode Mandatory boolean parameter.
   */

  @DISPID(1611137027) //= 0x60080003. The runtime will prefer the VTID if present
  @VTID(43)
  void copyMode(
    boolean oMode);


  /**
   * <p>
   * Getter method for the COM property "Configuration"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(1611137029) //= 0x60080005. The runtime will prefer the VTID if present
  @VTID(44)
  short configuration();


  /**
   * <p>
   * Setter method for the COM property "Configuration"
   * </p>
   * @param oLineNb Mandatory short parameter.
   */

  @DISPID(1611137029) //= 0x60080005. The runtime will prefer the VTID if present
  @VTID(45)
  void configuration(
    short oLineNb);


  /**
   * <p>
   * Getter method for the COM property "ConfigurationsNb"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(1611137031) //= 0x60080007. The runtime will prefer the VTID if present
  @VTID(46)
  short configurationsNb();


  /**
   * <p>
   * Getter method for the COM property "FilePath"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1611137032) //= 0x60080008. The runtime will prefer the VTID if present
  @VTID(47)
  java.lang.String filePath();


  /**
   * <p>
   * Setter method for the COM property "FilePath"
   * </p>
   * @param oFilePath Mandatory Holder<java.lang.String> parameter.
   */

  @DISPID(1611137032) //= 0x60080008. The runtime will prefer the VTID if present
  @VTID(48)
  void filePath(
    Holder<java.lang.String> oFilePath);


  /**
   * <p>
   * Getter method for the COM property "ColumnsNb"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(1611137034) //= 0x6008000a. The runtime will prefer the VTID if present
  @VTID(49)
  short columnsNb();


  /**
   * @param iRow Mandatory short parameter.
   * @param iColumn Mandatory short parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1611137035) //= 0x6008000b. The runtime will prefer the VTID if present
  @VTID(50)
  java.lang.String cellAsString(
    short iRow,
    short iColumn);


  /**
   */

  @DISPID(1611137036) //= 0x6008000c. The runtime will prefer the VTID if present
  @VTID(51)
  void synchronize();


  // Properties:
}
