// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dns_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dns_v1.inputs.ManagedZonePrivateVisibilityConfigNetworkArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ManagedZonePrivateVisibilityConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final ManagedZonePrivateVisibilityConfigArgs Empty = new ManagedZonePrivateVisibilityConfigArgs();

    @Import(name="kind")
    private @Nullable Output<String> kind;

    public Optional<Output<String>> kind() {
        return Optional.ofNullable(this.kind);
    }

    /**
     * The list of VPC networks that can see this zone.
     * 
     */
    @Import(name="networks")
    private @Nullable Output<List<ManagedZonePrivateVisibilityConfigNetworkArgs>> networks;

    /**
     * @return The list of VPC networks that can see this zone.
     * 
     */
    public Optional<Output<List<ManagedZonePrivateVisibilityConfigNetworkArgs>>> networks() {
        return Optional.ofNullable(this.networks);
    }

    private ManagedZonePrivateVisibilityConfigArgs() {}

    private ManagedZonePrivateVisibilityConfigArgs(ManagedZonePrivateVisibilityConfigArgs $) {
        this.kind = $.kind;
        this.networks = $.networks;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ManagedZonePrivateVisibilityConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ManagedZonePrivateVisibilityConfigArgs $;

        public Builder() {
            $ = new ManagedZonePrivateVisibilityConfigArgs();
        }

        public Builder(ManagedZonePrivateVisibilityConfigArgs defaults) {
            $ = new ManagedZonePrivateVisibilityConfigArgs(Objects.requireNonNull(defaults));
        }

        public Builder kind(@Nullable Output<String> kind) {
            $.kind = kind;
            return this;
        }

        public Builder kind(String kind) {
            return kind(Output.of(kind));
        }

        /**
         * @param networks The list of VPC networks that can see this zone.
         * 
         * @return builder
         * 
         */
        public Builder networks(@Nullable Output<List<ManagedZonePrivateVisibilityConfigNetworkArgs>> networks) {
            $.networks = networks;
            return this;
        }

        /**
         * @param networks The list of VPC networks that can see this zone.
         * 
         * @return builder
         * 
         */
        public Builder networks(List<ManagedZonePrivateVisibilityConfigNetworkArgs> networks) {
            return networks(Output.of(networks));
        }

        /**
         * @param networks The list of VPC networks that can see this zone.
         * 
         * @return builder
         * 
         */
        public Builder networks(ManagedZonePrivateVisibilityConfigNetworkArgs... networks) {
            return networks(List.of(networks));
        }

        public ManagedZonePrivateVisibilityConfigArgs build() {
            return $;
        }
    }

}
