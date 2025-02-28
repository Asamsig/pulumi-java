// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.contactcenterinsights_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetViewPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetViewPlainArgs Empty = new GetViewPlainArgs();

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

    @Import(name="viewId", required=true)
    private String viewId;

    public String viewId() {
        return this.viewId;
    }

    private GetViewPlainArgs() {}

    private GetViewPlainArgs(GetViewPlainArgs $) {
        this.location = $.location;
        this.project = $.project;
        this.viewId = $.viewId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetViewPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetViewPlainArgs $;

        public Builder() {
            $ = new GetViewPlainArgs();
        }

        public Builder(GetViewPlainArgs defaults) {
            $ = new GetViewPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder location(String location) {
            $.location = location;
            return this;
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public Builder viewId(String viewId) {
            $.viewId = viewId;
            return this;
        }

        public GetViewPlainArgs build() {
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            $.viewId = Objects.requireNonNull($.viewId, "expected parameter 'viewId' to be non-null");
            return $;
        }
    }

}
