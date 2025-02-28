// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.macie.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetFindingsFilterArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetFindingsFilterArgs Empty = new GetFindingsFilterArgs();

    /**
     * Findings filter ID.
     * 
     */
    @Import(name="id", required=true)
    private Output<String> id;

    /**
     * @return Findings filter ID.
     * 
     */
    public Output<String> id() {
        return this.id;
    }

    private GetFindingsFilterArgs() {}

    private GetFindingsFilterArgs(GetFindingsFilterArgs $) {
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetFindingsFilterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetFindingsFilterArgs $;

        public Builder() {
            $ = new GetFindingsFilterArgs();
        }

        public Builder(GetFindingsFilterArgs defaults) {
            $ = new GetFindingsFilterArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id Findings filter ID.
         * 
         * @return builder
         * 
         */
        public Builder id(Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id Findings filter ID.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        public GetFindingsFilterArgs build() {
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            return $;
        }
    }

}
