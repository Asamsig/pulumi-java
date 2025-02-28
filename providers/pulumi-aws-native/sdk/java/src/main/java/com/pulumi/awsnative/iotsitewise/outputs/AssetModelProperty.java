// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iotsitewise.outputs;

import com.pulumi.awsnative.iotsitewise.enums.AssetModelDataType;
import com.pulumi.awsnative.iotsitewise.enums.AssetModelDataTypeSpec;
import com.pulumi.awsnative.iotsitewise.outputs.AssetModelPropertyType;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AssetModelProperty {
    /**
     * @return The data type of the asset model property.
     * 
     */
    private final AssetModelDataType dataType;
    /**
     * @return The data type of the structure for this property.
     * 
     */
    private final @Nullable AssetModelDataTypeSpec dataTypeSpec;
    /**
     * @return Customer provided ID for property.
     * 
     */
    private final String logicalId;
    /**
     * @return The name of the asset model property.
     * 
     */
    private final String name;
    /**
     * @return The property type
     * 
     */
    private final AssetModelPropertyType type;
    /**
     * @return The unit of the asset model property, such as Newtons or RPM.
     * 
     */
    private final @Nullable String unit;

    @CustomType.Constructor
    private AssetModelProperty(
        @CustomType.Parameter("dataType") AssetModelDataType dataType,
        @CustomType.Parameter("dataTypeSpec") @Nullable AssetModelDataTypeSpec dataTypeSpec,
        @CustomType.Parameter("logicalId") String logicalId,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("type") AssetModelPropertyType type,
        @CustomType.Parameter("unit") @Nullable String unit) {
        this.dataType = dataType;
        this.dataTypeSpec = dataTypeSpec;
        this.logicalId = logicalId;
        this.name = name;
        this.type = type;
        this.unit = unit;
    }

    /**
     * @return The data type of the asset model property.
     * 
     */
    public AssetModelDataType dataType() {
        return this.dataType;
    }
    /**
     * @return The data type of the structure for this property.
     * 
     */
    public Optional<AssetModelDataTypeSpec> dataTypeSpec() {
        return Optional.ofNullable(this.dataTypeSpec);
    }
    /**
     * @return Customer provided ID for property.
     * 
     */
    public String logicalId() {
        return this.logicalId;
    }
    /**
     * @return The name of the asset model property.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The property type
     * 
     */
    public AssetModelPropertyType type() {
        return this.type;
    }
    /**
     * @return The unit of the asset model property, such as Newtons or RPM.
     * 
     */
    public Optional<String> unit() {
        return Optional.ofNullable(this.unit);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AssetModelProperty defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AssetModelDataType dataType;
        private @Nullable AssetModelDataTypeSpec dataTypeSpec;
        private String logicalId;
        private String name;
        private AssetModelPropertyType type;
        private @Nullable String unit;

        public Builder() {
    	      // Empty
        }

        public Builder(AssetModelProperty defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataType = defaults.dataType;
    	      this.dataTypeSpec = defaults.dataTypeSpec;
    	      this.logicalId = defaults.logicalId;
    	      this.name = defaults.name;
    	      this.type = defaults.type;
    	      this.unit = defaults.unit;
        }

        public Builder dataType(AssetModelDataType dataType) {
            this.dataType = Objects.requireNonNull(dataType);
            return this;
        }
        public Builder dataTypeSpec(@Nullable AssetModelDataTypeSpec dataTypeSpec) {
            this.dataTypeSpec = dataTypeSpec;
            return this;
        }
        public Builder logicalId(String logicalId) {
            this.logicalId = Objects.requireNonNull(logicalId);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder type(AssetModelPropertyType type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder unit(@Nullable String unit) {
            this.unit = unit;
            return this;
        }        public AssetModelProperty build() {
            return new AssetModelProperty(dataType, dataTypeSpec, logicalId, name, type, unit);
        }
    }
}
