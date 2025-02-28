// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetSshPublicKeyPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSshPublicKeyPlainArgs Empty = new GetSshPublicKeyPlainArgs();

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the resource group.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the SSH public key.
     * 
     */
    @Import(name="sshPublicKeyName", required=true)
    private String sshPublicKeyName;

    /**
     * @return The name of the SSH public key.
     * 
     */
    public String sshPublicKeyName() {
        return this.sshPublicKeyName;
    }

    private GetSshPublicKeyPlainArgs() {}

    private GetSshPublicKeyPlainArgs(GetSshPublicKeyPlainArgs $) {
        this.resourceGroupName = $.resourceGroupName;
        this.sshPublicKeyName = $.sshPublicKeyName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSshPublicKeyPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSshPublicKeyPlainArgs $;

        public Builder() {
            $ = new GetSshPublicKeyPlainArgs();
        }

        public Builder(GetSshPublicKeyPlainArgs defaults) {
            $ = new GetSshPublicKeyPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param sshPublicKeyName The name of the SSH public key.
         * 
         * @return builder
         * 
         */
        public Builder sshPublicKeyName(String sshPublicKeyName) {
            $.sshPublicKeyName = sshPublicKeyName;
            return this;
        }

        public GetSshPublicKeyPlainArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.sshPublicKeyName = Objects.requireNonNull($.sshPublicKeyName, "expected parameter 'sshPublicKeyName' to be non-null");
            return $;
        }
    }

}
