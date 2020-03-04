// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v3/services/campaign_extension_setting_service.proto

package com.google.ads.googleads.v3.services;

public interface CampaignExtensionSettingOperationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v3.services.CampaignExtensionSettingOperation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * FieldMask that determines which resource fields are modified in an update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 4;</code>
   */
  boolean hasUpdateMask();
  /**
   * <pre>
   * FieldMask that determines which resource fields are modified in an update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 4;</code>
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   * <pre>
   * FieldMask that determines which resource fields are modified in an update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 4;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();

  /**
   * <pre>
   * Create operation: No resource name is expected for the new campaign
   * extension setting.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.resources.CampaignExtensionSetting create = 1;</code>
   */
  boolean hasCreate();
  /**
   * <pre>
   * Create operation: No resource name is expected for the new campaign
   * extension setting.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.resources.CampaignExtensionSetting create = 1;</code>
   */
  com.google.ads.googleads.v3.resources.CampaignExtensionSetting getCreate();
  /**
   * <pre>
   * Create operation: No resource name is expected for the new campaign
   * extension setting.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.resources.CampaignExtensionSetting create = 1;</code>
   */
  com.google.ads.googleads.v3.resources.CampaignExtensionSettingOrBuilder getCreateOrBuilder();

  /**
   * <pre>
   * Update operation: The campaign extension setting is expected to have a
   * valid resource name.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.resources.CampaignExtensionSetting update = 2;</code>
   */
  boolean hasUpdate();
  /**
   * <pre>
   * Update operation: The campaign extension setting is expected to have a
   * valid resource name.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.resources.CampaignExtensionSetting update = 2;</code>
   */
  com.google.ads.googleads.v3.resources.CampaignExtensionSetting getUpdate();
  /**
   * <pre>
   * Update operation: The campaign extension setting is expected to have a
   * valid resource name.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.resources.CampaignExtensionSetting update = 2;</code>
   */
  com.google.ads.googleads.v3.resources.CampaignExtensionSettingOrBuilder getUpdateOrBuilder();

  /**
   * <pre>
   * Remove operation: A resource name for the removed campaign extension
   * setting is expected, in this format:
   * `customers/{customer_id}/campaignExtensionSettings/{campaign_id}~{extension_type}`
   * </pre>
   *
   * <code>string remove = 3;</code>
   */
  java.lang.String getRemove();
  /**
   * <pre>
   * Remove operation: A resource name for the removed campaign extension
   * setting is expected, in this format:
   * `customers/{customer_id}/campaignExtensionSettings/{campaign_id}~{extension_type}`
   * </pre>
   *
   * <code>string remove = 3;</code>
   */
  com.google.protobuf.ByteString
      getRemoveBytes();

  public com.google.ads.googleads.v3.services.CampaignExtensionSettingOperation.OperationCase getOperationCase();
}
