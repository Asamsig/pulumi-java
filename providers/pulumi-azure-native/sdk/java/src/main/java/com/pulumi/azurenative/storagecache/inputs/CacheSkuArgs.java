// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.storagecache.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * SKU for the Cache.
 * 
 */
public final class CacheSkuArgs extends com.pulumi.resources.ResourceArgs {

    public static final CacheSkuArgs Empty = new CacheSkuArgs();

    /**
     * SKU name for this Cache.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return SKU name for this Cache.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private CacheSkuArgs() {}

    private CacheSkuArgs(CacheSkuArgs $) {
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CacheSkuArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CacheSkuArgs $;

        public Builder() {
            $ = new CacheSkuArgs();
        }

        public Builder(CacheSkuArgs defaults) {
            $ = new CacheSkuArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name SKU name for this Cache.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name SKU name for this Cache.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public CacheSkuArgs build() {
            return $;
        }
    }

}
