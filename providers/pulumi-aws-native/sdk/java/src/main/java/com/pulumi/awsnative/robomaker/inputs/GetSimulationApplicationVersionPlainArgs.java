// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.robomaker.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetSimulationApplicationVersionPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSimulationApplicationVersionPlainArgs Empty = new GetSimulationApplicationVersionPlainArgs();

    @Import(name="arn", required=true)
    private String arn;

    public String arn() {
        return this.arn;
    }

    private GetSimulationApplicationVersionPlainArgs() {}

    private GetSimulationApplicationVersionPlainArgs(GetSimulationApplicationVersionPlainArgs $) {
        this.arn = $.arn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSimulationApplicationVersionPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSimulationApplicationVersionPlainArgs $;

        public Builder() {
            $ = new GetSimulationApplicationVersionPlainArgs();
        }

        public Builder(GetSimulationApplicationVersionPlainArgs defaults) {
            $ = new GetSimulationApplicationVersionPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder arn(String arn) {
            $.arn = arn;
            return this;
        }

        public GetSimulationApplicationVersionPlainArgs build() {
            $.arn = Objects.requireNonNull($.arn, "expected parameter 'arn' to be non-null");
            return $;
        }
    }

}
