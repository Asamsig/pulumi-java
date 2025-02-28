// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.imagebuilder.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetContainerRecipeResult {
    /**
     * @return The Amazon Resource Name (ARN) of the container recipe.
     * 
     */
    private final @Nullable String arn;

    @CustomType.Constructor
    private GetContainerRecipeResult(@CustomType.Parameter("arn") @Nullable String arn) {
        this.arn = arn;
    }

    /**
     * @return The Amazon Resource Name (ARN) of the container recipe.
     * 
     */
    public Optional<String> arn() {
        return Optional.ofNullable(this.arn);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetContainerRecipeResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String arn;

        public Builder() {
    	      // Empty
        }

        public Builder(GetContainerRecipeResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
        }

        public Builder arn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }        public GetContainerRecipeResult build() {
            return new GetContainerRecipeResult(arn);
        }
    }
}
