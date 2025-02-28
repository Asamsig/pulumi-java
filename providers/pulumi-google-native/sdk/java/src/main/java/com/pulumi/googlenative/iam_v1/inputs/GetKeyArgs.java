// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.iam_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetKeyArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetKeyArgs Empty = new GetKeyArgs();

    @Import(name="keyId", required=true)
    private Output<String> keyId;

    public Output<String> keyId() {
        return this.keyId;
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="publicKeyType")
    private @Nullable Output<String> publicKeyType;

    public Optional<Output<String>> publicKeyType() {
        return Optional.ofNullable(this.publicKeyType);
    }

    @Import(name="serviceAccountId", required=true)
    private Output<String> serviceAccountId;

    public Output<String> serviceAccountId() {
        return this.serviceAccountId;
    }

    private GetKeyArgs() {}

    private GetKeyArgs(GetKeyArgs $) {
        this.keyId = $.keyId;
        this.project = $.project;
        this.publicKeyType = $.publicKeyType;
        this.serviceAccountId = $.serviceAccountId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetKeyArgs $;

        public Builder() {
            $ = new GetKeyArgs();
        }

        public Builder(GetKeyArgs defaults) {
            $ = new GetKeyArgs(Objects.requireNonNull(defaults));
        }

        public Builder keyId(Output<String> keyId) {
            $.keyId = keyId;
            return this;
        }

        public Builder keyId(String keyId) {
            return keyId(Output.of(keyId));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public Builder publicKeyType(@Nullable Output<String> publicKeyType) {
            $.publicKeyType = publicKeyType;
            return this;
        }

        public Builder publicKeyType(String publicKeyType) {
            return publicKeyType(Output.of(publicKeyType));
        }

        public Builder serviceAccountId(Output<String> serviceAccountId) {
            $.serviceAccountId = serviceAccountId;
            return this;
        }

        public Builder serviceAccountId(String serviceAccountId) {
            return serviceAccountId(Output.of(serviceAccountId));
        }

        public GetKeyArgs build() {
            $.keyId = Objects.requireNonNull($.keyId, "expected parameter 'keyId' to be non-null");
            $.serviceAccountId = Objects.requireNonNull($.serviceAccountId, "expected parameter 'serviceAccountId' to be non-null");
            return $;
        }
    }

}
