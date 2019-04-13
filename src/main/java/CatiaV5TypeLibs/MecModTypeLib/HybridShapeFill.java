package CatiaV5TypeLibs.MecModTypeLib;
import CatiaV5TypeLibs.InfTypeLib.*;

import com4j.*;

@IID("{8B6F88C6-A14C-0000-0280-020E60000000}")
public interface HybridShapeFill extends HybridShape {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Continuity"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(25)
  int continuity();


  /**
   * <p>
   * Setter method for the COM property "Continuity"
   * </p>
   * @param oContinuity Mandatory int parameter.
   */

  @DISPID(1611005952) //= 0x60060000. The runtime will prefer the VTID if present
  @VTID(26)
  void continuity(
    int oContinuity);


  /**
   * <p>
   * Getter method for the COM property "Constraint"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611005954) //= 0x60060002. The runtime will prefer the VTID if present
  @VTID(27)
  Reference constraint();


  /**
   * <p>
   * Setter method for the COM property "Constraint"
   * </p>
   * @param oConstraint Mandatory Reference parameter.
   */

  @DISPID(1611005954) //= 0x60060002. The runtime will prefer the VTID if present
  @VTID(28)
  void constraint(
    Reference oConstraint);


  /**
   * <p>
   * Getter method for the COM property "PlaneOnlyMode"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005956) //= 0x60060004. The runtime will prefer the VTID if present
  @VTID(29)
  boolean planeOnlyMode();


  /**
   * <p>
   * Setter method for the COM property "PlaneOnlyMode"
   * </p>
   * @param oPlaneOnly Mandatory boolean parameter.
   */

  @DISPID(1611005956) //= 0x60060004. The runtime will prefer the VTID if present
  @VTID(30)
  void planeOnlyMode(
    boolean oPlaneOnly);


  /**
   * <p>
   * Getter method for the COM property "TolerantMode"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1611005958) //= 0x60060006. The runtime will prefer the VTID if present
  @VTID(31)
  boolean tolerantMode();


  /**
   * <p>
   * Setter method for the COM property "TolerantMode"
   * </p>
   * @param oTolerantMode Mandatory boolean parameter.
   */

  @DISPID(1611005958) //= 0x60060006. The runtime will prefer the VTID if present
  @VTID(32)
  void tolerantMode(
    boolean oTolerantMode);


  /**
   * <p>
   * Getter method for the COM property "MaximumDeviationValue"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(1611005960) //= 0x60060008. The runtime will prefer the VTID if present
  @VTID(33)
  double maximumDeviationValue();


  /**
   * <p>
   * Setter method for the COM property "MaximumDeviationValue"
   * </p>
   * @param oDevValue Mandatory double parameter.
   */

  @DISPID(1611005960) //= 0x60060008. The runtime will prefer the VTID if present
  @VTID(34)
  void maximumDeviationValue(
    double oDevValue);


  /**
   * @param iBoundary Mandatory Reference parameter.
   */

  @DISPID(1611005962) //= 0x6006000a. The runtime will prefer the VTID if present
  @VTID(35)
  void addBound(
    Reference iBoundary);


  /**
   * @param iBoundary Mandatory Reference parameter.
   * @param iPos Mandatory int parameter.
   */

  @DISPID(1611005963) //= 0x6006000b. The runtime will prefer the VTID if present
  @VTID(36)
  void insertBoundAfterPosition(
    Reference iBoundary,
    int iPos);


  /**
   * @param iBoundary Mandatory Reference parameter.
   * @return  Returns a value of type int
   */

  @DISPID(1611005964) //= 0x6006000c. The runtime will prefer the VTID if present
  @VTID(37)
  int getBoundPosition(
    Reference iBoundary);


  /**
   * @param iPos Mandatory int parameter.
   * @return  Returns a value of type Reference
   */

  @DISPID(1611005965) //= 0x6006000d. The runtime will prefer the VTID if present
  @VTID(38)
  Reference getBoundAtPosition(
    int iPos);


