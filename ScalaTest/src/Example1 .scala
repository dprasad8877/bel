import scala.concurrent.{Future}
import scala.concurrent.ExecutionContext.Implicits.global
import scala.util.{Failure, Success}
import scala.util.Random

object Example1 extends App {
    println("starting calculation ...")
    val f = Future {
        Thread.sleep(Random.nextInt(500))
        42
    }
    println("before onComplete")
    f.onComplete {
        case Success(value) => println(s"Got the callback, meaning = $value")
        case Failure(e) => e.printStackTrace
    }
    // do the rest of your work
    println("A ..."); Thread.sleep(1000)
    println("B ..."); Thread.sleep(1000)
    println("C ..."); Thread.sleep(1000)
    println("D ..."); Thread.sleep(1000)
    println("E ..."); Thread.sleep(1000)
    println("F ..."); Thread.sleep(1000)
    Thread.sleep(2000)
}