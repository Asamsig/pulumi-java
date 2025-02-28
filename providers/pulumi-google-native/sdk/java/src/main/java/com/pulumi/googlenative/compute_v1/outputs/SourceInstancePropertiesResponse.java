// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.compute_v1.outputs.AcceleratorConfigResponse;
import com.pulumi.googlenative.compute_v1.outputs.MetadataResponse;
import com.pulumi.googlenative.compute_v1.outputs.NetworkInterfaceResponse;
import com.pulumi.googlenative.compute_v1.outputs.SavedAttachedDiskResponse;
import com.pulumi.googlenative.compute_v1.outputs.SchedulingResponse;
import com.pulumi.googlenative.compute_v1.outputs.ServiceAccountResponse;
import com.pulumi.googlenative.compute_v1.outputs.TagsResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class SourceInstancePropertiesResponse {
    /**
     * @return Enables instances created based on this machine image to send packets with source IP addresses other than their own and receive packets with destination IP addresses other than their own. If these instances will be used as an IP gateway or it will be set as the next-hop in a Route resource, specify true. If unsure, leave this set to false. See the Enable IP forwarding documentation for more information.
     * 
     */
    private final Boolean canIpForward;
    /**
     * @return Whether the instance created from this machine image should be protected against deletion.
     * 
     */
    private final Boolean deletionProtection;
    /**
     * @return An optional text description for the instances that are created from this machine image.
     * 
     */
    private final String description;
    /**
     * @return An array of disks that are associated with the instances that are created from this machine image.
     * 
     */
    private final List<SavedAttachedDiskResponse> disks;
    /**
     * @return A list of guest accelerator cards&#39; type and count to use for instances created from this machine image.
     * 
     */
    private final List<AcceleratorConfigResponse> guestAccelerators;
    /**
     * @return Labels to apply to instances that are created from this machine image.
     * 
     */
    private final Map<String,String> labels;
    /**
     * @return The machine type to use for instances that are created from this machine image.
     * 
     */
    private final String machineType;
    /**
     * @return The metadata key/value pairs to assign to instances that are created from this machine image. These pairs can consist of custom metadata or predefined keys. See Project and instance metadata for more information.
     * 
     */
    private final MetadataResponse metadata;
    /**
     * @return Minimum cpu/platform to be used by instances created from this machine image. The instance may be scheduled on the specified or newer cpu/platform. Applicable values are the friendly names of CPU platforms, such as minCpuPlatform: &#34;Intel Haswell&#34; or minCpuPlatform: &#34;Intel Sandy Bridge&#34;. For more information, read Specifying a Minimum CPU Platform.
     * 
     */
    private final String minCpuPlatform;
    /**
     * @return An array of network access configurations for this interface.
     * 
     */
    private final List<NetworkInterfaceResponse> networkInterfaces;
    /**
     * @return Specifies the scheduling options for the instances that are created from this machine image.
     * 
     */
    private final SchedulingResponse scheduling;
    /**
     * @return A list of service accounts with specified scopes. Access tokens for these service accounts are available to the instances that are created from this machine image. Use metadata queries to obtain the access tokens for these instances.
     * 
     */
    private final List<ServiceAccountResponse> serviceAccounts;
    /**
     * @return A list of tags to apply to the instances that are created from this machine image. The tags identify valid sources or targets for network firewalls. The setTags method can modify this list of tags. Each tag within the list must comply with RFC1035.
     * 
     */
    private final TagsResponse tags;

    @CustomType.Constructor
    private SourceInstancePropertiesResponse(
        @CustomType.Parameter("canIpForward") Boolean canIpForward,
        @CustomType.Parameter("deletionProtection") Boolean deletionProtection,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("disks") List<SavedAttachedDiskResponse> disks,
        @CustomType.Parameter("guestAccelerators") List<AcceleratorConfigResponse> guestAccelerators,
        @CustomType.Parameter("labels") Map<String,String> labels,
        @CustomType.Parameter("machineType") String machineType,
        @CustomType.Parameter("metadata") MetadataResponse metadata,
        @CustomType.Parameter("minCpuPlatform") String minCpuPlatform,
        @CustomType.Parameter("networkInterfaces") List<NetworkInterfaceResponse> networkInterfaces,
        @CustomType.Parameter("scheduling") SchedulingResponse scheduling,
        @CustomType.Parameter("serviceAccounts") List<ServiceAccountResponse> serviceAccounts,
        @CustomType.Parameter("tags") TagsResponse tags) {
        this.canIpForward = canIpForward;
        this.deletionProtection = deletionProtection;
        this.description = description;
        this.disks = disks;
        this.guestAccelerators = guestAccelerators;
        this.labels = labels;
        this.machineType = machineType;
        this.metadata = metadata;
        this.minCpuPlatform = minCpuPlatform;
        this.networkInterfaces = networkInterfaces;
        this.scheduling = scheduling;
        this.serviceAccounts = serviceAccounts;
        this.tags = tags;
    }

    /**
     * @return Enables instances created based on this machine image to send packets with source IP addresses other than their own and receive packets with destination IP addresses other than their own. If these instances will be used as an IP gateway or it will be set as the next-hop in a Route resource, specify true. If unsure, leave this set to false. See the Enable IP forwarding documentation for more information.
     * 
     */
    public Boolean canIpForward() {
        return this.canIpForward;
    }
    /**
     * @return Whether the instance created from this machine image should be protected against deletion.
     * 
     */
    public Boolean deletionProtection() {
        return this.deletionProtection;
    }
    /**
     * @return An optional text description for the instances that are created from this machine image.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return An array of disks that are associated with the instances that are created from this machine image.
     * 
     */
    public List<SavedAttachedDiskResponse> disks() {
        return this.disks;
    }
    /**
     * @return A list of guest accelerator cards&#39; type and count to use for instances created from this machine image.
     * 
     */
    public List<AcceleratorConfigResponse> guestAccelerators() {
        return this.guestAccelerators;
    }
    /**
     * @return Labels to apply to instances that are created from this machine image.
     * 
     */
    public Map<String,String> labels() {
        return this.labels;
    }
    /**
     * @return The machine type to use for instances that are created from this machine image.
     * 
     */
    public String machineType() {
        return this.machineType;
    }
    /**
     * @return The metadata key/value pairs to assign to instances that are created from this machine image. These pairs can consist of custom metadata or predefined keys. See Project and instance metadata for more information.
     * 
     */
    public MetadataResponse metadata() {
        return this.metadata;
    }
    /**
     * @return Minimum cpu/platform to be used by instances created from this machine image. The instance may be scheduled on the specified or newer cpu/platform. Applicable values are the friendly names of CPU platforms, such as minCpuPlatform: &#34;Intel Haswell&#34; or minCpuPlatform: &#34;Intel Sandy Bridge&#34;. For more information, read Specifying a Minimum CPU Platform.
     * 
     */
    public String minCpuPlatform() {
        return this.minCpuPlatform;
    }
    /**
     * @return An array of network access configurations for this interface.
     * 
     */
    public List<NetworkInterfaceResponse> networkInterfaces() {
        return this.networkInterfaces;
    }
    /**
     * @return Specifies the scheduling options for the instances that are created from this machine image.
     * 
     */
    public SchedulingResponse scheduling() {
        return this.scheduling;
    }
    /**
     * @return A list of service accounts with specified scopes. Access tokens for these service accounts are available to the instances that are created from this machine image. Use metadata queries to obtain the access tokens for these instances.
     * 
     */
    public List<ServiceAccountResponse> serviceAccounts() {
        return this.serviceAccounts;
    }
    /**
     * @return A list of tags to apply to the instances that are created from this machine image. The tags identify valid sources or targets for network firewalls. The setTags method can modify this list of tags. Each tag within the list must comply with RFC1035.
     * 
     */
    public TagsResponse tags() {
        return this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SourceInstancePropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean canIpForward;
        private Boolean deletionProtection;
        private String description;
        private List<SavedAttachedDiskResponse> disks;
        private List<AcceleratorConfigResponse> guestAccelerators;
        private Map<String,String> labels;
        private String machineType;
        private MetadataResponse metadata;
        private String minCpuPlatform;
        private List<NetworkInterfaceResponse> networkInterfaces;
        private SchedulingResponse scheduling;
        private List<ServiceAccountResponse> serviceAccounts;
        private TagsResponse tags;

        public Builder() {
    	      // Empty
        }

        public Builder(SourceInstancePropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.canIpForward = defaults.canIpForward;
    	      this.deletionProtection = defaults.deletionProtection;
    	      this.description = defaults.description;
    	      this.disks = defaults.disks;
    	      this.guestAccelerators = defaults.guestAccelerators;
    	      this.labels = defaults.labels;
    	      this.machineType = defaults.machineType;
    	      this.metadata = defaults.metadata;
    	      this.minCpuPlatform = defaults.minCpuPlatform;
    	      this.networkInterfaces = defaults.networkInterfaces;
    	      this.scheduling = defaults.scheduling;
    	      this.serviceAccounts = defaults.serviceAccounts;
    	      this.tags = defaults.tags;
        }

        public Builder canIpForward(Boolean canIpForward) {
            this.canIpForward = Objects.requireNonNull(canIpForward);
            return this;
        }
        public Builder deletionProtection(Boolean deletionProtection) {
            this.deletionProtection = Objects.requireNonNull(deletionProtection);
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder disks(List<SavedAttachedDiskResponse> disks) {
            this.disks = Objects.requireNonNull(disks);
            return this;
        }
        public Builder disks(SavedAttachedDiskResponse... disks) {
            return disks(List.of(disks));
        }
        public Builder guestAccelerators(List<AcceleratorConfigResponse> guestAccelerators) {
            this.guestAccelerators = Objects.requireNonNull(guestAccelerators);
            return this;
        }
        public Builder guestAccelerators(AcceleratorConfigResponse... guestAccelerators) {
            return guestAccelerators(List.of(guestAccelerators));
        }
        public Builder labels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }
        public Builder machineType(String machineType) {
            this.machineType = Objects.requireNonNull(machineType);
            return this;
        }
        public Builder metadata(MetadataResponse metadata) {
            this.metadata = Objects.requireNonNull(metadata);
            return this;
        }
        public Builder minCpuPlatform(String minCpuPlatform) {
            this.minCpuPlatform = Objects.requireNonNull(minCpuPlatform);
            return this;
        }
        public Builder networkInterfaces(List<NetworkInterfaceResponse> networkInterfaces) {
            this.networkInterfaces = Objects.requireNonNull(networkInterfaces);
            return this;
        }
        public Builder networkInterfaces(NetworkInterfaceResponse... networkInterfaces) {
            return networkInterfaces(List.of(networkInterfaces));
        }
        public Builder scheduling(SchedulingResponse scheduling) {
            this.scheduling = Objects.requireNonNull(scheduling);
            return this;
        }
        public Builder serviceAccounts(List<ServiceAccountResponse> serviceAccounts) {
            this.serviceAccounts = Objects.requireNonNull(serviceAccounts);
            return this;
        }
        public Builder serviceAccounts(ServiceAccountResponse... serviceAccounts) {
            return serviceAccounts(List.of(serviceAccounts));
        }
        public Builder tags(TagsResponse tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }        public SourceInstancePropertiesResponse build() {
            return new SourceInstancePropertiesResponse(canIpForward, deletionProtection, description, disks, guestAccelerators, labels, machineType, metadata, minCpuPlatform, networkInterfaces, scheduling, serviceAccounts, tags);
        }
    }
}
