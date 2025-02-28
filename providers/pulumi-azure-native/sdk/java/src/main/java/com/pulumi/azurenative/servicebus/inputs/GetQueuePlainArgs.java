// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.servicebus.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetQueuePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetQueuePlainArgs Empty = new GetQueuePlainArgs();

    /**
     * The namespace name
     * 
     */
    @Import(name="namespaceName", required=true)
    private String namespaceName;

    /**
     * @return The namespace name
     * 
     */
    public String namespaceName() {
        return this.namespaceName;
    }

    /**
     * The queue name.
     * 
     */
    @Import(name="queueName", required=true)
    private String queueName;

    /**
     * @return The queue name.
     * 
     */
    public String queueName() {
        return this.queueName;
    }

    /**
     * Name of the Resource group within the Azure subscription.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return Name of the Resource group within the Azure subscription.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetQueuePlainArgs() {}

    private GetQueuePlainArgs(GetQueuePlainArgs $) {
        this.namespaceName = $.namespaceName;
        this.queueName = $.queueName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetQueuePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetQueuePlainArgs $;

        public Builder() {
            $ = new GetQueuePlainArgs();
        }

        public Builder(GetQueuePlainArgs defaults) {
            $ = new GetQueuePlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param namespaceName The namespace name
         * 
         * @return builder
         * 
         */
        public Builder namespaceName(String namespaceName) {
            $.namespaceName = namespaceName;
            return this;
        }

        /**
         * @param queueName The queue name.
         * 
         * @return builder
         * 
         */
        public Builder queueName(String queueName) {
            $.queueName = queueName;
            return this;
        }

        /**
         * @param resourceGroupName Name of the Resource group within the Azure subscription.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public GetQueuePlainArgs build() {
            $.namespaceName = Objects.requireNonNull($.namespaceName, "expected parameter 'namespaceName' to be non-null");
            $.queueName = Objects.requireNonNull($.queueName, "expected parameter 'queueName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
