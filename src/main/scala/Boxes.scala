object Boxes {
  def boxes(color: Color): Image = {
    val box =
      Image.rectangle(40, 40).
        lineWidth(5.0).
        lineColor(color.spin(30.degrees)).
        fillColor(color)

    box beside box beside box beside box beside box
  }

  // Create boxes with different colors
  val gold_boxes = boxes(Color.paleGoldenrod)
  val blue_boxes = boxes(Color.lightSteelBlue)
  val pink_boxes = boxes(Color.mistyRose)
}
