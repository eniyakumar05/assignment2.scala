package assignment2

object questionlist3 {
  def length[A](nums: List[A]): Int = {
    nums.length
  }

  def main(args: Array[String]): Unit = {
    val nums1 = List(2, 5, 1, 4, 3, 7, 8, 6, 0, 9)
    println(length(nums1))
  }
}