package assignment2

object questionlist1 {
  def main(args: Array[String]) {
    def f(num:Int,arr:List[Int]):List[Int] = arr.flatMap(List.fill(num)(_))
    var a = f(num = 3,arr=List(1,2,3,4))
    println(a)
  }
}


