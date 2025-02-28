// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetNodeTemplateArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetNodeTemplateArgs Empty = new GetNodeTemplateArgs();

    @Import(name="nodeTemplate", required=true)
    private Output<String> nodeTemplate;

    public Output<String> nodeTemplate() {
        return this.nodeTemplate;
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="region", required=true)
    private Output<String> region;

    public Output<String> region() {
        return this.region;
    }

    private GetNodeTemplateArgs() {}

    private GetNodeTemplateArgs(GetNodeTemplateArgs $) {
        this.nodeTemplate = $.nodeTemplate;
        this.project = $.project;
        this.region = $.region;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetNodeTemplateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetNodeTemplateArgs $;

        public Builder() {
            $ = new GetNodeTemplateArgs();
        }

        public Builder(GetNodeTemplateArgs defaults) {
            $ = new GetNodeTemplateArgs(Objects.requireNonNull(defaults));
        }

        public Builder nodeTemplate(Output<String> nodeTemplate) {
            $.nodeTemplate = nodeTemplate;
            return this;
        }

        public Builder nodeTemplate(String nodeTemplate) {
            return nodeTemplate(Output.of(nodeTemplate));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public Builder region(Output<String> region) {
            $.region = region;
            return this;
        }

        public Builder region(String region) {
            return region(Output.of(region));
        }

        public GetNodeTemplateArgs build() {
            $.nodeTemplate = Objects.requireNonNull($.nodeTemplate, "expected parameter 'nodeTemplate' to be non-null");
            $.region = Objects.requireNonNull($.region, "expected parameter 'region' to be non-null");
            return $;
        }
    }

}
