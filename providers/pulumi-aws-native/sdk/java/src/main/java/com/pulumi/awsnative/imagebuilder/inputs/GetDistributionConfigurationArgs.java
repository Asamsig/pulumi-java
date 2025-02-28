// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.imagebuilder.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetDistributionConfigurationArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDistributionConfigurationArgs Empty = new GetDistributionConfigurationArgs();

    /**
     * The Amazon Resource Name (ARN) of the distribution configuration.
     * 
     */
    @Import(name="arn", required=true)
    private Output<String> arn;

    /**
     * @return The Amazon Resource Name (ARN) of the distribution configuration.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }

    private GetDistributionConfigurationArgs() {}

    private GetDistributionConfigurationArgs(GetDistributionConfigurationArgs $) {
        this.arn = $.arn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDistributionConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDistributionConfigurationArgs $;

        public Builder() {
            $ = new GetDistributionConfigurationArgs();
        }

        public Builder(GetDistributionConfigurationArgs defaults) {
            $ = new GetDistributionConfigurationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param arn The Amazon Resource Name (ARN) of the distribution configuration.
         * 
         * @return builder
         * 
         */
        public Builder arn(Output<String> arn) {
            $.arn = arn;
            return this;
        }

        /**
         * @param arn The Amazon Resource Name (ARN) of the distribution configuration.
         * 
         * @return builder
         * 
         */
        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        public GetDistributionConfigurationArgs build() {
            $.arn = Objects.requireNonNull($.arn, "expected parameter 'arn' to be non-null");
            return $;
        }
    }

}
