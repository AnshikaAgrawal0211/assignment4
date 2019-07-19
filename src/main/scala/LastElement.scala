class LastElement {
  def find(list: List[Int], count: Int = 0): Any = {
    list match {
      case _ if (list.length == 1) => list.head + "=" + count
      case _ => find(list.tail, count + 1)
    }
  }
}
