// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.virtualmachineimages.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class VirtualNetworkConfigResponse {
    /**
     * @return Resource id of a pre-existing subnet.
     * 
     */
    private final @Nullable String subnetId;

    @CustomType.Constructor
    private VirtualNetworkConfigResponse(@CustomType.Parameter("subnetId") @Nullable String subnetId) {
        this.subnetId = subnetId;
    }

    /**
     * @return Resource id of a pre-existing subnet.
     * 
     */
    public Optional<String> subnetId() {
        return Optional.ofNullable(this.subnetId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNetworkConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String subnetId;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNetworkConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.subnetId = defaults.subnetId;
        }

        public Builder subnetId(@Nullable String subnetId) {
            this.subnetId = subnetId;
            return this;
        }        public VirtualNetworkConfigResponse build() {
            return new VirtualNetworkConfigResponse(subnetId);
        }
    }
}
