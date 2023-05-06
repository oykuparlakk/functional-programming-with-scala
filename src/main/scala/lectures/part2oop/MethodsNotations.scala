package lectures.part2oop

object MethodNotations extends App{
  class Person(val name:String ,favoriteMovie : String) {
    def likes(movie : String ):Boolean = movie == favoriteMovie
    def +(person : Person) : String = s"${this.name} is hanging out with ${person.name}"
  }

  val mary = new Person("Mary" , "Inception")
  println(mary.likes("Inception"))
  println(mary likes "Inception") //equivalent
  //infix notation = operator notation(syntactic sugar)

  //operators in Scala
  val tom = new Person("Tom","Fight Club")
  println(mary + tom)
  println(mary.+(tom))
  println(1.+(2))
  println(1 +2)

  //All operators are methods

  //prefix notations
  val x = -1
  val y = 1.unary_-
}
