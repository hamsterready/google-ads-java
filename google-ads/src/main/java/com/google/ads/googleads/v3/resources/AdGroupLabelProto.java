// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v3/resources/ad_group_label.proto

package com.google.ads.googleads.v3.resources;

public final class AdGroupLabelProto {
  private AdGroupLabelProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v3_resources_AdGroupLabel_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v3_resources_AdGroupLabel_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n6google/ads/googleads/v3/resources/ad_g" +
      "roup_label.proto\022!google.ads.googleads.v" +
      "3.resources\032\031google/api/resource.proto\032\036" +
      "google/protobuf/wrappers.proto\032\034google/a" +
      "pi/annotations.proto\"\343\001\n\014AdGroupLabel\022\025\n" +
      "\rresource_name\030\001 \001(\t\022.\n\010ad_group\030\002 \001(\0132\034" +
      ".google.protobuf.StringValue\022+\n\005label\030\003 " +
      "\001(\0132\034.google.protobuf.StringValue:_\352A\\\n%" +
      "googleads.googleapis.com/AdGroupLabel\0223c" +
      "ustomers/{customer}/adGroupLabels/{ad_gr" +
      "oup_label}B\376\001\n%com.google.ads.googleads." +
      "v3.resourcesB\021AdGroupLabelProtoP\001ZJgoogl" +
      "e.golang.org/genproto/googleapis/ads/goo" +
      "gleads/v3/resources;resources\242\002\003GAA\252\002!Go" +
      "ogle.Ads.GoogleAds.V3.Resources\312\002!Google" +
      "\\Ads\\GoogleAds\\V3\\Resources\352\002%Google::Ad" +
      "s::GoogleAds::V3::Resourcesb\006proto3"
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
    internal_static_google_ads_googleads_v3_resources_AdGroupLabel_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v3_resources_AdGroupLabel_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v3_resources_AdGroupLabel_descriptor,
        new java.lang.String[] { "ResourceName", "AdGroup", "Label", });
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
