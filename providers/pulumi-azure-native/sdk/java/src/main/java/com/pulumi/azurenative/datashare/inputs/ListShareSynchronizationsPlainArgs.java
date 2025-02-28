// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datashare.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ListShareSynchronizationsPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final ListShareSynchronizationsPlainArgs Empty = new ListShareSynchronizationsPlainArgs();

    /**
     * The name of the share account.
     * 
     */
    @Import(name="accountName", required=true)
    private String accountName;

    /**
     * @return The name of the share account.
     * 
     */
    public String accountName() {
        return this.accountName;
    }

    /**
     * Filters the results using OData syntax.
     * 
     */
    @Import(name="filter")
    private @Nullable String filter;

    /**
     * @return Filters the results using OData syntax.
     * 
     */
    public Optional<String> filter() {
        return Optional.ofNullable(this.filter);
    }

    /**
     * Sorts the results using OData syntax.
     * 
     */
    @Import(name="orderby")
    private @Nullable String orderby;

    /**
     * @return Sorts the results using OData syntax.
     * 
     */
    public Optional<String> orderby() {
        return Optional.ofNullable(this.orderby);
    }

    /**
     * The resource group name.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The resource group name.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the share.
     * 
     */
    @Import(name="shareName", required=true)
    private String shareName;

    /**
     * @return The name of the share.
     * 
     */
    public String shareName() {
        return this.shareName;
    }

    /**
     * Continuation token
     * 
     */
    @Import(name="skipToken")
    private @Nullable String skipToken;

    /**
     * @return Continuation token
     * 
     */
    public Optional<String> skipToken() {
        return Optional.ofNullable(this.skipToken);
    }

    private ListShareSynchronizationsPlainArgs() {}

    private ListShareSynchronizationsPlainArgs(ListShareSynchronizationsPlainArgs $) {
        this.accountName = $.accountName;
        this.filter = $.filter;
        this.orderby = $.orderby;
        this.resourceGroupName = $.resourceGroupName;
        this.shareName = $.shareName;
        this.skipToken = $.skipToken;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ListShareSynchronizationsPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ListShareSynchronizationsPlainArgs $;

        public Builder() {
            $ = new ListShareSynchronizationsPlainArgs();
        }

        public Builder(ListShareSynchronizationsPlainArgs defaults) {
            $ = new ListShareSynchronizationsPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountName The name of the share account.
         * 
         * @return builder
         * 
         */
        public Builder accountName(String accountName) {
            $.accountName = accountName;
            return this;
        }

        /**
         * @param filter Filters the results using OData syntax.
         * 
         * @return builder
         * 
         */
        public Builder filter(@Nullable String filter) {
            $.filter = filter;
            return this;
        }

        /**
         * @param orderby Sorts the results using OData syntax.
         * 
         * @return builder
         * 
         */
        public Builder orderby(@Nullable String orderby) {
            $.orderby = orderby;
            return this;
        }

        /**
         * @param resourceGroupName The resource group name.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param shareName The name of the share.
         * 
         * @return builder
         * 
         */
        public Builder shareName(String shareName) {
            $.shareName = shareName;
            return this;
        }

        /**
         * @param skipToken Continuation token
         * 
         * @return builder
         * 
         */
        public Builder skipToken(@Nullable String skipToken) {
            $.skipToken = skipToken;
            return this;
        }

        public ListShareSynchronizationsPlainArgs build() {
            $.accountName = Objects.requireNonNull($.accountName, "expected parameter 'accountName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.shareName = Objects.requireNonNull($.shareName, "expected parameter 'shareName' to be non-null");
            return $;
        }
    }

}
