// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v3/errors/invoice_error.proto

package com.google.ads.googleads.v3.errors;

public final class InvoiceErrorProto {
  private InvoiceErrorProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v3_errors_InvoiceErrorEnum_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v3_errors_InvoiceErrorEnum_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n2google/ads/googleads/v3/errors/invoice" +
      "_error.proto\022\036google.ads.googleads.v3.er" +
      "rors\032\034google/api/annotations.proto\"s\n\020In" +
      "voiceErrorEnum\"_\n\014InvoiceError\022\017\n\013UNSPEC" +
      "IFIED\020\000\022\013\n\007UNKNOWN\020\001\022\026\n\022YEAR_MONTH_TOO_O" +
      "LD\020\002\022\031\n\025NOT_INVOICED_CUSTOMER\020\003B\354\001\n\"com." +
      "google.ads.googleads.v3.errorsB\021InvoiceE" +
      "rrorProtoP\001ZDgoogle.golang.org/genproto/" +
      "googleapis/ads/googleads/v3/errors;error" +
      "s\242\002\003GAA\252\002\036Google.Ads.GoogleAds.V3.Errors" +
      "\312\002\036Google\\Ads\\GoogleAds\\V3\\Errors\352\002\"Goog" +
      "le::Ads::GoogleAds::V3::Errorsb\006proto3"
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
    internal_static_google_ads_googleads_v3_errors_InvoiceErrorEnum_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v3_errors_InvoiceErrorEnum_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v3_errors_InvoiceErrorEnum_descriptor,
        new java.lang.String[] { });
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
