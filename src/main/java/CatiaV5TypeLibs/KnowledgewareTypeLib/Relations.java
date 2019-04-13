package CatiaV5TypeLibs.KnowledgewareTypeLib;
import CatiaV5TypeLibs.InfTypeLib.*;

import com4j.*;

@IID("{BFB06FF8-5478-11D1-A272-0000F87546FD}")
public interface Relations extends Collection {
  // Methods:
  /**
   * @param iName Mandatory Holder<java.lang.String> parameter.
   * @param iComment Mandatory Holder<java.lang.String> parameter.
   * @param iOutputParameter Mandatory Parameter parameter.
   * @param iFormulaBody Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type Formula
   */

  @DISPID(1610940416) //= 0x60050000. The runtime will prefer the VTID if present
  @VTID(23)
  Formula createFormula(
    Holder<java.lang.String> iName,
    Holder<java.lang.String> iComment,
    Parameter iOutputParameter,
    Holder<java.lang.String> iFormulaBody);


  /**
   * @param iName Mandatory Holder<java.lang.String> parameter.
   * @param iComment Mandatory Holder<java.lang.String> parameter.
   * @param iProgramBody Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type Rule
   */

  @DISPID(1610940417) //= 0x60050001. The runtime will prefer the VTID if present
  @VTID(24)
  Rule createProgram(
    Holder<java.lang.String> iName,
    Holder<java.lang.String> iComment,
    Holder<java.lang.String> iProgramBody);


  /**
   * @param iName Mandatory Holder<java.lang.String> parameter.
   * @param iComment Mandatory Holder<java.lang.String> parameter.
   * @param iCheckBody Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type Check
   */

  @DISPID(1610940418) //= 0x60050002. The runtime will prefer the VTID if present
  @VTID(25)
  Check createCheck(
    Holder<java.lang.String> iName,
    Holder<java.lang.String> iComment,
    Holder<java.lang.String> iCheckBody);


  /**
   * @param iName Mandatory Holder<java.lang.String> parameter.
   * @param iComment Mandatory Holder<java.lang.String> parameter.
   * @param iCopyMode Mandatory boolean parameter.
   * @param iSheetPath Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type DesignTable
   */

  @DISPID(1610940419) //= 0x60050003. The runtime will prefer the VTID if present
  @VTID(26)
  DesignTable createDesignTable(
    Holder<java.lang.String> iName,
    Holder<java.lang.String> iComment,
    boolean iCopyMode,
    Holder<java.lang.String> iSheetPath);


  /**
   * @param iName Mandatory Holder<java.lang.String> parameter.
   * @param iComment Mandatory Holder<java.lang.String> parameter.
   * @param iCopyMode Mandatory boolean parameter.
   * @param iSheetPath Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type DesignTable
   */

  @DISPID(1610940420) //= 0x60050004. The runtime will prefer the VTID if present
  @VTID(27)
  DesignTable createHorizontalDesignTable(
    Holder<java.lang.String> iName,
    Holder<java.lang.String> iComment,
    boolean iCopyMode,
    Holder<java.lang.String> iSheetPath);


  /**
   * @param iName Mandatory Holder<java.lang.String> parameter.
   * @param iComment Mandatory Holder<java.lang.String> parameter.
   * @param iLawBody Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type Law
   */

  @DISPID(1610940421) //= 0x60050005. The runtime will prefer the VTID if present
  @VTID(28)
  Law createLaw(
    Holder<java.lang.String> iName,
    Holder<java.lang.String> iComment,
    Holder<java.lang.String> iLawBody);


  /**
   * @param iIndex Mandatory java.lang.Object parameter.
   * @return  Returns a value of type Relation
   */

  @DISPID(1610940422) //= 0x60050006. The runtime will prefer the VTID if present
  @VTID(29)
  Relation item(
    java.lang.Object iIndex);


  /**
   * @param iIndex Mandatory java.lang.Object parameter.
   */

  @DISPID(1610940423) //= 0x60050007. The runtime will prefer the VTID if present
  @VTID(30)
  void remove(
    java.lang.Object iIndex);


  /**
   * @param iName Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type Relation
   */

  @DISPID(1610940424) //= 0x60050008. The runtime will prefer the VTID if present
  @VTID(31)
  Relation createRuleBase(
    Holder<java.lang.String> iName);


  /**
   * <p>
   * Getter method for the COM property "Optimizations"
   * </p>
   * @return  Returns a value of type Optimizations
   */

  @DISPID(1610940425) //= 0x60050009. The runtime will prefer the VTID if present
  @VTID(32)
  Optimizations optimizations();


  /**
   * @param iFeature Mandatory AnyObject parameter.
   * @param iRecursively Mandatory boolean parameter.
   * @return  Returns a value of type Relations
   */

  @DISPID(1610940426) //= 0x6005000a. The runtime will prefer the VTID if present
  @VTID(33)
  Relations subList(
    AnyObject iFeature,
    boolean iRecursively);


  /**
   * @param iName Mandatory Holder<java.lang.String> parameter.
   * @param iComment Mandatory Holder<java.lang.String> parameter.
   * @param iFormulaBody Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type SetOfEquation
   */

  @DISPID(1610940427) //= 0x6005000b. The runtime will prefer the VTID if present
  @VTID(34)
  SetOfEquation createSetOfEquations(
    Holder<java.lang.String> iName,
    Holder<java.lang.String> iComment,
    Holder<java.lang.String> iFormulaBody);


  /**
   * @param iName Mandatory Holder<java.lang.String> parameter.
   * @param iComment Mandatory Holder<java.lang.String> parameter.
   * @param iFormulaBody Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type SetOfEquation
   */

  @DISPID(1610940428) //= 0x6005000c. The runtime will prefer the VTID if present
  @VTID(35)
  SetOfEquation createConstraintsSatisfaction(
    Holder<java.lang.String> iName,
    Holder<java.lang.String> iComment,
    Holder<java.lang.String> iFormulaBody);


  /**
   * @param iParent Mandatory AnyObject parameter.
   */

  @DISPID(1610940429) //= 0x6005000d. The runtime will prefer the VTID if present
  @VTID(36)
  void createSetOfRelations(
    AnyObject iParent);


  /**
   * @param iName Mandatory Holder<java.lang.String> parameter.
   */

  @DISPID(1610940430) //= 0x6005000e. The runtime will prefer the VTID if present
  @VTID(37)
  void generateXMLReportForChecks(
    Holder<java.lang.String> iName);


  /**
   * <p>
   * Getter method for the COM property "FeatureGenerator"
   * </p>
   * @return  Returns a value of type FeatureGenerator
   */

  @DISPID(1610940431) //= 0x6005000f. The runtime will prefer the VTID if present
  @VTID(38)
  FeatureGenerator featureGenerator();


  // Properties:
}
