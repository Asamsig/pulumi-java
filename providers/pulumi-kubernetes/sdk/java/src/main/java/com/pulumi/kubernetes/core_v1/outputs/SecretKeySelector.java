// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.core_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SecretKeySelector {
    /**
     * @return The key of the secret to select from.  Must be a valid secret key.
     * 
     */
    private final String key;
    /**
     * @return Name of the referent. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names
     * 
     */
    private final @Nullable String name;
    /**
     * @return Specify whether the Secret or its key must be defined
     * 
     */
    private final @Nullable Boolean optional;

    @CustomType.Constructor
    private SecretKeySelector(
        @CustomType.Parameter("key") String key,
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("optional") @Nullable Boolean optional) {
        this.key = key;
        this.name = name;
        this.optional = optional;
    }

    /**
     * @return The key of the secret to select from.  Must be a valid secret key.
     * 
     */
    public String key() {
        return this.key;
    }
    /**
     * @return Name of the referent. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return Specify whether the Secret or its key must be defined
     * 
     */
    public Optional<Boolean> optional() {
        return Optional.ofNullable(this.optional);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecretKeySelector defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String key;
        private @Nullable String name;
        private @Nullable Boolean optional;

        public Builder() {
    	      // Empty
        }

        public Builder(SecretKeySelector defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.name = defaults.name;
    	      this.optional = defaults.optional;
        }

        public Builder key(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder optional(@Nullable Boolean optional) {
            this.optional = optional;
            return this;
        }        public SecretKeySelector build() {
            return new SecretKeySelector(key, name, optional);
        }
    }
}
