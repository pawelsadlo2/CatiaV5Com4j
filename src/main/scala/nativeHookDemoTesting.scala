import java.awt.event.WindowEvent

import javax.swing.text.BadLocationException
import org.jnativehook.NativeInputEvent
import org.jnativehook.example.NativeHookDemo
import com.sun.jna.platform.win32.{Guid, User32, WinDef, WinNT, WinUser}
import com.sun.jna.platform.win32.WinDef._
import com.sun.jna.Pointer

import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer
import com.sun.jna.Native
import com.sun.jna.Pointer
import com.sun.jna.platform.win32.COM.Unknown
import com.sun.jna.platform.win32.Guid.{GUID, REFIID}
import com.sun.jna.platform.win32.WinDef.DWORD
import com.sun.jna.platform.win32.WinNT.HRESULT
import com.sun.jna.ptr.LongByReference
import com.sun.jna.ptr.PointerByReference
import com.sun.jna.win32.StdCallLibrary
import com.sun.jna.win32.W32APIOptions
import com.sun.jna.ptr.PointerByReference
import com4j.{COM4J, Wrapper}

object Oleacc extends {
  self: Oleacc =>
  val INSTANCE: Oleacc = Native.load("oleacc", classOf[Oleacc], W32APIOptions.DEFAULT_OPTIONS)
}

trait Oleacc extends StdCallLibrary with WinUser with WinNT {
  def AccessibleObjectFromWindow(win: HWND, objID: Long, iid: Guid.IID, ptr: PointerByReference): WinNT.HRESULT

  //def AccessibleChildren(pAccPointer: Pointer, startFrom: Long, childCount: Long, tableRef: Nothing, returnCount: LongByReference): WinNT.HRESULT

  //def WindowFromAccessibleObject(pointer: Pointer, ptr: PointerByReference): Int

  // def GetRoleText(roleId: WinDef.DWORD, buff: Array[Char], i: Int): Int
}


object nativeHookDemoTesting {

  def main(args: Array[String]): Unit = {


    val User32Lib = User32.INSTANCE

    def getWindows = {
      val buffer: mutable.MutableList[HWND] = mutable.MutableList.empty

      def enumProc = new WinUser.WNDENUMPROC {
        def callback(hWnd: HWND, data: Pointer): Boolean = {
          buffer.+=:(hWnd)
          true
        }
      }

      User32Lib.EnumWindows(enumProc, null)

      buffer.toVector
    }

    def windows = getWindows

    def getWindowText(hWnd: HWND) = {
      val arr: Array[Char] = Array.ofDim(255)
      User32Lib.GetWindowText(hWnd, arr, 255)
      arr.mkString("")
    }
    //val arr: Array[Char] = Array.ofDim(255)
    //    User32Lib.GetWindowText(windows.head, arr, 255)

    def texts = windows.withFilter(getWindowText(_).contains("CATIA V5 : Administration")).map(hWnd => (hWnd, getWindowText(hWnd)))

    val IID_IAccessible: Guid.IID = new Guid.IID("{618736E0-3C3D-11CF-810C-00AA00389B71}")

    var ptr = new PointerByReference
    val accessible = Oleacc.INSTANCE.AccessibleObjectFromWindow(texts.head._1, 0, IID_IAccessible, ptr)

    def x = ptr.getValue

    import CatiaV5TypeLibs.InfTypeLib.Application
    val nn = new Unknown(x)
    var ptr1 = new PointerByReference

    def dispatch = new REFIID(new Guid.IID("{00020400-0000-0000-C000-000000000046}"))

    val nnn = nn.QueryInterface(dispatch, ptr1)


    COM4J.

    //nn.


    /*   val comObj = COM4J.wrap(classOf[Application],x)
        val yy =comObj.statusBar()*/

    //val catiaMatching = texts.filter(_.contains("CATIA"))
    //println(arr.mkString(""))

    val t = 1

  }


}








