// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.ecs;

import com.pulumi.awsnative.ecs.inputs.CapacityProviderAutoScalingGroupProviderArgs;
import com.pulumi.awsnative.ecs.inputs.CapacityProviderTagArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CapacityProviderArgs extends com.pulumi.resources.ResourceArgs {

    public static final CapacityProviderArgs Empty = new CapacityProviderArgs();

    @Import(name="autoScalingGroupProvider", required=true)
    private Output<CapacityProviderAutoScalingGroupProviderArgs> autoScalingGroupProvider;

    public Output<CapacityProviderAutoScalingGroupProviderArgs> autoScalingGroupProvider() {
        return this.autoScalingGroupProvider;
    }

    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="tags")
    private @Nullable Output<List<CapacityProviderTagArgs>> tags;

    public Optional<Output<List<CapacityProviderTagArgs>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private CapacityProviderArgs() {}

    private CapacityProviderArgs(CapacityProviderArgs $) {
        this.autoScalingGroupProvider = $.autoScalingGroupProvider;
        this.name = $.name;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CapacityProviderArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CapacityProviderArgs $;

        public Builder() {
            $ = new CapacityProviderArgs();
        }

        public Builder(CapacityProviderArgs defaults) {
            $ = new CapacityProviderArgs(Objects.requireNonNull(defaults));
        }

        public Builder autoScalingGroupProvider(Output<CapacityProviderAutoScalingGroupProviderArgs> autoScalingGroupProvider) {
            $.autoScalingGroupProvider = autoScalingGroupProvider;
            return this;
        }

        public Builder autoScalingGroupProvider(CapacityProviderAutoScalingGroupProviderArgs autoScalingGroupProvider) {
            return autoScalingGroupProvider(Output.of(autoScalingGroupProvider));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder tags(@Nullable Output<List<CapacityProviderTagArgs>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(List<CapacityProviderTagArgs> tags) {
            return tags(Output.of(tags));
        }

        public Builder tags(CapacityProviderTagArgs... tags) {
            return tags(List.of(tags));
        }

        public CapacityProviderArgs build() {
            $.autoScalingGroupProvider = Objects.requireNonNull($.autoScalingGroupProvider, "expected parameter 'autoScalingGroupProvider' to be non-null");
            return $;
        }
    }

}
