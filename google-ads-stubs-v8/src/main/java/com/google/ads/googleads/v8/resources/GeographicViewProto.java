// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v8/resources/geographic_view.proto

package com.google.ads.googleads.v8.resources;

public final class GeographicViewProto {
  private GeographicViewProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v8_resources_GeographicView_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v8_resources_GeographicView_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n7google/ads/googleads/v8/resources/geog" +
      "raphic_view.proto\022!google.ads.googleads." +
      "v8.resources\0326google/ads/googleads/v8/en" +
      "ums/geo_targeting_type.proto\032\037google/api" +
      "/field_behavior.proto\032\031google/api/resour" +
      "ce.proto\032\034google/api/annotations.proto\"\371" +
      "\002\n\016GeographicView\022F\n\rresource_name\030\001 \001(\t" +
      "B/\340A\003\372A)\n\'googleads.googleapis.com/Geogr" +
      "aphicView\022`\n\rlocation_type\030\003 \001(\0162D.googl" +
      "e.ads.googleads.v8.enums.GeoTargetingTyp" +
      "eEnum.GeoTargetingTypeB\003\340A\003\022&\n\024country_c" +
      "riterion_id\030\005 \001(\003B\003\340A\003H\000\210\001\001:|\352Ay\n\'google" +
      "ads.googleapis.com/GeographicView\022Ncusto" +
      "mers/{customer_id}/geographicViews/{coun" +
      "try_criterion_id}~{location_type}B\027\n\025_co" +
      "untry_criterion_idB\200\002\n%com.google.ads.go" +
      "ogleads.v8.resourcesB\023GeographicViewProt" +
      "oP\001ZJgoogle.golang.org/genproto/googleap" +
      "is/ads/googleads/v8/resources;resources\242" +
      "\002\003GAA\252\002!Google.Ads.GoogleAds.V8.Resource" +
      "s\312\002!Google\\Ads\\GoogleAds\\V8\\Resources\352\002%" +
      "Google::Ads::GoogleAds::V8::Resourcesb\006p" +
      "roto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v8.enums.GeoTargetingTypeProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v8_resources_GeographicView_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v8_resources_GeographicView_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v8_resources_GeographicView_descriptor,
        new java.lang.String[] { "ResourceName", "LocationType", "CountryCriterionId", "CountryCriterionId", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v8.enums.GeoTargetingTypeProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}