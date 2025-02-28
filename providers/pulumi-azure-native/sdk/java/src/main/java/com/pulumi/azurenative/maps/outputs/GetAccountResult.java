// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.maps.outputs;

import com.pulumi.azurenative.maps.outputs.MapsAccountPropertiesResponse;
import com.pulumi.azurenative.maps.outputs.SkuResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetAccountResult {
    /**
     * @return The fully qualified Maps Account resource identifier.
     * 
     */
    private final String id;
    /**
     * @return The location of the resource.
     * 
     */
    private final String location;
    /**
     * @return The name of the Maps Account, which is unique within a Resource Group.
     * 
     */
    private final String name;
    /**
     * @return The map account properties.
     * 
     */
    private final MapsAccountPropertiesResponse properties;
    /**
     * @return The SKU of this account.
     * 
     */
    private final SkuResponse sku;
    /**
     * @return Gets a list of key value pairs that describe the resource. These tags can be used in viewing and grouping this resource (across resource groups). A maximum of 15 tags can be provided for a resource. Each tag must have a key no greater than 128 characters and value no greater than 256 characters.
     * 
     */
    private final Map<String,String> tags;
    /**
     * @return Azure resource type.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetAccountResult(
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("location") String location,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("properties") MapsAccountPropertiesResponse properties,
        @CustomType.Parameter("sku") SkuResponse sku,
        @CustomType.Parameter("tags") Map<String,String> tags,
        @CustomType.Parameter("type") String type) {
        this.id = id;
        this.location = location;
        this.name = name;
        this.properties = properties;
        this.sku = sku;
        this.tags = tags;
        this.type = type;
    }

    /**
     * @return The fully qualified Maps Account resource identifier.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The location of the resource.
     * 
     */
    public String location() {
        return this.location;
    }
    /**
     * @return The name of the Maps Account, which is unique within a Resource Group.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The map account properties.
     * 
     */
    public MapsAccountPropertiesResponse properties() {
        return this.properties;
    }
    /**
     * @return The SKU of this account.
     * 
     */
    public SkuResponse sku() {
        return this.sku;
    }
    /**
     * @return Gets a list of key value pairs that describe the resource. These tags can be used in viewing and grouping this resource (across resource groups). A maximum of 15 tags can be provided for a resource. Each tag must have a key no greater than 128 characters and value no greater than 256 characters.
     * 
     */
    public Map<String,String> tags() {
        return this.tags;
    }
    /**
     * @return Azure resource type.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAccountResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private String location;
        private String name;
        private MapsAccountPropertiesResponse properties;
        private SkuResponse sku;
        private Map<String,String> tags;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAccountResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.properties = defaults.properties;
    	      this.sku = defaults.sku;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder properties(MapsAccountPropertiesResponse properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }
        public Builder sku(SkuResponse sku) {
            this.sku = Objects.requireNonNull(sku);
            return this;
        }
        public Builder tags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetAccountResult build() {
            return new GetAccountResult(id, location, name, properties, sku, tags, type);
        }
    }
}
