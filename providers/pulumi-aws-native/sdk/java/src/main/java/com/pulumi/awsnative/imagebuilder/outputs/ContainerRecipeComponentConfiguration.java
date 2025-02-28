// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.imagebuilder.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ContainerRecipeComponentConfiguration {
    /**
     * @return The Amazon Resource Name (ARN) of the component.
     * 
     */
    private final @Nullable String componentArn;

    @CustomType.Constructor
    private ContainerRecipeComponentConfiguration(@CustomType.Parameter("componentArn") @Nullable String componentArn) {
        this.componentArn = componentArn;
    }

    /**
     * @return The Amazon Resource Name (ARN) of the component.
     * 
     */
    public Optional<String> componentArn() {
        return Optional.ofNullable(this.componentArn);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerRecipeComponentConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String componentArn;

        public Builder() {
    	      // Empty
        }

        public Builder(ContainerRecipeComponentConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.componentArn = defaults.componentArn;
        }

        public Builder componentArn(@Nullable String componentArn) {
            this.componentArn = componentArn;
            return this;
        }        public ContainerRecipeComponentConfiguration build() {
            return new ContainerRecipeComponentConfiguration(componentArn);
        }
    }
}
