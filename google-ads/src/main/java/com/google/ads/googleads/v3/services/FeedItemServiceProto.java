// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v3/services/feed_item_service.proto

package com.google.ads.googleads.v3.services;

public final class FeedItemServiceProto {
  private FeedItemServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v3_services_GetFeedItemRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v3_services_GetFeedItemRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v3_services_MutateFeedItemsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v3_services_MutateFeedItemsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v3_services_FeedItemOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v3_services_FeedItemOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v3_services_MutateFeedItemsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v3_services_MutateFeedItemsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v3_services_MutateFeedItemResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v3_services_MutateFeedItemResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n8google/ads/googleads/v3/services/feed_" +
      "item_service.proto\022 google.ads.googleads" +
      ".v3.services\0321google/ads/googleads/v3/re" +
      "sources/feed_item.proto\032\034google/api/anno" +
      "tations.proto\032\027google/api/client.proto\032\037" +
      "google/api/field_behavior.proto\032 google/" +
      "protobuf/field_mask.proto\032\027google/rpc/st" +
      "atus.proto\"0\n\022GetFeedItemRequest\022\032\n\rreso" +
      "urce_name\030\001 \001(\tB\003\340A\002\"\260\001\n\026MutateFeedItems" +
      "Request\022\030\n\013customer_id\030\001 \001(\tB\003\340A\002\022L\n\nope" +
      "rations\030\002 \003(\01323.google.ads.googleads.v3." +
      "services.FeedItemOperationB\003\340A\002\022\027\n\017parti" +
      "al_failure\030\003 \001(\010\022\025\n\rvalidate_only\030\004 \001(\010\"" +
      "\341\001\n\021FeedItemOperation\022/\n\013update_mask\030\004 \001" +
      "(\0132\032.google.protobuf.FieldMask\022=\n\006create" +
      "\030\001 \001(\0132+.google.ads.googleads.v3.resourc" +
      "es.FeedItemH\000\022=\n\006update\030\002 \001(\0132+.google.a" +
      "ds.googleads.v3.resources.FeedItemH\000\022\020\n\006" +
      "remove\030\003 \001(\tH\000B\013\n\toperation\"\225\001\n\027MutateFe" +
      "edItemsResponse\0221\n\025partial_failure_error" +
      "\030\003 \001(\0132\022.google.rpc.Status\022G\n\007results\030\002 " +
      "\003(\01326.google.ads.googleads.v3.services.M" +
      "utateFeedItemResult\"-\n\024MutateFeedItemRes" +
      "ult\022\025\n\rresource_name\030\001 \001(\t2\303\003\n\017FeedItemS" +
      "ervice\022\265\001\n\013GetFeedItem\0224.google.ads.goog" +
      "leads.v3.services.GetFeedItemRequest\032+.g" +
      "oogle.ads.googleads.v3.resources.FeedIte" +
      "m\"C\202\323\344\223\002-\022+/v3/{resource_name=customers/" +
      "*/feedItems/*}\332A\rresource_name\022\332\001\n\017Mutat" +
      "eFeedItems\0228.google.ads.googleads.v3.ser" +
      "vices.MutateFeedItemsRequest\0329.google.ad" +
      "s.googleads.v3.services.MutateFeedItemsR" +
      "esponse\"R\202\323\344\223\0023\"./v3/customers/{customer" +
      "_id=*}/feedItems:mutate:\001*\332A\026customer_id" +
      ",operations\032\033\312A\030googleads.googleapis.com" +
      "B\373\001\n$com.google.ads.googleads.v3.service" +
      "sB\024FeedItemServiceProtoP\001ZHgoogle.golang" +
      ".org/genproto/googleapis/ads/googleads/v" +
      "3/services;services\242\002\003GAA\252\002 Google.Ads.G" +
      "oogleAds.V3.Services\312\002 Google\\Ads\\Google" +
      "Ads\\V3\\Services\352\002$Google::Ads::GoogleAds" +
      "::V3::Servicesb\006proto3"
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
          com.google.ads.googleads.v3.resources.FeedItemProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v3_services_GetFeedItemRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v3_services_GetFeedItemRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v3_services_GetFeedItemRequest_descriptor,
        new java.lang.String[] { "ResourceName", });
    internal_static_google_ads_googleads_v3_services_MutateFeedItemsRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v3_services_MutateFeedItemsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v3_services_MutateFeedItemsRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Operations", "PartialFailure", "ValidateOnly", });
    internal_static_google_ads_googleads_v3_services_FeedItemOperation_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v3_services_FeedItemOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v3_services_FeedItemOperation_descriptor,
        new java.lang.String[] { "UpdateMask", "Create", "Update", "Remove", "Operation", });
    internal_static_google_ads_googleads_v3_services_MutateFeedItemsResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v3_services_MutateFeedItemsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v3_services_MutateFeedItemsResponse_descriptor,
        new java.lang.String[] { "PartialFailureError", "Results", });
    internal_static_google_ads_googleads_v3_services_MutateFeedItemResult_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_ads_googleads_v3_services_MutateFeedItemResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v3_services_MutateFeedItemResult_descriptor,
        new java.lang.String[] { "ResourceName", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v3.resources.FeedItemProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
