// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v3/resources/keyword_plan_campaign.proto

package com.google.ads.googleads.v3.resources;

/**
 * <pre>
 * A geo target.
 * Next ID: 3
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v3.resources.KeywordPlanGeoTarget}
 */
public  final class KeywordPlanGeoTarget extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v3.resources.KeywordPlanGeoTarget)
    KeywordPlanGeoTargetOrBuilder {
private static final long serialVersionUID = 0L;
  // Use KeywordPlanGeoTarget.newBuilder() to construct.
  private KeywordPlanGeoTarget(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private KeywordPlanGeoTarget() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private KeywordPlanGeoTarget(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            com.google.protobuf.StringValue.Builder subBuilder = null;
            if (geoTargetConstant_ != null) {
              subBuilder = geoTargetConstant_.toBuilder();
            }
            geoTargetConstant_ = input.readMessage(com.google.protobuf.StringValue.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(geoTargetConstant_);
              geoTargetConstant_ = subBuilder.buildPartial();
            }

            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v3.resources.KeywordPlanCampaignProto.internal_static_google_ads_googleads_v3_resources_KeywordPlanGeoTarget_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v3.resources.KeywordPlanCampaignProto.internal_static_google_ads_googleads_v3_resources_KeywordPlanGeoTarget_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v3.resources.KeywordPlanGeoTarget.class, com.google.ads.googleads.v3.resources.KeywordPlanGeoTarget.Builder.class);
  }

  public static final int GEO_TARGET_CONSTANT_FIELD_NUMBER = 1;
  private com.google.protobuf.StringValue geoTargetConstant_;
  /**
   * <pre>
   * Required. The resource name of the geo target.
   * </pre>
   *
   * <code>.google.protobuf.StringValue geo_target_constant = 1;</code>
   */
  public boolean hasGeoTargetConstant() {
    return geoTargetConstant_ != null;
  }
  /**
   * <pre>
   * Required. The resource name of the geo target.
   * </pre>
   *
   * <code>.google.protobuf.StringValue geo_target_constant = 1;</code>
   */
  public com.google.protobuf.StringValue getGeoTargetConstant() {
    return geoTargetConstant_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : geoTargetConstant_;
  }
  /**
   * <pre>
   * Required. The resource name of the geo target.
   * </pre>
   *
   * <code>.google.protobuf.StringValue geo_target_constant = 1;</code>
   */
  public com.google.protobuf.StringValueOrBuilder getGeoTargetConstantOrBuilder() {
    return getGeoTargetConstant();
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (geoTargetConstant_ != null) {
      output.writeMessage(1, getGeoTargetConstant());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (geoTargetConstant_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getGeoTargetConstant());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.ads.googleads.v3.resources.KeywordPlanGeoTarget)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v3.resources.KeywordPlanGeoTarget other = (com.google.ads.googleads.v3.resources.KeywordPlanGeoTarget) obj;

    if (hasGeoTargetConstant() != other.hasGeoTargetConstant()) return false;
    if (hasGeoTargetConstant()) {
      if (!getGeoTargetConstant()
          .equals(other.getGeoTargetConstant())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasGeoTargetConstant()) {
      hash = (37 * hash) + GEO_TARGET_CONSTANT_FIELD_NUMBER;
      hash = (53 * hash) + getGeoTargetConstant().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v3.resources.KeywordPlanGeoTarget parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v3.resources.KeywordPlanGeoTarget parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v3.resources.KeywordPlanGeoTarget parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v3.resources.KeywordPlanGeoTarget parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v3.resources.KeywordPlanGeoTarget parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v3.resources.KeywordPlanGeoTarget parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v3.resources.KeywordPlanGeoTarget parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v3.resources.KeywordPlanGeoTarget parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v3.resources.KeywordPlanGeoTarget parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v3.resources.KeywordPlanGeoTarget parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v3.resources.KeywordPlanGeoTarget parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v3.resources.KeywordPlanGeoTarget parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.ads.googleads.v3.resources.KeywordPlanGeoTarget prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * A geo target.
   * Next ID: 3
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v3.resources.KeywordPlanGeoTarget}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v3.resources.KeywordPlanGeoTarget)
      com.google.ads.googleads.v3.resources.KeywordPlanGeoTargetOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v3.resources.KeywordPlanCampaignProto.internal_static_google_ads_googleads_v3_resources_KeywordPlanGeoTarget_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v3.resources.KeywordPlanCampaignProto.internal_static_google_ads_googleads_v3_resources_KeywordPlanGeoTarget_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v3.resources.KeywordPlanGeoTarget.class, com.google.ads.googleads.v3.resources.KeywordPlanGeoTarget.Builder.class);
    }

    // Construct using com.google.ads.googleads.v3.resources.KeywordPlanGeoTarget.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (geoTargetConstantBuilder_ == null) {
        geoTargetConstant_ = null;
      } else {
        geoTargetConstant_ = null;
        geoTargetConstantBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v3.resources.KeywordPlanCampaignProto.internal_static_google_ads_googleads_v3_resources_KeywordPlanGeoTarget_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v3.resources.KeywordPlanGeoTarget getDefaultInstanceForType() {
      return com.google.ads.googleads.v3.resources.KeywordPlanGeoTarget.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v3.resources.KeywordPlanGeoTarget build() {
      com.google.ads.googleads.v3.resources.KeywordPlanGeoTarget result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v3.resources.KeywordPlanGeoTarget buildPartial() {
      com.google.ads.googleads.v3.resources.KeywordPlanGeoTarget result = new com.google.ads.googleads.v3.resources.KeywordPlanGeoTarget(this);
      if (geoTargetConstantBuilder_ == null) {
        result.geoTargetConstant_ = geoTargetConstant_;
      } else {
        result.geoTargetConstant_ = geoTargetConstantBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.ads.googleads.v3.resources.KeywordPlanGeoTarget) {
        return mergeFrom((com.google.ads.googleads.v3.resources.KeywordPlanGeoTarget)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v3.resources.KeywordPlanGeoTarget other) {
      if (other == com.google.ads.googleads.v3.resources.KeywordPlanGeoTarget.getDefaultInstance()) return this;
      if (other.hasGeoTargetConstant()) {
        mergeGeoTargetConstant(other.getGeoTargetConstant());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.ads.googleads.v3.resources.KeywordPlanGeoTarget parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v3.resources.KeywordPlanGeoTarget) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.protobuf.StringValue geoTargetConstant_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> geoTargetConstantBuilder_;
    /**
     * <pre>
     * Required. The resource name of the geo target.
     * </pre>
     *
     * <code>.google.protobuf.StringValue geo_target_constant = 1;</code>
     */
    public boolean hasGeoTargetConstant() {
      return geoTargetConstantBuilder_ != null || geoTargetConstant_ != null;
    }
    /**
     * <pre>
     * Required. The resource name of the geo target.
     * </pre>
     *
     * <code>.google.protobuf.StringValue geo_target_constant = 1;</code>
     */
    public com.google.protobuf.StringValue getGeoTargetConstant() {
      if (geoTargetConstantBuilder_ == null) {
        return geoTargetConstant_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : geoTargetConstant_;
      } else {
        return geoTargetConstantBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required. The resource name of the geo target.
     * </pre>
     *
     * <code>.google.protobuf.StringValue geo_target_constant = 1;</code>
     */
    public Builder setGeoTargetConstant(com.google.protobuf.StringValue value) {
      if (geoTargetConstantBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        geoTargetConstant_ = value;
        onChanged();
      } else {
        geoTargetConstantBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Required. The resource name of the geo target.
     * </pre>
     *
     * <code>.google.protobuf.StringValue geo_target_constant = 1;</code>
     */
    public Builder setGeoTargetConstant(
        com.google.protobuf.StringValue.Builder builderForValue) {
      if (geoTargetConstantBuilder_ == null) {
        geoTargetConstant_ = builderForValue.build();
        onChanged();
      } else {
        geoTargetConstantBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Required. The resource name of the geo target.
     * </pre>
     *
     * <code>.google.protobuf.StringValue geo_target_constant = 1;</code>
     */
    public Builder mergeGeoTargetConstant(com.google.protobuf.StringValue value) {
      if (geoTargetConstantBuilder_ == null) {
        if (geoTargetConstant_ != null) {
          geoTargetConstant_ =
            com.google.protobuf.StringValue.newBuilder(geoTargetConstant_).mergeFrom(value).buildPartial();
        } else {
          geoTargetConstant_ = value;
        }
        onChanged();
      } else {
        geoTargetConstantBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Required. The resource name of the geo target.
     * </pre>
     *
     * <code>.google.protobuf.StringValue geo_target_constant = 1;</code>
     */
    public Builder clearGeoTargetConstant() {
      if (geoTargetConstantBuilder_ == null) {
        geoTargetConstant_ = null;
        onChanged();
      } else {
        geoTargetConstant_ = null;
        geoTargetConstantBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Required. The resource name of the geo target.
     * </pre>
     *
     * <code>.google.protobuf.StringValue geo_target_constant = 1;</code>
     */
    public com.google.protobuf.StringValue.Builder getGeoTargetConstantBuilder() {
      
      onChanged();
      return getGeoTargetConstantFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. The resource name of the geo target.
     * </pre>
     *
     * <code>.google.protobuf.StringValue geo_target_constant = 1;</code>
     */
    public com.google.protobuf.StringValueOrBuilder getGeoTargetConstantOrBuilder() {
      if (geoTargetConstantBuilder_ != null) {
        return geoTargetConstantBuilder_.getMessageOrBuilder();
      } else {
        return geoTargetConstant_ == null ?
            com.google.protobuf.StringValue.getDefaultInstance() : geoTargetConstant_;
      }
    }
    /**
     * <pre>
     * Required. The resource name of the geo target.
     * </pre>
     *
     * <code>.google.protobuf.StringValue geo_target_constant = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> 
        getGeoTargetConstantFieldBuilder() {
      if (geoTargetConstantBuilder_ == null) {
        geoTargetConstantBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder>(
                getGeoTargetConstant(),
                getParentForChildren(),
                isClean());
        geoTargetConstant_ = null;
      }
      return geoTargetConstantBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v3.resources.KeywordPlanGeoTarget)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v3.resources.KeywordPlanGeoTarget)
  private static final com.google.ads.googleads.v3.resources.KeywordPlanGeoTarget DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v3.resources.KeywordPlanGeoTarget();
  }

  public static com.google.ads.googleads.v3.resources.KeywordPlanGeoTarget getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<KeywordPlanGeoTarget>
      PARSER = new com.google.protobuf.AbstractParser<KeywordPlanGeoTarget>() {
    @java.lang.Override
    public KeywordPlanGeoTarget parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new KeywordPlanGeoTarget(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<KeywordPlanGeoTarget> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<KeywordPlanGeoTarget> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v3.resources.KeywordPlanGeoTarget getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

