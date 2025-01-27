// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v11/services/campaign_experiment_service.proto

package com.google.ads.googleads.v11.services;

public final class CampaignExperimentServiceProto {
  private CampaignExperimentServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v11_services_MutateCampaignExperimentsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v11_services_MutateCampaignExperimentsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v11_services_CampaignExperimentOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v11_services_CampaignExperimentOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v11_services_MutateCampaignExperimentsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v11_services_MutateCampaignExperimentsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v11_services_MutateCampaignExperimentResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v11_services_MutateCampaignExperimentResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v11_services_CreateCampaignExperimentRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v11_services_CreateCampaignExperimentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v11_services_CreateCampaignExperimentMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v11_services_CreateCampaignExperimentMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v11_services_GraduateCampaignExperimentRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v11_services_GraduateCampaignExperimentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v11_services_GraduateCampaignExperimentResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v11_services_GraduateCampaignExperimentResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v11_services_PromoteCampaignExperimentRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v11_services_PromoteCampaignExperimentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v11_services_EndCampaignExperimentRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v11_services_EndCampaignExperimentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v11_services_ListCampaignExperimentAsyncErrorsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v11_services_ListCampaignExperimentAsyncErrorsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v11_services_ListCampaignExperimentAsyncErrorsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v11_services_ListCampaignExperimentAsyncErrorsResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nCgoogle/ads/googleads/v11/services/camp" +
      "aign_experiment_service.proto\022!google.ad" +
      "s.googleads.v11.services\032:google/ads/goo" +
      "gleads/v11/enums/response_content_type.p" +
      "roto\032<google/ads/googleads/v11/resources" +
      "/campaign_experiment.proto\032\034google/api/a" +
      "nnotations.proto\032\027google/api/client.prot" +
      "o\032\037google/api/field_behavior.proto\032\031goog" +
      "le/api/resource.proto\032#google/longrunnin" +
      "g/operations.proto\032\033google/protobuf/empt" +
      "y.proto\032 google/protobuf/field_mask.prot" +
      "o\032\027google/rpc/status.proto\"\261\002\n MutateCam" +
      "paignExperimentsRequest\022\030\n\013customer_id\030\001" +
      " \001(\tB\003\340A\002\022W\n\noperations\030\002 \003(\0132>.google.a" +
      "ds.googleads.v11.services.CampaignExperi" +
      "mentOperationB\003\340A\002\022\027\n\017partial_failure\030\003 " +
      "\001(\010\022\025\n\rvalidate_only\030\004 \001(\010\022j\n\025response_c" +
      "ontent_type\030\005 \001(\0162K.google.ads.googleads" +
      ".v11.enums.ResponseContentTypeEnum.Respo" +
      "nseContentType\"\351\001\n\033CampaignExperimentOpe" +
      "ration\022/\n\013update_mask\030\003 \001(\0132\032.google.pro" +
      "tobuf.FieldMask\022H\n\006update\030\001 \001(\01326.google" +
      ".ads.googleads.v11.resources.CampaignExp" +
      "erimentH\000\022B\n\006remove\030\002 \001(\tB0\372A-\n+googlead" +
      "s.googleapis.com/CampaignExperimentH\000B\013\n" +
      "\toperation\"\252\001\n!MutateCampaignExperiments" +
      "Response\0221\n\025partial_failure_error\030\003 \001(\0132" +
      "\022.google.rpc.Status\022R\n\007results\030\002 \003(\0132A.g" +
      "oogle.ads.googleads.v11.services.MutateC" +
      "ampaignExperimentResult\"\276\001\n\036MutateCampai" +
      "gnExperimentResult\022G\n\rresource_name\030\001 \001(" +
      "\tB0\372A-\n+googleads.googleapis.com/Campaig" +
      "nExperiment\022S\n\023campaign_experiment\030\002 \001(\013" +
      "26.google.ads.googleads.v11.resources.Ca" +
      "mpaignExperiment\"\254\001\n\037CreateCampaignExper" +
      "imentRequest\022\030\n\013customer_id\030\001 \001(\tB\003\340A\002\022X" +
      "\n\023campaign_experiment\030\002 \001(\01326.google.ads" +
      ".googleads.v11.resources.CampaignExperim" +
      "entB\003\340A\002\022\025\n\rvalidate_only\030\003 \001(\010\"?\n Creat" +
      "eCampaignExperimentMetadata\022\033\n\023campaign_" +
      "experiment\030\001 \001(\t\"\252\001\n!GraduateCampaignExp" +
      "erimentRequest\022P\n\023campaign_experiment\030\001 " +
      "\001(\tB3\340A\002\372A-\n+googleads.googleapis.com/Ca" +
      "mpaignExperiment\022\034\n\017campaign_budget\030\002 \001(" +
      "\tB\003\340A\002\022\025\n\rvalidate_only\030\003 \001(\010\"@\n\"Graduat" +
      "eCampaignExperimentResponse\022\032\n\022graduated" +
      "_campaign\030\001 \001(\t\"\213\001\n PromoteCampaignExper" +
      "imentRequest\022P\n\023campaign_experiment\030\001 \001(" +
      "\tB3\340A\002\372A-\n+googleads.googleapis.com/Camp" +
      "aignExperiment\022\025\n\rvalidate_only\030\002 \001(\010\"\207\001" +
      "\n\034EndCampaignExperimentRequest\022P\n\023campai" +
      "gn_experiment\030\001 \001(\tB3\340A\002\372A-\n+googleads.g" +
      "oogleapis.com/CampaignExperiment\022\025\n\rvali" +
      "date_only\030\002 \001(\010\"\235\001\n(ListCampaignExperime" +
      "ntAsyncErrorsRequest\022J\n\rresource_name\030\001 " +
      "\001(\tB3\340A\002\372A-\n+googleads.googleapis.com/Ca" +
      "mpaignExperiment\022\022\n\npage_token\030\002 \001(\t\022\021\n\t" +
      "page_size\030\003 \001(\005\"h\n)ListCampaignExperimen" +
      "tAsyncErrorsResponse\022\"\n\006errors\030\001 \003(\0132\022.g" +
      "oogle.rpc.Status\022\027\n\017next_page_token\030\002 \001(" +
      "\t2\347\r\n\031CampaignExperimentService\022\304\002\n\030Crea" +
      "teCampaignExperiment\022B.google.ads.google" +
      "ads.v11.services.CreateCampaignExperimen" +
      "tRequest\032\035.google.longrunning.Operation\"" +
      "\304\001\202\323\344\223\002>\"9/v11/customers/{customer_id=*}" +
      "/campaignExperiments:create:\001*\332A\037custome" +
      "r_id,campaign_experiment\312A[\n\025google.prot" +
      "obuf.Empty\022Bgoogle.ads.googleads.v11.ser" +
      "vices.CreateCampaignExperimentMetadata\022\205" +
      "\002\n\031MutateCampaignExperiments\022C.google.ad" +
      "s.googleads.v11.services.MutateCampaignE" +
      "xperimentsRequest\032D.google.ads.googleads" +
      ".v11.services.MutateCampaignExperimentsR" +
      "esponse\"]\202\323\344\223\002>\"9/v11/customers/{custome" +
      "r_id=*}/campaignExperiments:mutate:\001*\332A\026" +
      "customer_id,operations\022\241\002\n\032GraduateCampa" +
      "ignExperiment\022D.google.ads.googleads.v11" +
      ".services.GraduateCampaignExperimentRequ" +
      "est\032E.google.ads.googleads.v11.services." +
      "GraduateCampaignExperimentResponse\"v\202\323\344\223" +
      "\002J\"E/v11/{campaign_experiment=customers/" +
      "*/campaignExperiments/*}:graduate:\001*\332A#c" +
      "ampaign_experiment,campaign_budget\022\230\002\n\031P" +
      "romoteCampaignExperiment\022C.google.ads.go" +
      "ogleads.v11.services.PromoteCampaignExpe" +
      "rimentRequest\032\035.google.longrunning.Opera" +
      "tion\"\226\001\202\323\344\223\002I\"D/v11/{campaign_experiment" +
      "=customers/*/campaignExperiments/*}:prom" +
      "ote:\001*\332A\023campaign_experiment\312A.\n\025google." +
      "protobuf.Empty\022\025google.protobuf.Empty\022\323\001" +
      "\n\025EndCampaignExperiment\022?.google.ads.goo" +
      "gleads.v11.services.EndCampaignExperimen" +
      "tRequest\032\026.google.protobuf.Empty\"a\202\323\344\223\002E" +
      "\"@/v11/{campaign_experiment=customers/*/" +
      "campaignExperiments/*}:end:\001*\332A\023campaign" +
      "_experiment\022\236\002\n!ListCampaignExperimentAs" +
      "yncErrors\022K.google.ads.googleads.v11.ser" +
      "vices.ListCampaignExperimentAsyncErrorsR" +
      "equest\032L.google.ads.googleads.v11.servic" +
      "es.ListCampaignExperimentAsyncErrorsResp" +
      "onse\"^\202\323\344\223\002H\022F/v11/{resource_name=custom" +
      "ers/*/campaignExperiments/*}:listAsyncEr" +
      "rors\332A\rresource_name\032E\312A\030googleads.googl" +
      "eapis.com\322A\'https://www.googleapis.com/a" +
      "uth/adwordsB\212\002\n%com.google.ads.googleads" +
      ".v11.servicesB\036CampaignExperimentService" +
      "ProtoP\001ZIgoogle.golang.org/genproto/goog" +
      "leapis/ads/googleads/v11/services;servic" +
      "es\242\002\003GAA\252\002!Google.Ads.GoogleAds.V11.Serv" +
      "ices\312\002!Google\\Ads\\GoogleAds\\V11\\Services" +
      "\352\002%Google::Ads::GoogleAds::V11::Services" +
      "b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v11.enums.ResponseContentTypeProto.getDescriptor(),
          com.google.ads.googleads.v11.resources.CampaignExperimentProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.longrunning.OperationsProto.getDescriptor(),
          com.google.protobuf.EmptyProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v11_services_MutateCampaignExperimentsRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v11_services_MutateCampaignExperimentsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v11_services_MutateCampaignExperimentsRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Operations", "PartialFailure", "ValidateOnly", "ResponseContentType", });
    internal_static_google_ads_googleads_v11_services_CampaignExperimentOperation_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v11_services_CampaignExperimentOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v11_services_CampaignExperimentOperation_descriptor,
        new java.lang.String[] { "UpdateMask", "Update", "Remove", "Operation", });
    internal_static_google_ads_googleads_v11_services_MutateCampaignExperimentsResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v11_services_MutateCampaignExperimentsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v11_services_MutateCampaignExperimentsResponse_descriptor,
        new java.lang.String[] { "PartialFailureError", "Results", });
    internal_static_google_ads_googleads_v11_services_MutateCampaignExperimentResult_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v11_services_MutateCampaignExperimentResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v11_services_MutateCampaignExperimentResult_descriptor,
        new java.lang.String[] { "ResourceName", "CampaignExperiment", });
    internal_static_google_ads_googleads_v11_services_CreateCampaignExperimentRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_ads_googleads_v11_services_CreateCampaignExperimentRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v11_services_CreateCampaignExperimentRequest_descriptor,
        new java.lang.String[] { "CustomerId", "CampaignExperiment", "ValidateOnly", });
    internal_static_google_ads_googleads_v11_services_CreateCampaignExperimentMetadata_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_ads_googleads_v11_services_CreateCampaignExperimentMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v11_services_CreateCampaignExperimentMetadata_descriptor,
        new java.lang.String[] { "CampaignExperiment", });
    internal_static_google_ads_googleads_v11_services_GraduateCampaignExperimentRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_ads_googleads_v11_services_GraduateCampaignExperimentRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v11_services_GraduateCampaignExperimentRequest_descriptor,
        new java.lang.String[] { "CampaignExperiment", "CampaignBudget", "ValidateOnly", });
    internal_static_google_ads_googleads_v11_services_GraduateCampaignExperimentResponse_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_google_ads_googleads_v11_services_GraduateCampaignExperimentResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v11_services_GraduateCampaignExperimentResponse_descriptor,
        new java.lang.String[] { "GraduatedCampaign", });
    internal_static_google_ads_googleads_v11_services_PromoteCampaignExperimentRequest_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_google_ads_googleads_v11_services_PromoteCampaignExperimentRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v11_services_PromoteCampaignExperimentRequest_descriptor,
        new java.lang.String[] { "CampaignExperiment", "ValidateOnly", });
    internal_static_google_ads_googleads_v11_services_EndCampaignExperimentRequest_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_google_ads_googleads_v11_services_EndCampaignExperimentRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v11_services_EndCampaignExperimentRequest_descriptor,
        new java.lang.String[] { "CampaignExperiment", "ValidateOnly", });
    internal_static_google_ads_googleads_v11_services_ListCampaignExperimentAsyncErrorsRequest_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_google_ads_googleads_v11_services_ListCampaignExperimentAsyncErrorsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v11_services_ListCampaignExperimentAsyncErrorsRequest_descriptor,
        new java.lang.String[] { "ResourceName", "PageToken", "PageSize", });
    internal_static_google_ads_googleads_v11_services_ListCampaignExperimentAsyncErrorsResponse_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_google_ads_googleads_v11_services_ListCampaignExperimentAsyncErrorsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v11_services_ListCampaignExperimentAsyncErrorsResponse_descriptor,
        new java.lang.String[] { "Errors", "NextPageToken", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resourceReference);
    registry.add(com.google.longrunning.OperationsProto.operationInfo);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v11.enums.ResponseContentTypeProto.getDescriptor();
    com.google.ads.googleads.v11.resources.CampaignExperimentProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
