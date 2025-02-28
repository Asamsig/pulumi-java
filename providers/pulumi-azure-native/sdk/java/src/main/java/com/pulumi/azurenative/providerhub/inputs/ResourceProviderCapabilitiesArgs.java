// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.providerhub.inputs;

import com.pulumi.azurenative.providerhub.enums.ResourceProviderCapabilitiesEffect;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ResourceProviderCapabilitiesArgs extends com.pulumi.resources.ResourceArgs {

    public static final ResourceProviderCapabilitiesArgs Empty = new ResourceProviderCapabilitiesArgs();

    @Import(name="effect", required=true)
    private Output<Either<String,ResourceProviderCapabilitiesEffect>> effect;

    public Output<Either<String,ResourceProviderCapabilitiesEffect>> effect() {
        return this.effect;
    }

    @Import(name="quotaId", required=true)
    private Output<String> quotaId;

    public Output<String> quotaId() {
        return this.quotaId;
    }

    @Import(name="requiredFeatures")
    private @Nullable Output<List<String>> requiredFeatures;

    public Optional<Output<List<String>>> requiredFeatures() {
        return Optional.ofNullable(this.requiredFeatures);
    }

    private ResourceProviderCapabilitiesArgs() {}

    private ResourceProviderCapabilitiesArgs(ResourceProviderCapabilitiesArgs $) {
        this.effect = $.effect;
        this.quotaId = $.quotaId;
        this.requiredFeatures = $.requiredFeatures;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ResourceProviderCapabilitiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ResourceProviderCapabilitiesArgs $;

        public Builder() {
            $ = new ResourceProviderCapabilitiesArgs();
        }

        public Builder(ResourceProviderCapabilitiesArgs defaults) {
            $ = new ResourceProviderCapabilitiesArgs(Objects.requireNonNull(defaults));
        }

        public Builder effect(Output<Either<String,ResourceProviderCapabilitiesEffect>> effect) {
            $.effect = effect;
            return this;
        }

        public Builder effect(Either<String,ResourceProviderCapabilitiesEffect> effect) {
            return effect(Output.of(effect));
        }

        public Builder effect(String effect) {
            return effect(Either.ofLeft(effect));
        }

        public Builder effect(ResourceProviderCapabilitiesEffect effect) {
            return effect(Either.ofRight(effect));
        }

        public Builder quotaId(Output<String> quotaId) {
            $.quotaId = quotaId;
            return this;
        }

        public Builder quotaId(String quotaId) {
            return quotaId(Output.of(quotaId));
        }

        public Builder requiredFeatures(@Nullable Output<List<String>> requiredFeatures) {
            $.requiredFeatures = requiredFeatures;
            return this;
        }

        public Builder requiredFeatures(List<String> requiredFeatures) {
            return requiredFeatures(Output.of(requiredFeatures));
        }

        public Builder requiredFeatures(String... requiredFeatures) {
            return requiredFeatures(List.of(requiredFeatures));
        }

        public ResourceProviderCapabilitiesArgs build() {
            $.effect = Objects.requireNonNull($.effect, "expected parameter 'effect' to be non-null");
            $.quotaId = Objects.requireNonNull($.quotaId, "expected parameter 'quotaId' to be non-null");
            return $;
        }
    }

}
