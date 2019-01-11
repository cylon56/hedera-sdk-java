// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BasicTypes.proto

package com.hederahashgraph.api.proto.java;

/**
 * <pre>
 * The fees for a specific transaction or query based on the fee data. 
 * </pre>
 *
 * Protobuf type {@code proto.TransactionFeeSchedule}
 */
public  final class TransactionFeeSchedule extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:proto.TransactionFeeSchedule)
    TransactionFeeScheduleOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TransactionFeeSchedule.newBuilder() to construct.
  private TransactionFeeSchedule(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TransactionFeeSchedule() {
    hederaFunctionality_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private TransactionFeeSchedule(
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
          case 8: {
            int rawValue = input.readEnum();

            hederaFunctionality_ = rawValue;
            break;
          }
          case 18: {
            com.hederahashgraph.api.proto.java.FeeData.Builder subBuilder = null;
            if (feeData_ != null) {
              subBuilder = feeData_.toBuilder();
            }
            feeData_ = input.readMessage(com.hederahashgraph.api.proto.java.FeeData.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(feeData_);
              feeData_ = subBuilder.buildPartial();
            }

            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
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
    return com.hederahashgraph.api.proto.java.BasicTypes.internal_static_proto_TransactionFeeSchedule_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.hederahashgraph.api.proto.java.BasicTypes.internal_static_proto_TransactionFeeSchedule_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.hederahashgraph.api.proto.java.TransactionFeeSchedule.class, com.hederahashgraph.api.proto.java.TransactionFeeSchedule.Builder.class);
  }

  public static final int HEDERAFUNCTIONALITY_FIELD_NUMBER = 1;
  private int hederaFunctionality_;
  /**
   * <pre>
   * Specific Transaction or Query
   * </pre>
   *
   * <code>.proto.HederaFunctionality hederaFunctionality = 1;</code>
   */
  public int getHederaFunctionalityValue() {
    return hederaFunctionality_;
  }
  /**
   * <pre>
   * Specific Transaction or Query
   * </pre>
   *
   * <code>.proto.HederaFunctionality hederaFunctionality = 1;</code>
   */
  public com.hederahashgraph.api.proto.java.HederaFunctionality getHederaFunctionality() {
    @SuppressWarnings("deprecation")
    com.hederahashgraph.api.proto.java.HederaFunctionality result = com.hederahashgraph.api.proto.java.HederaFunctionality.valueOf(hederaFunctionality_);
    return result == null ? com.hederahashgraph.api.proto.java.HederaFunctionality.UNRECOGNIZED : result;
  }

  public static final int FEEDATA_FIELD_NUMBER = 2;
  private com.hederahashgraph.api.proto.java.FeeData feeData_;
  /**
   * <pre>
   * the fee information about the query/data
   * </pre>
   *
   * <code>.proto.FeeData feeData = 2;</code>
   */
  public boolean hasFeeData() {
    return feeData_ != null;
  }
  /**
   * <pre>
   * the fee information about the query/data
   * </pre>
   *
   * <code>.proto.FeeData feeData = 2;</code>
   */
  public com.hederahashgraph.api.proto.java.FeeData getFeeData() {
    return feeData_ == null ? com.hederahashgraph.api.proto.java.FeeData.getDefaultInstance() : feeData_;
  }
  /**
   * <pre>
   * the fee information about the query/data
   * </pre>
   *
   * <code>.proto.FeeData feeData = 2;</code>
   */
  public com.hederahashgraph.api.proto.java.FeeDataOrBuilder getFeeDataOrBuilder() {
    return getFeeData();
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
    if (hederaFunctionality_ != com.hederahashgraph.api.proto.java.HederaFunctionality.CryptoCreates.getNumber()) {
      output.writeEnum(1, hederaFunctionality_);
    }
    if (feeData_ != null) {
      output.writeMessage(2, getFeeData());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (hederaFunctionality_ != com.hederahashgraph.api.proto.java.HederaFunctionality.CryptoCreates.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, hederaFunctionality_);
    }
    if (feeData_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getFeeData());
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
    if (!(obj instanceof com.hederahashgraph.api.proto.java.TransactionFeeSchedule)) {
      return super.equals(obj);
    }
    com.hederahashgraph.api.proto.java.TransactionFeeSchedule other = (com.hederahashgraph.api.proto.java.TransactionFeeSchedule) obj;

    boolean result = true;
    result = result && hederaFunctionality_ == other.hederaFunctionality_;
    result = result && (hasFeeData() == other.hasFeeData());
    if (hasFeeData()) {
      result = result && getFeeData()
          .equals(other.getFeeData());
    }
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + HEDERAFUNCTIONALITY_FIELD_NUMBER;
    hash = (53 * hash) + hederaFunctionality_;
    if (hasFeeData()) {
      hash = (37 * hash) + FEEDATA_FIELD_NUMBER;
      hash = (53 * hash) + getFeeData().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.hederahashgraph.api.proto.java.TransactionFeeSchedule parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.hederahashgraph.api.proto.java.TransactionFeeSchedule parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.hederahashgraph.api.proto.java.TransactionFeeSchedule parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.hederahashgraph.api.proto.java.TransactionFeeSchedule parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.hederahashgraph.api.proto.java.TransactionFeeSchedule parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.hederahashgraph.api.proto.java.TransactionFeeSchedule parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.hederahashgraph.api.proto.java.TransactionFeeSchedule parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.hederahashgraph.api.proto.java.TransactionFeeSchedule parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.hederahashgraph.api.proto.java.TransactionFeeSchedule parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.hederahashgraph.api.proto.java.TransactionFeeSchedule parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.hederahashgraph.api.proto.java.TransactionFeeSchedule parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.hederahashgraph.api.proto.java.TransactionFeeSchedule parseFrom(
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
  public static Builder newBuilder(com.hederahashgraph.api.proto.java.TransactionFeeSchedule prototype) {
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
   * The fees for a specific transaction or query based on the fee data. 
   * </pre>
   *
   * Protobuf type {@code proto.TransactionFeeSchedule}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:proto.TransactionFeeSchedule)
      com.hederahashgraph.api.proto.java.TransactionFeeScheduleOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.hederahashgraph.api.proto.java.BasicTypes.internal_static_proto_TransactionFeeSchedule_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.hederahashgraph.api.proto.java.BasicTypes.internal_static_proto_TransactionFeeSchedule_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.hederahashgraph.api.proto.java.TransactionFeeSchedule.class, com.hederahashgraph.api.proto.java.TransactionFeeSchedule.Builder.class);
    }

    // Construct using com.hederahashgraph.api.proto.java.TransactionFeeSchedule.newBuilder()
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
      hederaFunctionality_ = 0;

      if (feeDataBuilder_ == null) {
        feeData_ = null;
      } else {
        feeData_ = null;
        feeDataBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.hederahashgraph.api.proto.java.BasicTypes.internal_static_proto_TransactionFeeSchedule_descriptor;
    }

    @java.lang.Override
    public com.hederahashgraph.api.proto.java.TransactionFeeSchedule getDefaultInstanceForType() {
      return com.hederahashgraph.api.proto.java.TransactionFeeSchedule.getDefaultInstance();
    }

    @java.lang.Override
    public com.hederahashgraph.api.proto.java.TransactionFeeSchedule build() {
      com.hederahashgraph.api.proto.java.TransactionFeeSchedule result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.hederahashgraph.api.proto.java.TransactionFeeSchedule buildPartial() {
      com.hederahashgraph.api.proto.java.TransactionFeeSchedule result = new com.hederahashgraph.api.proto.java.TransactionFeeSchedule(this);
      result.hederaFunctionality_ = hederaFunctionality_;
      if (feeDataBuilder_ == null) {
        result.feeData_ = feeData_;
      } else {
        result.feeData_ = feeDataBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.hederahashgraph.api.proto.java.TransactionFeeSchedule) {
        return mergeFrom((com.hederahashgraph.api.proto.java.TransactionFeeSchedule)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.hederahashgraph.api.proto.java.TransactionFeeSchedule other) {
      if (other == com.hederahashgraph.api.proto.java.TransactionFeeSchedule.getDefaultInstance()) return this;
      if (other.hederaFunctionality_ != 0) {
        setHederaFunctionalityValue(other.getHederaFunctionalityValue());
      }
      if (other.hasFeeData()) {
        mergeFeeData(other.getFeeData());
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
      com.hederahashgraph.api.proto.java.TransactionFeeSchedule parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.hederahashgraph.api.proto.java.TransactionFeeSchedule) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int hederaFunctionality_ = 0;
    /**
     * <pre>
     * Specific Transaction or Query
     * </pre>
     *
     * <code>.proto.HederaFunctionality hederaFunctionality = 1;</code>
     */
    public int getHederaFunctionalityValue() {
      return hederaFunctionality_;
    }
    /**
     * <pre>
     * Specific Transaction or Query
     * </pre>
     *
     * <code>.proto.HederaFunctionality hederaFunctionality = 1;</code>
     */
    public Builder setHederaFunctionalityValue(int value) {
      hederaFunctionality_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Specific Transaction or Query
     * </pre>
     *
     * <code>.proto.HederaFunctionality hederaFunctionality = 1;</code>
     */
    public com.hederahashgraph.api.proto.java.HederaFunctionality getHederaFunctionality() {
      @SuppressWarnings("deprecation")
      com.hederahashgraph.api.proto.java.HederaFunctionality result = com.hederahashgraph.api.proto.java.HederaFunctionality.valueOf(hederaFunctionality_);
      return result == null ? com.hederahashgraph.api.proto.java.HederaFunctionality.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Specific Transaction or Query
     * </pre>
     *
     * <code>.proto.HederaFunctionality hederaFunctionality = 1;</code>
     */
    public Builder setHederaFunctionality(com.hederahashgraph.api.proto.java.HederaFunctionality value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      hederaFunctionality_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Specific Transaction or Query
     * </pre>
     *
     * <code>.proto.HederaFunctionality hederaFunctionality = 1;</code>
     */
    public Builder clearHederaFunctionality() {
      
      hederaFunctionality_ = 0;
      onChanged();
      return this;
    }

    private com.hederahashgraph.api.proto.java.FeeData feeData_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.hederahashgraph.api.proto.java.FeeData, com.hederahashgraph.api.proto.java.FeeData.Builder, com.hederahashgraph.api.proto.java.FeeDataOrBuilder> feeDataBuilder_;
    /**
     * <pre>
     * the fee information about the query/data
     * </pre>
     *
     * <code>.proto.FeeData feeData = 2;</code>
     */
    public boolean hasFeeData() {
      return feeDataBuilder_ != null || feeData_ != null;
    }
    /**
     * <pre>
     * the fee information about the query/data
     * </pre>
     *
     * <code>.proto.FeeData feeData = 2;</code>
     */
    public com.hederahashgraph.api.proto.java.FeeData getFeeData() {
      if (feeDataBuilder_ == null) {
        return feeData_ == null ? com.hederahashgraph.api.proto.java.FeeData.getDefaultInstance() : feeData_;
      } else {
        return feeDataBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * the fee information about the query/data
     * </pre>
     *
     * <code>.proto.FeeData feeData = 2;</code>
     */
    public Builder setFeeData(com.hederahashgraph.api.proto.java.FeeData value) {
      if (feeDataBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        feeData_ = value;
        onChanged();
      } else {
        feeDataBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * the fee information about the query/data
     * </pre>
     *
     * <code>.proto.FeeData feeData = 2;</code>
     */
    public Builder setFeeData(
        com.hederahashgraph.api.proto.java.FeeData.Builder builderForValue) {
      if (feeDataBuilder_ == null) {
        feeData_ = builderForValue.build();
        onChanged();
      } else {
        feeDataBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * the fee information about the query/data
     * </pre>
     *
     * <code>.proto.FeeData feeData = 2;</code>
     */
    public Builder mergeFeeData(com.hederahashgraph.api.proto.java.FeeData value) {
      if (feeDataBuilder_ == null) {
        if (feeData_ != null) {
          feeData_ =
            com.hederahashgraph.api.proto.java.FeeData.newBuilder(feeData_).mergeFrom(value).buildPartial();
        } else {
          feeData_ = value;
        }
        onChanged();
      } else {
        feeDataBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * the fee information about the query/data
     * </pre>
     *
     * <code>.proto.FeeData feeData = 2;</code>
     */
    public Builder clearFeeData() {
      if (feeDataBuilder_ == null) {
        feeData_ = null;
        onChanged();
      } else {
        feeData_ = null;
        feeDataBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * the fee information about the query/data
     * </pre>
     *
     * <code>.proto.FeeData feeData = 2;</code>
     */
    public com.hederahashgraph.api.proto.java.FeeData.Builder getFeeDataBuilder() {
      
      onChanged();
      return getFeeDataFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * the fee information about the query/data
     * </pre>
     *
     * <code>.proto.FeeData feeData = 2;</code>
     */
    public com.hederahashgraph.api.proto.java.FeeDataOrBuilder getFeeDataOrBuilder() {
      if (feeDataBuilder_ != null) {
        return feeDataBuilder_.getMessageOrBuilder();
      } else {
        return feeData_ == null ?
            com.hederahashgraph.api.proto.java.FeeData.getDefaultInstance() : feeData_;
      }
    }
    /**
     * <pre>
     * the fee information about the query/data
     * </pre>
     *
     * <code>.proto.FeeData feeData = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.hederahashgraph.api.proto.java.FeeData, com.hederahashgraph.api.proto.java.FeeData.Builder, com.hederahashgraph.api.proto.java.FeeDataOrBuilder> 
        getFeeDataFieldBuilder() {
      if (feeDataBuilder_ == null) {
        feeDataBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.hederahashgraph.api.proto.java.FeeData, com.hederahashgraph.api.proto.java.FeeData.Builder, com.hederahashgraph.api.proto.java.FeeDataOrBuilder>(
                getFeeData(),
                getParentForChildren(),
                isClean());
        feeData_ = null;
      }
      return feeDataBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:proto.TransactionFeeSchedule)
  }

  // @@protoc_insertion_point(class_scope:proto.TransactionFeeSchedule)
  private static final com.hederahashgraph.api.proto.java.TransactionFeeSchedule DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.hederahashgraph.api.proto.java.TransactionFeeSchedule();
  }

  public static com.hederahashgraph.api.proto.java.TransactionFeeSchedule getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TransactionFeeSchedule>
      PARSER = new com.google.protobuf.AbstractParser<TransactionFeeSchedule>() {
    @java.lang.Override
    public TransactionFeeSchedule parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new TransactionFeeSchedule(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<TransactionFeeSchedule> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TransactionFeeSchedule> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.hederahashgraph.api.proto.java.TransactionFeeSchedule getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

