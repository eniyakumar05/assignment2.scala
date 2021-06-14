package assignment2

object questionlist2 {
  def main(args: Array[String]) {
    def f(arr:List[Int]):List[Int] = (arr.indices.collect { case i if i % 2 == 1 => arr(i) }).toList
    var a = f(arr = List(2,5,3,4,6,7,8,9))
    println(a)
  }
}



