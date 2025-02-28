// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.fluidrelay.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetFluidRelayServerKeysResult {
    /**
     * @return The primary key for this server
     * 
     */
    private final String key1;
    /**
     * @return The secondary key for this server
     * 
     */
    private final String key2;

    @CustomType.Constructor
    private GetFluidRelayServerKeysResult(
        @CustomType.Parameter("key1") String key1,
        @CustomType.Parameter("key2") String key2) {
        this.key1 = key1;
        this.key2 = key2;
    }

    /**
     * @return The primary key for this server
     * 
     */
    public String key1() {
        return this.key1;
    }
    /**
     * @return The secondary key for this server
     * 
     */
    public String key2() {
        return this.key2;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFluidRelayServerKeysResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String key1;
        private String key2;

        public Builder() {
    	      // Empty
        }

        public Builder(GetFluidRelayServerKeysResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key1 = defaults.key1;
    	      this.key2 = defaults.key2;
        }

        public Builder key1(String key1) {
            this.key1 = Objects.requireNonNull(key1);
            return this;
        }
        public Builder key2(String key2) {
            this.key2 = Objects.requireNonNull(key2);
            return this;
        }        public GetFluidRelayServerKeysResult build() {
            return new GetFluidRelayServerKeysResult(key1, key2);
        }
    }
}
