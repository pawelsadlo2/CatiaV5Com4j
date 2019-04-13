package CatiaV5TypeLibs.HybridShapeTypeLib;
import CatiaV5TypeLibs.InfTypeLib.*;
import CatiaV5TypeLibs.MecModTypeLib.*;
import CatiaV5TypeLibs.KnowledgewareTypeLib.*;

import com4j.*;

@IID("{AE57BC91-DE62-0000-0206-040C4E000000}")
public interface HybridShapeVariableOffset extends HybridShape {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "GlobalSurface"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(25)
  Reference globalSurface();


  /**
   * <p>
   * Setter method for the COM property "GlobalSurface"
   * </p>
   * @param oGlobalSurface Mandatory Reference parameter.
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(26)
  void globalSurface(
    Reference oGlobalSurface);


  /**
   * @param oListOfVariableConstraints Mandatory java.lang.Object[] parameter.
   */

  @DISPID(1611005954) //= 0x60060002. The runtime will prefer the VTID if present
  @VTID(27)
  void getListOfVariableConstraints(
    java.lang.Object[] oListOfVariableConstraints);


  /**
   * @param iVariableConstraint Mandatory Reference parameter.
   */

  @DISPID(1611005955) //= 0x60060003. The runtime will prefer the VTID if present
  @VTID(28)
  void addVariableConstraint(
    Reference iVariableConstraint);


  /**
   * @param oListOfConstantConstraints Mandatory java.lang.Object[] parameter.
   */

  @DISPID(1611005956) //= 0x60060004. The runtime will prefer the VTID if present
  @VTID(29)
  void getListOfConstantConstraints(
    java.lang.Object[] oListOfConstantConstraints);


  /**
   * @param iConstantConstraint Mandatory Reference parameter.
   * @param iOffsetValue Mandatory Length parameter.
   */

  @DISPID(1611005957) //= 0x60060005. The runtime will prefer the VTID if present
  @VTID(30)
  void addConstantConstraint(
    Reference iConstantConstraint,
    Length iOffsetValue);


  /**
   * @param iRank Mandatory int parameter.
   */

  @DISPID(1611005958) //= 0x60060006. The runtime will prefer the VTID if present
  @VTID(31)
  void removeConstraint(
    int iRank);


  /**
   * @param iRank Mandatory int parameter.
   * @return  Returns a value of type Reference
   */

  @DISPID(1611005959) //= 0x60060007. The runtime will prefer the VTID if present
  @VTID(32)
  Reference getTrickyFace(
    int iRank);


  /**
   * @param iTrickyFace Mandatory Reference parameter.
   */

  @DISPID(1611005960) //= 0x60060008. The runtime will prefer the VTID if present
  @VTID(33)
  void addTrickyFace(
    Reference iTrickyFace);


  /**
   * @param iRank Mandatory int parameter.
   */

  @DISPID(1611005961) //= 0x60060009. The runtime will prefer the VTID if present
  @VTID(34)
  void removeTrickyFace(
    int iRank);


  // Properties:
}
