// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.connectedvmwarevsphere.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class HardwareProfileResponse {
    /**
     * @return Gets or sets a value indicating whether virtual processors can be added while this virtual machine is running.
     * 
     */
    private final Boolean cpuHotAddEnabled;
    /**
     * @return Gets or sets a value indicating whether virtual processors can be removed while this virtual machine is running.
     * 
     */
    private final Boolean cpuHotRemoveEnabled;
    /**
     * @return Gets or sets a value indicating whether memory can be added while this virtual machine is running.
     * 
     */
    private final Boolean memoryHotAddEnabled;
    /**
     * @return Gets or sets memory size in MBs for the vm.
     * 
     */
    private final @Nullable Integer memorySizeMB;
    /**
     * @return Gets or sets the number of vCPUs for the vm.
     * 
     */
    private final @Nullable Integer numCPUs;
    /**
     * @return Gets or sets the number of cores per socket for the vm. Defaults to 1 if unspecified.
     * 
     */
    private final @Nullable Integer numCoresPerSocket;

    @CustomType.Constructor
    private HardwareProfileResponse(
        @CustomType.Parameter("cpuHotAddEnabled") Boolean cpuHotAddEnabled,
        @CustomType.Parameter("cpuHotRemoveEnabled") Boolean cpuHotRemoveEnabled,
        @CustomType.Parameter("memoryHotAddEnabled") Boolean memoryHotAddEnabled,
        @CustomType.Parameter("memorySizeMB") @Nullable Integer memorySizeMB,
        @CustomType.Parameter("numCPUs") @Nullable Integer numCPUs,
        @CustomType.Parameter("numCoresPerSocket") @Nullable Integer numCoresPerSocket) {
        this.cpuHotAddEnabled = cpuHotAddEnabled;
        this.cpuHotRemoveEnabled = cpuHotRemoveEnabled;
        this.memoryHotAddEnabled = memoryHotAddEnabled;
        this.memorySizeMB = memorySizeMB;
        this.numCPUs = numCPUs;
        this.numCoresPerSocket = numCoresPerSocket;
    }

    /**
     * @return Gets or sets a value indicating whether virtual processors can be added while this virtual machine is running.
     * 
     */
    public Boolean cpuHotAddEnabled() {
        return this.cpuHotAddEnabled;
    }
    /**
     * @return Gets or sets a value indicating whether virtual processors can be removed while this virtual machine is running.
     * 
     */
    public Boolean cpuHotRemoveEnabled() {
        return this.cpuHotRemoveEnabled;
    }
    /**
     * @return Gets or sets a value indicating whether memory can be added while this virtual machine is running.
     * 
     */
    public Boolean memoryHotAddEnabled() {
        return this.memoryHotAddEnabled;
    }
    /**
     * @return Gets or sets memory size in MBs for the vm.
     * 
     */
    public Optional<Integer> memorySizeMB() {
        return Optional.ofNullable(this.memorySizeMB);
    }
    /**
     * @return Gets or sets the number of vCPUs for the vm.
     * 
     */
    public Optional<Integer> numCPUs() {
        return Optional.ofNullable(this.numCPUs);
    }
    /**
     * @return Gets or sets the number of cores per socket for the vm. Defaults to 1 if unspecified.
     * 
     */
    public Optional<Integer> numCoresPerSocket() {
        return Optional.ofNullable(this.numCoresPerSocket);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HardwareProfileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean cpuHotAddEnabled;
        private Boolean cpuHotRemoveEnabled;
        private Boolean memoryHotAddEnabled;
        private @Nullable Integer memorySizeMB;
        private @Nullable Integer numCPUs;
        private @Nullable Integer numCoresPerSocket;

        public Builder() {
    	      // Empty
        }

        public Builder(HardwareProfileResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cpuHotAddEnabled = defaults.cpuHotAddEnabled;
    	      this.cpuHotRemoveEnabled = defaults.cpuHotRemoveEnabled;
    	      this.memoryHotAddEnabled = defaults.memoryHotAddEnabled;
    	      this.memorySizeMB = defaults.memorySizeMB;
    	      this.numCPUs = defaults.numCPUs;
    	      this.numCoresPerSocket = defaults.numCoresPerSocket;
        }

        public Builder cpuHotAddEnabled(Boolean cpuHotAddEnabled) {
            this.cpuHotAddEnabled = Objects.requireNonNull(cpuHotAddEnabled);
            return this;
        }
        public Builder cpuHotRemoveEnabled(Boolean cpuHotRemoveEnabled) {
            this.cpuHotRemoveEnabled = Objects.requireNonNull(cpuHotRemoveEnabled);
            return this;
        }
        public Builder memoryHotAddEnabled(Boolean memoryHotAddEnabled) {
            this.memoryHotAddEnabled = Objects.requireNonNull(memoryHotAddEnabled);
            return this;
        }
        public Builder memorySizeMB(@Nullable Integer memorySizeMB) {
            this.memorySizeMB = memorySizeMB;
            return this;
        }
        public Builder numCPUs(@Nullable Integer numCPUs) {
            this.numCPUs = numCPUs;
            return this;
        }
        public Builder numCoresPerSocket(@Nullable Integer numCoresPerSocket) {
            this.numCoresPerSocket = numCoresPerSocket;
            return this;
        }        public HardwareProfileResponse build() {
            return new HardwareProfileResponse(cpuHotAddEnabled, cpuHotRemoveEnabled, memoryHotAddEnabled, memorySizeMB, numCPUs, numCoresPerSocket);
        }
    }
}