  /**
   * @param iPos Mandatory int parameter.
   */

  @DISPID(1611005966) //= 0x6006000e. The runtime will prefer the VTID if present
  @VTID(39)
  void removeBoundAtPosition(
    int iPos);


  /**
   */

  @DISPID(1611005967) //= 0x6006000f. The runtime will prefer the VTID if present
  @VTID(40)
  void removeAllBound();


  /**
   * @param iBoundary Mandatory Reference parameter.
   * @param iPos Mandatory int parameter.
   */

  @DISPID(1611005968) //= 0x60060010. The runtime will prefer the VTID if present
  @VTID(41)
  void replaceBoundAtPosition(
    Reference iBoundary,
    int iPos);


  /**
   * @return  Returns a value of type int
   */

  @DISPID(1611005969) //= 0x60060011. The runtime will prefer the VTID if present
  @VTID(42)
  int getBoundSize();


  /**
   * @param iBoundary Mandatory Reference parameter.
   * @param iSupport Mandatory Reference parameter.
   */

  @DISPID(1611005970) //= 0x60060012. The runtime will prefer the VTID if present
  @VTID(43)
  void addSupportAtBound(
    Reference iBoundary,
    Reference iSupport);


  /**
   * @param iPos Mandatory int parameter.
   * @return  Returns a value of type Reference
   */

  @DISPID(1611005971) //= 0x60060013. The runtime will prefer the VTID if present
  @VTID(44)
  Reference getSupportAtPosition(
    int iPos);


  /**
   * @param iPos Mandatory int parameter.
   */

  @DISPID(1611005972) //= 0x60060014. The runtime will prefer the VTID if present
  @VTID(45)
  void removeSupportAtPosition(
    int iPos);


  /**
   * @param iSupport Mandatory Reference parameter.
   * @param iPos Mandatory int parameter.
   */

  @DISPID(1611005973) //= 0x60060015. The runtime will prefer the VTID if present
  @VTID(46)
  void replaceSupportAtPosition(
    Reference iSupport,
    int iPos);


  /**
   * @param iContinuity Mandatory int parameter.
   * @param iPos Mandatory int parameter.
   */

  @DISPID(1611005974) //= 0x60060016. The runtime will prefer the VTID if present
  @VTID(47)
  void setBoundaryContinuity(
    int iContinuity,
    int iPos);


  /**
   * @param iPos Mandatory int parameter.
   * @return  Returns a value of type int
   */

  @DISPID(1611005975) //= 0x60060017. The runtime will prefer the VTID if present
  @VTID(48)
  int getBoundaryContinuity(
    int iPos);


  /**
   * @return  Returns a value of type int
   */

  @DISPID(1611005976) //= 0x60060018. The runtime will prefer the VTID if present
  @VTID(49)
  int getConstraintsSize();


  /**
   * @param iPos Mandatory int parameter.
   * @return  Returns a value of type Reference
   */

  @DISPID(1611005977) //= 0x60060019. The runtime will prefer the VTID if present
  @VTID(50)
  Reference getConstraintAtPosition(
    int iPos);


  /**
   * @param iConstraint Mandatory Reference parameter.
   */

  @DISPID(1611005978) //= 0x6006001a. The runtime will prefer the VTID if present
  @VTID(51)
  void appendConstraint(
    Reference iConstraint);


  /**
   * @param iPos Mandatory int parameter.
   */

  @DISPID(1611005979) //= 0x6006001b. The runtime will prefer the VTID if present
  @VTID(52)
  void removeConstraint(
    int iPos);


  /**
   * @param iPos Mandatory int parameter.
   * @param iConstraint Mandatory Reference parameter.
   */

  @DISPID(1611005980) //= 0x6006001c. The runtime will prefer the VTID if present
  @VTID(53)
  void replaceConstraint(
    int iPos,
    Reference iConstraint);


  // Properties:
}
