// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.personalize.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetSolutionArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSolutionArgs Empty = new GetSolutionArgs();

    @Import(name="solutionArn", required=true)
    private Output<String> solutionArn;

    public Output<String> solutionArn() {
        return this.solutionArn;
    }

    private GetSolutionArgs() {}

    private GetSolutionArgs(GetSolutionArgs $) {
        this.solutionArn = $.solutionArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSolutionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSolutionArgs $;

        public Builder() {
            $ = new GetSolutionArgs();
        }

        public Builder(GetSolutionArgs defaults) {
            $ = new GetSolutionArgs(Objects.requireNonNull(defaults));
        }

        public Builder solutionArn(Output<String> solutionArn) {
            $.solutionArn = solutionArn;
            return this;
        }

        public Builder solutionArn(String solutionArn) {
            return solutionArn(Output.of(solutionArn));
        }

        public GetSolutionArgs build() {
            $.solutionArn = Objects.requireNonNull($.solutionArn, "expected parameter 'solutionArn' to be non-null");
            return $;
        }
    }

}
