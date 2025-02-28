// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.docker.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ContainerDevice {
    /**
     * @return The path in the container where the device will be bound.
     * 
     */
    private final @Nullable String containerPath;
    /**
     * @return The path on the host where the device is located.
     * 
     */
    private final String hostPath;
    /**
     * @return The cgroup permissions given to the container to access the device. Defaults to `rwm`.
     * 
     */
    private final @Nullable String permissions;

    @CustomType.Constructor
    private ContainerDevice(
        @CustomType.Parameter("containerPath") @Nullable String containerPath,
        @CustomType.Parameter("hostPath") String hostPath,
        @CustomType.Parameter("permissions") @Nullable String permissions) {
        this.containerPath = containerPath;
        this.hostPath = hostPath;
        this.permissions = permissions;
    }

    /**
     * @return The path in the container where the device will be bound.
     * 
     */
    public Optional<String> containerPath() {
        return Optional.ofNullable(this.containerPath);
    }
    /**
     * @return The path on the host where the device is located.
     * 
     */
    public String hostPath() {
        return this.hostPath;
    }
    /**
     * @return The cgroup permissions given to the container to access the device. Defaults to `rwm`.
     * 
     */
    public Optional<String> permissions() {
        return Optional.ofNullable(this.permissions);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerDevice defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String containerPath;
        private String hostPath;
        private @Nullable String permissions;

        public Builder() {
    	      // Empty
        }

        public Builder(ContainerDevice defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.containerPath = defaults.containerPath;
    	      this.hostPath = defaults.hostPath;
    	      this.permissions = defaults.permissions;
        }

        public Builder containerPath(@Nullable String containerPath) {
            this.containerPath = containerPath;
            return this;
        }
        public Builder hostPath(String hostPath) {
            this.hostPath = Objects.requireNonNull(hostPath);
            return this;
        }
        public Builder permissions(@Nullable String permissions) {
            this.permissions = permissions;
            return this;
        }        public ContainerDevice build() {
            return new ContainerDevice(containerPath, hostPath, permissions);
        }
    }
}
