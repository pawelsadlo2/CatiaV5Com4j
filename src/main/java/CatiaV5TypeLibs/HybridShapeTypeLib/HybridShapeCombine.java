package CatiaV5TypeLibs.HybridShapeTypeLib;
import CatiaV5TypeLibs.InfTypeLib.*;
import CatiaV5TypeLibs.MecModTypeLib.*;

import com4j.*;

@IID("{8FBCCF3E-5722-0000-0280-020E60000000}")
public interface HybridShapeCombine extends HybridShape {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Elem1"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(25)
  Reference elem1();


  /**
   * <p>
   * Setter method for the COM property "Elem1"
   * </p>
   * @param oElem Mandatory Reference parameter.
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(26)
  void elem1(
    Reference oElem);


  /**
   * <p>
   * Getter method for the COM property "Direction1"
   * </p>
   * @return  Returns a value of type HybridShapeDirection
   */

  @DISPID(1611005954) //= 0x60060002. The runtime will prefer the VTID if present
  @VTID(27)
  HybridShapeDirection direction1();


  /**
   * <p>
   * Setter method for the COM property "Direction1"
   * </p>
   * @param oElem Mandatory HybridShapeDirection parameter.
   */

  @DISPID(1611005954) //= 0x60060002. The runtime will prefer the VTID if present
  @VTID(28)
  void direction1(
    HybridShapeDirection oElem);


  /**
   * <p>
   * Getter method for the COM property "Elem2"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611005956) //= 0x60060004. The runtime will prefer the VTID if present
  @VTID(29)
  Reference elem2();


  /**
   * <p>
   * Setter method for the COM property "Elem2"
   * </p>
   * @param oElem Mandatory Reference parameter.
   */

  @DISPID(1611005956) //= 0x60060004. The runtime will prefer the VTID if present
  @VTID(30)
  void elem2(
    Reference oElem);


  /**
   * <p>
   * Getter method for the COM property "Direction2"
   * </p>
   * @return  Returns a value of type HybridShapeDirection
   */

  @DISPID(1611005958) //= 0x60060006. The runtime will prefer the VTID if present
  @VTID(31)
  HybridShapeDirection direction2();


  /**
   * <p>
   * Setter method for the COM property "Direction2"
   * </p>
   * @param oElem Mandatory HybridShapeDirection parameter.
   */

  @DISPID(1611005958) //= 0x60060006. The runtime will prefer the VTID if present
  @VTID(32)
  void direction2(
    HybridShapeDirection oElem);


  /**
   * <p>
   * Getter method for the COM property "NearestSolution"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611005960) //= 0x60060008. The runtime will prefer the VTID if present
  @VTID(33)
  int nearestSolution();


  /**
   * <p>
   * Setter method for the COM property "NearestSolution"
   * </p>
   * @param oSolutionType Mandatory int parameter.
   */

  @DISPID(1611005960) //= 0x60060008. The runtime will prefer the VTID if present
  @VTID(34)
  void nearestSolution(
    int oSolutionType);


  /**
   * <p>
   * Getter method for the COM property "SolutionTypeCombine"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611005962) //= 0x6006000a. The runtime will prefer the VTID if present
  @VTID(35)
  int solutionTypeCombine();


  /**
   * <p>
   * Setter method for the COM property "SolutionTypeCombine"
   * </p>
   * @param oSolutionTypeCombine Mandatory int parameter.
   */

  @DISPID(1611005962) //= 0x6006000a. The runtime will prefer the VTID if present
  @VTID(36)
  void solutionTypeCombine(
    int oSolutionTypeCombine);


  // Properties:
}
