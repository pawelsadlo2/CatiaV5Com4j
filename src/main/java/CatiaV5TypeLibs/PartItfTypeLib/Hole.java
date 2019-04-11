package CatiaV5TypeLibs.PartItfTypeLib;

import com4j.DISPID;
import com4j.Holder;
import com4j.IID;
import com4j.VTID;
import CatiaV5TypeLibs.InfItfTypeLib.*;

@IID("{A6AE2C93-64F9-11D1-A27F-0000F87546FD}")
public interface Hole extends SketchBasedShape {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Type"
   * </p>
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.CatHoleType
   */

  @DISPID(1611071488) //= 0x60070000. The runtime will prefer the VTID if present
  @VTID(24)
  CatHoleType type();


  /**
   * <p>
   * Setter method for the COM property "Type"
   * </p>
   * @param oType Mandatory CatiaV5TypeLibs.PartItfTypeLib.CatHoleType parameter.
   */

  @DISPID(1611071488) //= 0x60070000. The runtime will prefer the VTID if present
  @VTID(25)
  void type(
    CatHoleType oType);


  /**
   * <p>
   * Getter method for the COM property "Diameter"
   * </p>
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.Length
   */

  @DISPID(1611071490) //= 0x60070002. The runtime will prefer the VTID if present
  @VTID(26)
  Length diameter();


  /**
   * <p>
   * Getter method for the COM property "HeadDiameter"
   * </p>
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.Length
   */

  @DISPID(1611071491) //= 0x60070003. The runtime will prefer the VTID if present
  @VTID(27)
  Length headDiameter();


  /**
   * <p>
   * Getter method for the COM property "HeadDepth"
   * </p>
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.Length
   */

  @DISPID(1611071492) //= 0x60070004. The runtime will prefer the VTID if present
  @VTID(28)
  Length headDepth();


  /**
   * <p>
   * Getter method for the COM property "HeadAngle"
   * </p>
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.Angle
   */

  @DISPID(1611071493) //= 0x60070005. The runtime will prefer the VTID if present
  @VTID(29)
  Angle headAngle();


  /**
   * <p>
   * Getter method for the COM property "AnchorMode"
   * </p>
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.CatHoleAnchorMode
   */

  @DISPID(1611071494) //= 0x60070006. The runtime will prefer the VTID if present
  @VTID(30)
  CatHoleAnchorMode anchorMode();


  /**
   * <p>
   * Setter method for the COM property "AnchorMode"
   * </p>
   * @param oMode Mandatory CatiaV5TypeLibs.PartItfTypeLib.CatHoleAnchorMode parameter.
   */

  @DISPID(1611071494) //= 0x60070006. The runtime will prefer the VTID if present
  @VTID(31)
  void anchorMode(
    CatHoleAnchorMode oMode);


  /**
   * <p>
   * Getter method for the COM property "BottomType"
   * </p>
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.CatHoleBottomType
   */

  @DISPID(1611071496) //= 0x60070008. The runtime will prefer the VTID if present
  @VTID(32)
  CatHoleBottomType bottomType();


  /**
   * <p>
   * Setter method for the COM property "BottomType"
   * </p>
   * @param oBottomType Mandatory CatiaV5TypeLibs.PartItfTypeLib.CatHoleBottomType parameter.
   */

  @DISPID(1611071496) //= 0x60070008. The runtime will prefer the VTID if present
  @VTID(33)
  void bottomType(
    CatHoleBottomType oBottomType);


  /**
   * <p>
   * Getter method for the COM property "BottomAngle"
   * </p>
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.Angle
   */

  @DISPID(1611071498) //= 0x6007000a. The runtime will prefer the VTID if present
  @VTID(34)
  Angle bottomAngle();


  /**
   * <p>
   * Getter method for the COM property "BottomLimit"
   * </p>
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.Limit
   */

  @DISPID(1611071499) //= 0x6007000b. The runtime will prefer the VTID if present
  @VTID(35)
  Limit bottomLimit();


  /**
   * <p>
   * Getter method for the COM property "ThreadingMode"
   * </p>
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.CatHoleThreadingMode
   */

  @DISPID(1611071500) //= 0x6007000c. The runtime will prefer the VTID if present
  @VTID(36)
  CatHoleThreadingMode threadingMode();


  /**
   * <p>
   * Setter method for the COM property "ThreadingMode"
   * </p>
   * @param oThreadingMode Mandatory CatiaV5TypeLibs.PartItfTypeLib.CatHoleThreadingMode parameter.
   */

  @DISPID(1611071500) //= 0x6007000c. The runtime will prefer the VTID if present
  @VTID(37)
  void threadingMode(
    CatHoleThreadingMode oThreadingMode);


