// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataproc.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WorkflowTemplatePlacementManagedClusterConfigEncryptionConfig {
    /**
     * @return Optional. The Cloud KMS key name to use for PD disk encryption for all instances in the cluster.
     * 
     */
    private final @Nullable String gcePdKmsKeyName;

    @CustomType.Constructor
    private WorkflowTemplatePlacementManagedClusterConfigEncryptionConfig(@CustomType.Parameter("gcePdKmsKeyName") @Nullable String gcePdKmsKeyName) {
        this.gcePdKmsKeyName = gcePdKmsKeyName;
    }

    /**
     * @return Optional. The Cloud KMS key name to use for PD disk encryption for all instances in the cluster.
     * 
     */
    public Optional<String> gcePdKmsKeyName() {
        return Optional.ofNullable(this.gcePdKmsKeyName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkflowTemplatePlacementManagedClusterConfigEncryptionConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String gcePdKmsKeyName;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkflowTemplatePlacementManagedClusterConfigEncryptionConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.gcePdKmsKeyName = defaults.gcePdKmsKeyName;
        }

        public Builder gcePdKmsKeyName(@Nullable String gcePdKmsKeyName) {
            this.gcePdKmsKeyName = gcePdKmsKeyName;
            return this;
        }        public WorkflowTemplatePlacementManagedClusterConfigEncryptionConfig build() {
            return new WorkflowTemplatePlacementManagedClusterConfigEncryptionConfig(gcePdKmsKeyName);
        }
    }
}
