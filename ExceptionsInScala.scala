package week2

import java.io.{FileNotFoundException, FileReader}

import java.io.IOException


object ExceptionsInScala {

  def main(args: Array[String]) {
    try {
      val f = new FileReader("input.txt")
    } catch {
      case ex: FileNotFoundException => {
        println("Missing file exception")
      }

      case ex: IOException   => {
        println("IO Exception")
      }
    } finally {
      println("Exiting finally...")
    }
  }

}
