package com.pptb.spark


class SparkEnv{
  val cache:Cache,
  val serializer:Serializer,
  val closureSerializer:Serializer,
  val cacheTracker:CacheTracker,
  val mapOutputTracker:MapOutputTracker,
  val shuffleFetcher:ShuffleFetcher,
  val shuffleManager:ShuffleManager
}

object SparkEnv {

}
