// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.kafkaconnect.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


/**
 * Specifies the worker configuration to use with the connector.
 * 
 */
public final class ConnectorWorkerConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConnectorWorkerConfigurationArgs Empty = new ConnectorWorkerConfigurationArgs();

    /**
     * The revision of the worker configuration to use.
     * 
     */
    @Import(name="revision", required=true)
    private Output<Integer> revision;

    /**
     * @return The revision of the worker configuration to use.
     * 
     */
    public Output<Integer> revision() {
        return this.revision;
    }

    /**
     * The Amazon Resource Name (ARN) of the worker configuration to use.
     * 
     */
    @Import(name="workerConfigurationArn", required=true)
    private Output<String> workerConfigurationArn;

    /**
     * @return The Amazon Resource Name (ARN) of the worker configuration to use.
     * 
     */
    public Output<String> workerConfigurationArn() {
        return this.workerConfigurationArn;
    }

    private ConnectorWorkerConfigurationArgs() {}

    private ConnectorWorkerConfigurationArgs(ConnectorWorkerConfigurationArgs $) {
        this.revision = $.revision;
        this.workerConfigurationArn = $.workerConfigurationArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConnectorWorkerConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConnectorWorkerConfigurationArgs $;

        public Builder() {
            $ = new ConnectorWorkerConfigurationArgs();
        }

        public Builder(ConnectorWorkerConfigurationArgs defaults) {
            $ = new ConnectorWorkerConfigurationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param revision The revision of the worker configuration to use.
         * 
         * @return builder
         * 
         */
        public Builder revision(Output<Integer> revision) {
            $.revision = revision;
            return this;
        }

        /**
         * @param revision The revision of the worker configuration to use.
         * 
         * @return builder
         * 
         */
        public Builder revision(Integer revision) {
            return revision(Output.of(revision));
        }

        /**
         * @param workerConfigurationArn The Amazon Resource Name (ARN) of the worker configuration to use.
         * 
         * @return builder
         * 
         */
        public Builder workerConfigurationArn(Output<String> workerConfigurationArn) {
            $.workerConfigurationArn = workerConfigurationArn;
            return this;
        }

        /**
         * @param workerConfigurationArn The Amazon Resource Name (ARN) of the worker configuration to use.
         * 
         * @return builder
         * 
         */
        public Builder workerConfigurationArn(String workerConfigurationArn) {
            return workerConfigurationArn(Output.of(workerConfigurationArn));
        }

        public ConnectorWorkerConfigurationArgs build() {
            $.revision = Objects.requireNonNull($.revision, "expected parameter 'revision' to be non-null");
            $.workerConfigurationArn = Objects.requireNonNull($.workerConfigurationArn, "expected parameter 'workerConfigurationArn' to be non-null");
            return $;
        }
    }

}
