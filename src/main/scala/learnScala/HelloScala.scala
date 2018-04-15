package learnScala

object HelloScala {

  def concatenateString(str1: String, str2: String): Unit ={
    str1 + str2;
  }
  def restValues(value1: Int, value2: Int): Int = value1 - value2;
  def addValues(value1: Int, value2: Int) = value1 + value2;
  def divValues(value1: Int, value2: Int): Int = {
    val divisor = value1;
    val dividendo = value2;
    divisor / dividendo;
  }

  def main(args: Array[String]): Unit = {
    println("Hello Scala, im here");

    val word = "this is my word";
    println(word);

    var x = 34; //el var es para valores mutables
    x = 43; //no es recomendable hacer el var

    println("the add of 2 +3 is: " + addValues(2,3));
    println("the subtract of 8 - 7: " + restValues(8,7));
    println("the division of 40/10 is: " + divValues(40,10));
  }

}
