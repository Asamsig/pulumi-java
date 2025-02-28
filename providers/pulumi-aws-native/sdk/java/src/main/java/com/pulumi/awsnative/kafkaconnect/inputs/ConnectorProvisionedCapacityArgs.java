// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.kafkaconnect.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Details about a fixed capacity allocated to a connector.
 * 
 */
public final class ConnectorProvisionedCapacityArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConnectorProvisionedCapacityArgs Empty = new ConnectorProvisionedCapacityArgs();

    /**
     * Specifies how many MSK Connect Units (MCU) are allocated to the connector.
     * 
     */
    @Import(name="mcuCount")
    private @Nullable Output<Integer> mcuCount;

    /**
     * @return Specifies how many MSK Connect Units (MCU) are allocated to the connector.
     * 
     */
    public Optional<Output<Integer>> mcuCount() {
        return Optional.ofNullable(this.mcuCount);
    }

    /**
     * Number of workers for a connector.
     * 
     */
    @Import(name="workerCount", required=true)
    private Output<Integer> workerCount;

    /**
     * @return Number of workers for a connector.
     * 
     */
    public Output<Integer> workerCount() {
        return this.workerCount;
    }

    private ConnectorProvisionedCapacityArgs() {}

    private ConnectorProvisionedCapacityArgs(ConnectorProvisionedCapacityArgs $) {
        this.mcuCount = $.mcuCount;
        this.workerCount = $.workerCount;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConnectorProvisionedCapacityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConnectorProvisionedCapacityArgs $;

        public Builder() {
            $ = new ConnectorProvisionedCapacityArgs();
        }

        public Builder(ConnectorProvisionedCapacityArgs defaults) {
            $ = new ConnectorProvisionedCapacityArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param mcuCount Specifies how many MSK Connect Units (MCU) are allocated to the connector.
         * 
         * @return builder
         * 
         */
        public Builder mcuCount(@Nullable Output<Integer> mcuCount) {
            $.mcuCount = mcuCount;
            return this;
        }

        /**
         * @param mcuCount Specifies how many MSK Connect Units (MCU) are allocated to the connector.
         * 
         * @return builder
         * 
         */
        public Builder mcuCount(Integer mcuCount) {
            return mcuCount(Output.of(mcuCount));
        }

        /**
         * @param workerCount Number of workers for a connector.
         * 
         * @return builder
         * 
         */
        public Builder workerCount(Output<Integer> workerCount) {
            $.workerCount = workerCount;
            return this;
        }

        /**
         * @param workerCount Number of workers for a connector.
         * 
         * @return builder
         * 
         */
        public Builder workerCount(Integer workerCount) {
            return workerCount(Output.of(workerCount));
        }

        public ConnectorProvisionedCapacityArgs build() {
            $.workerCount = Objects.requireNonNull($.workerCount, "expected parameter 'workerCount' to be non-null");
            return $;
        }
    }

}
