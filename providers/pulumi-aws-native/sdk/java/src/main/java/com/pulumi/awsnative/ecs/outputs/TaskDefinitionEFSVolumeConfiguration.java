// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.ecs.outputs;

import com.pulumi.awsnative.ecs.enums.TaskDefinitionEFSVolumeConfigurationTransitEncryption;
import com.pulumi.awsnative.ecs.outputs.TaskDefinitionAuthorizationConfig;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class TaskDefinitionEFSVolumeConfiguration {
    private final @Nullable TaskDefinitionAuthorizationConfig authorizationConfig;
    private final String filesystemId;
    private final @Nullable String rootDirectory;
    private final @Nullable TaskDefinitionEFSVolumeConfigurationTransitEncryption transitEncryption;
    private final @Nullable Integer transitEncryptionPort;

    @CustomType.Constructor
    private TaskDefinitionEFSVolumeConfiguration(
        @CustomType.Parameter("authorizationConfig") @Nullable TaskDefinitionAuthorizationConfig authorizationConfig,
        @CustomType.Parameter("filesystemId") String filesystemId,
        @CustomType.Parameter("rootDirectory") @Nullable String rootDirectory,
        @CustomType.Parameter("transitEncryption") @Nullable TaskDefinitionEFSVolumeConfigurationTransitEncryption transitEncryption,
        @CustomType.Parameter("transitEncryptionPort") @Nullable Integer transitEncryptionPort) {
        this.authorizationConfig = authorizationConfig;
        this.filesystemId = filesystemId;
        this.rootDirectory = rootDirectory;
        this.transitEncryption = transitEncryption;
        this.transitEncryptionPort = transitEncryptionPort;
    }

    public Optional<TaskDefinitionAuthorizationConfig> authorizationConfig() {
        return Optional.ofNullable(this.authorizationConfig);
    }
    public String filesystemId() {
        return this.filesystemId;
    }
    public Optional<String> rootDirectory() {
        return Optional.ofNullable(this.rootDirectory);
    }
    public Optional<TaskDefinitionEFSVolumeConfigurationTransitEncryption> transitEncryption() {
        return Optional.ofNullable(this.transitEncryption);
    }
    public Optional<Integer> transitEncryptionPort() {
        return Optional.ofNullable(this.transitEncryptionPort);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TaskDefinitionEFSVolumeConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable TaskDefinitionAuthorizationConfig authorizationConfig;
        private String filesystemId;
        private @Nullable String rootDirectory;
        private @Nullable TaskDefinitionEFSVolumeConfigurationTransitEncryption transitEncryption;
        private @Nullable Integer transitEncryptionPort;

        public Builder() {
    	      // Empty
        }

        public Builder(TaskDefinitionEFSVolumeConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authorizationConfig = defaults.authorizationConfig;
    	      this.filesystemId = defaults.filesystemId;
    	      this.rootDirectory = defaults.rootDirectory;
    	      this.transitEncryption = defaults.transitEncryption;
    	      this.transitEncryptionPort = defaults.transitEncryptionPort;
        }

        public Builder authorizationConfig(@Nullable TaskDefinitionAuthorizationConfig authorizationConfig) {
            this.authorizationConfig = authorizationConfig;
            return this;
        }
        public Builder filesystemId(String filesystemId) {
            this.filesystemId = Objects.requireNonNull(filesystemId);
            return this;
        }
        public Builder rootDirectory(@Nullable String rootDirectory) {
            this.rootDirectory = rootDirectory;
            return this;
        }
        public Builder transitEncryption(@Nullable TaskDefinitionEFSVolumeConfigurationTransitEncryption transitEncryption) {
            this.transitEncryption = transitEncryption;
            return this;
        }
        public Builder transitEncryptionPort(@Nullable Integer transitEncryptionPort) {
            this.transitEncryptionPort = transitEncryptionPort;
            return this;
        }        public TaskDefinitionEFSVolumeConfiguration build() {
            return new TaskDefinitionEFSVolumeConfiguration(authorizationConfig, filesystemId, rootDirectory, transitEncryption, transitEncryptionPort);
        }
    }
}
