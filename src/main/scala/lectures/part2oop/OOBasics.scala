package lectures.part2oop

object OOBasics extends App {
  val person = new Person("john",34)
  println(person.age) //lectures.part2oop.Person@371a67ec
  person.greet("daniel")
  person.greet()
  val author = new Writer("Charles","Dickens",1812)
  val imposter = new Writer("Charles","Dickens",1812)
  val novel = new Novel("Great Expectations",1861,author)
  println(novel.authorAge)
  println(novel.isWrittenBy(author))

}

class Writer(firstName: String , surname : String , val year:Int){
  def fullName :String = firstName + " " + surname
}

class Novel(name:String,year:Int,author :Writer){
  def authorAge : Int = year - author.year
  def isWrittenBy(author:Writer) = author == this.author
  def copy(newYear: Int): Novel = new Novel(name,newYear,author)

}
//constructor
class Person(name : String , val age : Int) {
  //body
  val x =2 // field
  println(1+3)//side effect

  //method
  def greet(name:String): Unit = println(s"$name  ${this.name}") //${this.name} -> kill ambiguity

  //overloading -> applying the methods with the same name but different signatures
  def greet(): Unit = println(s"$name overload") //${this.name} -> kill ambiguity

  //multiple constructor
  def this(name:String) = this(name,0)
  def this() = this("john doe")

}
class Counter(val count :Int){
  def inc = {
    println("increment")
    new Counter(count + 1)
  } //immutability

  def dec = {
    println("decrement")
    new Counter(count - 1)
  }
  def inc(n : Int) : Counter = {
    if(n <= 0 ) this
    else inc.inc(n-1)
  }
  /*
  def dec(n: Int): Counter = {
    if (n <= 0) this
    else dec.dec(n - 1)

    def print = println(count)
  }*/
  /*
  This basically says that instances are fixed.

  They cannot be modified inside.

  Whenever you need to modify the contents of an instance, you actually need to return a new instance.
  */
}
// person.age   -> class parameters are NOT FIELDS
// class Person(name : String , val age : Int)  -> accept person.age
// class parameters - class fields different
/*
A constructor says basically that every single instance
of person must be constructed by passing in
a name and an age, and the compiler is so eager to
tell us that and says unspecified value parameters

the short story is that a class organizes data and
behavior that is code and instantiation means
concrete realizations and memory.*/