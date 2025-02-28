// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.keyvault.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ManagedHardwareSecurityModuleState extends com.pulumi.resources.ResourceArgs {

    public static final ManagedHardwareSecurityModuleState Empty = new ManagedHardwareSecurityModuleState();

    /**
     * Specifies a list of administrators object IDs for the key vault Managed Hardware Security Module. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="adminObjectIds")
    private @Nullable Output<List<String>> adminObjectIds;

    /**
     * @return Specifies a list of administrators object IDs for the key vault Managed Hardware Security Module. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<List<String>>> adminObjectIds() {
        return Optional.ofNullable(this.adminObjectIds);
    }

    /**
     * The URI of the Key Vault Managed Hardware Security Module, used for performing operations on keys.
     * 
     */
    @Import(name="hsmUri")
    private @Nullable Output<String> hsmUri;

    /**
     * @return The URI of the Key Vault Managed Hardware Security Module, used for performing operations on keys.
     * 
     */
    public Optional<Output<String>> hsmUri() {
        return Optional.ofNullable(this.hsmUri);
    }

    /**
     * Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * Specifies the name of the Key Vault Managed Hardware Security Module. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Specifies the name of the Key Vault Managed Hardware Security Module. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Is Purge Protection enabled for this Key Vault Managed Hardware Security Module? Defaults to `false`. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="purgeProtectionEnabled")
    private @Nullable Output<Boolean> purgeProtectionEnabled;

    /**
     * @return Is Purge Protection enabled for this Key Vault Managed Hardware Security Module? Defaults to `false`. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<Boolean>> purgeProtectionEnabled() {
        return Optional.ofNullable(this.purgeProtectionEnabled);
    }

    /**
     * The name of the resource group in which to create the Key Vault Managed Hardware Security Module. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="resourceGroupName")
    private @Nullable Output<String> resourceGroupName;

    /**
     * @return The name of the resource group in which to create the Key Vault Managed Hardware Security Module. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> resourceGroupName() {
        return Optional.ofNullable(this.resourceGroupName);
    }

    /**
     * The Name of the SKU used for this Key Vault Managed Hardware Security Module. Possible value is `Standard_B1`. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="skuName")
    private @Nullable Output<String> skuName;

    /**
     * @return The Name of the SKU used for this Key Vault Managed Hardware Security Module. Possible value is `Standard_B1`. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> skuName() {
        return Optional.ofNullable(this.skuName);
    }

    /**
     * The number of days that items should be retained for once soft-deleted. This value can be between `7` and `90` days. Defaults to `90`. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="softDeleteRetentionDays")
    private @Nullable Output<Integer> softDeleteRetentionDays;

    /**
     * @return The number of days that items should be retained for once soft-deleted. This value can be between `7` and `90` days. Defaults to `90`. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<Integer>> softDeleteRetentionDays() {
        return Optional.ofNullable(this.softDeleteRetentionDays);
    }

    /**
     * A mapping of tags to assign to the resource. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A mapping of tags to assign to the resource. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * The Azure Active Directory Tenant ID that should be used for authenticating requests to the key vault Managed Hardware Security Module. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="tenantId")
    private @Nullable Output<String> tenantId;

    /**
     * @return The Azure Active Directory Tenant ID that should be used for authenticating requests to the key vault Managed Hardware Security Module. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> tenantId() {
        return Optional.ofNullable(this.tenantId);
    }

    private ManagedHardwareSecurityModuleState() {}

    private ManagedHardwareSecurityModuleState(ManagedHardwareSecurityModuleState $) {
        this.adminObjectIds = $.adminObjectIds;
        this.hsmUri = $.hsmUri;
        this.location = $.location;
        this.name = $.name;
        this.purgeProtectionEnabled = $.purgeProtectionEnabled;
        this.resourceGroupName = $.resourceGroupName;
        this.skuName = $.skuName;
        this.softDeleteRetentionDays = $.softDeleteRetentionDays;
        this.tags = $.tags;
        this.tenantId = $.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ManagedHardwareSecurityModuleState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ManagedHardwareSecurityModuleState $;

        public Builder() {
            $ = new ManagedHardwareSecurityModuleState();
        }

        public Builder(ManagedHardwareSecurityModuleState defaults) {
            $ = new ManagedHardwareSecurityModuleState(Objects.requireNonNull(defaults));
        }

        /**
         * @param adminObjectIds Specifies a list of administrators object IDs for the key vault Managed Hardware Security Module. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder adminObjectIds(@Nullable Output<List<String>> adminObjectIds) {
            $.adminObjectIds = adminObjectIds;
            return this;
        }

        /**
         * @param adminObjectIds Specifies a list of administrators object IDs for the key vault Managed Hardware Security Module. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder adminObjectIds(List<String> adminObjectIds) {
            return adminObjectIds(Output.of(adminObjectIds));
        }

        /**
         * @param adminObjectIds Specifies a list of administrators object IDs for the key vault Managed Hardware Security Module. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder adminObjectIds(String... adminObjectIds) {
            return adminObjectIds(List.of(adminObjectIds));
        }

        /**
         * @param hsmUri The URI of the Key Vault Managed Hardware Security Module, used for performing operations on keys.
         * 
         * @return builder
         * 
         */
        public Builder hsmUri(@Nullable Output<String> hsmUri) {
            $.hsmUri = hsmUri;
            return this;
        }

        /**
         * @param hsmUri The URI of the Key Vault Managed Hardware Security Module, used for performing operations on keys.
         * 
         * @return builder
         * 
         */
        public Builder hsmUri(String hsmUri) {
            return hsmUri(Output.of(hsmUri));
        }

        /**
         * @param location Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param name Specifies the name of the Key Vault Managed Hardware Security Module. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the name of the Key Vault Managed Hardware Security Module. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param purgeProtectionEnabled Is Purge Protection enabled for this Key Vault Managed Hardware Security Module? Defaults to `false`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder purgeProtectionEnabled(@Nullable Output<Boolean> purgeProtectionEnabled) {
            $.purgeProtectionEnabled = purgeProtectionEnabled;
            return this;
        }

        /**
         * @param purgeProtectionEnabled Is Purge Protection enabled for this Key Vault Managed Hardware Security Module? Defaults to `false`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder purgeProtectionEnabled(Boolean purgeProtectionEnabled) {
            return purgeProtectionEnabled(Output.of(purgeProtectionEnabled));
        }

        /**
         * @param resourceGroupName The name of the resource group in which to create the Key Vault Managed Hardware Security Module. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(@Nullable Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group in which to create the Key Vault Managed Hardware Security Module. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param skuName The Name of the SKU used for this Key Vault Managed Hardware Security Module. Possible value is `Standard_B1`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder skuName(@Nullable Output<String> skuName) {
            $.skuName = skuName;
            return this;
        }

        /**
         * @param skuName The Name of the SKU used for this Key Vault Managed Hardware Security Module. Possible value is `Standard_B1`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder skuName(String skuName) {
            return skuName(Output.of(skuName));
        }

        /**
         * @param softDeleteRetentionDays The number of days that items should be retained for once soft-deleted. This value can be between `7` and `90` days. Defaults to `90`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder softDeleteRetentionDays(@Nullable Output<Integer> softDeleteRetentionDays) {
            $.softDeleteRetentionDays = softDeleteRetentionDays;
            return this;
        }

        /**
         * @param softDeleteRetentionDays The number of days that items should be retained for once soft-deleted. This value can be between `7` and `90` days. Defaults to `90`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder softDeleteRetentionDays(Integer softDeleteRetentionDays) {
            return softDeleteRetentionDays(Output.of(softDeleteRetentionDays));
        }

        /**
         * @param tags A mapping of tags to assign to the resource. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A mapping of tags to assign to the resource. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tenantId The Azure Active Directory Tenant ID that should be used for authenticating requests to the key vault Managed Hardware Security Module. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder tenantId(@Nullable Output<String> tenantId) {
            $.tenantId = tenantId;
            return this;
        }

        /**
         * @param tenantId The Azure Active Directory Tenant ID that should be used for authenticating requests to the key vault Managed Hardware Security Module. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder tenantId(String tenantId) {
            return tenantId(Output.of(tenantId));
        }

        public ManagedHardwareSecurityModuleState build() {
            return $;
        }
    }

}
