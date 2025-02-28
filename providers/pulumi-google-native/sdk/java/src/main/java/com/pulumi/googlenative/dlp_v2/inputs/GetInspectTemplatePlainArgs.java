// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dlp_v2.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetInspectTemplatePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetInspectTemplatePlainArgs Empty = new GetInspectTemplatePlainArgs();

    @Import(name="inspectTemplateId", required=true)
    private String inspectTemplateId;

    public String inspectTemplateId() {
        return this.inspectTemplateId;
    }

    @Import(name="location", required=true)
    private String location;

    public String location() {
        return this.location;
    }

    @Import(name="project")
    private @Nullable String project;

    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    private GetInspectTemplatePlainArgs() {}

    private GetInspectTemplatePlainArgs(GetInspectTemplatePlainArgs $) {
        this.inspectTemplateId = $.inspectTemplateId;
        this.location = $.location;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetInspectTemplatePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetInspectTemplatePlainArgs $;

        public Builder() {
            $ = new GetInspectTemplatePlainArgs();
        }

        public Builder(GetInspectTemplatePlainArgs defaults) {
            $ = new GetInspectTemplatePlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder inspectTemplateId(String inspectTemplateId) {
            $.inspectTemplateId = inspectTemplateId;
            return this;
        }

        public Builder location(String location) {
            $.location = location;
            return this;
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public GetInspectTemplatePlainArgs build() {
            $.inspectTemplateId = Objects.requireNonNull($.inspectTemplateId, "expected parameter 'inspectTemplateId' to be non-null");
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            return $;
        }
    }

}
