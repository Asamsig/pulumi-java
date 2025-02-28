// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.robomaker.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetFleetPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetFleetPlainArgs Empty = new GetFleetPlainArgs();

    @Import(name="arn", required=true)
    private String arn;

    public String arn() {
        return this.arn;
    }

    private GetFleetPlainArgs() {}

    private GetFleetPlainArgs(GetFleetPlainArgs $) {
        this.arn = $.arn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetFleetPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetFleetPlainArgs $;

        public Builder() {
            $ = new GetFleetPlainArgs();
        }

        public Builder(GetFleetPlainArgs defaults) {
            $ = new GetFleetPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder arn(String arn) {
            $.arn = arn;
            return this;
        }

        public GetFleetPlainArgs build() {
            $.arn = Objects.requireNonNull($.arn, "expected parameter 'arn' to be non-null");
            return $;
        }
    }

}
