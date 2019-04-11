import java.io.{File, Writer}



object x {

  implicit class packageHelper(val f: File) extends Object {
def xx =1
  }

  implicit class SetPimper(val s: Set[Int]) extends AnyVal {
    def findOdd: Option[Int] = s.find(_ % 2 == 1)
  }

  case class UserSet(users: Set[Int])

 val x =  new UserSet(Set())
}

