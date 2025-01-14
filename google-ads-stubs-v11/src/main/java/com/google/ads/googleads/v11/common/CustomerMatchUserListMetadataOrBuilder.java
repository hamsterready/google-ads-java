// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v11/common/offline_user_data.proto

package com.google.ads.googleads.v11.common;

public interface CustomerMatchUserListMetadataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v11.common.CustomerMatchUserListMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The resource name of remarketing list to update data.
   * Required for job of CUSTOMER_MATCH_USER_LIST type.
   * </pre>
   *
   * <code>optional string user_list = 2;</code>
   * @return Whether the userList field is set.
   */
  boolean hasUserList();
  /**
   * <pre>
   * The resource name of remarketing list to update data.
   * Required for job of CUSTOMER_MATCH_USER_LIST type.
   * </pre>
   *
   * <code>optional string user_list = 2;</code>
   * @return The userList.
   */
  java.lang.String getUserList();
  /**
   * <pre>
   * The resource name of remarketing list to update data.
   * Required for job of CUSTOMER_MATCH_USER_LIST type.
   * </pre>
   *
   * <code>optional string user_list = 2;</code>
   * @return The bytes for userList.
   */
  com.google.protobuf.ByteString
      getUserListBytes();
}
