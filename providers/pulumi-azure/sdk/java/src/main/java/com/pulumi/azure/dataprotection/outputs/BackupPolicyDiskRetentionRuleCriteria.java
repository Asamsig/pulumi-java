// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.dataprotection.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class BackupPolicyDiskRetentionRuleCriteria {
    /**
     * @return Possible values are `FirstOfDay` and `FirstOfWeek`. Changing this forces a new Backup Policy Disk to be created.
     * 
     */
    private final @Nullable String absoluteCriteria;

    @CustomType.Constructor
    private BackupPolicyDiskRetentionRuleCriteria(@CustomType.Parameter("absoluteCriteria") @Nullable String absoluteCriteria) {
        this.absoluteCriteria = absoluteCriteria;
    }

    /**
     * @return Possible values are `FirstOfDay` and `FirstOfWeek`. Changing this forces a new Backup Policy Disk to be created.
     * 
     */
    public Optional<String> absoluteCriteria() {
        return Optional.ofNullable(this.absoluteCriteria);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackupPolicyDiskRetentionRuleCriteria defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String absoluteCriteria;

        public Builder() {
    	      // Empty
        }

        public Builder(BackupPolicyDiskRetentionRuleCriteria defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.absoluteCriteria = defaults.absoluteCriteria;
        }

        public Builder absoluteCriteria(@Nullable String absoluteCriteria) {
            this.absoluteCriteria = absoluteCriteria;
            return this;
        }        public BackupPolicyDiskRetentionRuleCriteria build() {
            return new BackupPolicyDiskRetentionRuleCriteria(absoluteCriteria);
        }
    }
}
