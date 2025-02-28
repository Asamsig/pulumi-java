// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.hdinsight.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The virtual network properties.
 * 
 */
public final class VirtualNetworkProfileArgs extends com.pulumi.resources.ResourceArgs {

    public static final VirtualNetworkProfileArgs Empty = new VirtualNetworkProfileArgs();

    /**
     * The ID of the virtual network.
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return The ID of the virtual network.
     * 
     */
    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * The name of the subnet.
     * 
     */
    @Import(name="subnet")
    private @Nullable Output<String> subnet;

    /**
     * @return The name of the subnet.
     * 
     */
    public Optional<Output<String>> subnet() {
        return Optional.ofNullable(this.subnet);
    }

    private VirtualNetworkProfileArgs() {}

    private VirtualNetworkProfileArgs(VirtualNetworkProfileArgs $) {
        this.id = $.id;
        this.subnet = $.subnet;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VirtualNetworkProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VirtualNetworkProfileArgs $;

        public Builder() {
            $ = new VirtualNetworkProfileArgs();
        }

        public Builder(VirtualNetworkProfileArgs defaults) {
            $ = new VirtualNetworkProfileArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id The ID of the virtual network.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id The ID of the virtual network.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param subnet The name of the subnet.
         * 
         * @return builder
         * 
         */
        public Builder subnet(@Nullable Output<String> subnet) {
            $.subnet = subnet;
            return this;
        }

        /**
         * @param subnet The name of the subnet.
         * 
         * @return builder
         * 
         */
        public Builder subnet(String subnet) {
            return subnet(Output.of(subnet));
        }

        public VirtualNetworkProfileArgs build() {
            return $;
        }
    }

}
