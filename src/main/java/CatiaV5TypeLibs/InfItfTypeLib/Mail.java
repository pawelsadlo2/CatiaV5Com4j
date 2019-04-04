package CatiaV5TypeLibs.InfItfTypeLib;

import com4j.*;

@IID("{FEBDAAAE-2946-11D3-B051-006094EB7CE3}")
public interface Mail extends AnyObject {
  // Methods:
  /**
   * @param iRecipientType Mandatory CatRecipientType parameter.
   * @return  Returns a value of type Recipients
   */

  @DISPID(1610940416) //= 0x60050000. The runtime will prefer the VTID if present
  @VTID(22)
  Recipients getRecipients(
    CatRecipientType iRecipientType);


  /**
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610940417) //= 0x60050001. The runtime will prefer the VTID if present
  @VTID(23)
  java.lang.String getOriginator();


  /**
   * @param iOriginator Mandatory Holder<java.lang.String> parameter.
   */

  @DISPID(1610940418) //= 0x60050002. The runtime will prefer the VTID if present
  @VTID(24)
  void setOriginator(
    Holder<java.lang.String> iOriginator);


  /**
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610940419) //= 0x60050003. The runtime will prefer the VTID if present
  @VTID(25)
  java.lang.String getSubject();


  /**
   * @param iSubject Mandatory Holder<java.lang.String> parameter.
   */

  @DISPID(1610940420) //= 0x60050004. The runtime will prefer the VTID if present
  @VTID(26)
  void setSubject(
    Holder<java.lang.String> iSubject);


  /**
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610940421) //= 0x60050005. The runtime will prefer the VTID if present
  @VTID(27)
  java.lang.String getContent();


  /**
   * @param iContent Mandatory Holder<java.lang.String> parameter.
   */

  @DISPID(1610940422) //= 0x60050006. The runtime will prefer the VTID if present
  @VTID(28)
  void setContent(
    Holder<java.lang.String> iContent);


  /**
   * @return  Returns a value of type Attachments
   */

  @DISPID(1610940423) //= 0x60050007. The runtime will prefer the VTID if present
  @VTID(29)
  Attachments getAttachments();


  /**
   * @param iUIPolicy Mandatory CatMailUIPolicy parameter.
   */

  @DISPID(1610940424) //= 0x60050008. The runtime will prefer the VTID if present
  @VTID(30)
  void send(
    CatMailUIPolicy iUIPolicy);


  // Properties:
}
