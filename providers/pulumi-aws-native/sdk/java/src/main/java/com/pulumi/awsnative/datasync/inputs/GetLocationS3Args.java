// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.datasync.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetLocationS3Args extends com.pulumi.resources.InvokeArgs {

    public static final GetLocationS3Args Empty = new GetLocationS3Args();

    /**
     * The Amazon Resource Name (ARN) of the Amazon S3 bucket location.
     * 
     */
    @Import(name="locationArn", required=true)
    private Output<String> locationArn;

    /**
     * @return The Amazon Resource Name (ARN) of the Amazon S3 bucket location.
     * 
     */
    public Output<String> locationArn() {
        return this.locationArn;
    }

    private GetLocationS3Args() {}

    private GetLocationS3Args(GetLocationS3Args $) {
        this.locationArn = $.locationArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetLocationS3Args defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetLocationS3Args $;

        public Builder() {
            $ = new GetLocationS3Args();
        }

        public Builder(GetLocationS3Args defaults) {
            $ = new GetLocationS3Args(Objects.requireNonNull(defaults));
        }

        /**
         * @param locationArn The Amazon Resource Name (ARN) of the Amazon S3 bucket location.
         * 
         * @return builder
         * 
         */
        public Builder locationArn(Output<String> locationArn) {
            $.locationArn = locationArn;
            return this;
        }

        /**
         * @param locationArn The Amazon Resource Name (ARN) of the Amazon S3 bucket location.
         * 
         * @return builder
         * 
         */
        public Builder locationArn(String locationArn) {
            return locationArn(Output.of(locationArn));
        }

        public GetLocationS3Args build() {
            $.locationArn = Objects.requireNonNull($.locationArn, "expected parameter 'locationArn' to be non-null");
            return $;
        }
    }

}
