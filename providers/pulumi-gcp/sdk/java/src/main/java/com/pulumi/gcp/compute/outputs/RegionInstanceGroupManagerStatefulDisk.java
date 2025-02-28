// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RegionInstanceGroupManagerStatefulDisk {
    /**
     * @return , A value that prescribes what should happen to the stateful disk when the VM instance is deleted. The available options are `NEVER` and `ON_PERMANENT_INSTANCE_DELETION`. `NEVER` - detach the disk when the VM is deleted, but do not delete the disk. `ON_PERMANENT_INSTANCE_DELETION` will delete the stateful disk when the VM is permanently deleted from the instance group. The default is `NEVER`.
     * 
     */
    private final @Nullable String deleteRule;
    /**
     * @return , The device name of the disk to be attached.
     * 
     */
    private final String deviceName;

    @CustomType.Constructor
    private RegionInstanceGroupManagerStatefulDisk(
        @CustomType.Parameter("deleteRule") @Nullable String deleteRule,
        @CustomType.Parameter("deviceName") String deviceName) {
        this.deleteRule = deleteRule;
        this.deviceName = deviceName;
    }

    /**
     * @return , A value that prescribes what should happen to the stateful disk when the VM instance is deleted. The available options are `NEVER` and `ON_PERMANENT_INSTANCE_DELETION`. `NEVER` - detach the disk when the VM is deleted, but do not delete the disk. `ON_PERMANENT_INSTANCE_DELETION` will delete the stateful disk when the VM is permanently deleted from the instance group. The default is `NEVER`.
     * 
     */
    public Optional<String> deleteRule() {
        return Optional.ofNullable(this.deleteRule);
    }
    /**
     * @return , The device name of the disk to be attached.
     * 
     */
    public String deviceName() {
        return this.deviceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegionInstanceGroupManagerStatefulDisk defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String deleteRule;
        private String deviceName;

        public Builder() {
    	      // Empty
        }

        public Builder(RegionInstanceGroupManagerStatefulDisk defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deleteRule = defaults.deleteRule;
    	      this.deviceName = defaults.deviceName;
        }

        public Builder deleteRule(@Nullable String deleteRule) {
            this.deleteRule = deleteRule;
            return this;
        }
        public Builder deviceName(String deviceName) {
            this.deviceName = Objects.requireNonNull(deviceName);
            return this;
        }        public RegionInstanceGroupManagerStatefulDisk build() {
            return new RegionInstanceGroupManagerStatefulDisk(deleteRule, deviceName);
        }
    }
}
