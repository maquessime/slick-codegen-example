object Tables extends {
  // or just use object demo.Tables, which is hard-wired to the driver stated during generation
  val profile = slick.driver.H2Driver
} with demo.Tables


import scala.concurrent.Await
import scala.concurrent.duration._
import scala.language.postfixOps

import Tables._
import Tables.profile.api._
import scala.concurrent.ExecutionContext.Implicits.global


object Example extends App {
    //
}
