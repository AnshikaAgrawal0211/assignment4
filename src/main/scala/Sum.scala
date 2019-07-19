class Sum {
  def findSum(list: List[Int], sum: Int = 0): Int = {
    list match {
      case _ if (list.isEmpty) => sum
      case _ => findSum(list.tail, sum + list.head)
    }
  }
}
