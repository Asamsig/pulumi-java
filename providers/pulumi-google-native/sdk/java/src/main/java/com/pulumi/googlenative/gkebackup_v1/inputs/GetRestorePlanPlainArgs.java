// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.gkebackup_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetRestorePlanPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetRestorePlanPlainArgs Empty = new GetRestorePlanPlainArgs();

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

    @Import(name="restorePlanId", required=true)
    private String restorePlanId;

    public String restorePlanId() {
        return this.restorePlanId;
    }

    private GetRestorePlanPlainArgs() {}

    private GetRestorePlanPlainArgs(GetRestorePlanPlainArgs $) {
        this.location = $.location;
        this.project = $.project;
        this.restorePlanId = $.restorePlanId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRestorePlanPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRestorePlanPlainArgs $;

        public Builder() {
            $ = new GetRestorePlanPlainArgs();
        }

        public Builder(GetRestorePlanPlainArgs defaults) {
            $ = new GetRestorePlanPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder location(String location) {
            $.location = location;
            return this;
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public Builder restorePlanId(String restorePlanId) {
            $.restorePlanId = restorePlanId;
            return this;
        }

        public GetRestorePlanPlainArgs build() {
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            $.restorePlanId = Objects.requireNonNull($.restorePlanId, "expected parameter 'restorePlanId' to be non-null");
            return $;
        }
    }

}
