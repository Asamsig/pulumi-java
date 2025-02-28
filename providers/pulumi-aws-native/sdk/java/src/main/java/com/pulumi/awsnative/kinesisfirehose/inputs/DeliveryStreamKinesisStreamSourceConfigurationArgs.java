// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.kinesisfirehose.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class DeliveryStreamKinesisStreamSourceConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final DeliveryStreamKinesisStreamSourceConfigurationArgs Empty = new DeliveryStreamKinesisStreamSourceConfigurationArgs();

    @Import(name="kinesisStreamARN", required=true)
    private Output<String> kinesisStreamARN;

    public Output<String> kinesisStreamARN() {
        return this.kinesisStreamARN;
    }

    @Import(name="roleARN", required=true)
    private Output<String> roleARN;

    public Output<String> roleARN() {
        return this.roleARN;
    }

    private DeliveryStreamKinesisStreamSourceConfigurationArgs() {}

    private DeliveryStreamKinesisStreamSourceConfigurationArgs(DeliveryStreamKinesisStreamSourceConfigurationArgs $) {
        this.kinesisStreamARN = $.kinesisStreamARN;
        this.roleARN = $.roleARN;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DeliveryStreamKinesisStreamSourceConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DeliveryStreamKinesisStreamSourceConfigurationArgs $;

        public Builder() {
            $ = new DeliveryStreamKinesisStreamSourceConfigurationArgs();
        }

        public Builder(DeliveryStreamKinesisStreamSourceConfigurationArgs defaults) {
            $ = new DeliveryStreamKinesisStreamSourceConfigurationArgs(Objects.requireNonNull(defaults));
        }

        public Builder kinesisStreamARN(Output<String> kinesisStreamARN) {
            $.kinesisStreamARN = kinesisStreamARN;
            return this;
        }

        public Builder kinesisStreamARN(String kinesisStreamARN) {
            return kinesisStreamARN(Output.of(kinesisStreamARN));
        }

        public Builder roleARN(Output<String> roleARN) {
            $.roleARN = roleARN;
            return this;
        }

        public Builder roleARN(String roleARN) {
            return roleARN(Output.of(roleARN));
        }

        public DeliveryStreamKinesisStreamSourceConfigurationArgs build() {
            $.kinesisStreamARN = Objects.requireNonNull($.kinesisStreamARN, "expected parameter 'kinesisStreamARN' to be non-null");
            $.roleARN = Objects.requireNonNull($.roleARN, "expected parameter 'roleARN' to be non-null");
            return $;
        }
    }

}
