// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.s3.inputs;

import com.pulumi.awsnative.s3.enums.BucketReplicationTimeStatus;
import com.pulumi.awsnative.s3.inputs.BucketReplicationTimeValueArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;


public final class BucketReplicationTimeArgs extends com.pulumi.resources.ResourceArgs {

    public static final BucketReplicationTimeArgs Empty = new BucketReplicationTimeArgs();

    @Import(name="status", required=true)
    private Output<BucketReplicationTimeStatus> status;

    public Output<BucketReplicationTimeStatus> status() {
        return this.status;
    }

    @Import(name="time", required=true)
    private Output<BucketReplicationTimeValueArgs> time;

    public Output<BucketReplicationTimeValueArgs> time() {
        return this.time;
    }

    private BucketReplicationTimeArgs() {}

    private BucketReplicationTimeArgs(BucketReplicationTimeArgs $) {
        this.status = $.status;
        this.time = $.time;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BucketReplicationTimeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BucketReplicationTimeArgs $;

        public Builder() {
            $ = new BucketReplicationTimeArgs();
        }

        public Builder(BucketReplicationTimeArgs defaults) {
            $ = new BucketReplicationTimeArgs(Objects.requireNonNull(defaults));
        }

        public Builder status(Output<BucketReplicationTimeStatus> status) {
            $.status = status;
            return this;
        }

        public Builder status(BucketReplicationTimeStatus status) {
            return status(Output.of(status));
        }

        public Builder time(Output<BucketReplicationTimeValueArgs> time) {
            $.time = time;
            return this;
        }

        public Builder time(BucketReplicationTimeValueArgs time) {
            return time(Output.of(time));
        }

        public BucketReplicationTimeArgs build() {
            $.status = Objects.requireNonNull($.status, "expected parameter 'status' to be non-null");
            $.time = Objects.requireNonNull($.time, "expected parameter 'time' to be non-null");
            return $;
        }
    }

}
