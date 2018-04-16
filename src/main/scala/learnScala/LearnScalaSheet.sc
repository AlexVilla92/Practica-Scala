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

  //faltten, plancha las listas
  val lista = List(List(1,2,3), List(4,5,6), List(7,8,9));
  lista.flatten;

  //multiplicar por 2 cada elemento y luego los plancho
  lista.map {( x: List[Int]) => x.map { n => n * 2}}.flatten;

  //lo mismo pero usando flatMap
  lista.flatMap {( x: List[Int]) => x.map { n => n * 2}}

  //armo una lista de lista, parecido a tuplas
  numeros.map { x => List(x, x * 2)}

  //con flatMap lo plancho
  numeros.flatMap { x => List(x, x * 2)}

  //con cadenas, plancho todos los caracteres, y elimino los repetidos
  frutas.flatMap { c => c.toUpperCase()}.distinct

  //conjuntos
  val conjunto = Set(1,2,3,4,5);
  conjunto.contains(3);
  conjunto.contains(23);
  val conjunto2 = conjunto + 6;
  conjunto2
  //intersection &, union |, diferencia con diff
}