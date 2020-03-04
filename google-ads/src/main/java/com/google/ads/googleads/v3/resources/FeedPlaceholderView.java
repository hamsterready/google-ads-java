// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v3/resources/feed_placeholder_view.proto

package com.google.ads.googleads.v3.resources;

/**
 * <pre>
 * A feed placeholder view.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v3.resources.FeedPlaceholderView}
 */
public  final class FeedPlaceholderView extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v3.resources.FeedPlaceholderView)
    FeedPlaceholderViewOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FeedPlaceholderView.newBuilder() to construct.
  private FeedPlaceholderView(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FeedPlaceholderView() {
    resourceName_ = "";
    placeholderType_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private FeedPlaceholderView(
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
            java.lang.String s = input.readStringRequireUtf8();

            resourceName_ = s;
            break;
          }
          case 16: {
            int rawValue = input.readEnum();

            placeholderType_ = rawValue;
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
    return com.google.ads.googleads.v3.resources.FeedPlaceholderViewProto.internal_static_google_ads_googleads_v3_resources_FeedPlaceholderView_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v3.resources.FeedPlaceholderViewProto.internal_static_google_ads_googleads_v3_resources_FeedPlaceholderView_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v3.resources.FeedPlaceholderView.class, com.google.ads.googleads.v3.resources.FeedPlaceholderView.Builder.class);
  }

  public static final int RESOURCE_NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object resourceName_;
  /**
   * <pre>
   * The resource name of the feed placeholder view.
   * Feed placeholder view resource names have the form:
   * `customers/{customer_id}/feedPlaceholderViews/{placeholder_type}`
   * </pre>
   *
   * <code>string resource_name = 1;</code>
   */
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
   * The resource name of the feed placeholder view.
   * Feed placeholder view resource names have the form:
   * `customers/{customer_id}/feedPlaceholderViews/{placeholder_type}`
   * </pre>
   *
   * <code>string resource_name = 1;</code>
   */
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

  public static final int PLACEHOLDER_TYPE_FIELD_NUMBER = 2;
  private int placeholderType_;
  /**
   * <pre>
   * The placeholder type of the feed placeholder view.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.enums.PlaceholderTypeEnum.PlaceholderType placeholder_type = 2;</code>
   */
  public int getPlaceholderTypeValue() {
    return placeholderType_;
  }
  /**
   * <pre>
   * The placeholder type of the feed placeholder view.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.enums.PlaceholderTypeEnum.PlaceholderType placeholder_type = 2;</code>
   */
  public com.google.ads.googleads.v3.enums.PlaceholderTypeEnum.PlaceholderType getPlaceholderType() {
    @SuppressWarnings("deprecation")
    com.google.ads.googleads.v3.enums.PlaceholderTypeEnum.PlaceholderType result = com.google.ads.googleads.v3.enums.PlaceholderTypeEnum.PlaceholderType.valueOf(placeholderType_);
    return result == null ? com.google.ads.googleads.v3.enums.PlaceholderTypeEnum.PlaceholderType.UNRECOGNIZED : result;
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
    if (!getResourceNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, resourceName_);
    }
    if (placeholderType_ != com.google.ads.googleads.v3.enums.PlaceholderTypeEnum.PlaceholderType.UNSPECIFIED.getNumber()) {
      output.writeEnum(2, placeholderType_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getResourceNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, resourceName_);
    }
    if (placeholderType_ != com.google.ads.googleads.v3.enums.PlaceholderTypeEnum.PlaceholderType.UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, placeholderType_);
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
    if (!(obj instanceof com.google.ads.googleads.v3.resources.FeedPlaceholderView)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v3.resources.FeedPlaceholderView other = (com.google.ads.googleads.v3.resources.FeedPlaceholderView) obj;

    if (!getResourceName()
        .equals(other.getResourceName())) return false;
    if (placeholderType_ != other.placeholderType_) return false;
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
    hash = (37 * hash) + PLACEHOLDER_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + placeholderType_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v3.resources.FeedPlaceholderView parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v3.resources.FeedPlaceholderView parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v3.resources.FeedPlaceholderView parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v3.resources.FeedPlaceholderView parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v3.resources.FeedPlaceholderView parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v3.resources.FeedPlaceholderView parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v3.resources.FeedPlaceholderView parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v3.resources.FeedPlaceholderView parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v3.resources.FeedPlaceholderView parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v3.resources.FeedPlaceholderView parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v3.resources.FeedPlaceholderView parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v3.resources.FeedPlaceholderView parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v3.resources.FeedPlaceholderView prototype) {
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
   * A feed placeholder view.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v3.resources.FeedPlaceholderView}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v3.resources.FeedPlaceholderView)
      com.google.ads.googleads.v3.resources.FeedPlaceholderViewOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v3.resources.FeedPlaceholderViewProto.internal_static_google_ads_googleads_v3_resources_FeedPlaceholderView_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v3.resources.FeedPlaceholderViewProto.internal_static_google_ads_googleads_v3_resources_FeedPlaceholderView_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v3.resources.FeedPlaceholderView.class, com.google.ads.googleads.v3.resources.FeedPlaceholderView.Builder.class);
    }

    // Construct using com.google.ads.googleads.v3.resources.FeedPlaceholderView.newBuilder()
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

      placeholderType_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v3.resources.FeedPlaceholderViewProto.internal_static_google_ads_googleads_v3_resources_FeedPlaceholderView_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v3.resources.FeedPlaceholderView getDefaultInstanceForType() {
      return com.google.ads.googleads.v3.resources.FeedPlaceholderView.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v3.resources.FeedPlaceholderView build() {
      com.google.ads.googleads.v3.resources.FeedPlaceholderView result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v3.resources.FeedPlaceholderView buildPartial() {
      com.google.ads.googleads.v3.resources.FeedPlaceholderView result = new com.google.ads.googleads.v3.resources.FeedPlaceholderView(this);
      result.resourceName_ = resourceName_;
      result.placeholderType_ = placeholderType_;
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
      if (other instanceof com.google.ads.googleads.v3.resources.FeedPlaceholderView) {
        return mergeFrom((com.google.ads.googleads.v3.resources.FeedPlaceholderView)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v3.resources.FeedPlaceholderView other) {
      if (other == com.google.ads.googleads.v3.resources.FeedPlaceholderView.getDefaultInstance()) return this;
      if (!other.getResourceName().isEmpty()) {
        resourceName_ = other.resourceName_;
        onChanged();
      }
      if (other.placeholderType_ != 0) {
        setPlaceholderTypeValue(other.getPlaceholderTypeValue());
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
      com.google.ads.googleads.v3.resources.FeedPlaceholderView parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v3.resources.FeedPlaceholderView) e.getUnfinishedMessage();
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
     * The resource name of the feed placeholder view.
     * Feed placeholder view resource names have the form:
     * `customers/{customer_id}/feedPlaceholderViews/{placeholder_type}`
     * </pre>
     *
     * <code>string resource_name = 1;</code>
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
     * The resource name of the feed placeholder view.
     * Feed placeholder view resource names have the form:
     * `customers/{customer_id}/feedPlaceholderViews/{placeholder_type}`
     * </pre>
     *
     * <code>string resource_name = 1;</code>
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
     * The resource name of the feed placeholder view.
     * Feed placeholder view resource names have the form:
     * `customers/{customer_id}/feedPlaceholderViews/{placeholder_type}`
     * </pre>
     *
     * <code>string resource_name = 1;</code>
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
     * The resource name of the feed placeholder view.
     * Feed placeholder view resource names have the form:
     * `customers/{customer_id}/feedPlaceholderViews/{placeholder_type}`
     * </pre>
     *
     * <code>string resource_name = 1;</code>
     */
    public Builder clearResourceName() {
      
      resourceName_ = getDefaultInstance().getResourceName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The resource name of the feed placeholder view.
     * Feed placeholder view resource names have the form:
     * `customers/{customer_id}/feedPlaceholderViews/{placeholder_type}`
     * </pre>
     *
     * <code>string resource_name = 1;</code>
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

    private int placeholderType_ = 0;
    /**
     * <pre>
     * The placeholder type of the feed placeholder view.
     * </pre>
     *
     * <code>.google.ads.googleads.v3.enums.PlaceholderTypeEnum.PlaceholderType placeholder_type = 2;</code>
     */
    public int getPlaceholderTypeValue() {
      return placeholderType_;
    }
    /**
     * <pre>
     * The placeholder type of the feed placeholder view.
     * </pre>
     *
     * <code>.google.ads.googleads.v3.enums.PlaceholderTypeEnum.PlaceholderType placeholder_type = 2;</code>
     */
    public Builder setPlaceholderTypeValue(int value) {
      placeholderType_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The placeholder type of the feed placeholder view.
     * </pre>
     *
     * <code>.google.ads.googleads.v3.enums.PlaceholderTypeEnum.PlaceholderType placeholder_type = 2;</code>
     */
    public com.google.ads.googleads.v3.enums.PlaceholderTypeEnum.PlaceholderType getPlaceholderType() {
      @SuppressWarnings("deprecation")
      com.google.ads.googleads.v3.enums.PlaceholderTypeEnum.PlaceholderType result = com.google.ads.googleads.v3.enums.PlaceholderTypeEnum.PlaceholderType.valueOf(placeholderType_);
      return result == null ? com.google.ads.googleads.v3.enums.PlaceholderTypeEnum.PlaceholderType.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * The placeholder type of the feed placeholder view.
     * </pre>
     *
     * <code>.google.ads.googleads.v3.enums.PlaceholderTypeEnum.PlaceholderType placeholder_type = 2;</code>
     */
    public Builder setPlaceholderType(com.google.ads.googleads.v3.enums.PlaceholderTypeEnum.PlaceholderType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      placeholderType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The placeholder type of the feed placeholder view.
     * </pre>
     *
     * <code>.google.ads.googleads.v3.enums.PlaceholderTypeEnum.PlaceholderType placeholder_type = 2;</code>
     */
    public Builder clearPlaceholderType() {
      
      placeholderType_ = 0;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v3.resources.FeedPlaceholderView)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v3.resources.FeedPlaceholderView)
  private static final com.google.ads.googleads.v3.resources.FeedPlaceholderView DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v3.resources.FeedPlaceholderView();
  }

  public static com.google.ads.googleads.v3.resources.FeedPlaceholderView getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FeedPlaceholderView>
      PARSER = new com.google.protobuf.AbstractParser<FeedPlaceholderView>() {
    @java.lang.Override
    public FeedPlaceholderView parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new FeedPlaceholderView(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<FeedPlaceholderView> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FeedPlaceholderView> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v3.resources.FeedPlaceholderView getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

