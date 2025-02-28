// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.providerhub;

import com.pulumi.azurenative.providerhub.inputs.SkuResourcePropertiesArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SkusNestedResourceTypeThirdArgs extends com.pulumi.resources.ResourceArgs {

    public static final SkusNestedResourceTypeThirdArgs Empty = new SkusNestedResourceTypeThirdArgs();

    /**
     * The first child resource type.
     * 
     */
    @Import(name="nestedResourceTypeFirst", required=true)
    private Output<String> nestedResourceTypeFirst;

    /**
     * @return The first child resource type.
     * 
     */
    public Output<String> nestedResourceTypeFirst() {
        return this.nestedResourceTypeFirst;
    }

    /**
     * The second child resource type.
     * 
     */
    @Import(name="nestedResourceTypeSecond", required=true)
    private Output<String> nestedResourceTypeSecond;

    /**
     * @return The second child resource type.
     * 
     */
    public Output<String> nestedResourceTypeSecond() {
        return this.nestedResourceTypeSecond;
    }

    /**
     * The third child resource type.
     * 
     */
    @Import(name="nestedResourceTypeThird", required=true)
    private Output<String> nestedResourceTypeThird;

    /**
     * @return The third child resource type.
     * 
     */
    public Output<String> nestedResourceTypeThird() {
        return this.nestedResourceTypeThird;
    }

    @Import(name="properties")
    private @Nullable Output<SkuResourcePropertiesArgs> properties;

    public Optional<Output<SkuResourcePropertiesArgs>> properties() {
        return Optional.ofNullable(this.properties);
    }

    /**
     * The name of the resource provider hosted within ProviderHub.
     * 
     */
    @Import(name="providerNamespace", required=true)
    private Output<String> providerNamespace;

    /**
     * @return The name of the resource provider hosted within ProviderHub.
     * 
     */
    public Output<String> providerNamespace() {
        return this.providerNamespace;
    }

    /**
     * The resource type.
     * 
     */
    @Import(name="resourceType", required=true)
    private Output<String> resourceType;

    /**
     * @return The resource type.
     * 
     */
    public Output<String> resourceType() {
        return this.resourceType;
    }

    /**
     * The SKU.
     * 
     */
    @Import(name="sku")
    private @Nullable Output<String> sku;

    /**
     * @return The SKU.
     * 
     */
    public Optional<Output<String>> sku() {
        return Optional.ofNullable(this.sku);
    }

    private SkusNestedResourceTypeThirdArgs() {}

    private SkusNestedResourceTypeThirdArgs(SkusNestedResourceTypeThirdArgs $) {
        this.nestedResourceTypeFirst = $.nestedResourceTypeFirst;
        this.nestedResourceTypeSecond = $.nestedResourceTypeSecond;
        this.nestedResourceTypeThird = $.nestedResourceTypeThird;
        this.properties = $.properties;
        this.providerNamespace = $.providerNamespace;
        this.resourceType = $.resourceType;
        this.sku = $.sku;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SkusNestedResourceTypeThirdArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SkusNestedResourceTypeThirdArgs $;

        public Builder() {
            $ = new SkusNestedResourceTypeThirdArgs();
        }

        public Builder(SkusNestedResourceTypeThirdArgs defaults) {
            $ = new SkusNestedResourceTypeThirdArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param nestedResourceTypeFirst The first child resource type.
         * 
         * @return builder
         * 
         */
        public Builder nestedResourceTypeFirst(Output<String> nestedResourceTypeFirst) {
            $.nestedResourceTypeFirst = nestedResourceTypeFirst;
            return this;
        }

        /**
         * @param nestedResourceTypeFirst The first child resource type.
         * 
         * @return builder
         * 
         */
        public Builder nestedResourceTypeFirst(String nestedResourceTypeFirst) {
            return nestedResourceTypeFirst(Output.of(nestedResourceTypeFirst));
        }

        /**
         * @param nestedResourceTypeSecond The second child resource type.
         * 
         * @return builder
         * 
         */
        public Builder nestedResourceTypeSecond(Output<String> nestedResourceTypeSecond) {
            $.nestedResourceTypeSecond = nestedResourceTypeSecond;
            return this;
        }

        /**
         * @param nestedResourceTypeSecond The second child resource type.
         * 
         * @return builder
         * 
         */
        public Builder nestedResourceTypeSecond(String nestedResourceTypeSecond) {
            return nestedResourceTypeSecond(Output.of(nestedResourceTypeSecond));
        }

        /**
         * @param nestedResourceTypeThird The third child resource type.
         * 
         * @return builder
         * 
         */
        public Builder nestedResourceTypeThird(Output<String> nestedResourceTypeThird) {
            $.nestedResourceTypeThird = nestedResourceTypeThird;
            return this;
        }

        /**
         * @param nestedResourceTypeThird The third child resource type.
         * 
         * @return builder
         * 
         */
        public Builder nestedResourceTypeThird(String nestedResourceTypeThird) {
            return nestedResourceTypeThird(Output.of(nestedResourceTypeThird));
        }

        public Builder properties(@Nullable Output<SkuResourcePropertiesArgs> properties) {
            $.properties = properties;
            return this;
        }

        public Builder properties(SkuResourcePropertiesArgs properties) {
            return properties(Output.of(properties));
        }

        /**
         * @param providerNamespace The name of the resource provider hosted within ProviderHub.
         * 
         * @return builder
         * 
         */
        public Builder providerNamespace(Output<String> providerNamespace) {
            $.providerNamespace = providerNamespace;
            return this;
        }

        /**
         * @param providerNamespace The name of the resource provider hosted within ProviderHub.
         * 
         * @return builder
         * 
         */
        public Builder providerNamespace(String providerNamespace) {
            return providerNamespace(Output.of(providerNamespace));
        }

        /**
         * @param resourceType The resource type.
         * 
         * @return builder
         * 
         */
        public Builder resourceType(Output<String> resourceType) {
            $.resourceType = resourceType;
            return this;
        }

        /**
         * @param resourceType The resource type.
         * 
         * @return builder
         * 
         */
        public Builder resourceType(String resourceType) {
            return resourceType(Output.of(resourceType));
        }

        /**
         * @param sku The SKU.
         * 
         * @return builder
         * 
         */
        public Builder sku(@Nullable Output<String> sku) {
            $.sku = sku;
            return this;
        }

        /**
         * @param sku The SKU.
         * 
         * @return builder
         * 
         */
        public Builder sku(String sku) {
            return sku(Output.of(sku));
        }

        public SkusNestedResourceTypeThirdArgs build() {
            $.nestedResourceTypeFirst = Objects.requireNonNull($.nestedResourceTypeFirst, "expected parameter 'nestedResourceTypeFirst' to be non-null");
            $.nestedResourceTypeSecond = Objects.requireNonNull($.nestedResourceTypeSecond, "expected parameter 'nestedResourceTypeSecond' to be non-null");
            $.nestedResourceTypeThird = Objects.requireNonNull($.nestedResourceTypeThird, "expected parameter 'nestedResourceTypeThird' to be non-null");
            $.providerNamespace = Objects.requireNonNull($.providerNamespace, "expected parameter 'providerNamespace' to be non-null");
            $.resourceType = Objects.requireNonNull($.resourceType, "expected parameter 'resourceType' to be non-null");
            return $;
        }
    }

}
