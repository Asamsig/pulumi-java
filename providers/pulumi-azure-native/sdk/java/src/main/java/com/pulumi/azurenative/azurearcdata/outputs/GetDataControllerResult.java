// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.azurearcdata.outputs;

import com.pulumi.azurenative.azurearcdata.outputs.DataControllerPropertiesResponse;
import com.pulumi.azurenative.azurearcdata.outputs.ExtendedLocationResponse;
import com.pulumi.azurenative.azurearcdata.outputs.SystemDataResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetDataControllerResult {
    /**
     * @return The extendedLocation of the resource.
     * 
     */
    private final @Nullable ExtendedLocationResponse extendedLocation;
    /**
     * @return Fully qualified resource Id for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    private final String id;
    /**
     * @return The geo-location where the resource lives
     * 
     */
    private final String location;
    /**
     * @return The name of the resource
     * 
     */
    private final String name;
    /**
     * @return The data controller&#39;s properties
     * 
     */
    private final DataControllerPropertiesResponse properties;
    /**
     * @return Read only system data
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * @return Resource tags.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * @return The type of the resource. Ex- Microsoft.Compute/virtualMachines or Microsoft.Storage/storageAccounts.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetDataControllerResult(
        @CustomType.Parameter("extendedLocation") @Nullable ExtendedLocationResponse extendedLocation,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("location") String location,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("properties") DataControllerPropertiesResponse properties,
        @CustomType.Parameter("systemData") SystemDataResponse systemData,
        @CustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @CustomType.Parameter("type") String type) {
        this.extendedLocation = extendedLocation;
        this.id = id;
        this.location = location;
        this.name = name;
        this.properties = properties;
        this.systemData = systemData;
        this.tags = tags;
        this.type = type;
    }

    /**
     * @return The extendedLocation of the resource.
     * 
     */
    public Optional<ExtendedLocationResponse> extendedLocation() {
        return Optional.ofNullable(this.extendedLocation);
    }
    /**
     * @return Fully qualified resource Id for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The geo-location where the resource lives
     * 
     */
    public String location() {
        return this.location;
    }
    /**
     * @return The name of the resource
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The data controller&#39;s properties
     * 
     */
    public DataControllerPropertiesResponse properties() {
        return this.properties;
    }
    /**
     * @return Read only system data
     * 
     */
    public SystemDataResponse systemData() {
        return this.systemData;
    }
    /**
     * @return Resource tags.
     * 
     */
    public Map<String,String> tags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * @return The type of the resource. Ex- Microsoft.Compute/virtualMachines or Microsoft.Storage/storageAccounts.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDataControllerResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ExtendedLocationResponse extendedLocation;
        private String id;
        private String location;
        private String name;
        private DataControllerPropertiesResponse properties;
        private SystemDataResponse systemData;
        private @Nullable Map<String,String> tags;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDataControllerResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.extendedLocation = defaults.extendedLocation;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.properties = defaults.properties;
    	      this.systemData = defaults.systemData;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder extendedLocation(@Nullable ExtendedLocationResponse extendedLocation) {
            this.extendedLocation = extendedLocation;
            return this;
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
        public Builder properties(DataControllerPropertiesResponse properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }
        public Builder systemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetDataControllerResult build() {
            return new GetDataControllerResult(extendedLocation, id, location, name, properties, systemData, tags, type);
        }
    }
}
