// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.backup.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class BackupPlanAdvancedBackupSettingResourceType {
    private final Object backupOptions;
    private final String resourceType;

    @CustomType.Constructor
    private BackupPlanAdvancedBackupSettingResourceType(
        @CustomType.Parameter("backupOptions") Object backupOptions,
        @CustomType.Parameter("resourceType") String resourceType) {
        this.backupOptions = backupOptions;
        this.resourceType = resourceType;
    }

    public Object backupOptions() {
        return this.backupOptions;
    }
    public String resourceType() {
        return this.resourceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackupPlanAdvancedBackupSettingResourceType defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Object backupOptions;
        private String resourceType;

        public Builder() {
    	      // Empty
        }

        public Builder(BackupPlanAdvancedBackupSettingResourceType defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backupOptions = defaults.backupOptions;
    	      this.resourceType = defaults.resourceType;
        }

        public Builder backupOptions(Object backupOptions) {
            this.backupOptions = Objects.requireNonNull(backupOptions);
            return this;
        }
        public Builder resourceType(String resourceType) {
            this.resourceType = Objects.requireNonNull(resourceType);
            return this;
        }        public BackupPlanAdvancedBackupSettingResourceType build() {
            return new BackupPlanAdvancedBackupSettingResourceType(backupOptions, resourceType);
        }
    }
}
