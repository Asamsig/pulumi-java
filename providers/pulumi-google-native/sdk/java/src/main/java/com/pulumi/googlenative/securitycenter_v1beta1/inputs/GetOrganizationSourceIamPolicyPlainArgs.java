// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.securitycenter_v1beta1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetOrganizationSourceIamPolicyPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetOrganizationSourceIamPolicyPlainArgs Empty = new GetOrganizationSourceIamPolicyPlainArgs();

    @Import(name="organizationId", required=true)
    private String organizationId;

    public String organizationId() {
        return this.organizationId;
    }

    @Import(name="sourceId", required=true)
    private String sourceId;

    public String sourceId() {
        return this.sourceId;
    }

    private GetOrganizationSourceIamPolicyPlainArgs() {}

    private GetOrganizationSourceIamPolicyPlainArgs(GetOrganizationSourceIamPolicyPlainArgs $) {
        this.organizationId = $.organizationId;
        this.sourceId = $.sourceId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetOrganizationSourceIamPolicyPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetOrganizationSourceIamPolicyPlainArgs $;

        public Builder() {
            $ = new GetOrganizationSourceIamPolicyPlainArgs();
        }

        public Builder(GetOrganizationSourceIamPolicyPlainArgs defaults) {
            $ = new GetOrganizationSourceIamPolicyPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder organizationId(String organizationId) {
            $.organizationId = organizationId;
            return this;
        }

        public Builder sourceId(String sourceId) {
            $.sourceId = sourceId;
            return this;
        }

        public GetOrganizationSourceIamPolicyPlainArgs build() {
            $.organizationId = Objects.requireNonNull($.organizationId, "expected parameter 'organizationId' to be non-null");
            $.sourceId = Objects.requireNonNull($.sourceId, "expected parameter 'sourceId' to be non-null");
            return $;
        }
    }

}
