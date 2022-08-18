// Databricks notebook source
import scala.io.Source

import scala.util.parsing.json._

// COMMAND ----------

val source_url_health_january: String = "https://hadoop-and-big-data.s3-us-west-2.amazonaws.com/fitness-tracker/health_tracker_data_2020_1.json"

val source_url_health_February: String = "https://hadoop-and-big-data.s3-us-west-2.amazonaws.com/fitness-tracker/health_tracker_data_2020_2.json"

val source_url_health_February_late:String = "https://hadoop-and-big-data.s3-us-west-2.amazonaws.com/fitness-tracker/health_tracker_data_2020_2_late.json"

val source_url_health_march: String = "https://hadoop-and-big-data.s3-us-west-2.amazonaws.com/fitness-tracker/health_tracker_data_2020_3.json"

 val source_url_health_april: String = "https://hadoop-and-big-data.s3-us-west-2.amazonaws.com/fitness-tracker/health_tracker_data_2020_4.json"

val source_url_health_may: String = "https://hadoop-and-big-data.s3-us-west-2.amazonaws.com/fitness-tracker/health_tracker_data_2020_5.json"


// COMMAND ----------

val health_tracker_data_2020_1 = Source.fromURL(source_url_health_january)
for (line <- health_tracker_data_2020_1.getLines) {
    println(line)
}
health_tracker_data_2020_1.close

// COMMAND ----------

val health_tracker_data_2020_2 = Source.fromURL(source_url_health_march)
for (line <- health_tracker_data_2020_2.getLines ){
  println(line)
}
health_tracker_data_2020_2.close

// COMMAND ----------

val health_tracker_data_2020_2_late = Source.fromURL(source_url_health_February_late)

for (line <- health_tracker_data_2020_2_late.getLines){
  println(line)
}
health_tracker_data_2020_2_late.close

// COMMAND ----------

val health_tracker_data_2020_3 = Source.fromURL(source_url_health_march)

for (line <-health_tracker_data_2020_3.getLines){
  println(line)
}
health_tracker_data_2020_3.close

// COMMAND ----------

val health_tracker_data_2020_4 = Source.fromURL(source_url_health_april)
for (line<- health_tracker_data_2020_4.getLines){
  println(line)
}
health_tracker_data_2020_4.close

// COMMAND ----------

val health_tracker_data_2020_5 = Source.fromURL(source_url_health_may)

for (line <- health_tracker_data_2020_5.getLines){
  val health_tracker_data_2020_5_json = line.concat(",")
  println(health_tracker_data_2020_5_json)
}
health_tracker_data_2020_5.close()

// COMMAND ----------

val json = ujson.read(Http(source_url_health_january).asString.body)
// val tuples = json("run_sessions").arr /* <-- run_sessions is an array */ .map { item => 
//     (item("id"), item("start_time"), item("end_time"), item("duration")) 
// }

// COMMAND ----------

val data = spark.read.json(health_tracker_data_2020_5)

// COMMAND ----------



// COMMAND ----------



// COMMAND ----------


