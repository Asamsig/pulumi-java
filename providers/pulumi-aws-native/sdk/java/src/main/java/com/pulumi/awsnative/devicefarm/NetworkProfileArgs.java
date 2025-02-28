// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.devicefarm;

import com.pulumi.awsnative.devicefarm.inputs.NetworkProfileTagArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NetworkProfileArgs extends com.pulumi.resources.ResourceArgs {

    public static final NetworkProfileArgs Empty = new NetworkProfileArgs();

    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    @Import(name="downlinkBandwidthBits")
    private @Nullable Output<Integer> downlinkBandwidthBits;

    public Optional<Output<Integer>> downlinkBandwidthBits() {
        return Optional.ofNullable(this.downlinkBandwidthBits);
    }

    @Import(name="downlinkDelayMs")
    private @Nullable Output<Integer> downlinkDelayMs;

    public Optional<Output<Integer>> downlinkDelayMs() {
        return Optional.ofNullable(this.downlinkDelayMs);
    }

    @Import(name="downlinkJitterMs")
    private @Nullable Output<Integer> downlinkJitterMs;

    public Optional<Output<Integer>> downlinkJitterMs() {
        return Optional.ofNullable(this.downlinkJitterMs);
    }

    @Import(name="downlinkLossPercent")
    private @Nullable Output<Integer> downlinkLossPercent;

    public Optional<Output<Integer>> downlinkLossPercent() {
        return Optional.ofNullable(this.downlinkLossPercent);
    }

    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="projectArn", required=true)
    private Output<String> projectArn;

    public Output<String> projectArn() {
        return this.projectArn;
    }

    @Import(name="tags")
    private @Nullable Output<List<NetworkProfileTagArgs>> tags;

    public Optional<Output<List<NetworkProfileTagArgs>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    @Import(name="uplinkBandwidthBits")
    private @Nullable Output<Integer> uplinkBandwidthBits;

    public Optional<Output<Integer>> uplinkBandwidthBits() {
        return Optional.ofNullable(this.uplinkBandwidthBits);
    }

    @Import(name="uplinkDelayMs")
    private @Nullable Output<Integer> uplinkDelayMs;

    public Optional<Output<Integer>> uplinkDelayMs() {
        return Optional.ofNullable(this.uplinkDelayMs);
    }

    @Import(name="uplinkJitterMs")
    private @Nullable Output<Integer> uplinkJitterMs;

    public Optional<Output<Integer>> uplinkJitterMs() {
        return Optional.ofNullable(this.uplinkJitterMs);
    }

    @Import(name="uplinkLossPercent")
    private @Nullable Output<Integer> uplinkLossPercent;

    public Optional<Output<Integer>> uplinkLossPercent() {
        return Optional.ofNullable(this.uplinkLossPercent);
    }

    private NetworkProfileArgs() {}

    private NetworkProfileArgs(NetworkProfileArgs $) {
        this.description = $.description;
        this.downlinkBandwidthBits = $.downlinkBandwidthBits;
        this.downlinkDelayMs = $.downlinkDelayMs;
        this.downlinkJitterMs = $.downlinkJitterMs;
        this.downlinkLossPercent = $.downlinkLossPercent;
        this.name = $.name;
        this.projectArn = $.projectArn;
        this.tags = $.tags;
        this.uplinkBandwidthBits = $.uplinkBandwidthBits;
        this.uplinkDelayMs = $.uplinkDelayMs;
        this.uplinkJitterMs = $.uplinkJitterMs;
        this.uplinkLossPercent = $.uplinkLossPercent;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NetworkProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NetworkProfileArgs $;

        public Builder() {
            $ = new NetworkProfileArgs();
        }

        public Builder(NetworkProfileArgs defaults) {
            $ = new NetworkProfileArgs(Objects.requireNonNull(defaults));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder downlinkBandwidthBits(@Nullable Output<Integer> downlinkBandwidthBits) {
            $.downlinkBandwidthBits = downlinkBandwidthBits;
            return this;
        }

        public Builder downlinkBandwidthBits(Integer downlinkBandwidthBits) {
            return downlinkBandwidthBits(Output.of(downlinkBandwidthBits));
        }

        public Builder downlinkDelayMs(@Nullable Output<Integer> downlinkDelayMs) {
            $.downlinkDelayMs = downlinkDelayMs;
            return this;
        }

        public Builder downlinkDelayMs(Integer downlinkDelayMs) {
            return downlinkDelayMs(Output.of(downlinkDelayMs));
        }

        public Builder downlinkJitterMs(@Nullable Output<Integer> downlinkJitterMs) {
            $.downlinkJitterMs = downlinkJitterMs;
            return this;
        }

        public Builder downlinkJitterMs(Integer downlinkJitterMs) {
            return downlinkJitterMs(Output.of(downlinkJitterMs));
        }

        public Builder downlinkLossPercent(@Nullable Output<Integer> downlinkLossPercent) {
            $.downlinkLossPercent = downlinkLossPercent;
            return this;
        }

        public Builder downlinkLossPercent(Integer downlinkLossPercent) {
            return downlinkLossPercent(Output.of(downlinkLossPercent));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder projectArn(Output<String> projectArn) {
            $.projectArn = projectArn;
            return this;
        }

        public Builder projectArn(String projectArn) {
            return projectArn(Output.of(projectArn));
        }

        public Builder tags(@Nullable Output<List<NetworkProfileTagArgs>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(List<NetworkProfileTagArgs> tags) {
            return tags(Output.of(tags));
        }

        public Builder tags(NetworkProfileTagArgs... tags) {
            return tags(List.of(tags));
        }

        public Builder uplinkBandwidthBits(@Nullable Output<Integer> uplinkBandwidthBits) {
            $.uplinkBandwidthBits = uplinkBandwidthBits;
            return this;
        }

        public Builder uplinkBandwidthBits(Integer uplinkBandwidthBits) {
            return uplinkBandwidthBits(Output.of(uplinkBandwidthBits));
        }

        public Builder uplinkDelayMs(@Nullable Output<Integer> uplinkDelayMs) {
            $.uplinkDelayMs = uplinkDelayMs;
            return this;
        }

        public Builder uplinkDelayMs(Integer uplinkDelayMs) {
            return uplinkDelayMs(Output.of(uplinkDelayMs));
        }

        public Builder uplinkJitterMs(@Nullable Output<Integer> uplinkJitterMs) {
            $.uplinkJitterMs = uplinkJitterMs;
            return this;
        }

        public Builder uplinkJitterMs(Integer uplinkJitterMs) {
            return uplinkJitterMs(Output.of(uplinkJitterMs));
        }

        public Builder uplinkLossPercent(@Nullable Output<Integer> uplinkLossPercent) {
            $.uplinkLossPercent = uplinkLossPercent;
            return this;
        }

        public Builder uplinkLossPercent(Integer uplinkLossPercent) {
            return uplinkLossPercent(Output.of(uplinkLossPercent));
        }

        public NetworkProfileArgs build() {
            $.projectArn = Objects.requireNonNull($.projectArn, "expected parameter 'projectArn' to be non-null");
            return $;
        }
    }

}
