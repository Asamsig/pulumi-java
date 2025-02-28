// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.costmanagement.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetScheduledActionArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetScheduledActionArgs Empty = new GetScheduledActionArgs();

    /**
     * Scheduled action name.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Scheduled action name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    private GetScheduledActionArgs() {}

    private GetScheduledActionArgs(GetScheduledActionArgs $) {
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetScheduledActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetScheduledActionArgs $;

        public Builder() {
            $ = new GetScheduledActionArgs();
        }

        public Builder(GetScheduledActionArgs defaults) {
            $ = new GetScheduledActionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Scheduled action name.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Scheduled action name.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public GetScheduledActionArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
