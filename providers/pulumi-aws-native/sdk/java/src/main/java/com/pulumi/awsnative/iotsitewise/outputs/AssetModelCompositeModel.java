// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iotsitewise.outputs;

import com.pulumi.awsnative.iotsitewise.outputs.AssetModelProperty;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AssetModelCompositeModel {
    /**
     * @return The property definitions of the asset model. You can specify up to 200 properties per asset model.
     * 
     */
    private final @Nullable List<AssetModelProperty> compositeModelProperties;
    /**
     * @return A description for the asset composite model.
     * 
     */
    private final @Nullable String description;
    /**
     * @return A unique, friendly name for the asset composite model.
     * 
     */
    private final String name;
    /**
     * @return The type of the composite model. For alarm composite models, this type is AWS/ALARM
     * 
     */
    private final String type;

    @CustomType.Constructor
    private AssetModelCompositeModel(
        @CustomType.Parameter("compositeModelProperties") @Nullable List<AssetModelProperty> compositeModelProperties,
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("type") String type) {
        this.compositeModelProperties = compositeModelProperties;
        this.description = description;
        this.name = name;
        this.type = type;
    }

    /**
     * @return The property definitions of the asset model. You can specify up to 200 properties per asset model.
     * 
     */
    public List<AssetModelProperty> compositeModelProperties() {
        return this.compositeModelProperties == null ? List.of() : this.compositeModelProperties;
    }
    /**
     * @return A description for the asset composite model.
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * @return A unique, friendly name for the asset composite model.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The type of the composite model. For alarm composite models, this type is AWS/ALARM
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AssetModelCompositeModel defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<AssetModelProperty> compositeModelProperties;
        private @Nullable String description;
        private String name;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(AssetModelCompositeModel defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.compositeModelProperties = defaults.compositeModelProperties;
    	      this.description = defaults.description;
    	      this.name = defaults.name;
    	      this.type = defaults.type;
        }

        public Builder compositeModelProperties(@Nullable List<AssetModelProperty> compositeModelProperties) {
            this.compositeModelProperties = compositeModelProperties;
            return this;
        }
        public Builder compositeModelProperties(AssetModelProperty... compositeModelProperties) {
            return compositeModelProperties(List.of(compositeModelProperties));
        }
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public AssetModelCompositeModel build() {
            return new AssetModelCompositeModel(compositeModelProperties, description, name, type);
        }
    }
}