  /**
   * <p>
   * Getter method for the COM property "ThreadSide"
   * </p>
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.CatHoleThreadSide
   */

  @DISPID(1611071502) //= 0x6007000e. The runtime will prefer the VTID if present
  @VTID(38)
  CatHoleThreadSide threadSide();


  /**
   * <p>
   * Setter method for the COM property "ThreadSide"
   * </p>
   * @param oThreadSide Mandatory CatiaV5TypeLibs.PartItfTypeLib.CatHoleThreadSide parameter.
   */

  @DISPID(1611071502) //= 0x6007000e. The runtime will prefer the VTID if present
  @VTID(39)
  void threadSide(
    CatHoleThreadSide oThreadSide);


  /**
   * <p>
   * Getter method for the COM property "ThreadDepth"
   * </p>
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.Length
   */

  @DISPID(1611071504) //= 0x60070010. The runtime will prefer the VTID if present
  @VTID(40)
  Length threadDepth();


  /**
   * <p>
   * Getter method for the COM property "ThreadDiameter"
   * </p>
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.Length
   */

  @DISPID(1611071505) //= 0x60070011. The runtime will prefer the VTID if present
  @VTID(41)
  Length threadDiameter();


  /**
   * <p>
   * Getter method for the COM property "ThreadPitch"
   * </p>
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.Length
   */

  @DISPID(1611071506) //= 0x60070012. The runtime will prefer the VTID if present
  @VTID(42)
  Length threadPitch();


  /**
   */

  @DISPID(1611071507) //= 0x60070013. The runtime will prefer the VTID if present
  @VTID(43)
  void reverse();


  /**
   * @param ioOrigin Mandatory java.lang.Object[] parameter.
   */

  @DISPID(1611071508) //= 0x60070014. The runtime will prefer the VTID if present
  @VTID(44)
  void getOrigin(
    java.lang.Object[] ioOrigin);


  /**
   * @param iX Mandatory double parameter.
   * @param iY Mandatory double parameter.
   * @param iZ Mandatory double parameter.
   */

  @DISPID(1611071509) //= 0x60070015. The runtime will prefer the VTID if present
  @VTID(45)
  void setOrigin(
    double iX,
    double iY,
    double iZ);


  /**
   * @param ioDirection Mandatory java.lang.Object[] parameter.
   */

  @DISPID(1611071510) //= 0x60070016. The runtime will prefer the VTID if present
  @VTID(46)
  void getDirection(
    java.lang.Object[] ioDirection);


  /**
   * @param iDirection Mandatory Reference parameter.
   */

  @DISPID(1611071511) //= 0x60070017. The runtime will prefer the VTID if present
  @VTID(47)
  void setDirection(
    Reference iDirection);


  /**
   * <p>
   * Getter method for the COM property "CounterSunkMode"
   * </p>
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.CatCSHoleMode
   */

  @DISPID(1611071512) //= 0x60070018. The runtime will prefer the VTID if present
  @VTID(48)
  CatCSHoleMode counterSunkMode();


  /**
   * <p>
   * Setter method for the COM property "CounterSunkMode"
   * </p>
   * @param oCSMode Mandatory CatiaV5TypeLibs.PartItfTypeLib.CatCSHoleMode parameter.
   */

  @DISPID(1611071512) //= 0x60070018. The runtime will prefer the VTID if present
  @VTID(49)
  void counterSunkMode(
    CatCSHoleMode oCSMode);


  /**
   * <p>
   * Getter method for the COM property "HoleThreadDescription"
   * </p>
   * @return  Returns a value of type CatiaV5TypeLibs.PartItfTypeLib.StrParam
   */

  @DISPID(1611071514) //= 0x6007001a. The runtime will prefer the VTID if present
  @VTID(50)
  StrParam holeThreadDescription();


  /**
   * @param iStandardType Mandatory CatiaV5TypeLibs.PartItfTypeLib.CatHoleThreadStandard parameter.
   */

  @DISPID(1611071515) //= 0x6007001b. The runtime will prefer the VTID if present
  @VTID(51)
  void createStandardThreadDesignTable(
    CatHoleThreadStandard iStandardType);


  /**
   * @param iStandardName Mandatory Holder<java.lang.String> parameter.
   * @param iPath Mandatory Holder<java.lang.String> parameter.
   */

  @DISPID(1611071516) //= 0x6007001c. The runtime will prefer the VTID if present
  @VTID(52)
  void createUserStandardDesignTable(
    Holder<java.lang.String> iStandardName,
    Holder<java.lang.String> iPath);


  // Properties:
}
