import caseapp._

case class Options(
  name: String,
  enable: Boolean = false,
  option: Option[String]
)

object Hello extends CaseApp[Options] {

  //  needed as scala-native at the moment does not import properly the main from CaseApp
  override def main(args: Array[String]) = super.main(args)

  def run(options: Options, arg: RemainingArgs): Unit = {
    println(s"Hello, ${options.name}!")
    println(s"is enabled: ${options.enable}")
    println(s"option is ${options.option}")
  }

}
