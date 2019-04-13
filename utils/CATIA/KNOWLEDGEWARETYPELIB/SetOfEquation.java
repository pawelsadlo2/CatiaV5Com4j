import com4j.*;

@IID("{5C3E5F20-220A-11D5-9EF8-00508B617AE8}")
public interface SetOfEquation extends Relation {
  // Methods:
  /**
   * @param iIndex Mandatory int parameter.
   */

  @DISPID(1611137024) //= 0x60080000. The runtime will prefer the VTID if present
  @VTID(39)
  void setInputParameters(
    int iIndex);


  /**
   * @param iParameter Mandatory Parameter parameter.
   */

  @DISPID(1611137025) //= 0x60080001. The runtime will prefer the VTID if present
  @VTID(40)
  void setParameterAsInput(
    Parameter iParameter);


  /**
   * @param iParameter Mandatory Parameter parameter.
   */

  @DISPID(1611137026) //= 0x60080002. The runtime will prefer the VTID if present
  @VTID(41)
  void setParameterAsOutput(
    Parameter iParameter);


  /**
   * @param iEps Mandatory double parameter.
   */

  @DISPID(1611137027) //= 0x60080003. The runtime will prefer the VTID if present
  @VTID(42)
  void setPrecision(
    double iEps);


  /**
   * @return  Returns a value of type double
   */

  @DISPID(1611137028) //= 0x60080004. The runtime will prefer the VTID if present
  @VTID(43)
  double getPrecision();


  /**
   * @param iGauss Mandatory boolean parameter.
   */

  @DISPID(1611137029) //= 0x60080005. The runtime will prefer the VTID if present
  @VTID(44)
  void useSymbolcTransformations(
    boolean iGauss);


  /**
   * @return  Returns a value of type boolean
   */

  @DISPID(1611137030) //= 0x60080006. The runtime will prefer the VTID if present
  @VTID(45)
  boolean getSymbolcTransformations();


  /**
   * @param iUsed Mandatory boolean parameter.
   */

  @DISPID(1611137031) //= 0x60080007. The runtime will prefer the VTID if present
  @VTID(46)
  void useStopDialog(
    boolean iUsed);


  /**
   * @return  Returns a value of type boolean
   */

  @DISPID(1611137032) //= 0x60080008. The runtime will prefer the VTID if present
  @VTID(47)
  boolean isStopDialog();


  /**
   * @param iMaxTime Mandatory int parameter.
   */

  @DISPID(1611137033) //= 0x60080009. The runtime will prefer the VTID if present
  @VTID(48)
  void setMaxCalculationTime(
    int iMaxTime);


  /**
   * @return  Returns a value of type int
   */

  @DISPID(1611137034) //= 0x6008000a. The runtime will prefer the VTID if present
  @VTID(49)
  int getMaxCalculationTime();


  // Properties:
}
