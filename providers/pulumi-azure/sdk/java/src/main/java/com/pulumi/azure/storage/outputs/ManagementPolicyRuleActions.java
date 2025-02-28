// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.storage.outputs;

import com.pulumi.azure.storage.outputs.ManagementPolicyRuleActionsBaseBlob;
import com.pulumi.azure.storage.outputs.ManagementPolicyRuleActionsSnapshot;
import com.pulumi.azure.storage.outputs.ManagementPolicyRuleActionsVersion;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ManagementPolicyRuleActions {
    /**
     * @return A `base_blob` block as documented below.
     * 
     */
    private final @Nullable ManagementPolicyRuleActionsBaseBlob baseBlob;
    /**
     * @return A `snapshot` block as documented below.
     * 
     */
    private final @Nullable ManagementPolicyRuleActionsSnapshot snapshot;
    /**
     * @return A `version` block as documented below.
     * 
     */
    private final @Nullable ManagementPolicyRuleActionsVersion version;

    @CustomType.Constructor
    private ManagementPolicyRuleActions(
        @CustomType.Parameter("baseBlob") @Nullable ManagementPolicyRuleActionsBaseBlob baseBlob,
        @CustomType.Parameter("snapshot") @Nullable ManagementPolicyRuleActionsSnapshot snapshot,
        @CustomType.Parameter("version") @Nullable ManagementPolicyRuleActionsVersion version) {
        this.baseBlob = baseBlob;
        this.snapshot = snapshot;
        this.version = version;
    }

    /**
     * @return A `base_blob` block as documented below.
     * 
     */
    public Optional<ManagementPolicyRuleActionsBaseBlob> baseBlob() {
        return Optional.ofNullable(this.baseBlob);
    }
    /**
     * @return A `snapshot` block as documented below.
     * 
     */
    public Optional<ManagementPolicyRuleActionsSnapshot> snapshot() {
        return Optional.ofNullable(this.snapshot);
    }
    /**
     * @return A `version` block as documented below.
     * 
     */
    public Optional<ManagementPolicyRuleActionsVersion> version() {
        return Optional.ofNullable(this.version);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagementPolicyRuleActions defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ManagementPolicyRuleActionsBaseBlob baseBlob;
        private @Nullable ManagementPolicyRuleActionsSnapshot snapshot;
        private @Nullable ManagementPolicyRuleActionsVersion version;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagementPolicyRuleActions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.baseBlob = defaults.baseBlob;
    	      this.snapshot = defaults.snapshot;
    	      this.version = defaults.version;
        }

        public Builder baseBlob(@Nullable ManagementPolicyRuleActionsBaseBlob baseBlob) {
            this.baseBlob = baseBlob;
            return this;
        }
        public Builder snapshot(@Nullable ManagementPolicyRuleActionsSnapshot snapshot) {
            this.snapshot = snapshot;
            return this;
        }
        public Builder version(@Nullable ManagementPolicyRuleActionsVersion version) {
            this.version = version;
            return this;
        }        public ManagementPolicyRuleActions build() {
            return new ManagementPolicyRuleActions(baseBlob, snapshot, version);
        }
    }
}
