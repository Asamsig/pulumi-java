// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.lighthouse.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class DefinitionPlanArgs extends com.pulumi.resources.ResourceArgs {

    public static final DefinitionPlanArgs Empty = new DefinitionPlanArgs();

    /**
     * The plan name of the marketplace offer.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The plan name of the marketplace offer.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * The product code of the plan.
     * 
     */
    @Import(name="product", required=true)
    private Output<String> product;

    /**
     * @return The product code of the plan.
     * 
     */
    public Output<String> product() {
        return this.product;
    }

    /**
     * The publisher ID of the plan.
     * 
     */
    @Import(name="publisher", required=true)
    private Output<String> publisher;

    /**
     * @return The publisher ID of the plan.
     * 
     */
    public Output<String> publisher() {
        return this.publisher;
    }

    /**
     * The version of the plan.
     * 
     */
    @Import(name="version", required=true)
    private Output<String> version;

    /**
     * @return The version of the plan.
     * 
     */
    public Output<String> version() {
        return this.version;
    }

    private DefinitionPlanArgs() {}

    private DefinitionPlanArgs(DefinitionPlanArgs $) {
        this.name = $.name;
        this.product = $.product;
        this.publisher = $.publisher;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DefinitionPlanArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DefinitionPlanArgs $;

        public Builder() {
            $ = new DefinitionPlanArgs();
        }

        public Builder(DefinitionPlanArgs defaults) {
            $ = new DefinitionPlanArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The plan name of the marketplace offer.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The plan name of the marketplace offer.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param product The product code of the plan.
         * 
         * @return builder
         * 
         */
        public Builder product(Output<String> product) {
            $.product = product;
            return this;
        }

        /**
         * @param product The product code of the plan.
         * 
         * @return builder
         * 
         */
        public Builder product(String product) {
            return product(Output.of(product));
        }

        /**
         * @param publisher The publisher ID of the plan.
         * 
         * @return builder
         * 
         */
        public Builder publisher(Output<String> publisher) {
            $.publisher = publisher;
            return this;
        }

        /**
         * @param publisher The publisher ID of the plan.
         * 
         * @return builder
         * 
         */
        public Builder publisher(String publisher) {
            return publisher(Output.of(publisher));
        }

        /**
         * @param version The version of the plan.
         * 
         * @return builder
         * 
         */
        public Builder version(Output<String> version) {
            $.version = version;
            return this;
        }

        /**
         * @param version The version of the plan.
         * 
         * @return builder
         * 
         */
        public Builder version(String version) {
            return version(Output.of(version));
        }

        public DefinitionPlanArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.product = Objects.requireNonNull($.product, "expected parameter 'product' to be non-null");
            $.publisher = Objects.requireNonNull($.publisher, "expected parameter 'publisher' to be non-null");
            $.version = Objects.requireNonNull($.version, "expected parameter 'version' to be non-null");
            return $;
        }
    }

}
