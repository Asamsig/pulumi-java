// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.firebaserules_v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.firebaserules_v1.inputs.SourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RulesetArgs extends com.pulumi.resources.ResourceArgs {

    public static final RulesetArgs Empty = new RulesetArgs();

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * `Source` for the `Ruleset`.
     * 
     */
    @Import(name="source", required=true)
    private Output<SourceArgs> source;

    /**
     * @return `Source` for the `Ruleset`.
     * 
     */
    public Output<SourceArgs> source() {
        return this.source;
    }

    private RulesetArgs() {}

    private RulesetArgs(RulesetArgs $) {
        this.project = $.project;
        this.source = $.source;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RulesetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RulesetArgs $;

        public Builder() {
            $ = new RulesetArgs();
        }

        public Builder(RulesetArgs defaults) {
            $ = new RulesetArgs(Objects.requireNonNull(defaults));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param source `Source` for the `Ruleset`.
         * 
         * @return builder
         * 
         */
        public Builder source(Output<SourceArgs> source) {
            $.source = source;
            return this;
        }

        /**
         * @param source `Source` for the `Ruleset`.
         * 
         * @return builder
         * 
         */
        public Builder source(SourceArgs source) {
            return source(Output.of(source));
        }

        public RulesetArgs build() {
            $.source = Objects.requireNonNull($.source, "expected parameter 'source' to be non-null");
            return $;
        }
    }

}
