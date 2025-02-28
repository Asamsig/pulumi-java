// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.ssmincidents.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetResponsePlanPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetResponsePlanPlainArgs Empty = new GetResponsePlanPlainArgs();

    /**
     * The ARN of the response plan.
     * 
     */
    @Import(name="arn", required=true)
    private String arn;

    /**
     * @return The ARN of the response plan.
     * 
     */
    public String arn() {
        return this.arn;
    }

    private GetResponsePlanPlainArgs() {}

    private GetResponsePlanPlainArgs(GetResponsePlanPlainArgs $) {
        this.arn = $.arn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetResponsePlanPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetResponsePlanPlainArgs $;

        public Builder() {
            $ = new GetResponsePlanPlainArgs();
        }

        public Builder(GetResponsePlanPlainArgs defaults) {
            $ = new GetResponsePlanPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param arn The ARN of the response plan.
         * 
         * @return builder
         * 
         */
        public Builder arn(String arn) {
            $.arn = arn;
            return this;
        }

        public GetResponsePlanPlainArgs build() {
            $.arn = Objects.requireNonNull($.arn, "expected parameter 'arn' to be non-null");
            return $;
        }
    }

}
