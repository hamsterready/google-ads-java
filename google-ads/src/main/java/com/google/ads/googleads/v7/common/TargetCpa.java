// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v7/common/bidding.proto

package com.google.ads.googleads.v7.common;

/**
 * <pre>
 * An automated bid strategy that sets bids to help get as many conversions as
 * possible at the target cost-per-acquisition (CPA) you set.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v7.common.TargetCpa}
 */
public final class TargetCpa extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v7.common.TargetCpa)
    TargetCpaOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TargetCpa.newBuilder() to construct.
  private TargetCpa(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TargetCpa() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TargetCpa();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private TargetCpa(
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
          case 32: {
            bitField0_ |= 0x00000001;
            targetCpaMicros_ = input.readInt64();
            break;
          }
          case 40: {
            bitField0_ |= 0x00000002;
            cpcBidCeilingMicros_ = input.readInt64();
            break;
          }
          case 48: {
            bitField0_ |= 0x00000004;
            cpcBidFloorMicros_ = input.readInt64();
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
    return com.google.ads.googleads.v7.common.BiddingProto.internal_static_google_ads_googleads_v7_common_TargetCpa_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v7.common.BiddingProto.internal_static_google_ads_googleads_v7_common_TargetCpa_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v7.common.TargetCpa.class, com.google.ads.googleads.v7.common.TargetCpa.Builder.class);
  }

  private int bitField0_;
  public static final int TARGET_CPA_MICROS_FIELD_NUMBER = 4;
  private long targetCpaMicros_;
  /**
   * <pre>
   * Average CPA target.
   * This target should be greater than or equal to minimum billable unit based
   * on the currency for the account.
   * </pre>
   *
   * <code>int64 target_cpa_micros = 4;</code>
   * @return Whether the targetCpaMicros field is set.
   */
  @java.lang.Override
  public boolean hasTargetCpaMicros() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Average CPA target.
   * This target should be greater than or equal to minimum billable unit based
   * on the currency for the account.
   * </pre>
   *
   * <code>int64 target_cpa_micros = 4;</code>
   * @return The targetCpaMicros.
   */
  @java.lang.Override
  public long getTargetCpaMicros() {
    return targetCpaMicros_;
  }

  public static final int CPC_BID_CEILING_MICROS_FIELD_NUMBER = 5;
  private long cpcBidCeilingMicros_;
  /**
   * <pre>
   * Maximum bid limit that can be set by the bid strategy.
   * The limit applies to all keywords managed by the strategy.
   * </pre>
   *
   * <code>int64 cpc_bid_ceiling_micros = 5;</code>
   * @return Whether the cpcBidCeilingMicros field is set.
   */
  @java.lang.Override
  public boolean hasCpcBidCeilingMicros() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * Maximum bid limit that can be set by the bid strategy.
   * The limit applies to all keywords managed by the strategy.
   * </pre>
   *
   * <code>int64 cpc_bid_ceiling_micros = 5;</code>
   * @return The cpcBidCeilingMicros.
   */
  @java.lang.Override
  public long getCpcBidCeilingMicros() {
    return cpcBidCeilingMicros_;
  }

  public static final int CPC_BID_FLOOR_MICROS_FIELD_NUMBER = 6;
  private long cpcBidFloorMicros_;
  /**
   * <pre>
   * Minimum bid limit that can be set by the bid strategy.
   * The limit applies to all keywords managed by the strategy.
   * </pre>
   *
   * <code>int64 cpc_bid_floor_micros = 6;</code>
   * @return Whether the cpcBidFloorMicros field is set.
   */
  @java.lang.Override
  public boolean hasCpcBidFloorMicros() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <pre>
   * Minimum bid limit that can be set by the bid strategy.
   * The limit applies to all keywords managed by the strategy.
   * </pre>
   *
   * <code>int64 cpc_bid_floor_micros = 6;</code>
   * @return The cpcBidFloorMicros.
   */
  @java.lang.Override
  public long getCpcBidFloorMicros() {
    return cpcBidFloorMicros_;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeInt64(4, targetCpaMicros_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeInt64(5, cpcBidCeilingMicros_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      output.writeInt64(6, cpcBidFloorMicros_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, targetCpaMicros_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(5, cpcBidCeilingMicros_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(6, cpcBidFloorMicros_);
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
    if (!(obj instanceof com.google.ads.googleads.v7.common.TargetCpa)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v7.common.TargetCpa other = (com.google.ads.googleads.v7.common.TargetCpa) obj;

    if (hasTargetCpaMicros() != other.hasTargetCpaMicros()) return false;
    if (hasTargetCpaMicros()) {
      if (getTargetCpaMicros()
          != other.getTargetCpaMicros()) return false;
    }
    if (hasCpcBidCeilingMicros() != other.hasCpcBidCeilingMicros()) return false;
    if (hasCpcBidCeilingMicros()) {
      if (getCpcBidCeilingMicros()
          != other.getCpcBidCeilingMicros()) return false;
    }
    if (hasCpcBidFloorMicros() != other.hasCpcBidFloorMicros()) return false;
    if (hasCpcBidFloorMicros()) {
      if (getCpcBidFloorMicros()
          != other.getCpcBidFloorMicros()) return false;
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
    if (hasTargetCpaMicros()) {
      hash = (37 * hash) + TARGET_CPA_MICROS_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getTargetCpaMicros());
    }
    if (hasCpcBidCeilingMicros()) {
      hash = (37 * hash) + CPC_BID_CEILING_MICROS_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getCpcBidCeilingMicros());
    }
    if (hasCpcBidFloorMicros()) {
      hash = (37 * hash) + CPC_BID_FLOOR_MICROS_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getCpcBidFloorMicros());
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v7.common.TargetCpa parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v7.common.TargetCpa parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v7.common.TargetCpa parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v7.common.TargetCpa parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v7.common.TargetCpa parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v7.common.TargetCpa parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v7.common.TargetCpa parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v7.common.TargetCpa parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v7.common.TargetCpa parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v7.common.TargetCpa parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v7.common.TargetCpa parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v7.common.TargetCpa parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v7.common.TargetCpa prototype) {
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
   * An automated bid strategy that sets bids to help get as many conversions as
   * possible at the target cost-per-acquisition (CPA) you set.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v7.common.TargetCpa}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v7.common.TargetCpa)
      com.google.ads.googleads.v7.common.TargetCpaOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v7.common.BiddingProto.internal_static_google_ads_googleads_v7_common_TargetCpa_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v7.common.BiddingProto.internal_static_google_ads_googleads_v7_common_TargetCpa_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v7.common.TargetCpa.class, com.google.ads.googleads.v7.common.TargetCpa.Builder.class);
    }

    // Construct using com.google.ads.googleads.v7.common.TargetCpa.newBuilder()
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
      targetCpaMicros_ = 0L;
      bitField0_ = (bitField0_ & ~0x00000001);
      cpcBidCeilingMicros_ = 0L;
      bitField0_ = (bitField0_ & ~0x00000002);
      cpcBidFloorMicros_ = 0L;
      bitField0_ = (bitField0_ & ~0x00000004);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v7.common.BiddingProto.internal_static_google_ads_googleads_v7_common_TargetCpa_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v7.common.TargetCpa getDefaultInstanceForType() {
      return com.google.ads.googleads.v7.common.TargetCpa.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v7.common.TargetCpa build() {
      com.google.ads.googleads.v7.common.TargetCpa result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v7.common.TargetCpa buildPartial() {
      com.google.ads.googleads.v7.common.TargetCpa result = new com.google.ads.googleads.v7.common.TargetCpa(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.targetCpaMicros_ = targetCpaMicros_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.cpcBidCeilingMicros_ = cpcBidCeilingMicros_;
        to_bitField0_ |= 0x00000002;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.cpcBidFloorMicros_ = cpcBidFloorMicros_;
        to_bitField0_ |= 0x00000004;
      }
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
      if (other instanceof com.google.ads.googleads.v7.common.TargetCpa) {
        return mergeFrom((com.google.ads.googleads.v7.common.TargetCpa)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v7.common.TargetCpa other) {
      if (other == com.google.ads.googleads.v7.common.TargetCpa.getDefaultInstance()) return this;
      if (other.hasTargetCpaMicros()) {
        setTargetCpaMicros(other.getTargetCpaMicros());
      }
      if (other.hasCpcBidCeilingMicros()) {
        setCpcBidCeilingMicros(other.getCpcBidCeilingMicros());
      }
      if (other.hasCpcBidFloorMicros()) {
        setCpcBidFloorMicros(other.getCpcBidFloorMicros());
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
      com.google.ads.googleads.v7.common.TargetCpa parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v7.common.TargetCpa) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private long targetCpaMicros_ ;
    /**
     * <pre>
     * Average CPA target.
     * This target should be greater than or equal to minimum billable unit based
     * on the currency for the account.
     * </pre>
     *
     * <code>int64 target_cpa_micros = 4;</code>
     * @return Whether the targetCpaMicros field is set.
     */
    @java.lang.Override
    public boolean hasTargetCpaMicros() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Average CPA target.
     * This target should be greater than or equal to minimum billable unit based
     * on the currency for the account.
     * </pre>
     *
     * <code>int64 target_cpa_micros = 4;</code>
     * @return The targetCpaMicros.
     */
    @java.lang.Override
    public long getTargetCpaMicros() {
      return targetCpaMicros_;
    }
    /**
     * <pre>
     * Average CPA target.
     * This target should be greater than or equal to minimum billable unit based
     * on the currency for the account.
     * </pre>
     *
     * <code>int64 target_cpa_micros = 4;</code>
     * @param value The targetCpaMicros to set.
     * @return This builder for chaining.
     */
    public Builder setTargetCpaMicros(long value) {
      bitField0_ |= 0x00000001;
      targetCpaMicros_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Average CPA target.
     * This target should be greater than or equal to minimum billable unit based
     * on the currency for the account.
     * </pre>
     *
     * <code>int64 target_cpa_micros = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearTargetCpaMicros() {
      bitField0_ = (bitField0_ & ~0x00000001);
      targetCpaMicros_ = 0L;
      onChanged();
      return this;
    }

    private long cpcBidCeilingMicros_ ;
    /**
     * <pre>
     * Maximum bid limit that can be set by the bid strategy.
     * The limit applies to all keywords managed by the strategy.
     * </pre>
     *
     * <code>int64 cpc_bid_ceiling_micros = 5;</code>
     * @return Whether the cpcBidCeilingMicros field is set.
     */
    @java.lang.Override
    public boolean hasCpcBidCeilingMicros() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Maximum bid limit that can be set by the bid strategy.
     * The limit applies to all keywords managed by the strategy.
     * </pre>
     *
     * <code>int64 cpc_bid_ceiling_micros = 5;</code>
     * @return The cpcBidCeilingMicros.
     */
    @java.lang.Override
    public long getCpcBidCeilingMicros() {
      return cpcBidCeilingMicros_;
    }
    /**
     * <pre>
     * Maximum bid limit that can be set by the bid strategy.
     * The limit applies to all keywords managed by the strategy.
     * </pre>
     *
     * <code>int64 cpc_bid_ceiling_micros = 5;</code>
     * @param value The cpcBidCeilingMicros to set.
     * @return This builder for chaining.
     */
    public Builder setCpcBidCeilingMicros(long value) {
      bitField0_ |= 0x00000002;
      cpcBidCeilingMicros_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Maximum bid limit that can be set by the bid strategy.
     * The limit applies to all keywords managed by the strategy.
     * </pre>
     *
     * <code>int64 cpc_bid_ceiling_micros = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearCpcBidCeilingMicros() {
      bitField0_ = (bitField0_ & ~0x00000002);
      cpcBidCeilingMicros_ = 0L;
      onChanged();
      return this;
    }

    private long cpcBidFloorMicros_ ;
    /**
     * <pre>
     * Minimum bid limit that can be set by the bid strategy.
     * The limit applies to all keywords managed by the strategy.
     * </pre>
     *
     * <code>int64 cpc_bid_floor_micros = 6;</code>
     * @return Whether the cpcBidFloorMicros field is set.
     */
    @java.lang.Override
    public boolean hasCpcBidFloorMicros() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * Minimum bid limit that can be set by the bid strategy.
     * The limit applies to all keywords managed by the strategy.
     * </pre>
     *
     * <code>int64 cpc_bid_floor_micros = 6;</code>
     * @return The cpcBidFloorMicros.
     */
    @java.lang.Override
    public long getCpcBidFloorMicros() {
      return cpcBidFloorMicros_;
    }
    /**
     * <pre>
     * Minimum bid limit that can be set by the bid strategy.
     * The limit applies to all keywords managed by the strategy.
     * </pre>
     *
     * <code>int64 cpc_bid_floor_micros = 6;</code>
     * @param value The cpcBidFloorMicros to set.
     * @return This builder for chaining.
     */
    public Builder setCpcBidFloorMicros(long value) {
      bitField0_ |= 0x00000004;
      cpcBidFloorMicros_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Minimum bid limit that can be set by the bid strategy.
     * The limit applies to all keywords managed by the strategy.
     * </pre>
     *
     * <code>int64 cpc_bid_floor_micros = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearCpcBidFloorMicros() {
      bitField0_ = (bitField0_ & ~0x00000004);
      cpcBidFloorMicros_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v7.common.TargetCpa)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v7.common.TargetCpa)
  private static final com.google.ads.googleads.v7.common.TargetCpa DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v7.common.TargetCpa();
  }

  public static com.google.ads.googleads.v7.common.TargetCpa getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TargetCpa>
      PARSER = new com.google.protobuf.AbstractParser<TargetCpa>() {
    @java.lang.Override
    public TargetCpa parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new TargetCpa(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<TargetCpa> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TargetCpa> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v7.common.TargetCpa getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
