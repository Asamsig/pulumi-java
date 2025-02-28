// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.nimblestudio.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class StudioComponentLicenseServiceConfiguration {
    /**
     * @return &lt;p&gt;The endpoint of the license service that is accessed by the studio component resource.&lt;/p&gt;
     * 
     */
    private final @Nullable String endpoint;

    @CustomType.Constructor
    private StudioComponentLicenseServiceConfiguration(@CustomType.Parameter("endpoint") @Nullable String endpoint) {
        this.endpoint = endpoint;
    }

    /**
     * @return &lt;p&gt;The endpoint of the license service that is accessed by the studio component resource.&lt;/p&gt;
     * 
     */
    public Optional<String> endpoint() {
        return Optional.ofNullable(this.endpoint);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StudioComponentLicenseServiceConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String endpoint;

        public Builder() {
    	      // Empty
        }

        public Builder(StudioComponentLicenseServiceConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endpoint = defaults.endpoint;
        }

        public Builder endpoint(@Nullable String endpoint) {
            this.endpoint = endpoint;
            return this;
        }        public StudioComponentLicenseServiceConfiguration build() {
            return new StudioComponentLicenseServiceConfiguration(endpoint);
        }
    }
}
