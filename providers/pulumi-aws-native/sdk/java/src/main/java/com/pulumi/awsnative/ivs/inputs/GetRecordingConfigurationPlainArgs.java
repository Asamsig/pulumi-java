// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.ivs.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetRecordingConfigurationPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetRecordingConfigurationPlainArgs Empty = new GetRecordingConfigurationPlainArgs();

    /**
     * Recording Configuration ARN is automatically generated on creation and assigned as the unique identifier.
     * 
     */
    @Import(name="arn", required=true)
    private String arn;

    /**
     * @return Recording Configuration ARN is automatically generated on creation and assigned as the unique identifier.
     * 
     */
    public String arn() {
        return this.arn;
    }

    private GetRecordingConfigurationPlainArgs() {}

    private GetRecordingConfigurationPlainArgs(GetRecordingConfigurationPlainArgs $) {
        this.arn = $.arn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRecordingConfigurationPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRecordingConfigurationPlainArgs $;

        public Builder() {
            $ = new GetRecordingConfigurationPlainArgs();
        }

        public Builder(GetRecordingConfigurationPlainArgs defaults) {
            $ = new GetRecordingConfigurationPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param arn Recording Configuration ARN is automatically generated on creation and assigned as the unique identifier.
         * 
         * @return builder
         * 
         */
        public Builder arn(String arn) {
            $.arn = arn;
            return this;
        }

        public GetRecordingConfigurationPlainArgs build() {
            $.arn = Objects.requireNonNull($.arn, "expected parameter 'arn' to be non-null");
            return $;
        }
    }

}
