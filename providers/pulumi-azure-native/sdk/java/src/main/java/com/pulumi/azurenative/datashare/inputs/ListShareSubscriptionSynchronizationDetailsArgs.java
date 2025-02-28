// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datashare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ListShareSubscriptionSynchronizationDetailsArgs extends com.pulumi.resources.InvokeArgs {

    public static final ListShareSubscriptionSynchronizationDetailsArgs Empty = new ListShareSubscriptionSynchronizationDetailsArgs();

    /**
     * The name of the share account.
     * 
     */
    @Import(name="accountName", required=true)
    private Output<String> accountName;

    /**
     * @return The name of the share account.
     * 
     */
    public Output<String> accountName() {
        return this.accountName;
    }

    /**
     * Filters the results using OData syntax.
     * 
     */
    @Import(name="filter")
    private @Nullable Output<String> filter;

    /**
     * @return Filters the results using OData syntax.
     * 
     */
    public Optional<Output<String>> filter() {
        return Optional.ofNullable(this.filter);
    }

    /**
     * Sorts the results using OData syntax.
     * 
     */
    @Import(name="orderby")
    private @Nullable Output<String> orderby;

    /**
     * @return Sorts the results using OData syntax.
     * 
     */
    public Optional<Output<String>> orderby() {
        return Optional.ofNullable(this.orderby);
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
     * The name of the share subscription.
     * 
     */
    @Import(name="shareSubscriptionName", required=true)
    private Output<String> shareSubscriptionName;

    /**
     * @return The name of the share subscription.
     * 
     */
    public Output<String> shareSubscriptionName() {
        return this.shareSubscriptionName;
    }

    /**
     * Continuation token
     * 
     */
    @Import(name="skipToken")
    private @Nullable Output<String> skipToken;

    /**
     * @return Continuation token
     * 
     */
    public Optional<Output<String>> skipToken() {
        return Optional.ofNullable(this.skipToken);
    }

    /**
     * Synchronization id
     * 
     */
    @Import(name="synchronizationId", required=true)
    private Output<String> synchronizationId;

    /**
     * @return Synchronization id
     * 
     */
    public Output<String> synchronizationId() {
        return this.synchronizationId;
    }

    private ListShareSubscriptionSynchronizationDetailsArgs() {}

    private ListShareSubscriptionSynchronizationDetailsArgs(ListShareSubscriptionSynchronizationDetailsArgs $) {
        this.accountName = $.accountName;
        this.filter = $.filter;
        this.orderby = $.orderby;
        this.resourceGroupName = $.resourceGroupName;
        this.shareSubscriptionName = $.shareSubscriptionName;
        this.skipToken = $.skipToken;
        this.synchronizationId = $.synchronizationId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ListShareSubscriptionSynchronizationDetailsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ListShareSubscriptionSynchronizationDetailsArgs $;

        public Builder() {
            $ = new ListShareSubscriptionSynchronizationDetailsArgs();
        }

        public Builder(ListShareSubscriptionSynchronizationDetailsArgs defaults) {
            $ = new ListShareSubscriptionSynchronizationDetailsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountName The name of the share account.
         * 
         * @return builder
         * 
         */
        public Builder accountName(Output<String> accountName) {
            $.accountName = accountName;
            return this;
        }

        /**
         * @param accountName The name of the share account.
         * 
         * @return builder
         * 
         */
        public Builder accountName(String accountName) {
            return accountName(Output.of(accountName));
        }

        /**
         * @param filter Filters the results using OData syntax.
         * 
         * @return builder
         * 
         */
        public Builder filter(@Nullable Output<String> filter) {
            $.filter = filter;
            return this;
        }

        /**
         * @param filter Filters the results using OData syntax.
         * 
         * @return builder
         * 
         */
        public Builder filter(String filter) {
            return filter(Output.of(filter));
        }

        /**
         * @param orderby Sorts the results using OData syntax.
         * 
         * @return builder
         * 
         */
        public Builder orderby(@Nullable Output<String> orderby) {
            $.orderby = orderby;
            return this;
        }

        /**
         * @param orderby Sorts the results using OData syntax.
         * 
         * @return builder
         * 
         */
        public Builder orderby(String orderby) {
            return orderby(Output.of(orderby));
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
         * @param shareSubscriptionName The name of the share subscription.
         * 
         * @return builder
         * 
         */
        public Builder shareSubscriptionName(Output<String> shareSubscriptionName) {
            $.shareSubscriptionName = shareSubscriptionName;
            return this;
        }

        /**
         * @param shareSubscriptionName The name of the share subscription.
         * 
         * @return builder
         * 
         */
        public Builder shareSubscriptionName(String shareSubscriptionName) {
            return shareSubscriptionName(Output.of(shareSubscriptionName));
        }

        /**
         * @param skipToken Continuation token
         * 
         * @return builder
         * 
         */
        public Builder skipToken(@Nullable Output<String> skipToken) {
            $.skipToken = skipToken;
            return this;
        }

        /**
         * @param skipToken Continuation token
         * 
         * @return builder
         * 
         */
        public Builder skipToken(String skipToken) {
            return skipToken(Output.of(skipToken));
        }

        /**
         * @param synchronizationId Synchronization id
         * 
         * @return builder
         * 
         */
        public Builder synchronizationId(Output<String> synchronizationId) {
            $.synchronizationId = synchronizationId;
            return this;
        }

        /**
         * @param synchronizationId Synchronization id
         * 
         * @return builder
         * 
         */
        public Builder synchronizationId(String synchronizationId) {
            return synchronizationId(Output.of(synchronizationId));
        }

        public ListShareSubscriptionSynchronizationDetailsArgs build() {
            $.accountName = Objects.requireNonNull($.accountName, "expected parameter 'accountName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.shareSubscriptionName = Objects.requireNonNull($.shareSubscriptionName, "expected parameter 'shareSubscriptionName' to be non-null");
            $.synchronizationId = Objects.requireNonNull($.synchronizationId, "expected parameter 'synchronizationId' to be non-null");
            return $;
        }
    }

}
