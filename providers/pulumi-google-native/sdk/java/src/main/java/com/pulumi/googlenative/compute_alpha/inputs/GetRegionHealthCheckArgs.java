// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetRegionHealthCheckArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetRegionHealthCheckArgs Empty = new GetRegionHealthCheckArgs();

    @Import(name="healthCheck", required=true)
    private Output<String> healthCheck;

    public Output<String> healthCheck() {
        return this.healthCheck;
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

    private GetRegionHealthCheckArgs() {}

    private GetRegionHealthCheckArgs(GetRegionHealthCheckArgs $) {
        this.healthCheck = $.healthCheck;
        this.project = $.project;
        this.region = $.region;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRegionHealthCheckArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRegionHealthCheckArgs $;

        public Builder() {
            $ = new GetRegionHealthCheckArgs();
        }

        public Builder(GetRegionHealthCheckArgs defaults) {
            $ = new GetRegionHealthCheckArgs(Objects.requireNonNull(defaults));
        }

        public Builder healthCheck(Output<String> healthCheck) {
            $.healthCheck = healthCheck;
            return this;
        }

        public Builder healthCheck(String healthCheck) {
            return healthCheck(Output.of(healthCheck));
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

        public GetRegionHealthCheckArgs build() {
            $.healthCheck = Objects.requireNonNull($.healthCheck, "expected parameter 'healthCheck' to be non-null");
            $.region = Objects.requireNonNull($.region, "expected parameter 'region' to be non-null");
            return $;
        }
    }

}
