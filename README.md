# training-datalakehouse-health-tracker

## Table of Contents

- [Overview](#overview)
- [About data] (Aboutdata)
- [High-level design](#installation)
- [Challenge](#Challenge)
- [Reference](#Reference)

## Overview
The dataset provided for this use case contains heartbeat data collected from health devices of 5 individuals per hour over a 5-month period, specifically from January 2020 to May 2020.

Apply health tracker with Data Lakehouse:

1. Data Ingestion:
    - Extract: Extract the heartbeat data from health devices of 5 individuals per hour over a 5-month period (January 2020 to May 2020). This data can be obtained from sources in S3.
    - Transform: Perform any necessary transformations on the extracted data to standardize formats, clean inconsistencies, and enrich the data if needed. This step ensures that the data is ready for analysis and storage in the data lakehouse.
    - Load: Load the transformed heartbeat data into Azure Data Lake Storage.
2. Data Organization and Governance:
    - Define a data catalog or metadata repository to capture information about the heartbeat data, including its structure, schema, and relevant metadata. This helps in organizing and managing the data within the data lakehouse.
    - Implement data governance practices to ensure data quality, privacy, and security. This involves setting up data access controls, data encryption, and complying with regulatory requirements.
3. Data Processing and Analysis:
    - Utilize data processing frameworks like Apache Spark or Azure Databricks to perform data processing tasks on the heartbeat data. These frameworks provide powerful distributed computing capabilities to handle large volumes of data efficiently.
    - Apply data cleaning, filtering, and aggregation operations to prepare the heartbeat data for analysis. This step helps in identifying patterns, trends, and anomalies within the data.
4. Data Modeling and Schema-on-Read:
    - Adopt a schema-on-read approach to the heartbeat data, where the schema is applied during data analysis rather than upfront. This allows for flexibility in exploring and analyzing the data without rigid schema constraints.
    - Design a data model that represents the heartbeat data effectively. Identify relevant dimensions such as time, individual ID, and health metrics, and establish relationships between them.
5. Advanced Analytics:
    - Leverage the scalability and computational capabilities of platforms like Apache Spark or Azure Databricks to perform these advanced analytics tasks effectively.
6. Data Visualization and Reporting:
    - Utilize data visualization tools with Power BI and Databricks notebooks to create interactive dashboards and reports. Visualize the insights derived from the heartbeat data.



## About data:

The dataset for this use case contains **heartbeat data collected from health devices of 5 individuals** per hour over a period of 5 months - January 2020 to May 2020. Be mindful about the fact that 2020 was a leap year.

For each month there are two types of files:

1. File ending with month number. E.g.: health_tracker_data_2020_1.json
2. file ending with _late. This file contains records that arrived late. For instance some records for January month arrived in February. So these records will be present in 1_late.json and not in 2.json. This file may or may not be present for each month. E.g.: health_tracker_data_2020_1_late.json

File name format:

1. health_tracker_data_2020_<month>.json
2. health_trracker_data_2020_<month>_late.json

Here month value is:

1. 1 for January
2. 2 for February
3. 3 for March
4. 4 for April
5. 5 for May

Data location: [https://hadoop-and-big-data.s3-us-west-2.amazonaws.com/fitness-tracker/<file_name>.json](https://hadoop-and-big-data.s3-us-west-2.amazonaws.com/fitness-tracker/%3cfile_name%3e.json)

You can use databricks community edition to solve this challenge. Spin up a cluster in databricks workspace and open a notebook to get started.

## High-level design
![](high-level-design/event-hubs%20and-stream-processing-with-azure-databricks.drawio.png)

## Reference
https://www.databricks.com/blog/2020/01/30/what-is-a-data-lakehouse.html
https://learn.microsoft.com/en-us/azure/storage/blobs/data-lake-storage-introduction

