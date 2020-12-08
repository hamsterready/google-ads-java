// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v6/resources/detail_placement_view.proto

package com.google.ads.googleads.v6.resources;

public final class DetailPlacementViewProto {
  private DetailPlacementViewProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v6_resources_DetailPlacementView_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v6_resources_DetailPlacementView_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n=google/ads/googleads/v6/resources/deta" +
      "il_placement_view.proto\022!google.ads.goog" +
      "leads.v6.resources\0322google/ads/googleads" +
      "/v6/enums/placement_type.proto\032\037google/a" +
      "pi/field_behavior.proto\032\031google/api/reso" +
      "urce.proto\032\034google/api/annotations.proto" +
      "\"\230\004\n\023DetailPlacementView\022K\n\rresource_nam" +
      "e\030\001 \001(\tB4\340A\003\372A.\n,googleads.googleapis.co" +
      "m/DetailPlacementView\022\033\n\tplacement\030\007 \001(\t" +
      "B\003\340A\003H\000\210\001\001\022\036\n\014display_name\030\010 \001(\tB\003\340A\003H\001\210" +
      "\001\001\022,\n\032group_placement_target_url\030\t \001(\tB\003" +
      "\340A\003H\002\210\001\001\022\034\n\ntarget_url\030\n \001(\tB\003\340A\003H\003\210\001\001\022[" +
      "\n\016placement_type\030\006 \001(\0162>.google.ads.goog" +
      "leads.v6.enums.PlacementTypeEnum.Placeme" +
      "ntTypeB\003\340A\003:\200\001\352A}\n,googleads.googleapis." +
      "com/DetailPlacementView\022Mcustomers/{cust" +
      "omer_id}/detailPlacementViews/{ad_group_" +
      "id}~{base64_placement}B\014\n\n_placementB\017\n\r" +
      "_display_nameB\035\n\033_group_placement_target" +
      "_urlB\r\n\013_target_urlB\205\002\n%com.google.ads.g" +
      "oogleads.v6.resourcesB\030DetailPlacementVi" +
      "ewProtoP\001ZJgoogle.golang.org/genproto/go" +
      "ogleapis/ads/googleads/v6/resources;reso" +
      "urces\242\002\003GAA\252\002!Google.Ads.GoogleAds.V6.Re" +
      "sources\312\002!Google\\Ads\\GoogleAds\\V6\\Resour" +
      "ces\352\002%Google::Ads::GoogleAds::V6::Resour" +
      "cesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v6.enums.PlacementTypeProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v6_resources_DetailPlacementView_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v6_resources_DetailPlacementView_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v6_resources_DetailPlacementView_descriptor,
        new java.lang.String[] { "ResourceName", "Placement", "DisplayName", "GroupPlacementTargetUrl", "TargetUrl", "PlacementType", "Placement", "DisplayName", "GroupPlacementTargetUrl", "TargetUrl", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v6.enums.PlacementTypeProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}