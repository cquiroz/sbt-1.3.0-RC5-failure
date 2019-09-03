import squants.motion._

object Sample {
  def main(args: Array[String]): Unit = {
    val p = Bars(1)
    println(p.toMillimetersOfMercury)
  }
  // (gwsReader.airPressure.map(_.toMillimetersOfMercury), KeywordName.PRESSURE),
}
