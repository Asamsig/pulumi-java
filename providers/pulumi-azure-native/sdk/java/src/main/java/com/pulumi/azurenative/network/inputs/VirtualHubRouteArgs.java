// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * VirtualHub route.
 * 
 */
public final class VirtualHubRouteArgs extends com.pulumi.resources.ResourceArgs {

    public static final VirtualHubRouteArgs Empty = new VirtualHubRouteArgs();

    /**
     * List of all addressPrefixes.
     * 
     */
    @Import(name="addressPrefixes")
    private @Nullable Output<List<String>> addressPrefixes;

    /**
     * @return List of all addressPrefixes.
     * 
     */
    public Optional<Output<List<String>>> addressPrefixes() {
        return Optional.ofNullable(this.addressPrefixes);
    }

    /**
     * NextHop ip address.
     * 
     */
    @Import(name="nextHopIpAddress")
    private @Nullable Output<String> nextHopIpAddress;

    /**
     * @return NextHop ip address.
     * 
     */
    public Optional<Output<String>> nextHopIpAddress() {
        return Optional.ofNullable(this.nextHopIpAddress);
    }

    private VirtualHubRouteArgs() {}

    private VirtualHubRouteArgs(VirtualHubRouteArgs $) {
        this.addressPrefixes = $.addressPrefixes;
        this.nextHopIpAddress = $.nextHopIpAddress;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VirtualHubRouteArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VirtualHubRouteArgs $;

        public Builder() {
            $ = new VirtualHubRouteArgs();
        }

        public Builder(VirtualHubRouteArgs defaults) {
            $ = new VirtualHubRouteArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param addressPrefixes List of all addressPrefixes.
         * 
         * @return builder
         * 
         */
        public Builder addressPrefixes(@Nullable Output<List<String>> addressPrefixes) {
            $.addressPrefixes = addressPrefixes;
            return this;
        }

        /**
         * @param addressPrefixes List of all addressPrefixes.
         * 
         * @return builder
         * 
         */
        public Builder addressPrefixes(List<String> addressPrefixes) {
            return addressPrefixes(Output.of(addressPrefixes));
        }

        /**
         * @param addressPrefixes List of all addressPrefixes.
         * 
         * @return builder
         * 
         */
        public Builder addressPrefixes(String... addressPrefixes) {
            return addressPrefixes(List.of(addressPrefixes));
        }

        /**
         * @param nextHopIpAddress NextHop ip address.
         * 
         * @return builder
         * 
         */
        public Builder nextHopIpAddress(@Nullable Output<String> nextHopIpAddress) {
            $.nextHopIpAddress = nextHopIpAddress;
            return this;
        }

        /**
         * @param nextHopIpAddress NextHop ip address.
         * 
         * @return builder
         * 
         */
        public Builder nextHopIpAddress(String nextHopIpAddress) {
            return nextHopIpAddress(Output.of(nextHopIpAddress));
        }

        public VirtualHubRouteArgs build() {
            return $;
        }
    }

}
