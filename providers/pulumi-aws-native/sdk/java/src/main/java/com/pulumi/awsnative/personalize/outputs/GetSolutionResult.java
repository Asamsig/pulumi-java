// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.personalize.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetSolutionResult {
    private final @Nullable String solutionArn;

    @CustomType.Constructor
    private GetSolutionResult(@CustomType.Parameter("solutionArn") @Nullable String solutionArn) {
        this.solutionArn = solutionArn;
    }

    public Optional<String> solutionArn() {
        return Optional.ofNullable(this.solutionArn);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSolutionResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String solutionArn;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSolutionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.solutionArn = defaults.solutionArn;
        }

        public Builder solutionArn(@Nullable String solutionArn) {
            this.solutionArn = solutionArn;
            return this;
        }        public GetSolutionResult build() {
            return new GetSolutionResult(solutionArn);
        }
    }
}
