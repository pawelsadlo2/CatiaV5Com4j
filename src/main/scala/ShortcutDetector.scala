import monix.eval.Task
import monix.execution.Ack
import monix.execution.Ack.Continue
import monix.reactive.{Consumer, Observable}
import org.jnativehook.keyboard.NativeKeyEvent._

import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer
import scala.concurrent.{Future, Promise}
import monix.reactive._

object ShortcutDetector {
  type Key = Int

  val observer = new Observer[Key] {
    def onNext(elem: Key): Future[Ack] = {
      println(s"O-->$elem")
      // Continue already inherits from Future[Ack],
      // so we can return it directly ;-)
      Continue
    }

    def onError(ex: Throwable): Unit =
      ex.printStackTrace()

    def onComplete(): Unit =
      println("O completed")
  }

}

//
//
//  private var stack: ArrayBuffer[Key] = ArrayBuffer.empty
//
//  def clearStack(): Unit = stack.clear
//
//  def addKeyToStack(key: Key): Unit = stack :+ key
//
//  //def checkForShortcut
//
//  def shortcuts: Set[Seq[Key]] = Set(
//    Seq(VC_ALT, VC_R),
//    Seq(VC_CONTROL, VC_SHIFT, VC_A)
//  )
//
//  val pressed = Promise
//
//  //def addKey(key:)
//
//  //def detectShortcut(history: Arr): Unit = {
//

//}


