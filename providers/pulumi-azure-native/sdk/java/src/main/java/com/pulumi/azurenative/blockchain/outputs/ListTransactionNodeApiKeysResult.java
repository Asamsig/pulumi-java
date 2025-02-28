// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.blockchain.outputs;

import com.pulumi.azurenative.blockchain.outputs.ApiKeyResponse;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class ListTransactionNodeApiKeysResult {
    /**
     * @return Gets or sets the collection of API key.
     * 
     */
    private final @Nullable List<ApiKeyResponse> keys;

    @CustomType.Constructor
    private ListTransactionNodeApiKeysResult(@CustomType.Parameter("keys") @Nullable List<ApiKeyResponse> keys) {
        this.keys = keys;
    }

    /**
     * @return Gets or sets the collection of API key.
     * 
     */
    public List<ApiKeyResponse> keys() {
        return this.keys == null ? List.of() : this.keys;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListTransactionNodeApiKeysResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<ApiKeyResponse> keys;

        public Builder() {
    	      // Empty
        }

        public Builder(ListTransactionNodeApiKeysResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keys = defaults.keys;
        }

        public Builder keys(@Nullable List<ApiKeyResponse> keys) {
            this.keys = keys;
            return this;
        }
        public Builder keys(ApiKeyResponse... keys) {
            return keys(List.of(keys));
        }        public ListTransactionNodeApiKeysResult build() {
            return new ListTransactionNodeApiKeysResult(keys);
        }
    }
}
