// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.imagebuilder.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetImagePipelinePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetImagePipelinePlainArgs Empty = new GetImagePipelinePlainArgs();

    /**
     * The Amazon Resource Name (ARN) of the image pipeline.
     * 
     */
    @Import(name="arn", required=true)
    private String arn;

    /**
     * @return The Amazon Resource Name (ARN) of the image pipeline.
     * 
     */
    public String arn() {
        return this.arn;
    }

    private GetImagePipelinePlainArgs() {}

    private GetImagePipelinePlainArgs(GetImagePipelinePlainArgs $) {
        this.arn = $.arn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetImagePipelinePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetImagePipelinePlainArgs $;

        public Builder() {
            $ = new GetImagePipelinePlainArgs();
        }

        public Builder(GetImagePipelinePlainArgs defaults) {
            $ = new GetImagePipelinePlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param arn The Amazon Resource Name (ARN) of the image pipeline.
         * 
         * @return builder
         * 
         */
        public Builder arn(String arn) {
            $.arn = arn;
            return this;
        }

        public GetImagePipelinePlainArgs build() {
            $.arn = Objects.requireNonNull($.arn, "expected parameter 'arn' to be non-null");
            return $;
        }
    }

}
