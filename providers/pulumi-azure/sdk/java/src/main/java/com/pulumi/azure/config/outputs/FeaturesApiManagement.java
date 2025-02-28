// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.config.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FeaturesApiManagement {
    private final @Nullable Boolean purgeSoftDeleteOnDestroy;
    private final @Nullable Boolean recoverSoftDeleted;

    @CustomType.Constructor
    private FeaturesApiManagement(
        @CustomType.Parameter("purgeSoftDeleteOnDestroy") @Nullable Boolean purgeSoftDeleteOnDestroy,
        @CustomType.Parameter("recoverSoftDeleted") @Nullable Boolean recoverSoftDeleted) {
        this.purgeSoftDeleteOnDestroy = purgeSoftDeleteOnDestroy;
        this.recoverSoftDeleted = recoverSoftDeleted;
    }

    public Optional<Boolean> purgeSoftDeleteOnDestroy() {
        return Optional.ofNullable(this.purgeSoftDeleteOnDestroy);
    }
    public Optional<Boolean> recoverSoftDeleted() {
        return Optional.ofNullable(this.recoverSoftDeleted);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FeaturesApiManagement defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean purgeSoftDeleteOnDestroy;
        private @Nullable Boolean recoverSoftDeleted;

        public Builder() {
    	      // Empty
        }

        public Builder(FeaturesApiManagement defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.purgeSoftDeleteOnDestroy = defaults.purgeSoftDeleteOnDestroy;
    	      this.recoverSoftDeleted = defaults.recoverSoftDeleted;
        }

        public Builder purgeSoftDeleteOnDestroy(@Nullable Boolean purgeSoftDeleteOnDestroy) {
            this.purgeSoftDeleteOnDestroy = purgeSoftDeleteOnDestroy;
            return this;
        }
        public Builder recoverSoftDeleted(@Nullable Boolean recoverSoftDeleted) {
            this.recoverSoftDeleted = recoverSoftDeleted;
            return this;
        }        public FeaturesApiManagement build() {
            return new FeaturesApiManagement(purgeSoftDeleteOnDestroy, recoverSoftDeleted);
        }
    }
}
