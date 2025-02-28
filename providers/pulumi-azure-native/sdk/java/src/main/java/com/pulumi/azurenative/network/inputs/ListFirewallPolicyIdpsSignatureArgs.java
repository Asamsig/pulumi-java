// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.azurenative.network.inputs.FilterItemsArgs;
import com.pulumi.azurenative.network.inputs.OrderByArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ListFirewallPolicyIdpsSignatureArgs extends com.pulumi.resources.InvokeArgs {

    public static final ListFirewallPolicyIdpsSignatureArgs Empty = new ListFirewallPolicyIdpsSignatureArgs();

    /**
     * Contain all filters names and values
     * 
     */
    @Import(name="filters")
    private @Nullable Output<List<FilterItemsArgs>> filters;

    /**
     * @return Contain all filters names and values
     * 
     */
    public Optional<Output<List<FilterItemsArgs>>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * The name of the Firewall Policy.
     * 
     */
    @Import(name="firewallPolicyName", required=true)
    private Output<String> firewallPolicyName;

    /**
     * @return The name of the Firewall Policy.
     * 
     */
    public Output<String> firewallPolicyName() {
        return this.firewallPolicyName;
    }

    /**
     * Column to sort response by
     * 
     */
    @Import(name="orderBy")
    private @Nullable Output<OrderByArgs> orderBy;

    /**
     * @return Column to sort response by
     * 
     */
    public Optional<Output<OrderByArgs>> orderBy() {
        return Optional.ofNullable(this.orderBy);
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
     * The number of the results to return in each page
     * 
     */
    @Import(name="resultsPerPage")
    private @Nullable Output<Integer> resultsPerPage;

    /**
     * @return The number of the results to return in each page
     * 
     */
    public Optional<Output<Integer>> resultsPerPage() {
        return Optional.ofNullable(this.resultsPerPage);
    }

    /**
     * Search term in all columns
     * 
     */
    @Import(name="search")
    private @Nullable Output<String> search;

    /**
     * @return Search term in all columns
     * 
     */
    public Optional<Output<String>> search() {
        return Optional.ofNullable(this.search);
    }

    /**
     * The number of records matching the filter to skip
     * 
     */
    @Import(name="skip")
    private @Nullable Output<Integer> skip;

    /**
     * @return The number of records matching the filter to skip
     * 
     */
    public Optional<Output<Integer>> skip() {
        return Optional.ofNullable(this.skip);
    }

    private ListFirewallPolicyIdpsSignatureArgs() {}

    private ListFirewallPolicyIdpsSignatureArgs(ListFirewallPolicyIdpsSignatureArgs $) {
        this.filters = $.filters;
        this.firewallPolicyName = $.firewallPolicyName;
        this.orderBy = $.orderBy;
        this.resourceGroupName = $.resourceGroupName;
        this.resultsPerPage = $.resultsPerPage;
        this.search = $.search;
        this.skip = $.skip;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ListFirewallPolicyIdpsSignatureArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ListFirewallPolicyIdpsSignatureArgs $;

        public Builder() {
            $ = new ListFirewallPolicyIdpsSignatureArgs();
        }

        public Builder(ListFirewallPolicyIdpsSignatureArgs defaults) {
            $ = new ListFirewallPolicyIdpsSignatureArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param filters Contain all filters names and values
         * 
         * @return builder
         * 
         */
        public Builder filters(@Nullable Output<List<FilterItemsArgs>> filters) {
            $.filters = filters;
            return this;
        }

        /**
         * @param filters Contain all filters names and values
         * 
         * @return builder
         * 
         */
        public Builder filters(List<FilterItemsArgs> filters) {
            return filters(Output.of(filters));
        }

        /**
         * @param filters Contain all filters names and values
         * 
         * @return builder
         * 
         */
        public Builder filters(FilterItemsArgs... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param firewallPolicyName The name of the Firewall Policy.
         * 
         * @return builder
         * 
         */
        public Builder firewallPolicyName(Output<String> firewallPolicyName) {
            $.firewallPolicyName = firewallPolicyName;
            return this;
        }

        /**
         * @param firewallPolicyName The name of the Firewall Policy.
         * 
         * @return builder
         * 
         */
        public Builder firewallPolicyName(String firewallPolicyName) {
            return firewallPolicyName(Output.of(firewallPolicyName));
        }

        /**
         * @param orderBy Column to sort response by
         * 
         * @return builder
         * 
         */
        public Builder orderBy(@Nullable Output<OrderByArgs> orderBy) {
            $.orderBy = orderBy;
            return this;
        }

        /**
         * @param orderBy Column to sort response by
         * 
         * @return builder
         * 
         */
        public Builder orderBy(OrderByArgs orderBy) {
            return orderBy(Output.of(orderBy));
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
         * @param resultsPerPage The number of the results to return in each page
         * 
         * @return builder
         * 
         */
        public Builder resultsPerPage(@Nullable Output<Integer> resultsPerPage) {
            $.resultsPerPage = resultsPerPage;
            return this;
        }

        /**
         * @param resultsPerPage The number of the results to return in each page
         * 
         * @return builder
         * 
         */
        public Builder resultsPerPage(Integer resultsPerPage) {
            return resultsPerPage(Output.of(resultsPerPage));
        }

        /**
         * @param search Search term in all columns
         * 
         * @return builder
         * 
         */
        public Builder search(@Nullable Output<String> search) {
            $.search = search;
            return this;
        }

        /**
         * @param search Search term in all columns
         * 
         * @return builder
         * 
         */
        public Builder search(String search) {
            return search(Output.of(search));
        }

        /**
         * @param skip The number of records matching the filter to skip
         * 
         * @return builder
         * 
         */
        public Builder skip(@Nullable Output<Integer> skip) {
            $.skip = skip;
            return this;
        }

        /**
         * @param skip The number of records matching the filter to skip
         * 
         * @return builder
         * 
         */
        public Builder skip(Integer skip) {
            return skip(Output.of(skip));
        }

        public ListFirewallPolicyIdpsSignatureArgs build() {
            $.firewallPolicyName = Objects.requireNonNull($.firewallPolicyName, "expected parameter 'firewallPolicyName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
