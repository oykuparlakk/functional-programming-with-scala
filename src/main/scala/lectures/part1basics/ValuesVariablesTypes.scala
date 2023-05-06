package lectures.part1basics

object ValuesVariablesTypes extends App {
  val x : Int = 42
  println(x)

  // VALS ARE IMMUTABLE - SIMILIAR CONST VARIABLE
  // TYPES OR VOWELS ARE OPTIONAL -> COMPILER CAN INFER TYPES

  val aString: String = "hello"
  val anotherString = "hello"

  println(s"aString: $aString, anotherString: $anotherString")

  val aBoolean: Boolean = true
  val aChar = 'a'

  val anInt: Int = x

  var a :Int = 42
  a = 1
  a += 1
}
