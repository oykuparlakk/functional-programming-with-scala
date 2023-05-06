package lectures.part1basics

object Expressions extends App{
  val x = 1+2
  println(x) //Expressions are evaluated to a value n this case three

  var aVariable = 2
  aVariable += 3
  // + - * / & |  >> << >>> (right shift with zero extension)

  // IF EXPRESSION

  val aCondition = true
  val aContionedValue = if(aCondition) 5 else 3
  println(s"aContionedValue: $aContionedValue")





  //Everything in Scala is an Expression
  val aWeirdValue = (aVariable = 3) // Unıt === Void
  println(aWeirdValue)

  //side effects : println(), while , reassigning

  val aCodeBlock = {
    //codeblocks can have their own definition of values and variables
    val y = 2
    val z = y +1

    if(z>2) "hello" else "goodbye"

  }
}
