// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.search.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServiceQueryKey {
    /**
     * @return The value of this Query Key.
     * 
     */
    private final @Nullable String key;
    /**
     * @return The Name which should be used for this Search Service. Changing this forces a new Search Service to be created.
     * 
     */
    private final @Nullable String name;

    @CustomType.Constructor
    private ServiceQueryKey(
        @CustomType.Parameter("key") @Nullable String key,
        @CustomType.Parameter("name") @Nullable String name) {
        this.key = key;
        this.name = name;
    }

    /**
     * @return The value of this Query Key.
     * 
     */
    public Optional<String> key() {
        return Optional.ofNullable(this.key);
    }
    /**
     * @return The Name which should be used for this Search Service. Changing this forces a new Search Service to be created.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceQueryKey defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String key;
        private @Nullable String name;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceQueryKey defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.name = defaults.name;
        }

        public Builder key(@Nullable String key) {
            this.key = key;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }        public ServiceQueryKey build() {
            return new ServiceQueryKey(key, name);
        }
    }
}
