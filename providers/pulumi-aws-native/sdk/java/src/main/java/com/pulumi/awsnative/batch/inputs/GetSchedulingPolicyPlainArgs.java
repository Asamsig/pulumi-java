// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.batch.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetSchedulingPolicyPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSchedulingPolicyPlainArgs Empty = new GetSchedulingPolicyPlainArgs();

    @Import(name="arn", required=true)
    private String arn;

    public String arn() {
        return this.arn;
    }

    private GetSchedulingPolicyPlainArgs() {}

    private GetSchedulingPolicyPlainArgs(GetSchedulingPolicyPlainArgs $) {
        this.arn = $.arn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSchedulingPolicyPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSchedulingPolicyPlainArgs $;

        public Builder() {
            $ = new GetSchedulingPolicyPlainArgs();
        }

        public Builder(GetSchedulingPolicyPlainArgs defaults) {
            $ = new GetSchedulingPolicyPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder arn(String arn) {
            $.arn = arn;
            return this;
        }

        public GetSchedulingPolicyPlainArgs build() {
            $.arn = Objects.requireNonNull($.arn, "expected parameter 'arn' to be non-null");
            return $;
        }
    }

}
