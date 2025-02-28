// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.deploymentmanager.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetRolloutArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetRolloutArgs Empty = new GetRolloutArgs();

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group. The name is case insensitive.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Rollout retry attempt ordinal to get the result of. If not specified, result of the latest attempt will be returned.
     * 
     */
    @Import(name="retryAttempt")
    private @Nullable Output<Integer> retryAttempt;

    /**
     * @return Rollout retry attempt ordinal to get the result of. If not specified, result of the latest attempt will be returned.
     * 
     */
    public Optional<Output<Integer>> retryAttempt() {
        return Optional.ofNullable(this.retryAttempt);
    }

    /**
     * The rollout name.
     * 
     */
    @Import(name="rolloutName", required=true)
    private Output<String> rolloutName;

    /**
     * @return The rollout name.
     * 
     */
    public Output<String> rolloutName() {
        return this.rolloutName;
    }

    private GetRolloutArgs() {}

    private GetRolloutArgs(GetRolloutArgs $) {
        this.resourceGroupName = $.resourceGroupName;
        this.retryAttempt = $.retryAttempt;
        this.rolloutName = $.rolloutName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRolloutArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRolloutArgs $;

        public Builder() {
            $ = new GetRolloutArgs();
        }

        public Builder(GetRolloutArgs defaults) {
            $ = new GetRolloutArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param resourceGroupName The name of the resource group. The name is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group. The name is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param retryAttempt Rollout retry attempt ordinal to get the result of. If not specified, result of the latest attempt will be returned.
         * 
         * @return builder
         * 
         */
        public Builder retryAttempt(@Nullable Output<Integer> retryAttempt) {
            $.retryAttempt = retryAttempt;
            return this;
        }

        /**
         * @param retryAttempt Rollout retry attempt ordinal to get the result of. If not specified, result of the latest attempt will be returned.
         * 
         * @return builder
         * 
         */
        public Builder retryAttempt(Integer retryAttempt) {
            return retryAttempt(Output.of(retryAttempt));
        }

        /**
         * @param rolloutName The rollout name.
         * 
         * @return builder
         * 
         */
        public Builder rolloutName(Output<String> rolloutName) {
            $.rolloutName = rolloutName;
            return this;
        }

        /**
         * @param rolloutName The rollout name.
         * 
         * @return builder
         * 
         */
        public Builder rolloutName(String rolloutName) {
            return rolloutName(Output.of(rolloutName));
        }

        public GetRolloutArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.rolloutName = Objects.requireNonNull($.rolloutName, "expected parameter 'rolloutName' to be non-null");
            return $;
        }
    }

}
