package condicionales

object Conditional {

  def valueOfK(value: Int): String = {if (value == 5) "el valor es 5" else "el valor no es 5"}

  def main(args: Array[String]): Unit = {
    val value = 5;

    if (value == 5) println("es 5"); //if else igual que siempre

    //operadro ternario
    println(if (value == 5) "el valor es 5" else "el valor no es 5");
    println(valueOfK(value));

    //match es como el switch
    val month = 6;

    println(month match {
      case 1 => "january";
      case 2 => "fabruary";
      case 3 => "march";
      case 4 => "april";
      case _ => "invalid value";
    })
  }

}
