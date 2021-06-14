package assignment2

object questionarray3 {
  def main(args: Array[String]): Unit = {
  def diff_between_two_elemnts(nums: Array[Int]): Int = {
    var diff_two_elemnts = Integer.MIN_VALUE;
    for (i <- 0 to nums.length - 1;j <- i + 1 to nums.length - 1) {
        diff_two_elemnts = Integer.max(diff_two_elemnts, nums(j) - nums(i));
    }
    return diff_two_elemnts;
  }
    println(diff_between_two_elemnts(nums = Array(2, 3, 1, 7, 9, 5,11,3,5)))
  }

}