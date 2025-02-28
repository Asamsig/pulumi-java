// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetSsmParameterStringPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSsmParameterStringPlainArgs Empty = new GetSsmParameterStringPlainArgs();

    @Import(name="name", required=true)
    private String name;

    public String name() {
        return this.name;
    }

    private GetSsmParameterStringPlainArgs() {}

    private GetSsmParameterStringPlainArgs(GetSsmParameterStringPlainArgs $) {
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSsmParameterStringPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSsmParameterStringPlainArgs $;

        public Builder() {
            $ = new GetSsmParameterStringPlainArgs();
        }

        public Builder(GetSsmParameterStringPlainArgs defaults) {
            $ = new GetSsmParameterStringPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public GetSsmParameterStringPlainArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
