package com.pptb.spark

class SparkContext(
                    master: String,
                    frameworkName: String,
                    val sparkHome: String = null,
                    val jars: Seq[String] = Nil
                  ) extends Logging {
  //Ensure logging is initialized before we spawn any threads
  initLogging()

  // Set Spark master host and port system properties
  if (System.getProperty("spark.master.host") == null) {
    System.setProperty("spark.master.host", Utils.localIpAddress)
  }
  if (System.getProperty("spark.master.port") == null) {
    System.setProperty("spark.master.port", "7077")
  }

}
