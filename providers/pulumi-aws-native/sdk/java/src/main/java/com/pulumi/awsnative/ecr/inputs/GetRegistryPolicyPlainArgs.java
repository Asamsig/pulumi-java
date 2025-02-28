// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.ecr.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetRegistryPolicyPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetRegistryPolicyPlainArgs Empty = new GetRegistryPolicyPlainArgs();

    @Import(name="registryId", required=true)
    private String registryId;

    public String registryId() {
        return this.registryId;
    }

    private GetRegistryPolicyPlainArgs() {}

    private GetRegistryPolicyPlainArgs(GetRegistryPolicyPlainArgs $) {
        this.registryId = $.registryId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRegistryPolicyPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRegistryPolicyPlainArgs $;

        public Builder() {
            $ = new GetRegistryPolicyPlainArgs();
        }

        public Builder(GetRegistryPolicyPlainArgs defaults) {
            $ = new GetRegistryPolicyPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder registryId(String registryId) {
            $.registryId = registryId;
            return this;
        }

        public GetRegistryPolicyPlainArgs build() {
            $.registryId = Objects.requireNonNull($.registryId, "expected parameter 'registryId' to be non-null");
            return $;
        }
    }

}
