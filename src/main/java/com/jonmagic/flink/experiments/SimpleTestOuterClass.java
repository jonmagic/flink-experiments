// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SimpleTest.proto

package com.jonmagic.flink.experiments;

public final class SimpleTestOuterClass {
  private SimpleTestOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_jonmagic_flink_experiments_SimpleTest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_jonmagic_flink_experiments_SimpleTest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_jonmagic_flink_experiments_SimpleTest_ValueMapEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_jonmagic_flink_experiments_SimpleTest_ValueMapEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_jonmagic_flink_experiments_SimpleTest_InnerMessageTest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_jonmagic_flink_experiments_SimpleTest_InnerMessageTest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\020SimpleTest.proto\022\036com.jonmagic.flink.e" +
      "xperiments\"\377\004\n\nSimpleTest\022\013\n\003uid\030\001 \001(\003\022\014" +
      "\n\004name\030\002 \001(\t\022\025\n\rcategory_type\030\003 \001(\005\022\017\n\007c" +
      "ontent\030\004 \001(\014\022\r\n\005price\030\005 \001(\001\022K\n\tvalue_map" +
      "\030\006 \003(\01328.com.jonmagic.flink.experiments." +
      "SimpleTest.ValueMapEntry\022N\n\tvalue_arr\030\007 " +
      "\003(\0132;.com.jonmagic.flink.experiments.Sim" +
      "pleTest.InnerMessageTest\022E\n\ncorpus_int\030\010" +
      " \001(\01621.com.jonmagic.flink.experiments.Si" +
      "mpleTest.Corpus\022E\n\ncorpus_str\030\t \001(\01621.co" +
      "m.jonmagic.flink.experiments.SimpleTest." +
      "Corpus\032l\n\rValueMapEntry\022\013\n\003key\030\001 \001(\003\022J\n\005" +
      "value\030\002 \001(\0132;.com.jonmagic.flink.experim" +
      "ents.SimpleTest.InnerMessageTest:\0028\001\032*\n\020" +
      "InnerMessageTest\022\n\n\002v1\030\001 \001(\003\022\n\n\002v2\030\002 \001(\005" +
      "\"Z\n\006Corpus\022\r\n\tUNIVERSAL\020\000\022\007\n\003WEB\020\001\022\n\n\006IM" +
      "AGES\020\002\022\t\n\005LOCAL\020\003\022\010\n\004NEWS\020\004\022\014\n\010PRODUCTS\020" +
      "\005\022\t\n\005VIDEO\020\007B\"\n\036com.jonmagic.flink.exper" +
      "imentsP\001"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_com_jonmagic_flink_experiments_SimpleTest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_jonmagic_flink_experiments_SimpleTest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_jonmagic_flink_experiments_SimpleTest_descriptor,
        new java.lang.String[] { "Uid", "Name", "CategoryType", "Content", "Price", "ValueMap", "ValueArr", "CorpusInt", "CorpusStr", });
    internal_static_com_jonmagic_flink_experiments_SimpleTest_ValueMapEntry_descriptor =
      internal_static_com_jonmagic_flink_experiments_SimpleTest_descriptor.getNestedTypes().get(0);
    internal_static_com_jonmagic_flink_experiments_SimpleTest_ValueMapEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_jonmagic_flink_experiments_SimpleTest_ValueMapEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_com_jonmagic_flink_experiments_SimpleTest_InnerMessageTest_descriptor =
      internal_static_com_jonmagic_flink_experiments_SimpleTest_descriptor.getNestedTypes().get(1);
    internal_static_com_jonmagic_flink_experiments_SimpleTest_InnerMessageTest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_jonmagic_flink_experiments_SimpleTest_InnerMessageTest_descriptor,
        new java.lang.String[] { "V1", "V2", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
