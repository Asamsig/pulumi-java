// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.storsimple.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetBackupPolicyArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetBackupPolicyArgs Empty = new GetBackupPolicyArgs();

    /**
     * The name of backup policy to be fetched.
     * 
     */
    @Import(name="backupPolicyName", required=true)
    private Output<String> backupPolicyName;

    /**
     * @return The name of backup policy to be fetched.
     * 
     */
    public Output<String> backupPolicyName() {
        return this.backupPolicyName;
    }

    /**
     * The device name
     * 
     */
    @Import(name="deviceName", required=true)
    private Output<String> deviceName;

    /**
     * @return The device name
     * 
     */
    public Output<String> deviceName() {
        return this.deviceName;
    }

    /**
     * The manager name
     * 
     */
    @Import(name="managerName", required=true)
    private Output<String> managerName;

    /**
     * @return The manager name
     * 
     */
    public Output<String> managerName() {
        return this.managerName;
    }

    /**
     * The resource group name
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The resource group name
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetBackupPolicyArgs() {}

    private GetBackupPolicyArgs(GetBackupPolicyArgs $) {
        this.backupPolicyName = $.backupPolicyName;
        this.deviceName = $.deviceName;
        this.managerName = $.managerName;
        this.resourceGroupName = $.resourceGroupName;
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

        /**
         * @param backupPolicyName The name of backup policy to be fetched.
         * 
         * @return builder
         * 
         */
        public Builder backupPolicyName(Output<String> backupPolicyName) {
            $.backupPolicyName = backupPolicyName;
            return this;
        }

        /**
         * @param backupPolicyName The name of backup policy to be fetched.
         * 
         * @return builder
         * 
         */
        public Builder backupPolicyName(String backupPolicyName) {
            return backupPolicyName(Output.of(backupPolicyName));
        }

        /**
         * @param deviceName The device name
         * 
         * @return builder
         * 
         */
        public Builder deviceName(Output<String> deviceName) {
            $.deviceName = deviceName;
            return this;
        }

        /**
         * @param deviceName The device name
         * 
         * @return builder
         * 
         */
        public Builder deviceName(String deviceName) {
            return deviceName(Output.of(deviceName));
        }

        /**
         * @param managerName The manager name
         * 
         * @return builder
         * 
         */
        public Builder managerName(Output<String> managerName) {
            $.managerName = managerName;
            return this;
        }

        /**
         * @param managerName The manager name
         * 
         * @return builder
         * 
         */
        public Builder managerName(String managerName) {
            return managerName(Output.of(managerName));
        }

        /**
         * @param resourceGroupName The resource group name
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The resource group name
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public GetBackupPolicyArgs build() {
            $.backupPolicyName = Objects.requireNonNull($.backupPolicyName, "expected parameter 'backupPolicyName' to be non-null");
            $.deviceName = Objects.requireNonNull($.deviceName, "expected parameter 'deviceName' to be non-null");
            $.managerName = Objects.requireNonNull($.managerName, "expected parameter 'managerName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
