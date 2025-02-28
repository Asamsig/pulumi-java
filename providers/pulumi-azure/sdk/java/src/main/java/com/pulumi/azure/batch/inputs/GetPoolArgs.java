// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.batch.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetPoolArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetPoolArgs Empty = new GetPoolArgs();

    /**
     * The name of the Batch account.
     * 
     */
    @Import(name="accountName", required=true)
    private Output<String> accountName;

    /**
     * @return The name of the Batch account.
     * 
     */
    public Output<String> accountName() {
        return this.accountName;
    }

    /**
     * The name of the endpoint.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of the endpoint.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetPoolArgs() {}

    private GetPoolArgs(GetPoolArgs $) {
        this.accountName = $.accountName;
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPoolArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPoolArgs $;

        public Builder() {
            $ = new GetPoolArgs();
        }

        public Builder(GetPoolArgs defaults) {
            $ = new GetPoolArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountName The name of the Batch account.
         * 
         * @return builder
         * 
         */
        public Builder accountName(Output<String> accountName) {
            $.accountName = accountName;
            return this;
        }

        /**
         * @param accountName The name of the Batch account.
         * 
         * @return builder
         * 
         */
        public Builder accountName(String accountName) {
            return accountName(Output.of(accountName));
        }

        /**
         * @param name The name of the endpoint.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the endpoint.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public GetPoolArgs build() {
            $.accountName = Objects.requireNonNull($.accountName, "expected parameter 'accountName' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
