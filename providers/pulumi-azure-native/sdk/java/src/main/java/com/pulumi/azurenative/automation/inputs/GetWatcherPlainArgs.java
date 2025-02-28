// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.automation.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetWatcherPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetWatcherPlainArgs Empty = new GetWatcherPlainArgs();

    /**
     * The name of the automation account.
     * 
     */
    @Import(name="automationAccountName", required=true)
    private String automationAccountName;

    /**
     * @return The name of the automation account.
     * 
     */
    public String automationAccountName() {
        return this.automationAccountName;
    }

    /**
     * Name of an Azure Resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return Name of an Azure Resource group.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The watcher name.
     * 
     */
    @Import(name="watcherName", required=true)
    private String watcherName;

    /**
     * @return The watcher name.
     * 
     */
    public String watcherName() {
        return this.watcherName;
    }

    private GetWatcherPlainArgs() {}

    private GetWatcherPlainArgs(GetWatcherPlainArgs $) {
        this.automationAccountName = $.automationAccountName;
        this.resourceGroupName = $.resourceGroupName;
        this.watcherName = $.watcherName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetWatcherPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetWatcherPlainArgs $;

        public Builder() {
            $ = new GetWatcherPlainArgs();
        }

        public Builder(GetWatcherPlainArgs defaults) {
            $ = new GetWatcherPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param automationAccountName The name of the automation account.
         * 
         * @return builder
         * 
         */
        public Builder automationAccountName(String automationAccountName) {
            $.automationAccountName = automationAccountName;
            return this;
        }

        /**
         * @param resourceGroupName Name of an Azure Resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param watcherName The watcher name.
         * 
         * @return builder
         * 
         */
        public Builder watcherName(String watcherName) {
            $.watcherName = watcherName;
            return this;
        }

        public GetWatcherPlainArgs build() {
            $.automationAccountName = Objects.requireNonNull($.automationAccountName, "expected parameter 'automationAccountName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.watcherName = Objects.requireNonNull($.watcherName, "expected parameter 'watcherName' to be non-null");
            return $;
        }
    }

}
