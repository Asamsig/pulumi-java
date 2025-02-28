// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.networkfirewall.inputs;

import com.pulumi.awsnative.networkfirewall.inputs.RuleGroupAddressArgs;
import com.pulumi.awsnative.networkfirewall.inputs.RuleGroupPortRangeArgs;
import com.pulumi.awsnative.networkfirewall.inputs.RuleGroupTCPFlagFieldArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RuleGroupMatchAttributesArgs extends com.pulumi.resources.ResourceArgs {

    public static final RuleGroupMatchAttributesArgs Empty = new RuleGroupMatchAttributesArgs();

    @Import(name="destinationPorts")
    private @Nullable Output<List<RuleGroupPortRangeArgs>> destinationPorts;

    public Optional<Output<List<RuleGroupPortRangeArgs>>> destinationPorts() {
        return Optional.ofNullable(this.destinationPorts);
    }

    @Import(name="destinations")
    private @Nullable Output<List<RuleGroupAddressArgs>> destinations;

    public Optional<Output<List<RuleGroupAddressArgs>>> destinations() {
        return Optional.ofNullable(this.destinations);
    }

    @Import(name="protocols")
    private @Nullable Output<List<Integer>> protocols;

    public Optional<Output<List<Integer>>> protocols() {
        return Optional.ofNullable(this.protocols);
    }

    @Import(name="sourcePorts")
    private @Nullable Output<List<RuleGroupPortRangeArgs>> sourcePorts;

    public Optional<Output<List<RuleGroupPortRangeArgs>>> sourcePorts() {
        return Optional.ofNullable(this.sourcePorts);
    }

    @Import(name="sources")
    private @Nullable Output<List<RuleGroupAddressArgs>> sources;

    public Optional<Output<List<RuleGroupAddressArgs>>> sources() {
        return Optional.ofNullable(this.sources);
    }

    @Import(name="tCPFlags")
    private @Nullable Output<List<RuleGroupTCPFlagFieldArgs>> tCPFlags;

    public Optional<Output<List<RuleGroupTCPFlagFieldArgs>>> tCPFlags() {
        return Optional.ofNullable(this.tCPFlags);
    }

    private RuleGroupMatchAttributesArgs() {}

    private RuleGroupMatchAttributesArgs(RuleGroupMatchAttributesArgs $) {
        this.destinationPorts = $.destinationPorts;
        this.destinations = $.destinations;
        this.protocols = $.protocols;
        this.sourcePorts = $.sourcePorts;
        this.sources = $.sources;
        this.tCPFlags = $.tCPFlags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RuleGroupMatchAttributesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RuleGroupMatchAttributesArgs $;

        public Builder() {
            $ = new RuleGroupMatchAttributesArgs();
        }

        public Builder(RuleGroupMatchAttributesArgs defaults) {
            $ = new RuleGroupMatchAttributesArgs(Objects.requireNonNull(defaults));
        }

        public Builder destinationPorts(@Nullable Output<List<RuleGroupPortRangeArgs>> destinationPorts) {
            $.destinationPorts = destinationPorts;
            return this;
        }

        public Builder destinationPorts(List<RuleGroupPortRangeArgs> destinationPorts) {
            return destinationPorts(Output.of(destinationPorts));
        }

        public Builder destinationPorts(RuleGroupPortRangeArgs... destinationPorts) {
            return destinationPorts(List.of(destinationPorts));
        }

        public Builder destinations(@Nullable Output<List<RuleGroupAddressArgs>> destinations) {
            $.destinations = destinations;
            return this;
        }

        public Builder destinations(List<RuleGroupAddressArgs> destinations) {
            return destinations(Output.of(destinations));
        }

        public Builder destinations(RuleGroupAddressArgs... destinations) {
            return destinations(List.of(destinations));
        }

        public Builder protocols(@Nullable Output<List<Integer>> protocols) {
            $.protocols = protocols;
            return this;
        }

        public Builder protocols(List<Integer> protocols) {
            return protocols(Output.of(protocols));
        }

        public Builder protocols(Integer... protocols) {
            return protocols(List.of(protocols));
        }

        public Builder sourcePorts(@Nullable Output<List<RuleGroupPortRangeArgs>> sourcePorts) {
            $.sourcePorts = sourcePorts;
            return this;
        }

        public Builder sourcePorts(List<RuleGroupPortRangeArgs> sourcePorts) {
            return sourcePorts(Output.of(sourcePorts));
        }

        public Builder sourcePorts(RuleGroupPortRangeArgs... sourcePorts) {
            return sourcePorts(List.of(sourcePorts));
        }

        public Builder sources(@Nullable Output<List<RuleGroupAddressArgs>> sources) {
            $.sources = sources;
            return this;
        }

        public Builder sources(List<RuleGroupAddressArgs> sources) {
            return sources(Output.of(sources));
        }

        public Builder sources(RuleGroupAddressArgs... sources) {
            return sources(List.of(sources));
        }

        public Builder tCPFlags(@Nullable Output<List<RuleGroupTCPFlagFieldArgs>> tCPFlags) {
            $.tCPFlags = tCPFlags;
            return this;
        }

        public Builder tCPFlags(List<RuleGroupTCPFlagFieldArgs> tCPFlags) {
            return tCPFlags(Output.of(tCPFlags));
        }

        public Builder tCPFlags(RuleGroupTCPFlagFieldArgs... tCPFlags) {
            return tCPFlags(List.of(tCPFlags));
        }

        public RuleGroupMatchAttributesArgs build() {
            return $;
        }
    }

}
