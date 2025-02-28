// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network;

import com.pulumi.azurenative.network.inputs.BastionHostIPConfigurationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BastionHostArgs extends com.pulumi.resources.ResourceArgs {

    public static final BastionHostArgs Empty = new BastionHostArgs();

    /**
     * The name of the Bastion Host.
     * 
     */
    @Import(name="bastionHostName")
    private @Nullable Output<String> bastionHostName;

    /**
     * @return The name of the Bastion Host.
     * 
     */
    public Optional<Output<String>> bastionHostName() {
        return Optional.ofNullable(this.bastionHostName);
    }

    /**
     * FQDN for the endpoint on which bastion host is accessible.
     * 
     */
    @Import(name="dnsName")
    private @Nullable Output<String> dnsName;

    /**
     * @return FQDN for the endpoint on which bastion host is accessible.
     * 
     */
    public Optional<Output<String>> dnsName() {
        return Optional.ofNullable(this.dnsName);
    }

    /**
     * Resource ID.
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return Resource ID.
     * 
     */
    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * IP configuration of the Bastion Host resource.
     * 
     */
    @Import(name="ipConfigurations")
    private @Nullable Output<List<BastionHostIPConfigurationArgs>> ipConfigurations;

    /**
     * @return IP configuration of the Bastion Host resource.
     * 
     */
    public Optional<Output<List<BastionHostIPConfigurationArgs>>> ipConfigurations() {
        return Optional.ofNullable(this.ipConfigurations);
    }

    /**
     * Resource location.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return Resource location.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
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

    /**
     * Resource tags.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Resource tags.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private BastionHostArgs() {}

    private BastionHostArgs(BastionHostArgs $) {
        this.bastionHostName = $.bastionHostName;
        this.dnsName = $.dnsName;
        this.id = $.id;
        this.ipConfigurations = $.ipConfigurations;
        this.location = $.location;
        this.resourceGroupName = $.resourceGroupName;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BastionHostArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BastionHostArgs $;

        public Builder() {
            $ = new BastionHostArgs();
        }

        public Builder(BastionHostArgs defaults) {
            $ = new BastionHostArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param bastionHostName The name of the Bastion Host.
         * 
         * @return builder
         * 
         */
        public Builder bastionHostName(@Nullable Output<String> bastionHostName) {
            $.bastionHostName = bastionHostName;
            return this;
        }

        /**
         * @param bastionHostName The name of the Bastion Host.
         * 
         * @return builder
         * 
         */
        public Builder bastionHostName(String bastionHostName) {
            return bastionHostName(Output.of(bastionHostName));
        }

        /**
         * @param dnsName FQDN for the endpoint on which bastion host is accessible.
         * 
         * @return builder
         * 
         */
        public Builder dnsName(@Nullable Output<String> dnsName) {
            $.dnsName = dnsName;
            return this;
        }

        /**
         * @param dnsName FQDN for the endpoint on which bastion host is accessible.
         * 
         * @return builder
         * 
         */
        public Builder dnsName(String dnsName) {
            return dnsName(Output.of(dnsName));
        }

        /**
         * @param id Resource ID.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id Resource ID.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param ipConfigurations IP configuration of the Bastion Host resource.
         * 
         * @return builder
         * 
         */
        public Builder ipConfigurations(@Nullable Output<List<BastionHostIPConfigurationArgs>> ipConfigurations) {
            $.ipConfigurations = ipConfigurations;
            return this;
        }

        /**
         * @param ipConfigurations IP configuration of the Bastion Host resource.
         * 
         * @return builder
         * 
         */
        public Builder ipConfigurations(List<BastionHostIPConfigurationArgs> ipConfigurations) {
            return ipConfigurations(Output.of(ipConfigurations));
        }

        /**
         * @param ipConfigurations IP configuration of the Bastion Host resource.
         * 
         * @return builder
         * 
         */
        public Builder ipConfigurations(BastionHostIPConfigurationArgs... ipConfigurations) {
            return ipConfigurations(List.of(ipConfigurations));
        }

        /**
         * @param location Resource location.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location Resource location.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
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

        /**
         * @param tags Resource tags.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Resource tags.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public BastionHostArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
