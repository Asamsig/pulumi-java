// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.recoveryservices.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class OSDetailsResponse {
    /**
     * @return The OS Major Version.
     * 
     */
    private final @Nullable String oSMajorVersion;
    /**
     * @return The OS Minor Version.
     * 
     */
    private final @Nullable String oSMinorVersion;
    /**
     * @return The OS Version.
     * 
     */
    private final @Nullable String oSVersion;
    /**
     * @return The OSEdition.
     * 
     */
    private final @Nullable String osEdition;
    /**
     * @return VM Disk details.
     * 
     */
    private final @Nullable String osType;
    /**
     * @return Product type.
     * 
     */
    private final @Nullable String productType;

    @CustomType.Constructor
    private OSDetailsResponse(
        @CustomType.Parameter("oSMajorVersion") @Nullable String oSMajorVersion,
        @CustomType.Parameter("oSMinorVersion") @Nullable String oSMinorVersion,
        @CustomType.Parameter("oSVersion") @Nullable String oSVersion,
        @CustomType.Parameter("osEdition") @Nullable String osEdition,
        @CustomType.Parameter("osType") @Nullable String osType,
        @CustomType.Parameter("productType") @Nullable String productType) {
        this.oSMajorVersion = oSMajorVersion;
        this.oSMinorVersion = oSMinorVersion;
        this.oSVersion = oSVersion;
        this.osEdition = osEdition;
        this.osType = osType;
        this.productType = productType;
    }

    /**
     * @return The OS Major Version.
     * 
     */
    public Optional<String> oSMajorVersion() {
        return Optional.ofNullable(this.oSMajorVersion);
    }
    /**
     * @return The OS Minor Version.
     * 
     */
    public Optional<String> oSMinorVersion() {
        return Optional.ofNullable(this.oSMinorVersion);
    }
    /**
     * @return The OS Version.
     * 
     */
    public Optional<String> oSVersion() {
        return Optional.ofNullable(this.oSVersion);
    }
    /**
     * @return The OSEdition.
     * 
     */
    public Optional<String> osEdition() {
        return Optional.ofNullable(this.osEdition);
    }
    /**
     * @return VM Disk details.
     * 
     */
    public Optional<String> osType() {
        return Optional.ofNullable(this.osType);
    }
    /**
     * @return Product type.
     * 
     */
    public Optional<String> productType() {
        return Optional.ofNullable(this.productType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OSDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String oSMajorVersion;
        private @Nullable String oSMinorVersion;
        private @Nullable String oSVersion;
        private @Nullable String osEdition;
        private @Nullable String osType;
        private @Nullable String productType;

        public Builder() {
    	      // Empty
        }

        public Builder(OSDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.oSMajorVersion = defaults.oSMajorVersion;
    	      this.oSMinorVersion = defaults.oSMinorVersion;
    	      this.oSVersion = defaults.oSVersion;
    	      this.osEdition = defaults.osEdition;
    	      this.osType = defaults.osType;
    	      this.productType = defaults.productType;
        }

        public Builder oSMajorVersion(@Nullable String oSMajorVersion) {
            this.oSMajorVersion = oSMajorVersion;
            return this;
        }
        public Builder oSMinorVersion(@Nullable String oSMinorVersion) {
            this.oSMinorVersion = oSMinorVersion;
            return this;
        }
        public Builder oSVersion(@Nullable String oSVersion) {
            this.oSVersion = oSVersion;
            return this;
        }
        public Builder osEdition(@Nullable String osEdition) {
            this.osEdition = osEdition;
            return this;
        }
        public Builder osType(@Nullable String osType) {
            this.osType = osType;
            return this;
        }
        public Builder productType(@Nullable String productType) {
            this.productType = productType;
            return this;
        }        public OSDetailsResponse build() {
            return new OSDetailsResponse(oSMajorVersion, oSMinorVersion, oSVersion, osEdition, osType, productType);
        }
    }
}
