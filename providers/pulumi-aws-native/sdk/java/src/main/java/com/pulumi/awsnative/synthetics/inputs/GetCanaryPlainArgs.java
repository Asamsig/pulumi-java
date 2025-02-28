// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.synthetics.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetCanaryPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetCanaryPlainArgs Empty = new GetCanaryPlainArgs();

    /**
     * Name of the canary.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return Name of the canary.
     * 
     */
    public String name() {
        return this.name;
    }

    private GetCanaryPlainArgs() {}

    private GetCanaryPlainArgs(GetCanaryPlainArgs $) {
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetCanaryPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetCanaryPlainArgs $;

        public Builder() {
            $ = new GetCanaryPlainArgs();
        }

        public Builder(GetCanaryPlainArgs defaults) {
            $ = new GetCanaryPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Name of the canary.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public GetCanaryPlainArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
