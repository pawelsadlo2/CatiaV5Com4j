import com.sun.java.accessibility.internal.AccessBridge
import com.sun.jna._
import com.sun.jna.ptr._
import javax.accessibility.AccessibleContext


//trait CLibrary extends Library {
//  def instance = Native.load(if (Platform.isWindows) "msvcrt"
//  else "c", classOf[this.type])
//
//  def printf(format: String, args: Any*): Unit
//}

trait Kernel32 extends Library {
  def GetDiskFreeSpaceA(lpRootPathName: String,
                        lpSectorsPerCluster: IntByReference, lpBytesPerSector: IntByReference,
                        lpNumberOfFreeClusters: IntByReference, lpTotalNumberOfClusters: IntByReference): Boolean

  def GetComputerNameW(outName: Array[Char], size: IntByReference): Boolean

  def GetTempPathA(size: Integer, outName: Array[Byte]): Integer
}

trait oleacc extends Library {

//  def AccessibleObjectFromWindow(hwnd: Pointer, dwID: , riid, ppvObject:)
}


object TestJNA {

    val x = new AccessBridge()


    val oleAcc = Native.load("oleacc", classOf[oleacc])

    val lib = Native.load("kernel32", classOf[Kernel32]) //.asInstanceOf[Kernel32]
    val disk = "C:\\"
    val spc = new IntByReference(0) // Sectors per cluster
    val bps = new IntByReference(0) // Bytes per sector
    val fc = new IntByReference(0) // Free clusters
    val tc = new IntByReference(0) // Total clusters
    val ok = lib.GetDiskFreeSpaceA(disk, spc, bps, fc, tc) // status

    println(
      f"""'$disk%s' ($ok%s): sectors/cluster: ${spc.getValue}%d,
          	bytes/sector: ${bps.getValue}%d, free-clusters: ${fc.getValue}%d,
          	total/clusters: ${tc.getValue}%d""")
    //
    val name = new Array[Char](256)
    val size = new IntByReference(256)
    val ret = lib.GetComputerNameW(name, size)
    println("computer name: " + name.mkString + " ret: " + ret)

    {
      val name = new Array[Byte](256)
      lib.GetTempPathA(256, name)
      val s = name.map(_.toChar)
      println("temp path: " + s.mkString)
    }


}

