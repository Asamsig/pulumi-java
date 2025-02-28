// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.inputs;

import com.pulumi.aws.inputs.GetAutoscalingGroupsFilterArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetAutoscalingGroupsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAutoscalingGroupsArgs Empty = new GetAutoscalingGroupsArgs();

    /**
     * A filter used to scope the list e.g., by tags. See [related docs](http://docs.aws.amazon.com/AutoScaling/latest/APIReference/API_Filter.html).
     * 
     */
    @Import(name="filters")
    private @Nullable Output<List<GetAutoscalingGroupsFilterArgs>> filters;

    /**
     * @return A filter used to scope the list e.g., by tags. See [related docs](http://docs.aws.amazon.com/AutoScaling/latest/APIReference/API_Filter.html).
     * 
     */
    public Optional<Output<List<GetAutoscalingGroupsFilterArgs>>> filters() {
        return Optional.ofNullable(this.filters);
    }

    private GetAutoscalingGroupsArgs() {}

    private GetAutoscalingGroupsArgs(GetAutoscalingGroupsArgs $) {
        this.filters = $.filters;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAutoscalingGroupsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAutoscalingGroupsArgs $;

        public Builder() {
            $ = new GetAutoscalingGroupsArgs();
        }

        public Builder(GetAutoscalingGroupsArgs defaults) {
            $ = new GetAutoscalingGroupsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param filters A filter used to scope the list e.g., by tags. See [related docs](http://docs.aws.amazon.com/AutoScaling/latest/APIReference/API_Filter.html).
         * 
         * @return builder
         * 
         */
        public Builder filters(@Nullable Output<List<GetAutoscalingGroupsFilterArgs>> filters) {
            $.filters = filters;
            return this;
        }

        /**
         * @param filters A filter used to scope the list e.g., by tags. See [related docs](http://docs.aws.amazon.com/AutoScaling/latest/APIReference/API_Filter.html).
         * 
         * @return builder
         * 
         */
        public Builder filters(List<GetAutoscalingGroupsFilterArgs> filters) {
            return filters(Output.of(filters));
        }

        /**
         * @param filters A filter used to scope the list e.g., by tags. See [related docs](http://docs.aws.amazon.com/AutoScaling/latest/APIReference/API_Filter.html).
         * 
         * @return builder
         * 
         */
        public Builder filters(GetAutoscalingGroupsFilterArgs... filters) {
            return filters(List.of(filters));
        }

        public GetAutoscalingGroupsArgs build() {
            return $;
        }
    }

}
