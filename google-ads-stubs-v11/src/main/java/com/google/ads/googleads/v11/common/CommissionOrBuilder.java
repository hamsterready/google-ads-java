// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v11/common/bidding.proto

package com.google.ads.googleads.v11.common;

public interface CommissionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v11.common.Commission)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Commission rate defines the portion of the conversion value that the
   * advertiser will be billed. A commission rate of x should be passed into
   * this field as (x * 1,000,000). For example, 106,000 represents a commission
   * rate of 0.106 (10.6%).
   * </pre>
   *
   * <code>optional int64 commission_rate_micros = 2;</code>
   * @return Whether the commissionRateMicros field is set.
   */
  boolean hasCommissionRateMicros();
  /**
   * <pre>
   * Commission rate defines the portion of the conversion value that the
   * advertiser will be billed. A commission rate of x should be passed into
   * this field as (x * 1,000,000). For example, 106,000 represents a commission
   * rate of 0.106 (10.6%).
   * </pre>
   *
   * <code>optional int64 commission_rate_micros = 2;</code>
   * @return The commissionRateMicros.
   */
  long getCommissionRateMicros();
}
