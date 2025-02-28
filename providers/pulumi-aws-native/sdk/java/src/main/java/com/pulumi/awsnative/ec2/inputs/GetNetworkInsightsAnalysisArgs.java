// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.ec2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetNetworkInsightsAnalysisArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetNetworkInsightsAnalysisArgs Empty = new GetNetworkInsightsAnalysisArgs();

    @Import(name="networkInsightsAnalysisId", required=true)
    private Output<String> networkInsightsAnalysisId;

    public Output<String> networkInsightsAnalysisId() {
        return this.networkInsightsAnalysisId;
    }

    private GetNetworkInsightsAnalysisArgs() {}

    private GetNetworkInsightsAnalysisArgs(GetNetworkInsightsAnalysisArgs $) {
        this.networkInsightsAnalysisId = $.networkInsightsAnalysisId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetNetworkInsightsAnalysisArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetNetworkInsightsAnalysisArgs $;

        public Builder() {
            $ = new GetNetworkInsightsAnalysisArgs();
        }

        public Builder(GetNetworkInsightsAnalysisArgs defaults) {
            $ = new GetNetworkInsightsAnalysisArgs(Objects.requireNonNull(defaults));
        }

        public Builder networkInsightsAnalysisId(Output<String> networkInsightsAnalysisId) {
            $.networkInsightsAnalysisId = networkInsightsAnalysisId;
            return this;
        }

        public Builder networkInsightsAnalysisId(String networkInsightsAnalysisId) {
            return networkInsightsAnalysisId(Output.of(networkInsightsAnalysisId));
        }

        public GetNetworkInsightsAnalysisArgs build() {
            $.networkInsightsAnalysisId = Objects.requireNonNull($.networkInsightsAnalysisId, "expected parameter 'networkInsightsAnalysisId' to be non-null");
            return $;
        }
    }

}
