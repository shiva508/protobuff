// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: building-pkg.proto

package com.building;

public final class BuildingPkgOuterClass {
  private BuildingPkgOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface BuildingPkgOrBuilder extends
      // @@protoc_insertion_point(interface_extends:com.building.BuildingPkg)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string building_name = 1;</code>
     * @return The buildingName.
     */
    java.lang.String getBuildingName();
    /**
     * <code>string building_name = 1;</code>
     * @return The bytes for buildingName.
     */
    com.google.protobuf.ByteString
        getBuildingNameBytes();

    /**
     * <code>string building_number = 2;</code>
     * @return The buildingNumber.
     */
    java.lang.String getBuildingNumber();
    /**
     * <code>string building_number = 2;</code>
     * @return The bytes for buildingNumber.
     */
    com.google.protobuf.ByteString
        getBuildingNumberBytes();

    /**
     * <code>.com.street.StreetPkg street_details = 3;</code>
     * @return Whether the streetDetails field is set.
     */
    boolean hasStreetDetails();
    /**
     * <code>.com.street.StreetPkg street_details = 3;</code>
     * @return The streetDetails.
     */
    com.street.StreetPkgOuterClass.StreetPkg getStreetDetails();
    /**
     * <code>.com.street.StreetPkg street_details = 3;</code>
     */
    com.street.StreetPkgOuterClass.StreetPkgOrBuilder getStreetDetailsOrBuilder();
  }
  /**
   * Protobuf type {@code com.building.BuildingPkg}
   */
  public static final class BuildingPkg extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:com.building.BuildingPkg)
      BuildingPkgOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use BuildingPkg.newBuilder() to construct.
    private BuildingPkg(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private BuildingPkg() {
      buildingName_ = "";
      buildingNumber_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new BuildingPkg();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private BuildingPkg(
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
            case 10: {
              java.lang.String s = input.readStringRequireUtf8();

              buildingName_ = s;
              break;
            }
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();

              buildingNumber_ = s;
              break;
            }
            case 26: {
              com.street.StreetPkgOuterClass.StreetPkg.Builder subBuilder = null;
              if (streetDetails_ != null) {
                subBuilder = streetDetails_.toBuilder();
              }
              streetDetails_ = input.readMessage(com.street.StreetPkgOuterClass.StreetPkg.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(streetDetails_);
                streetDetails_ = subBuilder.buildPartial();
              }

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
      return com.building.BuildingPkgOuterClass.internal_static_com_building_BuildingPkg_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.building.BuildingPkgOuterClass.internal_static_com_building_BuildingPkg_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.building.BuildingPkgOuterClass.BuildingPkg.class, com.building.BuildingPkgOuterClass.BuildingPkg.Builder.class);
    }

    public static final int BUILDING_NAME_FIELD_NUMBER = 1;
    private volatile java.lang.Object buildingName_;
    /**
     * <code>string building_name = 1;</code>
     * @return The buildingName.
     */
    @java.lang.Override
    public java.lang.String getBuildingName() {
      java.lang.Object ref = buildingName_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        buildingName_ = s;
        return s;
      }
    }
    /**
     * <code>string building_name = 1;</code>
     * @return The bytes for buildingName.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getBuildingNameBytes() {
      java.lang.Object ref = buildingName_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        buildingName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int BUILDING_NUMBER_FIELD_NUMBER = 2;
    private volatile java.lang.Object buildingNumber_;
    /**
     * <code>string building_number = 2;</code>
     * @return The buildingNumber.
     */
    @java.lang.Override
    public java.lang.String getBuildingNumber() {
      java.lang.Object ref = buildingNumber_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        buildingNumber_ = s;
        return s;
      }
    }
    /**
     * <code>string building_number = 2;</code>
     * @return The bytes for buildingNumber.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getBuildingNumberBytes() {
      java.lang.Object ref = buildingNumber_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        buildingNumber_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int STREET_DETAILS_FIELD_NUMBER = 3;
    private com.street.StreetPkgOuterClass.StreetPkg streetDetails_;
    /**
     * <code>.com.street.StreetPkg street_details = 3;</code>
     * @return Whether the streetDetails field is set.
     */
    @java.lang.Override
    public boolean hasStreetDetails() {
      return streetDetails_ != null;
    }
    /**
     * <code>.com.street.StreetPkg street_details = 3;</code>
     * @return The streetDetails.
     */
    @java.lang.Override
    public com.street.StreetPkgOuterClass.StreetPkg getStreetDetails() {
      return streetDetails_ == null ? com.street.StreetPkgOuterClass.StreetPkg.getDefaultInstance() : streetDetails_;
    }
    /**
     * <code>.com.street.StreetPkg street_details = 3;</code>
     */
    @java.lang.Override
    public com.street.StreetPkgOuterClass.StreetPkgOrBuilder getStreetDetailsOrBuilder() {
      return getStreetDetails();
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
      if (!getBuildingNameBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, buildingName_);
      }
      if (!getBuildingNumberBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, buildingNumber_);
      }
      if (streetDetails_ != null) {
        output.writeMessage(3, getStreetDetails());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getBuildingNameBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, buildingName_);
      }
      if (!getBuildingNumberBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, buildingNumber_);
      }
      if (streetDetails_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, getStreetDetails());
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
      if (!(obj instanceof com.building.BuildingPkgOuterClass.BuildingPkg)) {
        return super.equals(obj);
      }
      com.building.BuildingPkgOuterClass.BuildingPkg other = (com.building.BuildingPkgOuterClass.BuildingPkg) obj;

      if (!getBuildingName()
          .equals(other.getBuildingName())) return false;
      if (!getBuildingNumber()
          .equals(other.getBuildingNumber())) return false;
      if (hasStreetDetails() != other.hasStreetDetails()) return false;
      if (hasStreetDetails()) {
        if (!getStreetDetails()
            .equals(other.getStreetDetails())) return false;
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
      hash = (37 * hash) + BUILDING_NAME_FIELD_NUMBER;
      hash = (53 * hash) + getBuildingName().hashCode();
      hash = (37 * hash) + BUILDING_NUMBER_FIELD_NUMBER;
      hash = (53 * hash) + getBuildingNumber().hashCode();
      if (hasStreetDetails()) {
        hash = (37 * hash) + STREET_DETAILS_FIELD_NUMBER;
        hash = (53 * hash) + getStreetDetails().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.building.BuildingPkgOuterClass.BuildingPkg parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.building.BuildingPkgOuterClass.BuildingPkg parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.building.BuildingPkgOuterClass.BuildingPkg parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.building.BuildingPkgOuterClass.BuildingPkg parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.building.BuildingPkgOuterClass.BuildingPkg parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.building.BuildingPkgOuterClass.BuildingPkg parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.building.BuildingPkgOuterClass.BuildingPkg parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.building.BuildingPkgOuterClass.BuildingPkg parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.building.BuildingPkgOuterClass.BuildingPkg parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.building.BuildingPkgOuterClass.BuildingPkg parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.building.BuildingPkgOuterClass.BuildingPkg parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.building.BuildingPkgOuterClass.BuildingPkg parseFrom(
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
    public static Builder newBuilder(com.building.BuildingPkgOuterClass.BuildingPkg prototype) {
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
     * Protobuf type {@code com.building.BuildingPkg}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:com.building.BuildingPkg)
        com.building.BuildingPkgOuterClass.BuildingPkgOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.building.BuildingPkgOuterClass.internal_static_com_building_BuildingPkg_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.building.BuildingPkgOuterClass.internal_static_com_building_BuildingPkg_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.building.BuildingPkgOuterClass.BuildingPkg.class, com.building.BuildingPkgOuterClass.BuildingPkg.Builder.class);
      }

      // Construct using com.building.BuildingPkgOuterClass.BuildingPkg.newBuilder()
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
        buildingName_ = "";

        buildingNumber_ = "";

        if (streetDetailsBuilder_ == null) {
          streetDetails_ = null;
        } else {
          streetDetails_ = null;
          streetDetailsBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.building.BuildingPkgOuterClass.internal_static_com_building_BuildingPkg_descriptor;
      }

      @java.lang.Override
      public com.building.BuildingPkgOuterClass.BuildingPkg getDefaultInstanceForType() {
        return com.building.BuildingPkgOuterClass.BuildingPkg.getDefaultInstance();
      }

      @java.lang.Override
      public com.building.BuildingPkgOuterClass.BuildingPkg build() {
        com.building.BuildingPkgOuterClass.BuildingPkg result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.building.BuildingPkgOuterClass.BuildingPkg buildPartial() {
        com.building.BuildingPkgOuterClass.BuildingPkg result = new com.building.BuildingPkgOuterClass.BuildingPkg(this);
        result.buildingName_ = buildingName_;
        result.buildingNumber_ = buildingNumber_;
        if (streetDetailsBuilder_ == null) {
          result.streetDetails_ = streetDetails_;
        } else {
          result.streetDetails_ = streetDetailsBuilder_.build();
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
        if (other instanceof com.building.BuildingPkgOuterClass.BuildingPkg) {
          return mergeFrom((com.building.BuildingPkgOuterClass.BuildingPkg)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.building.BuildingPkgOuterClass.BuildingPkg other) {
        if (other == com.building.BuildingPkgOuterClass.BuildingPkg.getDefaultInstance()) return this;
        if (!other.getBuildingName().isEmpty()) {
          buildingName_ = other.buildingName_;
          onChanged();
        }
        if (!other.getBuildingNumber().isEmpty()) {
          buildingNumber_ = other.buildingNumber_;
          onChanged();
        }
        if (other.hasStreetDetails()) {
          mergeStreetDetails(other.getStreetDetails());
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
        com.building.BuildingPkgOuterClass.BuildingPkg parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.building.BuildingPkgOuterClass.BuildingPkg) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object buildingName_ = "";
      /**
       * <code>string building_name = 1;</code>
       * @return The buildingName.
       */
      public java.lang.String getBuildingName() {
        java.lang.Object ref = buildingName_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          buildingName_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string building_name = 1;</code>
       * @return The bytes for buildingName.
       */
      public com.google.protobuf.ByteString
          getBuildingNameBytes() {
        java.lang.Object ref = buildingName_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          buildingName_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string building_name = 1;</code>
       * @param value The buildingName to set.
       * @return This builder for chaining.
       */
      public Builder setBuildingName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        buildingName_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string building_name = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearBuildingName() {
        
        buildingName_ = getDefaultInstance().getBuildingName();
        onChanged();
        return this;
      }
      /**
       * <code>string building_name = 1;</code>
       * @param value The bytes for buildingName to set.
       * @return This builder for chaining.
       */
      public Builder setBuildingNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        buildingName_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object buildingNumber_ = "";
      /**
       * <code>string building_number = 2;</code>
       * @return The buildingNumber.
       */
      public java.lang.String getBuildingNumber() {
        java.lang.Object ref = buildingNumber_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          buildingNumber_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string building_number = 2;</code>
       * @return The bytes for buildingNumber.
       */
      public com.google.protobuf.ByteString
          getBuildingNumberBytes() {
        java.lang.Object ref = buildingNumber_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          buildingNumber_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string building_number = 2;</code>
       * @param value The buildingNumber to set.
       * @return This builder for chaining.
       */
      public Builder setBuildingNumber(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        buildingNumber_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string building_number = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearBuildingNumber() {
        
        buildingNumber_ = getDefaultInstance().getBuildingNumber();
        onChanged();
        return this;
      }
      /**
       * <code>string building_number = 2;</code>
       * @param value The bytes for buildingNumber to set.
       * @return This builder for chaining.
       */
      public Builder setBuildingNumberBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        buildingNumber_ = value;
        onChanged();
        return this;
      }

      private com.street.StreetPkgOuterClass.StreetPkg streetDetails_;
      private com.google.protobuf.SingleFieldBuilderV3<
          com.street.StreetPkgOuterClass.StreetPkg, com.street.StreetPkgOuterClass.StreetPkg.Builder, com.street.StreetPkgOuterClass.StreetPkgOrBuilder> streetDetailsBuilder_;
      /**
       * <code>.com.street.StreetPkg street_details = 3;</code>
       * @return Whether the streetDetails field is set.
       */
      public boolean hasStreetDetails() {
        return streetDetailsBuilder_ != null || streetDetails_ != null;
      }
      /**
       * <code>.com.street.StreetPkg street_details = 3;</code>
       * @return The streetDetails.
       */
      public com.street.StreetPkgOuterClass.StreetPkg getStreetDetails() {
        if (streetDetailsBuilder_ == null) {
          return streetDetails_ == null ? com.street.StreetPkgOuterClass.StreetPkg.getDefaultInstance() : streetDetails_;
        } else {
          return streetDetailsBuilder_.getMessage();
        }
      }
      /**
       * <code>.com.street.StreetPkg street_details = 3;</code>
       */
      public Builder setStreetDetails(com.street.StreetPkgOuterClass.StreetPkg value) {
        if (streetDetailsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          streetDetails_ = value;
          onChanged();
        } else {
          streetDetailsBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.com.street.StreetPkg street_details = 3;</code>
       */
      public Builder setStreetDetails(
          com.street.StreetPkgOuterClass.StreetPkg.Builder builderForValue) {
        if (streetDetailsBuilder_ == null) {
          streetDetails_ = builderForValue.build();
          onChanged();
        } else {
          streetDetailsBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.com.street.StreetPkg street_details = 3;</code>
       */
      public Builder mergeStreetDetails(com.street.StreetPkgOuterClass.StreetPkg value) {
        if (streetDetailsBuilder_ == null) {
          if (streetDetails_ != null) {
            streetDetails_ =
              com.street.StreetPkgOuterClass.StreetPkg.newBuilder(streetDetails_).mergeFrom(value).buildPartial();
          } else {
            streetDetails_ = value;
          }
          onChanged();
        } else {
          streetDetailsBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.com.street.StreetPkg street_details = 3;</code>
       */
      public Builder clearStreetDetails() {
        if (streetDetailsBuilder_ == null) {
          streetDetails_ = null;
          onChanged();
        } else {
          streetDetails_ = null;
          streetDetailsBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.com.street.StreetPkg street_details = 3;</code>
       */
      public com.street.StreetPkgOuterClass.StreetPkg.Builder getStreetDetailsBuilder() {
        
        onChanged();
        return getStreetDetailsFieldBuilder().getBuilder();
      }
      /**
       * <code>.com.street.StreetPkg street_details = 3;</code>
       */
      public com.street.StreetPkgOuterClass.StreetPkgOrBuilder getStreetDetailsOrBuilder() {
        if (streetDetailsBuilder_ != null) {
          return streetDetailsBuilder_.getMessageOrBuilder();
        } else {
          return streetDetails_ == null ?
              com.street.StreetPkgOuterClass.StreetPkg.getDefaultInstance() : streetDetails_;
        }
      }
      /**
       * <code>.com.street.StreetPkg street_details = 3;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          com.street.StreetPkgOuterClass.StreetPkg, com.street.StreetPkgOuterClass.StreetPkg.Builder, com.street.StreetPkgOuterClass.StreetPkgOrBuilder> 
          getStreetDetailsFieldBuilder() {
        if (streetDetailsBuilder_ == null) {
          streetDetailsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              com.street.StreetPkgOuterClass.StreetPkg, com.street.StreetPkgOuterClass.StreetPkg.Builder, com.street.StreetPkgOuterClass.StreetPkgOrBuilder>(
                  getStreetDetails(),
                  getParentForChildren(),
                  isClean());
          streetDetails_ = null;
        }
        return streetDetailsBuilder_;
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


      // @@protoc_insertion_point(builder_scope:com.building.BuildingPkg)
    }

    // @@protoc_insertion_point(class_scope:com.building.BuildingPkg)
    private static final com.building.BuildingPkgOuterClass.BuildingPkg DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.building.BuildingPkgOuterClass.BuildingPkg();
    }

    public static com.building.BuildingPkgOuterClass.BuildingPkg getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<BuildingPkg>
        PARSER = new com.google.protobuf.AbstractParser<BuildingPkg>() {
      @java.lang.Override
      public BuildingPkg parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new BuildingPkg(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<BuildingPkg> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<BuildingPkg> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.building.BuildingPkgOuterClass.BuildingPkg getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_building_BuildingPkg_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_building_BuildingPkg_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022building-pkg.proto\022\014com.building\032\020stre" +
      "et-pkg.proto\"l\n\013BuildingPkg\022\025\n\rbuilding_" +
      "name\030\001 \001(\t\022\027\n\017building_number\030\002 \001(\t\022-\n\016s" +
      "treet_details\030\003 \001(\0132\025.com.street.StreetP" +
      "kgb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.street.StreetPkgOuterClass.getDescriptor(),
        });
    internal_static_com_building_BuildingPkg_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_building_BuildingPkg_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_building_BuildingPkg_descriptor,
        new java.lang.String[] { "BuildingName", "BuildingNumber", "StreetDetails", });
    com.street.StreetPkgOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
