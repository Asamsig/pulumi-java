// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.backup.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class BackupPlanLifecycleResourceType {
    private final @Nullable Double deleteAfterDays;
    private final @Nullable Double moveToColdStorageAfterDays;

    @CustomType.Constructor
    private BackupPlanLifecycleResourceType(
        @CustomType.Parameter("deleteAfterDays") @Nullable Double deleteAfterDays,
        @CustomType.Parameter("moveToColdStorageAfterDays") @Nullable Double moveToColdStorageAfterDays) {
        this.deleteAfterDays = deleteAfterDays;
        this.moveToColdStorageAfterDays = moveToColdStorageAfterDays;
    }

    public Optional<Double> deleteAfterDays() {
        return Optional.ofNullable(this.deleteAfterDays);
    }
    public Optional<Double> moveToColdStorageAfterDays() {
        return Optional.ofNullable(this.moveToColdStorageAfterDays);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackupPlanLifecycleResourceType defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Double deleteAfterDays;
        private @Nullable Double moveToColdStorageAfterDays;

        public Builder() {
    	      // Empty
        }

        public Builder(BackupPlanLifecycleResourceType defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deleteAfterDays = defaults.deleteAfterDays;
    	      this.moveToColdStorageAfterDays = defaults.moveToColdStorageAfterDays;
        }

        public Builder deleteAfterDays(@Nullable Double deleteAfterDays) {
            this.deleteAfterDays = deleteAfterDays;
            return this;
        }
        public Builder moveToColdStorageAfterDays(@Nullable Double moveToColdStorageAfterDays) {
            this.moveToColdStorageAfterDays = moveToColdStorageAfterDays;
            return this;
        }        public BackupPlanLifecycleResourceType build() {
            return new BackupPlanLifecycleResourceType(deleteAfterDays, moveToColdStorageAfterDays);
        }
    }
}
