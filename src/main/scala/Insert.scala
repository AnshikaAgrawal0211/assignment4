class Insert {
  def insert(list: List[Int], position: Int, element: Int, lst:List[Int]=List()): Any = {

    list match {
      case _ if (position == 0) => list:::element::lst
      case _ => insert(list.init,position-1,element,list.last::lst)
    }
  }
}
