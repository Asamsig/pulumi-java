// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.cloudwatch.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * This structure defines the metrics that will be streamed.
 * 
 */
public final class MetricStreamFilterArgs extends com.pulumi.resources.ResourceArgs {

    public static final MetricStreamFilterArgs Empty = new MetricStreamFilterArgs();

    /**
     * Only metrics with Namespace matching this value will be streamed.
     * 
     */
    @Import(name="namespace", required=true)
    private Output<String> namespace;

    /**
     * @return Only metrics with Namespace matching this value will be streamed.
     * 
     */
    public Output<String> namespace() {
        return this.namespace;
    }

    private MetricStreamFilterArgs() {}

    private MetricStreamFilterArgs(MetricStreamFilterArgs $) {
        this.namespace = $.namespace;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MetricStreamFilterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MetricStreamFilterArgs $;

        public Builder() {
            $ = new MetricStreamFilterArgs();
        }

        public Builder(MetricStreamFilterArgs defaults) {
            $ = new MetricStreamFilterArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param namespace Only metrics with Namespace matching this value will be streamed.
         * 
         * @return builder
         * 
         */
        public Builder namespace(Output<String> namespace) {
            $.namespace = namespace;
            return this;
        }

        /**
         * @param namespace Only metrics with Namespace matching this value will be streamed.
         * 
         * @return builder
         * 
         */
        public Builder namespace(String namespace) {
            return namespace(Output.of(namespace));
        }

        public MetricStreamFilterArgs build() {
            $.namespace = Objects.requireNonNull($.namespace, "expected parameter 'namespace' to be non-null");
            return $;
        }
    }

}
