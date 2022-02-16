// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v10/resources/custom_interest.proto

package com.google.ads.googleads.v10.resources;

public final class CustomInterestProto {
  private CustomInterestProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v10_resources_CustomInterest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v10_resources_CustomInterest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v10_resources_CustomInterestMember_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v10_resources_CustomInterestMember_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n8google/ads/googleads/v10/resources/cus" +
      "tom_interest.proto\022\"google.ads.googleads" +
      ".v10.resources\032@google/ads/googleads/v10" +
      "/enums/custom_interest_member_type.proto" +
      "\032;google/ads/googleads/v10/enums/custom_" +
      "interest_status.proto\0329google/ads/google" +
      "ads/v10/enums/custom_interest_type.proto" +
      "\032\034google/api/annotations.proto\032\037google/a" +
      "pi/field_behavior.proto\032\031google/api/reso" +
      "urce.proto\"\252\004\n\016CustomInterest\022F\n\rresourc" +
      "e_name\030\001 \001(\tB/\340A\005\372A)\n\'googleads.googleap" +
      "is.com/CustomInterest\022\024\n\002id\030\010 \001(\003B\003\340A\003H\000" +
      "\210\001\001\022]\n\006status\030\003 \001(\0162M.google.ads.googlea" +
      "ds.v10.enums.CustomInterestStatusEnum.Cu" +
      "stomInterestStatus\022\021\n\004name\030\t \001(\tH\001\210\001\001\022W\n" +
      "\004type\030\005 \001(\0162I.google.ads.googleads.v10.e" +
      "nums.CustomInterestTypeEnum.CustomIntere" +
      "stType\022\030\n\013description\030\n \001(\tH\002\210\001\001\022I\n\007memb" +
      "ers\030\007 \003(\01328.google.ads.googleads.v10.res" +
      "ources.CustomInterestMember:j\352Ag\n\'google" +
      "ads.googleapis.com/CustomInterest\022<custo" +
      "mers/{customer_id}/customInterests/{cust" +
      "om_interest_id}B\005\n\003_idB\007\n\005_nameB\016\n\014_desc" +
      "ription\"\250\001\n\024CustomInterestMember\022j\n\013memb" +
      "er_type\030\001 \001(\0162U.google.ads.googleads.v10" +
      ".enums.CustomInterestMemberTypeEnum.Cust" +
      "omInterestMemberType\022\026\n\tparameter\030\003 \001(\tH" +
      "\000\210\001\001B\014\n\n_parameterB\205\002\n&com.google.ads.go" +
      "ogleads.v10.resourcesB\023CustomInterestPro" +
      "toP\001ZKgoogle.golang.org/genproto/googlea" +
      "pis/ads/googleads/v10/resources;resource" +
      "s\242\002\003GAA\252\002\"Google.Ads.GoogleAds.V10.Resou" +
      "rces\312\002\"Google\\Ads\\GoogleAds\\V10\\Resource" +
      "s\352\002&Google::Ads::GoogleAds::V10::Resourc" +
      "esb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v10.enums.CustomInterestMemberTypeProto.getDescriptor(),
          com.google.ads.googleads.v10.enums.CustomInterestStatusProto.getDescriptor(),
          com.google.ads.googleads.v10.enums.CustomInterestTypeProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v10_resources_CustomInterest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v10_resources_CustomInterest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v10_resources_CustomInterest_descriptor,
        new java.lang.String[] { "ResourceName", "Id", "Status", "Name", "Type", "Description", "Members", "Id", "Name", "Description", });
    internal_static_google_ads_googleads_v10_resources_CustomInterestMember_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v10_resources_CustomInterestMember_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v10_resources_CustomInterestMember_descriptor,
        new java.lang.String[] { "MemberType", "Parameter", "Parameter", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v10.enums.CustomInterestMemberTypeProto.getDescriptor();
    com.google.ads.googleads.v10.enums.CustomInterestStatusProto.getDescriptor();
    com.google.ads.googleads.v10.enums.CustomInterestTypeProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}