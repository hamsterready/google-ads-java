// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v3/common/bidding.proto

package com.google.ads.googleads.v3.common;

public interface TargetImpressionShareOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v3.common.TargetImpressionShare)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The targeted location on the search results page.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.enums.TargetImpressionShareLocationEnum.TargetImpressionShareLocation location = 1;</code>
   */
  int getLocationValue();
  /**
   * <pre>
   * The targeted location on the search results page.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.enums.TargetImpressionShareLocationEnum.TargetImpressionShareLocation location = 1;</code>
   */
  com.google.ads.googleads.v3.enums.TargetImpressionShareLocationEnum.TargetImpressionShareLocation getLocation();

  /**
   * <pre>
   * The desired fraction of ads to be shown in the targeted location in micros.
   * E.g. 1% equals 10,000.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value location_fraction_micros = 2;</code>
   */
  boolean hasLocationFractionMicros();
  /**
   * <pre>
   * The desired fraction of ads to be shown in the targeted location in micros.
   * E.g. 1% equals 10,000.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value location_fraction_micros = 2;</code>
   */
  com.google.protobuf.Int64Value getLocationFractionMicros();
  /**
   * <pre>
   * The desired fraction of ads to be shown in the targeted location in micros.
   * E.g. 1% equals 10,000.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value location_fraction_micros = 2;</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getLocationFractionMicrosOrBuilder();

  /**
   * <pre>
   * The highest CPC bid the automated bidding system is permitted to specify.
   * This is a required field entered by the advertiser that sets the ceiling
   * and specified in local micros.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value cpc_bid_ceiling_micros = 3;</code>
   */
  boolean hasCpcBidCeilingMicros();
  /**
   * <pre>
   * The highest CPC bid the automated bidding system is permitted to specify.
   * This is a required field entered by the advertiser that sets the ceiling
   * and specified in local micros.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value cpc_bid_ceiling_micros = 3;</code>
   */
  com.google.protobuf.Int64Value getCpcBidCeilingMicros();
  /**
   * <pre>
   * The highest CPC bid the automated bidding system is permitted to specify.
   * This is a required field entered by the advertiser that sets the ceiling
   * and specified in local micros.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value cpc_bid_ceiling_micros = 3;</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getCpcBidCeilingMicrosOrBuilder();
}
