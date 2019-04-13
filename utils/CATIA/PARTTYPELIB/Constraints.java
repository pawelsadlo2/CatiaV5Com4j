import com4j.*;

@IID("{6B70F3B3-6BCF-11D1-A280-0000F87546FD}")
public interface Constraints extends Collection {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "BrokenConstraintsCount"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610940416) //= 0x60050000. The runtime will prefer the VTID if present
  @VTID(23)
  int brokenConstraintsCount();


  /**
   * <p>
   * Getter method for the COM property "UnUpdatedConstraintsCount"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610940417) //= 0x60050001. The runtime will prefer the VTID if present
  @VTID(24)
  int unUpdatedConstraintsCount();


  /**
   * @param iCstType Mandatory CatiaV5TypeLibs.PartItfTypeLib.CatConstraintType parameter.
   * @param iElem Mandatory Reference parameter.
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.Constraint
   */

  @DISPID(1610940418) //= 0x60050002. The runtime will prefer the VTID if present
  @VTID(25)
  Constraint addMonoEltCst(
    CatConstraintType iCstType,
    Reference iElem);


  /**
   * @param iCstType Mandatory CatiaV5TypeLibs.PartItfTypeLib.CatConstraintType parameter.
   * @param iFirstElem Mandatory Reference parameter.
   * @param iSecondElem Mandatory Reference parameter.
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.Constraint
   */

  @DISPID(1610940419) //= 0x60050003. The runtime will prefer the VTID if present
  @VTID(26)
  Constraint addBiEltCst(
    CatConstraintType iCstType,
    Reference iFirstElem,
    Reference iSecondElem);


  /**
   * @param iCstType Mandatory CatiaV5TypeLibs.PartItfTypeLib.CatConstraintType parameter.
   * @param iFirstElem Mandatory Reference parameter.
   * @param iSecondElem Mandatory Reference parameter.
   * @param iThirdElem Mandatory Reference parameter.
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.Constraint
   */

  @DISPID(1610940420) //= 0x60050004. The runtime will prefer the VTID if present
  @VTID(27)
  Constraint addTriEltCst(
    CatConstraintType iCstType,
    Reference iFirstElem,
    Reference iSecondElem,
    Reference iThirdElem);


  /**
   * @param iIndex Mandatory java.lang.Object parameter.
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.Constraint
   */

  @DISPID(1610940421) //= 0x60050005. The runtime will prefer the VTID if present
  @VTID(28)
  Constraint item(
    java.lang.Object iIndex);


  /**
   * @param iIndex Mandatory java.lang.Object parameter.
   */

  @DISPID(1610940422) //= 0x60050006. The runtime will prefer the VTID if present
  @VTID(29)
  void remove(
    java.lang.Object iIndex);


  // Properties:
}
