package CatiaV5TypeLibs.PartTypeLib;
import CatiaV5TypeLibs.InfTypeLib.*;
import CatiaV5TypeLibs.MecModTypeLib.*;
import CatiaV5TypeLibs.KnowledgewareTypeLib.*;

import com4j.*;

@IID("{0C438515-6A88-11D1-A280-0000F87546FD}")
public interface Geometry2D extends GeometricElement {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "ReportName"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(23)
  int reportName();


  /**
   * <p>
   * Setter method for the COM property "ReportName"
   * </p>
   * @param oReportName Mandatory int parameter.
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(24)
  void reportName(
    int oReportName);


  /**
   * <p>
   * Getter method for the COM property "Construction"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005954) //= 0x60060002. The runtime will prefer the VTID if present
  @VTID(25)
  boolean construction();


  /**
   * <p>
   * Setter method for the COM property "Construction"
   * </p>
   * @param oConstruction Mandatory boolean parameter.
   */

  @DISPID(1611005954) //= 0x60060002. The runtime will prefer the VTID if present
  @VTID(26)
  void construction(
    boolean oConstruction);


  // Properties:
}
