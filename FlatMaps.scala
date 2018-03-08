package week2

object FlatMaps {

  def main(args: Array[String]): Unit = {

    val  donuts1: Seq[String] = Seq("Plain Donut", "Strawberry Donut", "Glazed Donut")
    println(s"Elements of donuts1 = $donuts1")

   val ElementsOfdonuts1 = List("Plain Donut", "Strawberry Donut", "Glazed Donut")

    val donuts2: Seq[String] = Seq("Vanilla Donut", "Glazed Donut")
    println(s"Elements of donuts2 = $donuts2")

    val ElementsOfdonuts2 = List("Vanilla Donut", "Glazed Donut")

    println("\nStep 3: How to create a List of donuts initialized using the two Sequences from Step 1 and Step 2")
    val listDonuts: List[Seq[String]] = List(donuts1, donuts2)
    println(s"Elements of listDonuts = $listDonuts")


    //Return a list of donuts using flatmaps

    var ListDonutsFlatMaps:List[String] = listDonuts.flatMap(Seq=>Seq)
    println("list of donuts using flatMaps "   +ListDonutsFlatMaps)


  }

}
