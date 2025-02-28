// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.servicemanagement_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetServiceIamPolicyPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetServiceIamPolicyPlainArgs Empty = new GetServiceIamPolicyPlainArgs();

    @Import(name="serviceId", required=true)
    private String serviceId;

    public String serviceId() {
        return this.serviceId;
    }

    private GetServiceIamPolicyPlainArgs() {}

    private GetServiceIamPolicyPlainArgs(GetServiceIamPolicyPlainArgs $) {
        this.serviceId = $.serviceId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetServiceIamPolicyPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetServiceIamPolicyPlainArgs $;

        public Builder() {
            $ = new GetServiceIamPolicyPlainArgs();
        }

        public Builder(GetServiceIamPolicyPlainArgs defaults) {
            $ = new GetServiceIamPolicyPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder serviceId(String serviceId) {
            $.serviceId = serviceId;
            return this;
        }

        public GetServiceIamPolicyPlainArgs build() {
            $.serviceId = Objects.requireNonNull($.serviceId, "expected parameter 'serviceId' to be non-null");
            return $;
        }
    }

}
