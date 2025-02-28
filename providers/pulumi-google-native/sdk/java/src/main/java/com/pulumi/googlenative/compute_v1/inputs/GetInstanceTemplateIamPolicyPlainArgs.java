// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetInstanceTemplateIamPolicyPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetInstanceTemplateIamPolicyPlainArgs Empty = new GetInstanceTemplateIamPolicyPlainArgs();

    @Import(name="optionsRequestedPolicyVersion")
    private @Nullable String optionsRequestedPolicyVersion;

    public Optional<String> optionsRequestedPolicyVersion() {
        return Optional.ofNullable(this.optionsRequestedPolicyVersion);
    }

    @Import(name="project")
    private @Nullable String project;

    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="resource", required=true)
    private String resource;

    public String resource() {
        return this.resource;
    }

    private GetInstanceTemplateIamPolicyPlainArgs() {}

    private GetInstanceTemplateIamPolicyPlainArgs(GetInstanceTemplateIamPolicyPlainArgs $) {
        this.optionsRequestedPolicyVersion = $.optionsRequestedPolicyVersion;
        this.project = $.project;
        this.resource = $.resource;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetInstanceTemplateIamPolicyPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetInstanceTemplateIamPolicyPlainArgs $;

        public Builder() {
            $ = new GetInstanceTemplateIamPolicyPlainArgs();
        }

        public Builder(GetInstanceTemplateIamPolicyPlainArgs defaults) {
            $ = new GetInstanceTemplateIamPolicyPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder optionsRequestedPolicyVersion(@Nullable String optionsRequestedPolicyVersion) {
            $.optionsRequestedPolicyVersion = optionsRequestedPolicyVersion;
            return this;
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public Builder resource(String resource) {
            $.resource = resource;
            return this;
        }

        public GetInstanceTemplateIamPolicyPlainArgs build() {
            $.resource = Objects.requireNonNull($.resource, "expected parameter 'resource' to be non-null");
            return $;
        }
    }

}
