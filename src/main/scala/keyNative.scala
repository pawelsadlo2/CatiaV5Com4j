//
//import scala.swing.{SimpleSwingApplication, _}
//import scala.swing.event.EditDone
//import scala.swing.event.WindowActivated
//import org.jnativehook.GlobalScreen
//import org.jnativehook.NativeHookException
//import org.jnativehook.keyboard.NativeKeyEvent
//import org.jnativehook.keyboard.NativeKeyListener
//import javax.swing.SwingUtilities
//import java.awt.Graphics
//
//import org.jnativehook.GlobalScreen
//import org.jnativehook.NativeHookException
//import org.jnativehook.NativeInputEvent
//import org.jnativehook.keyboard.NativeKeyEvent
//import org.jnativehook.keyboard.NativeKeyListener
//import java.lang.reflect.Field
//import java.util
//import java.util.concurrent.AbstractExecutorService
//import java.util.concurrent.TimeUnit
//import java.util.logging.Level
//import java.util.logging.Logger
////import ShortcutDetector._
//
//import javax.swing.JPanel
//import java.awt.Color
//
//// (1) extend NativeKeyListener
//object MacKeystrokes
//  extends SimpleSwingApplication
//    with NativeKeyListener {
//
//  val charPanel = new CharPanel {
//    setPreferredSize(new Dimension(400, 300))
//  }
//
//  def top = new MainFrame {
//    title = "Mac Keystrokes"
//    peer.getContentPane.add(charPanel)
//    peer.setLocationRelativeTo(null)
//    peer.setBackground(Color.BLACK)
//  }
//
//  // (2) GlobalScreen.registerNativeHook
//  try {
//    GlobalScreen.registerNativeHook
//  } catch {
//    case e: NativeHookException =>
//      System.err.println("There was a problem registering the native hook.")
//      System.err.println(e.getMessage)
//      System.exit(1)
//  }
//
//
//  // (3) implement nativeKeyPressed, nativeKeyReleased, and nativeKeyTyped
//  def nativeKeyPressed(e: NativeKeyEvent) {
////    ShortcutDetector.clearStack
//    val key = NativeKeyEvent.getKeyText(e.getKeyCode)
//    println("Key Pressed: " + NativeKeyEvent.getKeyText(e.getKeyCode))
//    SwingUtilities.invokeLater(new Runnable {
//      def run {
//        charPanel.setChar(key.toCharArray)
//      }
//    })
//    if (e.getKeyCode == NativeKeyEvent.VC_ESCAPE) {
//      GlobalScreen.unregisterNativeHook
//    }
//  }
//
//  def nativeKeyReleased(e: NativeKeyEvent) {}
//
//  def nativeKeyTyped(e: NativeKeyEvent) {}
//
//  // (4) do this
//  GlobalScreen.addNativeKeyListener(this)
//
//}
//
//import scala.util.Random
//import java.awt.Font
//
//class CharPanel extends JPanel {
//
//  private val colors = Array(Color.BLUE, Color.CYAN, Color.DARK_GRAY,
//    Color.GREEN, Color.LIGHT_GRAY, Color.MAGENTA,
//    Color.ORANGE, Color.RED, Color.YELLOW)
//  private var chars = Array('a')
//  private val r = new Random
//  var i = 10
//
//  def setChar(charArray: Array[Char]) {
//    this.chars = charArray
//    i += 15
//    repaint()
//  }
//
//  override def paintComponent(g: Graphics) {
//    val font = new Font(Font.SANS_SERIF, Font.PLAIN, 60)
//    val color = colors(r.nextInt(colors.length))
//    g.setFont(font)
//    g.setColor(color)
//    g.clearRect(0, 0, 400, 300)
//    g.drawChars(chars, 0, 1, r.nextInt(320), r.nextInt(220) + 20)
//  }
//
//}
//
