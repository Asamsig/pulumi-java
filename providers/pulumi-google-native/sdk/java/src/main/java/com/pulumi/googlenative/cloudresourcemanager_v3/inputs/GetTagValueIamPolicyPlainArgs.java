// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudresourcemanager_v3.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetTagValueIamPolicyPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetTagValueIamPolicyPlainArgs Empty = new GetTagValueIamPolicyPlainArgs();

    @Import(name="tagValueId", required=true)
    private String tagValueId;

    public String tagValueId() {
        return this.tagValueId;
    }

    private GetTagValueIamPolicyPlainArgs() {}

    private GetTagValueIamPolicyPlainArgs(GetTagValueIamPolicyPlainArgs $) {
        this.tagValueId = $.tagValueId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetTagValueIamPolicyPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetTagValueIamPolicyPlainArgs $;

        public Builder() {
            $ = new GetTagValueIamPolicyPlainArgs();
        }

        public Builder(GetTagValueIamPolicyPlainArgs defaults) {
            $ = new GetTagValueIamPolicyPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder tagValueId(String tagValueId) {
            $.tagValueId = tagValueId;
            return this;
        }

        public GetTagValueIamPolicyPlainArgs build() {
            $.tagValueId = Objects.requireNonNull($.tagValueId, "expected parameter 'tagValueId' to be non-null");
            return $;
        }
    }

}
