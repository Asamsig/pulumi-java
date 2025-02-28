// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.eventgrid.inputs;

import com.pulumi.azure.eventgrid.inputs.GetDomainInboundIpRuleArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetDomainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDomainArgs Empty = new GetDomainArgs();

    /**
     * One or more `inbound_ip_rule` blocks as defined below.
     * 
     */
    @Import(name="inboundIpRules")
    private @Nullable Output<List<GetDomainInboundIpRuleArgs>> inboundIpRules;

    /**
     * @return One or more `inbound_ip_rule` blocks as defined below.
     * 
     */
    public Optional<Output<List<GetDomainInboundIpRuleArgs>>> inboundIpRules() {
        return Optional.ofNullable(this.inboundIpRules);
    }

    /**
     * The name of the EventGrid Domain resource.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of the EventGrid Domain resource.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * Whether or not public network access is allowed for this server.
     * 
     */
    @Import(name="publicNetworkAccessEnabled")
    private @Nullable Output<Boolean> publicNetworkAccessEnabled;

    /**
     * @return Whether or not public network access is allowed for this server.
     * 
     */
    public Optional<Output<Boolean>> publicNetworkAccessEnabled() {
        return Optional.ofNullable(this.publicNetworkAccessEnabled);
    }

    /**
     * The name of the resource group in which the EventGrid Domain exists.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group in which the EventGrid Domain exists.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * A mapping of tags assigned to the EventGrid Domain.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A mapping of tags assigned to the EventGrid Domain.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private GetDomainArgs() {}

    private GetDomainArgs(GetDomainArgs $) {
        this.inboundIpRules = $.inboundIpRules;
        this.name = $.name;
        this.publicNetworkAccessEnabled = $.publicNetworkAccessEnabled;
        this.resourceGroupName = $.resourceGroupName;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDomainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDomainArgs $;

        public Builder() {
            $ = new GetDomainArgs();
        }

        public Builder(GetDomainArgs defaults) {
            $ = new GetDomainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param inboundIpRules One or more `inbound_ip_rule` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder inboundIpRules(@Nullable Output<List<GetDomainInboundIpRuleArgs>> inboundIpRules) {
            $.inboundIpRules = inboundIpRules;
            return this;
        }

        /**
         * @param inboundIpRules One or more `inbound_ip_rule` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder inboundIpRules(List<GetDomainInboundIpRuleArgs> inboundIpRules) {
            return inboundIpRules(Output.of(inboundIpRules));
        }

        /**
         * @param inboundIpRules One or more `inbound_ip_rule` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder inboundIpRules(GetDomainInboundIpRuleArgs... inboundIpRules) {
            return inboundIpRules(List.of(inboundIpRules));
        }

        /**
         * @param name The name of the EventGrid Domain resource.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the EventGrid Domain resource.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param publicNetworkAccessEnabled Whether or not public network access is allowed for this server.
         * 
         * @return builder
         * 
         */
        public Builder publicNetworkAccessEnabled(@Nullable Output<Boolean> publicNetworkAccessEnabled) {
            $.publicNetworkAccessEnabled = publicNetworkAccessEnabled;
            return this;
        }

        /**
         * @param publicNetworkAccessEnabled Whether or not public network access is allowed for this server.
         * 
         * @return builder
         * 
         */
        public Builder publicNetworkAccessEnabled(Boolean publicNetworkAccessEnabled) {
            return publicNetworkAccessEnabled(Output.of(publicNetworkAccessEnabled));
        }

        /**
         * @param resourceGroupName The name of the resource group in which the EventGrid Domain exists.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group in which the EventGrid Domain exists.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param tags A mapping of tags assigned to the EventGrid Domain.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A mapping of tags assigned to the EventGrid Domain.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public GetDomainArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
