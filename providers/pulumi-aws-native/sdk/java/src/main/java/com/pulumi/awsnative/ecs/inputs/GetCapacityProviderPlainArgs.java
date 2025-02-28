// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.ecs.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetCapacityProviderPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetCapacityProviderPlainArgs Empty = new GetCapacityProviderPlainArgs();

    @Import(name="name", required=true)
    private String name;

    public String name() {
        return this.name;
    }

    private GetCapacityProviderPlainArgs() {}

    private GetCapacityProviderPlainArgs(GetCapacityProviderPlainArgs $) {
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetCapacityProviderPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetCapacityProviderPlainArgs $;

        public Builder() {
            $ = new GetCapacityProviderPlainArgs();
        }

        public Builder(GetCapacityProviderPlainArgs defaults) {
            $ = new GetCapacityProviderPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public GetCapacityProviderPlainArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
