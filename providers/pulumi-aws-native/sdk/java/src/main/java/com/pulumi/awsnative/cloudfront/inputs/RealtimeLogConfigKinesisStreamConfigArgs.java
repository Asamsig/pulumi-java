// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.cloudfront.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class RealtimeLogConfigKinesisStreamConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final RealtimeLogConfigKinesisStreamConfigArgs Empty = new RealtimeLogConfigKinesisStreamConfigArgs();

    @Import(name="roleArn", required=true)
    private Output<String> roleArn;

    public Output<String> roleArn() {
        return this.roleArn;
    }

    @Import(name="streamArn", required=true)
    private Output<String> streamArn;

    public Output<String> streamArn() {
        return this.streamArn;
    }

    private RealtimeLogConfigKinesisStreamConfigArgs() {}

    private RealtimeLogConfigKinesisStreamConfigArgs(RealtimeLogConfigKinesisStreamConfigArgs $) {
        this.roleArn = $.roleArn;
        this.streamArn = $.streamArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RealtimeLogConfigKinesisStreamConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RealtimeLogConfigKinesisStreamConfigArgs $;

        public Builder() {
            $ = new RealtimeLogConfigKinesisStreamConfigArgs();
        }

        public Builder(RealtimeLogConfigKinesisStreamConfigArgs defaults) {
            $ = new RealtimeLogConfigKinesisStreamConfigArgs(Objects.requireNonNull(defaults));
        }

        public Builder roleArn(Output<String> roleArn) {
            $.roleArn = roleArn;
            return this;
        }

        public Builder roleArn(String roleArn) {
            return roleArn(Output.of(roleArn));
        }

        public Builder streamArn(Output<String> streamArn) {
            $.streamArn = streamArn;
            return this;
        }

        public Builder streamArn(String streamArn) {
            return streamArn(Output.of(streamArn));
        }

        public RealtimeLogConfigKinesisStreamConfigArgs build() {
            $.roleArn = Objects.requireNonNull($.roleArn, "expected parameter 'roleArn' to be non-null");
            $.streamArn = Objects.requireNonNull($.streamArn, "expected parameter 'streamArn' to be non-null");
            return $;
        }
    }

}
