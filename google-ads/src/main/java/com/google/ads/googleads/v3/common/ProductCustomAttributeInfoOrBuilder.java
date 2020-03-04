// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v3/common/criteria.proto

package com.google.ads.googleads.v3.common;

public interface ProductCustomAttributeInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v3.common.ProductCustomAttributeInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * String value of the product custom attribute.
   * </pre>
   *
   * <code>.google.protobuf.StringValue value = 1;</code>
   */
  boolean hasValue();
  /**
   * <pre>
   * String value of the product custom attribute.
   * </pre>
   *
   * <code>.google.protobuf.StringValue value = 1;</code>
   */
  com.google.protobuf.StringValue getValue();
  /**
   * <pre>
   * String value of the product custom attribute.
   * </pre>
   *
   * <code>.google.protobuf.StringValue value = 1;</code>
   */
  com.google.protobuf.StringValueOrBuilder getValueOrBuilder();

  /**
   * <pre>
   * Indicates the index of the custom attribute.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.enums.ProductCustomAttributeIndexEnum.ProductCustomAttributeIndex index = 2;</code>
   */
  int getIndexValue();
  /**
   * <pre>
   * Indicates the index of the custom attribute.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.enums.ProductCustomAttributeIndexEnum.ProductCustomAttributeIndex index = 2;</code>
   */
  com.google.ads.googleads.v3.enums.ProductCustomAttributeIndexEnum.ProductCustomAttributeIndex getIndex();
}
