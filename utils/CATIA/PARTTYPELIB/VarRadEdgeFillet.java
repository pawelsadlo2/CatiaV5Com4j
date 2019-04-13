import com4j.*;

@IID("{A6BCAAA3-610B-11D1-A27D-0000F87546FD}")
public interface VarRadEdgeFillet extends EdgeFillet {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "EdgesToFillet"
   * </p>
   * @return  Returns a value of type References
   */

  @DISPID(1611202560) //= 0x60090000. The runtime will prefer the VTID if present
  @VTID(31)
  References edgesToFillet();


  /**
   * <p>
   * Getter method for the COM property "FilletVariation"
   * </p>
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.CatFilletVariation
   */

  @DISPID(1611202561) //= 0x60090001. The runtime will prefer the VTID if present
  @VTID(32)
  CatFilletVariation filletVariation();


  /**
   * <p>
   * Setter method for the COM property "FilletVariation"
   * </p>
   * @param oVariation Mandatory CatiaV5TypeLibs.PartItfTypeLib.CatFilletVariation parameter.
   */

  @DISPID(1611202561) //= 0x60090001. The runtime will prefer the VTID if present
  @VTID(33)
  void filletVariation(
    CatFilletVariation oVariation);


  /**
   * <p>
   * Getter method for the COM property "ImposedVertices"
   * </p>
   * @return  Returns a value of type References
   */

  @DISPID(1611202563) //= 0x60090003. The runtime will prefer the VTID if present
  @VTID(34)
  References imposedVertices();


  /**
   * <p>
   * Getter method for the COM property "FilletSpine"
   * </p>
   * @return  Returns a value of type Reference
   */

  @DISPID(1611202564) //= 0x60090004. The runtime will prefer the VTID if present
  @VTID(35)
  Reference filletSpine();


  /**
   * <p>
   * Setter method for the COM property "FilletSpine"
   * </p>
   * @param oSpine Mandatory Reference parameter.
   */

  @DISPID(1611202564) //= 0x60090004. The runtime will prefer the VTID if present
  @VTID(36)
  void filletSpine(
    Reference oSpine);


  /**
   * <p>
   * Getter method for the COM property "BitangencyType"
   * </p>
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.CatFilletBitangencyType
   */

  @DISPID(1611202566) //= 0x60090006. The runtime will prefer the VTID if present
  @VTID(37)
  CatFilletBitangencyType bitangencyType();


  /**
   * <p>
   * Setter method for the COM property "BitangencyType"
   * </p>
   * @param oType Mandatory CatiaV5TypeLibs.PartItfTypeLib.CatFilletBitangencyType parameter.
   */

  @DISPID(1611202566) //= 0x60090006. The runtime will prefer the VTID if present
  @VTID(38)
  void bitangencyType(
    CatFilletBitangencyType oType);


  /**
   * @param iImposedVertex Mandatory Reference parameter.
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.Length
   */

  @DISPID(1611202568) //= 0x60090008. The runtime will prefer the VTID if present
  @VTID(39)
  Length imposedVertexRadius(
    Reference iImposedVertex);


  /**
   * @param iEdge Mandatory Reference parameter.
   * @param iRadius Mandatory double parameter.
   */

  @DISPID(1611202569) //= 0x60090009. The runtime will prefer the VTID if present
  @VTID(40)
  void addEdgeToFillet(
    Reference iEdge,
    double iRadius);


  /**
   * @param iEdge Mandatory Reference parameter.
   */

  @DISPID(1611202570) //= 0x6009000a. The runtime will prefer the VTID if present
  @VTID(41)
  void withdrawEdgeToFillet(
    Reference iEdge);


  /**
   * @param iVertex Mandatory Reference parameter.
   * @param iRadius Mandatory double parameter.
   */

  @DISPID(1611202571) //= 0x6009000b. The runtime will prefer the VTID if present
  @VTID(42)
  void addImposedVertex(
    Reference iVertex,
    double iRadius);


  /**
   * @param iVertex Mandatory Reference parameter.
   */

  @DISPID(1611202572) //= 0x6009000c. The runtime will prefer the VTID if present
  @VTID(43)
  void withdrawImposedVertex(
    Reference iVertex);


  // Properties:
}
