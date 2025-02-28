// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.connectors_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetConnectionIamPolicyPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetConnectionIamPolicyPlainArgs Empty = new GetConnectionIamPolicyPlainArgs();

    @Import(name="connectionId", required=true)
    private String connectionId;

    public String connectionId() {
        return this.connectionId;
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

    private GetConnectionIamPolicyPlainArgs() {}

    private GetConnectionIamPolicyPlainArgs(GetConnectionIamPolicyPlainArgs $) {
        this.connectionId = $.connectionId;
        this.location = $.location;
        this.optionsRequestedPolicyVersion = $.optionsRequestedPolicyVersion;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetConnectionIamPolicyPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetConnectionIamPolicyPlainArgs $;

        public Builder() {
            $ = new GetConnectionIamPolicyPlainArgs();
        }

        public Builder(GetConnectionIamPolicyPlainArgs defaults) {
            $ = new GetConnectionIamPolicyPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder connectionId(String connectionId) {
            $.connectionId = connectionId;
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

        public GetConnectionIamPolicyPlainArgs build() {
            $.connectionId = Objects.requireNonNull($.connectionId, "expected parameter 'connectionId' to be non-null");
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            return $;
        }
    }

}
