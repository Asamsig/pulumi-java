// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.containerservice.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetRegistryTokenResult {
    private final String containerRegistryName;
    /**
     * @return Whether this Token is enabled.
     * 
     */
    private final Boolean enabled;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final String name;
    private final String resourceGroupName;
    /**
     * @return The Scope Map ID used by the token.
     * 
     */
    private final String scopeMapId;

    @CustomType.Constructor
    private GetRegistryTokenResult(
        @CustomType.Parameter("containerRegistryName") String containerRegistryName,
        @CustomType.Parameter("enabled") Boolean enabled,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("resourceGroupName") String resourceGroupName,
        @CustomType.Parameter("scopeMapId") String scopeMapId) {
        this.containerRegistryName = containerRegistryName;
        this.enabled = enabled;
        this.id = id;
        this.name = name;
        this.resourceGroupName = resourceGroupName;
        this.scopeMapId = scopeMapId;
    }

    public String containerRegistryName() {
        return this.containerRegistryName;
    }
    /**
     * @return Whether this Token is enabled.
     * 
     */
    public Boolean enabled() {
        return this.enabled;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public String name() {
        return this.name;
    }
    public String resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * @return The Scope Map ID used by the token.
     * 
     */
    public String scopeMapId() {
        return this.scopeMapId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRegistryTokenResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String containerRegistryName;
        private Boolean enabled;
        private String id;
        private String name;
        private String resourceGroupName;
        private String scopeMapId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRegistryTokenResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.containerRegistryName = defaults.containerRegistryName;
    	      this.enabled = defaults.enabled;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.scopeMapId = defaults.scopeMapId;
        }

        public Builder containerRegistryName(String containerRegistryName) {
            this.containerRegistryName = Objects.requireNonNull(containerRegistryName);
            return this;
        }
        public Builder enabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder scopeMapId(String scopeMapId) {
            this.scopeMapId = Objects.requireNonNull(scopeMapId);
            return this;
        }        public GetRegistryTokenResult build() {
            return new GetRegistryTokenResult(containerRegistryName, enabled, id, name, resourceGroupName, scopeMapId);
        }
    }
}
