// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datashare.outputs;

import com.pulumi.azurenative.datashare.outputs.IdentityResponse;
import com.pulumi.azurenative.datashare.outputs.SystemDataResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetAccountResult {
    /**
     * @return Time at which the account was created.
     * 
     */
    private final String createdAt;
    /**
     * @return The resource id of the azure resource
     * 
     */
    private final String id;
    /**
     * @return Identity Info on the Account
     * 
     */
    private final IdentityResponse identity;
    /**
     * @return Location of the azure resource.
     * 
     */
    private final @Nullable String location;
    /**
     * @return Name of the azure resource
     * 
     */
    private final String name;
    /**
     * @return Provisioning state of the Account
     * 
     */
    private final String provisioningState;
    /**
     * @return System Data of the Azure resource.
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * @return Tags on the azure resource.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * @return Type of the azure resource
     * 
     */
    private final String type;
    /**
     * @return Email of the user who created the resource
     * 
     */
    private final String userEmail;
    /**
     * @return Name of the user who created the resource
     * 
     */
    private final String userName;

    @CustomType.Constructor
    private GetAccountResult(
        @CustomType.Parameter("createdAt") String createdAt,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("identity") IdentityResponse identity,
        @CustomType.Parameter("location") @Nullable String location,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("systemData") SystemDataResponse systemData,
        @CustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("userEmail") String userEmail,
        @CustomType.Parameter("userName") String userName) {
        this.createdAt = createdAt;
        this.id = id;
        this.identity = identity;
        this.location = location;
        this.name = name;
        this.provisioningState = provisioningState;
        this.systemData = systemData;
        this.tags = tags;
        this.type = type;
        this.userEmail = userEmail;
        this.userName = userName;
    }

    /**
     * @return Time at which the account was created.
     * 
     */
    public String createdAt() {
        return this.createdAt;
    }
    /**
     * @return The resource id of the azure resource
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Identity Info on the Account
     * 
     */
    public IdentityResponse identity() {
        return this.identity;
    }
    /**
     * @return Location of the azure resource.
     * 
     */
    public Optional<String> location() {
        return Optional.ofNullable(this.location);
    }
    /**
     * @return Name of the azure resource
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Provisioning state of the Account
     * 
     */
    public String provisioningState() {
        return this.provisioningState;
    }
    /**
     * @return System Data of the Azure resource.
     * 
     */
    public SystemDataResponse systemData() {
        return this.systemData;
    }
    /**
     * @return Tags on the azure resource.
     * 
     */
    public Map<String,String> tags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * @return Type of the azure resource
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return Email of the user who created the resource
     * 
     */
    public String userEmail() {
        return this.userEmail;
    }
    /**
     * @return Name of the user who created the resource
     * 
     */
    public String userName() {
        return this.userName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAccountResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createdAt;
        private String id;
        private IdentityResponse identity;
        private @Nullable String location;
        private String name;
        private String provisioningState;
        private SystemDataResponse systemData;
        private @Nullable Map<String,String> tags;
        private String type;
        private String userEmail;
        private String userName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAccountResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createdAt = defaults.createdAt;
    	      this.id = defaults.id;
    	      this.identity = defaults.identity;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.systemData = defaults.systemData;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
    	      this.userEmail = defaults.userEmail;
    	      this.userName = defaults.userName;
        }

        public Builder createdAt(String createdAt) {
            this.createdAt = Objects.requireNonNull(createdAt);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder identity(IdentityResponse identity) {
            this.identity = Objects.requireNonNull(identity);
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = location;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
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
        }
        public Builder userEmail(String userEmail) {
            this.userEmail = Objects.requireNonNull(userEmail);
            return this;
        }
        public Builder userName(String userName) {
            this.userName = Objects.requireNonNull(userName);
            return this;
        }        public GetAccountResult build() {
            return new GetAccountResult(createdAt, id, identity, location, name, provisioningState, systemData, tags, type, userEmail, userName);
        }
    }
}
