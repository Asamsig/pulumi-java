// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.gkebackup_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetRestoreArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetRestoreArgs Empty = new GetRestoreArgs();

    @Import(name="location", required=true)
    private Output<String> location;

    public Output<String> location() {
        return this.location;
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="restoreId", required=true)
    private Output<String> restoreId;

    public Output<String> restoreId() {
        return this.restoreId;
    }

    @Import(name="restorePlanId", required=true)
    private Output<String> restorePlanId;

    public Output<String> restorePlanId() {
        return this.restorePlanId;
    }

    private GetRestoreArgs() {}

    private GetRestoreArgs(GetRestoreArgs $) {
        this.location = $.location;
        this.project = $.project;
        this.restoreId = $.restoreId;
        this.restorePlanId = $.restorePlanId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRestoreArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRestoreArgs $;

        public Builder() {
            $ = new GetRestoreArgs();
        }

        public Builder(GetRestoreArgs defaults) {
            $ = new GetRestoreArgs(Objects.requireNonNull(defaults));
        }

        public Builder location(Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public Builder restoreId(Output<String> restoreId) {
            $.restoreId = restoreId;
            return this;
        }

        public Builder restoreId(String restoreId) {
            return restoreId(Output.of(restoreId));
        }

        public Builder restorePlanId(Output<String> restorePlanId) {
            $.restorePlanId = restorePlanId;
            return this;
        }

        public Builder restorePlanId(String restorePlanId) {
            return restorePlanId(Output.of(restorePlanId));
        }

        public GetRestoreArgs build() {
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            $.restoreId = Objects.requireNonNull($.restoreId, "expected parameter 'restoreId' to be non-null");
            $.restorePlanId = Objects.requireNonNull($.restorePlanId, "expected parameter 'restorePlanId' to be non-null");
            return $;
        }
    }

}
