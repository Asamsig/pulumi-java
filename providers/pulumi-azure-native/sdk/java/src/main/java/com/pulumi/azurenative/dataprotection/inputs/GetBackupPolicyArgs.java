// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.dataprotection.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetBackupPolicyArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetBackupPolicyArgs Empty = new GetBackupPolicyArgs();

    @Import(name="backupPolicyName", required=true)
    private Output<String> backupPolicyName;

    public Output<String> backupPolicyName() {
        return this.backupPolicyName;
    }

    /**
     * The name of the resource group where the backup vault is present.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group where the backup vault is present.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the backup vault.
     * 
     */
    @Import(name="vaultName", required=true)
    private Output<String> vaultName;

    /**
     * @return The name of the backup vault.
     * 
     */
    public Output<String> vaultName() {
        return this.vaultName;
    }

    private GetBackupPolicyArgs() {}

    private GetBackupPolicyArgs(GetBackupPolicyArgs $) {
        this.backupPolicyName = $.backupPolicyName;
        this.resourceGroupName = $.resourceGroupName;
        this.vaultName = $.vaultName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetBackupPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetBackupPolicyArgs $;

        public Builder() {
            $ = new GetBackupPolicyArgs();
        }

        public Builder(GetBackupPolicyArgs defaults) {
            $ = new GetBackupPolicyArgs(Objects.requireNonNull(defaults));
        }

        public Builder backupPolicyName(Output<String> backupPolicyName) {
            $.backupPolicyName = backupPolicyName;
            return this;
        }

        public Builder backupPolicyName(String backupPolicyName) {
            return backupPolicyName(Output.of(backupPolicyName));
        }

        /**
         * @param resourceGroupName The name of the resource group where the backup vault is present.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group where the backup vault is present.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param vaultName The name of the backup vault.
         * 
         * @return builder
         * 
         */
        public Builder vaultName(Output<String> vaultName) {
            $.vaultName = vaultName;
            return this;
        }

        /**
         * @param vaultName The name of the backup vault.
         * 
         * @return builder
         * 
         */
        public Builder vaultName(String vaultName) {
            return vaultName(Output.of(vaultName));
        }

        public GetBackupPolicyArgs build() {
            $.backupPolicyName = Objects.requireNonNull($.backupPolicyName, "expected parameter 'backupPolicyName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.vaultName = Objects.requireNonNull($.vaultName, "expected parameter 'vaultName' to be non-null");
            return $;
        }
    }

}
