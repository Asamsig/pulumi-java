// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.containerinstance.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GpuResourceResponse {
    /**
     * @return The count of the GPU resource.
     * 
     */
    private final Integer count;
    /**
     * @return The SKU of the GPU resource.
     * 
     */
    private final String sku;

    @CustomType.Constructor
    private GpuResourceResponse(
        @CustomType.Parameter("count") Integer count,
        @CustomType.Parameter("sku") String sku) {
        this.count = count;
        this.sku = sku;
    }

    /**
     * @return The count of the GPU resource.
     * 
     */
    public Integer count() {
        return this.count;
    }
    /**
     * @return The SKU of the GPU resource.
     * 
     */
    public String sku() {
        return this.sku;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GpuResourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer count;
        private String sku;

        public Builder() {
    	      // Empty
        }

        public Builder(GpuResourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.count = defaults.count;
    	      this.sku = defaults.sku;
        }

        public Builder count(Integer count) {
            this.count = Objects.requireNonNull(count);
            return this;
        }
        public Builder sku(String sku) {
            this.sku = Objects.requireNonNull(sku);
            return this;
        }        public GpuResourceResponse build() {
            return new GpuResourceResponse(count, sku);
        }
    }
}
