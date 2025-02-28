// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.recoveryservices.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetProtectionContainerPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetProtectionContainerPlainArgs Empty = new GetProtectionContainerPlainArgs();

    /**
     * Name of the container whose details need to be fetched.
     * 
     */
    @Import(name="containerName", required=true)
    private String containerName;

    /**
     * @return Name of the container whose details need to be fetched.
     * 
     */
    public String containerName() {
        return this.containerName;
    }

    /**
     * Name of the fabric where the container belongs.
     * 
     */
    @Import(name="fabricName", required=true)
    private String fabricName;

    /**
     * @return Name of the fabric where the container belongs.
     * 
     */
    public String fabricName() {
        return this.fabricName;
    }

    /**
     * The name of the resource group where the recovery services vault is present.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the resource group where the recovery services vault is present.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the recovery services vault.
     * 
     */
    @Import(name="vaultName", required=true)
    private String vaultName;

    /**
     * @return The name of the recovery services vault.
     * 
     */
    public String vaultName() {
        return this.vaultName;
    }

    private GetProtectionContainerPlainArgs() {}

    private GetProtectionContainerPlainArgs(GetProtectionContainerPlainArgs $) {
        this.containerName = $.containerName;
        this.fabricName = $.fabricName;
        this.resourceGroupName = $.resourceGroupName;
        this.vaultName = $.vaultName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetProtectionContainerPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetProtectionContainerPlainArgs $;

        public Builder() {
            $ = new GetProtectionContainerPlainArgs();
        }

        public Builder(GetProtectionContainerPlainArgs defaults) {
            $ = new GetProtectionContainerPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param containerName Name of the container whose details need to be fetched.
         * 
         * @return builder
         * 
         */
        public Builder containerName(String containerName) {
            $.containerName = containerName;
            return this;
        }

        /**
         * @param fabricName Name of the fabric where the container belongs.
         * 
         * @return builder
         * 
         */
        public Builder fabricName(String fabricName) {
            $.fabricName = fabricName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group where the recovery services vault is present.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param vaultName The name of the recovery services vault.
         * 
         * @return builder
         * 
         */
        public Builder vaultName(String vaultName) {
            $.vaultName = vaultName;
            return this;
        }

        public GetProtectionContainerPlainArgs build() {
            $.containerName = Objects.requireNonNull($.containerName, "expected parameter 'containerName' to be non-null");
            $.fabricName = Objects.requireNonNull($.fabricName, "expected parameter 'fabricName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.vaultName = Objects.requireNonNull($.vaultName, "expected parameter 'vaultName' to be non-null");
            return $;
        }
    }

}
