package week2

import scala.collection.SortedSet

object ScalaSets {

  def main(args: Array[String]): Unit = {

    var games = Set("cricket", "football", "badminton")
    var emptySet = Set()
    val alphabets = Set("A","B","C","D")
    val mergeset = games ++ alphabets //merge two sets
    println(games)
    println(emptySet)

    println("head" +games.head)
    println("tail" +games.tail)
    println("is empty " +games.isEmpty)
    println("set() is empty" +emptySet.isEmpty)

    println("merged sets games and alphabets : "   +mergeset)
    println("using contains to check is cricket is in set games "  +games.contains("cricket"))

    // add and remove elements

    games+= "tennis"
    games-=  "badminton"

    // intersection and union

    val intersection = games.intersect(alphabets)
    println("intersetion usinfg the intersect method "   +intersection)

    println("intersection using &"   +(games & alphabets))

    val setUnion = games.union(alphabets)
    println(setUnion)


    //using the sorted set

    var numbers:SortedSet[Int] = SortedSet(7,23,2112,331,87,5334,10,11)
    println(numbers)

  }
}
