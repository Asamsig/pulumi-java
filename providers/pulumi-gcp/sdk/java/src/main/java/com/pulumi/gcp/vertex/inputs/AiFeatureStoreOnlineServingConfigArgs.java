// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.vertex.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;


public final class AiFeatureStoreOnlineServingConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final AiFeatureStoreOnlineServingConfigArgs Empty = new AiFeatureStoreOnlineServingConfigArgs();

    /**
     * The number of nodes for each cluster. The number of nodes will not scale automatically but can be scaled manually by providing different values when updating.
     * 
     */
    @Import(name="fixedNodeCount", required=true)
    private Output<Integer> fixedNodeCount;

    /**
     * @return The number of nodes for each cluster. The number of nodes will not scale automatically but can be scaled manually by providing different values when updating.
     * 
     */
    public Output<Integer> fixedNodeCount() {
        return this.fixedNodeCount;
    }

    private AiFeatureStoreOnlineServingConfigArgs() {}

    private AiFeatureStoreOnlineServingConfigArgs(AiFeatureStoreOnlineServingConfigArgs $) {
        this.fixedNodeCount = $.fixedNodeCount;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AiFeatureStoreOnlineServingConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AiFeatureStoreOnlineServingConfigArgs $;

        public Builder() {
            $ = new AiFeatureStoreOnlineServingConfigArgs();
        }

        public Builder(AiFeatureStoreOnlineServingConfigArgs defaults) {
            $ = new AiFeatureStoreOnlineServingConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param fixedNodeCount The number of nodes for each cluster. The number of nodes will not scale automatically but can be scaled manually by providing different values when updating.
         * 
         * @return builder
         * 
         */
        public Builder fixedNodeCount(Output<Integer> fixedNodeCount) {
            $.fixedNodeCount = fixedNodeCount;
            return this;
        }

        /**
         * @param fixedNodeCount The number of nodes for each cluster. The number of nodes will not scale automatically but can be scaled manually by providing different values when updating.
         * 
         * @return builder
         * 
         */
        public Builder fixedNodeCount(Integer fixedNodeCount) {
            return fixedNodeCount(Output.of(fixedNodeCount));
        }

        public AiFeatureStoreOnlineServingConfigArgs build() {
            $.fixedNodeCount = Objects.requireNonNull($.fixedNodeCount, "expected parameter 'fixedNodeCount' to be non-null");
            return $;
        }
    }

}
