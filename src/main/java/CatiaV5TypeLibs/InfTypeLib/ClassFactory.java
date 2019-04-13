package CatiaV5TypeLibs.InfTypeLib;

import com4j.*;

/**
 * Defines methods to create COM objects
 */
public abstract class ClassFactory {
  private ClassFactory() {} // instanciation is not allowed


  public static IFontDisp createStdFont() {
    return COM4J.createInstance( IFontDisp.class, "{0BE35203-8F91-11CE-9DE3-00AA004BB851}" );
  }

  public static IPictureDisp createStdPicture() {
    return COM4J.createInstance( IPictureDisp.class, "{0BE35204-8F91-11CE-9DE3-00AA004BB851}" );
  }
}
