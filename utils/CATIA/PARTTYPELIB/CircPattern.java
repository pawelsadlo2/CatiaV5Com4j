import com4j.*;

@IID("{5F2E8A03-669C-11D1-A27F-0000F87546FD}")
public interface CircPattern extends Pattern {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "RadialDirectionRow"
   * </p>
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.IntParam
   */

  @DISPID(1611137024) //= 0x60080000. The runtime will prefer the VTID if present
  @VTID(27)
  IntParam radialDirectionRow();


  /**
   * <p>
   * Getter method for the COM property "AngularDirectionRow"
   * </p>
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.IntParam
   */

  @DISPID(1611137025) //= 0x60080001. The runtime will prefer the VTID if present
  @VTID(28)
  IntParam angularDirectionRow();


  /**
   * <p>
   * Getter method for the COM property "RadialAlignment"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1611137026) //= 0x60080002. The runtime will prefer the VTID if present
  @VTID(29)
  boolean radialAlignment();


  /**
   * <p>
   * Setter method for the COM property "RadialAlignment"
   * </p>
   * @param oIsAligned Mandatory boolean parameter.
   */

  @DISPID(1611137026) //= 0x60080002. The runtime will prefer the VTID if present
  @VTID(30)
  void radialAlignment(
    boolean oIsAligned);


  /**
   * <p>
   * Getter method for the COM property "RotationOrientation"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1611137028) //= 0x60080004. The runtime will prefer the VTID if present
  @VTID(31)
  boolean rotationOrientation();


  /**
   * <p>
   * Setter method for the COM property "RotationOrientation"
   * </p>
   * @param oIsAligned Mandatory boolean parameter.
   */

  @DISPID(1611137028) //= 0x60080004. The runtime will prefer the VTID if present
  @VTID(32)
  void rotationOrientation(
    boolean oIsAligned);


  /**
   * <p>
   * Getter method for the COM property "RadialRepartition"
   * </p>
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.LinearRepartition
   */

  @DISPID(1611137030) //= 0x60080006. The runtime will prefer the VTID if present
  @VTID(33)
  LinearRepartition radialRepartition();


  /**
   * <p>
   * Getter method for the COM property "CatiaV5TypeLibs.PartItfTypeLib.AngularRepartition"
   * </p>
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.AngularRepartition
   */

  @DISPID(1611137031) //= 0x60080007. The runtime will prefer the VTID if present
  @VTID(34)
  AngularRepartition angularRepartition();


  /**
   * <p>
   * Getter method for the COM property "CircularPatternParameters"
   * </p>
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.CatCircularPatternParameters
   */

  @DISPID(1611137032) //= 0x60080008. The runtime will prefer the VTID if present
  @VTID(35)
  CatCircularPatternParameters circularPatternParameters();


  /**
   * <p>
   * Setter method for the COM property "CircularPatternParameters"
   * </p>
   * @param oParameters Mandatory CatiaV5TypeLibs.PartItfTypeLib.CatCircularPatternParameters parameter.
   */

  @DISPID(1611137032) //= 0x60080008. The runtime will prefer the VTID if present
  @VTID(36)
  void circularPatternParameters(
    CatCircularPatternParameters oParameters);


  /**
   * @param ioRotationCenter Mandatory java.lang.Object[] parameter.
   */

  @DISPID(1611137034) //= 0x6008000a. The runtime will prefer the VTID if present
  @VTID(37)
  void getRotationCenter(
    java.lang.Object[] ioRotationCenter);


  /**
   * @param iRotationCenter Mandatory Reference parameter.
   */

  @DISPID(1611137035) //= 0x6008000b. The runtime will prefer the VTID if present
  @VTID(38)
  void setRotationCenter(
    Reference iRotationCenter);


  /**
   * @param ioRotationAxis Mandatory java.lang.Object[] parameter.
   */

  @DISPID(1611137036) //= 0x6008000c. The runtime will prefer the VTID if present
  @VTID(39)
  void getRotationAxis(
    java.lang.Object[] ioRotationAxis);


  /**
   * @param iRotationAxis Mandatory Reference parameter.
   */

  @DISPID(1611137037) //= 0x6008000d. The runtime will prefer the VTID if present
  @VTID(40)
  void setRotationAxis(
    Reference iRotationAxis);


  /**
   * @param iInstanceNumber Mandatory int parameter.
   */

  @DISPID(1611137038) //= 0x6008000e. The runtime will prefer the VTID if present
  @VTID(41)
  void setUnequalStep(
    int iInstanceNumber);


  /**
   * @param iInstanceNumber Mandatory int parameter.
   * @param iAngularSpacing Mandatory double parameter.
   */

  @DISPID(1611137039) //= 0x6008000f. The runtime will prefer the VTID if present
  @VTID(42)
  void setInstanceAngularSpacing(
    int iInstanceNumber,
    double iAngularSpacing);


  /**
   * @param iInstanceNumber Mandatory int parameter.
   */

  @DISPID(1611137040) //= 0x60080010. The runtime will prefer the VTID if present
  @VTID(43)
  void setUnequalInstanceNumber(
    int iInstanceNumber);


  // Properties:
}
