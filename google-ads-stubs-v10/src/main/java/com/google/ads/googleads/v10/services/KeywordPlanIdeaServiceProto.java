// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v10/services/keyword_plan_idea_service.proto

package com.google.ads.googleads.v10.services;

public final class KeywordPlanIdeaServiceProto {
  private KeywordPlanIdeaServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v10_services_GenerateKeywordIdeasRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v10_services_GenerateKeywordIdeasRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v10_services_KeywordAndUrlSeed_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v10_services_KeywordAndUrlSeed_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v10_services_KeywordSeed_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v10_services_KeywordSeed_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v10_services_SiteSeed_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v10_services_SiteSeed_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v10_services_UrlSeed_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v10_services_UrlSeed_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v10_services_GenerateKeywordIdeaResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v10_services_GenerateKeywordIdeaResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v10_services_GenerateKeywordIdeaResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v10_services_GenerateKeywordIdeaResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v10_services_GenerateKeywordHistoricalMetricsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v10_services_GenerateKeywordHistoricalMetricsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v10_services_GenerateKeywordHistoricalMetricsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v10_services_GenerateKeywordHistoricalMetricsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v10_services_GenerateKeywordHistoricalMetricsResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v10_services_GenerateKeywordHistoricalMetricsResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nAgoogle/ads/googleads/v10/services/keyw" +
      "ord_plan_idea_service.proto\022!google.ads." +
      "googleads.v10.services\0329google/ads/googl" +
      "eads/v10/common/keyword_plan_common.prot" +
      "o\032Dgoogle/ads/googleads/v10/enums/keywor" +
      "d_plan_keyword_annotation.proto\0329google/" +
      "ads/googleads/v10/enums/keyword_plan_net" +
      "work.proto\032\034google/api/annotations.proto" +
      "\032\027google/api/client.proto\"\377\006\n\033GenerateKe" +
      "ywordIdeasRequest\022\023\n\013customer_id\030\001 \001(\t\022\025" +
      "\n\010language\030\016 \001(\tH\001\210\001\001\022\034\n\024geo_target_cons" +
      "tants\030\017 \003(\t\022\036\n\026include_adult_keywords\030\n " +
      "\001(\010\022\022\n\npage_token\030\014 \001(\t\022\021\n\tpage_size\030\r \001" +
      "(\005\022g\n\024keyword_plan_network\030\t \001(\0162I.googl" +
      "e.ads.googleads.v10.enums.KeywordPlanNet" +
      "workEnum.KeywordPlanNetwork\022y\n\022keyword_a" +
      "nnotation\030\021 \003(\0162].google.ads.googleads.v" +
      "10.enums.KeywordPlanKeywordAnnotationEnu" +
      "m.KeywordPlanKeywordAnnotation\022W\n\021aggreg" +
      "ate_metrics\030\020 \001(\0132<.google.ads.googleads" +
      ".v10.common.KeywordPlanAggregateMetrics\022" +
      "]\n\032historical_metrics_options\030\022 \001(\01329.go" +
      "ogle.ads.googleads.v10.common.Historical" +
      "MetricsOptions\022T\n\024keyword_and_url_seed\030\002" +
      " \001(\01324.google.ads.googleads.v10.services" +
      ".KeywordAndUrlSeedH\000\022F\n\014keyword_seed\030\003 \001" +
      "(\0132..google.ads.googleads.v10.services.K" +
      "eywordSeedH\000\022>\n\010url_seed\030\005 \001(\0132*.google." +
      "ads.googleads.v10.services.UrlSeedH\000\022@\n\t" +
      "site_seed\030\013 \001(\0132+.google.ads.googleads.v" +
      "10.services.SiteSeedH\000B\006\n\004seedB\013\n\t_langu" +
      "age\"?\n\021KeywordAndUrlSeed\022\020\n\003url\030\003 \001(\tH\000\210" +
      "\001\001\022\020\n\010keywords\030\004 \003(\tB\006\n\004_url\"\037\n\013KeywordS" +
      "eed\022\020\n\010keywords\030\002 \003(\t\"&\n\010SiteSeed\022\021\n\004sit" +
      "e\030\002 \001(\tH\000\210\001\001B\007\n\005_site\"#\n\007UrlSeed\022\020\n\003url\030" +
      "\002 \001(\tH\000\210\001\001B\006\n\004_url\"\377\001\n\033GenerateKeywordId" +
      "eaResponse\022M\n\007results\030\001 \003(\0132<.google.ads" +
      ".googleads.v10.services.GenerateKeywordI" +
      "deaResult\022d\n\030aggregate_metric_results\030\004 " +
      "\001(\0132B.google.ads.googleads.v10.common.Ke" +
      "ywordPlanAggregateMetricResults\022\027\n\017next_" +
      "page_token\030\002 \001(\t\022\022\n\ntotal_size\030\003 \001(\003\"\376\001\n" +
      "\031GenerateKeywordIdeaResult\022\021\n\004text\030\005 \001(\t" +
      "H\000\210\001\001\022[\n\024keyword_idea_metrics\030\003 \001(\0132=.go" +
      "ogle.ads.googleads.v10.common.KeywordPla" +
      "nHistoricalMetrics\022P\n\023keyword_annotation" +
      "s\030\006 \001(\01323.google.ads.googleads.v10.commo" +
      "n.KeywordAnnotations\022\026\n\016close_variants\030\007" +
      " \003(\tB\007\n\005_text\"\257\001\n\'GenerateKeywordHistori" +
      "calMetricsRequest\022\023\n\013customer_id\030\001 \001(\t\022\020" +
      "\n\010keywords\030\002 \003(\t\022]\n\032historical_metrics_o" +
      "ptions\030\003 \001(\01329.google.ads.googleads.v10." +
      "common.HistoricalMetricsOptions\"\206\001\n(Gene" +
      "rateKeywordHistoricalMetricsResponse\022Z\n\007" +
      "results\030\001 \003(\0132I.google.ads.googleads.v10" +
      ".services.GenerateKeywordHistoricalMetri" +
      "csResult\"\264\001\n&GenerateKeywordHistoricalMe" +
      "tricsResult\022\021\n\004text\030\001 \001(\tH\000\210\001\001\022\026\n\016close_" +
      "variants\030\003 \003(\t\022V\n\017keyword_metrics\030\002 \001(\0132" +
      "=.google.ads.googleads.v10.common.Keywor" +
      "dPlanHistoricalMetricsB\007\n\005_text2\302\004\n\026Keyw" +
      "ordPlanIdeaService\022\326\001\n\024GenerateKeywordId" +
      "eas\022>.google.ads.googleads.v10.services." +
      "GenerateKeywordIdeasRequest\032>.google.ads" +
      ".googleads.v10.services.GenerateKeywordI" +
      "deaResponse\">\202\323\344\223\0028\"3/v10/customers/{cus" +
      "tomer_id=*}:generateKeywordIdeas:\001*\022\207\002\n " +
      "GenerateKeywordHistoricalMetrics\022J.googl" +
      "e.ads.googleads.v10.services.GenerateKey" +
      "wordHistoricalMetricsRequest\032K.google.ad" +
      "s.googleads.v10.services.GenerateKeyword" +
      "HistoricalMetricsResponse\"J\202\323\344\223\002D\"?/v10/" +
      "customers/{customer_id=*}:generateKeywor" +
      "dHistoricalMetrics:\001*\032E\312A\030googleads.goog" +
      "leapis.com\322A\'https://www.googleapis.com/" +
      "auth/adwordsB\207\002\n%com.google.ads.googlead" +
      "s.v10.servicesB\033KeywordPlanIdeaServicePr" +
      "otoP\001ZIgoogle.golang.org/genproto/google" +
      "apis/ads/googleads/v10/services;services" +
      "\242\002\003GAA\252\002!Google.Ads.GoogleAds.V10.Servic" +
      "es\312\002!Google\\Ads\\GoogleAds\\V10\\Services\352\002" +
      "%Google::Ads::GoogleAds::V10::Servicesb\006" +
      "proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v10.common.KeywordPlanCommonProto.getDescriptor(),
          com.google.ads.googleads.v10.enums.KeywordPlanKeywordAnnotationProto.getDescriptor(),
          com.google.ads.googleads.v10.enums.KeywordPlanNetworkProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v10_services_GenerateKeywordIdeasRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v10_services_GenerateKeywordIdeasRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v10_services_GenerateKeywordIdeasRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Language", "GeoTargetConstants", "IncludeAdultKeywords", "PageToken", "PageSize", "KeywordPlanNetwork", "KeywordAnnotation", "AggregateMetrics", "HistoricalMetricsOptions", "KeywordAndUrlSeed", "KeywordSeed", "UrlSeed", "SiteSeed", "Seed", "Language", });
    internal_static_google_ads_googleads_v10_services_KeywordAndUrlSeed_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v10_services_KeywordAndUrlSeed_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v10_services_KeywordAndUrlSeed_descriptor,
        new java.lang.String[] { "Url", "Keywords", "Url", });
    internal_static_google_ads_googleads_v10_services_KeywordSeed_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v10_services_KeywordSeed_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v10_services_KeywordSeed_descriptor,
        new java.lang.String[] { "Keywords", });
    internal_static_google_ads_googleads_v10_services_SiteSeed_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v10_services_SiteSeed_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v10_services_SiteSeed_descriptor,
        new java.lang.String[] { "Site", "Site", });
    internal_static_google_ads_googleads_v10_services_UrlSeed_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_ads_googleads_v10_services_UrlSeed_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v10_services_UrlSeed_descriptor,
        new java.lang.String[] { "Url", "Url", });
    internal_static_google_ads_googleads_v10_services_GenerateKeywordIdeaResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_ads_googleads_v10_services_GenerateKeywordIdeaResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v10_services_GenerateKeywordIdeaResponse_descriptor,
        new java.lang.String[] { "Results", "AggregateMetricResults", "NextPageToken", "TotalSize", });
    internal_static_google_ads_googleads_v10_services_GenerateKeywordIdeaResult_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_ads_googleads_v10_services_GenerateKeywordIdeaResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v10_services_GenerateKeywordIdeaResult_descriptor,
        new java.lang.String[] { "Text", "KeywordIdeaMetrics", "KeywordAnnotations", "CloseVariants", "Text", });
    internal_static_google_ads_googleads_v10_services_GenerateKeywordHistoricalMetricsRequest_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_google_ads_googleads_v10_services_GenerateKeywordHistoricalMetricsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v10_services_GenerateKeywordHistoricalMetricsRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Keywords", "HistoricalMetricsOptions", });
    internal_static_google_ads_googleads_v10_services_GenerateKeywordHistoricalMetricsResponse_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_google_ads_googleads_v10_services_GenerateKeywordHistoricalMetricsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v10_services_GenerateKeywordHistoricalMetricsResponse_descriptor,
        new java.lang.String[] { "Results", });
    internal_static_google_ads_googleads_v10_services_GenerateKeywordHistoricalMetricsResult_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_google_ads_googleads_v10_services_GenerateKeywordHistoricalMetricsResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v10_services_GenerateKeywordHistoricalMetricsResult_descriptor,
        new java.lang.String[] { "Text", "CloseVariants", "KeywordMetrics", "Text", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.oauthScopes);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v10.common.KeywordPlanCommonProto.getDescriptor();
    com.google.ads.googleads.v10.enums.KeywordPlanKeywordAnnotationProto.getDescriptor();
    com.google.ads.googleads.v10.enums.KeywordPlanNetworkProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
