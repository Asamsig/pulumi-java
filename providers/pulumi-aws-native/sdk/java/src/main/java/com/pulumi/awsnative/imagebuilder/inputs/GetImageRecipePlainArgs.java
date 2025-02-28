// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.imagebuilder.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetImageRecipePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetImageRecipePlainArgs Empty = new GetImageRecipePlainArgs();

    /**
     * The Amazon Resource Name (ARN) of the image recipe.
     * 
     */
    @Import(name="arn", required=true)
    private String arn;

    /**
     * @return The Amazon Resource Name (ARN) of the image recipe.
     * 
     */
    public String arn() {
        return this.arn;
    }

    private GetImageRecipePlainArgs() {}

    private GetImageRecipePlainArgs(GetImageRecipePlainArgs $) {
        this.arn = $.arn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetImageRecipePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetImageRecipePlainArgs $;

        public Builder() {
            $ = new GetImageRecipePlainArgs();
        }

        public Builder(GetImageRecipePlainArgs defaults) {
            $ = new GetImageRecipePlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param arn The Amazon Resource Name (ARN) of the image recipe.
         * 
         * @return builder
         * 
         */
        public Builder arn(String arn) {
            $.arn = arn;
            return this;
        }

        public GetImageRecipePlainArgs build() {
            $.arn = Objects.requireNonNull($.arn, "expected parameter 'arn' to be non-null");
            return $;
        }
    }

}
