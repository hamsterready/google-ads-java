// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v10/resources/age_range_view.proto

package com.google.ads.googleads.v10.resources;

public final class AgeRangeViewProto {
  private AgeRangeViewProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v10_resources_AgeRangeView_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v10_resources_AgeRangeView_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n7google/ads/googleads/v10/resources/age" +
      "_range_view.proto\022\"google.ads.googleads." +
      "v10.resources\032\034google/api/annotations.pr" +
      "oto\032\037google/api/field_behavior.proto\032\031go" +
      "ogle/api/resource.proto\"\304\001\n\014AgeRangeView" +
      "\022D\n\rresource_name\030\001 \001(\tB-\340A\003\372A\'\n%googlea" +
      "ds.googleapis.com/AgeRangeView:n\352Ak\n%goo" +
      "gleads.googleapis.com/AgeRangeView\022Bcust" +
      "omers/{customer_id}/ageRangeViews/{ad_gr" +
      "oup_id}~{criterion_id}B\203\002\n&com.google.ad" +
      "s.googleads.v10.resourcesB\021AgeRangeViewP" +
      "rotoP\001ZKgoogle.golang.org/genproto/googl" +
      "eapis/ads/googleads/v10/resources;resour" +
      "ces\242\002\003GAA\252\002\"Google.Ads.GoogleAds.V10.Res" +
      "ources\312\002\"Google\\Ads\\GoogleAds\\V10\\Resour" +
      "ces\352\002&Google::Ads::GoogleAds::V10::Resou" +
      "rcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v10_resources_AgeRangeView_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v10_resources_AgeRangeView_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v10_resources_AgeRangeView_descriptor,
        new java.lang.String[] { "ResourceName", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}