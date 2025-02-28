// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetRegionAutoscalerPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetRegionAutoscalerPlainArgs Empty = new GetRegionAutoscalerPlainArgs();

    @Import(name="autoscaler", required=true)
    private String autoscaler;

    public String autoscaler() {
        return this.autoscaler;
    }

    @Import(name="project")
    private @Nullable String project;

    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="region", required=true)
    private String region;

    public String region() {
        return this.region;
    }

    private GetRegionAutoscalerPlainArgs() {}

    private GetRegionAutoscalerPlainArgs(GetRegionAutoscalerPlainArgs $) {
        this.autoscaler = $.autoscaler;
        this.project = $.project;
        this.region = $.region;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRegionAutoscalerPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRegionAutoscalerPlainArgs $;

        public Builder() {
            $ = new GetRegionAutoscalerPlainArgs();
        }

        public Builder(GetRegionAutoscalerPlainArgs defaults) {
            $ = new GetRegionAutoscalerPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder autoscaler(String autoscaler) {
            $.autoscaler = autoscaler;
            return this;
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public Builder region(String region) {
            $.region = region;
            return this;
        }

        public GetRegionAutoscalerPlainArgs build() {
            $.autoscaler = Objects.requireNonNull($.autoscaler, "expected parameter 'autoscaler' to be non-null");
            $.region = Objects.requireNonNull($.region, "expected parameter 'region' to be non-null");
            return $;
        }
    }

}
