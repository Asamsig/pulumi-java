// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.databoxedge;

import com.pulumi.azurenative.databoxedge.enums.RoleStatus;
import com.pulumi.azurenative.databoxedge.inputs.AsymmetricEncryptedSecretArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MECRoleArgs extends com.pulumi.resources.ResourceArgs {

    public static final MECRoleArgs Empty = new MECRoleArgs();

    /**
     * Activation key of the MEC.
     * 
     */
    @Import(name="connectionString")
    private @Nullable Output<AsymmetricEncryptedSecretArgs> connectionString;

    /**
     * @return Activation key of the MEC.
     * 
     */
    public Optional<Output<AsymmetricEncryptedSecretArgs>> connectionString() {
        return Optional.ofNullable(this.connectionString);
    }

    /**
     * The device name.
     * 
     */
    @Import(name="deviceName", required=true)
    private Output<String> deviceName;

    /**
     * @return The device name.
     * 
     */
    public Output<String> deviceName() {
        return this.deviceName;
    }

    /**
     * Role type.
     * Expected value is &#39;MEC&#39;.
     * 
     */
    @Import(name="kind", required=true)
    private Output<String> kind;

    /**
     * @return Role type.
     * Expected value is &#39;MEC&#39;.
     * 
     */
    public Output<String> kind() {
        return this.kind;
    }

    /**
     * The role name.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The role name.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The resource group name.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The resource group name.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Role status.
     * 
     */
    @Import(name="roleStatus", required=true)
    private Output<Either<String,RoleStatus>> roleStatus;

    /**
     * @return Role status.
     * 
     */
    public Output<Either<String,RoleStatus>> roleStatus() {
        return this.roleStatus;
    }

    private MECRoleArgs() {}

    private MECRoleArgs(MECRoleArgs $) {
        this.connectionString = $.connectionString;
        this.deviceName = $.deviceName;
        this.kind = $.kind;
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
        this.roleStatus = $.roleStatus;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MECRoleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MECRoleArgs $;

        public Builder() {
            $ = new MECRoleArgs();
        }

        public Builder(MECRoleArgs defaults) {
            $ = new MECRoleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param connectionString Activation key of the MEC.
         * 
         * @return builder
         * 
         */
        public Builder connectionString(@Nullable Output<AsymmetricEncryptedSecretArgs> connectionString) {
            $.connectionString = connectionString;
            return this;
        }

        /**
         * @param connectionString Activation key of the MEC.
         * 
         * @return builder
         * 
         */
        public Builder connectionString(AsymmetricEncryptedSecretArgs connectionString) {
            return connectionString(Output.of(connectionString));
        }

        /**
         * @param deviceName The device name.
         * 
         * @return builder
         * 
         */
        public Builder deviceName(Output<String> deviceName) {
            $.deviceName = deviceName;
            return this;
        }

        /**
         * @param deviceName The device name.
         * 
         * @return builder
         * 
         */
        public Builder deviceName(String deviceName) {
            return deviceName(Output.of(deviceName));
        }

        /**
         * @param kind Role type.
         * Expected value is &#39;MEC&#39;.
         * 
         * @return builder
         * 
         */
        public Builder kind(Output<String> kind) {
            $.kind = kind;
            return this;
        }

        /**
         * @param kind Role type.
         * Expected value is &#39;MEC&#39;.
         * 
         * @return builder
         * 
         */
        public Builder kind(String kind) {
            return kind(Output.of(kind));
        }

        /**
         * @param name The role name.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The role name.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param resourceGroupName The resource group name.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The resource group name.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param roleStatus Role status.
         * 
         * @return builder
         * 
         */
        public Builder roleStatus(Output<Either<String,RoleStatus>> roleStatus) {
            $.roleStatus = roleStatus;
            return this;
        }

        /**
         * @param roleStatus Role status.
         * 
         * @return builder
         * 
         */
        public Builder roleStatus(Either<String,RoleStatus> roleStatus) {
            return roleStatus(Output.of(roleStatus));
        }

        /**
         * @param roleStatus Role status.
         * 
         * @return builder
         * 
         */
        public Builder roleStatus(String roleStatus) {
            return roleStatus(Either.ofLeft(roleStatus));
        }

        /**
         * @param roleStatus Role status.
         * 
         * @return builder
         * 
         */
        public Builder roleStatus(RoleStatus roleStatus) {
            return roleStatus(Either.ofRight(roleStatus));
        }

        public MECRoleArgs build() {
            $.deviceName = Objects.requireNonNull($.deviceName, "expected parameter 'deviceName' to be non-null");
            $.kind = Codegen.stringProp("kind").output().arg($.kind).require();
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.roleStatus = Objects.requireNonNull($.roleStatus, "expected parameter 'roleStatus' to be non-null");
            return $;
        }
    }

}
