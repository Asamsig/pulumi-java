// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appmesh.inputs;

import com.pulumi.aws.appmesh.inputs.VirtualRouterSpecListenerArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;


public final class VirtualRouterSpecArgs extends com.pulumi.resources.ResourceArgs {

    public static final VirtualRouterSpecArgs Empty = new VirtualRouterSpecArgs();

    /**
     * The listeners that the virtual router is expected to receive inbound traffic from.
     * Currently only one listener is supported per virtual router.
     * 
     */
    @Import(name="listener", required=true)
    private Output<VirtualRouterSpecListenerArgs> listener;

    /**
     * @return The listeners that the virtual router is expected to receive inbound traffic from.
     * Currently only one listener is supported per virtual router.
     * 
     */
    public Output<VirtualRouterSpecListenerArgs> listener() {
        return this.listener;
    }

    private VirtualRouterSpecArgs() {}

    private VirtualRouterSpecArgs(VirtualRouterSpecArgs $) {
        this.listener = $.listener;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VirtualRouterSpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VirtualRouterSpecArgs $;

        public Builder() {
            $ = new VirtualRouterSpecArgs();
        }

        public Builder(VirtualRouterSpecArgs defaults) {
            $ = new VirtualRouterSpecArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param listener The listeners that the virtual router is expected to receive inbound traffic from.
         * Currently only one listener is supported per virtual router.
         * 
         * @return builder
         * 
         */
        public Builder listener(Output<VirtualRouterSpecListenerArgs> listener) {
            $.listener = listener;
            return this;
        }

        /**
         * @param listener The listeners that the virtual router is expected to receive inbound traffic from.
         * Currently only one listener is supported per virtual router.
         * 
         * @return builder
         * 
         */
        public Builder listener(VirtualRouterSpecListenerArgs listener) {
            return listener(Output.of(listener));
        }

        public VirtualRouterSpecArgs build() {
            $.listener = Objects.requireNonNull($.listener, "expected parameter 'listener' to be non-null");
            return $;
        }
    }

}
