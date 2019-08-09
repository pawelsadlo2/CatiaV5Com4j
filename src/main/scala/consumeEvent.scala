import org.jnativehook.GlobalScreen
import org.jnativehook.NativeHookException
import org.jnativehook.NativeInputEvent
import org.jnativehook.keyboard.NativeKeyEvent
import org.jnativehook.keyboard.NativeKeyListener
import java.lang.reflect.Field
import java.util
import java.util.concurrent.AbstractExecutorService
import java.util.concurrent.TimeUnit
import java.util.logging.Level
import java.util.logging.Logger
import monix.execution.Scheduler.Implicits.global
import monix.reactive.Observable
import ShortcutDetector._

object ConsumeEvent {
  @throws[NativeHookException]
  def main(args: Array[String]): Unit = {
    new ConsumeEvent
  }
}



class ConsumeEvent @throws[NativeHookException]
  extends NativeKeyListener { // Create custom logger and level.
  val logger: Logger = Logger.getLogger(classOf[GlobalScreen].getPackage.getName)
  //Logger.getLogger()
  logger.setLevel(Level.WARNING)
  GlobalScreen.setEventDispatcher(new VoidDispatchService)
  GlobalScreen.registerNativeHook()
  GlobalScreen.addNativeKeyListener(this)

  private class VoidDispatchService() extends AbstractExecutorService {
    running = true
    private var running = false

    override def shutdown(): Unit = {
      running = false
    }

    override def shutdownNow: util.List[Runnable] = {
      running = false
      new util.ArrayList[Runnable](0)
    }

    override def isShutdown: Boolean = !running

    override def isTerminated: Boolean = !running

    @throws[InterruptedException]
    override def awaitTermination(timeout: Long, unit: TimeUnit) = true

    override def execute(r: Runnable): Unit = {
      r.run()
    }
  }

  override def nativeKeyPressed(e: NativeKeyEvent): Unit = {
    Observable(e.getKeyCode).subscribe(observer)
    if (e.getKeyCode == NativeKeyEvent.VC_B) {
      System.out.print("Attempting to consume B event...\t")
      try {
        val f = classOf[NativeInputEvent].getDeclaredField("reserved")
        f.setAccessible(true)
        f.setShort(e, 0x01.toShort)
        System.out.print("[ OK ]\n")
      } catch {
        case ex: Exception =>
          System.out.print("[ !! ]\n")
          ex.printStackTrace()
      }
    }
  }

  override def nativeKeyReleased(e: NativeKeyEvent): Unit = {
    if (e.getKeyCode == NativeKeyEvent.VC_B) {
      System.out.print("Attempting to consume B event...\t")
      try {
        val f = classOf[NativeInputEvent].getDeclaredField("reserved")
        f.setAccessible(true)
        f.setShort(e, 0x01.toShort)
        System.out.print("[ OK ]\n")
      } catch {
        case ex: Exception =>
          System.out.print("[ !! ]\n")
          ex.printStackTrace()
      }
    }
  }

  override def nativeKeyTyped(e: NativeKeyEvent): Unit = {
    /* Unimplemented */
  }
}