// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.greengrassv2.outputs;

import com.pulumi.awsnative.greengrassv2.enums.ComponentVersionLambdaFilesystemPermission;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ComponentVersionLambdaDeviceMount {
    private final @Nullable Boolean addGroupOwner;
    private final @Nullable String path;
    private final @Nullable ComponentVersionLambdaFilesystemPermission permission;

    @CustomType.Constructor
    private ComponentVersionLambdaDeviceMount(
        @CustomType.Parameter("addGroupOwner") @Nullable Boolean addGroupOwner,
        @CustomType.Parameter("path") @Nullable String path,
        @CustomType.Parameter("permission") @Nullable ComponentVersionLambdaFilesystemPermission permission) {
        this.addGroupOwner = addGroupOwner;
        this.path = path;
        this.permission = permission;
    }

    public Optional<Boolean> addGroupOwner() {
        return Optional.ofNullable(this.addGroupOwner);
    }
    public Optional<String> path() {
        return Optional.ofNullable(this.path);
    }
    public Optional<ComponentVersionLambdaFilesystemPermission> permission() {
        return Optional.ofNullable(this.permission);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ComponentVersionLambdaDeviceMount defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean addGroupOwner;
        private @Nullable String path;
        private @Nullable ComponentVersionLambdaFilesystemPermission permission;

        public Builder() {
    	      // Empty
        }

        public Builder(ComponentVersionLambdaDeviceMount defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addGroupOwner = defaults.addGroupOwner;
    	      this.path = defaults.path;
    	      this.permission = defaults.permission;
        }

        public Builder addGroupOwner(@Nullable Boolean addGroupOwner) {
            this.addGroupOwner = addGroupOwner;
            return this;
        }
        public Builder path(@Nullable String path) {
            this.path = path;
            return this;
        }
        public Builder permission(@Nullable ComponentVersionLambdaFilesystemPermission permission) {
            this.permission = permission;
            return this;
        }        public ComponentVersionLambdaDeviceMount build() {
            return new ComponentVersionLambdaDeviceMount(addGroupOwner, path, permission);
        }
    }
}
