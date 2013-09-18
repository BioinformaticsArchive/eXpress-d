// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/targets.proto

package expressd.protobuf;

public final class Targets {
  private Targets() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface TargetOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // optional string name = 1;
    boolean hasName();
    String getName();
    
    // required uint32 id = 2;
    boolean hasId();
    int getId();
    
    // required uint32 length = 3;
    boolean hasLength();
    int getLength();
    
    // required bytes seq = 4;
    boolean hasSeq();
    com.google.protobuf.ByteString getSeq();
  }
  public static final class Target extends
      com.google.protobuf.GeneratedMessage
      implements TargetOrBuilder {
    // Use Target.newBuilder() to construct.
    private Target(Builder builder) {
      super(builder);
    }
    private Target(boolean noInit) {}
    
    private static final Target defaultInstance;
    public static Target getDefaultInstance() {
      return defaultInstance;
    }
    
    public Target getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return expressd.protobuf.Targets.internal_static_proto_Target_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return expressd.protobuf.Targets.internal_static_proto_Target_fieldAccessorTable;
    }
    
    private int bitField0_;
    // optional string name = 1;
    public static final int NAME_FIELD_NUMBER = 1;
    private java.lang.Object name_;
    public boolean hasName() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public String getName() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          name_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    // required uint32 id = 2;
    public static final int ID_FIELD_NUMBER = 2;
    private int id_;
    public boolean hasId() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public int getId() {
      return id_;
    }
    
    // required uint32 length = 3;
    public static final int LENGTH_FIELD_NUMBER = 3;
    private int length_;
    public boolean hasLength() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    public int getLength() {
      return length_;
    }
    
    // required bytes seq = 4;
    public static final int SEQ_FIELD_NUMBER = 4;
    private com.google.protobuf.ByteString seq_;
    public boolean hasSeq() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    public com.google.protobuf.ByteString getSeq() {
      return seq_;
    }
    
    private void initFields() {
      name_ = "";
      id_ = 0;
      length_ = 0;
      seq_ = com.google.protobuf.ByteString.EMPTY;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasId()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasLength()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasSeq()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBytes(1, getNameBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeUInt32(2, id_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeUInt32(3, length_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeBytes(4, seq_);
      }
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, getNameBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, id_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, length_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(4, seq_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }
    
    public static expressd.protobuf.Targets.Target parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static expressd.protobuf.Targets.Target parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static expressd.protobuf.Targets.Target parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static expressd.protobuf.Targets.Target parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static expressd.protobuf.Targets.Target parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static expressd.protobuf.Targets.Target parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static expressd.protobuf.Targets.Target parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static expressd.protobuf.Targets.Target parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static expressd.protobuf.Targets.Target parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static expressd.protobuf.Targets.Target parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(expressd.protobuf.Targets.Target prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements expressd.protobuf.Targets.TargetOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return expressd.protobuf.Targets.internal_static_proto_Target_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return expressd.protobuf.Targets.internal_static_proto_Target_fieldAccessorTable;
      }
      
      // Construct using expressd.protobuf.Targets.Target.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }
      
      private Builder(BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }
      
      public Builder clear() {
        super.clear();
        name_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        id_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        length_ = 0;
        bitField0_ = (bitField0_ & ~0x00000004);
        seq_ = com.google.protobuf.ByteString.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000008);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return expressd.protobuf.Targets.Target.getDescriptor();
      }
      
      public expressd.protobuf.Targets.Target getDefaultInstanceForType() {
        return expressd.protobuf.Targets.Target.getDefaultInstance();
      }
      
      public expressd.protobuf.Targets.Target build() {
        expressd.protobuf.Targets.Target result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private expressd.protobuf.Targets.Target buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        expressd.protobuf.Targets.Target result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public expressd.protobuf.Targets.Target buildPartial() {
        expressd.protobuf.Targets.Target result = new expressd.protobuf.Targets.Target(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.name_ = name_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.id_ = id_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.length_ = length_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.seq_ = seq_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof expressd.protobuf.Targets.Target) {
          return mergeFrom((expressd.protobuf.Targets.Target)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(expressd.protobuf.Targets.Target other) {
        if (other == expressd.protobuf.Targets.Target.getDefaultInstance()) return this;
        if (other.hasName()) {
          setName(other.getName());
        }
        if (other.hasId()) {
          setId(other.getId());
        }
        if (other.hasLength()) {
          setLength(other.getLength());
        }
        if (other.hasSeq()) {
          setSeq(other.getSeq());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        if (!hasId()) {
          
          return false;
        }
        if (!hasLength()) {
          
          return false;
        }
        if (!hasSeq()) {
          
          return false;
        }
        return true;
      }
      
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder(
            this.getUnknownFields());
        while (true) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              this.setUnknownFields(unknownFields.build());
              onChanged();
              return this;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                this.setUnknownFields(unknownFields.build());
                onChanged();
                return this;
              }
              break;
            }
            case 10: {
              bitField0_ |= 0x00000001;
              name_ = input.readBytes();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              id_ = input.readUInt32();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              length_ = input.readUInt32();
              break;
            }
            case 34: {
              bitField0_ |= 0x00000008;
              seq_ = input.readBytes();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // optional string name = 1;
      private java.lang.Object name_ = "";
      public boolean hasName() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public String getName() {
        java.lang.Object ref = name_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          name_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setName(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        name_ = value;
        onChanged();
        return this;
      }
      public Builder clearName() {
        bitField0_ = (bitField0_ & ~0x00000001);
        name_ = getDefaultInstance().getName();
        onChanged();
        return this;
      }
      void setName(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000001;
        name_ = value;
        onChanged();
      }
      
      // required uint32 id = 2;
      private int id_ ;
      public boolean hasId() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public int getId() {
        return id_;
      }
      public Builder setId(int value) {
        bitField0_ |= 0x00000002;
        id_ = value;
        onChanged();
        return this;
      }
      public Builder clearId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        id_ = 0;
        onChanged();
        return this;
      }
      
      // required uint32 length = 3;
      private int length_ ;
      public boolean hasLength() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      public int getLength() {
        return length_;
      }
      public Builder setLength(int value) {
        bitField0_ |= 0x00000004;
        length_ = value;
        onChanged();
        return this;
      }
      public Builder clearLength() {
        bitField0_ = (bitField0_ & ~0x00000004);
        length_ = 0;
        onChanged();
        return this;
      }
      
      // required bytes seq = 4;
      private com.google.protobuf.ByteString seq_ = com.google.protobuf.ByteString.EMPTY;
      public boolean hasSeq() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      public com.google.protobuf.ByteString getSeq() {
        return seq_;
      }
      public Builder setSeq(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
        seq_ = value;
        onChanged();
        return this;
      }
      public Builder clearSeq() {
        bitField0_ = (bitField0_ & ~0x00000008);
        seq_ = getDefaultInstance().getSeq();
        onChanged();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:expressd.protobuf.Target)
    }
    
    static {
      defaultInstance = new Target(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:expressd.protobuf.Target)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_proto_Target_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_proto_Target_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023proto/targets.proto\022\005proto\"?\n\006Target\022\014" +
      "\n\004name\030\001 \001(\t\022\n\n\002id\030\002 \002(\r\022\016\n\006length\030\003 \002(\r" +
      "\022\013\n\003seq\030\004 \002(\014"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_proto_Target_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_proto_Target_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_proto_Target_descriptor,
              new java.lang.String[] { "Name", "Id", "Length", "Seq", },
              expressd.protobuf.Targets.Target.class,
              expressd.protobuf.Targets.Target.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }
  
  // @@protoc_insertion_point(outer_class_scope)
}
