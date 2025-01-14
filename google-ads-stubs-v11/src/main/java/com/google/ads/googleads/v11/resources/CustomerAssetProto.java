// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v11/resources/customer_asset.proto

package com.google.ads.googleads.v11.resources;

public final class CustomerAssetProto {
  private CustomerAssetProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v11_resources_CustomerAsset_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v11_resources_CustomerAsset_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n7google/ads/googleads/v11/resources/cus" +
      "tomer_asset.proto\022\"google.ads.googleads." +
      "v11.resources\0325google/ads/googleads/v11/" +
      "enums/asset_field_type.proto\0326google/ads" +
      "/googleads/v11/enums/asset_link_status.p" +
      "roto\0321google/ads/googleads/v11/enums/ass" +
      "et_source.proto\032\037google/api/field_behavi" +
      "or.proto\032\031google/api/resource.proto\"\203\004\n\r" +
      "CustomerAsset\022E\n\rresource_name\030\001 \001(\tB.\340A" +
      "\005\372A(\n&googleads.googleapis.com/CustomerA" +
      "sset\0228\n\005asset\030\002 \001(\tB)\340A\002\340A\005\372A \n\036googlead" +
      "s.googleapis.com/Asset\022]\n\nfield_type\030\003 \001" +
      "(\0162A.google.ads.googleads.v11.enums.Asse" +
      "tFieldTypeEnum.AssetFieldTypeB\006\340A\002\340A\005\022P\n" +
      "\006source\030\005 \001(\0162;.google.ads.googleads.v11" +
      ".enums.AssetSourceEnum.AssetSourceB\003\340A\003\022" +
      "S\n\006status\030\004 \001(\0162C.google.ads.googleads.v" +
      "11.enums.AssetLinkStatusEnum.AssetLinkSt" +
      "atus:k\352Ah\n&googleads.googleapis.com/Cust" +
      "omerAsset\022>customers/{customer_id}/custo" +
      "merAssets/{asset_id}~{field_type}B\204\002\n&co" +
      "m.google.ads.googleads.v11.resourcesB\022Cu" +
      "stomerAssetProtoP\001ZKgoogle.golang.org/ge" +
      "nproto/googleapis/ads/googleads/v11/reso" +
      "urces;resources\242\002\003GAA\252\002\"Google.Ads.Googl" +
      "eAds.V11.Resources\312\002\"Google\\Ads\\GoogleAd" +
      "s\\V11\\Resources\352\002&Google::Ads::GoogleAds" +
      "::V11::Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v11.enums.AssetFieldTypeProto.getDescriptor(),
          com.google.ads.googleads.v11.enums.AssetLinkStatusProto.getDescriptor(),
          com.google.ads.googleads.v11.enums.AssetSourceProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v11_resources_CustomerAsset_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v11_resources_CustomerAsset_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v11_resources_CustomerAsset_descriptor,
        new java.lang.String[] { "ResourceName", "Asset", "FieldType", "Source", "Status", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v11.enums.AssetFieldTypeProto.getDescriptor();
    com.google.ads.googleads.v11.enums.AssetLinkStatusProto.getDescriptor();
    com.google.ads.googleads.v11.enums.AssetSourceProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
