// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v11/resources/ad_group_bid_modifier.proto

package com.google.ads.googleads.v11.resources;

public final class AdGroupBidModifierProto {
  private AdGroupBidModifierProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v11_resources_AdGroupBidModifier_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v11_resources_AdGroupBidModifier_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n>google/ads/googleads/v11/resources/ad_" +
      "group_bid_modifier.proto\022\"google.ads.goo" +
      "gleads.v11.resources\032.google/ads/googlea" +
      "ds/v11/common/criteria.proto\0328google/ads" +
      "/googleads/v11/enums/bid_modifier_source" +
      ".proto\032\037google/api/field_behavior.proto\032" +
      "\031google/api/resource.proto\"\344\t\n\022AdGroupBi" +
      "dModifier\022J\n\rresource_name\030\001 \001(\tB3\340A\005\372A-" +
      "\n+googleads.googleapis.com/AdGroupBidMod" +
      "ifier\022?\n\010ad_group\030\r \001(\tB(\340A\005\372A\"\n googlea" +
      "ds.googleapis.com/AdGroupH\001\210\001\001\022\036\n\014criter" +
      "ion_id\030\016 \001(\003B\003\340A\003H\002\210\001\001\022\031\n\014bid_modifier\030\017" +
      " \001(\001H\003\210\001\001\022D\n\rbase_ad_group\030\020 \001(\tB(\340A\003\372A\"" +
      "\n googleads.googleapis.com/AdGroupH\004\210\001\001\022" +
      "i\n\023bid_modifier_source\030\n \001(\0162G.google.ad" +
      "s.googleads.v11.enums.BidModifierSourceE" +
      "num.BidModifierSourceB\003\340A\003\022e\n\031hotel_date" +
      "_selection_type\030\005 \001(\0132;.google.ads.googl" +
      "eads.v11.common.HotelDateSelectionTypeIn" +
      "foB\003\340A\005H\000\022k\n\034hotel_advance_booking_windo" +
      "w\030\006 \001(\0132>.google.ads.googleads.v11.commo" +
      "n.HotelAdvanceBookingWindowInfoB\003\340A\005H\000\022[" +
      "\n\024hotel_length_of_stay\030\007 \001(\01326.google.ad" +
      "s.googleads.v11.common.HotelLengthOfStay" +
      "InfoB\003\340A\005H\000\022W\n\022hotel_check_in_day\030\010 \001(\0132" +
      "4.google.ads.googleads.v11.common.HotelC" +
      "heckInDayInfoB\003\340A\005H\000\022B\n\006device\030\013 \001(\0132+.g" +
      "oogle.ads.googleads.v11.common.DeviceInf" +
      "oB\003\340A\005H\000\022W\n\021preferred_content\030\014 \001(\01325.go" +
      "ogle.ads.googleads.v11.common.PreferredC" +
      "ontentInfoB\003\340A\005H\000\022d\n\031hotel_check_in_date" +
      "_range\030\021 \001(\0132:.google.ads.googleads.v11." +
      "common.HotelCheckInDateRangeInfoB\003\340A\005H\000:" +
      "z\352Aw\n+googleads.googleapis.com/AdGroupBi" +
      "dModifier\022Hcustomers/{customer_id}/adGro" +
      "upBidModifiers/{ad_group_id}~{criterion_" +
      "id}B\013\n\tcriterionB\013\n\t_ad_groupB\017\n\r_criter" +
      "ion_idB\017\n\r_bid_modifierB\020\n\016_base_ad_grou" +
      "pB\211\002\n&com.google.ads.googleads.v11.resou" +
      "rcesB\027AdGroupBidModifierProtoP\001ZKgoogle." +
      "golang.org/genproto/googleapis/ads/googl" +
      "eads/v11/resources;resources\242\002\003GAA\252\002\"Goo" +
      "gle.Ads.GoogleAds.V11.Resources\312\002\"Google" +
      "\\Ads\\GoogleAds\\V11\\Resources\352\002&Google::A" +
      "ds::GoogleAds::V11::Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v11.common.CriteriaProto.getDescriptor(),
          com.google.ads.googleads.v11.enums.BidModifierSourceProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v11_resources_AdGroupBidModifier_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v11_resources_AdGroupBidModifier_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v11_resources_AdGroupBidModifier_descriptor,
        new java.lang.String[] { "ResourceName", "AdGroup", "CriterionId", "BidModifier", "BaseAdGroup", "BidModifierSource", "HotelDateSelectionType", "HotelAdvanceBookingWindow", "HotelLengthOfStay", "HotelCheckInDay", "Device", "PreferredContent", "HotelCheckInDateRange", "Criterion", "AdGroup", "CriterionId", "BidModifier", "BaseAdGroup", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v11.common.CriteriaProto.getDescriptor();
    com.google.ads.googleads.v11.enums.BidModifierSourceProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}