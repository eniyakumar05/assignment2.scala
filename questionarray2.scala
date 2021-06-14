package assignment2

object questionarray2 {
  def main(args: Array[String]): Unit = {
    def find_max_product(nums: Array[Int]): Unit = {

      var max_value = Integer.MIN_VALUE;
      var max_i = -1
      var max_j = -1;

      for (i <- 0 to nums.length - 1;j <- i + 1 to nums.length - 1) {
          if (max_value < nums(i) * nums(j)) {
            max_value = nums(i) * nums(j);
            max_i = i;
            max_j = j;
          }
      }

      println(nums(max_i) * nums(max_j))
    }

    find_max_product(nums = Array(2, 3, 5, 7, -7, 5,8, -5))
  }
}
