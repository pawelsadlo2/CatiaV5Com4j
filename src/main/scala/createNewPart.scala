import java.awt.event.KeyEvent

import com4jExtensions.helpers._
import com4jExtensions.implicitExtensions.generalExtensions.argumentsImplicits._

//import scala.swing.event.ButtonClicked
//import scala.swing._

object createNewPart extends /*SimpleSwingApplication*/ {
  val catia = getOrCreateCatia

  def add = catia.documents().add("Part")

  import java.awt.KeyEventDispatcher
  import java.awt.KeyboardFocusManager

  import java.awt.KeyEventDispatcher
  import java.awt.KeyboardFocusManager

  import java.awt.KeyEventDispatcher
  import java.awt.KeyboardFocusManager


  val dispatcher = new KeyEventDispatcher {
    override def dispatchKeyEvent(e: KeyEvent): Boolean = {
      System.out.println("Got key event!")
      false
    }
  }

    import java.awt.KeyEventDispatcher
    import java.awt.KeyboardFocusManager

    KeyboardFocusManager.getCurrentKeyboardFocusManager.addKeyEventDispatcher(dispatcher)


//    def top: Frame = new MainFrame {
//      title = "My Frame"
//      contents = new GridPanel(2, 2) {
//        hGap = 3
//        vGap = 3
//        contents += new Button {
//          text = "Press Me!"
//          reactions += {
//            case ButtonClicked(_) => add
//          }
//        }
//      }
//      size = new Dimension(300, 80)
//    }

  }
