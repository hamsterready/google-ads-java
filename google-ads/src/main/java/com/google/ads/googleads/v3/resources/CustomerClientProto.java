// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v3/resources/customer_client.proto

package com.google.ads.googleads.v3.resources;

public final class CustomerClientProto {
  private CustomerClientProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v3_resources_CustomerClient_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v3_resources_CustomerClient_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n7google/ads/googleads/v3/resources/cust" +
      "omer_client.proto\022!google.ads.googleads." +
      "v3.resources\032\031google/api/resource.proto\032" +
      "\036google/protobuf/wrappers.proto\032\034google/" +
      "api/annotations.proto\"\302\004\n\016CustomerClient" +
      "\022\025\n\rresource_name\030\001 \001(\t\0225\n\017client_custom" +
      "er\030\003 \001(\0132\034.google.protobuf.StringValue\022*" +
      "\n\006hidden\030\004 \001(\0132\032.google.protobuf.BoolVal" +
      "ue\022*\n\005level\030\005 \001(\0132\033.google.protobuf.Int6" +
      "4Value\022/\n\ttime_zone\030\006 \001(\0132\034.google.proto" +
      "buf.StringValue\0220\n\014test_account\030\007 \001(\0132\032." +
      "google.protobuf.BoolValue\022+\n\007manager\030\010 \001" +
      "(\0132\032.google.protobuf.BoolValue\0226\n\020descri" +
      "ptive_name\030\t \001(\0132\034.google.protobuf.Strin" +
      "gValue\0223\n\rcurrency_code\030\n \001(\0132\034.google.p" +
      "rotobuf.StringValue\022\'\n\002id\030\013 \001(\0132\033.google" +
      ".protobuf.Int64Value:d\352Aa\n\'googleads.goo" +
      "gleapis.com/CustomerClient\0226customers/{c" +
      "ustomer}/customerClients/{customer_clien" +
      "t}B\200\002\n%com.google.ads.googleads.v3.resou" +
      "rcesB\023CustomerClientProtoP\001ZJgoogle.gola" +
      "ng.org/genproto/googleapis/ads/googleads" +
      "/v3/resources;resources\242\002\003GAA\252\002!Google.A" +
      "ds.GoogleAds.V3.Resources\312\002!Google\\Ads\\G" +
      "oogleAds\\V3\\Resources\352\002%Google::Ads::Goo" +
      "gleAds::V3::Resourcesb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v3_resources_CustomerClient_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v3_resources_CustomerClient_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v3_resources_CustomerClient_descriptor,
        new java.lang.String[] { "ResourceName", "ClientCustomer", "Hidden", "Level", "TimeZone", "TestAccount", "Manager", "DescriptiveName", "CurrencyCode", "Id", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
