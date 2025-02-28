// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.hardwaresecuritymodules.outputs;

import com.pulumi.azurenative.hardwaresecuritymodules.outputs.NetworkProfileResponse;
import com.pulumi.azurenative.hardwaresecuritymodules.outputs.SkuResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetDedicatedHsmResult {
    /**
     * @return The Azure Resource Manager resource ID for the dedicated HSM.
     * 
     */
    private final String id;
    /**
     * @return The supported Azure location where the dedicated HSM should be created.
     * 
     */
    private final String location;
    /**
     * @return The name of the dedicated HSM.
     * 
     */
    private final String name;
    /**
     * @return Specifies the network interfaces of the dedicated hsm.
     * 
     */
    private final @Nullable NetworkProfileResponse networkProfile;
    /**
     * @return Provisioning state.
     * 
     */
    private final String provisioningState;
    /**
     * @return SKU details
     * 
     */
    private final SkuResponse sku;
    /**
     * @return This field will be used when RP does not support Availability zones.
     * 
     */
    private final @Nullable String stampId;
    /**
     * @return Resource Status Message.
     * 
     */
    private final String statusMessage;
    /**
     * @return Resource tags
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * @return The resource type of the dedicated HSM.
     * 
     */
    private final String type;
    /**
     * @return The Dedicated Hsm zones.
     * 
     */
    private final @Nullable List<String> zones;

    @CustomType.Constructor
    private GetDedicatedHsmResult(
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("location") String location,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("networkProfile") @Nullable NetworkProfileResponse networkProfile,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("sku") SkuResponse sku,
        @CustomType.Parameter("stampId") @Nullable String stampId,
        @CustomType.Parameter("statusMessage") String statusMessage,
        @CustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("zones") @Nullable List<String> zones) {
        this.id = id;
        this.location = location;
        this.name = name;
        this.networkProfile = networkProfile;
        this.provisioningState = provisioningState;
        this.sku = sku;
        this.stampId = stampId;
        this.statusMessage = statusMessage;
        this.tags = tags;
        this.type = type;
        this.zones = zones;
    }

    /**
     * @return The Azure Resource Manager resource ID for the dedicated HSM.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The supported Azure location where the dedicated HSM should be created.
     * 
     */
    public String location() {
        return this.location;
    }
    /**
     * @return The name of the dedicated HSM.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Specifies the network interfaces of the dedicated hsm.
     * 
     */
    public Optional<NetworkProfileResponse> networkProfile() {
        return Optional.ofNullable(this.networkProfile);
    }
    /**
     * @return Provisioning state.
     * 
     */
    public String provisioningState() {
        return this.provisioningState;
    }
    /**
     * @return SKU details
     * 
     */
    public SkuResponse sku() {
        return this.sku;
    }
    /**
     * @return This field will be used when RP does not support Availability zones.
     * 
     */
    public Optional<String> stampId() {
        return Optional.ofNullable(this.stampId);
    }
    /**
     * @return Resource Status Message.
     * 
     */
    public String statusMessage() {
        return this.statusMessage;
    }
    /**
     * @return Resource tags
     * 
     */
    public Map<String,String> tags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * @return The resource type of the dedicated HSM.
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return The Dedicated Hsm zones.
     * 
     */
    public List<String> zones() {
        return this.zones == null ? List.of() : this.zones;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDedicatedHsmResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private String location;
        private String name;
        private @Nullable NetworkProfileResponse networkProfile;
        private String provisioningState;
        private SkuResponse sku;
        private @Nullable String stampId;
        private String statusMessage;
        private @Nullable Map<String,String> tags;
        private String type;
        private @Nullable List<String> zones;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDedicatedHsmResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.networkProfile = defaults.networkProfile;
    	      this.provisioningState = defaults.provisioningState;
    	      this.sku = defaults.sku;
    	      this.stampId = defaults.stampId;
    	      this.statusMessage = defaults.statusMessage;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
    	      this.zones = defaults.zones;
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
        public Builder networkProfile(@Nullable NetworkProfileResponse networkProfile) {
            this.networkProfile = networkProfile;
            return this;
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public Builder sku(SkuResponse sku) {
            this.sku = Objects.requireNonNull(sku);
            return this;
        }
        public Builder stampId(@Nullable String stampId) {
            this.stampId = stampId;
            return this;
        }
        public Builder statusMessage(String statusMessage) {
            this.statusMessage = Objects.requireNonNull(statusMessage);
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
        public Builder zones(@Nullable List<String> zones) {
            this.zones = zones;
            return this;
        }
        public Builder zones(String... zones) {
            return zones(List.of(zones));
        }        public GetDedicatedHsmResult build() {
            return new GetDedicatedHsmResult(id, location, name, networkProfile, provisioningState, sku, stampId, statusMessage, tags, type, zones);
        }
    }
}
