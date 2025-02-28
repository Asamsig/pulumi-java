// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.automation.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetHybridRunbookWorkerPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetHybridRunbookWorkerPlainArgs Empty = new GetHybridRunbookWorkerPlainArgs();

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
     * The hybrid runbook worker group name
     * 
     */
    @Import(name="hybridRunbookWorkerGroupName", required=true)
    private String hybridRunbookWorkerGroupName;

    /**
     * @return The hybrid runbook worker group name
     * 
     */
    public String hybridRunbookWorkerGroupName() {
        return this.hybridRunbookWorkerGroupName;
    }

    /**
     * The hybrid runbook worker id
     * 
     */
    @Import(name="hybridRunbookWorkerId", required=true)
    private String hybridRunbookWorkerId;

    /**
     * @return The hybrid runbook worker id
     * 
     */
    public String hybridRunbookWorkerId() {
        return this.hybridRunbookWorkerId;
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

    private GetHybridRunbookWorkerPlainArgs() {}

    private GetHybridRunbookWorkerPlainArgs(GetHybridRunbookWorkerPlainArgs $) {
        this.automationAccountName = $.automationAccountName;
        this.hybridRunbookWorkerGroupName = $.hybridRunbookWorkerGroupName;
        this.hybridRunbookWorkerId = $.hybridRunbookWorkerId;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetHybridRunbookWorkerPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetHybridRunbookWorkerPlainArgs $;

        public Builder() {
            $ = new GetHybridRunbookWorkerPlainArgs();
        }

        public Builder(GetHybridRunbookWorkerPlainArgs defaults) {
            $ = new GetHybridRunbookWorkerPlainArgs(Objects.requireNonNull(defaults));
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
         * @param hybridRunbookWorkerGroupName The hybrid runbook worker group name
         * 
         * @return builder
         * 
         */
        public Builder hybridRunbookWorkerGroupName(String hybridRunbookWorkerGroupName) {
            $.hybridRunbookWorkerGroupName = hybridRunbookWorkerGroupName;
            return this;
        }

        /**
         * @param hybridRunbookWorkerId The hybrid runbook worker id
         * 
         * @return builder
         * 
         */
        public Builder hybridRunbookWorkerId(String hybridRunbookWorkerId) {
            $.hybridRunbookWorkerId = hybridRunbookWorkerId;
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

        public GetHybridRunbookWorkerPlainArgs build() {
            $.automationAccountName = Objects.requireNonNull($.automationAccountName, "expected parameter 'automationAccountName' to be non-null");
            $.hybridRunbookWorkerGroupName = Objects.requireNonNull($.hybridRunbookWorkerGroupName, "expected parameter 'hybridRunbookWorkerGroupName' to be non-null");
            $.hybridRunbookWorkerId = Objects.requireNonNull($.hybridRunbookWorkerId, "expected parameter 'hybridRunbookWorkerId' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
