// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.apigee_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetEnvgroupPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetEnvgroupPlainArgs Empty = new GetEnvgroupPlainArgs();

    @Import(name="envgroupId", required=true)
    private String envgroupId;

    public String envgroupId() {
        return this.envgroupId;
    }

    @Import(name="organizationId", required=true)
    private String organizationId;

    public String organizationId() {
        return this.organizationId;
    }

    private GetEnvgroupPlainArgs() {}

    private GetEnvgroupPlainArgs(GetEnvgroupPlainArgs $) {
        this.envgroupId = $.envgroupId;
        this.organizationId = $.organizationId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetEnvgroupPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetEnvgroupPlainArgs $;

        public Builder() {
            $ = new GetEnvgroupPlainArgs();
        }

        public Builder(GetEnvgroupPlainArgs defaults) {
            $ = new GetEnvgroupPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder envgroupId(String envgroupId) {
            $.envgroupId = envgroupId;
            return this;
        }

        public Builder organizationId(String organizationId) {
            $.organizationId = organizationId;
            return this;
        }

        public GetEnvgroupPlainArgs build() {
            $.envgroupId = Objects.requireNonNull($.envgroupId, "expected parameter 'envgroupId' to be non-null");
            $.organizationId = Objects.requireNonNull($.organizationId, "expected parameter 'organizationId' to be non-null");
            return $;
        }
    }

}
