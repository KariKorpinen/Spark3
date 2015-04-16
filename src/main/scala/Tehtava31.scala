import org.apache.spark.SparkContext
import org.apache.spark.SparkContext._
import org.apache.spark.SparkConf

object Tehtava31 {
   def main(args: Array[String]) {
      val argFile0 = args(0)
      val argFile1 = args(1) 
      val argFile2 = args(2)
      
     // val logFile = "../Tiedostot/Linkin.txt"
     // println("logFile: %s".format(logFile))
      val conf = new SparkConf().setAppName("Tehtava31")
      val sc = new SparkContext(conf)
     // val logData = sc.textFile(logFile, 2).cache()
     // val numAs = logData.filter(line => line.contains("a")).count()
     // val numBs = logData.filter(line => line.contains("b")).count()
     // println("Lines with a: %s, Lines with b: %s".format(numAs, numBs))
      
      println("Arg 0: %s".format(argFile0))
      println("Arg 1: %s".format(argFile1))
      println("Arg 2: %s".format(argFile2))
   }
}