// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.apigee_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetAliasArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAliasArgs Empty = new GetAliasArgs();

    @Import(name="aliasId", required=true)
    private Output<String> aliasId;

    public Output<String> aliasId() {
        return this.aliasId;
    }

    @Import(name="environmentId", required=true)
    private Output<String> environmentId;

    public Output<String> environmentId() {
        return this.environmentId;
    }

    @Import(name="keystoreId", required=true)
    private Output<String> keystoreId;

    public Output<String> keystoreId() {
        return this.keystoreId;
    }

    @Import(name="organizationId", required=true)
    private Output<String> organizationId;

    public Output<String> organizationId() {
        return this.organizationId;
    }

    private GetAliasArgs() {}

    private GetAliasArgs(GetAliasArgs $) {
        this.aliasId = $.aliasId;
        this.environmentId = $.environmentId;
        this.keystoreId = $.keystoreId;
        this.organizationId = $.organizationId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAliasArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAliasArgs $;

        public Builder() {
            $ = new GetAliasArgs();
        }

        public Builder(GetAliasArgs defaults) {
            $ = new GetAliasArgs(Objects.requireNonNull(defaults));
        }

        public Builder aliasId(Output<String> aliasId) {
            $.aliasId = aliasId;
            return this;
        }

        public Builder aliasId(String aliasId) {
            return aliasId(Output.of(aliasId));
        }

        public Builder environmentId(Output<String> environmentId) {
            $.environmentId = environmentId;
            return this;
        }

        public Builder environmentId(String environmentId) {
            return environmentId(Output.of(environmentId));
        }

        public Builder keystoreId(Output<String> keystoreId) {
            $.keystoreId = keystoreId;
            return this;
        }

        public Builder keystoreId(String keystoreId) {
            return keystoreId(Output.of(keystoreId));
        }

        public Builder organizationId(Output<String> organizationId) {
            $.organizationId = organizationId;
            return this;
        }

        public Builder organizationId(String organizationId) {
            return organizationId(Output.of(organizationId));
        }

        public GetAliasArgs build() {
            $.aliasId = Objects.requireNonNull($.aliasId, "expected parameter 'aliasId' to be non-null");
            $.environmentId = Objects.requireNonNull($.environmentId, "expected parameter 'environmentId' to be non-null");
            $.keystoreId = Objects.requireNonNull($.keystoreId, "expected parameter 'keystoreId' to be non-null");
            $.organizationId = Objects.requireNonNull($.organizationId, "expected parameter 'organizationId' to be non-null");
            return $;
        }
    }

}
