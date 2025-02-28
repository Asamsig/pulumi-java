// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.composer.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.composer.outputs.EnvironmentConfigDatabaseConfig;
import com.pulumi.gcp.composer.outputs.EnvironmentConfigEncryptionConfig;
import com.pulumi.gcp.composer.outputs.EnvironmentConfigMaintenanceWindow;
import com.pulumi.gcp.composer.outputs.EnvironmentConfigMasterAuthorizedNetworksConfig;
import com.pulumi.gcp.composer.outputs.EnvironmentConfigNodeConfig;
import com.pulumi.gcp.composer.outputs.EnvironmentConfigPrivateEnvironmentConfig;
import com.pulumi.gcp.composer.outputs.EnvironmentConfigSoftwareConfig;
import com.pulumi.gcp.composer.outputs.EnvironmentConfigWebServerConfig;
import com.pulumi.gcp.composer.outputs.EnvironmentConfigWebServerNetworkAccessControl;
import com.pulumi.gcp.composer.outputs.EnvironmentConfigWorkloadsConfig;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class EnvironmentConfig {
    private final @Nullable String airflowUri;
    private final @Nullable String dagGcsPrefix;
    private final @Nullable EnvironmentConfigDatabaseConfig databaseConfig;
    private final @Nullable EnvironmentConfigEncryptionConfig encryptionConfig;
    private final @Nullable String environmentSize;
    private final @Nullable String gkeCluster;
    private final @Nullable EnvironmentConfigMaintenanceWindow maintenanceWindow;
    private final @Nullable EnvironmentConfigMasterAuthorizedNetworksConfig masterAuthorizedNetworksConfig;
    private final @Nullable EnvironmentConfigNodeConfig nodeConfig;
    private final @Nullable Integer nodeCount;
    private final @Nullable EnvironmentConfigPrivateEnvironmentConfig privateEnvironmentConfig;
    private final @Nullable EnvironmentConfigSoftwareConfig softwareConfig;
    private final @Nullable EnvironmentConfigWebServerConfig webServerConfig;
    private final @Nullable EnvironmentConfigWebServerNetworkAccessControl webServerNetworkAccessControl;
    private final @Nullable EnvironmentConfigWorkloadsConfig workloadsConfig;

    @CustomType.Constructor
    private EnvironmentConfig(
        @CustomType.Parameter("airflowUri") @Nullable String airflowUri,
        @CustomType.Parameter("dagGcsPrefix") @Nullable String dagGcsPrefix,
        @CustomType.Parameter("databaseConfig") @Nullable EnvironmentConfigDatabaseConfig databaseConfig,
        @CustomType.Parameter("encryptionConfig") @Nullable EnvironmentConfigEncryptionConfig encryptionConfig,
        @CustomType.Parameter("environmentSize") @Nullable String environmentSize,
        @CustomType.Parameter("gkeCluster") @Nullable String gkeCluster,
        @CustomType.Parameter("maintenanceWindow") @Nullable EnvironmentConfigMaintenanceWindow maintenanceWindow,
        @CustomType.Parameter("masterAuthorizedNetworksConfig") @Nullable EnvironmentConfigMasterAuthorizedNetworksConfig masterAuthorizedNetworksConfig,
        @CustomType.Parameter("nodeConfig") @Nullable EnvironmentConfigNodeConfig nodeConfig,
        @CustomType.Parameter("nodeCount") @Nullable Integer nodeCount,
        @CustomType.Parameter("privateEnvironmentConfig") @Nullable EnvironmentConfigPrivateEnvironmentConfig privateEnvironmentConfig,
        @CustomType.Parameter("softwareConfig") @Nullable EnvironmentConfigSoftwareConfig softwareConfig,
        @CustomType.Parameter("webServerConfig") @Nullable EnvironmentConfigWebServerConfig webServerConfig,
        @CustomType.Parameter("webServerNetworkAccessControl") @Nullable EnvironmentConfigWebServerNetworkAccessControl webServerNetworkAccessControl,
        @CustomType.Parameter("workloadsConfig") @Nullable EnvironmentConfigWorkloadsConfig workloadsConfig) {
        this.airflowUri = airflowUri;
        this.dagGcsPrefix = dagGcsPrefix;
        this.databaseConfig = databaseConfig;
        this.encryptionConfig = encryptionConfig;
        this.environmentSize = environmentSize;
        this.gkeCluster = gkeCluster;
        this.maintenanceWindow = maintenanceWindow;
        this.masterAuthorizedNetworksConfig = masterAuthorizedNetworksConfig;
        this.nodeConfig = nodeConfig;
        this.nodeCount = nodeCount;
        this.privateEnvironmentConfig = privateEnvironmentConfig;
        this.softwareConfig = softwareConfig;
        this.webServerConfig = webServerConfig;
        this.webServerNetworkAccessControl = webServerNetworkAccessControl;
        this.workloadsConfig = workloadsConfig;
    }

    public Optional<String> airflowUri() {
        return Optional.ofNullable(this.airflowUri);
    }
    public Optional<String> dagGcsPrefix() {
        return Optional.ofNullable(this.dagGcsPrefix);
    }
    public Optional<EnvironmentConfigDatabaseConfig> databaseConfig() {
        return Optional.ofNullable(this.databaseConfig);
    }
    public Optional<EnvironmentConfigEncryptionConfig> encryptionConfig() {
        return Optional.ofNullable(this.encryptionConfig);
    }
    public Optional<String> environmentSize() {
        return Optional.ofNullable(this.environmentSize);
    }
    public Optional<String> gkeCluster() {
        return Optional.ofNullable(this.gkeCluster);
    }
    public Optional<EnvironmentConfigMaintenanceWindow> maintenanceWindow() {
        return Optional.ofNullable(this.maintenanceWindow);
    }
    public Optional<EnvironmentConfigMasterAuthorizedNetworksConfig> masterAuthorizedNetworksConfig() {
        return Optional.ofNullable(this.masterAuthorizedNetworksConfig);
    }
    public Optional<EnvironmentConfigNodeConfig> nodeConfig() {
        return Optional.ofNullable(this.nodeConfig);
    }
    public Optional<Integer> nodeCount() {
        return Optional.ofNullable(this.nodeCount);
    }
    public Optional<EnvironmentConfigPrivateEnvironmentConfig> privateEnvironmentConfig() {
        return Optional.ofNullable(this.privateEnvironmentConfig);
    }
    public Optional<EnvironmentConfigSoftwareConfig> softwareConfig() {
        return Optional.ofNullable(this.softwareConfig);
    }
    public Optional<EnvironmentConfigWebServerConfig> webServerConfig() {
        return Optional.ofNullable(this.webServerConfig);
    }
    public Optional<EnvironmentConfigWebServerNetworkAccessControl> webServerNetworkAccessControl() {
        return Optional.ofNullable(this.webServerNetworkAccessControl);
    }
    public Optional<EnvironmentConfigWorkloadsConfig> workloadsConfig() {
        return Optional.ofNullable(this.workloadsConfig);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnvironmentConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String airflowUri;
        private @Nullable String dagGcsPrefix;
        private @Nullable EnvironmentConfigDatabaseConfig databaseConfig;
        private @Nullable EnvironmentConfigEncryptionConfig encryptionConfig;
        private @Nullable String environmentSize;
        private @Nullable String gkeCluster;
        private @Nullable EnvironmentConfigMaintenanceWindow maintenanceWindow;
        private @Nullable EnvironmentConfigMasterAuthorizedNetworksConfig masterAuthorizedNetworksConfig;
        private @Nullable EnvironmentConfigNodeConfig nodeConfig;
        private @Nullable Integer nodeCount;
        private @Nullable EnvironmentConfigPrivateEnvironmentConfig privateEnvironmentConfig;
        private @Nullable EnvironmentConfigSoftwareConfig softwareConfig;
        private @Nullable EnvironmentConfigWebServerConfig webServerConfig;
        private @Nullable EnvironmentConfigWebServerNetworkAccessControl webServerNetworkAccessControl;
        private @Nullable EnvironmentConfigWorkloadsConfig workloadsConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(EnvironmentConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.airflowUri = defaults.airflowUri;
    	      this.dagGcsPrefix = defaults.dagGcsPrefix;
    	      this.databaseConfig = defaults.databaseConfig;
    	      this.encryptionConfig = defaults.encryptionConfig;
    	      this.environmentSize = defaults.environmentSize;
    	      this.gkeCluster = defaults.gkeCluster;
    	      this.maintenanceWindow = defaults.maintenanceWindow;
    	      this.masterAuthorizedNetworksConfig = defaults.masterAuthorizedNetworksConfig;
    	      this.nodeConfig = defaults.nodeConfig;
    	      this.nodeCount = defaults.nodeCount;
    	      this.privateEnvironmentConfig = defaults.privateEnvironmentConfig;
    	      this.softwareConfig = defaults.softwareConfig;
    	      this.webServerConfig = defaults.webServerConfig;
    	      this.webServerNetworkAccessControl = defaults.webServerNetworkAccessControl;
    	      this.workloadsConfig = defaults.workloadsConfig;
        }

        public Builder airflowUri(@Nullable String airflowUri) {
            this.airflowUri = airflowUri;
            return this;
        }
        public Builder dagGcsPrefix(@Nullable String dagGcsPrefix) {
            this.dagGcsPrefix = dagGcsPrefix;
            return this;
        }
        public Builder databaseConfig(@Nullable EnvironmentConfigDatabaseConfig databaseConfig) {
            this.databaseConfig = databaseConfig;
            return this;
        }
        public Builder encryptionConfig(@Nullable EnvironmentConfigEncryptionConfig encryptionConfig) {
            this.encryptionConfig = encryptionConfig;
            return this;
        }
        public Builder environmentSize(@Nullable String environmentSize) {
            this.environmentSize = environmentSize;
            return this;
        }
        public Builder gkeCluster(@Nullable String gkeCluster) {
            this.gkeCluster = gkeCluster;
            return this;
        }
        public Builder maintenanceWindow(@Nullable EnvironmentConfigMaintenanceWindow maintenanceWindow) {
            this.maintenanceWindow = maintenanceWindow;
            return this;
        }
        public Builder masterAuthorizedNetworksConfig(@Nullable EnvironmentConfigMasterAuthorizedNetworksConfig masterAuthorizedNetworksConfig) {
            this.masterAuthorizedNetworksConfig = masterAuthorizedNetworksConfig;
            return this;
        }
        public Builder nodeConfig(@Nullable EnvironmentConfigNodeConfig nodeConfig) {
            this.nodeConfig = nodeConfig;
            return this;
        }
        public Builder nodeCount(@Nullable Integer nodeCount) {
            this.nodeCount = nodeCount;
            return this;
        }
        public Builder privateEnvironmentConfig(@Nullable EnvironmentConfigPrivateEnvironmentConfig privateEnvironmentConfig) {
            this.privateEnvironmentConfig = privateEnvironmentConfig;
            return this;
        }
        public Builder softwareConfig(@Nullable EnvironmentConfigSoftwareConfig softwareConfig) {
            this.softwareConfig = softwareConfig;
            return this;
        }
        public Builder webServerConfig(@Nullable EnvironmentConfigWebServerConfig webServerConfig) {
            this.webServerConfig = webServerConfig;
            return this;
        }
        public Builder webServerNetworkAccessControl(@Nullable EnvironmentConfigWebServerNetworkAccessControl webServerNetworkAccessControl) {
            this.webServerNetworkAccessControl = webServerNetworkAccessControl;
            return this;
        }
        public Builder workloadsConfig(@Nullable EnvironmentConfigWorkloadsConfig workloadsConfig) {
            this.workloadsConfig = workloadsConfig;
            return this;
        }        public EnvironmentConfig build() {
            return new EnvironmentConfig(airflowUri, dagGcsPrefix, databaseConfig, encryptionConfig, environmentSize, gkeCluster, maintenanceWindow, masterAuthorizedNetworksConfig, nodeConfig, nodeCount, privateEnvironmentConfig, softwareConfig, webServerConfig, webServerNetworkAccessControl, workloadsConfig);
        }
    }
}
