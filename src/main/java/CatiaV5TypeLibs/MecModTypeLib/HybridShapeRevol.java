package CatiaV5TypeLibs.MecModTypeLib;
import CatiaV5TypeLibs.KnowledgewareTypeLib.*;
import CatiaV5TypeLibs.InfTypeLib.*;

import com4j.*;

@IID("{8B5A2C2B-BA5C-0000-0280-020E60000000}")
public interface HybridShapeRevol extends HybridShape {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "BeginAngle"
   * </p>
   * @return  Returns a value of type Angle
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(25)
  Angle beginAngle();


  /**
   * <p>
   * Getter method for the COM property "EndAngle"
   * </p>
   * @return  Returns a value of type Angle
   */

  @DISPID(1611005953) //= 0x60060001. The runtime will prefer the VTID if present
  @VTID(26)
  Angle endAngle();


  /**
   * <p>
   * Getter method for the COM property "Axis"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611005954) //= 0x60060002. The runtime will prefer the VTID if present
  @VTID(27)
  Reference axis();


  /**
   * <p>
   * Setter method for the COM property "Axis"
   * </p>
   * @param oDir Mandatory Reference parameter.
   */

  @DISPID(1611005954) //= 0x60060002. The runtime will prefer the VTID if present
  @VTID(28)
  void axis(
    Reference oDir);


  /**
   * <p>
   * Getter method for the COM property "Profil"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611005956) //= 0x60060004. The runtime will prefer the VTID if present
  @VTID(29)
  Reference profil();


  /**
   * <p>
   * Setter method for the COM property "Profil"
   * </p>
   * @param oProfil Mandatory Reference parameter.
   */

  @DISPID(1611005956) //= 0x60060004. The runtime will prefer the VTID if present
  @VTID(30)
  void profil(
    Reference oProfil);


  /**
   * <p>
   * Getter method for the COM property "Context"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611005958) //= 0x60060006. The runtime will prefer the VTID if present
  @VTID(31)
  int context();


  /**
   * <p>
   * Setter method for the COM property "Context"
   * </p>
   * @param oContext Mandatory int parameter.
   */

  @DISPID(1611005958) //= 0x60060006. The runtime will prefer the VTID if present
  @VTID(32)
  void context(
    int oContext);


  /**
   * <p>
   * Setter method for the COM property "Orientation"
   * </p>
   * @param oOrientation Mandatory boolean parameter.
   */

  @DISPID(1611005960) //= 0x60060008. The runtime will prefer the VTID if present
  @VTID(33)
  void orientation(
    boolean oOrientation);


  /**
   * <p>
   * Getter method for the COM property "Orientation"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005960) //= 0x60060008. The runtime will prefer the VTID if present
  @VTID(34)
  boolean orientation();


  // Properties:
}
