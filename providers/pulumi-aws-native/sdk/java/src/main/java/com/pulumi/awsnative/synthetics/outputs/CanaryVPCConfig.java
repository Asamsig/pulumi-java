// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.synthetics.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CanaryVPCConfig {
    private final List<String> securityGroupIds;
    private final List<String> subnetIds;
    private final @Nullable String vpcId;

    @CustomType.Constructor
    private CanaryVPCConfig(
        @CustomType.Parameter("securityGroupIds") List<String> securityGroupIds,
        @CustomType.Parameter("subnetIds") List<String> subnetIds,
        @CustomType.Parameter("vpcId") @Nullable String vpcId) {
        this.securityGroupIds = securityGroupIds;
        this.subnetIds = subnetIds;
        this.vpcId = vpcId;
    }

    public List<String> securityGroupIds() {
        return this.securityGroupIds;
    }
    public List<String> subnetIds() {
        return this.subnetIds;
    }
    public Optional<String> vpcId() {
        return Optional.ofNullable(this.vpcId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CanaryVPCConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> securityGroupIds;
        private List<String> subnetIds;
        private @Nullable String vpcId;

        public Builder() {
    	      // Empty
        }

        public Builder(CanaryVPCConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.securityGroupIds = defaults.securityGroupIds;
    	      this.subnetIds = defaults.subnetIds;
    	      this.vpcId = defaults.vpcId;
        }

        public Builder securityGroupIds(List<String> securityGroupIds) {
            this.securityGroupIds = Objects.requireNonNull(securityGroupIds);
            return this;
        }
        public Builder securityGroupIds(String... securityGroupIds) {
            return securityGroupIds(List.of(securityGroupIds));
        }
        public Builder subnetIds(List<String> subnetIds) {
            this.subnetIds = Objects.requireNonNull(subnetIds);
            return this;
        }
        public Builder subnetIds(String... subnetIds) {
            return subnetIds(List.of(subnetIds));
        }
        public Builder vpcId(@Nullable String vpcId) {
            this.vpcId = vpcId;
            return this;
        }        public CanaryVPCConfig build() {
            return new CanaryVPCConfig(securityGroupIds, subnetIds, vpcId);
        }
    }
}
