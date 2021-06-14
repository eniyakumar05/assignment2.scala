package assignment2

object questionlist4 {
  def main(args: Array[String]) {
    def f(arr:List[Int]):List[Int] = arr.map((x: Int) => if(x < 0) -x else x)
    var a = f(arr= List(2,-4,3,-1,23,-4,-54))
    println(a)
  }
}


