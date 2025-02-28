// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.botservice.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServiceProviderParameterResponseConstraints {
    /**
     * @return Whether required the constraints of the bot meta data.
     * 
     */
    private final @Nullable Boolean required;

    @CustomType.Constructor
    private ServiceProviderParameterResponseConstraints(@CustomType.Parameter("required") @Nullable Boolean required) {
        this.required = required;
    }

    /**
     * @return Whether required the constraints of the bot meta data.
     * 
     */
    public Optional<Boolean> required() {
        return Optional.ofNullable(this.required);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceProviderParameterResponseConstraints defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean required;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceProviderParameterResponseConstraints defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.required = defaults.required;
        }

        public Builder required(@Nullable Boolean required) {
            this.required = required;
            return this;
        }        public ServiceProviderParameterResponseConstraints build() {
            return new ServiceProviderParameterResponseConstraints(required);
        }
    }
}
