// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.compute.outputs.InstanceSchedulingNodeAffinity;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class InstanceScheduling {
    /**
     * @return Specifies if the instance should be
     * restarted if it was terminated by Compute Engine (not a user).
     * Defaults to true.
     * 
     */
    private final @Nullable Boolean automaticRestart;
    /**
     * @return The minimum number of virtual CPUs this instance will consume when running on a sole-tenant node.
     * 
     */
    private final @Nullable Integer minNodeCpus;
    /**
     * @return Specifies node affinities or anti-affinities
     * to determine which sole-tenant nodes your instances and managed instance
     * groups will use as host systems. Read more on sole-tenant node creation
     * [here](https://cloud.google.com/compute/docs/nodes/create-nodes).
     * Structure documented below.
     * 
     */
    private final @Nullable List<InstanceSchedulingNodeAffinity> nodeAffinities;
    /**
     * @return Describes maintenance behavior for the
     * instance. Can be MIGRATE or TERMINATE, for more info, read
     * [here](https://cloud.google.com/compute/docs/instances/setting-instance-scheduling-options).
     * 
     */
    private final @Nullable String onHostMaintenance;
    /**
     * @return Specifies if the instance is preemptible.
     * If this field is set to true, then `automatic_restart` must be
     * set to false.  Defaults to false.
     * 
     */
    private final @Nullable Boolean preemptible;
    /**
     * @return Describe the type of preemptible VM. This field accepts the value `STANDARD` or `SPOT`. If the value is `STANDARD`, there will be no discount. If this   is set to `SPOT`,
     * `preemptible` should be `true` and `auto_restart` should be
     * `false`. For more info about
     * `SPOT`, read [here](https://cloud.google.com/compute/docs/instances/spot)
     * 
     */
    private final @Nullable String provisioningModel;

    @CustomType.Constructor
    private InstanceScheduling(
        @CustomType.Parameter("automaticRestart") @Nullable Boolean automaticRestart,
        @CustomType.Parameter("minNodeCpus") @Nullable Integer minNodeCpus,
        @CustomType.Parameter("nodeAffinities") @Nullable List<InstanceSchedulingNodeAffinity> nodeAffinities,
        @CustomType.Parameter("onHostMaintenance") @Nullable String onHostMaintenance,
        @CustomType.Parameter("preemptible") @Nullable Boolean preemptible,
        @CustomType.Parameter("provisioningModel") @Nullable String provisioningModel) {
        this.automaticRestart = automaticRestart;
        this.minNodeCpus = minNodeCpus;
        this.nodeAffinities = nodeAffinities;
        this.onHostMaintenance = onHostMaintenance;
        this.preemptible = preemptible;
        this.provisioningModel = provisioningModel;
    }

    /**
     * @return Specifies if the instance should be
     * restarted if it was terminated by Compute Engine (not a user).
     * Defaults to true.
     * 
     */
    public Optional<Boolean> automaticRestart() {
        return Optional.ofNullable(this.automaticRestart);
    }
    /**
     * @return The minimum number of virtual CPUs this instance will consume when running on a sole-tenant node.
     * 
     */
    public Optional<Integer> minNodeCpus() {
        return Optional.ofNullable(this.minNodeCpus);
    }
    /**
     * @return Specifies node affinities or anti-affinities
     * to determine which sole-tenant nodes your instances and managed instance
     * groups will use as host systems. Read more on sole-tenant node creation
     * [here](https://cloud.google.com/compute/docs/nodes/create-nodes).
     * Structure documented below.
     * 
     */
    public List<InstanceSchedulingNodeAffinity> nodeAffinities() {
        return this.nodeAffinities == null ? List.of() : this.nodeAffinities;
    }
    /**
     * @return Describes maintenance behavior for the
     * instance. Can be MIGRATE or TERMINATE, for more info, read
     * [here](https://cloud.google.com/compute/docs/instances/setting-instance-scheduling-options).
     * 
     */
    public Optional<String> onHostMaintenance() {
        return Optional.ofNullable(this.onHostMaintenance);
    }
    /**
     * @return Specifies if the instance is preemptible.
     * If this field is set to true, then `automatic_restart` must be
     * set to false.  Defaults to false.
     * 
     */
    public Optional<Boolean> preemptible() {
        return Optional.ofNullable(this.preemptible);
    }
    /**
     * @return Describe the type of preemptible VM. This field accepts the value `STANDARD` or `SPOT`. If the value is `STANDARD`, there will be no discount. If this   is set to `SPOT`,
     * `preemptible` should be `true` and `auto_restart` should be
     * `false`. For more info about
     * `SPOT`, read [here](https://cloud.google.com/compute/docs/instances/spot)
     * 
     */
    public Optional<String> provisioningModel() {
        return Optional.ofNullable(this.provisioningModel);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceScheduling defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean automaticRestart;
        private @Nullable Integer minNodeCpus;
        private @Nullable List<InstanceSchedulingNodeAffinity> nodeAffinities;
        private @Nullable String onHostMaintenance;
        private @Nullable Boolean preemptible;
        private @Nullable String provisioningModel;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceScheduling defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.automaticRestart = defaults.automaticRestart;
    	      this.minNodeCpus = defaults.minNodeCpus;
    	      this.nodeAffinities = defaults.nodeAffinities;
    	      this.onHostMaintenance = defaults.onHostMaintenance;
    	      this.preemptible = defaults.preemptible;
    	      this.provisioningModel = defaults.provisioningModel;
        }

        public Builder automaticRestart(@Nullable Boolean automaticRestart) {
            this.automaticRestart = automaticRestart;
            return this;
        }
        public Builder minNodeCpus(@Nullable Integer minNodeCpus) {
            this.minNodeCpus = minNodeCpus;
            return this;
        }
        public Builder nodeAffinities(@Nullable List<InstanceSchedulingNodeAffinity> nodeAffinities) {
            this.nodeAffinities = nodeAffinities;
            return this;
        }
        public Builder nodeAffinities(InstanceSchedulingNodeAffinity... nodeAffinities) {
            return nodeAffinities(List.of(nodeAffinities));
        }
        public Builder onHostMaintenance(@Nullable String onHostMaintenance) {
            this.onHostMaintenance = onHostMaintenance;
            return this;
        }
        public Builder preemptible(@Nullable Boolean preemptible) {
            this.preemptible = preemptible;
            return this;
        }
        public Builder provisioningModel(@Nullable String provisioningModel) {
            this.provisioningModel = provisioningModel;
            return this;
        }        public InstanceScheduling build() {
            return new InstanceScheduling(automaticRestart, minNodeCpus, nodeAffinities, onHostMaintenance, preemptible, provisioningModel);
        }
    }
}
