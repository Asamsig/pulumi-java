// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.container.inputs.NodePoolNodeConfigEphemeralStorageConfigArgs;
import com.pulumi.gcp.container.inputs.NodePoolNodeConfigGcfsConfigArgs;
import com.pulumi.gcp.container.inputs.NodePoolNodeConfigGuestAcceleratorArgs;
import com.pulumi.gcp.container.inputs.NodePoolNodeConfigGvnicArgs;
import com.pulumi.gcp.container.inputs.NodePoolNodeConfigKubeletConfigArgs;
import com.pulumi.gcp.container.inputs.NodePoolNodeConfigLinuxNodeConfigArgs;
import com.pulumi.gcp.container.inputs.NodePoolNodeConfigSandboxConfigArgs;
import com.pulumi.gcp.container.inputs.NodePoolNodeConfigShieldedInstanceConfigArgs;
import com.pulumi.gcp.container.inputs.NodePoolNodeConfigTaintArgs;
import com.pulumi.gcp.container.inputs.NodePoolNodeConfigWorkloadMetadataConfigArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NodePoolNodeConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final NodePoolNodeConfigArgs Empty = new NodePoolNodeConfigArgs();

    @Import(name="bootDiskKmsKey")
    private @Nullable Output<String> bootDiskKmsKey;

    public Optional<Output<String>> bootDiskKmsKey() {
        return Optional.ofNullable(this.bootDiskKmsKey);
    }

    @Import(name="diskSizeGb")
    private @Nullable Output<Integer> diskSizeGb;

    public Optional<Output<Integer>> diskSizeGb() {
        return Optional.ofNullable(this.diskSizeGb);
    }

    @Import(name="diskType")
    private @Nullable Output<String> diskType;

    public Optional<Output<String>> diskType() {
        return Optional.ofNullable(this.diskType);
    }

    @Import(name="ephemeralStorageConfig")
    private @Nullable Output<NodePoolNodeConfigEphemeralStorageConfigArgs> ephemeralStorageConfig;

    public Optional<Output<NodePoolNodeConfigEphemeralStorageConfigArgs>> ephemeralStorageConfig() {
        return Optional.ofNullable(this.ephemeralStorageConfig);
    }

    @Import(name="gcfsConfig")
    private @Nullable Output<NodePoolNodeConfigGcfsConfigArgs> gcfsConfig;

    public Optional<Output<NodePoolNodeConfigGcfsConfigArgs>> gcfsConfig() {
        return Optional.ofNullable(this.gcfsConfig);
    }

    @Import(name="guestAccelerators")
    private @Nullable Output<List<NodePoolNodeConfigGuestAcceleratorArgs>> guestAccelerators;

    public Optional<Output<List<NodePoolNodeConfigGuestAcceleratorArgs>>> guestAccelerators() {
        return Optional.ofNullable(this.guestAccelerators);
    }

    @Import(name="gvnic")
    private @Nullable Output<NodePoolNodeConfigGvnicArgs> gvnic;

    public Optional<Output<NodePoolNodeConfigGvnicArgs>> gvnic() {
        return Optional.ofNullable(this.gvnic);
    }

    @Import(name="imageType")
    private @Nullable Output<String> imageType;

    public Optional<Output<String>> imageType() {
        return Optional.ofNullable(this.imageType);
    }

    @Import(name="kubeletConfig")
    private @Nullable Output<NodePoolNodeConfigKubeletConfigArgs> kubeletConfig;

    public Optional<Output<NodePoolNodeConfigKubeletConfigArgs>> kubeletConfig() {
        return Optional.ofNullable(this.kubeletConfig);
    }

    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    @Import(name="linuxNodeConfig")
    private @Nullable Output<NodePoolNodeConfigLinuxNodeConfigArgs> linuxNodeConfig;

    public Optional<Output<NodePoolNodeConfigLinuxNodeConfigArgs>> linuxNodeConfig() {
        return Optional.ofNullable(this.linuxNodeConfig);
    }

    @Import(name="localSsdCount")
    private @Nullable Output<Integer> localSsdCount;

    public Optional<Output<Integer>> localSsdCount() {
        return Optional.ofNullable(this.localSsdCount);
    }

    @Import(name="machineType")
    private @Nullable Output<String> machineType;

    public Optional<Output<String>> machineType() {
        return Optional.ofNullable(this.machineType);
    }

    @Import(name="metadata")
    private @Nullable Output<Map<String,String>> metadata;

    public Optional<Output<Map<String,String>>> metadata() {
        return Optional.ofNullable(this.metadata);
    }

    @Import(name="minCpuPlatform")
    private @Nullable Output<String> minCpuPlatform;

    public Optional<Output<String>> minCpuPlatform() {
        return Optional.ofNullable(this.minCpuPlatform);
    }

    @Import(name="nodeGroup")
    private @Nullable Output<String> nodeGroup;

    public Optional<Output<String>> nodeGroup() {
        return Optional.ofNullable(this.nodeGroup);
    }

    @Import(name="oauthScopes")
    private @Nullable Output<List<String>> oauthScopes;

    public Optional<Output<List<String>>> oauthScopes() {
        return Optional.ofNullable(this.oauthScopes);
    }

    @Import(name="preemptible")
    private @Nullable Output<Boolean> preemptible;

    public Optional<Output<Boolean>> preemptible() {
        return Optional.ofNullable(this.preemptible);
    }

    @Import(name="sandboxConfig")
    private @Nullable Output<NodePoolNodeConfigSandboxConfigArgs> sandboxConfig;

    public Optional<Output<NodePoolNodeConfigSandboxConfigArgs>> sandboxConfig() {
        return Optional.ofNullable(this.sandboxConfig);
    }

    @Import(name="serviceAccount")
    private @Nullable Output<String> serviceAccount;

    public Optional<Output<String>> serviceAccount() {
        return Optional.ofNullable(this.serviceAccount);
    }

    @Import(name="shieldedInstanceConfig")
    private @Nullable Output<NodePoolNodeConfigShieldedInstanceConfigArgs> shieldedInstanceConfig;

    public Optional<Output<NodePoolNodeConfigShieldedInstanceConfigArgs>> shieldedInstanceConfig() {
        return Optional.ofNullable(this.shieldedInstanceConfig);
    }

    @Import(name="spot")
    private @Nullable Output<Boolean> spot;

    public Optional<Output<Boolean>> spot() {
        return Optional.ofNullable(this.spot);
    }

    @Import(name="tags")
    private @Nullable Output<List<String>> tags;

    public Optional<Output<List<String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    @Import(name="taints")
    private @Nullable Output<List<NodePoolNodeConfigTaintArgs>> taints;

    public Optional<Output<List<NodePoolNodeConfigTaintArgs>>> taints() {
        return Optional.ofNullable(this.taints);
    }

    @Import(name="workloadMetadataConfig")
    private @Nullable Output<NodePoolNodeConfigWorkloadMetadataConfigArgs> workloadMetadataConfig;

    public Optional<Output<NodePoolNodeConfigWorkloadMetadataConfigArgs>> workloadMetadataConfig() {
        return Optional.ofNullable(this.workloadMetadataConfig);
    }

    private NodePoolNodeConfigArgs() {}

    private NodePoolNodeConfigArgs(NodePoolNodeConfigArgs $) {
        this.bootDiskKmsKey = $.bootDiskKmsKey;
        this.diskSizeGb = $.diskSizeGb;
        this.diskType = $.diskType;
        this.ephemeralStorageConfig = $.ephemeralStorageConfig;
        this.gcfsConfig = $.gcfsConfig;
        this.guestAccelerators = $.guestAccelerators;
        this.gvnic = $.gvnic;
        this.imageType = $.imageType;
        this.kubeletConfig = $.kubeletConfig;
        this.labels = $.labels;
        this.linuxNodeConfig = $.linuxNodeConfig;
        this.localSsdCount = $.localSsdCount;
        this.machineType = $.machineType;
        this.metadata = $.metadata;
        this.minCpuPlatform = $.minCpuPlatform;
        this.nodeGroup = $.nodeGroup;
        this.oauthScopes = $.oauthScopes;
        this.preemptible = $.preemptible;
        this.sandboxConfig = $.sandboxConfig;
        this.serviceAccount = $.serviceAccount;
        this.shieldedInstanceConfig = $.shieldedInstanceConfig;
        this.spot = $.spot;
        this.tags = $.tags;
        this.taints = $.taints;
        this.workloadMetadataConfig = $.workloadMetadataConfig;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NodePoolNodeConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NodePoolNodeConfigArgs $;

        public Builder() {
            $ = new NodePoolNodeConfigArgs();
        }

        public Builder(NodePoolNodeConfigArgs defaults) {
            $ = new NodePoolNodeConfigArgs(Objects.requireNonNull(defaults));
        }

        public Builder bootDiskKmsKey(@Nullable Output<String> bootDiskKmsKey) {
            $.bootDiskKmsKey = bootDiskKmsKey;
            return this;
        }

        public Builder bootDiskKmsKey(String bootDiskKmsKey) {
            return bootDiskKmsKey(Output.of(bootDiskKmsKey));
        }

        public Builder diskSizeGb(@Nullable Output<Integer> diskSizeGb) {
            $.diskSizeGb = diskSizeGb;
            return this;
        }

        public Builder diskSizeGb(Integer diskSizeGb) {
            return diskSizeGb(Output.of(diskSizeGb));
        }

        public Builder diskType(@Nullable Output<String> diskType) {
            $.diskType = diskType;
            return this;
        }

        public Builder diskType(String diskType) {
            return diskType(Output.of(diskType));
        }

        public Builder ephemeralStorageConfig(@Nullable Output<NodePoolNodeConfigEphemeralStorageConfigArgs> ephemeralStorageConfig) {
            $.ephemeralStorageConfig = ephemeralStorageConfig;
            return this;
        }

        public Builder ephemeralStorageConfig(NodePoolNodeConfigEphemeralStorageConfigArgs ephemeralStorageConfig) {
            return ephemeralStorageConfig(Output.of(ephemeralStorageConfig));
        }

        public Builder gcfsConfig(@Nullable Output<NodePoolNodeConfigGcfsConfigArgs> gcfsConfig) {
            $.gcfsConfig = gcfsConfig;
            return this;
        }

        public Builder gcfsConfig(NodePoolNodeConfigGcfsConfigArgs gcfsConfig) {
            return gcfsConfig(Output.of(gcfsConfig));
        }

        public Builder guestAccelerators(@Nullable Output<List<NodePoolNodeConfigGuestAcceleratorArgs>> guestAccelerators) {
            $.guestAccelerators = guestAccelerators;
            return this;
        }

        public Builder guestAccelerators(List<NodePoolNodeConfigGuestAcceleratorArgs> guestAccelerators) {
            return guestAccelerators(Output.of(guestAccelerators));
        }

        public Builder guestAccelerators(NodePoolNodeConfigGuestAcceleratorArgs... guestAccelerators) {
            return guestAccelerators(List.of(guestAccelerators));
        }

        public Builder gvnic(@Nullable Output<NodePoolNodeConfigGvnicArgs> gvnic) {
            $.gvnic = gvnic;
            return this;
        }

        public Builder gvnic(NodePoolNodeConfigGvnicArgs gvnic) {
            return gvnic(Output.of(gvnic));
        }

        public Builder imageType(@Nullable Output<String> imageType) {
            $.imageType = imageType;
            return this;
        }

        public Builder imageType(String imageType) {
            return imageType(Output.of(imageType));
        }

        public Builder kubeletConfig(@Nullable Output<NodePoolNodeConfigKubeletConfigArgs> kubeletConfig) {
            $.kubeletConfig = kubeletConfig;
            return this;
        }

        public Builder kubeletConfig(NodePoolNodeConfigKubeletConfigArgs kubeletConfig) {
            return kubeletConfig(Output.of(kubeletConfig));
        }

        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        public Builder linuxNodeConfig(@Nullable Output<NodePoolNodeConfigLinuxNodeConfigArgs> linuxNodeConfig) {
            $.linuxNodeConfig = linuxNodeConfig;
            return this;
        }

        public Builder linuxNodeConfig(NodePoolNodeConfigLinuxNodeConfigArgs linuxNodeConfig) {
            return linuxNodeConfig(Output.of(linuxNodeConfig));
        }

        public Builder localSsdCount(@Nullable Output<Integer> localSsdCount) {
            $.localSsdCount = localSsdCount;
            return this;
        }

        public Builder localSsdCount(Integer localSsdCount) {
            return localSsdCount(Output.of(localSsdCount));
        }

        public Builder machineType(@Nullable Output<String> machineType) {
            $.machineType = machineType;
            return this;
        }

        public Builder machineType(String machineType) {
            return machineType(Output.of(machineType));
        }

        public Builder metadata(@Nullable Output<Map<String,String>> metadata) {
            $.metadata = metadata;
            return this;
        }

        public Builder metadata(Map<String,String> metadata) {
            return metadata(Output.of(metadata));
        }

        public Builder minCpuPlatform(@Nullable Output<String> minCpuPlatform) {
            $.minCpuPlatform = minCpuPlatform;
            return this;
        }

        public Builder minCpuPlatform(String minCpuPlatform) {
            return minCpuPlatform(Output.of(minCpuPlatform));
        }

        public Builder nodeGroup(@Nullable Output<String> nodeGroup) {
            $.nodeGroup = nodeGroup;
            return this;
        }

        public Builder nodeGroup(String nodeGroup) {
            return nodeGroup(Output.of(nodeGroup));
        }

        public Builder oauthScopes(@Nullable Output<List<String>> oauthScopes) {
            $.oauthScopes = oauthScopes;
            return this;
        }

        public Builder oauthScopes(List<String> oauthScopes) {
            return oauthScopes(Output.of(oauthScopes));
        }

        public Builder oauthScopes(String... oauthScopes) {
            return oauthScopes(List.of(oauthScopes));
        }

        public Builder preemptible(@Nullable Output<Boolean> preemptible) {
            $.preemptible = preemptible;
            return this;
        }

        public Builder preemptible(Boolean preemptible) {
            return preemptible(Output.of(preemptible));
        }

        public Builder sandboxConfig(@Nullable Output<NodePoolNodeConfigSandboxConfigArgs> sandboxConfig) {
            $.sandboxConfig = sandboxConfig;
            return this;
        }

        public Builder sandboxConfig(NodePoolNodeConfigSandboxConfigArgs sandboxConfig) {
            return sandboxConfig(Output.of(sandboxConfig));
        }

        public Builder serviceAccount(@Nullable Output<String> serviceAccount) {
            $.serviceAccount = serviceAccount;
            return this;
        }

        public Builder serviceAccount(String serviceAccount) {
            return serviceAccount(Output.of(serviceAccount));
        }

        public Builder shieldedInstanceConfig(@Nullable Output<NodePoolNodeConfigShieldedInstanceConfigArgs> shieldedInstanceConfig) {
            $.shieldedInstanceConfig = shieldedInstanceConfig;
            return this;
        }

        public Builder shieldedInstanceConfig(NodePoolNodeConfigShieldedInstanceConfigArgs shieldedInstanceConfig) {
            return shieldedInstanceConfig(Output.of(shieldedInstanceConfig));
        }

        public Builder spot(@Nullable Output<Boolean> spot) {
            $.spot = spot;
            return this;
        }

        public Builder spot(Boolean spot) {
            return spot(Output.of(spot));
        }

        public Builder tags(@Nullable Output<List<String>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(List<String> tags) {
            return tags(Output.of(tags));
        }

        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }

        public Builder taints(@Nullable Output<List<NodePoolNodeConfigTaintArgs>> taints) {
            $.taints = taints;
            return this;
        }

        public Builder taints(List<NodePoolNodeConfigTaintArgs> taints) {
            return taints(Output.of(taints));
        }

        public Builder taints(NodePoolNodeConfigTaintArgs... taints) {
            return taints(List.of(taints));
        }

        public Builder workloadMetadataConfig(@Nullable Output<NodePoolNodeConfigWorkloadMetadataConfigArgs> workloadMetadataConfig) {
            $.workloadMetadataConfig = workloadMetadataConfig;
            return this;
        }

        public Builder workloadMetadataConfig(NodePoolNodeConfigWorkloadMetadataConfigArgs workloadMetadataConfig) {
            return workloadMetadataConfig(Output.of(workloadMetadataConfig));
        }

        public NodePoolNodeConfigArgs build() {
            return $;
        }
    }

}
