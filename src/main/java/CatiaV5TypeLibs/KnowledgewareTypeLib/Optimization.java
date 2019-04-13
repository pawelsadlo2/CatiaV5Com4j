package CatiaV5TypeLibs.KnowledgewareTypeLib;
import CatiaV5TypeLibs.InfTypeLib.*;

import com4j.*;

@IID("{299B41CE-B0A6-11D4-A38C-00D0B7AC63BE}")
public interface Optimization extends KnowledgeObject {
  // Methods:
  /**
   * @param iWithStopDialog Mandatory boolean parameter.
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(26)
  void run(
    boolean iWithStopDialog);


  /**
   * <p>
   * Getter method for the COM property "ObjectiveParameter"
   * </p>
   * @return  Returns a value of type RealParam
   */

  @DISPID(1611005953) //= 0x60060001. The runtime will prefer the VTID if present
  @VTID(27)
  RealParam objectiveParameter();


  /**
   * <p>
   * Setter method for the COM property "ObjectiveParameter"
   * </p>
   * @param oParameter Mandatory RealParam parameter.
   */

  @DISPID(1611005953) //= 0x60060001. The runtime will prefer the VTID if present
  @VTID(28)
  void objectiveParameter(
    RealParam oParameter);


  /**
   * <p>
   * Getter method for the COM property "MaxEvalsNb"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611005955) //= 0x60060003. The runtime will prefer the VTID if present
  @VTID(29)
  int maxEvalsNb();


  /**
   * <p>
   * Setter method for the COM property "MaxEvalsNb"
   * </p>
   * @param oNb Mandatory int parameter.
   */

  @DISPID(1611005955) //= 0x60060003. The runtime will prefer the VTID if present
  @VTID(30)
  void maxEvalsNb(
    int oNb);


  /**
   * <p>
   * Getter method for the COM property "MaxTime"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611005957) //= 0x60060005. The runtime will prefer the VTID if present
  @VTID(31)
  int maxTime();


  /**
   * <p>
   * Setter method for the COM property "MaxTime"
   * </p>
   * @param oMaxTime Mandatory int parameter.
   */

  @DISPID(1611005957) //= 0x60060005. The runtime will prefer the VTID if present
  @VTID(32)
  void maxTime(
    int oMaxTime);


  /**
   * <p>
   * Getter method for the COM property "MaxEvalsWoImprovement"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611005959) //= 0x60060007. The runtime will prefer the VTID if present
  @VTID(33)
  int maxEvalsWoImprovement();


  /**
   * <p>
   * Setter method for the COM property "MaxEvalsWoImprovement"
   * </p>
   * @param oMaxEvalsWoImpvt Mandatory int parameter.
   */

  @DISPID(1611005959) //= 0x60060007. The runtime will prefer the VTID if present
  @VTID(34)
  void maxEvalsWoImprovement(
    int oMaxEvalsWoImpvt);


  /**
   * <p>
   * Getter method for the COM property "UseMaxTime"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005961) //= 0x60060009. The runtime will prefer the VTID if present
  @VTID(35)
  boolean useMaxTime();


  /**
   * <p>
   * Setter method for the COM property "UseMaxTime"
   * </p>
   * @param oUse Mandatory boolean parameter.
   */

  @DISPID(1611005961) //= 0x60060009. The runtime will prefer the VTID if present
  @VTID(36)
  void useMaxTime(
    boolean oUse);


  /**
   * <p>
   * Getter method for the COM property "UseMaxEvalsWoImprovement"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005963) //= 0x6006000b. The runtime will prefer the VTID if present
  @VTID(37)
  boolean useMaxEvalsWoImprovement();


  /**
   * <p>
   * Setter method for the COM property "UseMaxEvalsWoImprovement"
   * </p>
   * @param oUse Mandatory boolean parameter.
   */

  @DISPID(1611005963) //= 0x6006000b. The runtime will prefer the VTID if present
  @VTID(38)
  void useMaxEvalsWoImprovement(
    boolean oUse);


  /**
   * <p>
   * Getter method for the COM property "TargetValue"
   * </p>
   * @return  Returns a value of type RealParam
   */

  @DISPID(1611005965) //= 0x6006000d. The runtime will prefer the VTID if present
  @VTID(39)
  RealParam targetValue();


  /**
   * <p>
   * Getter method for the COM property "OptimizationType"
   * </p>
   * @return  Returns a value of type CatOptimizationType
   */

  @DISPID(1611005966) //= 0x6006000e. The runtime will prefer the VTID if present
  @VTID(40)
  CatOptimizationType optimizationType();


  /**
   * <p>
   * Setter method for the COM property "OptimizationType"
   * </p>
   * @param oType Mandatory CatOptimizationType parameter.
   */

  @DISPID(1611005966) //= 0x6006000e. The runtime will prefer the VTID if present
  @VTID(41)
  void optimizationType(
    CatOptimizationType oType);


  /**
   * <p>
   * Getter method for the COM property "AlgorithmType"
   * </p>
   * @return  Returns a value of type CatAlgorithmType
   */

  @DISPID(1611005968) //= 0x60060010. The runtime will prefer the VTID if present
  @VTID(42)
  CatAlgorithmType algorithmType();


  /**
   * <p>
   * Setter method for the COM property "AlgorithmType"
   * </p>
   * @param oType Mandatory CatAlgorithmType parameter.
   */

  @DISPID(1611005968) //= 0x60060010. The runtime will prefer the VTID if present
  @VTID(43)
  void algorithmType(
    CatAlgorithmType oType);


  /**
   * <p>
   * Getter method for the COM property "Constraints"
   * </p>
   * @return  Returns a value of type OptimizationConstraints
   */

  @DISPID(1611005970) //= 0x60060012. The runtime will prefer the VTID if present
  @VTID(44)
  OptimizationConstraints constraints();


  /**
   * <p>
   * Getter method for the COM property "FreeParameters"
   * </p>
   * @return  Returns a value of type FreeParameters
   */

  @DISPID(1611005971) //= 0x60060013. The runtime will prefer the VTID if present
  @VTID(45)
  FreeParameters freeParameters();


  /**
   * <p>
   * Getter method for the COM property "ConvSpeed"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611005972) //= 0x60060014. The runtime will prefer the VTID if present
  @VTID(46)
  int convSpeed();


  /**
   * <p>
   * Setter method for the COM property "ConvSpeed"
   * </p>
   * @param oConvSpeed Mandatory int parameter.
   */

  @DISPID(1611005972) //= 0x60060014. The runtime will prefer the VTID if present
  @VTID(47)
  void convSpeed(
    int oConvSpeed);


  // Properties:
}
