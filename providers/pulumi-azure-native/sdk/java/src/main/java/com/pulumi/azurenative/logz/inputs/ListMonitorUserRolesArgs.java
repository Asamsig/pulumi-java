// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.logz.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ListMonitorUserRolesArgs extends com.pulumi.resources.InvokeArgs {

    public static final ListMonitorUserRolesArgs Empty = new ListMonitorUserRolesArgs();

    /**
     * Email of the user used by Logz for contacting them if needed
     * 
     */
    @Import(name="emailAddress")
    private @Nullable Output<String> emailAddress;

    /**
     * @return Email of the user used by Logz for contacting them if needed
     * 
     */
    public Optional<Output<String>> emailAddress() {
        return Optional.ofNullable(this.emailAddress);
    }

    /**
     * Monitor resource name
     * 
     */
    @Import(name="monitorName", required=true)
    private Output<String> monitorName;

    /**
     * @return Monitor resource name
     * 
     */
    public Output<String> monitorName() {
        return this.monitorName;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group. The name is case insensitive.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    private ListMonitorUserRolesArgs() {}

    private ListMonitorUserRolesArgs(ListMonitorUserRolesArgs $) {
        this.emailAddress = $.emailAddress;
        this.monitorName = $.monitorName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ListMonitorUserRolesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ListMonitorUserRolesArgs $;

        public Builder() {
            $ = new ListMonitorUserRolesArgs();
        }

        public Builder(ListMonitorUserRolesArgs defaults) {
            $ = new ListMonitorUserRolesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param emailAddress Email of the user used by Logz for contacting them if needed
         * 
         * @return builder
         * 
         */
        public Builder emailAddress(@Nullable Output<String> emailAddress) {
            $.emailAddress = emailAddress;
            return this;
        }

        /**
         * @param emailAddress Email of the user used by Logz for contacting them if needed
         * 
         * @return builder
         * 
         */
        public Builder emailAddress(String emailAddress) {
            return emailAddress(Output.of(emailAddress));
        }

        /**
         * @param monitorName Monitor resource name
         * 
         * @return builder
         * 
         */
        public Builder monitorName(Output<String> monitorName) {
            $.monitorName = monitorName;
            return this;
        }

        /**
         * @param monitorName Monitor resource name
         * 
         * @return builder
         * 
         */
        public Builder monitorName(String monitorName) {
            return monitorName(Output.of(monitorName));
        }

        /**
         * @param resourceGroupName The name of the resource group. The name is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group. The name is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public ListMonitorUserRolesArgs build() {
            $.monitorName = Objects.requireNonNull($.monitorName, "expected parameter 'monitorName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
