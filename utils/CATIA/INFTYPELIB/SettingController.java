import com4j.*;

@IID("{12CE8949-0CA6-4564-8C5F-DAB2710E4D69}")
public interface SettingController extends AnyObject {
  // Methods:
  /**
   */

  @DISPID(1610940416) //= 0x60050000. The runtime will prefer the VTID if present
  @VTID(22)
  void commit();


  /**
   */

  @DISPID(1610940417) //= 0x60050001. The runtime will prefer the VTID if present
  @VTID(23)
  void rollback();


  /**
   */

  @DISPID(1610940418) //= 0x60050002. The runtime will prefer the VTID if present
  @VTID(24)
  void resetToAdminValues();


  /**
   * @param iAttList Mandatory java.lang.Object[] parameter.
   */

  @DISPID(1610940419) //= 0x60050003. The runtime will prefer the VTID if present
  @VTID(25)
  void resetToAdminValuesByName(
    java.lang.Object[] iAttList);


  /**
   */

  @DISPID(1610940420) //= 0x60050004. The runtime will prefer the VTID if present
  @VTID(26)
  void saveRepository();


  // Properties:
}
