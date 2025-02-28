// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.videoanalyzer.outputs;

import com.pulumi.azurenative.videoanalyzer.outputs.JwtAuthenticationResponse;
import com.pulumi.azurenative.videoanalyzer.outputs.SystemDataResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetAccessPolicyResult {
    /**
     * @return Authentication method to be used when validating client API access.
     * 
     */
    private final @Nullable JwtAuthenticationResponse authentication;
    /**
     * @return Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    private final String id;
    /**
     * @return The name of the resource
     * 
     */
    private final String name;
    /**
     * @return Defines the access level granted by this policy.
     * 
     */
    private final @Nullable String role;
    /**
     * @return The system metadata relating to this resource.
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * @return The type of the resource. E.g. &#34;Microsoft.Compute/virtualMachines&#34; or &#34;Microsoft.Storage/storageAccounts&#34;
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetAccessPolicyResult(
        @CustomType.Parameter("authentication") @Nullable JwtAuthenticationResponse authentication,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("role") @Nullable String role,
        @CustomType.Parameter("systemData") SystemDataResponse systemData,
        @CustomType.Parameter("type") String type) {
        this.authentication = authentication;
        this.id = id;
        this.name = name;
        this.role = role;
        this.systemData = systemData;
        this.type = type;
    }

    /**
     * @return Authentication method to be used when validating client API access.
     * 
     */
    public Optional<JwtAuthenticationResponse> authentication() {
        return Optional.ofNullable(this.authentication);
    }
    /**
     * @return Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The name of the resource
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Defines the access level granted by this policy.
     * 
     */
    public Optional<String> role() {
        return Optional.ofNullable(this.role);
    }
    /**
     * @return The system metadata relating to this resource.
     * 
     */
    public SystemDataResponse systemData() {
        return this.systemData;
    }
    /**
     * @return The type of the resource. E.g. &#34;Microsoft.Compute/virtualMachines&#34; or &#34;Microsoft.Storage/storageAccounts&#34;
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAccessPolicyResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable JwtAuthenticationResponse authentication;
        private String id;
        private String name;
        private @Nullable String role;
        private SystemDataResponse systemData;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAccessPolicyResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authentication = defaults.authentication;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.role = defaults.role;
    	      this.systemData = defaults.systemData;
    	      this.type = defaults.type;
        }

        public Builder authentication(@Nullable JwtAuthenticationResponse authentication) {
            this.authentication = authentication;
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
        public Builder role(@Nullable String role) {
            this.role = role;
            return this;
        }
        public Builder systemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetAccessPolicyResult build() {
            return new GetAccessPolicyResult(authentication, id, name, role, systemData, type);
        }
    }
}
