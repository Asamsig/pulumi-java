// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.appflow.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FlowSuccessResponseHandlingConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final FlowSuccessResponseHandlingConfigArgs Empty = new FlowSuccessResponseHandlingConfigArgs();

    @Import(name="bucketName")
    private @Nullable Output<String> bucketName;

    public Optional<Output<String>> bucketName() {
        return Optional.ofNullable(this.bucketName);
    }

    @Import(name="bucketPrefix")
    private @Nullable Output<String> bucketPrefix;

    public Optional<Output<String>> bucketPrefix() {
        return Optional.ofNullable(this.bucketPrefix);
    }

    private FlowSuccessResponseHandlingConfigArgs() {}

    private FlowSuccessResponseHandlingConfigArgs(FlowSuccessResponseHandlingConfigArgs $) {
        this.bucketName = $.bucketName;
        this.bucketPrefix = $.bucketPrefix;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FlowSuccessResponseHandlingConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FlowSuccessResponseHandlingConfigArgs $;

        public Builder() {
            $ = new FlowSuccessResponseHandlingConfigArgs();
        }

        public Builder(FlowSuccessResponseHandlingConfigArgs defaults) {
            $ = new FlowSuccessResponseHandlingConfigArgs(Objects.requireNonNull(defaults));
        }

        public Builder bucketName(@Nullable Output<String> bucketName) {
            $.bucketName = bucketName;
            return this;
        }

        public Builder bucketName(String bucketName) {
            return bucketName(Output.of(bucketName));
        }

        public Builder bucketPrefix(@Nullable Output<String> bucketPrefix) {
            $.bucketPrefix = bucketPrefix;
            return this;
        }

        public Builder bucketPrefix(String bucketPrefix) {
            return bucketPrefix(Output.of(bucketPrefix));
        }

        public FlowSuccessResponseHandlingConfigArgs build() {
            return $;
        }
    }

}
