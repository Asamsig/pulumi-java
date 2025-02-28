// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.documentdb.outputs;

import com.pulumi.azurenative.documentdb.outputs.PeriodicModePropertiesResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PeriodicModeBackupPolicyResponse {
    /**
     * @return Configuration values for periodic mode backup
     * 
     */
    private final @Nullable PeriodicModePropertiesResponse periodicModeProperties;
    /**
     * @return Describes the mode of backups.
     * Expected value is &#39;Periodic&#39;.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private PeriodicModeBackupPolicyResponse(
        @CustomType.Parameter("periodicModeProperties") @Nullable PeriodicModePropertiesResponse periodicModeProperties,
        @CustomType.Parameter("type") String type) {
        this.periodicModeProperties = periodicModeProperties;
        this.type = type;
    }

    /**
     * @return Configuration values for periodic mode backup
     * 
     */
    public Optional<PeriodicModePropertiesResponse> periodicModeProperties() {
        return Optional.ofNullable(this.periodicModeProperties);
    }
    /**
     * @return Describes the mode of backups.
     * Expected value is &#39;Periodic&#39;.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PeriodicModeBackupPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable PeriodicModePropertiesResponse periodicModeProperties;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(PeriodicModeBackupPolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.periodicModeProperties = defaults.periodicModeProperties;
    	      this.type = defaults.type;
        }

        public Builder periodicModeProperties(@Nullable PeriodicModePropertiesResponse periodicModeProperties) {
            this.periodicModeProperties = periodicModeProperties;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public PeriodicModeBackupPolicyResponse build() {
            return new PeriodicModeBackupPolicyResponse(periodicModeProperties, type);
        }
    }
}
