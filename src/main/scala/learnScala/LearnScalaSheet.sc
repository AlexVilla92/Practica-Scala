object Worksheet {
  2 +2
  3 + 3

  var k = 0;
  while (k < 10) {
    println("k vale: " + k);
    k = k + 1;
  }

  //collecciones
  val tuple = Array(true, 5);
  val frutas = Array("banana", "pera", "naranja", "kiwi", "cereza");
  frutas(0)
  frutas.length;
  frutas.isEmpty;
  frutas.indexOf("naranja");

  //map
  val numeros = List(4,8,16,20,32);
  //quiero obtener otro array con los dobles de cada valor
  //8,16,32,40,64
  numeros.map { x => x * 2}
  //el cuadrado
  numeros.map{ x => x * x}
  //frutas a mayuscula
  frutas.map{ unaFruta => unaFruta.toUpperCase}
  //lista con longitud de cada elemento
  frutas.map{ _.length}
  
}