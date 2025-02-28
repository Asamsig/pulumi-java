// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.automanage.outputs;

import com.pulumi.azurenative.automanage.outputs.ConfigurationProfilePreferenceAntiMalwareResponse;
import com.pulumi.azurenative.automanage.outputs.ConfigurationProfilePreferenceVmBackupResponse;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ConfigurationProfilePreferencePropertiesResponse {
    /**
     * @return The custom preferences for Azure Antimalware.
     * 
     */
    private final @Nullable ConfigurationProfilePreferenceAntiMalwareResponse antiMalware;
    /**
     * @return The custom preferences for Azure VM Backup.
     * 
     */
    private final @Nullable ConfigurationProfilePreferenceVmBackupResponse vmBackup;

    @CustomType.Constructor
    private ConfigurationProfilePreferencePropertiesResponse(
        @CustomType.Parameter("antiMalware") @Nullable ConfigurationProfilePreferenceAntiMalwareResponse antiMalware,
        @CustomType.Parameter("vmBackup") @Nullable ConfigurationProfilePreferenceVmBackupResponse vmBackup) {
        this.antiMalware = antiMalware;
        this.vmBackup = vmBackup;
    }

    /**
     * @return The custom preferences for Azure Antimalware.
     * 
     */
    public Optional<ConfigurationProfilePreferenceAntiMalwareResponse> antiMalware() {
        return Optional.ofNullable(this.antiMalware);
    }
    /**
     * @return The custom preferences for Azure VM Backup.
     * 
     */
    public Optional<ConfigurationProfilePreferenceVmBackupResponse> vmBackup() {
        return Optional.ofNullable(this.vmBackup);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConfigurationProfilePreferencePropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ConfigurationProfilePreferenceAntiMalwareResponse antiMalware;
        private @Nullable ConfigurationProfilePreferenceVmBackupResponse vmBackup;

        public Builder() {
    	      // Empty
        }

        public Builder(ConfigurationProfilePreferencePropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.antiMalware = defaults.antiMalware;
    	      this.vmBackup = defaults.vmBackup;
        }

        public Builder antiMalware(@Nullable ConfigurationProfilePreferenceAntiMalwareResponse antiMalware) {
            this.antiMalware = antiMalware;
            return this;
        }
        public Builder vmBackup(@Nullable ConfigurationProfilePreferenceVmBackupResponse vmBackup) {
            this.vmBackup = vmBackup;
            return this;
        }        public ConfigurationProfilePreferencePropertiesResponse build() {
            return new ConfigurationProfilePreferencePropertiesResponse(antiMalware, vmBackup);
        }
    }
}
