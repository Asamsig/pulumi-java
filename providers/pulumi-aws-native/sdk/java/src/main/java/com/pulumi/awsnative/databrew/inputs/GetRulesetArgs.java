// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.databrew.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetRulesetArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetRulesetArgs Empty = new GetRulesetArgs();

    /**
     * Name of the Ruleset
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Name of the Ruleset
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    private GetRulesetArgs() {}

    private GetRulesetArgs(GetRulesetArgs $) {
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRulesetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRulesetArgs $;

        public Builder() {
            $ = new GetRulesetArgs();
        }

        public Builder(GetRulesetArgs defaults) {
            $ = new GetRulesetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Name of the Ruleset
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the Ruleset
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public GetRulesetArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
