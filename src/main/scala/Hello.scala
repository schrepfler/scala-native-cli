import caseapp._

case class ExampleOptions(
  name: String
)

object Hello extends CaseApp[ExampleOptions] {

  def run(options: ExampleOptions, arg: RemainingArgs): Unit = {
    println(s"Hello, ${options.name}!")
  }

}
