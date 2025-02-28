// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.apigee_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetNatAddressArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetNatAddressArgs Empty = new GetNatAddressArgs();

    @Import(name="instanceId", required=true)
    private Output<String> instanceId;

    public Output<String> instanceId() {
        return this.instanceId;
    }

    @Import(name="natAddressId", required=true)
    private Output<String> natAddressId;

    public Output<String> natAddressId() {
        return this.natAddressId;
    }

    @Import(name="organizationId", required=true)
    private Output<String> organizationId;

    public Output<String> organizationId() {
        return this.organizationId;
    }

    private GetNatAddressArgs() {}

    private GetNatAddressArgs(GetNatAddressArgs $) {
        this.instanceId = $.instanceId;
        this.natAddressId = $.natAddressId;
        this.organizationId = $.organizationId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetNatAddressArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetNatAddressArgs $;

        public Builder() {
            $ = new GetNatAddressArgs();
        }

        public Builder(GetNatAddressArgs defaults) {
            $ = new GetNatAddressArgs(Objects.requireNonNull(defaults));
        }

        public Builder instanceId(Output<String> instanceId) {
            $.instanceId = instanceId;
            return this;
        }

        public Builder instanceId(String instanceId) {
            return instanceId(Output.of(instanceId));
        }

        public Builder natAddressId(Output<String> natAddressId) {
            $.natAddressId = natAddressId;
            return this;
        }

        public Builder natAddressId(String natAddressId) {
            return natAddressId(Output.of(natAddressId));
        }

        public Builder organizationId(Output<String> organizationId) {
            $.organizationId = organizationId;
            return this;
        }

        public Builder organizationId(String organizationId) {
            return organizationId(Output.of(organizationId));
        }

        public GetNatAddressArgs build() {
            $.instanceId = Objects.requireNonNull($.instanceId, "expected parameter 'instanceId' to be non-null");
            $.natAddressId = Objects.requireNonNull($.natAddressId, "expected parameter 'natAddressId' to be non-null");
            $.organizationId = Objects.requireNonNull($.organizationId, "expected parameter 'organizationId' to be non-null");
            return $;
        }
    }

}
