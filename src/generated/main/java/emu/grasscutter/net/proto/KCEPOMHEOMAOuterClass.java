// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: KCEPOMHEOMA.proto

package emu.grasscutter.net.proto;

public final class KCEPOMHEOMAOuterClass {
  private KCEPOMHEOMAOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface KCEPOMHEOMAOrBuilder extends
      // @@protoc_insertion_point(interface_extends:KCEPOMHEOMA)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated uint32 KBDPEPNNMMJ = 14;</code>
     * @return A list containing the kBDPEPNNMMJ.
     */
    java.util.List<java.lang.Integer> getKBDPEPNNMMJList();
    /**
     * <code>repeated uint32 KBDPEPNNMMJ = 14;</code>
     * @return The count of kBDPEPNNMMJ.
     */
    int getKBDPEPNNMMJCount();
    /**
     * <code>repeated uint32 KBDPEPNNMMJ = 14;</code>
     * @param index The index of the element to return.
     * @return The kBDPEPNNMMJ at the given index.
     */
    int getKBDPEPNNMMJ(int index);

    /**
     * <code>uint32 uid = 12;</code>
     * @return The uid.
     */
    int getUid();

    /**
     * <code>repeated uint32 MIBBOJLONLD = 13;</code>
     * @return A list containing the mIBBOJLONLD.
     */
    java.util.List<java.lang.Integer> getMIBBOJLONLDList();
    /**
     * <code>repeated uint32 MIBBOJLONLD = 13;</code>
     * @return The count of mIBBOJLONLD.
     */
    int getMIBBOJLONLDCount();
    /**
     * <code>repeated uint32 MIBBOJLONLD = 13;</code>
     * @param index The index of the element to return.
     * @return The mIBBOJLONLD at the given index.
     */
    int getMIBBOJLONLD(int index);
  }
  /**
   * Protobuf type {@code KCEPOMHEOMA}
   */
  public static final class KCEPOMHEOMA extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:KCEPOMHEOMA)
      KCEPOMHEOMAOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use KCEPOMHEOMA.newBuilder() to construct.
    private KCEPOMHEOMA(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private KCEPOMHEOMA() {
      kBDPEPNNMMJ_ = emptyIntList();
      mIBBOJLONLD_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new KCEPOMHEOMA();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private KCEPOMHEOMA(
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
            case 96: {

              uid_ = input.readUInt32();
              break;
            }
            case 104: {
              if (!((mutable_bitField0_ & 0x00000002) != 0)) {
                mIBBOJLONLD_ = newIntList();
                mutable_bitField0_ |= 0x00000002;
              }
              mIBBOJLONLD_.addInt(input.readUInt32());
              break;
            }
            case 106: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000002) != 0) && input.getBytesUntilLimit() > 0) {
                mIBBOJLONLD_ = newIntList();
                mutable_bitField0_ |= 0x00000002;
              }
              while (input.getBytesUntilLimit() > 0) {
                mIBBOJLONLD_.addInt(input.readUInt32());
              }
              input.popLimit(limit);
              break;
            }
            case 112: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                kBDPEPNNMMJ_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              kBDPEPNNMMJ_.addInt(input.readUInt32());
              break;
            }
            case 114: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                kBDPEPNNMMJ_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                kBDPEPNNMMJ_.addInt(input.readUInt32());
              }
              input.popLimit(limit);
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
        if (((mutable_bitField0_ & 0x00000002) != 0)) {
          mIBBOJLONLD_.makeImmutable(); // C
        }
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          kBDPEPNNMMJ_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.KCEPOMHEOMAOuterClass.internal_static_KCEPOMHEOMA_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.KCEPOMHEOMAOuterClass.internal_static_KCEPOMHEOMA_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.KCEPOMHEOMAOuterClass.KCEPOMHEOMA.class, emu.grasscutter.net.proto.KCEPOMHEOMAOuterClass.KCEPOMHEOMA.Builder.class);
    }

    public static final int KBDPEPNNMMJ_FIELD_NUMBER = 14;
    private com.google.protobuf.Internal.IntList kBDPEPNNMMJ_;
    /**
     * <code>repeated uint32 KBDPEPNNMMJ = 14;</code>
     * @return A list containing the kBDPEPNNMMJ.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getKBDPEPNNMMJList() {
      return kBDPEPNNMMJ_;
    }
    /**
     * <code>repeated uint32 KBDPEPNNMMJ = 14;</code>
     * @return The count of kBDPEPNNMMJ.
     */
    public int getKBDPEPNNMMJCount() {
      return kBDPEPNNMMJ_.size();
    }
    /**
     * <code>repeated uint32 KBDPEPNNMMJ = 14;</code>
     * @param index The index of the element to return.
     * @return The kBDPEPNNMMJ at the given index.
     */
    public int getKBDPEPNNMMJ(int index) {
      return kBDPEPNNMMJ_.getInt(index);
    }
    private int kBDPEPNNMMJMemoizedSerializedSize = -1;

    public static final int UID_FIELD_NUMBER = 12;
    private int uid_;
    /**
     * <code>uint32 uid = 12;</code>
     * @return The uid.
     */
    @java.lang.Override
    public int getUid() {
      return uid_;
    }

    public static final int MIBBOJLONLD_FIELD_NUMBER = 13;
    private com.google.protobuf.Internal.IntList mIBBOJLONLD_;
    /**
     * <code>repeated uint32 MIBBOJLONLD = 13;</code>
     * @return A list containing the mIBBOJLONLD.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getMIBBOJLONLDList() {
      return mIBBOJLONLD_;
    }
    /**
     * <code>repeated uint32 MIBBOJLONLD = 13;</code>
     * @return The count of mIBBOJLONLD.
     */
    public int getMIBBOJLONLDCount() {
      return mIBBOJLONLD_.size();
    }
    /**
     * <code>repeated uint32 MIBBOJLONLD = 13;</code>
     * @param index The index of the element to return.
     * @return The mIBBOJLONLD at the given index.
     */
    public int getMIBBOJLONLD(int index) {
      return mIBBOJLONLD_.getInt(index);
    }
    private int mIBBOJLONLDMemoizedSerializedSize = -1;

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
      getSerializedSize();
      if (uid_ != 0) {
        output.writeUInt32(12, uid_);
      }
      if (getMIBBOJLONLDList().size() > 0) {
        output.writeUInt32NoTag(106);
        output.writeUInt32NoTag(mIBBOJLONLDMemoizedSerializedSize);
      }
      for (int i = 0; i < mIBBOJLONLD_.size(); i++) {
        output.writeUInt32NoTag(mIBBOJLONLD_.getInt(i));
      }
      if (getKBDPEPNNMMJList().size() > 0) {
        output.writeUInt32NoTag(114);
        output.writeUInt32NoTag(kBDPEPNNMMJMemoizedSerializedSize);
      }
      for (int i = 0; i < kBDPEPNNMMJ_.size(); i++) {
        output.writeUInt32NoTag(kBDPEPNNMMJ_.getInt(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (uid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, uid_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < mIBBOJLONLD_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(mIBBOJLONLD_.getInt(i));
        }
        size += dataSize;
        if (!getMIBBOJLONLDList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        mIBBOJLONLDMemoizedSerializedSize = dataSize;
      }
      {
        int dataSize = 0;
        for (int i = 0; i < kBDPEPNNMMJ_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(kBDPEPNNMMJ_.getInt(i));
        }
        size += dataSize;
        if (!getKBDPEPNNMMJList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        kBDPEPNNMMJMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof emu.grasscutter.net.proto.KCEPOMHEOMAOuterClass.KCEPOMHEOMA)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.KCEPOMHEOMAOuterClass.KCEPOMHEOMA other = (emu.grasscutter.net.proto.KCEPOMHEOMAOuterClass.KCEPOMHEOMA) obj;

      if (!getKBDPEPNNMMJList()
          .equals(other.getKBDPEPNNMMJList())) return false;
      if (getUid()
          != other.getUid()) return false;
      if (!getMIBBOJLONLDList()
          .equals(other.getMIBBOJLONLDList())) return false;
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
      if (getKBDPEPNNMMJCount() > 0) {
        hash = (37 * hash) + KBDPEPNNMMJ_FIELD_NUMBER;
        hash = (53 * hash) + getKBDPEPNNMMJList().hashCode();
      }
      hash = (37 * hash) + UID_FIELD_NUMBER;
      hash = (53 * hash) + getUid();
      if (getMIBBOJLONLDCount() > 0) {
        hash = (37 * hash) + MIBBOJLONLD_FIELD_NUMBER;
        hash = (53 * hash) + getMIBBOJLONLDList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.KCEPOMHEOMAOuterClass.KCEPOMHEOMA parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.KCEPOMHEOMAOuterClass.KCEPOMHEOMA parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.KCEPOMHEOMAOuterClass.KCEPOMHEOMA parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.KCEPOMHEOMAOuterClass.KCEPOMHEOMA parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.KCEPOMHEOMAOuterClass.KCEPOMHEOMA parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.KCEPOMHEOMAOuterClass.KCEPOMHEOMA parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.KCEPOMHEOMAOuterClass.KCEPOMHEOMA parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.KCEPOMHEOMAOuterClass.KCEPOMHEOMA parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.KCEPOMHEOMAOuterClass.KCEPOMHEOMA parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.KCEPOMHEOMAOuterClass.KCEPOMHEOMA parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.KCEPOMHEOMAOuterClass.KCEPOMHEOMA parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.KCEPOMHEOMAOuterClass.KCEPOMHEOMA parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.KCEPOMHEOMAOuterClass.KCEPOMHEOMA prototype) {
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
     * Protobuf type {@code KCEPOMHEOMA}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:KCEPOMHEOMA)
        emu.grasscutter.net.proto.KCEPOMHEOMAOuterClass.KCEPOMHEOMAOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.KCEPOMHEOMAOuterClass.internal_static_KCEPOMHEOMA_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.KCEPOMHEOMAOuterClass.internal_static_KCEPOMHEOMA_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.KCEPOMHEOMAOuterClass.KCEPOMHEOMA.class, emu.grasscutter.net.proto.KCEPOMHEOMAOuterClass.KCEPOMHEOMA.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.KCEPOMHEOMAOuterClass.KCEPOMHEOMA.newBuilder()
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
        kBDPEPNNMMJ_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        uid_ = 0;

        mIBBOJLONLD_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.KCEPOMHEOMAOuterClass.internal_static_KCEPOMHEOMA_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.KCEPOMHEOMAOuterClass.KCEPOMHEOMA getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.KCEPOMHEOMAOuterClass.KCEPOMHEOMA.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.KCEPOMHEOMAOuterClass.KCEPOMHEOMA build() {
        emu.grasscutter.net.proto.KCEPOMHEOMAOuterClass.KCEPOMHEOMA result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.KCEPOMHEOMAOuterClass.KCEPOMHEOMA buildPartial() {
        emu.grasscutter.net.proto.KCEPOMHEOMAOuterClass.KCEPOMHEOMA result = new emu.grasscutter.net.proto.KCEPOMHEOMAOuterClass.KCEPOMHEOMA(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) != 0)) {
          kBDPEPNNMMJ_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.kBDPEPNNMMJ_ = kBDPEPNNMMJ_;
        result.uid_ = uid_;
        if (((bitField0_ & 0x00000002) != 0)) {
          mIBBOJLONLD_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.mIBBOJLONLD_ = mIBBOJLONLD_;
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
        if (other instanceof emu.grasscutter.net.proto.KCEPOMHEOMAOuterClass.KCEPOMHEOMA) {
          return mergeFrom((emu.grasscutter.net.proto.KCEPOMHEOMAOuterClass.KCEPOMHEOMA)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.KCEPOMHEOMAOuterClass.KCEPOMHEOMA other) {
        if (other == emu.grasscutter.net.proto.KCEPOMHEOMAOuterClass.KCEPOMHEOMA.getDefaultInstance()) return this;
        if (!other.kBDPEPNNMMJ_.isEmpty()) {
          if (kBDPEPNNMMJ_.isEmpty()) {
            kBDPEPNNMMJ_ = other.kBDPEPNNMMJ_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureKBDPEPNNMMJIsMutable();
            kBDPEPNNMMJ_.addAll(other.kBDPEPNNMMJ_);
          }
          onChanged();
        }
        if (other.getUid() != 0) {
          setUid(other.getUid());
        }
        if (!other.mIBBOJLONLD_.isEmpty()) {
          if (mIBBOJLONLD_.isEmpty()) {
            mIBBOJLONLD_ = other.mIBBOJLONLD_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureMIBBOJLONLDIsMutable();
            mIBBOJLONLD_.addAll(other.mIBBOJLONLD_);
          }
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
        emu.grasscutter.net.proto.KCEPOMHEOMAOuterClass.KCEPOMHEOMA parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.KCEPOMHEOMAOuterClass.KCEPOMHEOMA) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private com.google.protobuf.Internal.IntList kBDPEPNNMMJ_ = emptyIntList();
      private void ensureKBDPEPNNMMJIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          kBDPEPNNMMJ_ = mutableCopy(kBDPEPNNMMJ_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 KBDPEPNNMMJ = 14;</code>
       * @return A list containing the kBDPEPNNMMJ.
       */
      public java.util.List<java.lang.Integer>
          getKBDPEPNNMMJList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(kBDPEPNNMMJ_) : kBDPEPNNMMJ_;
      }
      /**
       * <code>repeated uint32 KBDPEPNNMMJ = 14;</code>
       * @return The count of kBDPEPNNMMJ.
       */
      public int getKBDPEPNNMMJCount() {
        return kBDPEPNNMMJ_.size();
      }
      /**
       * <code>repeated uint32 KBDPEPNNMMJ = 14;</code>
       * @param index The index of the element to return.
       * @return The kBDPEPNNMMJ at the given index.
       */
      public int getKBDPEPNNMMJ(int index) {
        return kBDPEPNNMMJ_.getInt(index);
      }
      /**
       * <code>repeated uint32 KBDPEPNNMMJ = 14;</code>
       * @param index The index to set the value at.
       * @param value The kBDPEPNNMMJ to set.
       * @return This builder for chaining.
       */
      public Builder setKBDPEPNNMMJ(
          int index, int value) {
        ensureKBDPEPNNMMJIsMutable();
        kBDPEPNNMMJ_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 KBDPEPNNMMJ = 14;</code>
       * @param value The kBDPEPNNMMJ to add.
       * @return This builder for chaining.
       */
      public Builder addKBDPEPNNMMJ(int value) {
        ensureKBDPEPNNMMJIsMutable();
        kBDPEPNNMMJ_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 KBDPEPNNMMJ = 14;</code>
       * @param values The kBDPEPNNMMJ to add.
       * @return This builder for chaining.
       */
      public Builder addAllKBDPEPNNMMJ(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureKBDPEPNNMMJIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, kBDPEPNNMMJ_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 KBDPEPNNMMJ = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearKBDPEPNNMMJ() {
        kBDPEPNNMMJ_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private int uid_ ;
      /**
       * <code>uint32 uid = 12;</code>
       * @return The uid.
       */
      @java.lang.Override
      public int getUid() {
        return uid_;
      }
      /**
       * <code>uint32 uid = 12;</code>
       * @param value The uid to set.
       * @return This builder for chaining.
       */
      public Builder setUid(int value) {
        
        uid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 uid = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearUid() {
        
        uid_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList mIBBOJLONLD_ = emptyIntList();
      private void ensureMIBBOJLONLDIsMutable() {
        if (!((bitField0_ & 0x00000002) != 0)) {
          mIBBOJLONLD_ = mutableCopy(mIBBOJLONLD_);
          bitField0_ |= 0x00000002;
         }
      }
      /**
       * <code>repeated uint32 MIBBOJLONLD = 13;</code>
       * @return A list containing the mIBBOJLONLD.
       */
      public java.util.List<java.lang.Integer>
          getMIBBOJLONLDList() {
        return ((bitField0_ & 0x00000002) != 0) ?
                 java.util.Collections.unmodifiableList(mIBBOJLONLD_) : mIBBOJLONLD_;
      }
      /**
       * <code>repeated uint32 MIBBOJLONLD = 13;</code>
       * @return The count of mIBBOJLONLD.
       */
      public int getMIBBOJLONLDCount() {
        return mIBBOJLONLD_.size();
      }
      /**
       * <code>repeated uint32 MIBBOJLONLD = 13;</code>
       * @param index The index of the element to return.
       * @return The mIBBOJLONLD at the given index.
       */
      public int getMIBBOJLONLD(int index) {
        return mIBBOJLONLD_.getInt(index);
      }
      /**
       * <code>repeated uint32 MIBBOJLONLD = 13;</code>
       * @param index The index to set the value at.
       * @param value The mIBBOJLONLD to set.
       * @return This builder for chaining.
       */
      public Builder setMIBBOJLONLD(
          int index, int value) {
        ensureMIBBOJLONLDIsMutable();
        mIBBOJLONLD_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 MIBBOJLONLD = 13;</code>
       * @param value The mIBBOJLONLD to add.
       * @return This builder for chaining.
       */
      public Builder addMIBBOJLONLD(int value) {
        ensureMIBBOJLONLDIsMutable();
        mIBBOJLONLD_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 MIBBOJLONLD = 13;</code>
       * @param values The mIBBOJLONLD to add.
       * @return This builder for chaining.
       */
      public Builder addAllMIBBOJLONLD(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureMIBBOJLONLDIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, mIBBOJLONLD_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 MIBBOJLONLD = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearMIBBOJLONLD() {
        mIBBOJLONLD_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000002);
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


      // @@protoc_insertion_point(builder_scope:KCEPOMHEOMA)
    }

    // @@protoc_insertion_point(class_scope:KCEPOMHEOMA)
    private static final emu.grasscutter.net.proto.KCEPOMHEOMAOuterClass.KCEPOMHEOMA DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.KCEPOMHEOMAOuterClass.KCEPOMHEOMA();
    }

    public static emu.grasscutter.net.proto.KCEPOMHEOMAOuterClass.KCEPOMHEOMA getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<KCEPOMHEOMA>
        PARSER = new com.google.protobuf.AbstractParser<KCEPOMHEOMA>() {
      @java.lang.Override
      public KCEPOMHEOMA parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new KCEPOMHEOMA(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<KCEPOMHEOMA> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<KCEPOMHEOMA> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.KCEPOMHEOMAOuterClass.KCEPOMHEOMA getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_KCEPOMHEOMA_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_KCEPOMHEOMA_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021KCEPOMHEOMA.proto\"D\n\013KCEPOMHEOMA\022\023\n\013KB" +
      "DPEPNNMMJ\030\016 \003(\r\022\013\n\003uid\030\014 \001(\r\022\023\n\013MIBBOJLO" +
      "NLD\030\r \003(\rB\033\n\031emu.grasscutter.net.protob\006" +
      "proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_KCEPOMHEOMA_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_KCEPOMHEOMA_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_KCEPOMHEOMA_descriptor,
        new java.lang.String[] { "KBDPEPNNMMJ", "Uid", "MIBBOJLONLD", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}