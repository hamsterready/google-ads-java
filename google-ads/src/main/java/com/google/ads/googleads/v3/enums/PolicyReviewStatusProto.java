// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v3/enums/policy_review_status.proto

package com.google.ads.googleads.v3.enums;

public final class PolicyReviewStatusProto {
  private PolicyReviewStatusProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v3_enums_PolicyReviewStatusEnum_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v3_enums_PolicyReviewStatusEnum_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n8google/ads/googleads/v3/enums/policy_r" +
      "eview_status.proto\022\035google.ads.googleads" +
      ".v3.enums\032\034google/api/annotations.proto\"" +
      "\235\001\n\026PolicyReviewStatusEnum\"\202\001\n\022PolicyRev" +
      "iewStatus\022\017\n\013UNSPECIFIED\020\000\022\013\n\007UNKNOWN\020\001\022" +
      "\026\n\022REVIEW_IN_PROGRESS\020\002\022\014\n\010REVIEWED\020\003\022\020\n" +
      "\014UNDER_APPEAL\020\004\022\026\n\022ELIGIBLE_MAY_SERVE\020\005B" +
      "\354\001\n!com.google.ads.googleads.v3.enumsB\027P" +
      "olicyReviewStatusProtoP\001ZBgoogle.golang." +
      "org/genproto/googleapis/ads/googleads/v3" +
      "/enums;enums\242\002\003GAA\252\002\035Google.Ads.GoogleAd" +
      "s.V3.Enums\312\002\035Google\\Ads\\GoogleAds\\V3\\Enu" +
      "ms\352\002!Google::Ads::GoogleAds::V3::Enumsb\006" +
      "proto3"
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
          com.google.api.AnnotationsProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v3_enums_PolicyReviewStatusEnum_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v3_enums_PolicyReviewStatusEnum_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v3_enums_PolicyReviewStatusEnum_descriptor,
        new java.lang.String[] { });
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
