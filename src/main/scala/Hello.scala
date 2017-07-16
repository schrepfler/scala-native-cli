import caseapp._

case class Options(
  name: String
)

object Hello extends CaseApp[Options] {

  //  needed as scala-native at the moment does not import properly the main from CaseApp
  override def main(args: Array[String]) = super.main(args)

  def run(options: Options, arg: RemainingArgs): Unit = {
    println(s"Hello, ${options.name}!")
  }

}
