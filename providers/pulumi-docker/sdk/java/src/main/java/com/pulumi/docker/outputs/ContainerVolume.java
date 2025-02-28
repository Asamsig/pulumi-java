// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.docker.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ContainerVolume {
    /**
     * @return The path in the container where the volume will be mounted.
     * 
     */
    private final @Nullable String containerPath;
    /**
     * @return The container where the volume is coming from.
     * 
     */
    private final @Nullable String fromContainer;
    /**
     * @return The path on the host where the volume is coming from.
     * 
     */
    private final @Nullable String hostPath;
    /**
     * @return If `true`, this volume will be readonly. Defaults to `false`.
     * 
     */
    private final @Nullable Boolean readOnly;
    /**
     * @return The name of the docker volume which should be mounted.
     * 
     */
    private final @Nullable String volumeName;

    @CustomType.Constructor
    private ContainerVolume(
        @CustomType.Parameter("containerPath") @Nullable String containerPath,
        @CustomType.Parameter("fromContainer") @Nullable String fromContainer,
        @CustomType.Parameter("hostPath") @Nullable String hostPath,
        @CustomType.Parameter("readOnly") @Nullable Boolean readOnly,
        @CustomType.Parameter("volumeName") @Nullable String volumeName) {
        this.containerPath = containerPath;
        this.fromContainer = fromContainer;
        this.hostPath = hostPath;
        this.readOnly = readOnly;
        this.volumeName = volumeName;
    }

    /**
     * @return The path in the container where the volume will be mounted.
     * 
     */
    public Optional<String> containerPath() {
        return Optional.ofNullable(this.containerPath);
    }
    /**
     * @return The container where the volume is coming from.
     * 
     */
    public Optional<String> fromContainer() {
        return Optional.ofNullable(this.fromContainer);
    }
    /**
     * @return The path on the host where the volume is coming from.
     * 
     */
    public Optional<String> hostPath() {
        return Optional.ofNullable(this.hostPath);
    }
    /**
     * @return If `true`, this volume will be readonly. Defaults to `false`.
     * 
     */
    public Optional<Boolean> readOnly() {
        return Optional.ofNullable(this.readOnly);
    }
    /**
     * @return The name of the docker volume which should be mounted.
     * 
     */
    public Optional<String> volumeName() {
        return Optional.ofNullable(this.volumeName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerVolume defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String containerPath;
        private @Nullable String fromContainer;
        private @Nullable String hostPath;
        private @Nullable Boolean readOnly;
        private @Nullable String volumeName;

        public Builder() {
    	      // Empty
        }

        public Builder(ContainerVolume defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.containerPath = defaults.containerPath;
    	      this.fromContainer = defaults.fromContainer;
    	      this.hostPath = defaults.hostPath;
    	      this.readOnly = defaults.readOnly;
    	      this.volumeName = defaults.volumeName;
        }

        public Builder containerPath(@Nullable String containerPath) {
            this.containerPath = containerPath;
            return this;
        }
        public Builder fromContainer(@Nullable String fromContainer) {
            this.fromContainer = fromContainer;
            return this;
        }
        public Builder hostPath(@Nullable String hostPath) {
            this.hostPath = hostPath;
            return this;
        }
        public Builder readOnly(@Nullable Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }
        public Builder volumeName(@Nullable String volumeName) {
            this.volumeName = volumeName;
            return this;
        }        public ContainerVolume build() {
            return new ContainerVolume(containerPath, fromContainer, hostPath, readOnly, volumeName);
        }
    }
}
