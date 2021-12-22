// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v8/services/keyword_plan_service.proto

package com.google.ads.googleads.v8.services;

/**
 * <pre>
 * Request message for [KeywordPlanService.GenerateForecastCurve][google.ads.googleads.v8.services.KeywordPlanService.GenerateForecastCurve].
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v8.services.GenerateForecastCurveRequest}
 */
public final class GenerateForecastCurveRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v8.services.GenerateForecastCurveRequest)
    GenerateForecastCurveRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GenerateForecastCurveRequest.newBuilder() to construct.
  private GenerateForecastCurveRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GenerateForecastCurveRequest() {
    keywordPlan_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GenerateForecastCurveRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GenerateForecastCurveRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
            java.lang.String s = input.readStringRequireUtf8();

            keywordPlan_ = s;
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
    return com.google.ads.googleads.v8.services.KeywordPlanServiceProto.internal_static_google_ads_googleads_v8_services_GenerateForecastCurveRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v8.services.KeywordPlanServiceProto.internal_static_google_ads_googleads_v8_services_GenerateForecastCurveRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v8.services.GenerateForecastCurveRequest.class, com.google.ads.googleads.v8.services.GenerateForecastCurveRequest.Builder.class);
  }

  public static final int KEYWORD_PLAN_FIELD_NUMBER = 1;
  private volatile java.lang.Object keywordPlan_;
  /**
   * <pre>
   * Required. The resource name of the keyword plan to be forecasted.
   * </pre>
   *
   * <code>string keyword_plan = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The keywordPlan.
   */
  @java.lang.Override
  public java.lang.String getKeywordPlan() {
    java.lang.Object ref = keywordPlan_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      keywordPlan_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. The resource name of the keyword plan to be forecasted.
   * </pre>
   *
   * <code>string keyword_plan = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for keywordPlan.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getKeywordPlanBytes() {
    java.lang.Object ref = keywordPlan_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      keywordPlan_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(keywordPlan_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, keywordPlan_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(keywordPlan_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, keywordPlan_);
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
    if (!(obj instanceof com.google.ads.googleads.v8.services.GenerateForecastCurveRequest)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v8.services.GenerateForecastCurveRequest other = (com.google.ads.googleads.v8.services.GenerateForecastCurveRequest) obj;

    if (!getKeywordPlan()
        .equals(other.getKeywordPlan())) return false;
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
    hash = (37 * hash) + KEYWORD_PLAN_FIELD_NUMBER;
    hash = (53 * hash) + getKeywordPlan().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v8.services.GenerateForecastCurveRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v8.services.GenerateForecastCurveRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v8.services.GenerateForecastCurveRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v8.services.GenerateForecastCurveRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v8.services.GenerateForecastCurveRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v8.services.GenerateForecastCurveRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v8.services.GenerateForecastCurveRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v8.services.GenerateForecastCurveRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v8.services.GenerateForecastCurveRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v8.services.GenerateForecastCurveRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v8.services.GenerateForecastCurveRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v8.services.GenerateForecastCurveRequest parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v8.services.GenerateForecastCurveRequest prototype) {
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
   * Request message for [KeywordPlanService.GenerateForecastCurve][google.ads.googleads.v8.services.KeywordPlanService.GenerateForecastCurve].
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v8.services.GenerateForecastCurveRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v8.services.GenerateForecastCurveRequest)
      com.google.ads.googleads.v8.services.GenerateForecastCurveRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v8.services.KeywordPlanServiceProto.internal_static_google_ads_googleads_v8_services_GenerateForecastCurveRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v8.services.KeywordPlanServiceProto.internal_static_google_ads_googleads_v8_services_GenerateForecastCurveRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v8.services.GenerateForecastCurveRequest.class, com.google.ads.googleads.v8.services.GenerateForecastCurveRequest.Builder.class);
    }

    // Construct using com.google.ads.googleads.v8.services.GenerateForecastCurveRequest.newBuilder()
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
      keywordPlan_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v8.services.KeywordPlanServiceProto.internal_static_google_ads_googleads_v8_services_GenerateForecastCurveRequest_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v8.services.GenerateForecastCurveRequest getDefaultInstanceForType() {
      return com.google.ads.googleads.v8.services.GenerateForecastCurveRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v8.services.GenerateForecastCurveRequest build() {
      com.google.ads.googleads.v8.services.GenerateForecastCurveRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v8.services.GenerateForecastCurveRequest buildPartial() {
      com.google.ads.googleads.v8.services.GenerateForecastCurveRequest result = new com.google.ads.googleads.v8.services.GenerateForecastCurveRequest(this);
      result.keywordPlan_ = keywordPlan_;
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
      if (other instanceof com.google.ads.googleads.v8.services.GenerateForecastCurveRequest) {
        return mergeFrom((com.google.ads.googleads.v8.services.GenerateForecastCurveRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v8.services.GenerateForecastCurveRequest other) {
      if (other == com.google.ads.googleads.v8.services.GenerateForecastCurveRequest.getDefaultInstance()) return this;
      if (!other.getKeywordPlan().isEmpty()) {
        keywordPlan_ = other.keywordPlan_;
        onChanged();
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
      com.google.ads.googleads.v8.services.GenerateForecastCurveRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v8.services.GenerateForecastCurveRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object keywordPlan_ = "";
    /**
     * <pre>
     * Required. The resource name of the keyword plan to be forecasted.
     * </pre>
     *
     * <code>string keyword_plan = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return The keywordPlan.
     */
    public java.lang.String getKeywordPlan() {
      java.lang.Object ref = keywordPlan_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        keywordPlan_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. The resource name of the keyword plan to be forecasted.
     * </pre>
     *
     * <code>string keyword_plan = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return The bytes for keywordPlan.
     */
    public com.google.protobuf.ByteString
        getKeywordPlanBytes() {
      java.lang.Object ref = keywordPlan_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        keywordPlan_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. The resource name of the keyword plan to be forecasted.
     * </pre>
     *
     * <code>string keyword_plan = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @param value The keywordPlan to set.
     * @return This builder for chaining.
     */
    public Builder setKeywordPlan(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      keywordPlan_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The resource name of the keyword plan to be forecasted.
     * </pre>
     *
     * <code>string keyword_plan = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearKeywordPlan() {
      
      keywordPlan_ = getDefaultInstance().getKeywordPlan();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The resource name of the keyword plan to be forecasted.
     * </pre>
     *
     * <code>string keyword_plan = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @param value The bytes for keywordPlan to set.
     * @return This builder for chaining.
     */
    public Builder setKeywordPlanBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      keywordPlan_ = value;
      onChanged();
      return this;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v8.services.GenerateForecastCurveRequest)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v8.services.GenerateForecastCurveRequest)
  private static final com.google.ads.googleads.v8.services.GenerateForecastCurveRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v8.services.GenerateForecastCurveRequest();
  }

  public static com.google.ads.googleads.v8.services.GenerateForecastCurveRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GenerateForecastCurveRequest>
      PARSER = new com.google.protobuf.AbstractParser<GenerateForecastCurveRequest>() {
    @java.lang.Override
    public GenerateForecastCurveRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GenerateForecastCurveRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GenerateForecastCurveRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GenerateForecastCurveRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v8.services.GenerateForecastCurveRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
