// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v10/services/asset_set_service.proto

package com.google.ads.googleads.v10.services;

/**
 * <pre>
 * The result for the asset set mutate.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v10.services.MutateAssetSetResult}
 */
public final class MutateAssetSetResult extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v10.services.MutateAssetSetResult)
    MutateAssetSetResultOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MutateAssetSetResult.newBuilder() to construct.
  private MutateAssetSetResult(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MutateAssetSetResult() {
    resourceName_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MutateAssetSetResult();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private MutateAssetSetResult(
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

            resourceName_ = s;
            break;
          }
          case 18: {
            com.google.ads.googleads.v10.resources.AssetSet.Builder subBuilder = null;
            if (assetSet_ != null) {
              subBuilder = assetSet_.toBuilder();
            }
            assetSet_ = input.readMessage(com.google.ads.googleads.v10.resources.AssetSet.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(assetSet_);
              assetSet_ = subBuilder.buildPartial();
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
    return com.google.ads.googleads.v10.services.AssetSetServiceProto.internal_static_google_ads_googleads_v10_services_MutateAssetSetResult_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v10.services.AssetSetServiceProto.internal_static_google_ads_googleads_v10_services_MutateAssetSetResult_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v10.services.MutateAssetSetResult.class, com.google.ads.googleads.v10.services.MutateAssetSetResult.Builder.class);
  }

  public static final int RESOURCE_NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object resourceName_;
  /**
   * <pre>
   * Returned for successful operations.
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  @java.lang.Override
  public java.lang.String getResourceName() {
    java.lang.Object ref = resourceName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      resourceName_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Returned for successful operations.
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getResourceNameBytes() {
    java.lang.Object ref = resourceName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      resourceName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ASSET_SET_FIELD_NUMBER = 2;
  private com.google.ads.googleads.v10.resources.AssetSet assetSet_;
  /**
   * <pre>
   * The mutated asset set with only mutable fields after mutate. The field will
   * only be returned when response_content_type is set to "MUTABLE_RESOURCE".
   * </pre>
   *
   * <code>.google.ads.googleads.v10.resources.AssetSet asset_set = 2;</code>
   * @return Whether the assetSet field is set.
   */
  @java.lang.Override
  public boolean hasAssetSet() {
    return assetSet_ != null;
  }
  /**
   * <pre>
   * The mutated asset set with only mutable fields after mutate. The field will
   * only be returned when response_content_type is set to "MUTABLE_RESOURCE".
   * </pre>
   *
   * <code>.google.ads.googleads.v10.resources.AssetSet asset_set = 2;</code>
   * @return The assetSet.
   */
  @java.lang.Override
  public com.google.ads.googleads.v10.resources.AssetSet getAssetSet() {
    return assetSet_ == null ? com.google.ads.googleads.v10.resources.AssetSet.getDefaultInstance() : assetSet_;
  }
  /**
   * <pre>
   * The mutated asset set with only mutable fields after mutate. The field will
   * only be returned when response_content_type is set to "MUTABLE_RESOURCE".
   * </pre>
   *
   * <code>.google.ads.googleads.v10.resources.AssetSet asset_set = 2;</code>
   */
  @java.lang.Override
  public com.google.ads.googleads.v10.resources.AssetSetOrBuilder getAssetSetOrBuilder() {
    return getAssetSet();
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(resourceName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, resourceName_);
    }
    if (assetSet_ != null) {
      output.writeMessage(2, getAssetSet());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(resourceName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, resourceName_);
    }
    if (assetSet_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getAssetSet());
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
    if (!(obj instanceof com.google.ads.googleads.v10.services.MutateAssetSetResult)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v10.services.MutateAssetSetResult other = (com.google.ads.googleads.v10.services.MutateAssetSetResult) obj;

    if (!getResourceName()
        .equals(other.getResourceName())) return false;
    if (hasAssetSet() != other.hasAssetSet()) return false;
    if (hasAssetSet()) {
      if (!getAssetSet()
          .equals(other.getAssetSet())) return false;
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
    hash = (37 * hash) + RESOURCE_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getResourceName().hashCode();
    if (hasAssetSet()) {
      hash = (37 * hash) + ASSET_SET_FIELD_NUMBER;
      hash = (53 * hash) + getAssetSet().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v10.services.MutateAssetSetResult parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v10.services.MutateAssetSetResult parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.services.MutateAssetSetResult parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v10.services.MutateAssetSetResult parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.services.MutateAssetSetResult parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v10.services.MutateAssetSetResult parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.services.MutateAssetSetResult parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v10.services.MutateAssetSetResult parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.services.MutateAssetSetResult parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v10.services.MutateAssetSetResult parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.services.MutateAssetSetResult parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v10.services.MutateAssetSetResult parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v10.services.MutateAssetSetResult prototype) {
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
   * The result for the asset set mutate.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v10.services.MutateAssetSetResult}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v10.services.MutateAssetSetResult)
      com.google.ads.googleads.v10.services.MutateAssetSetResultOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v10.services.AssetSetServiceProto.internal_static_google_ads_googleads_v10_services_MutateAssetSetResult_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v10.services.AssetSetServiceProto.internal_static_google_ads_googleads_v10_services_MutateAssetSetResult_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v10.services.MutateAssetSetResult.class, com.google.ads.googleads.v10.services.MutateAssetSetResult.Builder.class);
    }

    // Construct using com.google.ads.googleads.v10.services.MutateAssetSetResult.newBuilder()
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
      resourceName_ = "";

      if (assetSetBuilder_ == null) {
        assetSet_ = null;
      } else {
        assetSet_ = null;
        assetSetBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v10.services.AssetSetServiceProto.internal_static_google_ads_googleads_v10_services_MutateAssetSetResult_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v10.services.MutateAssetSetResult getDefaultInstanceForType() {
      return com.google.ads.googleads.v10.services.MutateAssetSetResult.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v10.services.MutateAssetSetResult build() {
      com.google.ads.googleads.v10.services.MutateAssetSetResult result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v10.services.MutateAssetSetResult buildPartial() {
      com.google.ads.googleads.v10.services.MutateAssetSetResult result = new com.google.ads.googleads.v10.services.MutateAssetSetResult(this);
      result.resourceName_ = resourceName_;
      if (assetSetBuilder_ == null) {
        result.assetSet_ = assetSet_;
      } else {
        result.assetSet_ = assetSetBuilder_.build();
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
      if (other instanceof com.google.ads.googleads.v10.services.MutateAssetSetResult) {
        return mergeFrom((com.google.ads.googleads.v10.services.MutateAssetSetResult)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v10.services.MutateAssetSetResult other) {
      if (other == com.google.ads.googleads.v10.services.MutateAssetSetResult.getDefaultInstance()) return this;
      if (!other.getResourceName().isEmpty()) {
        resourceName_ = other.resourceName_;
        onChanged();
      }
      if (other.hasAssetSet()) {
        mergeAssetSet(other.getAssetSet());
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
      com.google.ads.googleads.v10.services.MutateAssetSetResult parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v10.services.MutateAssetSetResult) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object resourceName_ = "";
    /**
     * <pre>
     * Returned for successful operations.
     * </pre>
     *
     * <code>string resource_name = 1 [(.google.api.resource_reference) = { ... }</code>
     * @return The resourceName.
     */
    public java.lang.String getResourceName() {
      java.lang.Object ref = resourceName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        resourceName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Returned for successful operations.
     * </pre>
     *
     * <code>string resource_name = 1 [(.google.api.resource_reference) = { ... }</code>
     * @return The bytes for resourceName.
     */
    public com.google.protobuf.ByteString
        getResourceNameBytes() {
      java.lang.Object ref = resourceName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        resourceName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Returned for successful operations.
     * </pre>
     *
     * <code>string resource_name = 1 [(.google.api.resource_reference) = { ... }</code>
     * @param value The resourceName to set.
     * @return This builder for chaining.
     */
    public Builder setResourceName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      resourceName_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Returned for successful operations.
     * </pre>
     *
     * <code>string resource_name = 1 [(.google.api.resource_reference) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearResourceName() {
      
      resourceName_ = getDefaultInstance().getResourceName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Returned for successful operations.
     * </pre>
     *
     * <code>string resource_name = 1 [(.google.api.resource_reference) = { ... }</code>
     * @param value The bytes for resourceName to set.
     * @return This builder for chaining.
     */
    public Builder setResourceNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      resourceName_ = value;
      onChanged();
      return this;
    }

    private com.google.ads.googleads.v10.resources.AssetSet assetSet_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v10.resources.AssetSet, com.google.ads.googleads.v10.resources.AssetSet.Builder, com.google.ads.googleads.v10.resources.AssetSetOrBuilder> assetSetBuilder_;
    /**
     * <pre>
     * The mutated asset set with only mutable fields after mutate. The field will
     * only be returned when response_content_type is set to "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v10.resources.AssetSet asset_set = 2;</code>
     * @return Whether the assetSet field is set.
     */
    public boolean hasAssetSet() {
      return assetSetBuilder_ != null || assetSet_ != null;
    }
    /**
     * <pre>
     * The mutated asset set with only mutable fields after mutate. The field will
     * only be returned when response_content_type is set to "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v10.resources.AssetSet asset_set = 2;</code>
     * @return The assetSet.
     */
    public com.google.ads.googleads.v10.resources.AssetSet getAssetSet() {
      if (assetSetBuilder_ == null) {
        return assetSet_ == null ? com.google.ads.googleads.v10.resources.AssetSet.getDefaultInstance() : assetSet_;
      } else {
        return assetSetBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The mutated asset set with only mutable fields after mutate. The field will
     * only be returned when response_content_type is set to "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v10.resources.AssetSet asset_set = 2;</code>
     */
    public Builder setAssetSet(com.google.ads.googleads.v10.resources.AssetSet value) {
      if (assetSetBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        assetSet_ = value;
        onChanged();
      } else {
        assetSetBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The mutated asset set with only mutable fields after mutate. The field will
     * only be returned when response_content_type is set to "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v10.resources.AssetSet asset_set = 2;</code>
     */
    public Builder setAssetSet(
        com.google.ads.googleads.v10.resources.AssetSet.Builder builderForValue) {
      if (assetSetBuilder_ == null) {
        assetSet_ = builderForValue.build();
        onChanged();
      } else {
        assetSetBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The mutated asset set with only mutable fields after mutate. The field will
     * only be returned when response_content_type is set to "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v10.resources.AssetSet asset_set = 2;</code>
     */
    public Builder mergeAssetSet(com.google.ads.googleads.v10.resources.AssetSet value) {
      if (assetSetBuilder_ == null) {
        if (assetSet_ != null) {
          assetSet_ =
            com.google.ads.googleads.v10.resources.AssetSet.newBuilder(assetSet_).mergeFrom(value).buildPartial();
        } else {
          assetSet_ = value;
        }
        onChanged();
      } else {
        assetSetBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The mutated asset set with only mutable fields after mutate. The field will
     * only be returned when response_content_type is set to "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v10.resources.AssetSet asset_set = 2;</code>
     */
    public Builder clearAssetSet() {
      if (assetSetBuilder_ == null) {
        assetSet_ = null;
        onChanged();
      } else {
        assetSet_ = null;
        assetSetBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The mutated asset set with only mutable fields after mutate. The field will
     * only be returned when response_content_type is set to "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v10.resources.AssetSet asset_set = 2;</code>
     */
    public com.google.ads.googleads.v10.resources.AssetSet.Builder getAssetSetBuilder() {
      
      onChanged();
      return getAssetSetFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The mutated asset set with only mutable fields after mutate. The field will
     * only be returned when response_content_type is set to "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v10.resources.AssetSet asset_set = 2;</code>
     */
    public com.google.ads.googleads.v10.resources.AssetSetOrBuilder getAssetSetOrBuilder() {
      if (assetSetBuilder_ != null) {
        return assetSetBuilder_.getMessageOrBuilder();
      } else {
        return assetSet_ == null ?
            com.google.ads.googleads.v10.resources.AssetSet.getDefaultInstance() : assetSet_;
      }
    }
    /**
     * <pre>
     * The mutated asset set with only mutable fields after mutate. The field will
     * only be returned when response_content_type is set to "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v10.resources.AssetSet asset_set = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v10.resources.AssetSet, com.google.ads.googleads.v10.resources.AssetSet.Builder, com.google.ads.googleads.v10.resources.AssetSetOrBuilder> 
        getAssetSetFieldBuilder() {
      if (assetSetBuilder_ == null) {
        assetSetBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.ads.googleads.v10.resources.AssetSet, com.google.ads.googleads.v10.resources.AssetSet.Builder, com.google.ads.googleads.v10.resources.AssetSetOrBuilder>(
                getAssetSet(),
                getParentForChildren(),
                isClean());
        assetSet_ = null;
      }
      return assetSetBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v10.services.MutateAssetSetResult)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v10.services.MutateAssetSetResult)
  private static final com.google.ads.googleads.v10.services.MutateAssetSetResult DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v10.services.MutateAssetSetResult();
  }

  public static com.google.ads.googleads.v10.services.MutateAssetSetResult getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MutateAssetSetResult>
      PARSER = new com.google.protobuf.AbstractParser<MutateAssetSetResult>() {
    @java.lang.Override
    public MutateAssetSetResult parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new MutateAssetSetResult(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MutateAssetSetResult> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MutateAssetSetResult> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v10.services.MutateAssetSetResult getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
