class Reverse {
  def newList(l: List[Int], list: List[Int] = List()): List[Int] = {
    list match {
      case _ if (l.isEmpty) => list
      case _ => newList(l.tail, l.head :: list)
    }
  }

}
