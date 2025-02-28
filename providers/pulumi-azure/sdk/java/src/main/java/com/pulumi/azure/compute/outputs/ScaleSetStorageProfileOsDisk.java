// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ScaleSetStorageProfileOsDisk {
    /**
     * @return Specifies the caching requirements. Possible values include: `None` (default), `ReadOnly`, `ReadWrite`.
     * 
     */
    private final @Nullable String caching;
    /**
     * @return Specifies how the virtual machine should be created. The only possible option is `FromImage`.
     * 
     */
    private final String createOption;
    /**
     * @return Specifies the blob URI for user image. A virtual machine scale set creates an os disk in the same container as the user image.
     * Updating the osDisk image causes the existing disk to be deleted and a new one created with the new image. If the VM scale set is in Manual upgrade mode then the virtual machines are not updated until they have manualUpgrade applied to them.
     * When setting this field `os_type` needs to be specified. Cannot be used when `vhd_containers`, `managed_disk_type` or `storage_profile_image_reference` are specified.
     * 
     */
    private final @Nullable String image;
    /**
     * @return Specifies the type of managed disk to create. Value you must be either `Standard_LRS`, `StandardSSD_LRS` or `Premium_LRS`. Cannot be used when `vhd_containers` or `image` is specified.
     * 
     */
    private final @Nullable String managedDiskType;
    /**
     * @return Specifies the disk name. Must be specified when using unmanaged disk (&#39;managed_disk_type&#39; property not set).
     * 
     */
    private final @Nullable String name;
    /**
     * @return Specifies the operating system Type, valid values are windows, Linux.
     * 
     */
    private final @Nullable String osType;
    /**
     * @return Specifies the VHD URI. Cannot be used when `image` or `managed_disk_type` is specified.
     * 
     */
    private final @Nullable List<String> vhdContainers;

    @CustomType.Constructor
    private ScaleSetStorageProfileOsDisk(
        @CustomType.Parameter("caching") @Nullable String caching,
        @CustomType.Parameter("createOption") String createOption,
        @CustomType.Parameter("image") @Nullable String image,
        @CustomType.Parameter("managedDiskType") @Nullable String managedDiskType,
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("osType") @Nullable String osType,
        @CustomType.Parameter("vhdContainers") @Nullable List<String> vhdContainers) {
        this.caching = caching;
        this.createOption = createOption;
        this.image = image;
        this.managedDiskType = managedDiskType;
        this.name = name;
        this.osType = osType;
        this.vhdContainers = vhdContainers;
    }

    /**
     * @return Specifies the caching requirements. Possible values include: `None` (default), `ReadOnly`, `ReadWrite`.
     * 
     */
    public Optional<String> caching() {
        return Optional.ofNullable(this.caching);
    }
    /**
     * @return Specifies how the virtual machine should be created. The only possible option is `FromImage`.
     * 
     */
    public String createOption() {
        return this.createOption;
    }
    /**
     * @return Specifies the blob URI for user image. A virtual machine scale set creates an os disk in the same container as the user image.
     * Updating the osDisk image causes the existing disk to be deleted and a new one created with the new image. If the VM scale set is in Manual upgrade mode then the virtual machines are not updated until they have manualUpgrade applied to them.
     * When setting this field `os_type` needs to be specified. Cannot be used when `vhd_containers`, `managed_disk_type` or `storage_profile_image_reference` are specified.
     * 
     */
    public Optional<String> image() {
        return Optional.ofNullable(this.image);
    }
    /**
     * @return Specifies the type of managed disk to create. Value you must be either `Standard_LRS`, `StandardSSD_LRS` or `Premium_LRS`. Cannot be used when `vhd_containers` or `image` is specified.
     * 
     */
    public Optional<String> managedDiskType() {
        return Optional.ofNullable(this.managedDiskType);
    }
    /**
     * @return Specifies the disk name. Must be specified when using unmanaged disk (&#39;managed_disk_type&#39; property not set).
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return Specifies the operating system Type, valid values are windows, Linux.
     * 
     */
    public Optional<String> osType() {
        return Optional.ofNullable(this.osType);
    }
    /**
     * @return Specifies the VHD URI. Cannot be used when `image` or `managed_disk_type` is specified.
     * 
     */
    public List<String> vhdContainers() {
        return this.vhdContainers == null ? List.of() : this.vhdContainers;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScaleSetStorageProfileOsDisk defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String caching;
        private String createOption;
        private @Nullable String image;
        private @Nullable String managedDiskType;
        private @Nullable String name;
        private @Nullable String osType;
        private @Nullable List<String> vhdContainers;

        public Builder() {
    	      // Empty
        }

        public Builder(ScaleSetStorageProfileOsDisk defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.caching = defaults.caching;
    	      this.createOption = defaults.createOption;
    	      this.image = defaults.image;
    	      this.managedDiskType = defaults.managedDiskType;
    	      this.name = defaults.name;
    	      this.osType = defaults.osType;
    	      this.vhdContainers = defaults.vhdContainers;
        }

        public Builder caching(@Nullable String caching) {
            this.caching = caching;
            return this;
        }
        public Builder createOption(String createOption) {
            this.createOption = Objects.requireNonNull(createOption);
            return this;
        }
        public Builder image(@Nullable String image) {
            this.image = image;
            return this;
        }
        public Builder managedDiskType(@Nullable String managedDiskType) {
            this.managedDiskType = managedDiskType;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder osType(@Nullable String osType) {
            this.osType = osType;
            return this;
        }
        public Builder vhdContainers(@Nullable List<String> vhdContainers) {
            this.vhdContainers = vhdContainers;
            return this;
        }
        public Builder vhdContainers(String... vhdContainers) {
            return vhdContainers(List.of(vhdContainers));
        }        public ScaleSetStorageProfileOsDisk build() {
            return new ScaleSetStorageProfileOsDisk(caching, createOption, image, managedDiskType, name, osType, vhdContainers);
        }
    }
}
