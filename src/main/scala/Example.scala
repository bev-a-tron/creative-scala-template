import doodle.core._
import doodle.core.Image._
import doodle.syntax._
import doodle.jvm.Java2DFrame._
import doodle.backend.StandardInterpreter._

// To use this example, open the SBT console and type:
//
// Example.image.draw

object Example {

  val roof = Image.triangle(50, 30).lineWidth(0).fillColor(Color.brown)
  val wall = Image.rectangle(50, 20).lineWidth(0).fillColor(Color.red) above
    (Image.rectangle(20, 30).lineWidth(0).fillColor(Color.red) beside
      Image.rectangle(10, 30).lineWidth(0).fillColor(Color.black) beside
      Image.rectangle(20, 30).lineWidth(0).fillColor(Color.red))

  val house = roof above wall

  val tree = Image.circle(30).lineWidth(0).fillColor(Color.green) above
    Image.rectangle(10, 20).lineWidth(0).fillColor(Color.brown)

  val house_and_tree = house beside tree

  val halfstreet = (Image.rectangle(30, 2).lineWidth(0).fillColor(Color.yellow) beside
    Image.rectangle(10, 2).lineWidth(0).fillColor(Color.black)) above
    Image.rectangle(40,4).lineWidth(0).fillColor(Color.black)

  val street = halfstreet beside halfstreet beside halfstreet beside halfstreet
  val one_house = house_and_tree above street

  val three_houses = one_house beside one_house beside one_house

  three_houses.draw
}
