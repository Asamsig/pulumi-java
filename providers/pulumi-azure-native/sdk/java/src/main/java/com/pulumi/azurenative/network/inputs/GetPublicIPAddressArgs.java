// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPublicIPAddressArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetPublicIPAddressArgs Empty = new GetPublicIPAddressArgs();

    /**
     * Expands referenced resources.
     * 
     */
    @Import(name="expand")
    private @Nullable Output<String> expand;

    /**
     * @return Expands referenced resources.
     * 
     */
    public Optional<Output<String>> expand() {
        return Optional.ofNullable(this.expand);
    }

    /**
     * The name of the public IP address.
     * 
     */
    @Import(name="publicIpAddressName", required=true)
    private Output<String> publicIpAddressName;

    /**
     * @return The name of the public IP address.
     * 
     */
    public Output<String> publicIpAddressName() {
        return this.publicIpAddressName;
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetPublicIPAddressArgs() {}

    private GetPublicIPAddressArgs(GetPublicIPAddressArgs $) {
        this.expand = $.expand;
        this.publicIpAddressName = $.publicIpAddressName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPublicIPAddressArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPublicIPAddressArgs $;

        public Builder() {
            $ = new GetPublicIPAddressArgs();
        }

        public Builder(GetPublicIPAddressArgs defaults) {
            $ = new GetPublicIPAddressArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param expand Expands referenced resources.
         * 
         * @return builder
         * 
         */
        public Builder expand(@Nullable Output<String> expand) {
            $.expand = expand;
            return this;
        }

        /**
         * @param expand Expands referenced resources.
         * 
         * @return builder
         * 
         */
        public Builder expand(String expand) {
            return expand(Output.of(expand));
        }

        /**
         * @param publicIpAddressName The name of the public IP address.
         * 
         * @return builder
         * 
         */
        public Builder publicIpAddressName(Output<String> publicIpAddressName) {
            $.publicIpAddressName = publicIpAddressName;
            return this;
        }

        /**
         * @param publicIpAddressName The name of the public IP address.
         * 
         * @return builder
         * 
         */
        public Builder publicIpAddressName(String publicIpAddressName) {
            return publicIpAddressName(Output.of(publicIpAddressName));
        }

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public GetPublicIPAddressArgs build() {
            $.publicIpAddressName = Objects.requireNonNull($.publicIpAddressName, "expected parameter 'publicIpAddressName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
