package CatiaV5TypeLibs.HybridShapeTypeLib;
import CatiaV5TypeLibs.InfTypeLib.*;
import CatiaV5TypeLibs.MecModTypeLib.*;
import CatiaV5TypeLibs.KnowledgewareTypeLib.*;

import com4j.*;

@IID("{8C89B257-28C2-0000-0280-020E60000000}")
public interface HybridShapeProject extends HybridShape {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "ElemToProject"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(25)
  Reference elemToProject();


  /**
   * <p>
   * Setter method for the COM property "ElemToProject"
   * </p>
   * @param oElem Mandatory Reference parameter.
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(26)
  void elemToProject(
    Reference oElem);


  /**
   * <p>
   * Getter method for the COM property "Direction"
   * </p>
   * @return  Returns a value of type HybridShapeDirection
   */

  @DISPID(1611005954) //= 0x60060002. The runtime will prefer the VTID if present
  @VTID(27)
  HybridShapeDirection direction();


  /**
   * <p>
   * Setter method for the COM property "Direction"
   * </p>
   * @param oElem Mandatory HybridShapeDirection parameter.
   */

  @DISPID(1611005954) //= 0x60060002. The runtime will prefer the VTID if present
  @VTID(28)
  void direction(
    HybridShapeDirection oElem);


  /**
   * <p>
   * Getter method for the COM property "Support"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611005956) //= 0x60060004. The runtime will prefer the VTID if present
  @VTID(29)
  Reference support();


  /**
   * <p>
   * Setter method for the COM property "Support"
   * </p>
   * @param oElem Mandatory Reference parameter.
   */

  @DISPID(1611005956) //= 0x60060004. The runtime will prefer the VTID if present
  @VTID(30)
  void support(
    Reference oElem);


  /**
   * <p>
   * Getter method for the COM property "Normal"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005958) //= 0x60060006. The runtime will prefer the VTID if present
  @VTID(31)
  boolean normal();


  /**
   * <p>
   * Setter method for the COM property "Normal"
   * </p>
   * @param oNormal Mandatory boolean parameter.
   */

  @DISPID(1611005958) //= 0x60060006. The runtime will prefer the VTID if present
  @VTID(32)
  void normal(
    boolean oNormal);


  /**
   * <p>
   * Getter method for the COM property "SolutionType"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611005960) //= 0x60060008. The runtime will prefer the VTID if present
  @VTID(33)
  int solutionType();


  /**
   * <p>
   * Setter method for the COM property "SolutionType"
   * </p>
   * @param oSolutionType Mandatory int parameter.
   */

  @DISPID(1611005960) //= 0x60060008. The runtime will prefer the VTID if present
  @VTID(34)
  void solutionType(
    int oSolutionType);


  /**
   * <p>
   * Getter method for the COM property "SmoothingType"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611005962) //= 0x6006000a. The runtime will prefer the VTID if present
  @VTID(35)
  int smoothingType();


  /**
   * <p>
   * Setter method for the COM property "SmoothingType"
   * </p>
   * @param oType Mandatory int parameter.
   */

  @DISPID(1611005962) //= 0x6006000a. The runtime will prefer the VTID if present
  @VTID(36)
  void smoothingType(
    int oType);


  /**
   * <p>
   * Getter method for the COM property "MaximumDeviationValue"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(1611005964) //= 0x6006000c. The runtime will prefer the VTID if present
  @VTID(37)
  double maximumDeviationValue();


  /**
   * <p>
   * Setter method for the COM property "MaximumDeviationValue"
   * </p>
   * @param oDevValue Mandatory double parameter.
   */

  @DISPID(1611005964) //= 0x6006000c. The runtime will prefer the VTID if present
  @VTID(38)
  void maximumDeviationValue(
    double oDevValue);


  /**
   * <p>
   * Getter method for the COM property "p3DSmoothing"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005966) //= 0x6006000e. The runtime will prefer the VTID if present
  @VTID(39)
  boolean p3DSmoothing();


  /**
   * <p>
   * Setter method for the COM property "p3DSmoothing"
   * </p>
   * @param o3DSmoothing Mandatory boolean parameter.
   */

  @DISPID(1611005966) //= 0x6006000e. The runtime will prefer the VTID if present
  @VTID(40)
  void p3DSmoothing(
    boolean o3DSmoothing);


  // Properties:
}
