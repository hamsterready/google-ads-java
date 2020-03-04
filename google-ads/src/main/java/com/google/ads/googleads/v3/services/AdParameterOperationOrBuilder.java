// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v3/services/ad_parameter_service.proto

package com.google.ads.googleads.v3.services;

public interface AdParameterOperationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v3.services.AdParameterOperation)
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
   * Create operation: No resource name is expected for the new ad parameter.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.resources.AdParameter create = 1;</code>
   */
  boolean hasCreate();
  /**
   * <pre>
   * Create operation: No resource name is expected for the new ad parameter.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.resources.AdParameter create = 1;</code>
   */
  com.google.ads.googleads.v3.resources.AdParameter getCreate();
  /**
   * <pre>
   * Create operation: No resource name is expected for the new ad parameter.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.resources.AdParameter create = 1;</code>
   */
  com.google.ads.googleads.v3.resources.AdParameterOrBuilder getCreateOrBuilder();

  /**
   * <pre>
   * Update operation: The ad parameter is expected to have a valid resource
   * name.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.resources.AdParameter update = 2;</code>
   */
  boolean hasUpdate();
  /**
   * <pre>
   * Update operation: The ad parameter is expected to have a valid resource
   * name.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.resources.AdParameter update = 2;</code>
   */
  com.google.ads.googleads.v3.resources.AdParameter getUpdate();
  /**
   * <pre>
   * Update operation: The ad parameter is expected to have a valid resource
   * name.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.resources.AdParameter update = 2;</code>
   */
  com.google.ads.googleads.v3.resources.AdParameterOrBuilder getUpdateOrBuilder();

  /**
   * <pre>
   * Remove operation: A resource name for the ad parameter to remove is
   * expected in this format:
   * `customers/{customer_id}/adParameters/{ad_group_id}~{criterion_id}~{parameter_index}`
   * </pre>
   *
   * <code>string remove = 3;</code>
   */
  java.lang.String getRemove();
  /**
   * <pre>
   * Remove operation: A resource name for the ad parameter to remove is
   * expected in this format:
   * `customers/{customer_id}/adParameters/{ad_group_id}~{criterion_id}~{parameter_index}`
   * </pre>
   *
   * <code>string remove = 3;</code>
   */
  com.google.protobuf.ByteString
      getRemoveBytes();

  public com.google.ads.googleads.v3.services.AdParameterOperation.OperationCase getOperationCase();
}
