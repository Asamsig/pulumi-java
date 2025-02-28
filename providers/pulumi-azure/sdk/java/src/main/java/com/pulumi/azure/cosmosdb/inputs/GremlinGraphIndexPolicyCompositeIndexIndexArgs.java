// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.cosmosdb.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GremlinGraphIndexPolicyCompositeIndexIndexArgs extends com.pulumi.resources.ResourceArgs {

    public static final GremlinGraphIndexPolicyCompositeIndexIndexArgs Empty = new GremlinGraphIndexPolicyCompositeIndexIndexArgs();

    /**
     * Order of the index. Possible values are `Ascending` or `Descending`.
     * 
     */
    @Import(name="order", required=true)
    private Output<String> order;

    /**
     * @return Order of the index. Possible values are `Ascending` or `Descending`.
     * 
     */
    public Output<String> order() {
        return this.order;
    }

    /**
     * Path for which the indexing behaviour applies to.
     * 
     */
    @Import(name="path", required=true)
    private Output<String> path;

    /**
     * @return Path for which the indexing behaviour applies to.
     * 
     */
    public Output<String> path() {
        return this.path;
    }

    private GremlinGraphIndexPolicyCompositeIndexIndexArgs() {}

    private GremlinGraphIndexPolicyCompositeIndexIndexArgs(GremlinGraphIndexPolicyCompositeIndexIndexArgs $) {
        this.order = $.order;
        this.path = $.path;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GremlinGraphIndexPolicyCompositeIndexIndexArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GremlinGraphIndexPolicyCompositeIndexIndexArgs $;

        public Builder() {
            $ = new GremlinGraphIndexPolicyCompositeIndexIndexArgs();
        }

        public Builder(GremlinGraphIndexPolicyCompositeIndexIndexArgs defaults) {
            $ = new GremlinGraphIndexPolicyCompositeIndexIndexArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param order Order of the index. Possible values are `Ascending` or `Descending`.
         * 
         * @return builder
         * 
         */
        public Builder order(Output<String> order) {
            $.order = order;
            return this;
        }

        /**
         * @param order Order of the index. Possible values are `Ascending` or `Descending`.
         * 
         * @return builder
         * 
         */
        public Builder order(String order) {
            return order(Output.of(order));
        }

        /**
         * @param path Path for which the indexing behaviour applies to.
         * 
         * @return builder
         * 
         */
        public Builder path(Output<String> path) {
            $.path = path;
            return this;
        }

        /**
         * @param path Path for which the indexing behaviour applies to.
         * 
         * @return builder
         * 
         */
        public Builder path(String path) {
            return path(Output.of(path));
        }

        public GremlinGraphIndexPolicyCompositeIndexIndexArgs build() {
            $.order = Objects.requireNonNull($.order, "expected parameter 'order' to be non-null");
            $.path = Objects.requireNonNull($.path, "expected parameter 'path' to be non-null");
            return $;
        }
    }

}
