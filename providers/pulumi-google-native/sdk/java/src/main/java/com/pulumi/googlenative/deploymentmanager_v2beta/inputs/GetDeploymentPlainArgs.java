// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.deploymentmanager_v2beta.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetDeploymentPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDeploymentPlainArgs Empty = new GetDeploymentPlainArgs();

    @Import(name="deployment", required=true)
    private String deployment;

    public String deployment() {
        return this.deployment;
    }

    @Import(name="project")
    private @Nullable String project;

    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    private GetDeploymentPlainArgs() {}

    private GetDeploymentPlainArgs(GetDeploymentPlainArgs $) {
        this.deployment = $.deployment;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDeploymentPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDeploymentPlainArgs $;

        public Builder() {
            $ = new GetDeploymentPlainArgs();
        }

        public Builder(GetDeploymentPlainArgs defaults) {
            $ = new GetDeploymentPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder deployment(String deployment) {
            $.deployment = deployment;
            return this;
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public GetDeploymentPlainArgs build() {
            $.deployment = Objects.requireNonNull($.deployment, "expected parameter 'deployment' to be non-null");
            return $;
        }
    }

}
