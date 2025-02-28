// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.run_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetJobIamPolicyPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetJobIamPolicyPlainArgs Empty = new GetJobIamPolicyPlainArgs();

    @Import(name="jobId", required=true)
    private String jobId;

    public String jobId() {
        return this.jobId;
    }

    @Import(name="location", required=true)
    private String location;

    public String location() {
        return this.location;
    }

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

    private GetJobIamPolicyPlainArgs() {}

    private GetJobIamPolicyPlainArgs(GetJobIamPolicyPlainArgs $) {
        this.jobId = $.jobId;
        this.location = $.location;
        this.optionsRequestedPolicyVersion = $.optionsRequestedPolicyVersion;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetJobIamPolicyPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetJobIamPolicyPlainArgs $;

        public Builder() {
            $ = new GetJobIamPolicyPlainArgs();
        }

        public Builder(GetJobIamPolicyPlainArgs defaults) {
            $ = new GetJobIamPolicyPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder jobId(String jobId) {
            $.jobId = jobId;
            return this;
        }

        public Builder location(String location) {
            $.location = location;
            return this;
        }

        public Builder optionsRequestedPolicyVersion(@Nullable String optionsRequestedPolicyVersion) {
            $.optionsRequestedPolicyVersion = optionsRequestedPolicyVersion;
            return this;
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public GetJobIamPolicyPlainArgs build() {
            $.jobId = Objects.requireNonNull($.jobId, "expected parameter 'jobId' to be non-null");
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            return $;
        }
    }

}
