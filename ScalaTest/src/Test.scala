import scala.concurrent.Future
import scala.concurrent.ExecutionContext.global


object Test extends App{
  def main(args: Array[String]): Unit = {
    println("This is first")
    var x=Future{
      println("running the future")
    }
    println("This is Last")
  }
  
}