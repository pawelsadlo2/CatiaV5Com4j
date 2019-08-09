import java.util.concurrent.TimeUnit

import monix.eval.Task
import monix.execution.Ack
import monix.execution.Ack.Continue
import monix.reactive.{Consumer, Observable}
import org.jnativehook.keyboard.NativeKeyEvent._

import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer
import scala.concurrent.{Future, Promise}
import monix.reactive._
import monix.execution.Scheduler.Implicits.global

import scala.concurrent.duration.{Duration, FiniteDuration}

object ShortcutDetector {
  type Key = Int


  val observer = new Observer[Any] {
    def onNext(elem: Any): Future[Ack] = {
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

  val obs = Observable.fromIterable(List(1, 2, 3)).doOnNext(_ => Task(println("ss")))
  // obs: monix.reactive.Observable[Int] = IterableAsObservable@7b0e123d


  def x = Observable.fromIterable(1 to 3)
    .map(i => i + 2)
    .map(i => i * 3)

  //.subscribe(observer)


  def main(args: Array[String]): Unit = {
    val x = Observable.interval(FiniteDuration(10, TimeUnit.SECONDS))
      .take(10).map(x => Task(println(x))).foreach(_.runAsyncAndForget)


  } //.
  /*    .map(i => i + 2)
      .map(i => i * 3)
      .sum
      .firstL*/


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


