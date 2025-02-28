// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.recoveryservices.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetProtectedItemPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetProtectedItemPlainArgs Empty = new GetProtectedItemPlainArgs();

    /**
     * Container name associated with the backed up item.
     * 
     */
    @Import(name="containerName", required=true)
    private String containerName;

    /**
     * @return Container name associated with the backed up item.
     * 
     */
    public String containerName() {
        return this.containerName;
    }

    /**
     * Fabric name associated with the backed up item.
     * 
     */
    @Import(name="fabricName", required=true)
    private String fabricName;

    /**
     * @return Fabric name associated with the backed up item.
     * 
     */
    public String fabricName() {
        return this.fabricName;
    }

    /**
     * OData filter options.
     * 
     */
    @Import(name="filter")
    private @Nullable String filter;

    /**
     * @return OData filter options.
     * 
     */
    public Optional<String> filter() {
        return Optional.ofNullable(this.filter);
    }

    /**
     * Backed up item name whose details are to be fetched.
     * 
     */
    @Import(name="protectedItemName", required=true)
    private String protectedItemName;

    /**
     * @return Backed up item name whose details are to be fetched.
     * 
     */
    public String protectedItemName() {
        return this.protectedItemName;
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

    private GetProtectedItemPlainArgs() {}

    private GetProtectedItemPlainArgs(GetProtectedItemPlainArgs $) {
        this.containerName = $.containerName;
        this.fabricName = $.fabricName;
        this.filter = $.filter;
        this.protectedItemName = $.protectedItemName;
        this.resourceGroupName = $.resourceGroupName;
        this.vaultName = $.vaultName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetProtectedItemPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetProtectedItemPlainArgs $;

        public Builder() {
            $ = new GetProtectedItemPlainArgs();
        }

        public Builder(GetProtectedItemPlainArgs defaults) {
            $ = new GetProtectedItemPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param containerName Container name associated with the backed up item.
         * 
         * @return builder
         * 
         */
        public Builder containerName(String containerName) {
            $.containerName = containerName;
            return this;
        }

        /**
         * @param fabricName Fabric name associated with the backed up item.
         * 
         * @return builder
         * 
         */
        public Builder fabricName(String fabricName) {
            $.fabricName = fabricName;
            return this;
        }

        /**
         * @param filter OData filter options.
         * 
         * @return builder
         * 
         */
        public Builder filter(@Nullable String filter) {
            $.filter = filter;
            return this;
        }

        /**
         * @param protectedItemName Backed up item name whose details are to be fetched.
         * 
         * @return builder
         * 
         */
        public Builder protectedItemName(String protectedItemName) {
            $.protectedItemName = protectedItemName;
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

        public GetProtectedItemPlainArgs build() {
            $.containerName = Objects.requireNonNull($.containerName, "expected parameter 'containerName' to be non-null");
            $.fabricName = Objects.requireNonNull($.fabricName, "expected parameter 'fabricName' to be non-null");
            $.protectedItemName = Objects.requireNonNull($.protectedItemName, "expected parameter 'protectedItemName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.vaultName = Objects.requireNonNull($.vaultName, "expected parameter 'vaultName' to be non-null");
            return $;
        }
    }

}
