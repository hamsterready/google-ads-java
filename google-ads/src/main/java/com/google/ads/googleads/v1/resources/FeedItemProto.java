// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v1/resources/feed_item.proto

package com.google.ads.googleads.v1.resources;

public final class FeedItemProto {
  private FeedItemProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_resources_FeedItem_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_resources_FeedItem_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_resources_FeedItemAttributeValue_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_resources_FeedItemAttributeValue_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_resources_FeedItemPlaceholderPolicyInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_resources_FeedItemPlaceholderPolicyInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_resources_FeedItemValidationError_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_resources_FeedItemValidationError_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n1google/ads/googleads/v1/resources/feed" +
      "_item.proto\022!google.ads.googleads.v1.res" +
      "ources\0325google/ads/googleads/v1/common/c" +
      "ustom_parameter.proto\0320google/ads/google" +
      "ads/v1/common/feed_common.proto\032+google/" +
      "ads/googleads/v1/common/policy.proto\032Ego" +
      "ogle/ads/googleads/v1/enums/feed_item_qu" +
      "ality_approval_status.proto\032Hgoogle/ads/" +
      "googleads/v1/enums/feed_item_quality_dis" +
      "approval_reason.proto\0324google/ads/google" +
      "ads/v1/enums/feed_item_status.proto\032?goo" +
      "gle/ads/googleads/v1/enums/feed_item_val" +
      "idation_status.proto\032=google/ads/googlea" +
      "ds/v1/enums/geo_targeting_restriction.pr" +
      "oto\032:google/ads/googleads/v1/enums/polic" +
      "y_approval_status.proto\0328google/ads/goog" +
      "leads/v1/enums/policy_review_status.prot" +
      "o\032?google/ads/googleads/v1/errors/feed_i" +
      "tem_validation_error.proto\032\036google/proto" +
      "buf/wrappers.proto\032\034google/api/annotatio" +
      "ns.proto\"\250\005\n\010FeedItem\022\025\n\rresource_name\030\001" +
      " \001(\t\022*\n\004feed\030\002 \001(\0132\034.google.protobuf.Str" +
      "ingValue\022\'\n\002id\030\003 \001(\0132\033.google.protobuf.I" +
      "nt64Value\0225\n\017start_date_time\030\004 \001(\0132\034.goo" +
      "gle.protobuf.StringValue\0223\n\rend_date_tim" +
      "e\030\005 \001(\0132\034.google.protobuf.StringValue\022S\n" +
      "\020attribute_values\030\006 \003(\01329.google.ads.goo" +
      "gleads.v1.resources.FeedItemAttributeVal" +
      "ue\022u\n\031geo_targeting_restriction\030\007 \001(\0162R." +
      "google.ads.googleads.v1.enums.GeoTargeti" +
      "ngRestrictionEnum.GeoTargetingRestrictio" +
      "n\022N\n\025url_custom_parameters\030\010 \003(\0132/.googl" +
      "e.ads.googleads.v1.common.CustomParamete" +
      "r\022P\n\006status\030\t \001(\0162@.google.ads.googleads" +
      ".v1.enums.FeedItemStatusEnum.FeedItemSta" +
      "tus\022V\n\014policy_infos\030\n \003(\0132@.google.ads.g" +
      "oogleads.v1.resources.FeedItemPlaceholde" +
      "rPolicyInfo\"\256\004\n\026FeedItemAttributeValue\0226" +
      "\n\021feed_attribute_id\030\001 \001(\0132\033.google.proto" +
      "buf.Int64Value\0222\n\rinteger_value\030\002 \001(\0132\033." +
      "google.protobuf.Int64Value\0221\n\rboolean_va" +
      "lue\030\003 \001(\0132\032.google.protobuf.BoolValue\0222\n" +
      "\014string_value\030\004 \001(\0132\034.google.protobuf.St" +
      "ringValue\0222\n\014double_value\030\005 \001(\0132\034.google" +
      ".protobuf.DoubleValue\022:\n\013price_value\030\006 \001" +
      "(\0132%.google.ads.googleads.v1.common.Mone" +
      "y\0223\n\016integer_values\030\007 \003(\0132\033.google.proto" +
      "buf.Int64Value\0222\n\016boolean_values\030\010 \003(\0132\032" +
      ".google.protobuf.BoolValue\0223\n\rstring_val" +
      "ues\030\t \003(\0132\034.google.protobuf.StringValue\022" +
      "3\n\rdouble_values\030\n \003(\0132\034.google.protobuf" +
      ".DoubleValue\"\205\007\n\035FeedItemPlaceholderPoli" +
      "cyInfo\0225\n\020placeholder_type\030\001 \001(\0132\033.googl" +
      "e.protobuf.Int32Value\022@\n\032feed_mapping_re" +
      "source_name\030\002 \001(\0132\034.google.protobuf.Stri" +
      "ngValue\022_\n\rreview_status\030\003 \001(\0162H.google." +
      "ads.googleads.v1.enums.PolicyReviewStatu" +
      "sEnum.PolicyReviewStatus\022e\n\017approval_sta" +
      "tus\030\004 \001(\0162L.google.ads.googleads.v1.enum" +
      "s.PolicyApprovalStatusEnum.PolicyApprova" +
      "lStatus\022N\n\024policy_topic_entries\030\005 \003(\01320." +
      "google.ads.googleads.v1.common.PolicyTop" +
      "icEntry\022o\n\021validation_status\030\006 \001(\0162T.goo" +
      "gle.ads.googleads.v1.enums.FeedItemValid" +
      "ationStatusEnum.FeedItemValidationStatus" +
      "\022U\n\021validation_errors\030\007 \003(\0132:.google.ads" +
      ".googleads.v1.resources.FeedItemValidati" +
      "onError\022\177\n\027quality_approval_status\030\010 \001(\016" +
      "2^.google.ads.googleads.v1.enums.FeedIte" +
      "mQualityApprovalStatusEnum.FeedItemQuali" +
      "tyApprovalStatus\022\211\001\n\033quality_disapproval" +
      "_reasons\030\t \003(\0162d.google.ads.googleads.v1" +
      ".enums.FeedItemQualityDisapprovalReasonE" +
      "num.FeedItemQualityDisapprovalReason\"\246\002\n" +
      "\027FeedItemValidationError\022m\n\020validation_e" +
      "rror\030\001 \001(\0162S.google.ads.googleads.v1.err" +
      "ors.FeedItemValidationErrorEnum.FeedItem" +
      "ValidationError\0221\n\013description\030\002 \001(\0132\034.g" +
      "oogle.protobuf.StringValue\0227\n\022feed_attri" +
      "bute_ids\030\003 \003(\0132\033.google.protobuf.Int64Va" +
      "lue\0220\n\nextra_info\030\005 \001(\0132\034.google.protobu" +
      "f.StringValueB\372\001\n%com.google.ads.googlea" +
      "ds.v1.resourcesB\rFeedItemProtoP\001ZJgoogle" +
      ".golang.org/genproto/googleapis/ads/goog" +
      "leads/v1/resources;resources\242\002\003GAA\252\002!Goo" +
      "gle.Ads.GoogleAds.V1.Resources\312\002!Google\\" +
      "Ads\\GoogleAds\\V1\\Resources\352\002%Google::Ads" +
      "::GoogleAds::V1::Resourcesb\006proto3"
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
          com.google.ads.googleads.v1.common.CustomParameterProto.getDescriptor(),
          com.google.ads.googleads.v1.common.FeedCommonProto.getDescriptor(),
          com.google.ads.googleads.v1.common.PolicyProto.getDescriptor(),
          com.google.ads.googleads.v1.enums.FeedItemQualityApprovalStatusProto.getDescriptor(),
          com.google.ads.googleads.v1.enums.FeedItemQualityDisapprovalReasonProto.getDescriptor(),
          com.google.ads.googleads.v1.enums.FeedItemStatusProto.getDescriptor(),
          com.google.ads.googleads.v1.enums.FeedItemValidationStatusProto.getDescriptor(),
          com.google.ads.googleads.v1.enums.GeoTargetingRestrictionProto.getDescriptor(),
          com.google.ads.googleads.v1.enums.PolicyApprovalStatusProto.getDescriptor(),
          com.google.ads.googleads.v1.enums.PolicyReviewStatusProto.getDescriptor(),
          com.google.ads.googleads.v1.errors.FeedItemValidationErrorProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v1_resources_FeedItem_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v1_resources_FeedItem_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_resources_FeedItem_descriptor,
        new java.lang.String[] { "ResourceName", "Feed", "Id", "StartDateTime", "EndDateTime", "AttributeValues", "GeoTargetingRestriction", "UrlCustomParameters", "Status", "PolicyInfos", });
    internal_static_google_ads_googleads_v1_resources_FeedItemAttributeValue_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v1_resources_FeedItemAttributeValue_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_resources_FeedItemAttributeValue_descriptor,
        new java.lang.String[] { "FeedAttributeId", "IntegerValue", "BooleanValue", "StringValue", "DoubleValue", "PriceValue", "IntegerValues", "BooleanValues", "StringValues", "DoubleValues", });
    internal_static_google_ads_googleads_v1_resources_FeedItemPlaceholderPolicyInfo_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v1_resources_FeedItemPlaceholderPolicyInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_resources_FeedItemPlaceholderPolicyInfo_descriptor,
        new java.lang.String[] { "PlaceholderType", "FeedMappingResourceName", "ReviewStatus", "ApprovalStatus", "PolicyTopicEntries", "ValidationStatus", "ValidationErrors", "QualityApprovalStatus", "QualityDisapprovalReasons", });
    internal_static_google_ads_googleads_v1_resources_FeedItemValidationError_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v1_resources_FeedItemValidationError_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_resources_FeedItemValidationError_descriptor,
        new java.lang.String[] { "ValidationError", "Description", "FeedAttributeIds", "ExtraInfo", });
    com.google.ads.googleads.v1.common.CustomParameterProto.getDescriptor();
    com.google.ads.googleads.v1.common.FeedCommonProto.getDescriptor();
    com.google.ads.googleads.v1.common.PolicyProto.getDescriptor();
    com.google.ads.googleads.v1.enums.FeedItemQualityApprovalStatusProto.getDescriptor();
    com.google.ads.googleads.v1.enums.FeedItemQualityDisapprovalReasonProto.getDescriptor();
    com.google.ads.googleads.v1.enums.FeedItemStatusProto.getDescriptor();
    com.google.ads.googleads.v1.enums.FeedItemValidationStatusProto.getDescriptor();
    com.google.ads.googleads.v1.enums.GeoTargetingRestrictionProto.getDescriptor();
    com.google.ads.googleads.v1.enums.PolicyApprovalStatusProto.getDescriptor();
    com.google.ads.googleads.v1.enums.PolicyReviewStatusProto.getDescriptor();
    com.google.ads.googleads.v1.errors.FeedItemValidationErrorProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}