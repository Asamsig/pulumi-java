// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.purview;

import com.pulumi.azurenative.purview.inputs.PrivateEndpointArgs;
import com.pulumi.azurenative.purview.inputs.PrivateLinkServiceConnectionStateArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PrivateEndpointConnectionArgs extends com.pulumi.resources.ResourceArgs {

    public static final PrivateEndpointConnectionArgs Empty = new PrivateEndpointConnectionArgs();

    /**
     * The name of the account.
     * 
     */
    @Import(name="accountName", required=true)
    private Output<String> accountName;

    /**
     * @return The name of the account.
     * 
     */
    public Output<String> accountName() {
        return this.accountName;
    }

    /**
     * The private endpoint information.
     * 
     */
    @Import(name="privateEndpoint")
    private @Nullable Output<PrivateEndpointArgs> privateEndpoint;

    /**
     * @return The private endpoint information.
     * 
     */
    public Optional<Output<PrivateEndpointArgs>> privateEndpoint() {
        return Optional.ofNullable(this.privateEndpoint);
    }

    /**
     * Name of the private endpoint connection.
     * 
     */
    @Import(name="privateEndpointConnectionName")
    private @Nullable Output<String> privateEndpointConnectionName;

    /**
     * @return Name of the private endpoint connection.
     * 
     */
    public Optional<Output<String>> privateEndpointConnectionName() {
        return Optional.ofNullable(this.privateEndpointConnectionName);
    }

    /**
     * The private link service connection state.
     * 
     */
    @Import(name="privateLinkServiceConnectionState")
    private @Nullable Output<PrivateLinkServiceConnectionStateArgs> privateLinkServiceConnectionState;

    /**
     * @return The private link service connection state.
     * 
     */
    public Optional<Output<PrivateLinkServiceConnectionStateArgs>> privateLinkServiceConnectionState() {
        return Optional.ofNullable(this.privateLinkServiceConnectionState);
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

    private PrivateEndpointConnectionArgs() {}

    private PrivateEndpointConnectionArgs(PrivateEndpointConnectionArgs $) {
        this.accountName = $.accountName;
        this.privateEndpoint = $.privateEndpoint;
        this.privateEndpointConnectionName = $.privateEndpointConnectionName;
        this.privateLinkServiceConnectionState = $.privateLinkServiceConnectionState;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PrivateEndpointConnectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PrivateEndpointConnectionArgs $;

        public Builder() {
            $ = new PrivateEndpointConnectionArgs();
        }

        public Builder(PrivateEndpointConnectionArgs defaults) {
            $ = new PrivateEndpointConnectionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountName The name of the account.
         * 
         * @return builder
         * 
         */
        public Builder accountName(Output<String> accountName) {
            $.accountName = accountName;
            return this;
        }

        /**
         * @param accountName The name of the account.
         * 
         * @return builder
         * 
         */
        public Builder accountName(String accountName) {
            return accountName(Output.of(accountName));
        }

        /**
         * @param privateEndpoint The private endpoint information.
         * 
         * @return builder
         * 
         */
        public Builder privateEndpoint(@Nullable Output<PrivateEndpointArgs> privateEndpoint) {
            $.privateEndpoint = privateEndpoint;
            return this;
        }

        /**
         * @param privateEndpoint The private endpoint information.
         * 
         * @return builder
         * 
         */
        public Builder privateEndpoint(PrivateEndpointArgs privateEndpoint) {
            return privateEndpoint(Output.of(privateEndpoint));
        }

        /**
         * @param privateEndpointConnectionName Name of the private endpoint connection.
         * 
         * @return builder
         * 
         */
        public Builder privateEndpointConnectionName(@Nullable Output<String> privateEndpointConnectionName) {
            $.privateEndpointConnectionName = privateEndpointConnectionName;
            return this;
        }

        /**
         * @param privateEndpointConnectionName Name of the private endpoint connection.
         * 
         * @return builder
         * 
         */
        public Builder privateEndpointConnectionName(String privateEndpointConnectionName) {
            return privateEndpointConnectionName(Output.of(privateEndpointConnectionName));
        }

        /**
         * @param privateLinkServiceConnectionState The private link service connection state.
         * 
         * @return builder
         * 
         */
        public Builder privateLinkServiceConnectionState(@Nullable Output<PrivateLinkServiceConnectionStateArgs> privateLinkServiceConnectionState) {
            $.privateLinkServiceConnectionState = privateLinkServiceConnectionState;
            return this;
        }

        /**
         * @param privateLinkServiceConnectionState The private link service connection state.
         * 
         * @return builder
         * 
         */
        public Builder privateLinkServiceConnectionState(PrivateLinkServiceConnectionStateArgs privateLinkServiceConnectionState) {
            return privateLinkServiceConnectionState(Output.of(privateLinkServiceConnectionState));
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

        public PrivateEndpointConnectionArgs build() {
            $.accountName = Objects.requireNonNull($.accountName, "expected parameter 'accountName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
