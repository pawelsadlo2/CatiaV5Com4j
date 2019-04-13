package CatiaV5TypeLibs.InfTypeLib;

import com4j.*;

@IID("{08C3A5DD-5EE3-45DA-A99E-0DAD92FF74F7}")
public interface SelectionSets extends AnyObject {
  // Methods:
  /**
   * @param oListOfSelectionSet Mandatory java.lang.Object[] parameter.
   */

  @DISPID(1610940416) //= 0x60050000. The runtime will prefer the VTID if present
  @VTID(22)
  void getListOfSelectionSet(
    java.lang.Object[] oListOfSelectionSet);


  /**
   * @param iSelSetName Mandatory Holder<java.lang.String> parameter.
   */

  @DISPID(1610940417) //= 0x60050001. The runtime will prefer the VTID if present
  @VTID(23)
  void createSelectionSet(
    Holder<java.lang.String> iSelSetName);


  /**
   * @param iSelSetName Mandatory Holder<java.lang.String> parameter.
   */

  @DISPID(1610940418) //= 0x60050002. The runtime will prefer the VTID if present
  @VTID(24)
  void deleteSelectionSet(
    Holder<java.lang.String> iSelSetName);


  /**
   * @param iSelSetName Mandatory Holder<java.lang.String> parameter.
   */

  @DISPID(1610940419) //= 0x60050003. The runtime will prefer the VTID if present
  @VTID(25)
  void addCSOIntoSelectionSet(
    Holder<java.lang.String> iSelSetName);


  /**
   * @param iSelSetName Mandatory Holder<java.lang.String> parameter.
   */

  @DISPID(1610940420) //= 0x60050004. The runtime will prefer the VTID if present
  @VTID(26)
  void putSelectionSetIntoCSO(
    Holder<java.lang.String> iSelSetName);


  /**
   * @param iOldSelSetName Mandatory Holder<java.lang.String> parameter.
   * @param iNewSelSetName Mandatory Holder<java.lang.String> parameter.
   */

  @DISPID(1610940421) //= 0x60050005. The runtime will prefer the VTID if present
  @VTID(27)
  void renameSelectionSet(
    Holder<java.lang.String> iOldSelSetName,
    Holder<java.lang.String> iNewSelSetName);


  // Properties:
}
