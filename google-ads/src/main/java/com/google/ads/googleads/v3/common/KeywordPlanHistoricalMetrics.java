// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v3/common/keyword_plan_common.proto

package com.google.ads.googleads.v3.common;

/**
 * <pre>
 * Historical metrics.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v3.common.KeywordPlanHistoricalMetrics}
 */
public  final class KeywordPlanHistoricalMetrics extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v3.common.KeywordPlanHistoricalMetrics)
    KeywordPlanHistoricalMetricsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use KeywordPlanHistoricalMetrics.newBuilder() to construct.
  private KeywordPlanHistoricalMetrics(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private KeywordPlanHistoricalMetrics() {
    competition_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private KeywordPlanHistoricalMetrics(
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
            com.google.protobuf.Int64Value.Builder subBuilder = null;
            if (avgMonthlySearches_ != null) {
              subBuilder = avgMonthlySearches_.toBuilder();
            }
            avgMonthlySearches_ = input.readMessage(com.google.protobuf.Int64Value.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(avgMonthlySearches_);
              avgMonthlySearches_ = subBuilder.buildPartial();
            }

            break;
          }
          case 16: {
            int rawValue = input.readEnum();

            competition_ = rawValue;
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
    return com.google.ads.googleads.v3.common.KeywordPlanCommonProto.internal_static_google_ads_googleads_v3_common_KeywordPlanHistoricalMetrics_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v3.common.KeywordPlanCommonProto.internal_static_google_ads_googleads_v3_common_KeywordPlanHistoricalMetrics_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v3.common.KeywordPlanHistoricalMetrics.class, com.google.ads.googleads.v3.common.KeywordPlanHistoricalMetrics.Builder.class);
  }

  public static final int AVG_MONTHLY_SEARCHES_FIELD_NUMBER = 1;
  private com.google.protobuf.Int64Value avgMonthlySearches_;
  /**
   * <pre>
   * Average monthly searches for the past 12 months.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value avg_monthly_searches = 1;</code>
   */
  public boolean hasAvgMonthlySearches() {
    return avgMonthlySearches_ != null;
  }
  /**
   * <pre>
   * Average monthly searches for the past 12 months.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value avg_monthly_searches = 1;</code>
   */
  public com.google.protobuf.Int64Value getAvgMonthlySearches() {
    return avgMonthlySearches_ == null ? com.google.protobuf.Int64Value.getDefaultInstance() : avgMonthlySearches_;
  }
  /**
   * <pre>
   * Average monthly searches for the past 12 months.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value avg_monthly_searches = 1;</code>
   */
  public com.google.protobuf.Int64ValueOrBuilder getAvgMonthlySearchesOrBuilder() {
    return getAvgMonthlySearches();
  }

  public static final int COMPETITION_FIELD_NUMBER = 2;
  private int competition_;
  /**
   * <pre>
   * The competition level for the query.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.enums.KeywordPlanCompetitionLevelEnum.KeywordPlanCompetitionLevel competition = 2;</code>
   */
  public int getCompetitionValue() {
    return competition_;
  }
  /**
   * <pre>
   * The competition level for the query.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.enums.KeywordPlanCompetitionLevelEnum.KeywordPlanCompetitionLevel competition = 2;</code>
   */
  public com.google.ads.googleads.v3.enums.KeywordPlanCompetitionLevelEnum.KeywordPlanCompetitionLevel getCompetition() {
    @SuppressWarnings("deprecation")
    com.google.ads.googleads.v3.enums.KeywordPlanCompetitionLevelEnum.KeywordPlanCompetitionLevel result = com.google.ads.googleads.v3.enums.KeywordPlanCompetitionLevelEnum.KeywordPlanCompetitionLevel.valueOf(competition_);
    return result == null ? com.google.ads.googleads.v3.enums.KeywordPlanCompetitionLevelEnum.KeywordPlanCompetitionLevel.UNRECOGNIZED : result;
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
    if (avgMonthlySearches_ != null) {
      output.writeMessage(1, getAvgMonthlySearches());
    }
    if (competition_ != com.google.ads.googleads.v3.enums.KeywordPlanCompetitionLevelEnum.KeywordPlanCompetitionLevel.UNSPECIFIED.getNumber()) {
      output.writeEnum(2, competition_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (avgMonthlySearches_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getAvgMonthlySearches());
    }
    if (competition_ != com.google.ads.googleads.v3.enums.KeywordPlanCompetitionLevelEnum.KeywordPlanCompetitionLevel.UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, competition_);
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
    if (!(obj instanceof com.google.ads.googleads.v3.common.KeywordPlanHistoricalMetrics)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v3.common.KeywordPlanHistoricalMetrics other = (com.google.ads.googleads.v3.common.KeywordPlanHistoricalMetrics) obj;

    if (hasAvgMonthlySearches() != other.hasAvgMonthlySearches()) return false;
    if (hasAvgMonthlySearches()) {
      if (!getAvgMonthlySearches()
          .equals(other.getAvgMonthlySearches())) return false;
    }
    if (competition_ != other.competition_) return false;
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
    if (hasAvgMonthlySearches()) {
      hash = (37 * hash) + AVG_MONTHLY_SEARCHES_FIELD_NUMBER;
      hash = (53 * hash) + getAvgMonthlySearches().hashCode();
    }
    hash = (37 * hash) + COMPETITION_FIELD_NUMBER;
    hash = (53 * hash) + competition_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v3.common.KeywordPlanHistoricalMetrics parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v3.common.KeywordPlanHistoricalMetrics parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v3.common.KeywordPlanHistoricalMetrics parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v3.common.KeywordPlanHistoricalMetrics parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v3.common.KeywordPlanHistoricalMetrics parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v3.common.KeywordPlanHistoricalMetrics parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v3.common.KeywordPlanHistoricalMetrics parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v3.common.KeywordPlanHistoricalMetrics parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v3.common.KeywordPlanHistoricalMetrics parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v3.common.KeywordPlanHistoricalMetrics parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v3.common.KeywordPlanHistoricalMetrics parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v3.common.KeywordPlanHistoricalMetrics parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v3.common.KeywordPlanHistoricalMetrics prototype) {
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
   * Historical metrics.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v3.common.KeywordPlanHistoricalMetrics}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v3.common.KeywordPlanHistoricalMetrics)
      com.google.ads.googleads.v3.common.KeywordPlanHistoricalMetricsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v3.common.KeywordPlanCommonProto.internal_static_google_ads_googleads_v3_common_KeywordPlanHistoricalMetrics_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v3.common.KeywordPlanCommonProto.internal_static_google_ads_googleads_v3_common_KeywordPlanHistoricalMetrics_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v3.common.KeywordPlanHistoricalMetrics.class, com.google.ads.googleads.v3.common.KeywordPlanHistoricalMetrics.Builder.class);
    }

    // Construct using com.google.ads.googleads.v3.common.KeywordPlanHistoricalMetrics.newBuilder()
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
      if (avgMonthlySearchesBuilder_ == null) {
        avgMonthlySearches_ = null;
      } else {
        avgMonthlySearches_ = null;
        avgMonthlySearchesBuilder_ = null;
      }
      competition_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v3.common.KeywordPlanCommonProto.internal_static_google_ads_googleads_v3_common_KeywordPlanHistoricalMetrics_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v3.common.KeywordPlanHistoricalMetrics getDefaultInstanceForType() {
      return com.google.ads.googleads.v3.common.KeywordPlanHistoricalMetrics.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v3.common.KeywordPlanHistoricalMetrics build() {
      com.google.ads.googleads.v3.common.KeywordPlanHistoricalMetrics result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v3.common.KeywordPlanHistoricalMetrics buildPartial() {
      com.google.ads.googleads.v3.common.KeywordPlanHistoricalMetrics result = new com.google.ads.googleads.v3.common.KeywordPlanHistoricalMetrics(this);
      if (avgMonthlySearchesBuilder_ == null) {
        result.avgMonthlySearches_ = avgMonthlySearches_;
      } else {
        result.avgMonthlySearches_ = avgMonthlySearchesBuilder_.build();
      }
      result.competition_ = competition_;
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
      if (other instanceof com.google.ads.googleads.v3.common.KeywordPlanHistoricalMetrics) {
        return mergeFrom((com.google.ads.googleads.v3.common.KeywordPlanHistoricalMetrics)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v3.common.KeywordPlanHistoricalMetrics other) {
      if (other == com.google.ads.googleads.v3.common.KeywordPlanHistoricalMetrics.getDefaultInstance()) return this;
      if (other.hasAvgMonthlySearches()) {
        mergeAvgMonthlySearches(other.getAvgMonthlySearches());
      }
      if (other.competition_ != 0) {
        setCompetitionValue(other.getCompetitionValue());
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
      com.google.ads.googleads.v3.common.KeywordPlanHistoricalMetrics parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v3.common.KeywordPlanHistoricalMetrics) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.protobuf.Int64Value avgMonthlySearches_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Int64Value, com.google.protobuf.Int64Value.Builder, com.google.protobuf.Int64ValueOrBuilder> avgMonthlySearchesBuilder_;
    /**
     * <pre>
     * Average monthly searches for the past 12 months.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value avg_monthly_searches = 1;</code>
     */
    public boolean hasAvgMonthlySearches() {
      return avgMonthlySearchesBuilder_ != null || avgMonthlySearches_ != null;
    }
    /**
     * <pre>
     * Average monthly searches for the past 12 months.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value avg_monthly_searches = 1;</code>
     */
    public com.google.protobuf.Int64Value getAvgMonthlySearches() {
      if (avgMonthlySearchesBuilder_ == null) {
        return avgMonthlySearches_ == null ? com.google.protobuf.Int64Value.getDefaultInstance() : avgMonthlySearches_;
      } else {
        return avgMonthlySearchesBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Average monthly searches for the past 12 months.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value avg_monthly_searches = 1;</code>
     */
    public Builder setAvgMonthlySearches(com.google.protobuf.Int64Value value) {
      if (avgMonthlySearchesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        avgMonthlySearches_ = value;
        onChanged();
      } else {
        avgMonthlySearchesBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Average monthly searches for the past 12 months.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value avg_monthly_searches = 1;</code>
     */
    public Builder setAvgMonthlySearches(
        com.google.protobuf.Int64Value.Builder builderForValue) {
      if (avgMonthlySearchesBuilder_ == null) {
        avgMonthlySearches_ = builderForValue.build();
        onChanged();
      } else {
        avgMonthlySearchesBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Average monthly searches for the past 12 months.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value avg_monthly_searches = 1;</code>
     */
    public Builder mergeAvgMonthlySearches(com.google.protobuf.Int64Value value) {
      if (avgMonthlySearchesBuilder_ == null) {
        if (avgMonthlySearches_ != null) {
          avgMonthlySearches_ =
            com.google.protobuf.Int64Value.newBuilder(avgMonthlySearches_).mergeFrom(value).buildPartial();
        } else {
          avgMonthlySearches_ = value;
        }
        onChanged();
      } else {
        avgMonthlySearchesBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Average monthly searches for the past 12 months.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value avg_monthly_searches = 1;</code>
     */
    public Builder clearAvgMonthlySearches() {
      if (avgMonthlySearchesBuilder_ == null) {
        avgMonthlySearches_ = null;
        onChanged();
      } else {
        avgMonthlySearches_ = null;
        avgMonthlySearchesBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Average monthly searches for the past 12 months.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value avg_monthly_searches = 1;</code>
     */
    public com.google.protobuf.Int64Value.Builder getAvgMonthlySearchesBuilder() {
      
      onChanged();
      return getAvgMonthlySearchesFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Average monthly searches for the past 12 months.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value avg_monthly_searches = 1;</code>
     */
    public com.google.protobuf.Int64ValueOrBuilder getAvgMonthlySearchesOrBuilder() {
      if (avgMonthlySearchesBuilder_ != null) {
        return avgMonthlySearchesBuilder_.getMessageOrBuilder();
      } else {
        return avgMonthlySearches_ == null ?
            com.google.protobuf.Int64Value.getDefaultInstance() : avgMonthlySearches_;
      }
    }
    /**
     * <pre>
     * Average monthly searches for the past 12 months.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value avg_monthly_searches = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Int64Value, com.google.protobuf.Int64Value.Builder, com.google.protobuf.Int64ValueOrBuilder> 
        getAvgMonthlySearchesFieldBuilder() {
      if (avgMonthlySearchesBuilder_ == null) {
        avgMonthlySearchesBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Int64Value, com.google.protobuf.Int64Value.Builder, com.google.protobuf.Int64ValueOrBuilder>(
                getAvgMonthlySearches(),
                getParentForChildren(),
                isClean());
        avgMonthlySearches_ = null;
      }
      return avgMonthlySearchesBuilder_;
    }

    private int competition_ = 0;
    /**
     * <pre>
     * The competition level for the query.
     * </pre>
     *
     * <code>.google.ads.googleads.v3.enums.KeywordPlanCompetitionLevelEnum.KeywordPlanCompetitionLevel competition = 2;</code>
     */
    public int getCompetitionValue() {
      return competition_;
    }
    /**
     * <pre>
     * The competition level for the query.
     * </pre>
     *
     * <code>.google.ads.googleads.v3.enums.KeywordPlanCompetitionLevelEnum.KeywordPlanCompetitionLevel competition = 2;</code>
     */
    public Builder setCompetitionValue(int value) {
      competition_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The competition level for the query.
     * </pre>
     *
     * <code>.google.ads.googleads.v3.enums.KeywordPlanCompetitionLevelEnum.KeywordPlanCompetitionLevel competition = 2;</code>
     */
    public com.google.ads.googleads.v3.enums.KeywordPlanCompetitionLevelEnum.KeywordPlanCompetitionLevel getCompetition() {
      @SuppressWarnings("deprecation")
      com.google.ads.googleads.v3.enums.KeywordPlanCompetitionLevelEnum.KeywordPlanCompetitionLevel result = com.google.ads.googleads.v3.enums.KeywordPlanCompetitionLevelEnum.KeywordPlanCompetitionLevel.valueOf(competition_);
      return result == null ? com.google.ads.googleads.v3.enums.KeywordPlanCompetitionLevelEnum.KeywordPlanCompetitionLevel.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * The competition level for the query.
     * </pre>
     *
     * <code>.google.ads.googleads.v3.enums.KeywordPlanCompetitionLevelEnum.KeywordPlanCompetitionLevel competition = 2;</code>
     */
    public Builder setCompetition(com.google.ads.googleads.v3.enums.KeywordPlanCompetitionLevelEnum.KeywordPlanCompetitionLevel value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      competition_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The competition level for the query.
     * </pre>
     *
     * <code>.google.ads.googleads.v3.enums.KeywordPlanCompetitionLevelEnum.KeywordPlanCompetitionLevel competition = 2;</code>
     */
    public Builder clearCompetition() {
      
      competition_ = 0;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v3.common.KeywordPlanHistoricalMetrics)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v3.common.KeywordPlanHistoricalMetrics)
  private static final com.google.ads.googleads.v3.common.KeywordPlanHistoricalMetrics DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v3.common.KeywordPlanHistoricalMetrics();
  }

  public static com.google.ads.googleads.v3.common.KeywordPlanHistoricalMetrics getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<KeywordPlanHistoricalMetrics>
      PARSER = new com.google.protobuf.AbstractParser<KeywordPlanHistoricalMetrics>() {
    @java.lang.Override
    public KeywordPlanHistoricalMetrics parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new KeywordPlanHistoricalMetrics(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<KeywordPlanHistoricalMetrics> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<KeywordPlanHistoricalMetrics> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v3.common.KeywordPlanHistoricalMetrics getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

