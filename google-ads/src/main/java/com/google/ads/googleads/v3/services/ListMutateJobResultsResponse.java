// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v3/services/mutate_job_service.proto

package com.google.ads.googleads.v3.services;

/**
 * <pre>
 * Response message for [MutateJobService.ListMutateJobResults][google.ads.googleads.v3.services.MutateJobService.ListMutateJobResults].
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v3.services.ListMutateJobResultsResponse}
 */
public  final class ListMutateJobResultsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v3.services.ListMutateJobResultsResponse)
    ListMutateJobResultsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListMutateJobResultsResponse.newBuilder() to construct.
  private ListMutateJobResultsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListMutateJobResultsResponse() {
    results_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ListMutateJobResultsResponse(
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
              results_ = new java.util.ArrayList<com.google.ads.googleads.v3.services.MutateJobResult>();
              mutable_bitField0_ |= 0x00000001;
            }
            results_.add(
                input.readMessage(com.google.ads.googleads.v3.services.MutateJobResult.parser(), extensionRegistry));
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            nextPageToken_ = s;
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
        results_ = java.util.Collections.unmodifiableList(results_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v3.services.MutateJobServiceProto.internal_static_google_ads_googleads_v3_services_ListMutateJobResultsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v3.services.MutateJobServiceProto.internal_static_google_ads_googleads_v3_services_ListMutateJobResultsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v3.services.ListMutateJobResultsResponse.class, com.google.ads.googleads.v3.services.ListMutateJobResultsResponse.Builder.class);
  }

  private int bitField0_;
  public static final int RESULTS_FIELD_NUMBER = 1;
  private java.util.List<com.google.ads.googleads.v3.services.MutateJobResult> results_;
  /**
   * <pre>
   * The list of rows that matched the query.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v3.services.MutateJobResult results = 1;</code>
   */
  public java.util.List<com.google.ads.googleads.v3.services.MutateJobResult> getResultsList() {
    return results_;
  }
  /**
   * <pre>
   * The list of rows that matched the query.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v3.services.MutateJobResult results = 1;</code>
   */
  public java.util.List<? extends com.google.ads.googleads.v3.services.MutateJobResultOrBuilder> 
      getResultsOrBuilderList() {
    return results_;
  }
  /**
   * <pre>
   * The list of rows that matched the query.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v3.services.MutateJobResult results = 1;</code>
   */
  public int getResultsCount() {
    return results_.size();
  }
  /**
   * <pre>
   * The list of rows that matched the query.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v3.services.MutateJobResult results = 1;</code>
   */
  public com.google.ads.googleads.v3.services.MutateJobResult getResults(int index) {
    return results_.get(index);
  }
  /**
   * <pre>
   * The list of rows that matched the query.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v3.services.MutateJobResult results = 1;</code>
   */
  public com.google.ads.googleads.v3.services.MutateJobResultOrBuilder getResultsOrBuilder(
      int index) {
    return results_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  private volatile java.lang.Object nextPageToken_;
  /**
   * <pre>
   * Pagination token used to retrieve the next page of results.
   * Pass the content of this string as the `page_token` attribute of
   * the next request. `next_page_token` is not returned for the last
   * page.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   */
  public java.lang.String getNextPageToken() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nextPageToken_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Pagination token used to retrieve the next page of results.
   * Pass the content of this string as the `page_token` attribute of
   * the next request. `next_page_token` is not returned for the last
   * page.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   */
  public com.google.protobuf.ByteString
      getNextPageTokenBytes() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      nextPageToken_ = b;
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
    for (int i = 0; i < results_.size(); i++) {
      output.writeMessage(1, results_.get(i));
    }
    if (!getNextPageTokenBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nextPageToken_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < results_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, results_.get(i));
    }
    if (!getNextPageTokenBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nextPageToken_);
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
    if (!(obj instanceof com.google.ads.googleads.v3.services.ListMutateJobResultsResponse)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v3.services.ListMutateJobResultsResponse other = (com.google.ads.googleads.v3.services.ListMutateJobResultsResponse) obj;

    if (!getResultsList()
        .equals(other.getResultsList())) return false;
    if (!getNextPageToken()
        .equals(other.getNextPageToken())) return false;
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
    if (getResultsCount() > 0) {
      hash = (37 * hash) + RESULTS_FIELD_NUMBER;
      hash = (53 * hash) + getResultsList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v3.services.ListMutateJobResultsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v3.services.ListMutateJobResultsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v3.services.ListMutateJobResultsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v3.services.ListMutateJobResultsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v3.services.ListMutateJobResultsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v3.services.ListMutateJobResultsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v3.services.ListMutateJobResultsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v3.services.ListMutateJobResultsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v3.services.ListMutateJobResultsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v3.services.ListMutateJobResultsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v3.services.ListMutateJobResultsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v3.services.ListMutateJobResultsResponse parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v3.services.ListMutateJobResultsResponse prototype) {
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
   * Response message for [MutateJobService.ListMutateJobResults][google.ads.googleads.v3.services.MutateJobService.ListMutateJobResults].
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v3.services.ListMutateJobResultsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v3.services.ListMutateJobResultsResponse)
      com.google.ads.googleads.v3.services.ListMutateJobResultsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v3.services.MutateJobServiceProto.internal_static_google_ads_googleads_v3_services_ListMutateJobResultsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v3.services.MutateJobServiceProto.internal_static_google_ads_googleads_v3_services_ListMutateJobResultsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v3.services.ListMutateJobResultsResponse.class, com.google.ads.googleads.v3.services.ListMutateJobResultsResponse.Builder.class);
    }

    // Construct using com.google.ads.googleads.v3.services.ListMutateJobResultsResponse.newBuilder()
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
        getResultsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (resultsBuilder_ == null) {
        results_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        resultsBuilder_.clear();
      }
      nextPageToken_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v3.services.MutateJobServiceProto.internal_static_google_ads_googleads_v3_services_ListMutateJobResultsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v3.services.ListMutateJobResultsResponse getDefaultInstanceForType() {
      return com.google.ads.googleads.v3.services.ListMutateJobResultsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v3.services.ListMutateJobResultsResponse build() {
      com.google.ads.googleads.v3.services.ListMutateJobResultsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v3.services.ListMutateJobResultsResponse buildPartial() {
      com.google.ads.googleads.v3.services.ListMutateJobResultsResponse result = new com.google.ads.googleads.v3.services.ListMutateJobResultsResponse(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (resultsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          results_ = java.util.Collections.unmodifiableList(results_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.results_ = results_;
      } else {
        result.results_ = resultsBuilder_.build();
      }
      result.nextPageToken_ = nextPageToken_;
      result.bitField0_ = to_bitField0_;
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
      if (other instanceof com.google.ads.googleads.v3.services.ListMutateJobResultsResponse) {
        return mergeFrom((com.google.ads.googleads.v3.services.ListMutateJobResultsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v3.services.ListMutateJobResultsResponse other) {
      if (other == com.google.ads.googleads.v3.services.ListMutateJobResultsResponse.getDefaultInstance()) return this;
      if (resultsBuilder_ == null) {
        if (!other.results_.isEmpty()) {
          if (results_.isEmpty()) {
            results_ = other.results_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureResultsIsMutable();
            results_.addAll(other.results_);
          }
          onChanged();
        }
      } else {
        if (!other.results_.isEmpty()) {
          if (resultsBuilder_.isEmpty()) {
            resultsBuilder_.dispose();
            resultsBuilder_ = null;
            results_ = other.results_;
            bitField0_ = (bitField0_ & ~0x00000001);
            resultsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getResultsFieldBuilder() : null;
          } else {
            resultsBuilder_.addAllMessages(other.results_);
          }
        }
      }
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
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
      com.google.ads.googleads.v3.services.ListMutateJobResultsResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v3.services.ListMutateJobResultsResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.google.ads.googleads.v3.services.MutateJobResult> results_ =
      java.util.Collections.emptyList();
    private void ensureResultsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        results_ = new java.util.ArrayList<com.google.ads.googleads.v3.services.MutateJobResult>(results_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.ads.googleads.v3.services.MutateJobResult, com.google.ads.googleads.v3.services.MutateJobResult.Builder, com.google.ads.googleads.v3.services.MutateJobResultOrBuilder> resultsBuilder_;

    /**
     * <pre>
     * The list of rows that matched the query.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v3.services.MutateJobResult results = 1;</code>
     */
    public java.util.List<com.google.ads.googleads.v3.services.MutateJobResult> getResultsList() {
      if (resultsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(results_);
      } else {
        return resultsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * The list of rows that matched the query.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v3.services.MutateJobResult results = 1;</code>
     */
    public int getResultsCount() {
      if (resultsBuilder_ == null) {
        return results_.size();
      } else {
        return resultsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * The list of rows that matched the query.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v3.services.MutateJobResult results = 1;</code>
     */
    public com.google.ads.googleads.v3.services.MutateJobResult getResults(int index) {
      if (resultsBuilder_ == null) {
        return results_.get(index);
      } else {
        return resultsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * The list of rows that matched the query.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v3.services.MutateJobResult results = 1;</code>
     */
    public Builder setResults(
        int index, com.google.ads.googleads.v3.services.MutateJobResult value) {
      if (resultsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureResultsIsMutable();
        results_.set(index, value);
        onChanged();
      } else {
        resultsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The list of rows that matched the query.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v3.services.MutateJobResult results = 1;</code>
     */
    public Builder setResults(
        int index, com.google.ads.googleads.v3.services.MutateJobResult.Builder builderForValue) {
      if (resultsBuilder_ == null) {
        ensureResultsIsMutable();
        results_.set(index, builderForValue.build());
        onChanged();
      } else {
        resultsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The list of rows that matched the query.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v3.services.MutateJobResult results = 1;</code>
     */
    public Builder addResults(com.google.ads.googleads.v3.services.MutateJobResult value) {
      if (resultsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureResultsIsMutable();
        results_.add(value);
        onChanged();
      } else {
        resultsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * The list of rows that matched the query.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v3.services.MutateJobResult results = 1;</code>
     */
    public Builder addResults(
        int index, com.google.ads.googleads.v3.services.MutateJobResult value) {
      if (resultsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureResultsIsMutable();
        results_.add(index, value);
        onChanged();
      } else {
        resultsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The list of rows that matched the query.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v3.services.MutateJobResult results = 1;</code>
     */
    public Builder addResults(
        com.google.ads.googleads.v3.services.MutateJobResult.Builder builderForValue) {
      if (resultsBuilder_ == null) {
        ensureResultsIsMutable();
        results_.add(builderForValue.build());
        onChanged();
      } else {
        resultsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The list of rows that matched the query.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v3.services.MutateJobResult results = 1;</code>
     */
    public Builder addResults(
        int index, com.google.ads.googleads.v3.services.MutateJobResult.Builder builderForValue) {
      if (resultsBuilder_ == null) {
        ensureResultsIsMutable();
        results_.add(index, builderForValue.build());
        onChanged();
      } else {
        resultsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The list of rows that matched the query.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v3.services.MutateJobResult results = 1;</code>
     */
    public Builder addAllResults(
        java.lang.Iterable<? extends com.google.ads.googleads.v3.services.MutateJobResult> values) {
      if (resultsBuilder_ == null) {
        ensureResultsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, results_);
        onChanged();
      } else {
        resultsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * The list of rows that matched the query.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v3.services.MutateJobResult results = 1;</code>
     */
    public Builder clearResults() {
      if (resultsBuilder_ == null) {
        results_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        resultsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * The list of rows that matched the query.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v3.services.MutateJobResult results = 1;</code>
     */
    public Builder removeResults(int index) {
      if (resultsBuilder_ == null) {
        ensureResultsIsMutable();
        results_.remove(index);
        onChanged();
      } else {
        resultsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * The list of rows that matched the query.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v3.services.MutateJobResult results = 1;</code>
     */
    public com.google.ads.googleads.v3.services.MutateJobResult.Builder getResultsBuilder(
        int index) {
      return getResultsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * The list of rows that matched the query.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v3.services.MutateJobResult results = 1;</code>
     */
    public com.google.ads.googleads.v3.services.MutateJobResultOrBuilder getResultsOrBuilder(
        int index) {
      if (resultsBuilder_ == null) {
        return results_.get(index);  } else {
        return resultsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * The list of rows that matched the query.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v3.services.MutateJobResult results = 1;</code>
     */
    public java.util.List<? extends com.google.ads.googleads.v3.services.MutateJobResultOrBuilder> 
         getResultsOrBuilderList() {
      if (resultsBuilder_ != null) {
        return resultsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(results_);
      }
    }
    /**
     * <pre>
     * The list of rows that matched the query.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v3.services.MutateJobResult results = 1;</code>
     */
    public com.google.ads.googleads.v3.services.MutateJobResult.Builder addResultsBuilder() {
      return getResultsFieldBuilder().addBuilder(
          com.google.ads.googleads.v3.services.MutateJobResult.getDefaultInstance());
    }
    /**
     * <pre>
     * The list of rows that matched the query.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v3.services.MutateJobResult results = 1;</code>
     */
    public com.google.ads.googleads.v3.services.MutateJobResult.Builder addResultsBuilder(
        int index) {
      return getResultsFieldBuilder().addBuilder(
          index, com.google.ads.googleads.v3.services.MutateJobResult.getDefaultInstance());
    }
    /**
     * <pre>
     * The list of rows that matched the query.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v3.services.MutateJobResult results = 1;</code>
     */
    public java.util.List<com.google.ads.googleads.v3.services.MutateJobResult.Builder> 
         getResultsBuilderList() {
      return getResultsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.ads.googleads.v3.services.MutateJobResult, com.google.ads.googleads.v3.services.MutateJobResult.Builder, com.google.ads.googleads.v3.services.MutateJobResultOrBuilder> 
        getResultsFieldBuilder() {
      if (resultsBuilder_ == null) {
        resultsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.ads.googleads.v3.services.MutateJobResult, com.google.ads.googleads.v3.services.MutateJobResult.Builder, com.google.ads.googleads.v3.services.MutateJobResultOrBuilder>(
                results_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        results_ = null;
      }
      return resultsBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     * <pre>
     * Pagination token used to retrieve the next page of results.
     * Pass the content of this string as the `page_token` attribute of
     * the next request. `next_page_token` is not returned for the last
     * page.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     */
    public java.lang.String getNextPageToken() {
      java.lang.Object ref = nextPageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nextPageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Pagination token used to retrieve the next page of results.
     * Pass the content of this string as the `page_token` attribute of
     * the next request. `next_page_token` is not returned for the last
     * page.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     */
    public com.google.protobuf.ByteString
        getNextPageTokenBytes() {
      java.lang.Object ref = nextPageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        nextPageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Pagination token used to retrieve the next page of results.
     * Pass the content of this string as the `page_token` attribute of
     * the next request. `next_page_token` is not returned for the last
     * page.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     */
    public Builder setNextPageToken(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      nextPageToken_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Pagination token used to retrieve the next page of results.
     * Pass the content of this string as the `page_token` attribute of
     * the next request. `next_page_token` is not returned for the last
     * page.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     */
    public Builder clearNextPageToken() {
      
      nextPageToken_ = getDefaultInstance().getNextPageToken();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Pagination token used to retrieve the next page of results.
     * Pass the content of this string as the `page_token` attribute of
     * the next request. `next_page_token` is not returned for the last
     * page.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     */
    public Builder setNextPageTokenBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      nextPageToken_ = value;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v3.services.ListMutateJobResultsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v3.services.ListMutateJobResultsResponse)
  private static final com.google.ads.googleads.v3.services.ListMutateJobResultsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v3.services.ListMutateJobResultsResponse();
  }

  public static com.google.ads.googleads.v3.services.ListMutateJobResultsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListMutateJobResultsResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListMutateJobResultsResponse>() {
    @java.lang.Override
    public ListMutateJobResultsResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ListMutateJobResultsResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ListMutateJobResultsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListMutateJobResultsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v3.services.ListMutateJobResultsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

