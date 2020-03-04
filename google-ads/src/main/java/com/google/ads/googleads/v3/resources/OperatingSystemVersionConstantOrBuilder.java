// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v3/resources/operating_system_version_constant.proto

package com.google.ads.googleads.v3.resources;

public interface OperatingSystemVersionConstantOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v3.resources.OperatingSystemVersionConstant)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The resource name of the operating system version constant.
   * Operating system version constant resource names have the form:
   * `operatingSystemVersionConstants/{criterion_id}`
   * </pre>
   *
   * <code>string resource_name = 1;</code>
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * The resource name of the operating system version constant.
   * Operating system version constant resource names have the form:
   * `operatingSystemVersionConstants/{criterion_id}`
   * </pre>
   *
   * <code>string resource_name = 1;</code>
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * The ID of the operating system version.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value id = 2;</code>
   */
  boolean hasId();
  /**
   * <pre>
   * The ID of the operating system version.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value id = 2;</code>
   */
  com.google.protobuf.Int64Value getId();
  /**
   * <pre>
   * The ID of the operating system version.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value id = 2;</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getIdOrBuilder();

  /**
   * <pre>
   * Name of the operating system.
   * </pre>
   *
   * <code>.google.protobuf.StringValue name = 3;</code>
   */
  boolean hasName();
  /**
   * <pre>
   * Name of the operating system.
   * </pre>
   *
   * <code>.google.protobuf.StringValue name = 3;</code>
   */
  com.google.protobuf.StringValue getName();
  /**
   * <pre>
   * Name of the operating system.
   * </pre>
   *
   * <code>.google.protobuf.StringValue name = 3;</code>
   */
  com.google.protobuf.StringValueOrBuilder getNameOrBuilder();

  /**
   * <pre>
   * The OS Major Version number.
   * </pre>
   *
   * <code>.google.protobuf.Int32Value os_major_version = 4;</code>
   */
  boolean hasOsMajorVersion();
  /**
   * <pre>
   * The OS Major Version number.
   * </pre>
   *
   * <code>.google.protobuf.Int32Value os_major_version = 4;</code>
   */
  com.google.protobuf.Int32Value getOsMajorVersion();
  /**
   * <pre>
   * The OS Major Version number.
   * </pre>
   *
   * <code>.google.protobuf.Int32Value os_major_version = 4;</code>
   */
  com.google.protobuf.Int32ValueOrBuilder getOsMajorVersionOrBuilder();

  /**
   * <pre>
   * The OS Minor Version number.
   * </pre>
   *
   * <code>.google.protobuf.Int32Value os_minor_version = 5;</code>
   */
  boolean hasOsMinorVersion();
  /**
   * <pre>
   * The OS Minor Version number.
   * </pre>
   *
   * <code>.google.protobuf.Int32Value os_minor_version = 5;</code>
   */
  com.google.protobuf.Int32Value getOsMinorVersion();
  /**
   * <pre>
   * The OS Minor Version number.
   * </pre>
   *
   * <code>.google.protobuf.Int32Value os_minor_version = 5;</code>
   */
  com.google.protobuf.Int32ValueOrBuilder getOsMinorVersionOrBuilder();

  /**
   * <pre>
   * Determines whether this constant represents a single version or a range of
   * versions.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.enums.OperatingSystemVersionOperatorTypeEnum.OperatingSystemVersionOperatorType operator_type = 6;</code>
   */
  int getOperatorTypeValue();
  /**
   * <pre>
   * Determines whether this constant represents a single version or a range of
   * versions.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.enums.OperatingSystemVersionOperatorTypeEnum.OperatingSystemVersionOperatorType operator_type = 6;</code>
   */
  com.google.ads.googleads.v3.enums.OperatingSystemVersionOperatorTypeEnum.OperatingSystemVersionOperatorType getOperatorType();
}
