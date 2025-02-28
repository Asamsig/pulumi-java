// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetSubscriptionNetworkManagerConnectionArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSubscriptionNetworkManagerConnectionArgs Empty = new GetSubscriptionNetworkManagerConnectionArgs();

    /**
     * Name for the network manager connection.
     * 
     */
    @Import(name="networkManagerConnectionName", required=true)
    private Output<String> networkManagerConnectionName;

    /**
     * @return Name for the network manager connection.
     * 
     */
    public Output<String> networkManagerConnectionName() {
        return this.networkManagerConnectionName;
    }

    private GetSubscriptionNetworkManagerConnectionArgs() {}

    private GetSubscriptionNetworkManagerConnectionArgs(GetSubscriptionNetworkManagerConnectionArgs $) {
        this.networkManagerConnectionName = $.networkManagerConnectionName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSubscriptionNetworkManagerConnectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSubscriptionNetworkManagerConnectionArgs $;

        public Builder() {
            $ = new GetSubscriptionNetworkManagerConnectionArgs();
        }

        public Builder(GetSubscriptionNetworkManagerConnectionArgs defaults) {
            $ = new GetSubscriptionNetworkManagerConnectionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param networkManagerConnectionName Name for the network manager connection.
         * 
         * @return builder
         * 
         */
        public Builder networkManagerConnectionName(Output<String> networkManagerConnectionName) {
            $.networkManagerConnectionName = networkManagerConnectionName;
            return this;
        }

        /**
         * @param networkManagerConnectionName Name for the network manager connection.
         * 
         * @return builder
         * 
         */
        public Builder networkManagerConnectionName(String networkManagerConnectionName) {
            return networkManagerConnectionName(Output.of(networkManagerConnectionName));
        }

        public GetSubscriptionNetworkManagerConnectionArgs build() {
            $.networkManagerConnectionName = Objects.requireNonNull($.networkManagerConnectionName, "expected parameter 'networkManagerConnectionName' to be non-null");
            return $;
        }
    }

}
