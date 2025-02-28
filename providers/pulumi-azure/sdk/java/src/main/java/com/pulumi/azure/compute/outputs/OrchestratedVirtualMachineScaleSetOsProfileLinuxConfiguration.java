// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.compute.outputs;

import com.pulumi.azure.compute.outputs.OrchestratedVirtualMachineScaleSetOsProfileLinuxConfigurationAdminSshKey;
import com.pulumi.azure.compute.outputs.OrchestratedVirtualMachineScaleSetOsProfileLinuxConfigurationSecret;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class OrchestratedVirtualMachineScaleSetOsProfileLinuxConfiguration {
    private final @Nullable String adminPassword;
    private final @Nullable List<OrchestratedVirtualMachineScaleSetOsProfileLinuxConfigurationAdminSshKey> adminSshKeys;
    private final String adminUsername;
    private final @Nullable String computerNamePrefix;
    /**
     * @return When an `admin_password` is specified `disable_password_authentication` must be set to `false`. Defaults to `true`.
     * 
     */
    private final @Nullable Boolean disablePasswordAuthentication;
    /**
     * @return Specifies the mode of in-guest patching of this Windows Virtual Machine. Possible values are `ImageDefault` or `AutomaticByPlatform`. Defaults to `ImageDefault`. For more information on patch modes please see the [product documentation](https://docs.microsoft.com/azure/virtual-machines/automatic-vm-guest-patching#patch-orchestration-modes).
     * 
     */
    private final @Nullable String patchMode;
    private final @Nullable Boolean provisionVmAgent;
    private final @Nullable List<OrchestratedVirtualMachineScaleSetOsProfileLinuxConfigurationSecret> secrets;

    @CustomType.Constructor
    private OrchestratedVirtualMachineScaleSetOsProfileLinuxConfiguration(
        @CustomType.Parameter("adminPassword") @Nullable String adminPassword,
        @CustomType.Parameter("adminSshKeys") @Nullable List<OrchestratedVirtualMachineScaleSetOsProfileLinuxConfigurationAdminSshKey> adminSshKeys,
        @CustomType.Parameter("adminUsername") String adminUsername,
        @CustomType.Parameter("computerNamePrefix") @Nullable String computerNamePrefix,
        @CustomType.Parameter("disablePasswordAuthentication") @Nullable Boolean disablePasswordAuthentication,
        @CustomType.Parameter("patchMode") @Nullable String patchMode,
        @CustomType.Parameter("provisionVmAgent") @Nullable Boolean provisionVmAgent,
        @CustomType.Parameter("secrets") @Nullable List<OrchestratedVirtualMachineScaleSetOsProfileLinuxConfigurationSecret> secrets) {
        this.adminPassword = adminPassword;
        this.adminSshKeys = adminSshKeys;
        this.adminUsername = adminUsername;
        this.computerNamePrefix = computerNamePrefix;
        this.disablePasswordAuthentication = disablePasswordAuthentication;
        this.patchMode = patchMode;
        this.provisionVmAgent = provisionVmAgent;
        this.secrets = secrets;
    }

    public Optional<String> adminPassword() {
        return Optional.ofNullable(this.adminPassword);
    }
    public List<OrchestratedVirtualMachineScaleSetOsProfileLinuxConfigurationAdminSshKey> adminSshKeys() {
        return this.adminSshKeys == null ? List.of() : this.adminSshKeys;
    }
    public String adminUsername() {
        return this.adminUsername;
    }
    public Optional<String> computerNamePrefix() {
        return Optional.ofNullable(this.computerNamePrefix);
    }
    /**
     * @return When an `admin_password` is specified `disable_password_authentication` must be set to `false`. Defaults to `true`.
     * 
     */
    public Optional<Boolean> disablePasswordAuthentication() {
        return Optional.ofNullable(this.disablePasswordAuthentication);
    }
    /**
     * @return Specifies the mode of in-guest patching of this Windows Virtual Machine. Possible values are `ImageDefault` or `AutomaticByPlatform`. Defaults to `ImageDefault`. For more information on patch modes please see the [product documentation](https://docs.microsoft.com/azure/virtual-machines/automatic-vm-guest-patching#patch-orchestration-modes).
     * 
     */
    public Optional<String> patchMode() {
        return Optional.ofNullable(this.patchMode);
    }
    public Optional<Boolean> provisionVmAgent() {
        return Optional.ofNullable(this.provisionVmAgent);
    }
    public List<OrchestratedVirtualMachineScaleSetOsProfileLinuxConfigurationSecret> secrets() {
        return this.secrets == null ? List.of() : this.secrets;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OrchestratedVirtualMachineScaleSetOsProfileLinuxConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String adminPassword;
        private @Nullable List<OrchestratedVirtualMachineScaleSetOsProfileLinuxConfigurationAdminSshKey> adminSshKeys;
        private String adminUsername;
        private @Nullable String computerNamePrefix;
        private @Nullable Boolean disablePasswordAuthentication;
        private @Nullable String patchMode;
        private @Nullable Boolean provisionVmAgent;
        private @Nullable List<OrchestratedVirtualMachineScaleSetOsProfileLinuxConfigurationSecret> secrets;

        public Builder() {
    	      // Empty
        }

        public Builder(OrchestratedVirtualMachineScaleSetOsProfileLinuxConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.adminPassword = defaults.adminPassword;
    	      this.adminSshKeys = defaults.adminSshKeys;
    	      this.adminUsername = defaults.adminUsername;
    	      this.computerNamePrefix = defaults.computerNamePrefix;
    	      this.disablePasswordAuthentication = defaults.disablePasswordAuthentication;
    	      this.patchMode = defaults.patchMode;
    	      this.provisionVmAgent = defaults.provisionVmAgent;
    	      this.secrets = defaults.secrets;
        }

        public Builder adminPassword(@Nullable String adminPassword) {
            this.adminPassword = adminPassword;
            return this;
        }
        public Builder adminSshKeys(@Nullable List<OrchestratedVirtualMachineScaleSetOsProfileLinuxConfigurationAdminSshKey> adminSshKeys) {
            this.adminSshKeys = adminSshKeys;
            return this;
        }
        public Builder adminSshKeys(OrchestratedVirtualMachineScaleSetOsProfileLinuxConfigurationAdminSshKey... adminSshKeys) {
            return adminSshKeys(List.of(adminSshKeys));
        }
        public Builder adminUsername(String adminUsername) {
            this.adminUsername = Objects.requireNonNull(adminUsername);
            return this;
        }
        public Builder computerNamePrefix(@Nullable String computerNamePrefix) {
            this.computerNamePrefix = computerNamePrefix;
            return this;
        }
        public Builder disablePasswordAuthentication(@Nullable Boolean disablePasswordAuthentication) {
            this.disablePasswordAuthentication = disablePasswordAuthentication;
            return this;
        }
        public Builder patchMode(@Nullable String patchMode) {
            this.patchMode = patchMode;
            return this;
        }
        public Builder provisionVmAgent(@Nullable Boolean provisionVmAgent) {
            this.provisionVmAgent = provisionVmAgent;
            return this;
        }
        public Builder secrets(@Nullable List<OrchestratedVirtualMachineScaleSetOsProfileLinuxConfigurationSecret> secrets) {
            this.secrets = secrets;
            return this;
        }
        public Builder secrets(OrchestratedVirtualMachineScaleSetOsProfileLinuxConfigurationSecret... secrets) {
            return secrets(List.of(secrets));
        }        public OrchestratedVirtualMachineScaleSetOsProfileLinuxConfiguration build() {
            return new OrchestratedVirtualMachineScaleSetOsProfileLinuxConfiguration(adminPassword, adminSshKeys, adminUsername, computerNamePrefix, disablePasswordAuthentication, patchMode, provisionVmAgent, secrets);
        }
    }
}
