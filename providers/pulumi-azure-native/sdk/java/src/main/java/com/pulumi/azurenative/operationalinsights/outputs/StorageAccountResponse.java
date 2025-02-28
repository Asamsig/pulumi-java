// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.operationalinsights.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class StorageAccountResponse {
    /**
     * @return The Azure Resource Manager ID of the storage account resource.
     * 
     */
    private final String id;
    /**
     * @return The storage account key.
     * 
     */
    private final String key;

    @CustomType.Constructor
    private StorageAccountResponse(
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("key") String key) {
        this.id = id;
        this.key = key;
    }

    /**
     * @return The Azure Resource Manager ID of the storage account resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The storage account key.
     * 
     */
    public String key() {
        return this.key;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StorageAccountResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private String key;

        public Builder() {
    	      // Empty
        }

        public Builder(StorageAccountResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.key = defaults.key;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder key(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }        public StorageAccountResponse build() {
            return new StorageAccountResponse(id, key);
        }
    }
}
