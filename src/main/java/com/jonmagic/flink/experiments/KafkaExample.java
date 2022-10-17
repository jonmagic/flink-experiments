package com.jonmagic.flink.experiments;

import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
import org.apache.flink.table.api.bridge.java.StreamTableEnvironment;

public class KafkaExample {
    public static void main(String[] args) throws Exception {
        final StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();
        StreamTableEnvironment tEnv = StreamTableEnvironment.create(env);
        tEnv.executeSql(
                 "CREATE TABLE simple_test (" +
                 "  uid BIGINT," +
                 "  name STRING," +
                 "  category_type INT," +
                 "  content BINARY," +
                 "  price DOUBLE," +
                 "  value_map map<BIGINT, row<v1 BIGINT, v2 INT>>," +
                 "  value_arr array<row<v1 BIGINT, v2 INT>>," +
                 "  corpus_int INT," +
                 "  corpus_str STRING" +
                 ") WITH (" +
                 "  'connector' = 'kafka'," +
                 "  'topic' = 'user_behavior'," +
                 "  'properties.bootstrap.servers' = 'localhost:9092'," +
                 "  'properties.group.id' = 'testGroup'," +
                 "  'scan.startup.mode' = 'earliest-offset'," +
                 "  'format' = 'protobuf'," +
                 "  'protobuf.message-class-name' = 'com.jonmagic.flink.experiments.SimpleTest'," +
                 "  'protobuf.ignore-parse-errors' = 'true'" +
                 ")"
        );
        tEnv.executeSql("SELECT * FROM simple_test").print();
    }
}
