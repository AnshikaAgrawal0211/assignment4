class FindElement {
  def find(l: List[Int], k: Int): Any = {
    l match {
      case _ if (l.isEmpty) => println(s"empty list")
      case _ if (k == 0) => l.head
      case _ => find(l.tail, k - 1)
    }
  }
}
