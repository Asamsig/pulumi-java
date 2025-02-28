// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.servicefabricmesh.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.util.Objects;


/**
 * This type describes the requested resources for a given container. It describes the least amount of resources required for the container. A container can consume more than requested resources up to the specified limits before being restarted. Currently, the requested resources are treated as limits.
 * 
 */
public final class ResourceRequestsArgs extends com.pulumi.resources.ResourceArgs {

    public static final ResourceRequestsArgs Empty = new ResourceRequestsArgs();

    /**
     * Requested number of CPU cores. At present, only full cores are supported.
     * 
     */
    @Import(name="cpu", required=true)
    private Output<Double> cpu;

    /**
     * @return Requested number of CPU cores. At present, only full cores are supported.
     * 
     */
    public Output<Double> cpu() {
        return this.cpu;
    }

    /**
     * The memory request in GB for this container.
     * 
     */
    @Import(name="memoryInGB", required=true)
    private Output<Double> memoryInGB;

    /**
     * @return The memory request in GB for this container.
     * 
     */
    public Output<Double> memoryInGB() {
        return this.memoryInGB;
    }

    private ResourceRequestsArgs() {}

    private ResourceRequestsArgs(ResourceRequestsArgs $) {
        this.cpu = $.cpu;
        this.memoryInGB = $.memoryInGB;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ResourceRequestsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ResourceRequestsArgs $;

        public Builder() {
            $ = new ResourceRequestsArgs();
        }

        public Builder(ResourceRequestsArgs defaults) {
            $ = new ResourceRequestsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param cpu Requested number of CPU cores. At present, only full cores are supported.
         * 
         * @return builder
         * 
         */
        public Builder cpu(Output<Double> cpu) {
            $.cpu = cpu;
            return this;
        }

        /**
         * @param cpu Requested number of CPU cores. At present, only full cores are supported.
         * 
         * @return builder
         * 
         */
        public Builder cpu(Double cpu) {
            return cpu(Output.of(cpu));
        }

        /**
         * @param memoryInGB The memory request in GB for this container.
         * 
         * @return builder
         * 
         */
        public Builder memoryInGB(Output<Double> memoryInGB) {
            $.memoryInGB = memoryInGB;
            return this;
        }

        /**
         * @param memoryInGB The memory request in GB for this container.
         * 
         * @return builder
         * 
         */
        public Builder memoryInGB(Double memoryInGB) {
            return memoryInGB(Output.of(memoryInGB));
        }

        public ResourceRequestsArgs build() {
            $.cpu = Objects.requireNonNull($.cpu, "expected parameter 'cpu' to be non-null");
            $.memoryInGB = Objects.requireNonNull($.memoryInGB, "expected parameter 'memoryInGB' to be non-null");
            return $;
        }
    }

}
