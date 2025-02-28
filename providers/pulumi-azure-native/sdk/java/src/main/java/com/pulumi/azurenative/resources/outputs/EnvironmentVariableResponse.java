// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.resources.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class EnvironmentVariableResponse {
    /**
     * @return The name of the environment variable.
     * 
     */
    private final String name;
    /**
     * @return The value of the secure environment variable.
     * 
     */
    private final @Nullable String secureValue;
    /**
     * @return The value of the environment variable.
     * 
     */
    private final @Nullable String value;

    @CustomType.Constructor
    private EnvironmentVariableResponse(
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("secureValue") @Nullable String secureValue,
        @CustomType.Parameter("value") @Nullable String value) {
        this.name = name;
        this.secureValue = secureValue;
        this.value = value;
    }

    /**
     * @return The name of the environment variable.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The value of the secure environment variable.
     * 
     */
    public Optional<String> secureValue() {
        return Optional.ofNullable(this.secureValue);
    }
    /**
     * @return The value of the environment variable.
     * 
     */
    public Optional<String> value() {
        return Optional.ofNullable(this.value);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnvironmentVariableResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private @Nullable String secureValue;
        private @Nullable String value;

        public Builder() {
    	      // Empty
        }

        public Builder(EnvironmentVariableResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.secureValue = defaults.secureValue;
    	      this.value = defaults.value;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder secureValue(@Nullable String secureValue) {
            this.secureValue = secureValue;
            return this;
        }
        public Builder value(@Nullable String value) {
            this.value = value;
            return this;
        }        public EnvironmentVariableResponse build() {
            return new EnvironmentVariableResponse(name, secureValue, value);
        }
    }
}
