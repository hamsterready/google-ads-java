// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v3/errors/errors.proto

package com.google.ads.googleads.v3.errors;

/**
 * <pre>
 * Describes how a GoogleAds API call failed. It's returned inside
 * google.rpc.Status.details when a call fails.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v3.errors.GoogleAdsFailure}
 */
public  final class GoogleAdsFailure extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v3.errors.GoogleAdsFailure)
    GoogleAdsFailureOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GoogleAdsFailure.newBuilder() to construct.
  private GoogleAdsFailure(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GoogleAdsFailure() {
    errors_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GoogleAdsFailure(
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
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              errors_ = new java.util.ArrayList<com.google.ads.googleads.v3.errors.GoogleAdsError>();
              mutable_bitField0_ |= 0x00000001;
            }
            errors_.add(
                input.readMessage(com.google.ads.googleads.v3.errors.GoogleAdsError.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        errors_ = java.util.Collections.unmodifiableList(errors_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v3.errors.ErrorsProto.internal_static_google_ads_googleads_v3_errors_GoogleAdsFailure_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v3.errors.ErrorsProto.internal_static_google_ads_googleads_v3_errors_GoogleAdsFailure_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v3.errors.GoogleAdsFailure.class, com.google.ads.googleads.v3.errors.GoogleAdsFailure.Builder.class);
  }

  public static final int ERRORS_FIELD_NUMBER = 1;
  private java.util.List<com.google.ads.googleads.v3.errors.GoogleAdsError> errors_;
  /**
   * <pre>
   * The list of errors that occurred.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v3.errors.GoogleAdsError errors = 1;</code>
   */
  public java.util.List<com.google.ads.googleads.v3.errors.GoogleAdsError> getErrorsList() {
    return errors_;
  }
  /**
   * <pre>
   * The list of errors that occurred.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v3.errors.GoogleAdsError errors = 1;</code>
   */
  public java.util.List<? extends com.google.ads.googleads.v3.errors.GoogleAdsErrorOrBuilder> 
      getErrorsOrBuilderList() {
    return errors_;
  }
  /**
   * <pre>
   * The list of errors that occurred.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v3.errors.GoogleAdsError errors = 1;</code>
   */
  public int getErrorsCount() {
    return errors_.size();
  }
  /**
   * <pre>
   * The list of errors that occurred.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v3.errors.GoogleAdsError errors = 1;</code>
   */
  public com.google.ads.googleads.v3.errors.GoogleAdsError getErrors(int index) {
    return errors_.get(index);
  }
  /**
   * <pre>
   * The list of errors that occurred.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v3.errors.GoogleAdsError errors = 1;</code>
   */
  public com.google.ads.googleads.v3.errors.GoogleAdsErrorOrBuilder getErrorsOrBuilder(
      int index) {
    return errors_.get(index);
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
    for (int i = 0; i < errors_.size(); i++) {
      output.writeMessage(1, errors_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < errors_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, errors_.get(i));
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
    if (!(obj instanceof com.google.ads.googleads.v3.errors.GoogleAdsFailure)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v3.errors.GoogleAdsFailure other = (com.google.ads.googleads.v3.errors.GoogleAdsFailure) obj;

    if (!getErrorsList()
        .equals(other.getErrorsList())) return false;
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
    if (getErrorsCount() > 0) {
      hash = (37 * hash) + ERRORS_FIELD_NUMBER;
      hash = (53 * hash) + getErrorsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v3.errors.GoogleAdsFailure parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v3.errors.GoogleAdsFailure parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v3.errors.GoogleAdsFailure parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v3.errors.GoogleAdsFailure parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v3.errors.GoogleAdsFailure parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v3.errors.GoogleAdsFailure parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v3.errors.GoogleAdsFailure parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v3.errors.GoogleAdsFailure parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v3.errors.GoogleAdsFailure parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v3.errors.GoogleAdsFailure parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v3.errors.GoogleAdsFailure parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v3.errors.GoogleAdsFailure parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v3.errors.GoogleAdsFailure prototype) {
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
   * Describes how a GoogleAds API call failed. It's returned inside
   * google.rpc.Status.details when a call fails.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v3.errors.GoogleAdsFailure}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v3.errors.GoogleAdsFailure)
      com.google.ads.googleads.v3.errors.GoogleAdsFailureOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v3.errors.ErrorsProto.internal_static_google_ads_googleads_v3_errors_GoogleAdsFailure_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v3.errors.ErrorsProto.internal_static_google_ads_googleads_v3_errors_GoogleAdsFailure_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v3.errors.GoogleAdsFailure.class, com.google.ads.googleads.v3.errors.GoogleAdsFailure.Builder.class);
    }

    // Construct using com.google.ads.googleads.v3.errors.GoogleAdsFailure.newBuilder()
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
        getErrorsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (errorsBuilder_ == null) {
        errors_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        errorsBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v3.errors.ErrorsProto.internal_static_google_ads_googleads_v3_errors_GoogleAdsFailure_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v3.errors.GoogleAdsFailure getDefaultInstanceForType() {
      return com.google.ads.googleads.v3.errors.GoogleAdsFailure.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v3.errors.GoogleAdsFailure build() {
      com.google.ads.googleads.v3.errors.GoogleAdsFailure result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v3.errors.GoogleAdsFailure buildPartial() {
      com.google.ads.googleads.v3.errors.GoogleAdsFailure result = new com.google.ads.googleads.v3.errors.GoogleAdsFailure(this);
      int from_bitField0_ = bitField0_;
      if (errorsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          errors_ = java.util.Collections.unmodifiableList(errors_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.errors_ = errors_;
      } else {
        result.errors_ = errorsBuilder_.build();
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
      if (other instanceof com.google.ads.googleads.v3.errors.GoogleAdsFailure) {
        return mergeFrom((com.google.ads.googleads.v3.errors.GoogleAdsFailure)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v3.errors.GoogleAdsFailure other) {
      if (other == com.google.ads.googleads.v3.errors.GoogleAdsFailure.getDefaultInstance()) return this;
      if (errorsBuilder_ == null) {
        if (!other.errors_.isEmpty()) {
          if (errors_.isEmpty()) {
            errors_ = other.errors_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureErrorsIsMutable();
            errors_.addAll(other.errors_);
          }
          onChanged();
        }
      } else {
        if (!other.errors_.isEmpty()) {
          if (errorsBuilder_.isEmpty()) {
            errorsBuilder_.dispose();
            errorsBuilder_ = null;
            errors_ = other.errors_;
            bitField0_ = (bitField0_ & ~0x00000001);
            errorsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getErrorsFieldBuilder() : null;
          } else {
            errorsBuilder_.addAllMessages(other.errors_);
          }
        }
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
      com.google.ads.googleads.v3.errors.GoogleAdsFailure parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v3.errors.GoogleAdsFailure) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.google.ads.googleads.v3.errors.GoogleAdsError> errors_ =
      java.util.Collections.emptyList();
    private void ensureErrorsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        errors_ = new java.util.ArrayList<com.google.ads.googleads.v3.errors.GoogleAdsError>(errors_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.ads.googleads.v3.errors.GoogleAdsError, com.google.ads.googleads.v3.errors.GoogleAdsError.Builder, com.google.ads.googleads.v3.errors.GoogleAdsErrorOrBuilder> errorsBuilder_;

    /**
     * <pre>
     * The list of errors that occurred.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v3.errors.GoogleAdsError errors = 1;</code>
     */
    public java.util.List<com.google.ads.googleads.v3.errors.GoogleAdsError> getErrorsList() {
      if (errorsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(errors_);
      } else {
        return errorsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * The list of errors that occurred.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v3.errors.GoogleAdsError errors = 1;</code>
     */
    public int getErrorsCount() {
      if (errorsBuilder_ == null) {
        return errors_.size();
      } else {
        return errorsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * The list of errors that occurred.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v3.errors.GoogleAdsError errors = 1;</code>
     */
    public com.google.ads.googleads.v3.errors.GoogleAdsError getErrors(int index) {
      if (errorsBuilder_ == null) {
        return errors_.get(index);
      } else {
        return errorsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * The list of errors that occurred.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v3.errors.GoogleAdsError errors = 1;</code>
     */
    public Builder setErrors(
        int index, com.google.ads.googleads.v3.errors.GoogleAdsError value) {
      if (errorsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureErrorsIsMutable();
        errors_.set(index, value);
        onChanged();
      } else {
        errorsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The list of errors that occurred.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v3.errors.GoogleAdsError errors = 1;</code>
     */
    public Builder setErrors(
        int index, com.google.ads.googleads.v3.errors.GoogleAdsError.Builder builderForValue) {
      if (errorsBuilder_ == null) {
        ensureErrorsIsMutable();
        errors_.set(index, builderForValue.build());
        onChanged();
      } else {
        errorsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The list of errors that occurred.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v3.errors.GoogleAdsError errors = 1;</code>
     */
    public Builder addErrors(com.google.ads.googleads.v3.errors.GoogleAdsError value) {
      if (errorsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureErrorsIsMutable();
        errors_.add(value);
        onChanged();
      } else {
        errorsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * The list of errors that occurred.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v3.errors.GoogleAdsError errors = 1;</code>
     */
    public Builder addErrors(
        int index, com.google.ads.googleads.v3.errors.GoogleAdsError value) {
      if (errorsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureErrorsIsMutable();
        errors_.add(index, value);
        onChanged();
      } else {
        errorsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The list of errors that occurred.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v3.errors.GoogleAdsError errors = 1;</code>
     */
    public Builder addErrors(
        com.google.ads.googleads.v3.errors.GoogleAdsError.Builder builderForValue) {
      if (errorsBuilder_ == null) {
        ensureErrorsIsMutable();
        errors_.add(builderForValue.build());
        onChanged();
      } else {
        errorsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The list of errors that occurred.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v3.errors.GoogleAdsError errors = 1;</code>
     */
    public Builder addErrors(
        int index, com.google.ads.googleads.v3.errors.GoogleAdsError.Builder builderForValue) {
      if (errorsBuilder_ == null) {
        ensureErrorsIsMutable();
        errors_.add(index, builderForValue.build());
        onChanged();
      } else {
        errorsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The list of errors that occurred.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v3.errors.GoogleAdsError errors = 1;</code>
     */
    public Builder addAllErrors(
        java.lang.Iterable<? extends com.google.ads.googleads.v3.errors.GoogleAdsError> values) {
      if (errorsBuilder_ == null) {
        ensureErrorsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, errors_);
        onChanged();
      } else {
        errorsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * The list of errors that occurred.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v3.errors.GoogleAdsError errors = 1;</code>
     */
    public Builder clearErrors() {
      if (errorsBuilder_ == null) {
        errors_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        errorsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * The list of errors that occurred.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v3.errors.GoogleAdsError errors = 1;</code>
     */
    public Builder removeErrors(int index) {
      if (errorsBuilder_ == null) {
        ensureErrorsIsMutable();
        errors_.remove(index);
        onChanged();
      } else {
        errorsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * The list of errors that occurred.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v3.errors.GoogleAdsError errors = 1;</code>
     */
    public com.google.ads.googleads.v3.errors.GoogleAdsError.Builder getErrorsBuilder(
        int index) {
      return getErrorsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * The list of errors that occurred.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v3.errors.GoogleAdsError errors = 1;</code>
     */
    public com.google.ads.googleads.v3.errors.GoogleAdsErrorOrBuilder getErrorsOrBuilder(
        int index) {
      if (errorsBuilder_ == null) {
        return errors_.get(index);  } else {
        return errorsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * The list of errors that occurred.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v3.errors.GoogleAdsError errors = 1;</code>
     */
    public java.util.List<? extends com.google.ads.googleads.v3.errors.GoogleAdsErrorOrBuilder> 
         getErrorsOrBuilderList() {
      if (errorsBuilder_ != null) {
        return errorsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(errors_);
      }
    }
    /**
     * <pre>
     * The list of errors that occurred.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v3.errors.GoogleAdsError errors = 1;</code>
     */
    public com.google.ads.googleads.v3.errors.GoogleAdsError.Builder addErrorsBuilder() {
      return getErrorsFieldBuilder().addBuilder(
          com.google.ads.googleads.v3.errors.GoogleAdsError.getDefaultInstance());
    }
    /**
     * <pre>
     * The list of errors that occurred.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v3.errors.GoogleAdsError errors = 1;</code>
     */
    public com.google.ads.googleads.v3.errors.GoogleAdsError.Builder addErrorsBuilder(
        int index) {
      return getErrorsFieldBuilder().addBuilder(
          index, com.google.ads.googleads.v3.errors.GoogleAdsError.getDefaultInstance());
    }
    /**
     * <pre>
     * The list of errors that occurred.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v3.errors.GoogleAdsError errors = 1;</code>
     */
    public java.util.List<com.google.ads.googleads.v3.errors.GoogleAdsError.Builder> 
         getErrorsBuilderList() {
      return getErrorsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.ads.googleads.v3.errors.GoogleAdsError, com.google.ads.googleads.v3.errors.GoogleAdsError.Builder, com.google.ads.googleads.v3.errors.GoogleAdsErrorOrBuilder> 
        getErrorsFieldBuilder() {
      if (errorsBuilder_ == null) {
        errorsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.ads.googleads.v3.errors.GoogleAdsError, com.google.ads.googleads.v3.errors.GoogleAdsError.Builder, com.google.ads.googleads.v3.errors.GoogleAdsErrorOrBuilder>(
                errors_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        errors_ = null;
      }
      return errorsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v3.errors.GoogleAdsFailure)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v3.errors.GoogleAdsFailure)
  private static final com.google.ads.googleads.v3.errors.GoogleAdsFailure DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v3.errors.GoogleAdsFailure();
  }

  public static com.google.ads.googleads.v3.errors.GoogleAdsFailure getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GoogleAdsFailure>
      PARSER = new com.google.protobuf.AbstractParser<GoogleAdsFailure>() {
    @java.lang.Override
    public GoogleAdsFailure parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GoogleAdsFailure(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GoogleAdsFailure> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GoogleAdsFailure> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v3.errors.GoogleAdsFailure getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

