// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v3/errors/conversion_upload_error.proto

package com.google.ads.googleads.v3.errors;

/**
 * <pre>
 * Container for enum describing possible conversion upload errors.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v3.errors.ConversionUploadErrorEnum}
 */
public  final class ConversionUploadErrorEnum extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v3.errors.ConversionUploadErrorEnum)
    ConversionUploadErrorEnumOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ConversionUploadErrorEnum.newBuilder() to construct.
  private ConversionUploadErrorEnum(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ConversionUploadErrorEnum() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ConversionUploadErrorEnum(
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
    return com.google.ads.googleads.v3.errors.ConversionUploadErrorProto.internal_static_google_ads_googleads_v3_errors_ConversionUploadErrorEnum_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v3.errors.ConversionUploadErrorProto.internal_static_google_ads_googleads_v3_errors_ConversionUploadErrorEnum_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v3.errors.ConversionUploadErrorEnum.class, com.google.ads.googleads.v3.errors.ConversionUploadErrorEnum.Builder.class);
  }

  /**
   * <pre>
   * Enum describing possible conversion upload errors.
   * </pre>
   *
   * Protobuf enum {@code google.ads.googleads.v3.errors.ConversionUploadErrorEnum.ConversionUploadError}
   */
  public enum ConversionUploadError
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * Enum unspecified.
     * </pre>
     *
     * <code>UNSPECIFIED = 0;</code>
     */
    UNSPECIFIED(0),
    /**
     * <pre>
     * The received error code is not known in this version.
     * </pre>
     *
     * <code>UNKNOWN = 1;</code>
     */
    UNKNOWN(1),
    /**
     * <pre>
     * The request contained more than 2000 conversions.
     * </pre>
     *
     * <code>TOO_MANY_CONVERSIONS_IN_REQUEST = 2;</code>
     */
    TOO_MANY_CONVERSIONS_IN_REQUEST(2),
    /**
     * <pre>
     * The specified gclid could not be decoded.
     * </pre>
     *
     * <code>UNPARSEABLE_GCLID = 3;</code>
     */
    UNPARSEABLE_GCLID(3),
    /**
     * <pre>
     * The specified conversion_date_time is before the event time
     * associated with the given gclid.
     * </pre>
     *
     * <code>CONVERSION_PRECEDES_GCLID = 4;</code>
     */
    CONVERSION_PRECEDES_GCLID(4),
    /**
     * <pre>
     * The click associated with the given gclid is either too old to be
     * imported or occurred outside of the click through lookback window for the
     * specified conversion action.
     * </pre>
     *
     * <code>EXPIRED_GCLID = 5;</code>
     */
    EXPIRED_GCLID(5),
    /**
     * <pre>
     * The click associated with the given gclid occurred too recently. Please
     * try uploading again after 6 hours have passed since the click occurred.
     * </pre>
     *
     * <code>TOO_RECENT_GCLID = 6;</code>
     */
    TOO_RECENT_GCLID(6),
    /**
     * <pre>
     * The click associated with the given gclid could not be found in the
     * system. This can happen if Google Click IDs are collected for non Google
     * Ads clicks.
     * </pre>
     *
     * <code>GCLID_NOT_FOUND = 7;</code>
     */
    GCLID_NOT_FOUND(7),
    /**
     * <pre>
     * The click associated with the given gclid is owned by a customer
     * account that the uploading customer does not manage.
     * </pre>
     *
     * <code>UNAUTHORIZED_CUSTOMER = 8;</code>
     */
    UNAUTHORIZED_CUSTOMER(8),
    /**
     * <pre>
     * No upload eligible conversion action that matches the provided
     * information can be found for the customer.
     * </pre>
     *
     * <code>INVALID_CONVERSION_ACTION = 9;</code>
     */
    INVALID_CONVERSION_ACTION(9),
    /**
     * <pre>
     * The specified conversion action was created too recently.
     * Please try the upload again after 4-6 hours have passed since the
     * conversion action was created.
     * </pre>
     *
     * <code>TOO_RECENT_CONVERSION_ACTION = 10;</code>
     */
    TOO_RECENT_CONVERSION_ACTION(10),
    /**
     * <pre>
     * The click associated with the given gclid does not contain conversion
     * tracking information.
     * </pre>
     *
     * <code>CONVERSION_TRACKING_NOT_ENABLED_AT_IMPRESSION_TIME = 11;</code>
     */
    CONVERSION_TRACKING_NOT_ENABLED_AT_IMPRESSION_TIME(11),
    /**
     * <pre>
     * The specified conversion action does not use an external attribution
     * model, but external_attribution_data was set.
     * </pre>
     *
     * <code>EXTERNAL_ATTRIBUTION_DATA_SET_FOR_NON_EXTERNALLY_ATTRIBUTED_CONVERSION_ACTION = 12;</code>
     */
    EXTERNAL_ATTRIBUTION_DATA_SET_FOR_NON_EXTERNALLY_ATTRIBUTED_CONVERSION_ACTION(12),
    /**
     * <pre>
     * The specified conversion action uses an external attribution model, but
     * external_attribution_data or one of its contained fields was not set.
     * Both external_attribution_credit and external_attribution_model must be
     * set for externally attributed conversion actions.
     * </pre>
     *
     * <code>EXTERNAL_ATTRIBUTION_DATA_NOT_SET_FOR_EXTERNALLY_ATTRIBUTED_CONVERSION_ACTION = 13;</code>
     */
    EXTERNAL_ATTRIBUTION_DATA_NOT_SET_FOR_EXTERNALLY_ATTRIBUTED_CONVERSION_ACTION(13),
    /**
     * <pre>
     * Order IDs are not supported for conversion actions which use an external
     * attribution model.
     * </pre>
     *
     * <code>ORDER_ID_NOT_PERMITTED_FOR_EXTERNALLY_ATTRIBUTED_CONVERSION_ACTION = 14;</code>
     */
    ORDER_ID_NOT_PERMITTED_FOR_EXTERNALLY_ATTRIBUTED_CONVERSION_ACTION(14),
    /**
     * <pre>
     * A conversion with the same order id and conversion action combination
     * already exists in our system.
     * </pre>
     *
     * <code>ORDER_ID_ALREADY_IN_USE = 15;</code>
     */
    ORDER_ID_ALREADY_IN_USE(15),
    /**
     * <pre>
     * The request contained two or more conversions with the same order id and
     * conversion action combination.
     * </pre>
     *
     * <code>DUPLICATE_ORDER_ID = 16;</code>
     */
    DUPLICATE_ORDER_ID(16),
    /**
     * <pre>
     * The call occurred too recently. Please try uploading again after 6 hours
     * have passed since the call occurred.
     * </pre>
     *
     * <code>TOO_RECENT_CALL = 17;</code>
     */
    TOO_RECENT_CALL(17),
    /**
     * <pre>
     * The click that initiated the call is too old for this conversion to be
     * imported.
     * </pre>
     *
     * <code>EXPIRED_CALL = 18;</code>
     */
    EXPIRED_CALL(18),
    /**
     * <pre>
     * The call or the click leading to the call was not found.
     * </pre>
     *
     * <code>CALL_NOT_FOUND = 19;</code>
     */
    CALL_NOT_FOUND(19),
    /**
     * <pre>
     * The specified conversion_date_time is before the call_start_date_time.
     * </pre>
     *
     * <code>CONVERSION_PRECEDES_CALL = 20;</code>
     */
    CONVERSION_PRECEDES_CALL(20),
    /**
     * <pre>
     * The click associated with the call does not contain conversion tracking
     * information.
     * </pre>
     *
     * <code>CONVERSION_TRACKING_NOT_ENABLED_AT_CALL_TIME = 21;</code>
     */
    CONVERSION_TRACKING_NOT_ENABLED_AT_CALL_TIME(21),
    /**
     * <pre>
     * The caller’s phone number cannot be parsed. It should be formatted either
     * as E.164 "+16502531234", International "+64 3-331 6005" or US national
     * number "6502531234".
     * </pre>
     *
     * <code>UNPARSEABLE_CALLERS_PHONE_NUMBER = 22;</code>
     */
    UNPARSEABLE_CALLERS_PHONE_NUMBER(22),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * Enum unspecified.
     * </pre>
     *
     * <code>UNSPECIFIED = 0;</code>
     */
    public static final int UNSPECIFIED_VALUE = 0;
    /**
     * <pre>
     * The received error code is not known in this version.
     * </pre>
     *
     * <code>UNKNOWN = 1;</code>
     */
    public static final int UNKNOWN_VALUE = 1;
    /**
     * <pre>
     * The request contained more than 2000 conversions.
     * </pre>
     *
     * <code>TOO_MANY_CONVERSIONS_IN_REQUEST = 2;</code>
     */
    public static final int TOO_MANY_CONVERSIONS_IN_REQUEST_VALUE = 2;
    /**
     * <pre>
     * The specified gclid could not be decoded.
     * </pre>
     *
     * <code>UNPARSEABLE_GCLID = 3;</code>
     */
    public static final int UNPARSEABLE_GCLID_VALUE = 3;
    /**
     * <pre>
     * The specified conversion_date_time is before the event time
     * associated with the given gclid.
     * </pre>
     *
     * <code>CONVERSION_PRECEDES_GCLID = 4;</code>
     */
    public static final int CONVERSION_PRECEDES_GCLID_VALUE = 4;
    /**
     * <pre>
     * The click associated with the given gclid is either too old to be
     * imported or occurred outside of the click through lookback window for the
     * specified conversion action.
     * </pre>
     *
     * <code>EXPIRED_GCLID = 5;</code>
     */
    public static final int EXPIRED_GCLID_VALUE = 5;
    /**
     * <pre>
     * The click associated with the given gclid occurred too recently. Please
     * try uploading again after 6 hours have passed since the click occurred.
     * </pre>
     *
     * <code>TOO_RECENT_GCLID = 6;</code>
     */
    public static final int TOO_RECENT_GCLID_VALUE = 6;
    /**
     * <pre>
     * The click associated with the given gclid could not be found in the
     * system. This can happen if Google Click IDs are collected for non Google
     * Ads clicks.
     * </pre>
     *
     * <code>GCLID_NOT_FOUND = 7;</code>
     */
    public static final int GCLID_NOT_FOUND_VALUE = 7;
    /**
     * <pre>
     * The click associated with the given gclid is owned by a customer
     * account that the uploading customer does not manage.
     * </pre>
     *
     * <code>UNAUTHORIZED_CUSTOMER = 8;</code>
     */
    public static final int UNAUTHORIZED_CUSTOMER_VALUE = 8;
    /**
     * <pre>
     * No upload eligible conversion action that matches the provided
     * information can be found for the customer.
     * </pre>
     *
     * <code>INVALID_CONVERSION_ACTION = 9;</code>
     */
    public static final int INVALID_CONVERSION_ACTION_VALUE = 9;
    /**
     * <pre>
     * The specified conversion action was created too recently.
     * Please try the upload again after 4-6 hours have passed since the
     * conversion action was created.
     * </pre>
     *
     * <code>TOO_RECENT_CONVERSION_ACTION = 10;</code>
     */
    public static final int TOO_RECENT_CONVERSION_ACTION_VALUE = 10;
    /**
     * <pre>
     * The click associated with the given gclid does not contain conversion
     * tracking information.
     * </pre>
     *
     * <code>CONVERSION_TRACKING_NOT_ENABLED_AT_IMPRESSION_TIME = 11;</code>
     */
    public static final int CONVERSION_TRACKING_NOT_ENABLED_AT_IMPRESSION_TIME_VALUE = 11;
    /**
     * <pre>
     * The specified conversion action does not use an external attribution
     * model, but external_attribution_data was set.
     * </pre>
     *
     * <code>EXTERNAL_ATTRIBUTION_DATA_SET_FOR_NON_EXTERNALLY_ATTRIBUTED_CONVERSION_ACTION = 12;</code>
     */
    public static final int EXTERNAL_ATTRIBUTION_DATA_SET_FOR_NON_EXTERNALLY_ATTRIBUTED_CONVERSION_ACTION_VALUE = 12;
    /**
     * <pre>
     * The specified conversion action uses an external attribution model, but
     * external_attribution_data or one of its contained fields was not set.
     * Both external_attribution_credit and external_attribution_model must be
     * set for externally attributed conversion actions.
     * </pre>
     *
     * <code>EXTERNAL_ATTRIBUTION_DATA_NOT_SET_FOR_EXTERNALLY_ATTRIBUTED_CONVERSION_ACTION = 13;</code>
     */
    public static final int EXTERNAL_ATTRIBUTION_DATA_NOT_SET_FOR_EXTERNALLY_ATTRIBUTED_CONVERSION_ACTION_VALUE = 13;
    /**
     * <pre>
     * Order IDs are not supported for conversion actions which use an external
     * attribution model.
     * </pre>
     *
     * <code>ORDER_ID_NOT_PERMITTED_FOR_EXTERNALLY_ATTRIBUTED_CONVERSION_ACTION = 14;</code>
     */
    public static final int ORDER_ID_NOT_PERMITTED_FOR_EXTERNALLY_ATTRIBUTED_CONVERSION_ACTION_VALUE = 14;
    /**
     * <pre>
     * A conversion with the same order id and conversion action combination
     * already exists in our system.
     * </pre>
     *
     * <code>ORDER_ID_ALREADY_IN_USE = 15;</code>
     */
    public static final int ORDER_ID_ALREADY_IN_USE_VALUE = 15;
    /**
     * <pre>
     * The request contained two or more conversions with the same order id and
     * conversion action combination.
     * </pre>
     *
     * <code>DUPLICATE_ORDER_ID = 16;</code>
     */
    public static final int DUPLICATE_ORDER_ID_VALUE = 16;
    /**
     * <pre>
     * The call occurred too recently. Please try uploading again after 6 hours
     * have passed since the call occurred.
     * </pre>
     *
     * <code>TOO_RECENT_CALL = 17;</code>
     */
    public static final int TOO_RECENT_CALL_VALUE = 17;
    /**
     * <pre>
     * The click that initiated the call is too old for this conversion to be
     * imported.
     * </pre>
     *
     * <code>EXPIRED_CALL = 18;</code>
     */
    public static final int EXPIRED_CALL_VALUE = 18;
    /**
     * <pre>
     * The call or the click leading to the call was not found.
     * </pre>
     *
     * <code>CALL_NOT_FOUND = 19;</code>
     */
    public static final int CALL_NOT_FOUND_VALUE = 19;
    /**
     * <pre>
     * The specified conversion_date_time is before the call_start_date_time.
     * </pre>
     *
     * <code>CONVERSION_PRECEDES_CALL = 20;</code>
     */
    public static final int CONVERSION_PRECEDES_CALL_VALUE = 20;
    /**
     * <pre>
     * The click associated with the call does not contain conversion tracking
     * information.
     * </pre>
     *
     * <code>CONVERSION_TRACKING_NOT_ENABLED_AT_CALL_TIME = 21;</code>
     */
    public static final int CONVERSION_TRACKING_NOT_ENABLED_AT_CALL_TIME_VALUE = 21;
    /**
     * <pre>
     * The caller’s phone number cannot be parsed. It should be formatted either
     * as E.164 "+16502531234", International "+64 3-331 6005" or US national
     * number "6502531234".
     * </pre>
     *
     * <code>UNPARSEABLE_CALLERS_PHONE_NUMBER = 22;</code>
     */
    public static final int UNPARSEABLE_CALLERS_PHONE_NUMBER_VALUE = 22;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static ConversionUploadError valueOf(int value) {
      return forNumber(value);
    }

    public static ConversionUploadError forNumber(int value) {
      switch (value) {
        case 0: return UNSPECIFIED;
        case 1: return UNKNOWN;
        case 2: return TOO_MANY_CONVERSIONS_IN_REQUEST;
        case 3: return UNPARSEABLE_GCLID;
        case 4: return CONVERSION_PRECEDES_GCLID;
        case 5: return EXPIRED_GCLID;
        case 6: return TOO_RECENT_GCLID;
        case 7: return GCLID_NOT_FOUND;
        case 8: return UNAUTHORIZED_CUSTOMER;
        case 9: return INVALID_CONVERSION_ACTION;
        case 10: return TOO_RECENT_CONVERSION_ACTION;
        case 11: return CONVERSION_TRACKING_NOT_ENABLED_AT_IMPRESSION_TIME;
        case 12: return EXTERNAL_ATTRIBUTION_DATA_SET_FOR_NON_EXTERNALLY_ATTRIBUTED_CONVERSION_ACTION;
        case 13: return EXTERNAL_ATTRIBUTION_DATA_NOT_SET_FOR_EXTERNALLY_ATTRIBUTED_CONVERSION_ACTION;
        case 14: return ORDER_ID_NOT_PERMITTED_FOR_EXTERNALLY_ATTRIBUTED_CONVERSION_ACTION;
        case 15: return ORDER_ID_ALREADY_IN_USE;
        case 16: return DUPLICATE_ORDER_ID;
        case 17: return TOO_RECENT_CALL;
        case 18: return EXPIRED_CALL;
        case 19: return CALL_NOT_FOUND;
        case 20: return CONVERSION_PRECEDES_CALL;
        case 21: return CONVERSION_TRACKING_NOT_ENABLED_AT_CALL_TIME;
        case 22: return UNPARSEABLE_CALLERS_PHONE_NUMBER;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<ConversionUploadError>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        ConversionUploadError> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<ConversionUploadError>() {
            public ConversionUploadError findValueByNumber(int number) {
              return ConversionUploadError.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.google.ads.googleads.v3.errors.ConversionUploadErrorEnum.getDescriptor().getEnumTypes().get(0);
    }

    private static final ConversionUploadError[] VALUES = values();

    public static ConversionUploadError valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private ConversionUploadError(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.ads.googleads.v3.errors.ConversionUploadErrorEnum.ConversionUploadError)
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
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.ads.googleads.v3.errors.ConversionUploadErrorEnum)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v3.errors.ConversionUploadErrorEnum other = (com.google.ads.googleads.v3.errors.ConversionUploadErrorEnum) obj;

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
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v3.errors.ConversionUploadErrorEnum parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v3.errors.ConversionUploadErrorEnum parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v3.errors.ConversionUploadErrorEnum parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v3.errors.ConversionUploadErrorEnum parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v3.errors.ConversionUploadErrorEnum parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v3.errors.ConversionUploadErrorEnum parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v3.errors.ConversionUploadErrorEnum parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v3.errors.ConversionUploadErrorEnum parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v3.errors.ConversionUploadErrorEnum parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v3.errors.ConversionUploadErrorEnum parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v3.errors.ConversionUploadErrorEnum parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v3.errors.ConversionUploadErrorEnum parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v3.errors.ConversionUploadErrorEnum prototype) {
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
   * Container for enum describing possible conversion upload errors.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v3.errors.ConversionUploadErrorEnum}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v3.errors.ConversionUploadErrorEnum)
      com.google.ads.googleads.v3.errors.ConversionUploadErrorEnumOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v3.errors.ConversionUploadErrorProto.internal_static_google_ads_googleads_v3_errors_ConversionUploadErrorEnum_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v3.errors.ConversionUploadErrorProto.internal_static_google_ads_googleads_v3_errors_ConversionUploadErrorEnum_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v3.errors.ConversionUploadErrorEnum.class, com.google.ads.googleads.v3.errors.ConversionUploadErrorEnum.Builder.class);
    }

    // Construct using com.google.ads.googleads.v3.errors.ConversionUploadErrorEnum.newBuilder()
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
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v3.errors.ConversionUploadErrorProto.internal_static_google_ads_googleads_v3_errors_ConversionUploadErrorEnum_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v3.errors.ConversionUploadErrorEnum getDefaultInstanceForType() {
      return com.google.ads.googleads.v3.errors.ConversionUploadErrorEnum.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v3.errors.ConversionUploadErrorEnum build() {
      com.google.ads.googleads.v3.errors.ConversionUploadErrorEnum result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v3.errors.ConversionUploadErrorEnum buildPartial() {
      com.google.ads.googleads.v3.errors.ConversionUploadErrorEnum result = new com.google.ads.googleads.v3.errors.ConversionUploadErrorEnum(this);
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
      if (other instanceof com.google.ads.googleads.v3.errors.ConversionUploadErrorEnum) {
        return mergeFrom((com.google.ads.googleads.v3.errors.ConversionUploadErrorEnum)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v3.errors.ConversionUploadErrorEnum other) {
      if (other == com.google.ads.googleads.v3.errors.ConversionUploadErrorEnum.getDefaultInstance()) return this;
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
      com.google.ads.googleads.v3.errors.ConversionUploadErrorEnum parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v3.errors.ConversionUploadErrorEnum) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v3.errors.ConversionUploadErrorEnum)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v3.errors.ConversionUploadErrorEnum)
  private static final com.google.ads.googleads.v3.errors.ConversionUploadErrorEnum DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v3.errors.ConversionUploadErrorEnum();
  }

  public static com.google.ads.googleads.v3.errors.ConversionUploadErrorEnum getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ConversionUploadErrorEnum>
      PARSER = new com.google.protobuf.AbstractParser<ConversionUploadErrorEnum>() {
    @java.lang.Override
    public ConversionUploadErrorEnum parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ConversionUploadErrorEnum(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ConversionUploadErrorEnum> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ConversionUploadErrorEnum> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v3.errors.ConversionUploadErrorEnum getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

