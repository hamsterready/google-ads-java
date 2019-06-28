// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v2/services/customer_service.proto

package com.google.ads.googleads.v2.services;

public interface CreateCustomerClientRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v2.services.CreateCustomerClientRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The ID of the Manager under whom client customer is being created.
   * </pre>
   *
   * <code>string customer_id = 1;</code>
   */
  java.lang.String getCustomerId();
  /**
   * <pre>
   * The ID of the Manager under whom client customer is being created.
   * </pre>
   *
   * <code>string customer_id = 1;</code>
   */
  com.google.protobuf.ByteString
      getCustomerIdBytes();

  /**
   * <pre>
   * The new client customer to create. The resource name on this customer
   * will be ignored.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.resources.Customer customer_client = 2;</code>
   */
  boolean hasCustomerClient();
  /**
   * <pre>
   * The new client customer to create. The resource name on this customer
   * will be ignored.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.resources.Customer customer_client = 2;</code>
   */
  com.google.ads.googleads.v2.resources.Customer getCustomerClient();
  /**
   * <pre>
   * The new client customer to create. The resource name on this customer
   * will be ignored.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.resources.Customer customer_client = 2;</code>
   */
  com.google.ads.googleads.v2.resources.CustomerOrBuilder getCustomerClientOrBuilder();

  /**
   * <pre>
   * Email address of the user who should be invited on the created client
   * customer. Accessible to whitelisted customers only.
   * </pre>
   *
   * <code>.google.protobuf.StringValue email_address = 3;</code>
   */
  boolean hasEmailAddress();
  /**
   * <pre>
   * Email address of the user who should be invited on the created client
   * customer. Accessible to whitelisted customers only.
   * </pre>
   *
   * <code>.google.protobuf.StringValue email_address = 3;</code>
   */
  com.google.protobuf.StringValue getEmailAddress();
  /**
   * <pre>
   * Email address of the user who should be invited on the created client
   * customer. Accessible to whitelisted customers only.
   * </pre>
   *
   * <code>.google.protobuf.StringValue email_address = 3;</code>
   */
  com.google.protobuf.StringValueOrBuilder getEmailAddressOrBuilder();

  /**
   * <pre>
   * The proposed role of user on the created client customer.
   * Accessible to whitelisted customers only.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.enums.AccessRoleEnum.AccessRole access_role = 4;</code>
   */
  int getAccessRoleValue();
  /**
   * <pre>
   * The proposed role of user on the created client customer.
   * Accessible to whitelisted customers only.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.enums.AccessRoleEnum.AccessRole access_role = 4;</code>
   */
  com.google.ads.googleads.v2.enums.AccessRoleEnum.AccessRole getAccessRole();
}