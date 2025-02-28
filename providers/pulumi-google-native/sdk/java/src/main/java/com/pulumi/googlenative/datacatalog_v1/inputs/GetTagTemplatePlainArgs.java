// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datacatalog_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetTagTemplatePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetTagTemplatePlainArgs Empty = new GetTagTemplatePlainArgs();

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

    @Import(name="tagTemplateId", required=true)
    private String tagTemplateId;

    public String tagTemplateId() {
        return this.tagTemplateId;
    }

    private GetTagTemplatePlainArgs() {}

    private GetTagTemplatePlainArgs(GetTagTemplatePlainArgs $) {
        this.location = $.location;
        this.project = $.project;
        this.tagTemplateId = $.tagTemplateId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetTagTemplatePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetTagTemplatePlainArgs $;

        public Builder() {
            $ = new GetTagTemplatePlainArgs();
        }

        public Builder(GetTagTemplatePlainArgs defaults) {
            $ = new GetTagTemplatePlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder location(String location) {
            $.location = location;
            return this;
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public Builder tagTemplateId(String tagTemplateId) {
            $.tagTemplateId = tagTemplateId;
            return this;
        }

        public GetTagTemplatePlainArgs build() {
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            $.tagTemplateId = Objects.requireNonNull($.tagTemplateId, "expected parameter 'tagTemplateId' to be non-null");
            return $;
        }
    }

}
