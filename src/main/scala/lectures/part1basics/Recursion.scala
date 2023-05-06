package lectures.part1basics

object Recursion extends App{
  def factorial(n:Int):Int = {
    if(n<=1) 1
    else n * factorial(n-1)
  }


  def fibonacci(n:Int):Int = {
    def fiboTailrec(i:Int,last:Int,nextToLast:Int):Int =
      if(i>=n) last
      else fiboTailrec(i+1,last + nextToLast,last )


    if(n<=2) 1
    else fiboTailrec(3,1,1)
  }

  print(fibonacci(8))

}
