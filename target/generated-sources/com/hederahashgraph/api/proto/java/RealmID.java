// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BasicTypes.proto

package com.hederahashgraph.api.proto.java;

/**
 * <pre>
 * The ID for a realm. Within a given shard, every realm has a unique ID. Each account, file, and contract instance belongs to exactly one realm. 
 * </pre>
 *
 * Protobuf type {@code proto.RealmID}
 */
public  final class RealmID extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:proto.RealmID)
    RealmIDOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RealmID.newBuilder() to construct.
  private RealmID(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RealmID() {
    shardNum_ = 0L;
    realmNum_ = 0L;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private RealmID(
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

            shardNum_ = input.readInt64();
            break;
          }
          case 16: {

            realmNum_ = input.readInt64();
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
    return com.hederahashgraph.api.proto.java.BasicTypes.internal_static_proto_RealmID_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.hederahashgraph.api.proto.java.BasicTypes.internal_static_proto_RealmID_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.hederahashgraph.api.proto.java.RealmID.class, com.hederahashgraph.api.proto.java.RealmID.Builder.class);
  }

  public static final int SHARDNUM_FIELD_NUMBER = 1;
  private long shardNum_;
  /**
   * <pre>
   *the shard number (nonnegative)
   * </pre>
   *
   * <code>int64 shardNum = 1;</code>
   */
  public long getShardNum() {
    return shardNum_;
  }

  public static final int REALMNUM_FIELD_NUMBER = 2;
  private long realmNum_;
  /**
   * <pre>
   *the realm number (nonnegative)
   * </pre>
   *
   * <code>int64 realmNum = 2;</code>
   */
  public long getRealmNum() {
    return realmNum_;
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
    if (shardNum_ != 0L) {
      output.writeInt64(1, shardNum_);
    }
    if (realmNum_ != 0L) {
      output.writeInt64(2, realmNum_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (shardNum_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, shardNum_);
    }
    if (realmNum_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, realmNum_);
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
    if (!(obj instanceof com.hederahashgraph.api.proto.java.RealmID)) {
      return super.equals(obj);
    }
    com.hederahashgraph.api.proto.java.RealmID other = (com.hederahashgraph.api.proto.java.RealmID) obj;

    boolean result = true;
    result = result && (getShardNum()
        == other.getShardNum());
    result = result && (getRealmNum()
        == other.getRealmNum());
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
    hash = (37 * hash) + SHARDNUM_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getShardNum());
    hash = (37 * hash) + REALMNUM_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getRealmNum());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.hederahashgraph.api.proto.java.RealmID parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.hederahashgraph.api.proto.java.RealmID parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.hederahashgraph.api.proto.java.RealmID parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.hederahashgraph.api.proto.java.RealmID parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.hederahashgraph.api.proto.java.RealmID parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.hederahashgraph.api.proto.java.RealmID parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.hederahashgraph.api.proto.java.RealmID parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.hederahashgraph.api.proto.java.RealmID parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.hederahashgraph.api.proto.java.RealmID parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.hederahashgraph.api.proto.java.RealmID parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.hederahashgraph.api.proto.java.RealmID parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.hederahashgraph.api.proto.java.RealmID parseFrom(
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
  public static Builder newBuilder(com.hederahashgraph.api.proto.java.RealmID prototype) {
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
   * The ID for a realm. Within a given shard, every realm has a unique ID. Each account, file, and contract instance belongs to exactly one realm. 
   * </pre>
   *
   * Protobuf type {@code proto.RealmID}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:proto.RealmID)
      com.hederahashgraph.api.proto.java.RealmIDOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.hederahashgraph.api.proto.java.BasicTypes.internal_static_proto_RealmID_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.hederahashgraph.api.proto.java.BasicTypes.internal_static_proto_RealmID_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.hederahashgraph.api.proto.java.RealmID.class, com.hederahashgraph.api.proto.java.RealmID.Builder.class);
    }

    // Construct using com.hederahashgraph.api.proto.java.RealmID.newBuilder()
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
      shardNum_ = 0L;

      realmNum_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.hederahashgraph.api.proto.java.BasicTypes.internal_static_proto_RealmID_descriptor;
    }

    @java.lang.Override
    public com.hederahashgraph.api.proto.java.RealmID getDefaultInstanceForType() {
      return com.hederahashgraph.api.proto.java.RealmID.getDefaultInstance();
    }

    @java.lang.Override
    public com.hederahashgraph.api.proto.java.RealmID build() {
      com.hederahashgraph.api.proto.java.RealmID result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.hederahashgraph.api.proto.java.RealmID buildPartial() {
      com.hederahashgraph.api.proto.java.RealmID result = new com.hederahashgraph.api.proto.java.RealmID(this);
      result.shardNum_ = shardNum_;
      result.realmNum_ = realmNum_;
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
      if (other instanceof com.hederahashgraph.api.proto.java.RealmID) {
        return mergeFrom((com.hederahashgraph.api.proto.java.RealmID)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.hederahashgraph.api.proto.java.RealmID other) {
      if (other == com.hederahashgraph.api.proto.java.RealmID.getDefaultInstance()) return this;
      if (other.getShardNum() != 0L) {
        setShardNum(other.getShardNum());
      }
      if (other.getRealmNum() != 0L) {
        setRealmNum(other.getRealmNum());
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
      com.hederahashgraph.api.proto.java.RealmID parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.hederahashgraph.api.proto.java.RealmID) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long shardNum_ ;
    /**
     * <pre>
     *the shard number (nonnegative)
     * </pre>
     *
     * <code>int64 shardNum = 1;</code>
     */
    public long getShardNum() {
      return shardNum_;
    }
    /**
     * <pre>
     *the shard number (nonnegative)
     * </pre>
     *
     * <code>int64 shardNum = 1;</code>
     */
    public Builder setShardNum(long value) {
      
      shardNum_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *the shard number (nonnegative)
     * </pre>
     *
     * <code>int64 shardNum = 1;</code>
     */
    public Builder clearShardNum() {
      
      shardNum_ = 0L;
      onChanged();
      return this;
    }

    private long realmNum_ ;
    /**
     * <pre>
     *the realm number (nonnegative)
     * </pre>
     *
     * <code>int64 realmNum = 2;</code>
     */
    public long getRealmNum() {
      return realmNum_;
    }
    /**
     * <pre>
     *the realm number (nonnegative)
     * </pre>
     *
     * <code>int64 realmNum = 2;</code>
     */
    public Builder setRealmNum(long value) {
      
      realmNum_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *the realm number (nonnegative)
     * </pre>
     *
     * <code>int64 realmNum = 2;</code>
     */
    public Builder clearRealmNum() {
      
      realmNum_ = 0L;
      onChanged();
      return this;
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


    // @@protoc_insertion_point(builder_scope:proto.RealmID)
  }

  // @@protoc_insertion_point(class_scope:proto.RealmID)
  private static final com.hederahashgraph.api.proto.java.RealmID DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.hederahashgraph.api.proto.java.RealmID();
  }

  public static com.hederahashgraph.api.proto.java.RealmID getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RealmID>
      PARSER = new com.google.protobuf.AbstractParser<RealmID>() {
    @java.lang.Override
    public RealmID parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new RealmID(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<RealmID> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RealmID> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.hederahashgraph.api.proto.java.RealmID getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

