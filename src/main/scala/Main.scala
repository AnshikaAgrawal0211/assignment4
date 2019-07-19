object Main extends App {
  val l: List[Int] = List(1, 5, 9, 8, 77)
  val position=2
  val value = l.length - position

  val calculate = new Sum
  println(calculate.findSum(l))

  val search = new FindElement
  println(search.find(l, 3))

  val reversal = new Reverse
  println(reversal.newList(l))


  val insertion=new Insert
  println(insertion.insert(l,value,45))

  val result=new LastElement
  println(result.find(l))
}
