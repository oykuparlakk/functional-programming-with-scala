package lectures.part1basics

object StringOps extends App {
  val str = "Hi, i am learning scala"
  println(str.charAt(2))
  println(str.substring(5,11))
  println(str.split(" ").toList)
  println(str.startsWith("Hi"))
  println(str.replace(" ","-"))
  println(str.toLowerCase())
  println(str.length())

  val aNumberString = "45"
  val aNumber = aNumberString.toInt


  //Scala specific - String Interpolations

  //S-interpolators
  val name = "david"
  val age = 23
  val greeting = s"ne geliyor $name $age"
  val anotherGreeting = s"ne geliyor $name ${age + 20}"

  println(greeting)
  println(anotherGreeting)

  //F-interpolators -> formated strings similar to printf
  val speed = 1.2f
  val myth = f"$name can eat $speed%2.2f burgers per minute"

  println(myth)

  // raw-interpolator
  print(raw"this is a \n newline")
  val escaped = "this is a \n newline"
  println(raw"$escaped")



}
