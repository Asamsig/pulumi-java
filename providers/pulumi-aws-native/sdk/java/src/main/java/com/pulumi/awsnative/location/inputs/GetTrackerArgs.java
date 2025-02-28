// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.location.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetTrackerArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetTrackerArgs Empty = new GetTrackerArgs();

    @Import(name="trackerName", required=true)
    private Output<String> trackerName;

    public Output<String> trackerName() {
        return this.trackerName;
    }

    private GetTrackerArgs() {}

    private GetTrackerArgs(GetTrackerArgs $) {
        this.trackerName = $.trackerName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetTrackerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetTrackerArgs $;

        public Builder() {
            $ = new GetTrackerArgs();
        }

        public Builder(GetTrackerArgs defaults) {
            $ = new GetTrackerArgs(Objects.requireNonNull(defaults));
        }

        public Builder trackerName(Output<String> trackerName) {
            $.trackerName = trackerName;
            return this;
        }

        public Builder trackerName(String trackerName) {
            return trackerName(Output.of(trackerName));
        }

        public GetTrackerArgs build() {
            $.trackerName = Objects.requireNonNull($.trackerName, "expected parameter 'trackerName' to be non-null");
            return $;
        }
    }

}
