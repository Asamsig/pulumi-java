// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.waf.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetFirewallPolicyPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetFirewallPolicyPlainArgs Empty = new GetFirewallPolicyPlainArgs();

    /**
     * The name of the Web Application Firewall Policy
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The name of the Web Application Firewall Policy
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * The name of the Resource Group where the Web Application Firewall Policy exists.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the Resource Group where the Web Application Firewall Policy exists.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    @Import(name="tags")
    private @Nullable Map<String,String> tags;

    public Optional<Map<String,String>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private GetFirewallPolicyPlainArgs() {}

    private GetFirewallPolicyPlainArgs(GetFirewallPolicyPlainArgs $) {
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetFirewallPolicyPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetFirewallPolicyPlainArgs $;

        public Builder() {
            $ = new GetFirewallPolicyPlainArgs();
        }

        public Builder(GetFirewallPolicyPlainArgs defaults) {
            $ = new GetFirewallPolicyPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the Web Application Firewall Policy
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param resourceGroupName The name of the Resource Group where the Web Application Firewall Policy exists.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            $.tags = tags;
            return this;
        }

        public GetFirewallPolicyPlainArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
