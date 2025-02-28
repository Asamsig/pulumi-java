// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.ivs.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetRecordingConfigurationArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetRecordingConfigurationArgs Empty = new GetRecordingConfigurationArgs();

    /**
     * Recording Configuration ARN is automatically generated on creation and assigned as the unique identifier.
     * 
     */
    @Import(name="arn", required=true)
    private Output<String> arn;

    /**
     * @return Recording Configuration ARN is automatically generated on creation and assigned as the unique identifier.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }

    private GetRecordingConfigurationArgs() {}

    private GetRecordingConfigurationArgs(GetRecordingConfigurationArgs $) {
        this.arn = $.arn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRecordingConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRecordingConfigurationArgs $;

        public Builder() {
            $ = new GetRecordingConfigurationArgs();
        }

        public Builder(GetRecordingConfigurationArgs defaults) {
            $ = new GetRecordingConfigurationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param arn Recording Configuration ARN is automatically generated on creation and assigned as the unique identifier.
         * 
         * @return builder
         * 
         */
        public Builder arn(Output<String> arn) {
            $.arn = arn;
            return this;
        }

        /**
         * @param arn Recording Configuration ARN is automatically generated on creation and assigned as the unique identifier.
         * 
         * @return builder
         * 
         */
        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        public GetRecordingConfigurationArgs build() {
            $.arn = Objects.requireNonNull($.arn, "expected parameter 'arn' to be non-null");
            return $;
        }
    }

}
