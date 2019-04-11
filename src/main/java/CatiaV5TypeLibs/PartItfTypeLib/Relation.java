package CatiaV5TypeLibs.PartItfTypeLib;

import com4j.DISPID;
import com4j.Holder;
import com4j.IID;
import com4j.VTID;
import CatiaV5TypeLibs.InfItfTypeLib.*;

@IID("{0DBE5A92-5466-11D1-A272-0000F87546FD}")
public interface Relation extends KnowledgeActivateObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Value"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1611071488) //= 0x60070000. The runtime will prefer the VTID if present
  @VTID(29)
  java.lang.String value();


  /**
   * <p>
   * Getter method for the COM property "Comment"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1611071489) //= 0x60070001. The runtime will prefer the VTID if present
  @VTID(30)
  java.lang.String comment();


  /**
   * <p>
   * Setter method for the COM property "Comment"
   * </p>
   * @param oComment Mandatory Holder<java.lang.String> parameter.
   */

  @DISPID(1611071489) //= 0x60070001. The runtime will prefer the VTID if present
  @VTID(31)
  void comment(
    Holder<java.lang.String> oComment);


  /**
   * @param iName Mandatory Holder<java.lang.String> parameter.
   */

  @DISPID(1611071491) //= 0x60070003. The runtime will prefer the VTID if present
  @VTID(32)
  void rename(
    Holder<java.lang.String> iName);


  /**
   * @param iValue Mandatory Holder<java.lang.String> parameter.
   */

  @DISPID(1611071492) //= 0x60070004. The runtime will prefer the VTID if present
  @VTID(33)
  void modify(
    Holder<java.lang.String> iValue);


  /**
   * <p>
   * Getter method for the COM property "NbInParameters"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611071493) //= 0x60070005. The runtime will prefer the VTID if present
  @VTID(34)
  int nbInParameters();


  /**
   * <p>
   * Getter method for the COM property "NbOutParameters"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1611071494) //= 0x60070006. The runtime will prefer the VTID if present
  @VTID(35)
  int nbOutParameters();


  /**
   * @param iIndex Mandatory int parameter.
   * @return  Returns a value of type AnyObject
   */

  @DISPID(1611071495) //= 0x60070007. The runtime will prefer the VTID if present
  @VTID(36)
  AnyObject getInParameter(
    int iIndex);


  /**
   * @param iIndex Mandatory int parameter.
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.Parameter
   */

  @DISPID(1611071496) //= 0x60070008. The runtime will prefer the VTID if present
  @VTID(37)
  Parameter getOutParameter(
    int iIndex);


  /**
   * <p>
   * Getter method for the COM property "Context"
   * </p>
   * @return  Returns a value of type AnyObject
   */

  @DISPID(1611071497) //= 0x60070009. The runtime will prefer the VTID if present
  @VTID(38)
  AnyObject context();


  // Properties:
}
